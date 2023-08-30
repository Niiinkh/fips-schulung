package org.faktorips.schulung.hausratmodell.hausrat;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;

import org.faktorips.runtime.InMemoryRuntimeRepository;
import org.faktorips.runtime.Message;
import org.faktorips.runtime.MessageList;
import org.faktorips.runtime.ObjectProperty;
import org.faktorips.runtime.Severity;
import org.faktorips.runtime.ValidationContext;
import org.faktorips.runtime.validation.GenericRelevanceValidation;
import org.faktorips.values.Money;
import org.faktorips.valueset.IntegerRange;
import org.faktorips.valueset.MoneyRange;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class HausratVertragTest {

	private final InMemoryRuntimeRepository runtimeRepository = new InMemoryRuntimeRepository();
	private HausratVertrag vertrag;
	private ValidationContext context;

	@BeforeEach
	void setup() {
		HausratProdukt produkt = new HausratProdukt(runtimeRepository, "id", "kindId", "versionId");
		produkt.setVorschlagVersSummeProQm(Money.euro(200));
		produkt.setAllowedValuesForWohnflaeche(IntegerRange.valueOf(0, 100));
		produkt.setAllowedValuesForVersSumme(MoneyRange.valueOf("0 EUR", "500 EUR"));
		vertrag = produkt.createHausratVertrag();
		Tarifzonentabelle tarifzonentabelle = new Tarifzonentabelle(Arrays.asList(
				new TarifzonentabelleRow("20025", "40123", "II"), new TarifzonentabelleRow("40125", "50000", "V")));
		runtimeRepository.putTable(tarifzonentabelle);
		context = new ValidationContext();
	}

	@Test
	void testTarifzone() {
		vertrag.setPlz("40125");
		assertThat(vertrag.getTarifzone()).isEqualTo("V");
	}

	@Test
	void testGetTarifzone_keinePlz() {
		vertrag.setPlz(null);
		assertThat(vertrag.getTarifzone()).isEqualTo("I");
	}

	@Test
	void testGetTarifzone_plzNichtInTabelle() {
		vertrag.setPlz("40124");
		assertThat(vertrag.getTarifzone()).isEqualTo("I");
	}

	@Test
	void testGetTarifzone_keinProdukt() {
		HausratVertrag vertrag = new HausratVertrag();
		vertrag.setPlz("50000");
		assertThat(vertrag.getTarifzone()).isEqualTo("I");
	}

	@Test
	void testGetVorschlagVersSumme_wohnflaecheNull() {
		vertrag.setWohnflaeche(null);
		assertThat(vertrag.getVorschlagVersSumme()).isEqualTo(Money.NULL);
	}

	@Test
	void testGetVorschlagVersSumme_wohnflaecheZero() {
		vertrag.setWohnflaeche(0);
		assertThat(vertrag.getVorschlagVersSumme()).isEqualTo(Money.euro(0));
	}

	@Test
	void testGetVorschlagVersSumme() {
		vertrag.setWohnflaeche(70); // 70 * 200 = 14.000
		assertThat(vertrag.getVorschlagVersSumme()).isEqualTo(Money.euro(14000));
	}

	@Test
	void testPruefeWohnflaeche_hoechsterErlaubterWert() {
		vertrag.setWohnflaeche(100);

		MessageList messages = vertrag.validate(context);

		Message message = messages.getMessageByCode(HausratVertrag.MSG_CODE_PRUEFE_WOHNFLAECHE);
		assertThat(message).isNull();
	}

	@Test
	void testPruefeWohnflaeche_hoechsterWertUeberschritten() {
		vertrag.setWohnflaeche(101);

		MessageList messages = vertrag.validate(context);

		Message message = messages.getMessageByCode(HausratVertrag.MSG_CODE_PRUEFE_WOHNFLAECHE);
		assertThat(message).isNotNull();
	}

	@Test
	void testPruefeWohnflaeche_keineWohnflaeche() {
		vertrag.setWohnflaeche(null);

		MessageList messages = vertrag.validate(context);

		Message message = messages.getMessageByCode(HausratVertrag.MSG_CODE_PRUEFE_WOHNFLAECHE);
		assertThat(message).isNotNull();
	}

	@Test
	void testPruefeWohnflaeche_messageAttributeSindImFehlerfallKorrektGesetzt() {
		vertrag.setWohnflaeche(250);

		MessageList messages = vertrag.validate(context);

		Message message = messages.getMessageByCode(HausratVertrag.MSG_CODE_PRUEFE_WOHNFLAECHE);
		assertThat(message).isNotNull();
		assertThat(message.getText())
				.isEqualTo("Die Wohnflaeche 250 liegt außerhalb des erlaubten Wertebereichs (0-100).");
		assertThat(message.getSeverity()).isEqualTo(Severity.ERROR);
		assertThat(message.getInvalidObjectProperties()).map(ObjectProperty::getProperty)
				.containsExactly(HausratVertrag.PROPERTY_WOHNFLAECHE);
	}

	@Test
	void testPruefePlz_gueltig() {
		vertrag.setPlz("12345");

		MessageList messages = vertrag.validate(context);

		Message message = messages.getMessageByCode(HausratVertrag.MSG_CODE_PRUEFE_PLZ);
		assertThat(message).isNull();
	}

	@Test
	void testPruefePlz_null() {
		vertrag.setPlz(null);

		MessageList messages = vertrag.validate(context);

		Message message = messages.getMessageByCode(HausratVertrag.MSG_CODE_PRUEFE_PLZ);
		assertThat(message).isNotNull();
	}

	@Test
	void testPruefePlz_zuKurz() {
		vertrag.setPlz("1234");

		MessageList messages = vertrag.validate(context);

		Message message = messages.getMessageByCode(HausratVertrag.MSG_CODE_PRUEFE_PLZ);
		assertThat(message).isNotNull();
	}

	@Test
	void testPruefePlz_zuLang() {
		vertrag.setPlz("123456");

		MessageList messages = vertrag.validate(context);

		Message message = messages.getMessageByCode(HausratVertrag.MSG_CODE_PRUEFE_PLZ);
		assertThat(message).isNotNull();
	}

	@Test
	void testPruefePlz_enthaeltNichtNurZiffern() {
		vertrag.setPlz("A2345");

		MessageList messages = vertrag.validate(context);

		Message message = messages.getMessageByCode(HausratVertrag.MSG_CODE_PRUEFE_PLZ);
		assertThat(message).isNotNull();
	}

	@Test
	void testPruefePlz_messageAttributeSindImFehlerfallKorrektGesetzt() {
		vertrag.setPlz("A2345");

		MessageList messages = vertrag.validate(context);

		Message message = messages.getMessageByCode(HausratVertrag.MSG_CODE_PRUEFE_PLZ);
		assertThat(message).isNotNull();
		assertThat(message.getText()).isEqualTo("Die Postleitzahl muss genau 5 Stellen haben und numerisch sein.");
		assertThat(message.getSeverity()).isEqualTo(Severity.ERROR);
		assertThat(message.getInvalidObjectProperties()).map(ObjectProperty::getProperty)
				.containsExactly(HausratVertrag.PROPERTY_PLZ);
	}

	@Test
	void testPruefeVersicherungssumme_gueltig() {
		vertrag.setVersSumme(Money.euro(400));

		MessageList messages = vertrag.validate(context);

		String messageCode = GenericRelevanceValidation.Error.ValueNotInValueSet
				.getDefaultMessageCode(HausratVertrag.class, HausratVertrag.PROPERTY_VERSSUMME);
		Message message = messages.getMessageByCode(messageCode);
		assertThat(message).isNull();
	}

	@Test
	void testPruefeVersicherungssumme_zuHoch() {
		vertrag.setVersSumme(Money.euro(600));

		MessageList messages = vertrag.validate(context);

		String messageCode = GenericRelevanceValidation.Error.ValueNotInValueSet
				.getDefaultMessageCode(HausratVertrag.class, HausratVertrag.PROPERTY_VERSSUMME);
		Message message = messages.getMessageByCode(messageCode);
		
		assertThat(message).isNotNull();
		assertThat(message.getText()).isEqualTo(
				"Das Feld \"Versicherungssumme\" enthält einen ungültigen Wert. Der Wert muss zwischen 0.00 EUR und 500.00 EUR liegen.");
		assertThat(message.getSeverity()).isEqualTo(Severity.ERROR);
		assertThat(message.getInvalidObjectProperties()).map(ObjectProperty::getProperty)
				.containsExactly(HausratVertrag.PROPERTY_VERSSUMME);
	}

	@Test
	void testPruefeVersicherungssumme_null() {
		vertrag.setVersSumme(null);
		
		MessageList messages = vertrag.validate(context);
		
		String messageCode = GenericRelevanceValidation.Error.MandatoryValueMissing
				.getDefaultMessageCode(HausratVertrag.class, HausratVertrag.PROPERTY_VERSSUMME);
		Message message = messages.getMessageByCode(messageCode);

		assertThat(message).isNotNull();
		assertThat(message.getText()).isEqualTo(
				"Das Feld \"Versicherungssumme\" muss einen Wert enthalten.");
		assertThat(message.getSeverity()).isEqualTo(Severity.ERROR);
		assertThat(message.getInvalidObjectProperties()).map(ObjectProperty::getProperty)
		.containsExactly(HausratVertrag.PROPERTY_VERSSUMME);
	}
}

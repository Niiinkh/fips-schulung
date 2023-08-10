package org.faktorips.schulung.hausratmodell.hausrat;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

import java.util.Arrays;

import org.faktorips.runtime.InMemoryRuntimeRepository;
import org.faktorips.values.Decimal;
import org.faktorips.values.Money;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class HausratGrunddeckungTest {

	private final InMemoryRuntimeRepository runtimeRepository = new InMemoryRuntimeRepository();
	private HausratVertrag vertrag;
	private String tarifzone = "I";
	private HausratGrunddeckung grunddeckung;

	@BeforeEach
	void setup() {
		HausratGrunddeckungstyp grunddeckungstyp = new HausratGrunddeckungstyp(runtimeRepository, "id", "kindId",
				"versionId");
		grunddeckungstyp.setTariftabelleName("tariftabelle kompakt");
		grunddeckung = grunddeckungstyp.createHausratGrunddeckung();

		vertrag = new FakeHausratVertrag();
		vertrag.setHausratGrunddeckung(grunddeckung);

		TariftabelleHausrat tariftabelle = new TariftabelleHausrat(Arrays.asList( //
				new TariftabelleHausratRow("I", Decimal.valueOf(0.5)),
				new TariftabelleHausratRow("II", Decimal.valueOf(0.7)),
				new TariftabelleHausratRow("V", Decimal.valueOf(1))));
		runtimeRepository.putTable(tariftabelle, "tariftabelle kompakt");
	}

	@Test
	void testBerechneJahresbasisbeitrag_keinVertrag() {
		grunddeckung.setHausratVertragInternal(null);
		assertThatExceptionOfType(NullPointerException.class)
				.isThrownBy(() -> grunddeckung.berechneJahresbasisbeitrag());
	}

	@Test
	void testBerechneJahresbasisbeitrag_keineVersSumme() {
		vertrag.setVersSumme(Money.NULL);
		grunddeckung.berechneJahresbasisbeitrag();
		assertThat(grunddeckung.getJahresbasisbeitrag()).isEqualTo(Money.NULL);
	}

	@Test
	void testBerechneJahresbasisbeitrag_tarifzoneNichtInTariftabelle() {
		tarifzone = "X";
		vertrag.setVersSumme(Money.euro(50_000));
		grunddeckung.berechneJahresbasisbeitrag();
		assertThat(grunddeckung.getJahresbasisbeitrag()).isEqualTo(Money.NULL);
	}

	@Test
	void testBerechneJahresbasisbeitrag_tarifzoneEins() {
		tarifzone = "I";
		vertrag.setVersSumme(Money.euro(50_000));
		grunddeckung.berechneJahresbasisbeitrag();
		assertThat(grunddeckung.getJahresbasisbeitrag()).isEqualTo(Money.euro(25)); // 50.000 / 1000 * 0.5 = 25€
	}

	@Test
	void testBerechneJahresbasisbeitrag_tarifzoneZwei() {
		tarifzone = "II";
		vertrag.setVersSumme(Money.euro(50_000));
		grunddeckung.berechneJahresbasisbeitrag();
		assertThat(grunddeckung.getJahresbasisbeitrag()).isEqualTo(Money.euro(35)); // 50.000 / 1000 * 0.7 = 35€
	}

	private class FakeHausratVertrag extends HausratVertrag {

		@Override
		public String getTarifzone() {
			return tarifzone;
		}

	}

}

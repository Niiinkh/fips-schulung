package org.faktorips.schulung.hausratmodell.hausrat;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;

import org.faktorips.runtime.InMemoryRuntimeRepository;
import org.faktorips.values.Money;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class HausratVertragTest {

	private final InMemoryRuntimeRepository runtimeRepository = new InMemoryRuntimeRepository();
	private HausratVertrag vertrag;

	@BeforeEach
	void setup() {
		HausratProdukt produkt = new HausratProdukt(runtimeRepository, "id", "kindId", "versionId");
		produkt.setVorschlagVersSummeProQm(Money.euro(200));
		vertrag = produkt.createHausratVertrag();
		Tarifzonentabelle tarifzonentabelle = new Tarifzonentabelle(Arrays.asList(
				new TarifzonentabelleRow("20025", "40123", "II"), 
				new TarifzonentabelleRow("40125", "50000", "V")));
		runtimeRepository.putTable(tarifzonentabelle);
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

}

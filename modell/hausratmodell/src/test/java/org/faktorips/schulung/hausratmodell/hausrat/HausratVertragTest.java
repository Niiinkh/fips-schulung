package org.faktorips.schulung.hausratmodell.hausrat;

import static org.assertj.core.api.Assertions.assertThat;

import org.faktorips.values.Money;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class HausratVertragTest {

	private HausratVertrag vertrag;

	@BeforeEach
	void setup() {
		vertrag = new HausratVertrag();
	}
	
	@Test
	void testGetTarifzone_tarifzoneIstImmerEins() {
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
		vertrag.setWohnflaeche(70); // 70 * 650 = 45.500
		assertThat(vertrag.getVorschlagVersSumme()).isEqualTo(Money.euro(45500));
	}

}

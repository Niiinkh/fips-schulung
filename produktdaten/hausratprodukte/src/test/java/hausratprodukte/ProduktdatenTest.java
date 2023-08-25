package hausratprodukte;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.faktorips.runtime.ClassloaderRuntimeRepository;
import org.faktorips.runtime.IProductComponent;
import org.faktorips.runtime.IRuntimeRepository;
import org.faktorips.schulung.hausratmodell.hausrat.HausratProdukt;
import org.faktorips.schulung.hausratmodell.hausrat.HausratVertrag;
import org.faktorips.schulung.hausratmodell.hausrat.HausratZusatzdeckung;
import org.faktorips.schulung.hausratmodell.hausrat.HausratZusatzdeckungsTyp;
import org.faktorips.schulung.hausratmodell.hausrat.Risikoklasse;
import org.faktorips.values.Money;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class ProduktdatenTest {

	private static final String TOC_PATH = "org/faktorips/schulung/hausratprodukte/internal/faktorips-repository-toc.xml";
	private static IRuntimeRepository repository;
	private static HausratProdukt hrKompakt;
	private static HausratProdukt hrOptimal;

	@BeforeAll
	static void setUp() {
		repository = ClassloaderRuntimeRepository.create(TOC_PATH);
		hrKompakt = (HausratProdukt) repository.getProductComponent("hausrat.HR-Kompakt 2023-01");
		hrOptimal = (HausratProdukt) repository.getProductComponent("hausrat.HR-Optimal 2023-01");
	}

	@Disabled
	@Test
	void testProduktdaten() {
		System.out.println("Name: " + hrKompakt.getProduktname());
		System.out.println("Default Zahlweise: " + hrKompakt.getDefaultValueZahlweise());
		System.out.println("Erlaubte Zahlweisen: " + hrKompakt.getAllowedValuesForZahlweise());
		System.out.println("Erlaubte Wohnfläche: " + hrKompakt.getAllowedValuesForWohnflaeche());
		System.out.println("Erlaubte Versicherungssumme: " + hrKompakt.getAllowedValuesForVersSumme());
	}

	@Test
	void testGetVorschlagVersSummeProQm_kompakt() {
		assertThat(hrKompakt.getVorschlagVersSummeProQm()).isEqualTo(Money.euro(600));
	}

	@Test
	void testGetVorschlagVersSummeProQm_optimal() {
		assertThat(hrOptimal.getVorschlagVersSummeProQm()).isEqualTo(Money.euro(900));
	}

	@Test
	void testGetVerSumme_Zusatzdeckung_Fahrraddiebstahl() {
		HausratVertrag hausratVertrag = hrKompakt.createHausratVertrag();
		hausratVertrag.setVersSumme(Money.euro(60_000));
		HausratZusatzdeckungsTyp fahrraddiebstahlTyp = (HausratZusatzdeckungsTyp) repository
				.getProductComponent("hausrat.Fahrraddiebstahl 2023-01");
		HausratZusatzdeckung fahrraddiebstahl = hausratVertrag.newHausratZusatzdeckung(fahrraddiebstahlTyp);
		assertThat(fahrraddiebstahl.getVersSumme()).isEqualTo(Money.euro(600));
	}

	@Test
	void testGetVerSumme_Zusatzdeckung_Fahrraddiebstahl_Maximiert() {
		HausratVertrag hausratVertrag = hrKompakt.createHausratVertrag();
		hausratVertrag.setVersSumme(Money.euro(600_000));
		HausratZusatzdeckungsTyp fahrraddiebstahlTyp = (HausratZusatzdeckungsTyp) repository
				.getProductComponent("hausrat.Fahrraddiebstahl 2023-01");
		HausratZusatzdeckung fahrraddiebstahl = hausratVertrag.newHausratZusatzdeckung(fahrraddiebstahlTyp);
		assertThat(fahrraddiebstahl.getVersSumme()).isEqualTo(Money.euro(5_000));
	}

	@Test
	void testGetVerSumme_Zusatzdeckung_Überspannung_NichtMaximiert() {
		HausratVertrag hausratVertrag = hrKompakt.createHausratVertrag();
		hausratVertrag.setVersSumme(Money.euro(600_000));
		HausratZusatzdeckungsTyp überspannungTyp = (HausratZusatzdeckungsTyp) repository
				.getProductComponent("hausrat.Überspannung 2023-01");
		HausratZusatzdeckung überspannung = hausratVertrag.newHausratZusatzdeckung(überspannungTyp);
		assertThat(überspannung.getVersSumme()).isEqualTo(Money.euro(30_000));
	}

}

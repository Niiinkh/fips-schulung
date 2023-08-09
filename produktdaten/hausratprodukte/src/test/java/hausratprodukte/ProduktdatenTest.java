package hausratprodukte;

import static org.assertj.core.api.Assertions.assertThat;

import org.faktorips.runtime.ClassloaderRuntimeRepository;
import org.faktorips.runtime.IRuntimeRepository;
import org.faktorips.schulung.hausratmodell.hausrat.HausratProdukt;
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

}

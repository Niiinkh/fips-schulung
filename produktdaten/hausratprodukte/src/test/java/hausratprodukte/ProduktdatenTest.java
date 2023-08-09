package hausratprodukte;

import org.faktorips.runtime.ClassloaderRuntimeRepository;
import org.faktorips.runtime.IRuntimeRepository;
import org.faktorips.schulung.hausratmodell.hausrat.HausratProdukt;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class ProduktdatenTest {

	private static final String TOC_PATH = "org/faktorips/schulung/hausratprodukte/internal/faktorips-repository-toc.xml";
	private static IRuntimeRepository repository;

	@BeforeAll
	static void setUp() {
		repository = ClassloaderRuntimeRepository.create(TOC_PATH);
	}

	@Test
	void testProduktdaten() {
		HausratProdukt produkt = (HausratProdukt) repository.getProductComponent("hausrat.HR-Kompakt 2023-01");
		System.out.println("Name: " + produkt.getProduktname());
		System.out.println("Default Zahlweise: " + produkt.getDefaultValueZahlweise());
		System.out.println("Erlaubte Zahlweisen: " + produkt.getAllowedValuesForZahlweise());
		System.out.println("Erlaubte Wohnfläche: " + produkt.getAllowedValuesForWohnflaeche());
		System.out.println("Erlaubte Versicherungssumme: " + produkt.getAllowedValuesForVersSumme());
	}

}

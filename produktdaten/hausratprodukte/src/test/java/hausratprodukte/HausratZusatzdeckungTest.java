package hausratprodukte;

import static org.assertj.core.api.Assertions.assertThat;

import org.faktorips.runtime.ClassloaderRuntimeRepository;
import org.faktorips.runtime.formula.groovy.GroovyFormulaEvaluatorFactory;
import org.faktorips.schulung.hausratmodell.hausrat.HausratProdukt;
import org.faktorips.schulung.hausratmodell.hausrat.HausratVertrag;
import org.faktorips.schulung.hausratmodell.hausrat.HausratZusatzdeckung;
import org.faktorips.schulung.hausratmodell.hausrat.HausratZusatzdeckungsTyp;
import org.faktorips.values.Money;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class HausratZusatzdeckungTest {
	private static ClassloaderRuntimeRepository repository;
	private static HausratProdukt hrKompakt;

	@BeforeAll
	static void setUp() {
		// Repository erzeugen
		repository = ClassloaderRuntimeRepository
				.create("org/faktorips/schulung/hausratprodukte/internal/faktorips-repository-toc.xml");
		repository.setFormulaEvaluatorFactory(new GroovyFormulaEvaluatorFactory());
		// Referenz auf das Kompaktprodukt aus dem Repository holen
		hrKompakt = (HausratProdukt) repository.getProductComponent("hausrat.HR-Kompakt 2023-01");
	}

	@Test
	void testBerechneJahresbasisbeitrag_Zusatzdeckung_Fahrraddiebstahl() {
		HausratVertrag hausratVertrag = hrKompakt.createHausratVertrag();
		hausratVertrag.setVersSumme(Money.euro(600_000));
		HausratZusatzdeckungsTyp fahrraddiebstahlTyp = (HausratZusatzdeckungsTyp) repository
				.getProductComponent("hausrat.Fahrraddiebstahl 2023-01");
		HausratZusatzdeckung fahrraddiebstahl = hausratVertrag.newHausratZusatzdeckung(fahrraddiebstahlTyp);
		assertThat(fahrraddiebstahl.getJahresbasisbeitrag()).isEqualTo(Money.euro(500));
	}

	@Test
	void testBerechneJahresbasisbeitrag_Zusatzdeckung_Überspannung() {
		HausratVertrag hausratVertrag = hrKompakt.createHausratVertrag();
		hausratVertrag.setVersSumme(Money.euro(600_000));
		HausratZusatzdeckungsTyp überspannungTyp = (HausratZusatzdeckungsTyp) repository
				.getProductComponent("hausrat.Überspannung 2023-01");
		HausratZusatzdeckung überspannung = hausratVertrag.newHausratZusatzdeckung(überspannungTyp);
		assertThat(überspannung.getJahresbasisbeitrag()).isEqualTo(Money.euro(930));
	}
}

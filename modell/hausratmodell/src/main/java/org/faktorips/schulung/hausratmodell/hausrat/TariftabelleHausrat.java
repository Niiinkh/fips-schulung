package org.faktorips.schulung.hausratmodell.hausrat;

import org.faktorips.runtime.model.table.TableStructureKind;
import org.faktorips.runtime.model.annotation.IpsTableStructure;
import org.faktorips.runtime.model.annotation.IpsDocumented;
import org.faktorips.runtime.internal.Table;
import org.faktorips.runtime.internal.tableindex.UniqueResultStructure;
import org.faktorips.runtime.internal.tableindex.KeyStructure;
import java.util.ArrayList;
import java.util.List;
import org.faktorips.runtime.IRuntimeRepository;
import org.faktorips.values.Decimal;
import java.util.NoSuchElementException;
import java.util.Objects;
import org.faktorips.runtime.annotation.IpsGenerated;

/**
 * Diese Klasse implementiert eine Read-Only In-Memory-Tabelle. Auf die Daten
 * der Tabelle kann ueber Finder-Methoden zugegriffen werden.
 *
 * @since 0.0.1
 *
 * @generated
 */
@IpsTableStructure(name = "hausrat.TariftabelleHausrat", type = TableStructureKind.MULTIPLE_CONTENTS, columns = {
		"Tarifzone", "beitragssatz" })
@IpsDocumented(bundleName = "org.faktorips.schulung.hausratmodell.model-label-and-descriptions", defaultLocale = "de")
public class TariftabelleHausrat extends Table<TariftabelleHausratRow> {

	/**
	 * Membervariable die Keys auf Tabellenzeilen abbildet.
	 *
	 * @since 0.0.1
	 *
	 * @generated
	 */
	private KeyStructure<Index0, UniqueResultStructure<TariftabelleHausratRow>, TariftabelleHausratRow> key0SearchStructure;

	/**
	 * Erzeugt einen leeren Tabelleninhalt.
	 *
	 * @generated
	 */
	@IpsGenerated
	public TariftabelleHausrat() {
		super();
		rows = new ArrayList<>();
		init();
	}

	/**
	 * Erzeugt einen neuen Tabelleninhalt mit den uebergebenen Zeilen. Die Liste mit
	 * den Zeilen wird kopiert. Spaetere Aenderungen am Inhalt der Liste aendern
	 * also nicht die erzeugte Tabelle. Dieser Konstruktor ist vor allem fuer die
	 * Verwendung in JUnit Tests vorgesehen, um beliebige Tabelleninhalte erzeugen
	 * zu koennen.
	 *
	 * @generated
	 */
	@IpsGenerated
	public TariftabelleHausrat(List<TariftabelleHausratRow> content) {
		super();
		rows = new ArrayList<>(content);
		init();
	}

	/**
	 * Erzeugt einen neuen Tabelleninhalt mit den uebergebenen Zeilen. Die Liste mit
	 * den Zeilen wird kopiert. Spaetere Aenderungen am Inhalt der Liste aendern
	 * also nicht die erzeugte Tabelle. Dieser Konstruktor ist vor allem fuer die
	 * Verwendung in JUnit Tests und mit veraenderbaren Repositories vorgesehen, um
	 * beliebige Tabelleninhalte erzeugen zu koennen.
	 *
	 * @param qualifiedTableName der Name mit dem der Tabelleninhalt im
	 *                           {@link IRuntimeRepository} referenziert wird
	 *
	 * @generated
	 */
	@IpsGenerated
	public TariftabelleHausrat(List<TariftabelleHausratRow> content, String qualifiedTableName) {
		super(qualifiedTableName);
		rows = new ArrayList<>(content);
		init();
	}

	/**
	 * Diese Methode wird waehrend der Initialisierung verwendet. Sie fuegt eine
	 * neue Tabellenzeile hinzu.
	 *
	 * @generated
	 */
	@Override
	@IpsGenerated
	protected void addRow(List<String> values, IRuntimeRepository productRepository) {
		String columnValue = values.get(0);
		String tarifzone = columnValue;
		columnValue = values.get(1);
		Decimal beitragssatz = Decimal.valueOf(columnValue);
		rows.add(new TariftabelleHausratRow(tarifzone, beitragssatz));
	}

	/**
	 * Initialisiert die Maps dieser Tabelle. Diese werden von den Finder-Methoden
	 * dieser Klasse verwendet.
	 *
	 * @generated
	 */
	@Override
	@IpsGenerated
	protected final void initKeyMaps() {
		key0SearchStructure = KeyStructure
				.<Index0, UniqueResultStructure<TariftabelleHausratRow>, TariftabelleHausratRow>create();
		for (TariftabelleHausratRow row : rows) {
			key0SearchStructure.put(new Index0(row.getTarifzone()), UniqueResultStructure.createWith(row));
		}
	}

	/**
	 * Gibt die Instanz dieser Tabellenklasse zurueck.
	 *
	 * @generated
	 */
	@IpsGenerated
	public static final TariftabelleHausrat getInstance(IRuntimeRepository repository, String qualifiedTableName) {
		return (TariftabelleHausrat) repository.getTable(qualifiedTableName);
	}

	/**
	 * Durchsucht den Inhalt dieser Tabelle nach einem Eintrag entsprechend der
	 * Suchkriterien und gibt diesen zurueck. Null wird zurueckgegeben falls kein
	 * Eintrag gefunden wird.
	 *
	 * @since 0.0.1
	 *
	 * @generated
	 */
	@IpsGenerated
	public TariftabelleHausratRow findRow(String tarifzone) {
		return key0SearchStructure.get(new Index0(tarifzone)).getUnique(null);
	}

	/**
	 * Durchsucht den Inhalt dieser Tabelle nach einem Eintrag entsprechend der
	 * Suchkriterien und gibt diesen zurück. Eine 'Null-Row' wird zurueckgegeben,
	 * falls kein Eintrag gefunden wird.
	 *
	 * @since 0.0.1
	 *
	 * @generated
	 */
	@IpsGenerated
	public TariftabelleHausratRow findRowNullRowReturnedForEmptyResult(String tarifzone) {
		return key0SearchStructure.get(new Index0(tarifzone)).getUnique(TariftabelleHausratRow.NULL_ROW);
	}

	/**
	 * Durchsucht den Inhalt dieser Tabelle nach einem Eintrag entsprechend der
	 * Suchkriterien und gibt diesen zurück. Eine Exception wird geworfen, falls
	 * kein Eintrag gefunden wird.
	 *
	 * @return Gibt die gesuchte Zeile zurück.
	 * @throws IllegalArgumentException Wenn keine Zeile gefunden wurde.
	 *
	 * @since 0.0.1
	 *
	 * @generated
	 */
	@IpsGenerated
	public TariftabelleHausratRow findExistingRow(String tarifzone) {
		try {
			return key0SearchStructure.get(new Index0(tarifzone)).getUnique();
		} catch (NoSuchElementException e) {
			throw new IllegalArgumentException("Es wurde keine Zeile in Tabelle " + getName()
					+ " mit folgenden Suchparametern gefunden:  tarifzone = " + tarifzone);
		}
	}

	/**
	 * Die Objekte dieser Klasse werden als Hash-Keys verwendent. Fuer jeden
	 * Zugriffsschluessel hat diese Klasse eine eigene java.util.Map.
	 *
	 * @generated
	 */
	private static final class Index0 {

		/**
		 * @generated
		 */
		private final String tarifzone;

		/**
		 * Cached hashcode.
		 *
		 * @generated
		 */
		private final int hashCode;

		/**
		 * Erzeugt eine neue Instanz mit den angegebenen Parameterwerten.
		 *
		 * @generated
		 */
		@IpsGenerated
		private Index0(String tarifzone) {
			this.tarifzone = tarifzone;
			hashCode = calculateHashCode();
		}

		/**
		 * @generated
		 */
		@IpsGenerated
		private int calculateHashCode() {
			int result = 17;
			result = 37 * result + ((tarifzone == null) ? 0 : tarifzone.hashCode());
			return result;
		}

		/**
		 * Ueberschreibt die Methode der Vaterklasse und vergleicht die Werte der
		 * Instanzvariablen auf ihre Gleichheit.
		 *
		 * @generated
		 */
		@Override
		@IpsGenerated
		public boolean equals(Object o) {
			if (o instanceof Index0) {
				Index0 other = (Index0) o;
				return Objects.equals(tarifzone, other.tarifzone);
			}
			return false;
		}

		/**
		 * Ueberschreibt die Methode der Vaterklasse und erzeugt einen Hash-Code
		 * basierend auf den Werten der Attribute dieser Klasse.
		 *
		 * @generated
		 */
		@Override
		@IpsGenerated
		public int hashCode() {
			return hashCode;
		}
	}

}

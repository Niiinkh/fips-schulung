package org.faktorips.schulung.hausratmodell.hausrat;

import org.faktorips.runtime.model.table.TableStructureKind;
import org.faktorips.runtime.model.annotation.IpsTableStructure;
import org.faktorips.runtime.model.annotation.IpsDocumented;
import org.faktorips.runtime.internal.Table;
import org.faktorips.runtime.internal.tableindex.UniqueResultStructure;
import org.faktorips.runtime.internal.tableindex.TwoColumnRangeStructure;
import java.util.ArrayList;
import java.util.List;
import org.faktorips.runtime.IRuntimeRepository;
import java.util.NoSuchElementException;
import org.faktorips.runtime.annotation.IpsGenerated;

/**
 * Diese Klasse implementiert eine Read-Only In-Memory-Tabelle. Auf die Daten
 * der Tabelle kann ueber Finder-Methoden zugegriffen werden.
 *
 * @since 0.0.1
 *
 * @generated
 */
@IpsTableStructure(name = "hausrat.Tarifzonentabelle", type = TableStructureKind.SINGLE_CONTENT, columns = { "plzVon",
		"plzBis", "Tarifzone" })
@IpsDocumented(bundleName = "org.faktorips.schulung.hausratmodell.model-label-and-descriptions", defaultLocale = "de")
public class Tarifzonentabelle extends Table<TarifzonentabelleRow> {

	public static final String DEFAULT_TARIFZONE = "I";
	/**
	 * Membervariable die Keys auf Tabellenzeilen abbildet.
	 *
	 * @since 0.0.1
	 *
	 * @generated
	 */
	private TwoColumnRangeStructure<String, UniqueResultStructure<TarifzonentabelleRow>, TarifzonentabelleRow> key0SearchStructure;

	/**
	 * Erzeugt einen leeren Tabelleninhalt.
	 *
	 * @generated
	 */
	@IpsGenerated
	public Tarifzonentabelle() {
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
	public Tarifzonentabelle(List<TarifzonentabelleRow> content) {
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
	public Tarifzonentabelle(List<TarifzonentabelleRow> content, String qualifiedTableName) {
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
		String plzVon = columnValue;
		columnValue = values.get(1);
		String plzBis = columnValue;
		columnValue = values.get(2);
		String tarifzone = columnValue;
		rows.add(new TarifzonentabelleRow(plzVon, plzBis, tarifzone));
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
		key0SearchStructure = TwoColumnRangeStructure
				.<String, UniqueResultStructure<TarifzonentabelleRow>, TarifzonentabelleRow>create();
		for (TarifzonentabelleRow row : rows) {
			key0SearchStructure.put(row.getPlzVon(), row.getPlzBis(), UniqueResultStructure.createWith(row));
		}
	}

	/**
	 * Gibt die Instanz dieser Tabellenklasse zurueck.
	 *
	 * @generated
	 */
	@IpsGenerated
	public static final Tarifzonentabelle getInstance(IRuntimeRepository repository) {
		return repository.getTable(Tarifzonentabelle.class);
	}

	/**
	 * Gibt die Instanz dieser Tabellenklasse zurueck.
	 *
	 * @generated
	 */
	@IpsGenerated
	public static final Tarifzonentabelle getInstance(IRuntimeRepository repository, String qualifiedTableName) {
		return (Tarifzonentabelle) repository.getTable(qualifiedTableName);
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
	public TarifzonentabelleRow findRow(String plzVonBis) {
		return key0SearchStructure.get(plzVonBis).getUnique(null);
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
	public TarifzonentabelleRow findRowNullRowReturnedForEmptyResult(String plzVonBis) {
		return key0SearchStructure.get(plzVonBis).getUnique(TarifzonentabelleRow.NULL_ROW);
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
	public TarifzonentabelleRow findExistingRow(String plzVonBis) {
		try {
			return key0SearchStructure.get(plzVonBis).getUnique();
		} catch (NoSuchElementException e) {
			throw new IllegalArgumentException("Es wurde keine Zeile in Tabelle " + getName()
					+ " mit folgenden Suchparametern gefunden:  plzVonBis = " + plzVonBis);
		}
	}

	public String getTarifzone(String plz) {
		TarifzonentabelleRow row = findRow(plz);
		if (row != null) {
			return row.getTarifzone();
		}
		return DEFAULT_TARIFZONE;
	}

}

package org.faktorips.schulung.hausratmodell.hausrat;

import org.faktorips.values.Decimal;
import org.faktorips.runtime.model.annotation.IpsTableColumn;
import org.faktorips.runtime.annotation.IpsGenerated;

/**
 * Diese Klasse repraesentiert eine (Read-Only) Zeile einer Tabelle.
 *
 *
 * @since 0.0.1
 *
 * @generated
 */
public class TariftabelleHausratRow {
	/**
	 * @generated
	 */
	public static final TariftabelleHausratRow NULL_ROW = new TariftabelleHausratRow(null, Decimal.NULL);

	/**
	 *
	 * @since 0.0.1
	 *
	 * @generated
	 */
	private final String tarifzone;

	/**
	 *
	 * @since 0.0.1
	 *
	 * @generated
	 */
	private final Decimal beitragssatz;

	/**
	 * Erzeugt eine neue Zeile.
	 *
	 *
	 * @since 0.0.1
	 *
	 * @generated
	 */
	@IpsGenerated
	public TariftabelleHausratRow(String tarifzone, Decimal beitragssatz) {
		this.tarifzone = tarifzone;
		this.beitragssatz = beitragssatz;
	}

	/**
	 * @since 0.0.1
	 *
	 * @generated
	 */
	@IpsTableColumn(name = "Tarifzone")
	@IpsGenerated
	public String getTarifzone() {
		return tarifzone;
	}

	/**
	 * @since 0.0.1
	 *
	 * @generated
	 */
	@IpsTableColumn(name = "beitragssatz")
	@IpsGenerated
	public Decimal getBeitragssatz() {
		return beitragssatz;
	}

	/**
	 * @generated
	 */
	@Override
	@IpsGenerated
	public String toString() {
		return "" + tarifzone + "|" + beitragssatz;
	}
}

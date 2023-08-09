package org.faktorips.schulung.hausratmodell.hausrat;

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
public class TarifzonentabelleRow {
	/**
	 * @generated
	 */
	public static final TarifzonentabelleRow NULL_ROW = new TarifzonentabelleRow(null, null, null);

	/**
	 *
	 * @since 0.0.1
	 *
	 * @generated
	 */
	private final String plzVon;
	/**
	 *
	 * @since 0.0.1
	 *
	 * @generated
	 */
	private final String plzBis;

	/**
	 *
	 * @since 0.0.1
	 *
	 * @generated
	 */
	private final String tarifzone;

	/**
	 * Erzeugt eine neue Zeile.
	 *
	 *
	 * @since 0.0.1
	 *
	 * @generated
	 */
	@IpsGenerated
	public TarifzonentabelleRow(String plzVon, String plzBis, String tarifzone) {
		this.plzVon = plzVon;
		this.plzBis = plzBis;
		this.tarifzone = tarifzone;
	}

	/**
	 * @since 0.0.1
	 *
	 * @generated
	 */
	@IpsTableColumn(name = "plzVon")
	@IpsGenerated
	public String getPlzVon() {
		return plzVon;
	}

	/**
	 * @since 0.0.1
	 *
	 * @generated
	 */
	@IpsTableColumn(name = "plzBis")
	@IpsGenerated
	public String getPlzBis() {
		return plzBis;
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
	 * @generated
	 */
	@Override
	@IpsGenerated
	public String toString() {
		return "" + plzVon + "|" + plzBis + "|" + tarifzone;
	}
}

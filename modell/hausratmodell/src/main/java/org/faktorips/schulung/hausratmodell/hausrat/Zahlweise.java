package org.faktorips.schulung.hausratmodell.hausrat;

import org.faktorips.runtime.model.annotation.IpsDocumented;
import org.faktorips.runtime.model.annotation.IpsEnumType;
import java.util.Map;
import java.util.HashMap;
import org.faktorips.runtime.model.annotation.IpsEnumAttribute;
import org.faktorips.runtime.annotation.IpsGenerated;

/**
 *
 * @since 0.0.1
 *
 * @generated
 */
@IpsDocumented(bundleName = "org.faktorips.schulung.hausratmodell.model-label-and-descriptions", defaultLocale = "en")
@IpsEnumType(name = "hausrat.Zahlweise", attributeNames = { "id", "name" })
public enum Zahlweise {
	/**
	 * @generated
	 */
	MONATLICH(12, "Monatlich"),
	/**
	 * @generated
	 */
	QUARTALSWEISE(4, "Quartalsweise"),
	/**
	 * @generated
	 */
	HALBJAEHRLICH(2, "Halbj\u00E4hrlich"),
	/**
	 * @generated
	 */
	JAEHRLICH(1, "J\u00E4hrlich"),
	/**
	 * @generated
	 */
	EINMALZAHLUNG(0, "Einmalzahlung");

	/**
	 * Eine Map um schnell zu einer ID auf den passenden Enum-Wert zu bekommen.
	 *
	 * @generated
	 */
	private static final Map<Integer, Zahlweise> ID_MAP;
	/**
	 * In diesem static Block wird die ID-Map mit allen Enum-Werten initialisiert.
	 *
	 * @generated
	 */
	static {
		ID_MAP = new HashMap<>();
		for (Zahlweise value : values()) {
			ID_MAP.put(value.id, value);
		}
	}

	/**
	 * @since 0.0.1
	 *
	 * @generated
	 */
	private final int id;
	/**
	 * @since 0.0.1
	 *
	 * @generated
	 */
	private final String name;

	/**
	 * Erzeugt eine neue Instanz von Zahlweise.
	 *
	 * @generated
	 */
	@IpsGenerated
	private Zahlweise(int id, String name) {
		this.id = id;
		this.name = name;
	}

	/**
	 * Gibt den Aufzählungswert für den angegebenen Parameter <code>id</code>
	 * zurueck. Gibt <code>null</code> zurück, wenn kein entsprechender
	 * Aufzählungswert gefunden wird, oder der Parameter <code>id</code>
	 * <code>null</code> ist.
	 *
	 * @generated
	 */
	@IpsGenerated
	public static final Zahlweise getValueById(int id) {
		return ID_MAP.get(id);
	}

	/**
	 * Gibt den Aufzählungswert für den angegebenen Parameter <code>name</code>
	 * zurueck. Gibt <code>null</code> zurück, wenn kein entsprechender
	 * Aufzählungswert gefunden wird, oder der Parameter <code>name</code>
	 * <code>null</code> ist.
	 *
	 * @generated
	 */
	@IpsGenerated
	public static final Zahlweise getValueByName(String name) {
		for (Zahlweise currentValue : values()) {
			if (currentValue.name.equals(name)) {
				return currentValue;
			}
		}
		return null;
	}

	/**
	 * Gibt den Aufzählungswert für den angegebenen Parameter <code>id</code>
	 * zurück. Falls für den gegebenen Parameter kein entsprechender Aufzählungswert
	 * gefunden wird, wird eine {@link IllegalArgumentException} geworfen.
	 *
	 * @throws IllegalArgumentException falls kein passender Aufzählungswert
	 *                                  existiert
	 *
	 * @generated
	 */
	@IpsGenerated
	public static final Zahlweise getExistingValueById(int id) {
		if (ID_MAP.containsKey(id)) {
			return ID_MAP.get(id);
		} else {
			throw new IllegalArgumentException("No enum value with id " + id);
		}
	}

	/**
	 * Gibt den Aufzählungswert für den angegebenen Parameter <code>name</code>
	 * zurück. Falls für den gegebenen Parameter kein entsprechender Aufzählungswert
	 * gefunden wird, wird eine {@link IllegalArgumentException} geworfen.
	 *
	 * @throws IllegalArgumentException falls kein passender Aufzählungswert
	 *                                  existiert
	 *
	 * @generated
	 */
	@IpsGenerated
	public static final Zahlweise getExistingValueByName(String name) {
		for (Zahlweise currentValue : values()) {
			if (currentValue.name.equals(name)) {
				return currentValue;
			}
		}
		throw new IllegalArgumentException("No enum value with name " + name);
	}

	/**
	 * Gibt <code>true</code> zurueck, falls der Parameterwert einen Wert dieser
	 * Aufzählung identifiziert.
	 *
	 * @generated
	 */
	@IpsGenerated
	public static final boolean isValueById(int id) {
		return getValueById(id) != null;
	}

	/**
	 * Gibt <code>true</code> zurueck, falls der Parameterwert einen Wert dieser
	 * Aufzählung identifiziert.
	 *
	 * @generated
	 */
	@IpsGenerated
	public static final boolean isValueByName(String name) {
		return getValueByName(name) != null;
	}

	/**
	 * Gibt den Wert des Attributs id zurück.
	 *
	 * @since 0.0.1
	 *
	 * @generated
	 */
	@IpsEnumAttribute(name = "id", identifier = true, unique = true)
	@IpsGenerated
	public int getId() {
		return id;
	}

	/**
	 * Gibt den Wert des Attributs name zurück.
	 *
	 * @since 0.0.1
	 *
	 * @generated
	 */
	@IpsEnumAttribute(name = "name", unique = true, displayName = true)
	@IpsGenerated
	public String getName() {
		return name;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @generated
	 */
	@Override
	@IpsGenerated
	public String toString() {
		return "Zahlweise: " + id + '(' + name + ')';
	}
}

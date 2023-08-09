package org.faktorips.schulung.hausratmodell.hausrat;

import org.faktorips.runtime.model.annotation.IpsProductCmptType;
import org.faktorips.runtime.model.annotation.IpsAttributes;
import org.faktorips.runtime.model.annotation.IpsConfigures;
import org.faktorips.runtime.model.annotation.IpsDocumented;
import org.faktorips.runtime.internal.ProductComponent;
import org.faktorips.runtime.IRuntimeRepository;
import org.faktorips.runtime.model.annotation.IpsAttribute;
import org.faktorips.runtime.model.type.AttributeKind;
import org.faktorips.runtime.model.type.ValueSetKind;
import org.faktorips.runtime.model.annotation.IpsAttributeSetter;
import org.faktorips.runtime.IllegalRepositoryModificationException;
import org.w3c.dom.Element;
import java.util.Map;
import org.faktorips.runtime.internal.ValueToXmlHelper;
import org.faktorips.runtime.annotation.IpsGenerated;

/**
 * Das HausratProdukt ist das Grundmodell für alle Produktbausteine der Sparte
 * Hausrat
 *
 * @since 0.0.1
 *
 * @generated
 */
@IpsProductCmptType(name = "hausrat.HausratProdukt")
@IpsAttributes({ "produktname", "kurzbezeichnung" })
@IpsConfigures(HausratVertrag.class)
@IpsDocumented(bundleName = "org.faktorips.schulung.hausratmodell.model-label-and-descriptions", defaultLocale = "en")
public class HausratProdukt extends ProductComponent {

	/**
	 * Diese Konstante enthält den Namen der Eigenschaft produktname.
	 *
	 * @since 0.0.1
	 *
	 * @generated
	 */
	public static final String PROPERTY_PRODUKTNAME = "produktname";
	/**
	 * Diese Konstante enthält den Namen der Eigenschaft kurzbezeichnung.
	 *
	 * @since 0.0.1
	 *
	 * @generated
	 */
	public static final String PROPERTY_KURZBEZEICHNUNG = "kurzbezeichnung";
	/**
	 * Membervariable für die Produkteigenschaft Produktname.
	 *
	 * @since 0.0.1
	 *
	 * @generated
	 */
	private String produktname;

	/**
	 * Membervariable für die Produkteigenschaft Kurzbezeichnung.
	 *
	 * @since 0.0.1
	 *
	 * @generated
	 */
	private String kurzbezeichnung;

	/**
	 * Erzeugt eine neue Instanz von HausratProdukt.
	 *
	 * @since 0.0.1
	 *
	 * @generated
	 */
	@IpsGenerated
	public HausratProdukt(IRuntimeRepository repository, String id, String kindId, String versionId) {
		super(repository, id, kindId, versionId);
	}

	/**
	 * {@inheritDoc}
	 *
	 * @generated
	 */
	@Override
	@IpsGenerated
	public boolean isChangingOverTime() {
		return false;
	}

	/**
	 * Gibt den Wert der Eigenschaft produktname zurück.
	 * <p>
	 * Der Name des Verkaufsprodukts
	 *
	 * @since 0.0.1
	 *
	 * @generated
	 */
	@IpsAttribute(name = "produktname", kind = AttributeKind.CONSTANT, valueSetKind = ValueSetKind.AllValues)
	@IpsGenerated
	public String getProduktname() {
		return produktname;
	}

	/**
	 * Setzt den Wert der Eigenschaft produktname.
	 * <p>
	 * Der Name des Verkaufsprodukts
	 *
	 * @since 0.0.1
	 *
	 * @generated
	 */
	@IpsAttributeSetter("produktname")
	@IpsGenerated
	public void setProduktname(String newValue) {
		if (getRepository() != null && !getRepository().isModifiable()) {
			throw new IllegalRepositoryModificationException();
		}
		setProduktnameInternal(newValue);
	}

	/**
	 * Setzt den Wert der Eigenschaft produktname.
	 * <p>
	 * Der Name des Verkaufsprodukts
	 *
	 * @since 0.0.1
	 *
	 * @generated
	 */
	@IpsGenerated
	protected final void setProduktnameInternal(String newValue) {
		this.produktname = newValue;
	}

	/**
	 * Gibt den Wert der Eigenschaft kurzbezeichnung zurück.
	 * <p>
	 * Die Kurzbezeichnung des Produkts (für den internen Gebrauch)
	 *
	 * @since 0.0.1
	 *
	 * @generated
	 */
	@IpsAttribute(name = "kurzbezeichnung", kind = AttributeKind.CONSTANT, valueSetKind = ValueSetKind.AllValues)
	@IpsGenerated
	public String getKurzbezeichnung() {
		return kurzbezeichnung;
	}

	/**
	 * Setzt den Wert der Eigenschaft kurzbezeichnung.
	 * <p>
	 * Die Kurzbezeichnung des Produkts (für den internen Gebrauch)
	 *
	 * @since 0.0.1
	 *
	 * @generated
	 */
	@IpsAttributeSetter("kurzbezeichnung")
	@IpsGenerated
	public void setKurzbezeichnung(String newValue) {
		if (getRepository() != null && !getRepository().isModifiable()) {
			throw new IllegalRepositoryModificationException();
		}
		setKurzbezeichnungInternal(newValue);
	}

	/**
	 * Setzt den Wert der Eigenschaft kurzbezeichnung.
	 * <p>
	 * Die Kurzbezeichnung des Produkts (für den internen Gebrauch)
	 *
	 * @since 0.0.1
	 *
	 * @generated
	 */
	@IpsGenerated
	protected final void setKurzbezeichnungInternal(String newValue) {
		this.kurzbezeichnung = newValue;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @generated
	 */
	@Override
	@IpsGenerated
	protected void doInitPropertiesFromXml(Map<String, Element> configMap) {
		super.doInitPropertiesFromXml(configMap);
		doInitProduktname(configMap);
		doInitKurzbezeichnung(configMap);
	}

	/**
	 * @generated
	 */
	@IpsGenerated
	private void doInitProduktname(Map<String, Element> configMap) {
		Element configElement = configMap.get(PROPERTY_PRODUKTNAME);
		if (configElement != null) {
			String value = ValueToXmlHelper.getValueFromElement(configElement, ValueToXmlHelper.XML_TAG_VALUE);
			this.produktname = value;
		}
	}

	/**
	 * @generated
	 */
	@IpsGenerated
	private void doInitKurzbezeichnung(Map<String, Element> configMap) {
		Element configElement = configMap.get(PROPERTY_KURZBEZEICHNUNG);
		if (configElement != null) {
			String value = ValueToXmlHelper.getValueFromElement(configElement, ValueToXmlHelper.XML_TAG_VALUE);
			this.kurzbezeichnung = value;
		}
	}

	/**
	 * Erzeugt eine neue Instanz von HausratVertrag, die durch diesen
	 * Produktbaustein konfiguriert wird.
	 *
	 * @generated
	 */
	@IpsGenerated
	public HausratVertrag createHausratVertrag() {
		HausratVertrag policy = new HausratVertrag(this);
		policy.initialize();
		return policy;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @generated
	 */
	@Override
	@IpsGenerated
	public HausratVertrag createPolicyComponent() {
		return createHausratVertrag();
	}

}

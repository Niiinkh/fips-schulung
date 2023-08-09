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
 * Implementierung von HausratProdukt.
 *
 * @since 0.0.1
 *
 * @generated
 */
@IpsProductCmptType(name = "hausrat.HausratProdukt")
@IpsAttributes({ "produktname" })
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
	 * Membervariable für die Produkteigenschaft Produktname.
	 *
	 * @since 0.0.1
	 *
	 * @generated
	 */
	private String produktname;

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
	 * {@inheritDoc}
	 *
	 * @generated
	 */
	@Override
	@IpsGenerated
	protected void doInitPropertiesFromXml(Map<String, Element> configMap) {
		super.doInitPropertiesFromXml(configMap);
		doInitProduktname(configMap);
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

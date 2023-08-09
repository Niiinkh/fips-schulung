package org.faktorips.schulung.hausratmodell.hausrat;

import org.faktorips.runtime.model.annotation.IpsProductCmptType;
import org.faktorips.runtime.model.annotation.IpsAttributes;
import org.faktorips.runtime.model.annotation.IpsAssociations;
import org.faktorips.runtime.model.annotation.IpsConfigures;
import org.faktorips.runtime.model.annotation.IpsDocumented;
import org.faktorips.runtime.internal.ProductComponent;
import org.faktorips.runtime.IProductComponentLink;
import org.faktorips.runtime.IRuntimeRepository;
import org.faktorips.runtime.model.annotation.IpsAttribute;
import org.faktorips.runtime.model.type.AttributeKind;
import org.faktorips.runtime.model.type.ValueSetKind;
import org.faktorips.runtime.model.annotation.IpsAttributeSetter;
import org.faktorips.runtime.IllegalRepositoryModificationException;
import org.faktorips.runtime.model.annotation.IpsAssociation;
import org.faktorips.runtime.model.type.AssociationKind;
import org.faktorips.runtime.model.annotation.IpsMatchingAssociation;
import org.faktorips.runtime.model.annotation.IpsAssociationAdder;
import org.faktorips.runtime.internal.ProductComponentLink;
import org.faktorips.runtime.CardinalityRange;
import org.faktorips.runtime.model.annotation.IpsAssociationLinks;
import org.w3c.dom.Element;
import java.util.Map;
import org.faktorips.runtime.internal.ValueToXmlHelper;
import java.util.List;
import org.faktorips.runtime.IProductComponent;
import java.util.ArrayList;
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
@IpsAssociations({ "HausratGrunddeckungstyp" })
@IpsConfigures(HausratVertrag.class)
@IpsDocumented(bundleName = "org.faktorips.schulung.hausratmodell.model-label-and-descriptions", defaultLocale = "en")
public class HausratProdukt extends ProductComponent {

	/**
	 * Der XML Tag Name der Assoziation hausratGrunddeckungstyp.
	 *
	 * @since 0.0.1
	 *
	 * @generated
	 */
	private static final String XML_TAG_HAUSRAT_GRUNDDECKUNGSTYP = "HausratGrunddeckungstyp";
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
	 * Membervariable fuer die Beziehung HausratGrunddeckungstyp.
	 *
	 * @since 0.0.1
	 *
	 * @generated
	 */
	private IProductComponentLink<HausratGrunddeckungstyp> hausratGrunddeckungstyp = null;

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
	 * Gibt HausratGrunddeckungstyp zurueck. bzw. <code>null</code>, wenn kein
	 * HausratGrunddeckungstyp referenziert wird.
	 * 
	 * @throws org.faktorips.runtime.ProductCmptNotFoundException wenn ein Baustein
	 *                                                            referenziert ist,
	 *                                                            dieser aber nicht
	 *                                                            gefunden wird.
	 * @since 0.0.1
	 * @generated
	 */
	@IpsAssociation(name = "HausratGrunddeckungstyp", pluralName = "", kind = AssociationKind.Composition, targetClass = HausratGrunddeckungstyp.class, min = 1, max = 1)
	@IpsMatchingAssociation(source = HausratVertrag.class, name = "HausratGrunddeckung")
	@IpsGenerated
	public HausratGrunddeckungstyp getHausratGrunddeckungstyp() {
		return hausratGrunddeckungstyp != null ? hausratGrunddeckungstyp.getTarget() : null;
	}

	/**
	 * Setzt das neue referenzierte HausratGrunddeckungstyp-Objekt.
	 * 
	 * @since 0.0.1
	 * @generated
	 */
	@IpsAssociationAdder(association = "HausratGrunddeckungstyp")
	@IpsGenerated
	public void setHausratGrunddeckungstyp(HausratGrunddeckungstyp target) {
		if (getRepository() != null && !getRepository().isModifiable()) {
			throw new IllegalRepositoryModificationException();
		}
		hausratGrunddeckungstyp = (target == null ? null
				: new ProductComponentLink<>(this, target, "HausratGrunddeckungstyp"));
	}

	/**
	 * Setzt das neue referenzierte HausratGrunddeckungstyp-Objekt mit der gegebenen
	 * Kardinalitaet.
	 * 
	 * @since 0.0.1
	 * @generated
	 */
	@IpsAssociationAdder(association = "HausratGrunddeckungstyp", withCardinality = true)
	@IpsGenerated
	public void setHausratGrunddeckungstyp(HausratGrunddeckungstyp target, CardinalityRange cardinality) {
		if (getRepository() != null && !getRepository().isModifiable()) {
			throw new IllegalRepositoryModificationException();
		}
		hausratGrunddeckungstyp = (target == null ? null
				: new ProductComponentLink<>(this, target, cardinality, "HausratGrunddeckungstyp"));
	}

	/**
	 * Gibt den <code>ILink</code> zu HausratGrunddeckungstyp zurueck. bzw.
	 * <code>null</code>, wenn kein Objekt referenziert wird.
	 * 
	 * @since 0.0.1
	 * @generated
	 */
	@IpsAssociationLinks(association = "HausratGrunddeckungstyp")
	@IpsGenerated
	public IProductComponentLink<HausratGrunddeckungstyp> getLinkForHausratGrunddeckungstyp() {
		return hausratGrunddeckungstyp;
	}

	/**
	 * Gibt den <code>ILink</code> zu HausratGrunddeckungstyp an dem angegebenen
	 * Index zurueck.
	 * 
	 * @since 0.0.1
	 * @generated
	 */
	@IpsGenerated
	public IProductComponentLink<HausratGrunddeckungstyp> getLinkForHausratGrunddeckungstyp(
			HausratGrunddeckungstyp productComponent) {
		return hausratGrunddeckungstyp != null && hausratGrunddeckungstyp.getTargetId().equals(productComponent.getId())
				? hausratGrunddeckungstyp
				: null;
	}

	/**
	 * Gibt die Kardinalitaet fuer die Beziehung mit den Rollennamen
	 * HausratGrunddeckung zurueck.
	 * 
	 * @since 0.0.1
	 * @generated
	 */
	@IpsGenerated
	public CardinalityRange getCardinalityForHausratGrunddeckung(HausratGrunddeckungstyp productCmpt) {
		if (productCmpt != null) {
			return hausratGrunddeckungstyp != null && hausratGrunddeckungstyp.getTargetId().equals(productCmpt.getId())
					? hausratGrunddeckungstyp.getCardinality()
					: null;
		}
		return null;
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
	 * @generated
	 */
	@Override
	@IpsGenerated
	protected void doInitReferencesFromXml(Map<String, List<Element>> elementsMap) {
		super.doInitReferencesFromXml(elementsMap);
		doInitHausratGrunddeckungstyp(elementsMap);
	}

	/**
	 * @generated
	 */
	@IpsGenerated
	private void doInitHausratGrunddeckungstyp(Map<String, List<Element>> elementsMap) {
		List<Element> associationElements = elementsMap.get(XML_TAG_HAUSRAT_GRUNDDECKUNGSTYP);
		if (associationElements != null) {
			Element element = associationElements.get(0);
			hausratGrunddeckungstyp = new ProductComponentLink<>(this);
			hausratGrunddeckungstyp.initFromXml(element);
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

	/**
	 * {@inheritDoc}
	 * 
	 * @generated
	 */
	@Override
	@IpsGenerated
	public IProductComponentLink<? extends IProductComponent> getLink(String linkName, IProductComponent target) {
		if ("HausratGrunddeckungstyp".equals(linkName)) {
			return getLinkForHausratGrunddeckungstyp((HausratGrunddeckungstyp) target);
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @generated
	 */
	@Override
	@IpsGenerated
	public List<IProductComponentLink<? extends IProductComponent>> getLinks() {
		List<IProductComponentLink<? extends IProductComponent>> list = new ArrayList<>();
		if (getLinkForHausratGrunddeckungstyp() != null) {
			list.add(getLinkForHausratGrunddeckungstyp());
		}
		return list;
	}

}

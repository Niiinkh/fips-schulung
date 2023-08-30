package org.faktorips.schulung.hausratmodell.hausrat;

import org.faktorips.runtime.model.annotation.IpsProductCmptType;
import org.faktorips.runtime.model.annotation.IpsAttributes;
import org.faktorips.runtime.model.annotation.IpsAssociations;
import org.faktorips.runtime.model.annotation.IpsConfigures;
import org.faktorips.runtime.model.annotation.IpsDocumented;
import org.faktorips.runtime.internal.ProductComponent;
import org.faktorips.valueset.OrderedValueSet;
import org.faktorips.valueset.IntegerRange;
import org.faktorips.values.Money;
import org.faktorips.valueset.MoneyRange;
import org.faktorips.runtime.IProductComponentLink;
import org.faktorips.runtime.IRuntimeRepository;
import org.faktorips.runtime.model.annotation.IpsAttribute;
import org.faktorips.runtime.model.type.AttributeKind;
import org.faktorips.runtime.model.type.ValueSetKind;
import org.faktorips.runtime.model.annotation.IpsAttributeSetter;
import org.faktorips.runtime.IllegalRepositoryModificationException;
import org.faktorips.runtime.model.annotation.IpsDefaultValue;
import org.faktorips.runtime.model.annotation.IpsDefaultValueSetter;
import org.faktorips.runtime.model.annotation.IpsAllowedValues;
import org.faktorips.valueset.ValueSet;
import org.faktorips.runtime.model.annotation.IpsAllowedValuesSetter;
import org.faktorips.runtime.model.annotation.IpsAssociation;
import org.faktorips.runtime.model.type.AssociationKind;
import org.faktorips.runtime.model.annotation.IpsMatchingAssociation;
import org.faktorips.runtime.model.annotation.IpsAssociationAdder;
import org.faktorips.runtime.internal.ProductComponentLink;
import org.faktorips.runtime.CardinalityRange;
import org.faktorips.runtime.model.annotation.IpsAssociationLinks;
import org.w3c.dom.Element;
import java.util.Map;
import java.util.LinkedHashMap;
import org.faktorips.runtime.internal.ValueToXmlHelper;
import org.faktorips.runtime.internal.IpsStringUtils;
import org.faktorips.valueset.UnrestrictedValueSet;
import java.util.Arrays;
import org.faktorips.runtime.internal.EnumValues;
import java.util.List;
import org.faktorips.runtime.IProductComponent;
import java.util.ArrayList;
import org.faktorips.runtime.util.ProductComponentLinks;
import org.faktorips.runtime.model.annotation.IpsAssociationRemover;
import java.util.Collection;
import java.util.Collections;
import org.faktorips.runtime.internal.Range;
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
@IpsAttributes({ "produktname", "kurzbezeichnung", "vorschlagVersSummeProQm" })
@IpsAssociations({ "HausratGrunddeckungstyp", "HausratZusatzdeckungsTyp" })
@IpsConfigures(HausratVertrag.class)
@IpsDocumented(bundleName = "org.faktorips.schulung.hausratmodell.model-label-and-descriptions", defaultLocale = "de")
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
	 * Der XML Tag Name der Assoziation hausratZusatzdeckungsTypen.
	 *
	 * @since 0.0.1
	 *
	 * @generated
	 */
	private static final String XML_TAG_HAUSRAT_ZUSATZDECKUNGS_TYPEN = "HausratZusatzdeckungsTyp";
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
	 * Diese Konstante enthält den Namen der Eigenschaft vorschlagVersSummeProQm.
	 *
	 * @since 0.0.1
	 *
	 * @generated
	 */
	public static final String PROPERTY_VORSCHLAGVERSSUMMEPROQM = "vorschlagVersSummeProQm";
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
	 * Membervariable für die Produkteigenschaft VorschlagVersSummeProQm.
	 *
	 * @since 0.0.1
	 *
	 * @generated
	 */
	private Money vorschlagVersSummeProQm;
	/**
	 * Membervariable fuer den Vorgabewert der Vertragseigenschaft zahlweise.
	 *
	 * @since 0.0.1
	 *
	 * @generated
	 */
	private Zahlweise defaultValueZahlweise = null;
	/**
	 * Instanzvariable fuer die erlaubte Wertemenge des Attributs zahlweise.
	 *
	 * @since 0.0.1
	 *
	 * @generated
	 */
	private ValueSet<Zahlweise> setOfAllowedValuesZahlweise = HausratVertrag.MAX_ALLOWED_VALUES_FOR_ZAHLWEISE;
	/**
	 * Membervariable fuer den Vorgabewert der Vertragseigenschaft wohnflaeche.
	 *
	 * @since 0.0.1
	 *
	 * @generated
	 */
	private Integer defaultValueWohnflaeche = null;
	/**
	 * Instanzvariable fuer den Wertebereich des Attributs wohnflaeche.
	 *
	 * @since 0.0.1
	 *
	 * @generated
	 */
	private IntegerRange rangeForWohnflaeche = HausratVertrag.MAX_ALLOWED_RANGE_FOR_WOHNFLAECHE;
	/**
	 * Membervariable fuer den Vorgabewert der Vertragseigenschaft versSumme.
	 *
	 * @since 0.0.1
	 *
	 * @generated
	 */
	private Money defaultValueVersSumme = Money.NULL;
	/**
	 * Instanzvariable fuer den Wertebereich des Attributs versSumme.
	 *
	 * @since 0.0.1
	 *
	 * @generated
	 */
	private MoneyRange rangeForVersSumme = HausratVertrag.MAX_ALLOWED_RANGE_FOR_VERS_SUMME;
	/**
	 * Membervariable fuer die Beziehung HausratGrunddeckungstyp.
	 *
	 * @since 0.0.1
	 *
	 * @generated
	 */
	private IProductComponentLink<HausratGrunddeckungstyp> hausratGrunddeckungstyp = null;

	/**
	 * Membervariable fuer die Beziehung HausratZusatzdeckungsTypen.
	 *
	 * @since 0.0.1
	 *
	 * @generated
	 */
	private Map<String, IProductComponentLink<HausratZusatzdeckungsTyp>> hausratZusatzdeckungsTypen = new LinkedHashMap<>(
			0);

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
	 * Gibt den Wert der Eigenschaft vorschlagVersSummeProQm zurück.
	 * <p>
	 * Vorschlag der Versicherungssumme pro Quadratmeter
	 *
	 * @since 0.0.1
	 *
	 * @generated
	 */
	@IpsAttribute(name = "vorschlagVersSummeProQm", kind = AttributeKind.CONSTANT, valueSetKind = ValueSetKind.AllValues)
	@IpsGenerated
	public Money getVorschlagVersSummeProQm() {
		return vorschlagVersSummeProQm;
	}

	/**
	 * Setzt den Wert der Eigenschaft vorschlagVersSummeProQm.
	 * <p>
	 * Vorschlag der Versicherungssumme pro Quadratmeter
	 *
	 * @since 0.0.1
	 *
	 * @generated
	 */
	@IpsAttributeSetter("vorschlagVersSummeProQm")
	@IpsGenerated
	public void setVorschlagVersSummeProQm(Money newValue) {
		if (getRepository() != null && !getRepository().isModifiable()) {
			throw new IllegalRepositoryModificationException();
		}
		setVorschlagVersSummeProQmInternal(newValue);
	}

	/**
	 * Setzt den Wert der Eigenschaft vorschlagVersSummeProQm.
	 * <p>
	 * Vorschlag der Versicherungssumme pro Quadratmeter
	 *
	 * @since 0.0.1
	 *
	 * @generated
	 */
	@IpsGenerated
	protected final void setVorschlagVersSummeProQmInternal(Money newValue) {
		this.vorschlagVersSummeProQm = newValue;
	}

	/**
	 * Gibt den Defaultwert fuer die Eigenschaft zahlweise zurueck.
	 *
	 * @since 0.0.1
	 *
	 * @generated
	 */
	@IpsDefaultValue("zahlweise")
	@IpsGenerated
	public Zahlweise getDefaultValueZahlweise() {
		return defaultValueZahlweise;
	}

	/**
	 * Setzt den Defaultwert fuer die Eigenschaft zahlweise.
	 *
	 * @since 0.0.1
	 *
	 * @generated
	 */
	@IpsDefaultValueSetter("zahlweise")
	@IpsGenerated
	public void setDefaultValueZahlweise(Zahlweise defaultValueZahlweise) {
		if (getRepository() != null && !getRepository().isModifiable()) {
			throw new IllegalRepositoryModificationException();
		}
		this.defaultValueZahlweise = defaultValueZahlweise;
	}

	/**
	 * Gibt den erlaubten Wertebereich fuer das Attribut zahlweise zurueck.
	 *
	 * @since 0.0.1
	 *
	 * @generated
	 */
	@IpsAllowedValues("zahlweise")
	@IpsGenerated
	public ValueSet<Zahlweise> getAllowedValuesForZahlweise() {
		return setOfAllowedValuesZahlweise;
	}

	/**
	 * Setzt den erlaubten Wertebereich fuer das Attribut zahlweise.
	 *
	 * @throws ClassCastException wenn der Typ des Wertebereichs nicht zur
	 *                            Konfiguration des Attributs passt.
	 *
	 * @since 0.0.1
	 *
	 * @generated
	 */
	@IpsAllowedValuesSetter("zahlweise")
	@IpsGenerated
	public void setAllowedValuesForZahlweise(ValueSet<Zahlweise> setOfAllowedValuesZahlweise) {
		if (getRepository() != null && !getRepository().isModifiable()) {
			throw new IllegalRepositoryModificationException();
		}
		this.setOfAllowedValuesZahlweise = setOfAllowedValuesZahlweise;
	}

	/**
	 * Gibt den Defaultwert fuer die Eigenschaft wohnflaeche zurueck.
	 *
	 * @since 0.0.1
	 *
	 * @generated
	 */
	@IpsDefaultValue("wohnflaeche")
	@IpsGenerated
	public Integer getDefaultValueWohnflaeche() {
		return defaultValueWohnflaeche;
	}

	/**
	 * Setzt den Defaultwert fuer die Eigenschaft wohnflaeche.
	 *
	 * @since 0.0.1
	 *
	 * @generated
	 */
	@IpsDefaultValueSetter("wohnflaeche")
	@IpsGenerated
	public void setDefaultValueWohnflaeche(Integer defaultValueWohnflaeche) {
		if (getRepository() != null && !getRepository().isModifiable()) {
			throw new IllegalRepositoryModificationException();
		}
		this.defaultValueWohnflaeche = defaultValueWohnflaeche;
	}

	/**
	 * Gibt den erlaubten Wertebereich fuer das Attribut wohnflaeche zurueck.
	 *
	 * @since 0.0.1
	 *
	 * @generated
	 */
	@IpsAllowedValues("wohnflaeche")
	@IpsGenerated
	public ValueSet<Integer> getAllowedValuesForWohnflaeche() {
		return rangeForWohnflaeche;
	}

	/**
	 * Setzt den erlaubten Wertebereich fuer das Attribut wohnflaeche.
	 *
	 * @throws ClassCastException wenn der Typ des Wertebereichs nicht zur
	 *                            Konfiguration des Attributs passt.
	 *
	 * @since 0.0.1
	 *
	 * @generated
	 */
	@IpsAllowedValuesSetter("wohnflaeche")
	@IpsGenerated
	public void setAllowedValuesForWohnflaeche(ValueSet<Integer> rangeForWohnflaeche) {
		if (getRepository() != null && !getRepository().isModifiable()) {
			throw new IllegalRepositoryModificationException();
		}
		this.rangeForWohnflaeche = (IntegerRange) rangeForWohnflaeche;
	}

	/**
	 * Gibt den Defaultwert fuer die Eigenschaft versSumme zurueck.
	 *
	 * @since 0.0.1
	 *
	 * @generated
	 */
	@IpsDefaultValue("versSumme")
	@IpsGenerated
	public Money getDefaultValueVersSumme() {
		return defaultValueVersSumme;
	}

	/**
	 * Setzt den Defaultwert fuer die Eigenschaft versSumme.
	 *
	 * @since 0.0.1
	 *
	 * @generated
	 */
	@IpsDefaultValueSetter("versSumme")
	@IpsGenerated
	public void setDefaultValueVersSumme(Money defaultValueVersSumme) {
		if (getRepository() != null && !getRepository().isModifiable()) {
			throw new IllegalRepositoryModificationException();
		}
		this.defaultValueVersSumme = defaultValueVersSumme;
	}

	/**
	 * Gibt den erlaubten Wertebereich fuer das Attribut versSumme zurueck.
	 *
	 * @since 0.0.1
	 *
	 * @generated
	 */
	@IpsAllowedValues("versSumme")
	@IpsGenerated
	public ValueSet<Money> getAllowedValuesForVersSumme() {
		return rangeForVersSumme;
	}

	/**
	 * Setzt den erlaubten Wertebereich fuer das Attribut versSumme.
	 *
	 * @throws ClassCastException wenn der Typ des Wertebereichs nicht zur
	 *                            Konfiguration des Attributs passt.
	 *
	 * @since 0.0.1
	 *
	 * @generated
	 */
	@IpsAllowedValuesSetter("versSumme")
	@IpsGenerated
	public void setAllowedValuesForVersSumme(ValueSet<Money> rangeForVersSumme) {
		if (getRepository() != null && !getRepository().isModifiable()) {
			throw new IllegalRepositoryModificationException();
		}
		this.rangeForVersSumme = (MoneyRange) rangeForVersSumme;
	}

	/**
	 * Gibt HausratGrunddeckungstyp zurueck. bzw. <code>null</code>, wenn kein
	 * HausratGrunddeckungstyp referenziert wird.
	 *
	 * @throws org.faktorips.runtime.ProductCmptNotFoundException wenn ein Baustein
	 *                                                            referenziert ist,
	 *                                                            dieser aber nicht
	 *                                                            gefunden wird.
	 *
	 * @since 0.0.1
	 *
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
	 *
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
	 *
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
	 *
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
	 *
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
	 *
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
	 * Gibt die referenzierten HausratZusatzdeckungsTypen zurueck. Gibt ein leeres
	 * Array zurueck, wenn kein Objekt referenziert wird.
	 *
	 * @throws org.faktorips.runtime.ProductCmptNotFoundException wenn einer der
	 *                                                            referenzierten
	 *                                                            Bausteine nicht
	 *                                                            gefunden wird.
	 *
	 * @since 0.0.1
	 *
	 * @generated
	 */
	@IpsAssociation(name = "HausratZusatzdeckungsTyp", pluralName = "HausratZusatzdeckungsTypen", kind = AssociationKind.Composition, targetClass = HausratZusatzdeckungsTyp.class, min = 0, max = Integer.MAX_VALUE)
	@IpsMatchingAssociation(source = HausratVertrag.class, name = "HausratZusatzdeckung")
	@IpsGenerated
	public List<? extends HausratZusatzdeckungsTyp> getHausratZusatzdeckungsTypen() {
		List<HausratZusatzdeckungsTyp> result = new ArrayList<>(hausratZusatzdeckungsTypen.size());
		for (IProductComponentLink<HausratZusatzdeckungsTyp> hausratZusatzdeckungsTyp : hausratZusatzdeckungsTypen
				.values()) {
			if (!hausratZusatzdeckungsTyp.getCardinality().isEmpty()) {
				result.add(hausratZusatzdeckungsTyp.getTarget());
			}
		}
		return result;
	}

	/**
	 * Gibt HausratZusatzdeckungsTyp an dem angegebenen Index zurueck.
	 *
	 * @throws IndexOutOfBoundsException                          wenn der
	 *                                                            angegebene Index
	 *                                                            nicht im erlaubten
	 *                                                            Bereich liegt
	 *                                                            (kleiner als 0
	 *                                                            oder größer gleich
	 *                                                            Anzahl der
	 *                                                            referenzierten
	 *                                                            Bausteine).
	 * @throws org.faktorips.runtime.ProductCmptNotFoundException wenn der
	 *                                                            referenzierte
	 *                                                            Baustein nicht im
	 *                                                            Repository
	 *                                                            gefunden werden
	 *                                                            kann.
	 *
	 * @since 0.0.1
	 *
	 * @generated
	 */
	@IpsGenerated
	public HausratZusatzdeckungsTyp getHausratZusatzdeckungsTyp(int index) {
		return ProductComponentLinks.getTarget(index, hausratZusatzdeckungsTypen);
	}

	/**
	 * Fuegt den gegebenen Produktbaustein zu diesem hinzu.
	 *
	 * @since 0.0.1
	 *
	 * @generated
	 */
	@IpsAssociationAdder(association = "HausratZusatzdeckungsTyp")
	@IpsGenerated
	public void addHausratZusatzdeckungsTyp(HausratZusatzdeckungsTyp target) {
		if (getRepository() != null && !getRepository().isModifiable()) {
			throw new IllegalRepositoryModificationException();
		}
		this.hausratZusatzdeckungsTypen.put(target.getId(),
				new ProductComponentLink<>(this, target, "HausratZusatzdeckungsTyp"));
	}

	/**
	 * Fuegt den gegebenen Produktbaustein mit der gegebenen Kardinalitaet zu diesem
	 * hinzu.
	 *
	 * @since 0.0.1
	 *
	 * @generated
	 */
	@IpsAssociationAdder(association = "HausratZusatzdeckungsTyp", withCardinality = true)
	@IpsGenerated
	public void addHausratZusatzdeckungsTyp(HausratZusatzdeckungsTyp target, CardinalityRange cardinality) {
		if (getRepository() != null && !getRepository().isModifiable()) {
			throw new IllegalRepositoryModificationException();
		}
		this.hausratZusatzdeckungsTypen.put(target.getId(),
				new ProductComponentLink<>(this, target, cardinality, "HausratZusatzdeckungsTyp"));
	}

	/**
	 * Entfernt die Beziehung zum gegebenen Produktbaustein.
	 *
	 * @since 0.0.1
	 *
	 * @generated
	 */
	@IpsAssociationRemover(association = "HausratZusatzdeckungsTyp")
	@IpsGenerated
	public void removeHausratZusatzdeckungsTyp(HausratZusatzdeckungsTyp target) {
		if (getRepository() != null && !getRepository().isModifiable()) {
			throw new IllegalRepositoryModificationException();
		}
		this.hausratZusatzdeckungsTypen.remove(target.getId());
	}

	/**
	 * Gibt die <code>ILink</code>s zu den referenzierten HausratZusatzdeckungsTypen
	 * zurueck. Gibt eine leere <code>Collection</code> zurueck, wenn kein Objekt
	 * referenziert wird.
	 *
	 * @since 0.0.1
	 *
	 * @generated
	 */
	@IpsAssociationLinks(association = "HausratZusatzdeckungsTyp")
	@IpsGenerated
	public Collection<IProductComponentLink<HausratZusatzdeckungsTyp>> getLinksForHausratZusatzdeckungsTypen() {
		return Collections.unmodifiableCollection(hausratZusatzdeckungsTypen.values());
	}

	/**
	 * Gibt den <code>ILink</code> zu HausratZusatzdeckungsTyp an dem angegebenen
	 * Index zurueck.
	 *
	 * @since 0.0.1
	 *
	 * @generated
	 */
	@IpsGenerated
	public IProductComponentLink<HausratZusatzdeckungsTyp> getLinkForHausratZusatzdeckungsTyp(
			HausratZusatzdeckungsTyp productComponent) {
		return hausratZusatzdeckungsTypen.get(productComponent.getId());
	}

	/**
	 * Gibt die Kardinalitaet fuer die Beziehung mit den Rollennamen
	 * HausratZusatzdeckung zurueck.
	 *
	 * @since 0.0.1
	 *
	 * @generated
	 */
	@IpsGenerated
	public CardinalityRange getCardinalityForHausratZusatzdeckung(HausratZusatzdeckungsTyp productCmpt) {
		if (productCmpt != null) {
			return hausratZusatzdeckungsTypen.containsKey(productCmpt.getId())
					? hausratZusatzdeckungsTypen.get(productCmpt.getId()).getCardinality()
					: null;
		}
		return null;
	}

	/**
	 * Gibt die Anzahl der HausratZusatzdeckungsTypen zurueck.
	 *
	 * @since 0.0.1
	 *
	 * @generated
	 */
	@IpsGenerated
	public int getNumOfHausratZusatzdeckungsTypen() {
		return hausratZusatzdeckungsTypen.size();
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
		doInitVorschlagVersSummeProQm(configMap);
		doInitZahlweise(configMap);
		doInitWohnflaeche(configMap);
		doInitVersSumme(configMap);
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
	@IpsGenerated
	private void doInitVorschlagVersSummeProQm(Map<String, Element> configMap) {
		Element configElement = configMap.get(PROPERTY_VORSCHLAGVERSSUMMEPROQM);
		if (configElement != null) {
			String value = ValueToXmlHelper.getValueFromElement(configElement, ValueToXmlHelper.XML_TAG_VALUE);
			this.vorschlagVersSummeProQm = Money.valueOf(value);
		}
	}

	/**
	 * @generated
	 */
	@IpsGenerated
	private void doInitZahlweise(Map<String, Element> configMap) {
		Element defaultValueElement = configMap
				.get(ValueToXmlHelper.CONFIGURED_DEFAULT_PREFIX + HausratVertrag.PROPERTY_ZAHLWEISE);
		if (defaultValueElement != null) {
			String value = ValueToXmlHelper.getValueFromElement(defaultValueElement);
			defaultValueZahlweise = IpsStringUtils.isEmpty(value) ? null
					: Zahlweise.getValueById(Integer.parseInt(value));
		}
		Element valueSetElement = configMap
				.get(ValueToXmlHelper.CONFIGURED_VALUE_SET_PREFIX + HausratVertrag.PROPERTY_ZAHLWEISE);
		if (valueSetElement != null) {
			UnrestrictedValueSet<?> unrestrictedValueSet = ValueToXmlHelper.getUnrestrictedValueSet(valueSetElement,
					ValueToXmlHelper.XML_TAG_VALUE_SET);
			setOfAllowedValuesZahlweise = new OrderedValueSet<>(Arrays.asList(Zahlweise.values()),
					unrestrictedValueSet.containsNull(), null);
			EnumValues values = ValueToXmlHelper.getEnumValueSetFromElement(valueSetElement,
					ValueToXmlHelper.XML_TAG_VALUE_SET);
			if (values != null) {
				List<Zahlweise> enumValues = new ArrayList<>();
				for (int i = 0; i < values.getNumberOfValues(); i++) {
					enumValues.add(IpsStringUtils.isEmpty(values.getValue(i)) ? null
							: Zahlweise.getValueById(Integer.parseInt(values.getValue(i))));
				}
				setOfAllowedValuesZahlweise = new OrderedValueSet<>(enumValues, values.containsNull(), null);
			}
		}
	}

	/**
	 * @generated
	 */
	@IpsGenerated
	private void doInitWohnflaeche(Map<String, Element> configMap) {
		Element defaultValueElement = configMap
				.get(ValueToXmlHelper.CONFIGURED_DEFAULT_PREFIX + HausratVertrag.PROPERTY_WOHNFLAECHE);
		if (defaultValueElement != null) {
			String value = ValueToXmlHelper.getValueFromElement(defaultValueElement);
			defaultValueWohnflaeche = IpsStringUtils.isEmpty(value) ? null : Integer.valueOf(value);
		}
		Element valueSetElement = configMap
				.get(ValueToXmlHelper.CONFIGURED_VALUE_SET_PREFIX + HausratVertrag.PROPERTY_WOHNFLAECHE);
		if (valueSetElement != null) {
			Range range = ValueToXmlHelper.getRangeFromElement(valueSetElement, ValueToXmlHelper.XML_TAG_VALUE_SET);
			if (range != null) {
				if (range.isEmpty()) {
					rangeForWohnflaeche = IntegerRange.empty();
				} else {
					rangeForWohnflaeche = IntegerRange.valueOf(range.getLower(), range.getUpper(), range.getStep(),
							range.containsNull());
				}
			}
		}
	}

	/**
	 * @generated
	 */
	@IpsGenerated
	private void doInitVersSumme(Map<String, Element> configMap) {
		Element defaultValueElement = configMap
				.get(ValueToXmlHelper.CONFIGURED_DEFAULT_PREFIX + HausratVertrag.PROPERTY_VERSSUMME);
		if (defaultValueElement != null) {
			String value = ValueToXmlHelper.getValueFromElement(defaultValueElement);
			defaultValueVersSumme = Money.valueOf(value);
		}
		Element valueSetElement = configMap
				.get(ValueToXmlHelper.CONFIGURED_VALUE_SET_PREFIX + HausratVertrag.PROPERTY_VERSSUMME);
		if (valueSetElement != null) {
			Range range = ValueToXmlHelper.getRangeFromElement(valueSetElement, ValueToXmlHelper.XML_TAG_VALUE_SET);
			if (range != null) {
				if (range.isEmpty()) {
					rangeForVersSumme = MoneyRange.empty();
				} else {
					rangeForVersSumme = MoneyRange.valueOf(range.getLower(), range.getUpper(), range.getStep(),
							range.containsNull());
				}
			}
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
		doInitHausratZusatzdeckungsTyp(elementsMap);
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
	 * @generated
	 */
	@IpsGenerated
	private void doInitHausratZusatzdeckungsTyp(Map<String, List<Element>> elementsMap) {
		List<Element> associationElements = elementsMap.get(XML_TAG_HAUSRAT_ZUSATZDECKUNGS_TYPEN);
		if (associationElements != null) {
			this.hausratZusatzdeckungsTypen = new LinkedHashMap<>(associationElements.size());
			for (Element element : associationElements) {
				IProductComponentLink<HausratZusatzdeckungsTyp> link = new ProductComponentLink<>(this);
				link.initFromXml(element);
				this.hausratZusatzdeckungsTypen.put(link.getTargetId(), link);
			}
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
		if ("HausratZusatzdeckungsTyp".equals(linkName)) {
			return getLinkForHausratZusatzdeckungsTyp((HausratZusatzdeckungsTyp) target);
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
		list.addAll(getLinksForHausratZusatzdeckungsTypen());
		return list;
	}

}

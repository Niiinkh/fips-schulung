package org.faktorips.schulung.hausratmodell.hausrat;

import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

import org.faktorips.runtime.IConfigurableModelObject;
import org.faktorips.runtime.ICopySupport;
import org.faktorips.runtime.IDeltaComputationOptions;
import org.faktorips.runtime.IDeltaSupport;
import org.faktorips.runtime.IModelObject;
import org.faktorips.runtime.IModelObjectDelta;
import org.faktorips.runtime.IModelObjectVisitor;
import org.faktorips.runtime.IObjectReferenceStore;
import org.faktorips.runtime.IProductComponent;
import org.faktorips.runtime.IRuntimeRepository;
import org.faktorips.runtime.IValidationContext;
import org.faktorips.runtime.IVisitorSupport;
import org.faktorips.runtime.MessageList;
import org.faktorips.runtime.annotation.IpsGenerated;
import org.faktorips.runtime.internal.AbstractModelObject;
import org.faktorips.runtime.internal.IpsStringUtils;
import org.faktorips.runtime.internal.ModelObjectDelta;
import org.faktorips.runtime.internal.ProductConfiguration;
import org.faktorips.runtime.internal.XmlCallback;
import org.faktorips.runtime.model.annotation.IpsAllowedValues;
import org.faktorips.runtime.model.annotation.IpsAssociation;
import org.faktorips.runtime.model.annotation.IpsAssociationAdder;
import org.faktorips.runtime.model.annotation.IpsAssociations;
import org.faktorips.runtime.model.annotation.IpsAttribute;
import org.faktorips.runtime.model.annotation.IpsAttributeSetter;
import org.faktorips.runtime.model.annotation.IpsAttributes;
import org.faktorips.runtime.model.annotation.IpsConfiguredBy;
import org.faktorips.runtime.model.annotation.IpsDefaultValue;
import org.faktorips.runtime.model.annotation.IpsDocumented;
import org.faktorips.runtime.model.annotation.IpsInverseAssociation;
import org.faktorips.runtime.model.annotation.IpsPolicyCmptType;
import org.faktorips.runtime.model.type.AssociationKind;
import org.faktorips.runtime.model.annotation.IpsMatchingAssociation;
import org.faktorips.runtime.model.type.AttributeKind;
import org.faktorips.runtime.model.type.ValueSetKind;
import org.faktorips.runtime.model.annotation.IpsConfiguredAttribute;
import org.faktorips.values.Money;
import org.faktorips.valueset.IntegerRange;
import org.faktorips.valueset.MoneyRange;
import org.faktorips.valueset.OrderedValueSet;
import org.faktorips.valueset.StringLengthValueSet;
import org.faktorips.valueset.UnrestrictedValueSet;
import org.faktorips.valueset.ValueSet;
import org.w3c.dom.Element;

/**
 * Implementierung von HausratVertrag.
 *
 * @since 0.0.1
 *
 * @generated
 */
@IpsPolicyCmptType(name = "hausrat.HausratVertrag")
@IpsAttributes({ "zahlweise", "plz", "tarifzone", "wohnflaeche", "vorschlagVersSumme", "versSumme" })
@IpsAssociations({ "HausratGrunddeckung" })
@IpsConfiguredBy(HausratProdukt.class)
@IpsDocumented(bundleName = "org.faktorips.schulung.hausratmodell.model-label-and-descriptions", defaultLocale = "en")
public class HausratVertrag extends AbstractModelObject
		implements IDeltaSupport, ICopySupport, IVisitorSupport, IConfigurableModelObject {

	/**
	 * Die maximale Multiplizitaet der Beziehung mit dem Rollennamen
	 * HausratGrunddeckung.
	 *
	 * @since 0.0.1
	 *
	 * @generated
	 */
	public static final IntegerRange MAX_MULTIPLICITY_OF_HAUSRAT_GRUNDDECKUNG = IntegerRange.valueOf(1, 1);
	/**
	 * Diese Konstante enthaelt den Namen der Beziehung hausratGrunddeckung.
	 *
	 * @since 0.0.1
	 *
	 * @generated
	 */
	public static final String ASSOCIATION_HAUSRAT_GRUNDDECKUNG = "hausratGrunddeckung";
	/**
	 * Diese Konstante enthaelt den Namen der Eigenschaft zahlweise.
	 *
	 * @since 0.0.1
	 *
	 * @generated
	 */
	public static final String PROPERTY_ZAHLWEISE = "zahlweise";
	/**
	 * Gibt die maximal erlaubten Werte fuer die Eigenschaft zahlweise zurueck.
	 *
	 * @since 0.0.1
	 *
	 * @generated
	 */
	public static final OrderedValueSet<Integer> MAX_ALLOWED_VALUES_FOR_ZAHLWEISE = new OrderedValueSet<>(false, null,
			Integer.valueOf(1), Integer.valueOf(2), Integer.valueOf(4), Integer.valueOf(12));
	/**
	 * Gibt den Vorgabewert des Attributs zahlweise zurück.
	 *
	 * @since 0.0.1
	 *
	 * @generated
	 */
	@IpsDefaultValue("zahlweise")
	public static final Integer DEFAULT_VALUE_FOR_ZAHLWEISE = null;
	/**
	 * Diese Konstante enthaelt den Namen der Eigenschaft plz.
	 *
	 * @since 0.0.1
	 *
	 * @generated
	 */
	public static final String PROPERTY_PLZ = "plz";
	/**
	 * Gibt die maximal erlaubten Werte fuer die Eigenschaft plz zurueck.
	 *
	 * @since 0.0.1
	 *
	 * @generated
	 */
	public static final ValueSet<String> MAX_ALLOWED_STRING_LENGTH_FOR_PLZ = new StringLengthValueSet(5, false);
	/**
	 * Gibt den Vorgabewert des Attributs plz zurück.
	 *
	 * @since 0.0.1
	 *
	 * @generated
	 */
	@IpsDefaultValue("plz")
	public static final String DEFAULT_VALUE_FOR_PLZ = null;
	/**
	 * Diese Konstante enthaelt den Namen der Eigenschaft tarifzone.
	 *
	 * @since 0.0.1
	 *
	 * @generated
	 */
	public static final String PROPERTY_TARIFZONE = "tarifzone";
	/**
	 * Gibt die maximal erlaubten Werte fuer die Eigenschaft tarifzone zurueck.
	 *
	 * @since 0.0.1
	 *
	 * @generated
	 */
	public static final ValueSet<String> MAX_ALLOWED_VALUES_FOR_TARIFZONE = new UnrestrictedValueSet<>(true);
	/**
	 * Diese Konstante enthaelt den Namen der Eigenschaft wohnflaeche.
	 *
	 * @since 0.0.1
	 *
	 * @generated
	 */
	public static final String PROPERTY_WOHNFLAECHE = "wohnflaeche";
	/**
	 * Gibt den maximal erlaubten Wertebereich fuer die Eigenschaft wohnflaeche
	 * zurueck.
	 *
	 * @since 0.0.1
	 *
	 * @generated
	 */
	public static final IntegerRange MAX_ALLOWED_RANGE_FOR_WOHNFLAECHE = IntegerRange.valueOf(Integer.valueOf("0"),
			(Integer) null, (Integer) null, false);
	/**
	 * Gibt den Vorgabewert des Attributs wohnflaeche zurück.
	 *
	 * @since 0.0.1
	 *
	 * @generated
	 */
	@IpsDefaultValue("wohnflaeche")
	public static final Integer DEFAULT_VALUE_FOR_WOHNFLAECHE = null;
	/**
	 * Diese Konstante enthaelt den Namen der Eigenschaft vorschlagVersSumme.
	 *
	 * @since 0.0.1
	 *
	 * @generated
	 */
	public static final String PROPERTY_VORSCHLAGVERSSUMME = "vorschlagVersSumme";
	/**
	 * Gibt die maximal erlaubten Werte fuer die Eigenschaft vorschlagVersSumme
	 * zurueck.
	 *
	 * @since 0.0.1
	 *
	 * @generated
	 */
	public static final ValueSet<Money> MAX_ALLOWED_VALUES_FOR_VORSCHLAG_VERS_SUMME = new UnrestrictedValueSet<>(true);
	/**
	 * Diese Konstante enthaelt den Namen der Eigenschaft versSumme.
	 *
	 * @since 0.0.1
	 *
	 * @generated
	 */
	public static final String PROPERTY_VERSSUMME = "versSumme";
	/**
	 * Gibt den maximal erlaubten Wertebereich fuer die Eigenschaft versSumme
	 * zurueck.
	 *
	 * @since 0.0.1
	 *
	 * @generated
	 */
	public static final MoneyRange MAX_ALLOWED_RANGE_FOR_VERS_SUMME = MoneyRange.valueOf(Money.valueOf("0.00 EUR"),
			Money.NULL, Money.NULL, false);
	/**
	 * Gibt den Vorgabewert des Attributs versSumme zurück.
	 *
	 * @since 0.0.1
	 *
	 * @generated
	 */
	@IpsDefaultValue("versSumme")
	public static final Money DEFAULT_VALUE_FOR_VERS_SUMME = Money.NULL;
	/**
	 * Membervariable fuer zahlweise.
	 *
	 * @since 0.0.1
	 *
	 * @generated
	 */
	private Integer zahlweise = DEFAULT_VALUE_FOR_ZAHLWEISE;

	/**
	 * Membervariable fuer plz.
	 *
	 * @since 0.0.1
	 *
	 * @generated
	 */
	private String plz = DEFAULT_VALUE_FOR_PLZ;

	/**
	 * Membervariable fuer wohnflaeche.
	 *
	 * @since 0.0.1
	 *
	 * @generated
	 */
	private Integer wohnflaeche = DEFAULT_VALUE_FOR_WOHNFLAECHE;

	/**
	 * Membervariable fuer versSumme.
	 *
	 * @since 0.0.1
	 *
	 * @generated
	 */
	private Money versSumme = DEFAULT_VALUE_FOR_VERS_SUMME;

	/**
	 * Haelt eine Referenz auf die aktuell eingestellte Produktkonfiguration.
	 *
	 * @generated
	 */
	private ProductConfiguration productConfiguration;
	/**
	 * Membervariable fuer die Beziehung HausratGrunddeckung.
	 *
	 * @since 0.0.1
	 *
	 * @generated
	 */
	private HausratGrunddeckung hausratGrunddeckung = null;

	/**
	 * Erzeugt eine neue Instanz von HausratVertrag.
	 *
	 * @since 0.0.1
	 *
	 * @generated
	 */
	@IpsGenerated
	public HausratVertrag() {
		super();
		productConfiguration = new ProductConfiguration();
	}

	/**
	 * Erzeugt eine neue Instanz von HausratVertrag.
	 *
	 * @since 0.0.1
	 *
	 * @generated
	 */
	@IpsGenerated
	public HausratVertrag(HausratProdukt productCmpt) {
		super();
		productConfiguration = new ProductConfiguration(productCmpt);
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
	public ValueSet<Integer> getAllowedValuesForZahlweise() {
		return getHausratProdukt().getAllowedValuesForZahlweise();
	}

	/**
	 * Gibt den Wert des Attributs zahlweise zurueck.
	 *
	 * @since 0.0.1
	 *
	 * @generated
	 */
	@IpsAttribute(name = "zahlweise", kind = AttributeKind.CHANGEABLE, valueSetKind = ValueSetKind.Enum)
	@IpsConfiguredAttribute(changingOverTime = false)
	@IpsGenerated
	public Integer getZahlweise() {
		return zahlweise;
	}

	/**
	 * Setzt den Wert des Attributs zahlweise.
	 *
	 * @since 0.0.1
	 *
	 * @generated
	 */
	@IpsAttributeSetter("zahlweise")
	@IpsGenerated
	public void setZahlweise(Integer newValue) {
		this.zahlweise = newValue;
	}

	/**
	 * Gibt den erlaubten Wertebereich fuer das Attribut plz zurueck.
	 *
	 * @since 0.0.1
	 *
	 * @generated
	 */
	@IpsAllowedValues("plz")
	@IpsGenerated
	public ValueSet<String> getAllowedValuesForPlz() {
		return MAX_ALLOWED_STRING_LENGTH_FOR_PLZ;
	}

	/**
	 * Gibt den Wert des Attributs plz zurueck.
	 *
	 * @since 0.0.1
	 *
	 * @generated
	 */
	@IpsAttribute(name = "plz", kind = AttributeKind.CHANGEABLE, valueSetKind = ValueSetKind.AllValues)
	@IpsGenerated
	public String getPlz() {
		return plz;
	}

	/**
	 * Setzt den Wert des Attributs plz.
	 *
	 * @since 0.0.1
	 *
	 * @generated
	 */
	@IpsAttributeSetter("plz")
	@IpsGenerated
	public void setPlz(String newValue) {
		this.plz = newValue;
	}

	/**
	 * Gibt den erlaubten Wertebereich fuer das Attribut tarifzone zurueck.
	 *
	 * @since 0.0.1
	 *
	 * @generated
	 */
	@IpsAllowedValues("tarifzone")
	@IpsGenerated
	public ValueSet<String> getAllowedValuesForTarifzone() {
		return MAX_ALLOWED_VALUES_FOR_TARIFZONE;
	}

	/**
	 * Gibt den Wert des Attributs tarifzone zurueck.
	 *
	 * @since 0.0.1
	 *
	 * @restrainedmodifiable
	 */
	@IpsAttribute(name = "tarifzone", kind = AttributeKind.DERIVED_ON_THE_FLY, valueSetKind = ValueSetKind.AllValues)
	@IpsGenerated
	public String getTarifzone() {
		// begin-user-code
		return "I";
		// end-user-code
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
		return getHausratProdukt().getAllowedValuesForWohnflaeche();
	}

	/**
	 * Gibt den Wert des Attributs wohnflaeche zurueck.
	 *
	 * @since 0.0.1
	 *
	 * @generated
	 */
	@IpsAttribute(name = "wohnflaeche", kind = AttributeKind.CHANGEABLE, valueSetKind = ValueSetKind.Range)
	@IpsConfiguredAttribute(changingOverTime = false)
	@IpsGenerated
	public Integer getWohnflaeche() {
		return wohnflaeche;
	}

	/**
	 * Setzt den Wert des Attributs wohnflaeche.
	 *
	 * @since 0.0.1
	 *
	 * @generated
	 */
	@IpsAttributeSetter("wohnflaeche")
	@IpsGenerated
	public void setWohnflaeche(Integer newValue) {
		this.wohnflaeche = newValue;
	}

	/**
	 * Gibt den erlaubten Wertebereich fuer das Attribut vorschlagVersSumme zurueck.
	 *
	 * @since 0.0.1
	 *
	 * @generated
	 */
	@IpsAllowedValues("vorschlagVersSumme")
	@IpsGenerated
	public ValueSet<Money> getAllowedValuesForVorschlagVersSumme() {
		return MAX_ALLOWED_VALUES_FOR_VORSCHLAG_VERS_SUMME;
	}

	/**
	 * Gibt den Wert des Attributs vorschlagVersSumme zurueck.
	 *
	 * @since 0.0.1
	 *
	 * @restrainedmodifiable
	 */
	@IpsAttribute(name = "vorschlagVersSumme", kind = AttributeKind.DERIVED_ON_THE_FLY, valueSetKind = ValueSetKind.AllValues)
	@IpsGenerated
	public Money getVorschlagVersSumme() {
		// begin-user-code
		return getHausratProdukt().getVorschlagVersSummeProQm().multiply(wohnflaeche);
		// end-user-code
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
		return getHausratProdukt().getAllowedValuesForVersSumme();
	}

	/**
	 * Gibt den Wert des Attributs versSumme zurueck.
	 *
	 * @since 0.0.1
	 *
	 * @generated
	 */
	@IpsAttribute(name = "versSumme", kind = AttributeKind.CHANGEABLE, valueSetKind = ValueSetKind.Range)
	@IpsConfiguredAttribute(changingOverTime = false)
	@IpsGenerated
	public Money getVersSumme() {
		return versSumme;
	}

	/**
	 * Setzt den Wert des Attributs versSumme.
	 *
	 * @since 0.0.1
	 *
	 * @generated
	 */
	@IpsAttributeSetter("versSumme")
	@IpsGenerated
	public void setVersSumme(Money newValue) {
		this.versSumme = newValue;
	}

	/**
	 * Gibt das referenzierte HausratGrunddeckung-Objekt zurueck.
	 *
	 * @since 0.0.1
	 *
	 * @generated
	 */
	@IpsAssociation(name = "HausratGrunddeckung", pluralName = "", kind = AssociationKind.Composition, targetClass = HausratGrunddeckung.class, min = 1, max = 1)
	@IpsMatchingAssociation(source = HausratProdukt.class, name = "HausratGrunddeckungstyp")
	@IpsInverseAssociation("HausratVertrag")
	@IpsGenerated
	public HausratGrunddeckung getHausratGrunddeckung() {
		return hausratGrunddeckung;
	}

	/**
	 * Setzt das uebergebene Objekt in der Beziehung HausratGrunddeckung.
	 *
	 * @throws ClassCastException Wenn die Beziehung eingeschränkt wurde und das
	 *                            uebergebene Objekt nicht vom passenden Typ ist.
	 *
	 * @since 0.0.1
	 *
	 * @generated
	 */
	@IpsAssociationAdder(association = "HausratGrunddeckung")
	@IpsGenerated
	public void setHausratGrunddeckung(HausratGrunddeckung newObject) {
		if (hausratGrunddeckung != null) {
			hausratGrunddeckung.setHausratVertragInternal(null);
		}
		if (newObject != null) {
			newObject.setHausratVertragInternal(this);
		}
		hausratGrunddeckung = newObject;
	}

	/**
	 * Erzeugt ein neues HausratGrunddeckung-Objekt und fuegt es zu diesem Objekt in
	 * der Rolle HausratGrunddeckung hinzu.
	 *
	 * @since 0.0.1
	 *
	 * @generated
	 */
	@IpsGenerated
	public HausratGrunddeckung newHausratGrunddeckung() {
		HausratGrunddeckung newHausratGrunddeckung = new HausratGrunddeckung();
		setHausratGrunddeckung(newHausratGrunddeckung);
		newHausratGrunddeckung.initialize();
		return newHausratGrunddeckung;
	}

	/**
	 * Erzeugt ein neues HausratGrunddeckung-Objekt und fuegt es zu diesem Objekt in
	 * der Rolle HausratGrunddeckung hinzu.
	 *
	 * @param hausratGrunddeckungstyp Der Produktbaustein, auf dem das neue Objekt
	 *                                basiert.
	 *
	 * @since 0.0.1
	 *
	 * @generated
	 */
	@IpsGenerated
	public HausratGrunddeckung newHausratGrunddeckung(HausratGrunddeckungstyp hausratGrunddeckungstyp) {
		if (hausratGrunddeckungstyp == null) {
			return newHausratGrunddeckung();
		}
		HausratGrunddeckung newHausratGrunddeckung = hausratGrunddeckungstyp.createHausratGrunddeckung();
		setHausratGrunddeckung(newHausratGrunddeckung);
		newHausratGrunddeckung.initialize();
		return newHausratGrunddeckung;
	}

	/**
	 * Initialisiert Attribute mit ihren Vorgabewerten.
	 *
	 * @restrainedmodifiable
	 */
	@Override
	@IpsGenerated
	public void initialize() {
		if (getHausratProdukt() != null) {
			setZahlweise(getHausratProdukt().getDefaultValueZahlweise());
			setWohnflaeche(getHausratProdukt().getDefaultValueWohnflaeche());
			setVersSumme(getHausratProdukt().getDefaultValueVersSumme());
		}
		// begin-user-code
		// end-user-code
	}

	/**
	 * Gibt HausratProdukt zurueck, welches HausratVertrag konfiguriert.
	 *
	 * @generated
	 */
	@IpsGenerated
	public HausratProdukt getHausratProdukt() {
		return (HausratProdukt) getProductComponent();
	}

	/**
	 * Setzt neuen HausratProdukt.
	 *
	 * @param hausratProdukt                         Der neue HausratProdukt.
	 * @param initPropertiesWithConfiguratedDefaults <code>true</code> falls die
	 *                                               Eigenschaften mit den
	 *                                               Defaultwerten aus
	 *                                               HausratProdukt belegt werden
	 *                                               sollen.
	 *
	 * @generated
	 */
	@IpsGenerated
	public void setHausratProdukt(HausratProdukt hausratProdukt, boolean initPropertiesWithConfiguratedDefaults) {
		setProductComponent(hausratProdukt);
		if (initPropertiesWithConfiguratedDefaults) {
			initialize();
		}
	}

	/**
	 * {@inheritDoc}
	 *
	 * @generated
	 */
	@Override
	@IpsGenerated
	public IProductComponent getProductComponent() {
		return productConfiguration.getProductComponent();
	}

	/**
	 * Setzt die aktuelle ProductComponent.
	 *
	 * @generated
	 */
	@Override
	@IpsGenerated
	public void setProductComponent(IProductComponent productComponent) {
		productConfiguration.setProductComponent(productComponent);
	}

	/**
	 * Diese Methode wird aufgerufen, wenn sich das Wirksamkeitsdatum aendert und
	 * somit die Referenz zur aktuellen Anpassungsstufe nicht mehr gilt. Wenn dieser
	 * Vertragsteil andere Kindkomponenten enthaelt, entfernt diese Methode
	 * ebenfalls die Referenz zur deren Anpassungsstufe.
	 * <p>
	 * Die Anpassungsstufe wird nur entfernt, wenn ein neues Wirksamkeitsdatum
	 * existiert. Wenn {@link #getEffectiveFromAsCalendar()} <code>null</code>
	 * zurueck liefert, wird die Anpassungsstuffe nicht entfernt. Z.B wenn dieses
	 * Model-Objekt von seinem Elternteil entfernt wurde.
	 * <p>
	 * Ableitungen koennen das Verhalten durch Ueberschreiben der Methode
	 * {@link #resetProductCmptGenerationAfterEffectiveFromHasChanged()} aendern.
	 *
	 * @generated
	 */
	@IpsGenerated
	public void effectiveFromHasChanged() {
		if (getEffectiveFromAsCalendar() != null) {
			resetProductCmptGenerationAfterEffectiveFromHasChanged();
		}
		if (hausratGrunddeckung != null) {
			hausratGrunddeckung.effectiveFromHasChanged();
		}
	}

	/**
	 * Setzt die ProductComponentGeneration zurueck.
	 * <p>
	 * Die Methode kann ueberschrieben werden, um das Verhalten bei Aenderung des
	 * Wirksamkeitsdatums zu beeinflussen.
	 *
	 * @generated
	 */
	@IpsGenerated
	protected void resetProductCmptGenerationAfterEffectiveFromHasChanged() {
		productConfiguration.resetProductCmptGeneration();
	}

	/**
	 * {@inheritDoc}
	 *
	 * @generated
	 */
	@Override
	@IpsGenerated
	public Calendar getEffectiveFromAsCalendar() {
		// TODO Implementieren des Zugriffs auf das Wirksamkeitsdatum (wird benoetigt um
		// auf die gueltigen Produktdaten zuzugreifen).
		// Damit diese Methode bei erneutem Generieren nicht neu ueberschrieben wird,
		// muss im Javadoc ein NOT hinter @generated geschrieben werden!
		return null;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @generated
	 */
	@Override
	@IpsGenerated
	protected void initFromXml(Element objectEl, boolean initWithProductDefaultsBeforeReadingXmlData,
			IRuntimeRepository productRepository, IObjectReferenceStore store, XmlCallback xmlCallback,
			String currPath) {
		productConfiguration.initFromXml(objectEl, productRepository);
		if (initWithProductDefaultsBeforeReadingXmlData) {
			initialize();
		}
		super.initFromXml(objectEl, initWithProductDefaultsBeforeReadingXmlData, productRepository, store, xmlCallback,
				currPath);
	}

	/**
	 * {@inheritDoc}
	 *
	 * @generated
	 */
	@Override
	@IpsGenerated
	protected void initPropertiesFromXml(Map<String, String> propMap, IRuntimeRepository productRepository) {
		super.initPropertiesFromXml(propMap, productRepository);
		doInitZahlweise(propMap);
		doInitPlz(propMap);
		doInitWohnflaeche(propMap);
		doInitVersSumme(propMap);
	}

	/**
	 * @generated
	 */
	@IpsGenerated
	private void doInitZahlweise(Map<String, String> propMap) {
		if (propMap.containsKey(PROPERTY_ZAHLWEISE)) {
			this.zahlweise = IpsStringUtils.isEmpty(propMap.get(PROPERTY_ZAHLWEISE)) ? null
					: Integer.valueOf(propMap.get(PROPERTY_ZAHLWEISE));
		}
	}

	/**
	 * @generated
	 */
	@IpsGenerated
	private void doInitPlz(Map<String, String> propMap) {
		if (propMap.containsKey(PROPERTY_PLZ)) {
			this.plz = propMap.get(PROPERTY_PLZ);
		}
	}

	/**
	 * @generated
	 */
	@IpsGenerated
	private void doInitWohnflaeche(Map<String, String> propMap) {
		if (propMap.containsKey(PROPERTY_WOHNFLAECHE)) {
			this.wohnflaeche = IpsStringUtils.isEmpty(propMap.get(PROPERTY_WOHNFLAECHE)) ? null
					: Integer.valueOf(propMap.get(PROPERTY_WOHNFLAECHE));
		}
	}

	/**
	 * @generated
	 */
	@IpsGenerated
	private void doInitVersSumme(Map<String, String> propMap) {
		if (propMap.containsKey(PROPERTY_VERSSUMME)) {
			this.versSumme = Money.valueOf(propMap.get(PROPERTY_VERSSUMME));
		}
	}

	/**
	 * {@inheritDoc}
	 *
	 * @generated
	 */
	@Override
	@IpsGenerated
	protected AbstractModelObject createChildFromXml(Element childEl) {
		AbstractModelObject newChild = super.createChildFromXml(childEl);
		if (newChild != null) {
			return newChild;
		}
		if ("HausratGrunddeckung".equals(childEl.getNodeName())) {
			return doInitHausratGrunddeckung(childEl);
		}
		return null;
	}

	/**
	 * @generated
	 */
	@IpsGenerated
	private AbstractModelObject doInitHausratGrunddeckung(Element childEl) {
		String className = childEl.getAttribute("class");
		if (className.length() > 0) {
			try {
				HausratGrunddeckung hausratGrunddeckungLocalVar = (HausratGrunddeckung) Class.forName(className)
						.getConstructor().newInstance();
				setHausratGrunddeckung(hausratGrunddeckungLocalVar);
				return hausratGrunddeckungLocalVar;
			} catch (Exception e) {
				throw new RuntimeException(e);
			}
		}
		return newHausratGrunddeckung();
	}

	/**
	 * {@inheritDoc}
	 *
	 * @generated
	 */
	@Override
	@IpsGenerated
	public IModelObjectDelta computeDelta(IModelObject otherObject, IDeltaComputationOptions options) {
		ModelObjectDelta delta = ModelObjectDelta.newDelta(this, otherObject, options);
		if (!HausratVertrag.class.isAssignableFrom(otherObject.getClass())) {
			return delta;
		}
		HausratVertrag otherHausratVertrag = (HausratVertrag) otherObject;
		delta.checkPropertyChange(HausratVertrag.PROPERTY_ZAHLWEISE, zahlweise, otherHausratVertrag.zahlweise, options);
		delta.checkPropertyChange(HausratVertrag.PROPERTY_PLZ, plz, otherHausratVertrag.plz, options);
		delta.checkPropertyChange(HausratVertrag.PROPERTY_WOHNFLAECHE, wohnflaeche, otherHausratVertrag.wohnflaeche,
				options);
		delta.checkPropertyChange(HausratVertrag.PROPERTY_VERSSUMME, versSumme, otherHausratVertrag.versSumme, options);
		ModelObjectDelta.createChildDeltas(delta, hausratGrunddeckung, otherHausratVertrag.hausratGrunddeckung,
				ASSOCIATION_HAUSRAT_GRUNDDECKUNG, options);
		return delta;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @generated
	 */
	@Override
	@IpsGenerated
	public HausratVertrag newCopy() {
		Map<IModelObject, IModelObject> copyMap = new HashMap<>();
		HausratVertrag newCopy = newCopyInternal(copyMap);
		copyAssociationsInternal(newCopy, copyMap);
		return newCopy;
	}

	/**
	 * Interne Kopiermethode mit einer {@link Map} der bisher kopierten Instanzen
	 *
	 * @param copyMap die Map enthaelt die bisher kopierten Instanzen.
	 *
	 * @generated
	 */
	@IpsGenerated
	public HausratVertrag newCopyInternal(Map<IModelObject, IModelObject> copyMap) {
		HausratVertrag newCopy = (HausratVertrag) copyMap.get(this);
		if (newCopy == null) {
			newCopy = new HausratVertrag();
			copyMap.put(this, newCopy);
			newCopy.copyProductCmptAndGenerationInternal(this);
			copyProperties(newCopy, copyMap);
		}
		return newCopy;
	}

	/**
	 * Kopiert den Produktbaustein und die Generation aus dem referenzierten Objekt.
	 *
	 * @generated
	 */
	@IpsGenerated
	protected void copyProductCmptAndGenerationInternal(HausratVertrag otherObject) {
		productConfiguration.copy(otherObject.productConfiguration);
	}

	/**
	 * Diese Methode setzt alle Werte in der Kopie (copy) auf die Werte aus diesem
	 * Objekt. Kopierte Assoziationen werden in {@link #newCopyInternal(Map)} zur
	 * copyMap hinzugefügt.
	 *
	 * @param copy    Das kopierte Object
	 * @param copyMap Eine Map mit kopierten assoziierten Objekten
	 *
	 * @generated
	 */
	@IpsGenerated
	protected void copyProperties(IModelObject copy, Map<IModelObject, IModelObject> copyMap) {
		HausratVertrag concreteCopy = (HausratVertrag) copy;
		concreteCopy.zahlweise = zahlweise;
		concreteCopy.plz = plz;
		concreteCopy.wohnflaeche = wohnflaeche;
		concreteCopy.versSumme = versSumme;
		if (hausratGrunddeckung != null) {
			concreteCopy.hausratGrunddeckung = hausratGrunddeckung.newCopyInternal(copyMap);
			concreteCopy.hausratGrunddeckung.setHausratVertragInternal(concreteCopy);
		}
	}

	/**
	 * Interne Methode zum Setzen kopierter Assoziationen. Wenn das Ziel der
	 * Assoziation kopiert wurde, wird die Assoziation auf die neue Kopie gesetzt,
	 * ansonsten bleibt die Assoziation unveraendert. Die Methode ruft ausserdem
	 * {@link #copyAssociationsInternal(IModelObject, Map)} in allen durch
	 * Komposition verknuepften Instanzen auf.
	 *
	 * @param abstractCopy die Kopie dieser PolicyCmpt
	 * @param copyMap      die Map mit den kopierten Instanzen
	 *
	 * @generated
	 */
	@IpsGenerated
	public void copyAssociationsInternal(IModelObject abstractCopy, Map<IModelObject, IModelObject> copyMap) {
		if (hausratGrunddeckung != null) {
			HausratGrunddeckung copyHausratGrunddeckung = (HausratGrunddeckung) copyMap.get(hausratGrunddeckung);
			hausratGrunddeckung.copyAssociationsInternal(copyHausratGrunddeckung, copyMap);
		}
	}

	/**
	 * {@inheritDoc}
	 *
	 * @generated
	 */
	@Override
	@IpsGenerated
	public boolean accept(IModelObjectVisitor visitor) {
		if (!visitor.visit(this)) {
			return false;
		}
		if (hausratGrunddeckung != null) {
			hausratGrunddeckung.accept(visitor);
		}
		return true;
	}

	/**
	 * Validierung von Objekten der Klasse HausratVertrag. Gibt <code>true</code>
	 * zurueck, wenn dieses Objekt mit der Validierung fortfahren soll,
	 * <code>false</code> sonst.
	 *
	 * @generated
	 */
	@Override
	@IpsGenerated
	public boolean validateSelf(MessageList ml, IValidationContext context) {
		if (!super.validateSelf(ml, context)) {
			return STOP_VALIDATION;
		}
		return CONTINUE_VALIDATION;
	}

	/**
	 * Validierung von abhaengigen Objekten fuer Instanzen der Klasse
	 * HausratVertrag.
	 *
	 * @generated
	 */
	@Override
	@IpsGenerated
	public void validateDependants(MessageList ml, IValidationContext context) {
		super.validateDependants(ml, context);
		if (hausratGrunddeckung != null) {
			ml.add(hausratGrunddeckung.validate(context));
		}
	}

	/**
	 * @restrainedmodifiable
	 */
	@Override
	@IpsGenerated
	public String toString() {
		// begin-user-code
		return getProductComponent() == null ? getClass().getSimpleName()
				: getClass().getSimpleName() + '[' + getProductComponent().toString() + ']';
		// end-user-code
	}

}

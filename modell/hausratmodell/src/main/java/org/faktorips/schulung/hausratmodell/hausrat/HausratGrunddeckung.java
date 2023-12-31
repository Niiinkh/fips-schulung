package org.faktorips.schulung.hausratmodell.hausrat;

import org.faktorips.runtime.model.annotation.IpsPolicyCmptType;
import org.faktorips.runtime.model.annotation.IpsAttributes;
import org.faktorips.runtime.model.annotation.IpsAssociations;
import org.faktorips.runtime.model.annotation.IpsConfiguredBy;
import org.faktorips.runtime.model.annotation.IpsDocumented;
import org.faktorips.runtime.internal.AbstractModelObject;
import org.faktorips.runtime.IDeltaSupport;
import org.faktorips.runtime.ICopySupport;
import org.faktorips.runtime.IVisitorSupport;
import org.faktorips.runtime.IDependantObject;
import org.faktorips.runtime.IConfigurableModelObject;
import org.faktorips.valueset.ValueSet;
import org.faktorips.values.Money;
import org.faktorips.valueset.UnrestrictedValueSet;
import org.faktorips.runtime.model.annotation.IpsDefaultValue;
import org.faktorips.runtime.internal.ProductConfiguration;
import org.faktorips.runtime.model.annotation.IpsAllowedValues;
import org.faktorips.runtime.model.annotation.IpsAttribute;
import org.faktorips.runtime.model.type.AttributeKind;
import org.faktorips.runtime.model.type.ValueSetKind;
import org.faktorips.runtime.model.annotation.IpsAssociation;
import org.faktorips.runtime.model.type.AssociationKind;
import org.faktorips.runtime.model.annotation.IpsInverseAssociation;
import org.faktorips.runtime.model.annotation.IpsAssociationAdder;
import org.w3c.dom.Element;
import org.faktorips.runtime.IModelObjectDelta;
import org.faktorips.runtime.IModelObject;
import org.faktorips.runtime.IProductComponent;

import java.math.RoundingMode;
import java.util.Calendar;
import org.faktorips.runtime.IRuntimeRepository;
import org.faktorips.runtime.IObjectReferenceStore;
import org.faktorips.runtime.internal.XmlCallback;
import org.faktorips.runtime.IDeltaComputationOptions;
import org.faktorips.runtime.internal.ModelObjectDelta;
import java.util.Map;
import java.util.HashMap;
import org.faktorips.runtime.IModelObjectVisitor;
import org.faktorips.runtime.MessageList;
import org.faktorips.runtime.IValidationContext;
import org.faktorips.runtime.annotation.IpsGenerated;

/**
 * Implementierung von HausratGrunddeckung.
 *
 * @since 0.0.1
 *
 * @generated
 */
@IpsPolicyCmptType(name = "hausrat.HausratGrunddeckung")
@IpsAttributes({ "jahresbasisbeitrag", "beitragGemaesZahlweise" })
@IpsAssociations({ "HausratVertrag" })
@IpsConfiguredBy(HausratGrunddeckungstyp.class)
@IpsDocumented(bundleName = "org.faktorips.schulung.hausratmodell.model-label-and-descriptions", defaultLocale = "de")
public class HausratGrunddeckung extends AbstractModelObject
		implements IDeltaSupport, ICopySupport, IVisitorSupport, IDependantObject, IConfigurableModelObject {

	/**
	 * Diese Konstante enthaelt den Namen der Beziehung hausratVertrag.
	 *
	 * @since 0.0.1
	 *
	 * @generated
	 */
	public static final String ASSOCIATION_HAUSRAT_VERTRAG = "hausratVertrag";
	/**
	 * Diese Konstante enthaelt den Namen der Eigenschaft jahresbasisbeitrag.
	 *
	 * @since 0.0.1
	 *
	 * @generated
	 */
	public static final String PROPERTY_JAHRESBASISBEITRAG = "jahresbasisbeitrag";
	/**
	 * Gibt die maximal erlaubten Werte fuer die Eigenschaft jahresbasisbeitrag
	 * zurueck.
	 *
	 * @since 0.0.1
	 *
	 * @generated
	 */
	public static final ValueSet<Money> MAX_ALLOWED_VALUES_FOR_JAHRESBASISBEITRAG = new UnrestrictedValueSet<>(true);
	/**
	 * Gibt den Vorgabewert des Attributs jahresbasisbeitrag zurück.
	 *
	 * @since 0.0.1
	 *
	 * @generated
	 */
	@IpsDefaultValue("jahresbasisbeitrag")
	public static final Money DEFAULT_VALUE_FOR_JAHRESBASISBEITRAG = Money.NULL;
	/**
	 * Diese Konstante enthaelt den Namen der Eigenschaft beitragGemaesZahlweise.
	 *
	 * @since 0.0.1
	 *
	 * @generated
	 */
	public static final String PROPERTY_BEITRAGGEMAESZAHLWEISE = "beitragGemaesZahlweise";
	/**
	 * Gibt die maximal erlaubten Werte fuer die Eigenschaft beitragGemaesZahlweise
	 * zurueck.
	 *
	 * @since 0.0.1
	 *
	 * @generated
	 */
	public static final ValueSet<Money> MAX_ALLOWED_VALUES_FOR_BEITRAG_GEMAES_ZAHLWEISE = new UnrestrictedValueSet<>(
			true);
	/**
	 * Membervariable fuer jahresbasisbeitrag.
	 *
	 * @since 0.0.1
	 *
	 * @generated
	 */
	private Money jahresbasisbeitrag = DEFAULT_VALUE_FOR_JAHRESBASISBEITRAG;
	/**
	 * Haelt eine Referenz auf die aktuell eingestellte Produktkonfiguration.
	 *
	 * @generated
	 */
	private ProductConfiguration productConfiguration;
	/**
	 * Membervariable fuer das Parent-Objekt: HausratVertrag.
	 *
	 * @since 0.0.1
	 *
	 * @generated
	 */
	private HausratVertrag hausratVertrag;

	/**
	 * Erzeugt eine neue Instanz von HausratGrunddeckung.
	 *
	 * @since 0.0.1
	 *
	 * @generated
	 */
	@IpsGenerated
	public HausratGrunddeckung() {
		super();
		productConfiguration = new ProductConfiguration();
	}

	/**
	 * Erzeugt eine neue Instanz von HausratGrunddeckung.
	 *
	 * @since 0.0.1
	 *
	 * @generated
	 */
	@IpsGenerated
	public HausratGrunddeckung(HausratGrunddeckungstyp productCmpt) {
		super();
		productConfiguration = new ProductConfiguration(productCmpt);
	}

	/**
	 * Gibt den erlaubten Wertebereich fuer das Attribut jahresbasisbeitrag zurueck.
	 *
	 * @since 0.0.1
	 *
	 * @generated
	 */
	@IpsAllowedValues("jahresbasisbeitrag")
	@IpsGenerated
	public ValueSet<Money> getAllowedValuesForJahresbasisbeitrag() {
		return MAX_ALLOWED_VALUES_FOR_JAHRESBASISBEITRAG;
	}

	/**
	 * Gibt den Wert des Attributs jahresbasisbeitrag zurueck.
	 *
	 * @since 0.0.1
	 *
	 * @generated
	 */
	@IpsAttribute(name = "jahresbasisbeitrag", kind = AttributeKind.DERIVED_BY_EXPLICIT_METHOD_CALL, valueSetKind = ValueSetKind.AllValues)
	@IpsGenerated
	public Money getJahresbasisbeitrag() {
		return jahresbasisbeitrag;
	}

	/**
	 * Gibt den erlaubten Wertebereich fuer das Attribut beitragGemaesZahlweise
	 * zurueck.
	 *
	 * @since 0.0.1
	 *
	 * @generated
	 */
	@IpsAllowedValues("beitragGemaesZahlweise")
	@IpsGenerated
	public ValueSet<Money> getAllowedValuesForBeitragGemaesZahlweise() {
		return MAX_ALLOWED_VALUES_FOR_BEITRAG_GEMAES_ZAHLWEISE;
	}

	/**
	 * Gibt den Wert des Attributs beitragGemaesZahlweise zurueck.
	 *
	 * @since 0.0.1
	 *
	 * @restrainedmodifiable
	 */
	@IpsAttribute(name = "beitragGemaesZahlweise", kind = AttributeKind.DERIVED_ON_THE_FLY, valueSetKind = ValueSetKind.AllValues)
	@IpsGenerated
	public Money getBeitragGemaesZahlweise() {
		// begin-user-code
		Zahlweise zahlweise = hausratVertrag.getZahlweise();
		if (jahresbasisbeitrag == null || zahlweise == null) {
			return Money.NULL;
		}
		if (zahlweise == Zahlweise.EINMALZAHLUNG) {
			return Money.NULL;
		}
		return jahresbasisbeitrag.divide(zahlweise.getId(), RoundingMode.HALF_DOWN);
		// end-user-code
	}

	/**
	 * Gibt das referenzierte HausratVertrag-Objekt zurueck.
	 *
	 * @since 0.0.1
	 *
	 * @generated
	 */
	@IpsAssociation(name = "HausratVertrag", pluralName = "", kind = AssociationKind.CompositionToMaster, targetClass = HausratVertrag.class, min = 1, max = 1)
	@IpsInverseAssociation("HausratGrunddeckung")
	@IpsGenerated
	public HausratVertrag getHausratVertrag() {
		return hausratVertrag;
	}

	/**
	 * @since 0.0.1
	 *
	 * @generated
	 */
	@IpsAssociationAdder(association = "HausratVertrag")
	@IpsGenerated
	public void setHausratVertragInternal(HausratVertrag newParent) {
		if (getHausratVertrag() == newParent) {
			return;
		}
		IModelObject parent = getParentModelObject();
		if (newParent != null && parent != null) {
			throw new IllegalStateException(String.format(
					"HausratGrunddeckung (\"%s\") kann nicht dem Parent-Objekt der Klasse HausratVertrag (\"%s\") hinzugefügt werden, da das Objekt bereits dem Parent-Objekt (\"%s\") zugeordnet ist.",
					toString(), newParent.toString(), parent.toString()));
		}
		this.hausratVertrag = newParent;
		effectiveFromHasChanged();
	}

	/**
	 * @since 0.0.1
	 * 
	 * @generated NOT
	 */
	public void berechneJahresbasisbeitrag() {
		jahresbasisbeitrag = Money.NULL;
		TariftabelleHausratRow tariftabelleRow = getTariftabelle().findRow(hausratVertrag.getTarifzone());
		if (tariftabelleRow != null) {
			jahresbasisbeitrag = hausratVertrag.getVersSumme() //
					.divide(1000, RoundingMode.HALF_UP) //
					.multiply(tariftabelleRow.getBeitragssatz(), RoundingMode.HALF_UP);
		}
	}

	/**
	 * Gibt den im Produktbaustein referenzierten Tabelleninhalt der Rolle
	 * tariftabelle zurueck.
	 *
	 * @since 0.0.1
	 *
	 * @generated
	 */
	@IpsGenerated
	public TariftabelleHausrat getTariftabelle() {
		HausratGrunddeckungstyp productCmpt = getHausratGrunddeckungstyp();
		if (productCmpt == null) {
			return null;
		}
		return productCmpt.getTariftabelle();
	}

	/**
	 * Initialisiert Attribute mit ihren Vorgabewerten.
	 *
	 * @restrainedmodifiable
	 */
	@Override
	@IpsGenerated
	public void initialize() {
		// begin-user-code
		// end-user-code
	}

	/**
	 * Gibt HausratGrunddeckungstyp zurueck, welches HausratGrunddeckung
	 * konfiguriert.
	 *
	 * @generated
	 */
	@IpsGenerated
	public HausratGrunddeckungstyp getHausratGrunddeckungstyp() {
		return (HausratGrunddeckungstyp) getProductComponent();
	}

	/**
	 * Setzt neuen HausratGrunddeckungstyp.
	 *
	 * @param hausratGrunddeckungstyp                Der neue
	 *                                               HausratGrunddeckungstyp.
	 * @param initPropertiesWithConfiguratedDefaults <code>true</code> falls die
	 *                                               Eigenschaften mit den
	 *                                               Defaultwerten aus
	 *                                               HausratGrunddeckungstyp belegt
	 *                                               werden sollen.
	 *
	 * @generated
	 */
	@IpsGenerated
	public void setHausratGrunddeckungstyp(HausratGrunddeckungstyp hausratGrunddeckungstyp,
			boolean initPropertiesWithConfiguratedDefaults) {
		setProductComponent(hausratGrunddeckungstyp);
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
		IModelObject parent = getParentModelObject();
		if (parent instanceof IConfigurableModelObject) {
			return ((IConfigurableModelObject) parent).getEffectiveFromAsCalendar();
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
	public IModelObject getParentModelObject() {
		if (hausratVertrag != null) {
			return hausratVertrag;
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
		doInitJahresbasisbeitrag(propMap);
	}

	/**
	 * @generated
	 */
	@IpsGenerated
	private void doInitJahresbasisbeitrag(Map<String, String> propMap) {
		if (propMap.containsKey(PROPERTY_JAHRESBASISBEITRAG)) {
			this.jahresbasisbeitrag = Money.valueOf(propMap.get(PROPERTY_JAHRESBASISBEITRAG));
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
		return null;
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
		if (!HausratGrunddeckung.class.isAssignableFrom(otherObject.getClass())) {
			return delta;
		}
		HausratGrunddeckung otherHausratGrunddeckung = (HausratGrunddeckung) otherObject;
		delta.checkPropertyChange(HausratGrunddeckung.PROPERTY_JAHRESBASISBEITRAG, jahresbasisbeitrag,
				otherHausratGrunddeckung.jahresbasisbeitrag, options);
		return delta;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @generated
	 */
	@Override
	@IpsGenerated
	public HausratGrunddeckung newCopy() {
		Map<IModelObject, IModelObject> copyMap = new HashMap<>();
		HausratGrunddeckung newCopy = newCopyInternal(copyMap);
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
	public HausratGrunddeckung newCopyInternal(Map<IModelObject, IModelObject> copyMap) {
		HausratGrunddeckung newCopy = (HausratGrunddeckung) copyMap.get(this);
		if (newCopy == null) {
			newCopy = new HausratGrunddeckung();
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
	protected void copyProductCmptAndGenerationInternal(HausratGrunddeckung otherObject) {
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
		HausratGrunddeckung concreteCopy = (HausratGrunddeckung) copy;
		concreteCopy.jahresbasisbeitrag = jahresbasisbeitrag;
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
		// Keine Implementierung notwendig.
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
		return true;
	}

	/**
	 * Validierung von Objekten der Klasse HausratGrunddeckung. Gibt
	 * <code>true</code> zurueck, wenn dieses Objekt mit der Validierung fortfahren
	 * soll, <code>false</code> sonst.
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
	 * HausratGrunddeckung.
	 *
	 * @generated
	 */
	@Override
	@IpsGenerated
	public void validateDependants(MessageList ml, IValidationContext context) {
		super.validateDependants(ml, context);
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

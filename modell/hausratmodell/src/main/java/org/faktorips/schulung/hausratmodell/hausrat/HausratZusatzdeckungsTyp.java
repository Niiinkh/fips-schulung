package org.faktorips.schulung.hausratmodell.hausrat;

import org.faktorips.runtime.model.annotation.IpsProductCmptType;
import org.faktorips.runtime.model.annotation.IpsAttributes;
import org.faktorips.runtime.model.annotation.IpsConfigures;
import org.faktorips.runtime.model.annotation.IpsDocumented;
import org.faktorips.runtime.internal.ProductComponent;
import org.faktorips.values.Decimal;
import org.faktorips.values.Money;
import org.faktorips.valueset.ValueSet;
import org.faktorips.runtime.IRuntimeRepository;
import org.faktorips.runtime.model.annotation.IpsAttribute;
import org.faktorips.runtime.model.type.AttributeKind;
import org.faktorips.runtime.model.type.ValueSetKind;
import org.faktorips.runtime.model.annotation.IpsAttributeSetter;
import org.faktorips.runtime.IllegalRepositoryModificationException;
import org.faktorips.runtime.model.annotation.IpsDefaultValue;
import org.faktorips.runtime.model.annotation.IpsDefaultValueSetter;
import org.faktorips.runtime.model.annotation.IpsAllowedValues;
import org.faktorips.runtime.model.annotation.IpsAllowedValuesSetter;
import org.faktorips.runtime.FormulaExecutionException;
import org.w3c.dom.Element;
import java.util.Map;
import org.faktorips.runtime.internal.ValueToXmlHelper;
import org.faktorips.runtime.internal.EnumValues;
import java.util.List;
import java.util.ArrayList;
import org.faktorips.valueset.OrderedValueSet;
import org.faktorips.runtime.internal.Range;
import org.faktorips.valueset.MoneyRange;
import org.faktorips.runtime.annotation.IpsGenerated;

/**
 * Implementierung von HausratZusatzdeckungsTyp.
 *
 * @since 0.0.1
 *
 * @generated
 */
@IpsProductCmptType(name = "hausrat.HausratZusatzdeckungsTyp")
@IpsAttributes({ "versSummenFaktor", "maximaleVersSumme" })
@IpsConfigures(HausratZusatzdeckung.class)
@IpsDocumented(bundleName = "org.faktorips.schulung.hausratmodell.model-label-and-descriptions", defaultLocale = "de")
public class HausratZusatzdeckungsTyp extends ProductComponent {

	/**
	 * Diese Konstante enthält den Namen der Eigenschaft versSummenFaktor.
	 *
	 * @since 0.0.1
	 *
	 * @generated
	 */
	public static final String PROPERTY_VERSSUMMENFAKTOR = "versSummenFaktor";
	/**
	 * Diese Konstante enthält den Namen der Eigenschaft maximaleVersSumme.
	 *
	 * @since 0.0.1
	 *
	 * @generated
	 */
	public static final String PROPERTY_MAXIMALEVERSSUMME = "maximaleVersSumme";
	/**
	 * Membervariable für die Produkteigenschaft VersSummenFaktor.
	 *
	 * @since 0.0.1
	 *
	 * @generated
	 */
	private Decimal versSummenFaktor;
	/**
	 * Membervariable für die Produkteigenschaft MaximaleVersSumme.
	 *
	 * @since 0.0.1
	 *
	 * @generated
	 */
	private Money maximaleVersSumme;

	/**
	 * Membervariable fuer den Vorgabewert der Vertragseigenschaft
	 * jahresbasisbeitrag.
	 *
	 * @since 0.0.1
	 *
	 * @generated
	 */
	private Money defaultValueJahresbasisbeitrag = Money.NULL;
	/**
	 * Instanzvariable fuer die erlaubte Wertemenge des Attributs
	 * jahresbasisbeitrag.
	 *
	 * @since 0.0.1
	 *
	 * @generated
	 */
	private ValueSet<Money> setOfAllowedValuesJahresbasisbeitrag = HausratZusatzdeckung.MAX_ALLOWED_VALUES_FOR_JAHRESBASISBEITRAG;

	/**
	 * Erzeugt eine neue Instanz von HausratZusatzdeckungsTyp.
	 *
	 * @since 0.0.1
	 *
	 * @generated
	 */
	@IpsGenerated
	public HausratZusatzdeckungsTyp(IRuntimeRepository repository, String id, String kindId, String versionId) {
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
	 * Gibt den Wert der Eigenschaft versSummenFaktor zurück.
	 *
	 * @since 0.0.1
	 *
	 * @generated
	 */
	@IpsAttribute(name = "versSummenFaktor", kind = AttributeKind.CONSTANT, valueSetKind = ValueSetKind.AllValues)
	@IpsGenerated
	public Decimal getVersSummenFaktor() {
		return versSummenFaktor;
	}

	/**
	 * Setzt den Wert der Eigenschaft versSummenFaktor.
	 *
	 * @since 0.0.1
	 *
	 * @generated
	 */
	@IpsAttributeSetter("versSummenFaktor")
	@IpsGenerated
	public void setVersSummenFaktor(Decimal newValue) {
		if (getRepository() != null && !getRepository().isModifiable()) {
			throw new IllegalRepositoryModificationException();
		}
		setVersSummenFaktorInternal(newValue);
	}

	/**
	 * Setzt den Wert der Eigenschaft versSummenFaktor.
	 *
	 * @since 0.0.1
	 *
	 * @generated
	 */
	@IpsGenerated
	protected final void setVersSummenFaktorInternal(Decimal newValue) {
		this.versSummenFaktor = newValue;
	}

	/**
	 * Gibt den Wert der Eigenschaft maximaleVersSumme zurück.
	 *
	 * @since 0.0.1
	 *
	 * @generated
	 */
	@IpsAttribute(name = "maximaleVersSumme", kind = AttributeKind.CONSTANT, valueSetKind = ValueSetKind.AllValues)
	@IpsGenerated
	public Money getMaximaleVersSumme() {
		return maximaleVersSumme;
	}

	/**
	 * Setzt den Wert der Eigenschaft maximaleVersSumme.
	 *
	 * @since 0.0.1
	 *
	 * @generated
	 */
	@IpsAttributeSetter("maximaleVersSumme")
	@IpsGenerated
	public void setMaximaleVersSumme(Money newValue) {
		if (getRepository() != null && !getRepository().isModifiable()) {
			throw new IllegalRepositoryModificationException();
		}
		setMaximaleVersSummeInternal(newValue);
	}

	/**
	 * Setzt den Wert der Eigenschaft maximaleVersSumme.
	 *
	 * @since 0.0.1
	 *
	 * @generated
	 */
	@IpsGenerated
	protected final void setMaximaleVersSummeInternal(Money newValue) {
		this.maximaleVersSumme = newValue;
	}

	/**
	 * Gibt den Defaultwert fuer die Eigenschaft jahresbasisbeitrag zurueck.
	 *
	 * @since 0.0.1
	 *
	 * @generated
	 */
	@IpsDefaultValue("jahresbasisbeitrag")
	@IpsGenerated
	public Money getDefaultValueJahresbasisbeitrag() {
		return defaultValueJahresbasisbeitrag;
	}

	/**
	 * Setzt den Defaultwert fuer die Eigenschaft jahresbasisbeitrag.
	 *
	 * @since 0.0.1
	 *
	 * @generated
	 */
	@IpsDefaultValueSetter("jahresbasisbeitrag")
	@IpsGenerated
	public void setDefaultValueJahresbasisbeitrag(Money defaultValueJahresbasisbeitrag) {
		if (getRepository() != null && !getRepository().isModifiable()) {
			throw new IllegalRepositoryModificationException();
		}
		this.defaultValueJahresbasisbeitrag = defaultValueJahresbasisbeitrag;
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
		return setOfAllowedValuesJahresbasisbeitrag;
	}

	/**
	 * Setzt den erlaubten Wertebereich fuer das Attribut jahresbasisbeitrag.
	 *
	 * @throws ClassCastException wenn der Typ des Wertebereichs nicht zur
	 *                            Konfiguration des Attributs passt.
	 *
	 * @since 0.0.1
	 *
	 * @generated
	 */
	@IpsAllowedValuesSetter("jahresbasisbeitrag")
	@IpsGenerated
	public void setAllowedValuesForJahresbasisbeitrag(ValueSet<Money> setOfAllowedValuesJahresbasisbeitrag) {
		if (getRepository() != null && !getRepository().isModifiable()) {
			throw new IllegalRepositoryModificationException();
		}
		this.setOfAllowedValuesJahresbasisbeitrag = setOfAllowedValuesJahresbasisbeitrag;
	}

	/**
	 * @since 0.0.1
	 * @generated
	 */
	@IpsGenerated
	public Money computeJahresbasisbeitrag(HausratZusatzdeckung hausratZusatzdeckung) throws FormulaExecutionException {
		return (Money) getFormulaEvaluator().evaluate("computeJahresbasisbeitrag", hausratZusatzdeckung);
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
		doInitVersSummenFaktor(configMap);
		doInitMaximaleVersSumme(configMap);
		doInitJahresbasisbeitrag(configMap);
	}

	/**
	 * @generated
	 */
	@IpsGenerated
	private void doInitVersSummenFaktor(Map<String, Element> configMap) {
		Element configElement = configMap.get(PROPERTY_VERSSUMMENFAKTOR);
		if (configElement != null) {
			String value = ValueToXmlHelper.getValueFromElement(configElement, ValueToXmlHelper.XML_TAG_VALUE);
			this.versSummenFaktor = Decimal.valueOf(value);
		}
	}

	/**
	 * @generated
	 */
	@IpsGenerated
	private void doInitMaximaleVersSumme(Map<String, Element> configMap) {
		Element configElement = configMap.get(PROPERTY_MAXIMALEVERSSUMME);
		if (configElement != null) {
			String value = ValueToXmlHelper.getValueFromElement(configElement, ValueToXmlHelper.XML_TAG_VALUE);
			this.maximaleVersSumme = Money.valueOf(value);
		}
	}

	/**
	 * @generated
	 */
	@IpsGenerated
	private void doInitJahresbasisbeitrag(Map<String, Element> configMap) {
		Element defaultValueElement = configMap
				.get(ValueToXmlHelper.CONFIGURED_DEFAULT_PREFIX + HausratZusatzdeckung.PROPERTY_JAHRESBASISBEITRAG);
		if (defaultValueElement != null) {
			String value = ValueToXmlHelper.getValueFromElement(defaultValueElement);
			defaultValueJahresbasisbeitrag = Money.valueOf(value);
		}
		Element valueSetElement = configMap
				.get(ValueToXmlHelper.CONFIGURED_VALUE_SET_PREFIX + HausratZusatzdeckung.PROPERTY_JAHRESBASISBEITRAG);
		if (valueSetElement != null) {
			setOfAllowedValuesJahresbasisbeitrag = ValueToXmlHelper.getUnrestrictedValueSet(valueSetElement,
					ValueToXmlHelper.XML_TAG_VALUE_SET);
			EnumValues values = ValueToXmlHelper.getEnumValueSetFromElement(valueSetElement,
					ValueToXmlHelper.XML_TAG_VALUE_SET);
			if (values != null) {
				List<Money> enumValues = new ArrayList<>();
				for (int i = 0; i < values.getNumberOfValues(); i++) {
					enumValues.add(Money.valueOf(values.getValue(i)));
				}
				setOfAllowedValuesJahresbasisbeitrag = new OrderedValueSet<>(enumValues, values.containsNull(),
						Money.NULL);
			}
			Range range = ValueToXmlHelper.getRangeFromElement(valueSetElement, ValueToXmlHelper.XML_TAG_VALUE_SET);
			if (range != null) {
				if (range.isEmpty()) {
					setOfAllowedValuesJahresbasisbeitrag = MoneyRange.empty();
				} else {
					setOfAllowedValuesJahresbasisbeitrag = MoneyRange.valueOf(range.getLower(), range.getUpper(),
							range.getStep(), range.containsNull());
				}
			}
		}
	}

	/**
	 * Erzeugt eine neue Instanz von HausratZusatzdeckung, die durch diesen
	 * Produktbaustein konfiguriert wird.
	 *
	 * @generated
	 */
	@IpsGenerated
	public HausratZusatzdeckung createHausratZusatzdeckung() {
		HausratZusatzdeckung policy = new HausratZusatzdeckung(this);
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
	public HausratZusatzdeckung createPolicyComponent() {
		return createHausratZusatzdeckung();
	}

}

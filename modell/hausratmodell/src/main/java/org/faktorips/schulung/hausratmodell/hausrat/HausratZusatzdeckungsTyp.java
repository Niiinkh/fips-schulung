package org.faktorips.schulung.hausratmodell.hausrat;

import org.faktorips.runtime.model.annotation.IpsProductCmptType;
import org.faktorips.runtime.model.annotation.IpsAttributes;
import org.faktorips.runtime.model.annotation.IpsConfigures;
import org.faktorips.runtime.model.annotation.IpsDocumented;
import org.faktorips.runtime.internal.ProductComponent;
import org.faktorips.values.Decimal;
import org.faktorips.values.Money;
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
 * Implementierung von HausratZusatzdeckungsTyp.
 *
 * @since 0.0.1
 *
 * @generated
 */
@IpsProductCmptType(name = "hausrat.HausratZusatzdeckungsTyp")
@IpsAttributes({ "versSummenFaktor", "maximaleVersSumme" })
@IpsConfigures(HausratZusatzdeckung.class)
@IpsDocumented(bundleName = "org.faktorips.schulung.hausratmodell.model-label-and-descriptions", defaultLocale = "en")
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

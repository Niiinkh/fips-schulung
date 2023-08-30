package org.faktorips.schulung.hausratmodell.hausrat;

import org.faktorips.runtime.model.annotation.IpsProductCmptType;
import org.faktorips.runtime.model.annotation.IpsConfigures;
import org.faktorips.runtime.model.annotation.IpsTableUsages;
import org.faktorips.runtime.model.annotation.IpsDocumented;
import org.faktorips.runtime.internal.ProductComponent;
import org.faktorips.runtime.IRuntimeRepository;
import org.faktorips.runtime.model.annotation.IpsTableUsage;
import org.faktorips.runtime.IllegalRepositoryModificationException;
import org.w3c.dom.Element;
import java.util.Map;
import org.faktorips.runtime.internal.ValueToXmlHelper;
import org.faktorips.runtime.annotation.IpsGenerated;

/**
 * Die Grunddeckung des Hausrat-Produkts
 *
 * @since 0.0.1
 *
 * @generated
 */
@IpsProductCmptType(name = "hausrat.HausratGrunddeckungstyp")
@IpsConfigures(HausratGrunddeckung.class)
@IpsTableUsages({ "tariftabelle" })
@IpsDocumented(bundleName = "org.faktorips.schulung.hausratmodell.model-label-and-descriptions", defaultLocale = "de")
public class HausratGrunddeckungstyp extends ProductComponent {

	/**
	 * Der Name der Property von der Tabelle tariftabelle.
	 *
	 * @since 0.0.1
	 *
	 * @generated
	 */
	public static final String TABLE_TARIFTABELLE = "tariftabelle";
	/**
	 * Membervariable fuer die Tabelle tariftabelle.
	 *
	 * @since 0.0.1
	 *
	 * @generated
	 */
	private String tariftabelleName = null;

	/**
	 * Erzeugt eine neue Instanz von HausratGrunddeckungstyp.
	 *
	 * @since 0.0.1
	 *
	 * @generated
	 */
	@IpsGenerated
	public HausratGrunddeckungstyp(IRuntimeRepository repository, String id, String kindId, String versionId) {
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
	 * Gibt die als tariftabelle verwendete Tabelle zurueck.
	 *
	 * @since 0.0.1
	 *
	 * @generated
	 */
	@IpsTableUsage(name = "tariftabelle")
	@IpsGenerated
	public TariftabelleHausrat getTariftabelle() {
		if (tariftabelleName == null) {
			return null;
		}
		return (TariftabelleHausrat) getRepository().getTable(tariftabelleName);
	}

	/**
	 * Setzt den Namen der als TariftabelleName verwendeten Tabelle.
	 *
	 * @since 0.0.1
	 *
	 * @generated
	 */
	@IpsGenerated
	public void setTariftabelleName(String tableName) {
		if (getRepository() != null && !getRepository().isModifiable()) {
			throw new IllegalRepositoryModificationException();
		}
		this.tariftabelleName = tableName;
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
	}

	/**
	 * @generated
	 */
	@Override
	@IpsGenerated
	protected void doInitTableUsagesFromXml(Map<String, Element> tableUsageMap) {
		super.doInitTableUsagesFromXml(tableUsageMap);
		doInitTariftabelle(tableUsageMap);
	}

	/**
	 * @generated
	 */
	@IpsGenerated
	private void doInitTariftabelle(Map<String, Element> tableUsageMap) {
		Element element = tableUsageMap.get(TABLE_TARIFTABELLE);
		if (element != null) {
			tariftabelleName = ValueToXmlHelper.getValueFromElement(element,
					ValueToXmlHelper.XML_TAG_TABLE_CONTENT_NAME);
		}
	}

	/**
	 * Erzeugt eine neue Instanz von HausratGrunddeckung, die durch diesen
	 * Produktbaustein konfiguriert wird.
	 *
	 * @generated
	 */
	@IpsGenerated
	public HausratGrunddeckung createHausratGrunddeckung() {
		HausratGrunddeckung policy = new HausratGrunddeckung(this);
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
	public HausratGrunddeckung createPolicyComponent() {
		return createHausratGrunddeckung();
	}

}

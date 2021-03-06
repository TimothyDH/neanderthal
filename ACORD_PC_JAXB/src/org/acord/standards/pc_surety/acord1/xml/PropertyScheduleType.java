//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-147 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.02.24 at 10:20:12 PM EST 
//


package org.acord.standards.pc_surety.acord1.xml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for PropertySchedule_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PropertySchedule_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}IsSummaryInd"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}ExcludedInd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}ItemIdInfo" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}ItemValuationTypeCd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}ItemValueAmt" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}Limit" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}PropertyClassCd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}PropertySubClassCd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}TerritoryCd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}ValuationTypeCd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}Coverage" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;group ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}ITEMDEFINITION_CHOICE" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}PropertyScheduleModifications" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}SalesReceiptAppraisal" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}AdditionalInterest" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}MinPremInd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}EquipmentInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}ID" />
 *       &lt;attribute name="LocationRef" type="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}IDREF" />
 *       &lt;attribute name="SubLocationRef" type="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}IDREF" />
 *       &lt;attribute name="PropSummaryRef" type="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}IDREF" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PropertySchedule_Type", propOrder = {
    "isSummaryInd",
    "excludedInd",
    "itemIdInfo",
    "itemValuationTypeCd",
    "itemValueAmt",
    "limit",
    "propertyClassCd",
    "propertySubClassCd",
    "territoryCd",
    "valuationTypeCd",
    "coverage",
    "itemDefinition",
    "animalItemDefinition",
    "propertyScheduleModifications",
    "salesReceiptAppraisal",
    "additionalInterest",
    "minPremInd",
    "equipmentInfo"
})
public class PropertyScheduleType {

    @XmlElement(name = "IsSummaryInd", required = true)
    protected Boolean isSummaryInd;
    @XmlElement(name = "ExcludedInd")
    protected Boolean excludedInd;
    @XmlElement(name = "ItemIdInfo")
    protected ItemIdInfoType itemIdInfo;
    @XmlElement(name = "ItemValuationTypeCd")
    protected ValuationMethod itemValuationTypeCd;
    @XmlElement(name = "ItemValueAmt")
    protected CURRENCY itemValueAmt;
    @XmlElement(name = "Limit")
    protected LimitType limit;
    @XmlElement(name = "PropertyClassCd")
    protected Risk propertyClassCd;
    @XmlElement(name = "PropertySubClassCd")
    protected SubRisk propertySubClassCd;
    @XmlElement(name = "TerritoryCd")
    protected OpenEnum territoryCd;
    @XmlElement(name = "ValuationTypeCd")
    protected SettlementType valuationTypeCd;
    @XmlElement(name = "Coverage")
    protected List<CoverageType> coverage;
    @XmlElement(name = "ItemDefinition")
    protected ItemDefinitionType2 itemDefinition;
    @XmlElement(name = "AnimalItemDefinition")
    protected AnimalItemDefinitionType animalItemDefinition;
    @XmlElement(name = "PropertyScheduleModifications")
    protected PropertyScheduleModificationsType propertyScheduleModifications;
    @XmlElement(name = "SalesReceiptAppraisal")
    protected List<SalesReceiptAppraisalType> salesReceiptAppraisal;
    @XmlElement(name = "AdditionalInterest")
    protected List<AdditionalInterestType> additionalInterest;
    @XmlElement(name = "MinPremInd")
    protected Boolean minPremInd;
    @XmlElement(name = "EquipmentInfo")
    protected List<EquipmentInfoType> equipmentInfo;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;
    @XmlAttribute(name = "LocationRef")
    @XmlIDREF
    protected Object locationRef;
    @XmlAttribute(name = "SubLocationRef")
    @XmlIDREF
    protected Object subLocationRef;
    @XmlAttribute(name = "PropSummaryRef")
    @XmlIDREF
    protected Object propSummaryRef;

    /**
     * Gets the value of the isSummaryInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getIsSummaryInd() {
        return isSummaryInd;
    }

    /**
     * Sets the value of the isSummaryInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsSummaryInd(Boolean value) {
        this.isSummaryInd = value;
    }

    /**
     * Gets the value of the excludedInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getExcludedInd() {
        return excludedInd;
    }

    /**
     * Sets the value of the excludedInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExcludedInd(Boolean value) {
        this.excludedInd = value;
    }

    /**
     * Gets the value of the itemIdInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ItemIdInfoType }
     *     
     */
    public ItemIdInfoType getItemIdInfo() {
        return itemIdInfo;
    }

    /**
     * Sets the value of the itemIdInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemIdInfoType }
     *     
     */
    public void setItemIdInfo(ItemIdInfoType value) {
        this.itemIdInfo = value;
    }

    /**
     * Gets the value of the itemValuationTypeCd property.
     * 
     * @return
     *     possible object is
     *     {@link ValuationMethod }
     *     
     */
    public ValuationMethod getItemValuationTypeCd() {
        return itemValuationTypeCd;
    }

    /**
     * Sets the value of the itemValuationTypeCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValuationMethod }
     *     
     */
    public void setItemValuationTypeCd(ValuationMethod value) {
        this.itemValuationTypeCd = value;
    }

    /**
     * Gets the value of the itemValueAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CURRENCY }
     *     
     */
    public CURRENCY getItemValueAmt() {
        return itemValueAmt;
    }

    /**
     * Sets the value of the itemValueAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CURRENCY }
     *     
     */
    public void setItemValueAmt(CURRENCY value) {
        this.itemValueAmt = value;
    }

    /**
     * Gets the value of the limit property.
     * 
     * @return
     *     possible object is
     *     {@link LimitType }
     *     
     */
    public LimitType getLimit() {
        return limit;
    }

    /**
     * Sets the value of the limit property.
     * 
     * @param value
     *     allowed object is
     *     {@link LimitType }
     *     
     */
    public void setLimit(LimitType value) {
        this.limit = value;
    }

    /**
     * Gets the value of the propertyClassCd property.
     * 
     * @return
     *     possible object is
     *     {@link Risk }
     *     
     */
    public Risk getPropertyClassCd() {
        return propertyClassCd;
    }

    /**
     * Sets the value of the propertyClassCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Risk }
     *     
     */
    public void setPropertyClassCd(Risk value) {
        this.propertyClassCd = value;
    }

    /**
     * Gets the value of the propertySubClassCd property.
     * 
     * @return
     *     possible object is
     *     {@link SubRisk }
     *     
     */
    public SubRisk getPropertySubClassCd() {
        return propertySubClassCd;
    }

    /**
     * Sets the value of the propertySubClassCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubRisk }
     *     
     */
    public void setPropertySubClassCd(SubRisk value) {
        this.propertySubClassCd = value;
    }

    /**
     * Gets the value of the territoryCd property.
     * 
     * @return
     *     possible object is
     *     {@link OpenEnum }
     *     
     */
    public OpenEnum getTerritoryCd() {
        return territoryCd;
    }

    /**
     * Sets the value of the territoryCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpenEnum }
     *     
     */
    public void setTerritoryCd(OpenEnum value) {
        this.territoryCd = value;
    }

    /**
     * Gets the value of the valuationTypeCd property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementType }
     *     
     */
    public SettlementType getValuationTypeCd() {
        return valuationTypeCd;
    }

    /**
     * Sets the value of the valuationTypeCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementType }
     *     
     */
    public void setValuationTypeCd(SettlementType value) {
        this.valuationTypeCd = value;
    }

    /**
     * Gets the value of the coverage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the coverage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCoverage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CoverageType }
     * 
     * 
     */
    public List<CoverageType> getCoverage() {
        if (coverage == null) {
            coverage = new ArrayList<CoverageType>();
        }
        return this.coverage;
    }

    /**
     * Gets the value of the itemDefinition property.
     * 
     * @return
     *     possible object is
     *     {@link ItemDefinitionType2 }
     *     
     */
    public ItemDefinitionType2 getItemDefinition() {
        return itemDefinition;
    }

    /**
     * Sets the value of the itemDefinition property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemDefinitionType2 }
     *     
     */
    public void setItemDefinition(ItemDefinitionType2 value) {
        this.itemDefinition = value;
    }

    /**
     * Gets the value of the animalItemDefinition property.
     * 
     * @return
     *     possible object is
     *     {@link AnimalItemDefinitionType }
     *     
     */
    public AnimalItemDefinitionType getAnimalItemDefinition() {
        return animalItemDefinition;
    }

    /**
     * Sets the value of the animalItemDefinition property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnimalItemDefinitionType }
     *     
     */
    public void setAnimalItemDefinition(AnimalItemDefinitionType value) {
        this.animalItemDefinition = value;
    }

    /**
     * Gets the value of the propertyScheduleModifications property.
     * 
     * @return
     *     possible object is
     *     {@link PropertyScheduleModificationsType }
     *     
     */
    public PropertyScheduleModificationsType getPropertyScheduleModifications() {
        return propertyScheduleModifications;
    }

    /**
     * Sets the value of the propertyScheduleModifications property.
     * 
     * @param value
     *     allowed object is
     *     {@link PropertyScheduleModificationsType }
     *     
     */
    public void setPropertyScheduleModifications(PropertyScheduleModificationsType value) {
        this.propertyScheduleModifications = value;
    }

    /**
     * Gets the value of the salesReceiptAppraisal property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the salesReceiptAppraisal property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSalesReceiptAppraisal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SalesReceiptAppraisalType }
     * 
     * 
     */
    public List<SalesReceiptAppraisalType> getSalesReceiptAppraisal() {
        if (salesReceiptAppraisal == null) {
            salesReceiptAppraisal = new ArrayList<SalesReceiptAppraisalType>();
        }
        return this.salesReceiptAppraisal;
    }

    /**
     * Gets the value of the additionalInterest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalInterest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalInterest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalInterestType }
     * 
     * 
     */
    public List<AdditionalInterestType> getAdditionalInterest() {
        if (additionalInterest == null) {
            additionalInterest = new ArrayList<AdditionalInterestType>();
        }
        return this.additionalInterest;
    }

    /**
     * Gets the value of the minPremInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getMinPremInd() {
        return minPremInd;
    }

    /**
     * Sets the value of the minPremInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMinPremInd(Boolean value) {
        this.minPremInd = value;
    }

    /**
     * Gets the value of the equipmentInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the equipmentInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEquipmentInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EquipmentInfoType }
     * 
     * 
     */
    public List<EquipmentInfoType> getEquipmentInfo() {
        if (equipmentInfo == null) {
            equipmentInfo = new ArrayList<EquipmentInfoType>();
        }
        return this.equipmentInfo;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the locationRef property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getLocationRef() {
        return locationRef;
    }

    /**
     * Sets the value of the locationRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setLocationRef(Object value) {
        this.locationRef = value;
    }

    /**
     * Gets the value of the subLocationRef property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getSubLocationRef() {
        return subLocationRef;
    }

    /**
     * Sets the value of the subLocationRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setSubLocationRef(Object value) {
        this.subLocationRef = value;
    }

    /**
     * Gets the value of the propSummaryRef property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getPropSummaryRef() {
        return propSummaryRef;
    }

    /**
     * Sets the value of the propSummaryRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setPropSummaryRef(Object value) {
        this.propSummaryRef = value;
    }

}

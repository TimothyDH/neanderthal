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
 * <p>Java class for AutoLossInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AutoLossInfo_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}VehInfo" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}ManufacturerCd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}ModelCd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}InventoryNumberId" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}AirBagInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}ObjectLossDesc" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}ImpactPointCd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}DamageDesc" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}WhereSeenDesc" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}OtherInsuranceInd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}PropertyDamagedVehInd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}ProbableIncurredAmt" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}Coverage" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}DrivableInd" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}ID" />
 *       &lt;attribute name="ViewItemRef" type="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}IDREF" />
 *       &lt;attribute name="OwnerRef" type="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}IDREF" />
 *       &lt;attribute name="LossPayeeRef" type="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}IDREF" />
 *       &lt;attribute name="ClaimsPartyRefs" type="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}IDREFS" />
 *       &lt;attribute name="AutoLossInfoRef" type="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}IDREF" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AutoLossInfo_Type", propOrder = {
    "vehInfo",
    "manufacturerCd",
    "modelCd",
    "inventoryNumberId",
    "airBagInfo",
    "objectLossDesc",
    "impactPointCd",
    "damageDesc",
    "whereSeenDesc",
    "otherInsuranceInd",
    "propertyDamagedVehInd",
    "probableIncurredAmt",
    "coverage",
    "drivableInd"
})
public class AutoLossInfoType {

    @XmlElement(name = "VehInfo")
    protected VehInfoType vehInfo;
    @XmlElement(name = "ManufacturerCd")
    protected OpenEnum manufacturerCd;
    @XmlElement(name = "ModelCd")
    protected OpenEnum modelCd;
    @XmlElement(name = "InventoryNumberId")
    protected AssignedIdentifier inventoryNumberId;
    @XmlElement(name = "AirBagInfo")
    protected List<AirBagInfoType> airBagInfo;
    @XmlElement(name = "ObjectLossDesc")
    protected C255 objectLossDesc;
    @XmlElement(name = "ImpactPointCd")
    protected OpenEnum impactPointCd;
    @XmlElement(name = "DamageDesc")
    protected CInfinite damageDesc;
    @XmlElement(name = "WhereSeenDesc")
    protected C255 whereSeenDesc;
    @XmlElement(name = "OtherInsuranceInd")
    protected Boolean otherInsuranceInd;
    @XmlElement(name = "PropertyDamagedVehInd")
    protected Boolean propertyDamagedVehInd;
    @XmlElement(name = "ProbableIncurredAmt")
    protected CURRENCY probableIncurredAmt;
    @XmlElement(name = "Coverage")
    protected List<CoverageType> coverage;
    @XmlElement(name = "DrivableInd")
    protected Boolean drivableInd;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;
    @XmlAttribute(name = "ViewItemRef")
    @XmlIDREF
    protected Object viewItemRef;
    @XmlAttribute(name = "OwnerRef")
    @XmlIDREF
    protected Object ownerRef;
    @XmlAttribute(name = "LossPayeeRef")
    @XmlIDREF
    protected Object lossPayeeRef;
    @XmlAttribute(name = "ClaimsPartyRefs")
    @XmlIDREF
    protected List<Object> claimsPartyRefs;
    @XmlAttribute(name = "AutoLossInfoRef")
    @XmlIDREF
    protected Object autoLossInfoRef;

    /**
     * Gets the value of the vehInfo property.
     * 
     * @return
     *     possible object is
     *     {@link VehInfoType }
     *     
     */
    public VehInfoType getVehInfo() {
        return vehInfo;
    }

    /**
     * Sets the value of the vehInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehInfoType }
     *     
     */
    public void setVehInfo(VehInfoType value) {
        this.vehInfo = value;
    }

    /**
     * Gets the value of the manufacturerCd property.
     * 
     * @return
     *     possible object is
     *     {@link OpenEnum }
     *     
     */
    public OpenEnum getManufacturerCd() {
        return manufacturerCd;
    }

    /**
     * Sets the value of the manufacturerCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpenEnum }
     *     
     */
    public void setManufacturerCd(OpenEnum value) {
        this.manufacturerCd = value;
    }

    /**
     * Gets the value of the modelCd property.
     * 
     * @return
     *     possible object is
     *     {@link OpenEnum }
     *     
     */
    public OpenEnum getModelCd() {
        return modelCd;
    }

    /**
     * Sets the value of the modelCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpenEnum }
     *     
     */
    public void setModelCd(OpenEnum value) {
        this.modelCd = value;
    }

    /**
     * Gets the value of the inventoryNumberId property.
     * 
     * @return
     *     possible object is
     *     {@link AssignedIdentifier }
     *     
     */
    public AssignedIdentifier getInventoryNumberId() {
        return inventoryNumberId;
    }

    /**
     * Sets the value of the inventoryNumberId property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssignedIdentifier }
     *     
     */
    public void setInventoryNumberId(AssignedIdentifier value) {
        this.inventoryNumberId = value;
    }

    /**
     * Gets the value of the airBagInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the airBagInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAirBagInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirBagInfoType }
     * 
     * 
     */
    public List<AirBagInfoType> getAirBagInfo() {
        if (airBagInfo == null) {
            airBagInfo = new ArrayList<AirBagInfoType>();
        }
        return this.airBagInfo;
    }

    /**
     * Gets the value of the objectLossDesc property.
     * 
     * @return
     *     possible object is
     *     {@link C255 }
     *     
     */
    public C255 getObjectLossDesc() {
        return objectLossDesc;
    }

    /**
     * Sets the value of the objectLossDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link C255 }
     *     
     */
    public void setObjectLossDesc(C255 value) {
        this.objectLossDesc = value;
    }

    /**
     * Gets the value of the impactPointCd property.
     * 
     * @return
     *     possible object is
     *     {@link OpenEnum }
     *     
     */
    public OpenEnum getImpactPointCd() {
        return impactPointCd;
    }

    /**
     * Sets the value of the impactPointCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpenEnum }
     *     
     */
    public void setImpactPointCd(OpenEnum value) {
        this.impactPointCd = value;
    }

    /**
     * Gets the value of the damageDesc property.
     * 
     * @return
     *     possible object is
     *     {@link CInfinite }
     *     
     */
    public CInfinite getDamageDesc() {
        return damageDesc;
    }

    /**
     * Sets the value of the damageDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CInfinite }
     *     
     */
    public void setDamageDesc(CInfinite value) {
        this.damageDesc = value;
    }

    /**
     * Gets the value of the whereSeenDesc property.
     * 
     * @return
     *     possible object is
     *     {@link C255 }
     *     
     */
    public C255 getWhereSeenDesc() {
        return whereSeenDesc;
    }

    /**
     * Sets the value of the whereSeenDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link C255 }
     *     
     */
    public void setWhereSeenDesc(C255 value) {
        this.whereSeenDesc = value;
    }

    /**
     * Gets the value of the otherInsuranceInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getOtherInsuranceInd() {
        return otherInsuranceInd;
    }

    /**
     * Sets the value of the otherInsuranceInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOtherInsuranceInd(Boolean value) {
        this.otherInsuranceInd = value;
    }

    /**
     * Gets the value of the propertyDamagedVehInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getPropertyDamagedVehInd() {
        return propertyDamagedVehInd;
    }

    /**
     * Sets the value of the propertyDamagedVehInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPropertyDamagedVehInd(Boolean value) {
        this.propertyDamagedVehInd = value;
    }

    /**
     * Gets the value of the probableIncurredAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CURRENCY }
     *     
     */
    public CURRENCY getProbableIncurredAmt() {
        return probableIncurredAmt;
    }

    /**
     * Sets the value of the probableIncurredAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CURRENCY }
     *     
     */
    public void setProbableIncurredAmt(CURRENCY value) {
        this.probableIncurredAmt = value;
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
     * Gets the value of the drivableInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getDrivableInd() {
        return drivableInd;
    }

    /**
     * Sets the value of the drivableInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDrivableInd(Boolean value) {
        this.drivableInd = value;
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
     * Gets the value of the viewItemRef property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getViewItemRef() {
        return viewItemRef;
    }

    /**
     * Sets the value of the viewItemRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setViewItemRef(Object value) {
        this.viewItemRef = value;
    }

    /**
     * Gets the value of the ownerRef property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getOwnerRef() {
        return ownerRef;
    }

    /**
     * Sets the value of the ownerRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setOwnerRef(Object value) {
        this.ownerRef = value;
    }

    /**
     * Gets the value of the lossPayeeRef property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getLossPayeeRef() {
        return lossPayeeRef;
    }

    /**
     * Sets the value of the lossPayeeRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setLossPayeeRef(Object value) {
        this.lossPayeeRef = value;
    }

    /**
     * Gets the value of the claimsPartyRefs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the claimsPartyRefs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClaimsPartyRefs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getClaimsPartyRefs() {
        if (claimsPartyRefs == null) {
            claimsPartyRefs = new ArrayList<Object>();
        }
        return this.claimsPartyRefs;
    }

    /**
     * Gets the value of the autoLossInfoRef property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAutoLossInfoRef() {
        return autoLossInfoRef;
    }

    /**
     * Sets the value of the autoLossInfoRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAutoLossInfoRef(Object value) {
        this.autoLossInfoRef = value;
    }

}

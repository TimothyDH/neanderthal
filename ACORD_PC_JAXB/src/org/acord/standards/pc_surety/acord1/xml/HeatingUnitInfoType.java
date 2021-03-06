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
 * <p>Java class for HeatingUnitInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HeatingUnitInfo_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}ItemInfo" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}FuelTypeCd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}FuelStorageLocationDesc" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}CertifiedInd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}HeatingUnitCd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}ConstructionCd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}Area" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}InstallationCd" minOccurs="0"/>
 *         &lt;group ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}INSTALLATION_CHOICE" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}UseCd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}FireplaceTypeCd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}SlowCombustionInd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}FrequencyCd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}NumFaceCordsUsed" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}NumCordsUsed" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}PlacementCd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}CompletedByCd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}StoveTypeCd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}HeatSourceOtherCd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}ProximityInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}ChimneyInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}InspectionInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}ProtectiveMaterialInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}QuestionAnswer" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}ID" />
 *       &lt;attribute name="CertifyingPartyRef" type="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}IDREF" />
 *       &lt;attribute name="InstallingPartyRef" type="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}IDREF" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HeatingUnitInfo_Type", propOrder = {
    "itemInfo",
    "fuelTypeCd",
    "fuelStorageLocationDesc",
    "certifiedInd",
    "heatingUnitCd",
    "constructionCd",
    "area",
    "installationCd",
    "installationYr",
    "installationDt",
    "useCd",
    "fireplaceTypeCd",
    "slowCombustionInd",
    "frequencyCd",
    "numFaceCordsUsed",
    "numCordsUsed",
    "placementCd",
    "completedByCd",
    "stoveTypeCd",
    "heatSourceOtherCd",
    "proximityInfo",
    "chimneyInfo",
    "inspectionInfo",
    "protectiveMaterialInfo",
    "questionAnswer"
})
public class HeatingUnitInfoType {

    @XmlElement(name = "ItemInfo")
    protected ItemInfoType itemInfo;
    @XmlElement(name = "FuelTypeCd")
    protected FuelType fuelTypeCd;
    @XmlElement(name = "FuelStorageLocationDesc")
    protected C255 fuelStorageLocationDesc;
    @XmlElement(name = "CertifiedInd")
    protected Boolean certifiedInd;
    @XmlElement(name = "HeatingUnitCd")
    protected HeatingUnit heatingUnitCd;
    @XmlElement(name = "ConstructionCd")
    protected ConstructionType constructionCd;
    @XmlElement(name = "Area")
    protected MEASUREMENT area;
    @XmlElement(name = "InstallationCd")
    protected Installation installationCd;
    @XmlElement(name = "InstallationYr")
    protected Year installationYr;
    @XmlElement(name = "InstallationDt")
    protected Date installationDt;
    @XmlElement(name = "UseCd")
    protected Use useCd;
    @XmlElement(name = "FireplaceTypeCd")
    protected FireplaceType fireplaceTypeCd;
    @XmlElement(name = "SlowCombustionInd")
    protected Boolean slowCombustionInd;
    @XmlElement(name = "FrequencyCd")
    protected Frequency frequencyCd;
    @XmlElement(name = "NumFaceCordsUsed")
    protected Long numFaceCordsUsed;
    @XmlElement(name = "NumCordsUsed")
    protected Long numCordsUsed;
    @XmlElement(name = "PlacementCd")
    protected Placement placementCd;
    @XmlElement(name = "CompletedByCd")
    protected CompletedBy completedByCd;
    @XmlElement(name = "StoveTypeCd")
    protected StoveType stoveTypeCd;
    @XmlElement(name = "HeatSourceOtherCd")
    protected HeatSource heatSourceOtherCd;
    @XmlElement(name = "ProximityInfo")
    protected List<ProximityInfoType> proximityInfo;
    @XmlElement(name = "ChimneyInfo")
    protected List<ChimneyInfoType> chimneyInfo;
    @XmlElement(name = "InspectionInfo")
    protected List<InspectionInfoType> inspectionInfo;
    @XmlElement(name = "ProtectiveMaterialInfo")
    protected List<ProtectiveMaterialInfoType> protectiveMaterialInfo;
    @XmlElement(name = "QuestionAnswer")
    protected List<QuestionAnswerType> questionAnswer;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;
    @XmlAttribute(name = "CertifyingPartyRef")
    @XmlIDREF
    protected Object certifyingPartyRef;
    @XmlAttribute(name = "InstallingPartyRef")
    @XmlIDREF
    protected Object installingPartyRef;

    /**
     * Gets the value of the itemInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ItemInfoType }
     *     
     */
    public ItemInfoType getItemInfo() {
        return itemInfo;
    }

    /**
     * Sets the value of the itemInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemInfoType }
     *     
     */
    public void setItemInfo(ItemInfoType value) {
        this.itemInfo = value;
    }

    /**
     * Gets the value of the fuelTypeCd property.
     * 
     * @return
     *     possible object is
     *     {@link FuelType }
     *     
     */
    public FuelType getFuelTypeCd() {
        return fuelTypeCd;
    }

    /**
     * Sets the value of the fuelTypeCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link FuelType }
     *     
     */
    public void setFuelTypeCd(FuelType value) {
        this.fuelTypeCd = value;
    }

    /**
     * Gets the value of the fuelStorageLocationDesc property.
     * 
     * @return
     *     possible object is
     *     {@link C255 }
     *     
     */
    public C255 getFuelStorageLocationDesc() {
        return fuelStorageLocationDesc;
    }

    /**
     * Sets the value of the fuelStorageLocationDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link C255 }
     *     
     */
    public void setFuelStorageLocationDesc(C255 value) {
        this.fuelStorageLocationDesc = value;
    }

    /**
     * Gets the value of the certifiedInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getCertifiedInd() {
        return certifiedInd;
    }

    /**
     * Sets the value of the certifiedInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCertifiedInd(Boolean value) {
        this.certifiedInd = value;
    }

    /**
     * Gets the value of the heatingUnitCd property.
     * 
     * @return
     *     possible object is
     *     {@link HeatingUnit }
     *     
     */
    public HeatingUnit getHeatingUnitCd() {
        return heatingUnitCd;
    }

    /**
     * Sets the value of the heatingUnitCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link HeatingUnit }
     *     
     */
    public void setHeatingUnitCd(HeatingUnit value) {
        this.heatingUnitCd = value;
    }

    /**
     * Gets the value of the constructionCd property.
     * 
     * @return
     *     possible object is
     *     {@link ConstructionType }
     *     
     */
    public ConstructionType getConstructionCd() {
        return constructionCd;
    }

    /**
     * Sets the value of the constructionCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConstructionType }
     *     
     */
    public void setConstructionCd(ConstructionType value) {
        this.constructionCd = value;
    }

    /**
     * Gets the value of the area property.
     * 
     * @return
     *     possible object is
     *     {@link MEASUREMENT }
     *     
     */
    public MEASUREMENT getArea() {
        return area;
    }

    /**
     * Sets the value of the area property.
     * 
     * @param value
     *     allowed object is
     *     {@link MEASUREMENT }
     *     
     */
    public void setArea(MEASUREMENT value) {
        this.area = value;
    }

    /**
     * Gets the value of the installationCd property.
     * 
     * @return
     *     possible object is
     *     {@link Installation }
     *     
     */
    public Installation getInstallationCd() {
        return installationCd;
    }

    /**
     * Sets the value of the installationCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Installation }
     *     
     */
    public void setInstallationCd(Installation value) {
        this.installationCd = value;
    }

    /**
     * Gets the value of the installationYr property.
     * 
     * @return
     *     possible object is
     *     {@link Year }
     *     
     */
    public Year getInstallationYr() {
        return installationYr;
    }

    /**
     * Sets the value of the installationYr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Year }
     *     
     */
    public void setInstallationYr(Year value) {
        this.installationYr = value;
    }

    /**
     * Gets the value of the installationDt property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getInstallationDt() {
        return installationDt;
    }

    /**
     * Sets the value of the installationDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setInstallationDt(Date value) {
        this.installationDt = value;
    }

    /**
     * Gets the value of the useCd property.
     * 
     * @return
     *     possible object is
     *     {@link Use }
     *     
     */
    public Use getUseCd() {
        return useCd;
    }

    /**
     * Sets the value of the useCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Use }
     *     
     */
    public void setUseCd(Use value) {
        this.useCd = value;
    }

    /**
     * Gets the value of the fireplaceTypeCd property.
     * 
     * @return
     *     possible object is
     *     {@link FireplaceType }
     *     
     */
    public FireplaceType getFireplaceTypeCd() {
        return fireplaceTypeCd;
    }

    /**
     * Sets the value of the fireplaceTypeCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link FireplaceType }
     *     
     */
    public void setFireplaceTypeCd(FireplaceType value) {
        this.fireplaceTypeCd = value;
    }

    /**
     * Gets the value of the slowCombustionInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getSlowCombustionInd() {
        return slowCombustionInd;
    }

    /**
     * Sets the value of the slowCombustionInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSlowCombustionInd(Boolean value) {
        this.slowCombustionInd = value;
    }

    /**
     * Gets the value of the frequencyCd property.
     * 
     * @return
     *     possible object is
     *     {@link Frequency }
     *     
     */
    public Frequency getFrequencyCd() {
        return frequencyCd;
    }

    /**
     * Sets the value of the frequencyCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Frequency }
     *     
     */
    public void setFrequencyCd(Frequency value) {
        this.frequencyCd = value;
    }

    /**
     * Gets the value of the numFaceCordsUsed property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumFaceCordsUsed() {
        return numFaceCordsUsed;
    }

    /**
     * Sets the value of the numFaceCordsUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumFaceCordsUsed(Long value) {
        this.numFaceCordsUsed = value;
    }

    /**
     * Gets the value of the numCordsUsed property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumCordsUsed() {
        return numCordsUsed;
    }

    /**
     * Sets the value of the numCordsUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumCordsUsed(Long value) {
        this.numCordsUsed = value;
    }

    /**
     * Gets the value of the placementCd property.
     * 
     * @return
     *     possible object is
     *     {@link Placement }
     *     
     */
    public Placement getPlacementCd() {
        return placementCd;
    }

    /**
     * Sets the value of the placementCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Placement }
     *     
     */
    public void setPlacementCd(Placement value) {
        this.placementCd = value;
    }

    /**
     * Gets the value of the completedByCd property.
     * 
     * @return
     *     possible object is
     *     {@link CompletedBy }
     *     
     */
    public CompletedBy getCompletedByCd() {
        return completedByCd;
    }

    /**
     * Sets the value of the completedByCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompletedBy }
     *     
     */
    public void setCompletedByCd(CompletedBy value) {
        this.completedByCd = value;
    }

    /**
     * Gets the value of the stoveTypeCd property.
     * 
     * @return
     *     possible object is
     *     {@link StoveType }
     *     
     */
    public StoveType getStoveTypeCd() {
        return stoveTypeCd;
    }

    /**
     * Sets the value of the stoveTypeCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link StoveType }
     *     
     */
    public void setStoveTypeCd(StoveType value) {
        this.stoveTypeCd = value;
    }

    /**
     * Gets the value of the heatSourceOtherCd property.
     * 
     * @return
     *     possible object is
     *     {@link HeatSource }
     *     
     */
    public HeatSource getHeatSourceOtherCd() {
        return heatSourceOtherCd;
    }

    /**
     * Sets the value of the heatSourceOtherCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link HeatSource }
     *     
     */
    public void setHeatSourceOtherCd(HeatSource value) {
        this.heatSourceOtherCd = value;
    }

    /**
     * Gets the value of the proximityInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the proximityInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProximityInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProximityInfoType }
     * 
     * 
     */
    public List<ProximityInfoType> getProximityInfo() {
        if (proximityInfo == null) {
            proximityInfo = new ArrayList<ProximityInfoType>();
        }
        return this.proximityInfo;
    }

    /**
     * Gets the value of the chimneyInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the chimneyInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChimneyInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChimneyInfoType }
     * 
     * 
     */
    public List<ChimneyInfoType> getChimneyInfo() {
        if (chimneyInfo == null) {
            chimneyInfo = new ArrayList<ChimneyInfoType>();
        }
        return this.chimneyInfo;
    }

    /**
     * Gets the value of the inspectionInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inspectionInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInspectionInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InspectionInfoType }
     * 
     * 
     */
    public List<InspectionInfoType> getInspectionInfo() {
        if (inspectionInfo == null) {
            inspectionInfo = new ArrayList<InspectionInfoType>();
        }
        return this.inspectionInfo;
    }

    /**
     * Gets the value of the protectiveMaterialInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the protectiveMaterialInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProtectiveMaterialInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProtectiveMaterialInfoType }
     * 
     * 
     */
    public List<ProtectiveMaterialInfoType> getProtectiveMaterialInfo() {
        if (protectiveMaterialInfo == null) {
            protectiveMaterialInfo = new ArrayList<ProtectiveMaterialInfoType>();
        }
        return this.protectiveMaterialInfo;
    }

    /**
     * Gets the value of the questionAnswer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the questionAnswer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQuestionAnswer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QuestionAnswerType }
     * 
     * 
     */
    public List<QuestionAnswerType> getQuestionAnswer() {
        if (questionAnswer == null) {
            questionAnswer = new ArrayList<QuestionAnswerType>();
        }
        return this.questionAnswer;
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
     * Gets the value of the certifyingPartyRef property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getCertifyingPartyRef() {
        return certifyingPartyRef;
    }

    /**
     * Sets the value of the certifyingPartyRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setCertifyingPartyRef(Object value) {
        this.certifyingPartyRef = value;
    }

    /**
     * Gets the value of the installingPartyRef property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getInstallingPartyRef() {
        return installingPartyRef;
    }

    /**
     * Sets the value of the installingPartyRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setInstallingPartyRef(Object value) {
        this.installingPartyRef = value;
    }

}

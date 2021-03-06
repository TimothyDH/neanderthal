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
 * <p>Java class for CommlSubLocation_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommlSubLocation_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}InterestCd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}CompanyProductCd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}ContractExpirationDt" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}InstallationServiceOrRepairWorkForRetailPct" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}OffPremisesInstallationPct" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}Construction" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}BldgImprovements" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}BldgProtection" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}BldgExposures" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}BldgOccupancy" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}CrimeInfo" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}CrimeMoneyAndSecurities" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}AlarmAndSecurity" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}SafeVaultCharacteristics" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}QuestionAnswer" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}PlaceCd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}SwimmingPool" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}NumSwimmingPools" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}TerritoryCd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}WindClassCd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}FloorInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}RelatedLocInfo" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}DistanceToOceanOrOtherBodyWater" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}SeacoastOrOtherBodyWaterProximityCd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}DistanceToBrush" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}OriginalUseDesc" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}FranchiseInd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}SeasonalInd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}HoursOperation" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}ReceiptsInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}BldgFeatures" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}ExposureInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}LiquorInfo" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}FinancialInfo" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}AmusementDevicesInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}VacancyInfo" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}AreaTypeSurroundingsDesc" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}AreaTypeSurroundingsCd" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}ID" />
 *       &lt;attribute name="LocationRef" use="required" type="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}IDREF" />
 *       &lt;attribute name="SubLocationRef" type="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}IDREF" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommlSubLocation_Type", propOrder = {
    "interestCd",
    "companyProductCd",
    "contractExpirationDt",
    "installationServiceOrRepairWorkForRetailPct",
    "offPremisesInstallationPct",
    "construction",
    "bldgImprovements",
    "bldgProtection",
    "bldgExposures",
    "bldgOccupancy",
    "crimeInfo",
    "crimeMoneyAndSecurities",
    "alarmAndSecurity",
    "safeVaultCharacteristics",
    "questionAnswer",
    "placeCd",
    "swimmingPool",
    "numSwimmingPools",
    "territoryCd",
    "windClassCd",
    "floorInfo",
    "relatedLocInfo",
    "distanceToOceanOrOtherBodyWater",
    "seacoastOrOtherBodyWaterProximityCd",
    "distanceToBrush",
    "originalUseDesc",
    "franchiseInd",
    "seasonalInd",
    "hoursOperation",
    "receiptsInfo",
    "bldgFeatures",
    "exposureInfo",
    "liquorInfo",
    "financialInfo",
    "amusementDevicesInfo",
    "vacancyInfo",
    "areaTypeSurroundingsDesc",
    "areaTypeSurroundingsCd"
})
public class CommlSubLocationType {

    @XmlElement(name = "InterestCd")
    protected Interest interestCd;
    @XmlElement(name = "CompanyProductCd")
    protected OpenEnum companyProductCd;
    @XmlElement(name = "ContractExpirationDt")
    protected Date contractExpirationDt;
    @XmlElement(name = "InstallationServiceOrRepairWorkForRetailPct")
    protected PercentLong installationServiceOrRepairWorkForRetailPct;
    @XmlElement(name = "OffPremisesInstallationPct")
    protected PercentLong offPremisesInstallationPct;
    @XmlElement(name = "Construction")
    protected ConstructionType2 construction;
    @XmlElement(name = "BldgImprovements")
    protected BldgImprovementsType bldgImprovements;
    @XmlElement(name = "BldgProtection")
    protected BldgProtectionType bldgProtection;
    @XmlElement(name = "BldgExposures")
    protected List<PROXIMITY> bldgExposures;
    @XmlElement(name = "BldgOccupancy")
    protected List<BldgOccupancyType> bldgOccupancy;
    @XmlElement(name = "CrimeInfo")
    protected CrimeInfoType crimeInfo;
    @XmlElement(name = "CrimeMoneyAndSecurities")
    protected CrimeMoneyAndSecuritiesType crimeMoneyAndSecurities;
    @XmlElement(name = "AlarmAndSecurity")
    protected List<AlarmAndSecurityType> alarmAndSecurity;
    @XmlElement(name = "SafeVaultCharacteristics")
    protected List<SafeVaultCharacteristicsType> safeVaultCharacteristics;
    @XmlElement(name = "QuestionAnswer")
    protected List<QuestionAnswerType> questionAnswer;
    @XmlElement(name = "PlaceCd")
    protected OpenEnum placeCd;
    @XmlElement(name = "SwimmingPool")
    protected List<SwimmingPoolType> swimmingPool;
    @XmlElement(name = "NumSwimmingPools")
    protected Long numSwimmingPools;
    @XmlElement(name = "TerritoryCd")
    protected OpenEnum territoryCd;
    @XmlElement(name = "WindClassCd")
    protected WindClass windClassCd;
    @XmlElement(name = "FloorInfo")
    protected List<FloorInfoType> floorInfo;
    @XmlElement(name = "RelatedLocInfo")
    protected RelatedLocInfoType relatedLocInfo;
    @XmlElement(name = "DistanceToOceanOrOtherBodyWater")
    protected MEASUREMENT distanceToOceanOrOtherBodyWater;
    @XmlElement(name = "SeacoastOrOtherBodyWaterProximityCd")
    protected SeacoastOrOtherBodyOfWaterProximity seacoastOrOtherBodyWaterProximityCd;
    @XmlElement(name = "DistanceToBrush")
    protected MEASUREMENT distanceToBrush;
    @XmlElement(name = "OriginalUseDesc")
    protected CInfinite originalUseDesc;
    @XmlElement(name = "FranchiseInd")
    protected Boolean franchiseInd;
    @XmlElement(name = "SeasonalInd")
    protected Boolean seasonalInd;
    @XmlElement(name = "HoursOperation")
    protected C50 hoursOperation;
    @XmlElement(name = "ReceiptsInfo")
    protected List<ReceiptsInfoType> receiptsInfo;
    @XmlElement(name = "BldgFeatures")
    protected BldgFeaturesType bldgFeatures;
    @XmlElement(name = "ExposureInfo")
    protected List<ExposureInfoType> exposureInfo;
    @XmlElement(name = "LiquorInfo")
    protected LiquorInfoType liquorInfo;
    @XmlElement(name = "FinancialInfo")
    protected FinancialInfoType financialInfo;
    @XmlElement(name = "AmusementDevicesInfo")
    protected List<AmusementDevicesInfoType> amusementDevicesInfo;
    @XmlElement(name = "VacancyInfo")
    protected VacancyInfoType vacancyInfo;
    @XmlElement(name = "AreaTypeSurroundingsDesc")
    protected C255 areaTypeSurroundingsDesc;
    @XmlElement(name = "AreaTypeSurroundingsCd")
    protected LocationType areaTypeSurroundingsCd;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;
    @XmlAttribute(name = "LocationRef", required = true)
    @XmlIDREF
    protected Object locationRef;
    @XmlAttribute(name = "SubLocationRef")
    @XmlIDREF
    protected Object subLocationRef;

    /**
     * Gets the value of the interestCd property.
     * 
     * @return
     *     possible object is
     *     {@link Interest }
     *     
     */
    public Interest getInterestCd() {
        return interestCd;
    }

    /**
     * Sets the value of the interestCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Interest }
     *     
     */
    public void setInterestCd(Interest value) {
        this.interestCd = value;
    }

    /**
     * Gets the value of the companyProductCd property.
     * 
     * @return
     *     possible object is
     *     {@link OpenEnum }
     *     
     */
    public OpenEnum getCompanyProductCd() {
        return companyProductCd;
    }

    /**
     * Sets the value of the companyProductCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpenEnum }
     *     
     */
    public void setCompanyProductCd(OpenEnum value) {
        this.companyProductCd = value;
    }

    /**
     * Gets the value of the contractExpirationDt property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getContractExpirationDt() {
        return contractExpirationDt;
    }

    /**
     * Sets the value of the contractExpirationDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setContractExpirationDt(Date value) {
        this.contractExpirationDt = value;
    }

    /**
     * Gets the value of the installationServiceOrRepairWorkForRetailPct property.
     * 
     * @return
     *     possible object is
     *     {@link PercentLong }
     *     
     */
    public PercentLong getInstallationServiceOrRepairWorkForRetailPct() {
        return installationServiceOrRepairWorkForRetailPct;
    }

    /**
     * Sets the value of the installationServiceOrRepairWorkForRetailPct property.
     * 
     * @param value
     *     allowed object is
     *     {@link PercentLong }
     *     
     */
    public void setInstallationServiceOrRepairWorkForRetailPct(PercentLong value) {
        this.installationServiceOrRepairWorkForRetailPct = value;
    }

    /**
     * Gets the value of the offPremisesInstallationPct property.
     * 
     * @return
     *     possible object is
     *     {@link PercentLong }
     *     
     */
    public PercentLong getOffPremisesInstallationPct() {
        return offPremisesInstallationPct;
    }

    /**
     * Sets the value of the offPremisesInstallationPct property.
     * 
     * @param value
     *     allowed object is
     *     {@link PercentLong }
     *     
     */
    public void setOffPremisesInstallationPct(PercentLong value) {
        this.offPremisesInstallationPct = value;
    }

    /**
     * Gets the value of the construction property.
     * 
     * @return
     *     possible object is
     *     {@link ConstructionType2 }
     *     
     */
    public ConstructionType2 getConstruction() {
        return construction;
    }

    /**
     * Sets the value of the construction property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConstructionType2 }
     *     
     */
    public void setConstruction(ConstructionType2 value) {
        this.construction = value;
    }

    /**
     * Gets the value of the bldgImprovements property.
     * 
     * @return
     *     possible object is
     *     {@link BldgImprovementsType }
     *     
     */
    public BldgImprovementsType getBldgImprovements() {
        return bldgImprovements;
    }

    /**
     * Sets the value of the bldgImprovements property.
     * 
     * @param value
     *     allowed object is
     *     {@link BldgImprovementsType }
     *     
     */
    public void setBldgImprovements(BldgImprovementsType value) {
        this.bldgImprovements = value;
    }

    /**
     * Gets the value of the bldgProtection property.
     * 
     * @return
     *     possible object is
     *     {@link BldgProtectionType }
     *     
     */
    public BldgProtectionType getBldgProtection() {
        return bldgProtection;
    }

    /**
     * Sets the value of the bldgProtection property.
     * 
     * @param value
     *     allowed object is
     *     {@link BldgProtectionType }
     *     
     */
    public void setBldgProtection(BldgProtectionType value) {
        this.bldgProtection = value;
    }

    /**
     * Gets the value of the bldgExposures property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bldgExposures property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBldgExposures().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PROXIMITY }
     * 
     * 
     */
    public List<PROXIMITY> getBldgExposures() {
        if (bldgExposures == null) {
            bldgExposures = new ArrayList<PROXIMITY>();
        }
        return this.bldgExposures;
    }

    /**
     * Gets the value of the bldgOccupancy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bldgOccupancy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBldgOccupancy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BldgOccupancyType }
     * 
     * 
     */
    public List<BldgOccupancyType> getBldgOccupancy() {
        if (bldgOccupancy == null) {
            bldgOccupancy = new ArrayList<BldgOccupancyType>();
        }
        return this.bldgOccupancy;
    }

    /**
     * Gets the value of the crimeInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CrimeInfoType }
     *     
     */
    public CrimeInfoType getCrimeInfo() {
        return crimeInfo;
    }

    /**
     * Sets the value of the crimeInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CrimeInfoType }
     *     
     */
    public void setCrimeInfo(CrimeInfoType value) {
        this.crimeInfo = value;
    }

    /**
     * Gets the value of the crimeMoneyAndSecurities property.
     * 
     * @return
     *     possible object is
     *     {@link CrimeMoneyAndSecuritiesType }
     *     
     */
    public CrimeMoneyAndSecuritiesType getCrimeMoneyAndSecurities() {
        return crimeMoneyAndSecurities;
    }

    /**
     * Sets the value of the crimeMoneyAndSecurities property.
     * 
     * @param value
     *     allowed object is
     *     {@link CrimeMoneyAndSecuritiesType }
     *     
     */
    public void setCrimeMoneyAndSecurities(CrimeMoneyAndSecuritiesType value) {
        this.crimeMoneyAndSecurities = value;
    }

    /**
     * Gets the value of the alarmAndSecurity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the alarmAndSecurity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlarmAndSecurity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AlarmAndSecurityType }
     * 
     * 
     */
    public List<AlarmAndSecurityType> getAlarmAndSecurity() {
        if (alarmAndSecurity == null) {
            alarmAndSecurity = new ArrayList<AlarmAndSecurityType>();
        }
        return this.alarmAndSecurity;
    }

    /**
     * Gets the value of the safeVaultCharacteristics property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the safeVaultCharacteristics property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSafeVaultCharacteristics().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SafeVaultCharacteristicsType }
     * 
     * 
     */
    public List<SafeVaultCharacteristicsType> getSafeVaultCharacteristics() {
        if (safeVaultCharacteristics == null) {
            safeVaultCharacteristics = new ArrayList<SafeVaultCharacteristicsType>();
        }
        return this.safeVaultCharacteristics;
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
     * Gets the value of the placeCd property.
     * 
     * @return
     *     possible object is
     *     {@link OpenEnum }
     *     
     */
    public OpenEnum getPlaceCd() {
        return placeCd;
    }

    /**
     * Sets the value of the placeCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpenEnum }
     *     
     */
    public void setPlaceCd(OpenEnum value) {
        this.placeCd = value;
    }

    /**
     * Gets the value of the swimmingPool property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the swimmingPool property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSwimmingPool().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SwimmingPoolType }
     * 
     * 
     */
    public List<SwimmingPoolType> getSwimmingPool() {
        if (swimmingPool == null) {
            swimmingPool = new ArrayList<SwimmingPoolType>();
        }
        return this.swimmingPool;
    }

    /**
     * Gets the value of the numSwimmingPools property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumSwimmingPools() {
        return numSwimmingPools;
    }

    /**
     * Sets the value of the numSwimmingPools property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumSwimmingPools(Long value) {
        this.numSwimmingPools = value;
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
     * Gets the value of the windClassCd property.
     * 
     * @return
     *     possible object is
     *     {@link WindClass }
     *     
     */
    public WindClass getWindClassCd() {
        return windClassCd;
    }

    /**
     * Sets the value of the windClassCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link WindClass }
     *     
     */
    public void setWindClassCd(WindClass value) {
        this.windClassCd = value;
    }

    /**
     * Gets the value of the floorInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the floorInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFloorInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FloorInfoType }
     * 
     * 
     */
    public List<FloorInfoType> getFloorInfo() {
        if (floorInfo == null) {
            floorInfo = new ArrayList<FloorInfoType>();
        }
        return this.floorInfo;
    }

    /**
     * Gets the value of the relatedLocInfo property.
     * 
     * @return
     *     possible object is
     *     {@link RelatedLocInfoType }
     *     
     */
    public RelatedLocInfoType getRelatedLocInfo() {
        return relatedLocInfo;
    }

    /**
     * Sets the value of the relatedLocInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelatedLocInfoType }
     *     
     */
    public void setRelatedLocInfo(RelatedLocInfoType value) {
        this.relatedLocInfo = value;
    }

    /**
     * Gets the value of the distanceToOceanOrOtherBodyWater property.
     * 
     * @return
     *     possible object is
     *     {@link MEASUREMENT }
     *     
     */
    public MEASUREMENT getDistanceToOceanOrOtherBodyWater() {
        return distanceToOceanOrOtherBodyWater;
    }

    /**
     * Sets the value of the distanceToOceanOrOtherBodyWater property.
     * 
     * @param value
     *     allowed object is
     *     {@link MEASUREMENT }
     *     
     */
    public void setDistanceToOceanOrOtherBodyWater(MEASUREMENT value) {
        this.distanceToOceanOrOtherBodyWater = value;
    }

    /**
     * Gets the value of the seacoastOrOtherBodyWaterProximityCd property.
     * 
     * @return
     *     possible object is
     *     {@link SeacoastOrOtherBodyOfWaterProximity }
     *     
     */
    public SeacoastOrOtherBodyOfWaterProximity getSeacoastOrOtherBodyWaterProximityCd() {
        return seacoastOrOtherBodyWaterProximityCd;
    }

    /**
     * Sets the value of the seacoastOrOtherBodyWaterProximityCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link SeacoastOrOtherBodyOfWaterProximity }
     *     
     */
    public void setSeacoastOrOtherBodyWaterProximityCd(SeacoastOrOtherBodyOfWaterProximity value) {
        this.seacoastOrOtherBodyWaterProximityCd = value;
    }

    /**
     * Gets the value of the distanceToBrush property.
     * 
     * @return
     *     possible object is
     *     {@link MEASUREMENT }
     *     
     */
    public MEASUREMENT getDistanceToBrush() {
        return distanceToBrush;
    }

    /**
     * Sets the value of the distanceToBrush property.
     * 
     * @param value
     *     allowed object is
     *     {@link MEASUREMENT }
     *     
     */
    public void setDistanceToBrush(MEASUREMENT value) {
        this.distanceToBrush = value;
    }

    /**
     * Gets the value of the originalUseDesc property.
     * 
     * @return
     *     possible object is
     *     {@link CInfinite }
     *     
     */
    public CInfinite getOriginalUseDesc() {
        return originalUseDesc;
    }

    /**
     * Sets the value of the originalUseDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CInfinite }
     *     
     */
    public void setOriginalUseDesc(CInfinite value) {
        this.originalUseDesc = value;
    }

    /**
     * Gets the value of the franchiseInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getFranchiseInd() {
        return franchiseInd;
    }

    /**
     * Sets the value of the franchiseInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFranchiseInd(Boolean value) {
        this.franchiseInd = value;
    }

    /**
     * Gets the value of the seasonalInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getSeasonalInd() {
        return seasonalInd;
    }

    /**
     * Sets the value of the seasonalInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSeasonalInd(Boolean value) {
        this.seasonalInd = value;
    }

    /**
     * Gets the value of the hoursOperation property.
     * 
     * @return
     *     possible object is
     *     {@link C50 }
     *     
     */
    public C50 getHoursOperation() {
        return hoursOperation;
    }

    /**
     * Sets the value of the hoursOperation property.
     * 
     * @param value
     *     allowed object is
     *     {@link C50 }
     *     
     */
    public void setHoursOperation(C50 value) {
        this.hoursOperation = value;
    }

    /**
     * Gets the value of the receiptsInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the receiptsInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReceiptsInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReceiptsInfoType }
     * 
     * 
     */
    public List<ReceiptsInfoType> getReceiptsInfo() {
        if (receiptsInfo == null) {
            receiptsInfo = new ArrayList<ReceiptsInfoType>();
        }
        return this.receiptsInfo;
    }

    /**
     * Gets the value of the bldgFeatures property.
     * 
     * @return
     *     possible object is
     *     {@link BldgFeaturesType }
     *     
     */
    public BldgFeaturesType getBldgFeatures() {
        return bldgFeatures;
    }

    /**
     * Sets the value of the bldgFeatures property.
     * 
     * @param value
     *     allowed object is
     *     {@link BldgFeaturesType }
     *     
     */
    public void setBldgFeatures(BldgFeaturesType value) {
        this.bldgFeatures = value;
    }

    /**
     * Gets the value of the exposureInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the exposureInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExposureInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExposureInfoType }
     * 
     * 
     */
    public List<ExposureInfoType> getExposureInfo() {
        if (exposureInfo == null) {
            exposureInfo = new ArrayList<ExposureInfoType>();
        }
        return this.exposureInfo;
    }

    /**
     * Gets the value of the liquorInfo property.
     * 
     * @return
     *     possible object is
     *     {@link LiquorInfoType }
     *     
     */
    public LiquorInfoType getLiquorInfo() {
        return liquorInfo;
    }

    /**
     * Sets the value of the liquorInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link LiquorInfoType }
     *     
     */
    public void setLiquorInfo(LiquorInfoType value) {
        this.liquorInfo = value;
    }

    /**
     * Gets the value of the financialInfo property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInfoType }
     *     
     */
    public FinancialInfoType getFinancialInfo() {
        return financialInfo;
    }

    /**
     * Sets the value of the financialInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInfoType }
     *     
     */
    public void setFinancialInfo(FinancialInfoType value) {
        this.financialInfo = value;
    }

    /**
     * Gets the value of the amusementDevicesInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the amusementDevicesInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAmusementDevicesInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AmusementDevicesInfoType }
     * 
     * 
     */
    public List<AmusementDevicesInfoType> getAmusementDevicesInfo() {
        if (amusementDevicesInfo == null) {
            amusementDevicesInfo = new ArrayList<AmusementDevicesInfoType>();
        }
        return this.amusementDevicesInfo;
    }

    /**
     * Gets the value of the vacancyInfo property.
     * 
     * @return
     *     possible object is
     *     {@link VacancyInfoType }
     *     
     */
    public VacancyInfoType getVacancyInfo() {
        return vacancyInfo;
    }

    /**
     * Sets the value of the vacancyInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link VacancyInfoType }
     *     
     */
    public void setVacancyInfo(VacancyInfoType value) {
        this.vacancyInfo = value;
    }

    /**
     * Gets the value of the areaTypeSurroundingsDesc property.
     * 
     * @return
     *     possible object is
     *     {@link C255 }
     *     
     */
    public C255 getAreaTypeSurroundingsDesc() {
        return areaTypeSurroundingsDesc;
    }

    /**
     * Sets the value of the areaTypeSurroundingsDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link C255 }
     *     
     */
    public void setAreaTypeSurroundingsDesc(C255 value) {
        this.areaTypeSurroundingsDesc = value;
    }

    /**
     * Gets the value of the areaTypeSurroundingsCd property.
     * 
     * @return
     *     possible object is
     *     {@link LocationType }
     *     
     */
    public LocationType getAreaTypeSurroundingsCd() {
        return areaTypeSurroundingsCd;
    }

    /**
     * Sets the value of the areaTypeSurroundingsCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationType }
     *     
     */
    public void setAreaTypeSurroundingsCd(LocationType value) {
        this.areaTypeSurroundingsCd = value;
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

}

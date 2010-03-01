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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PCVEH_NoID complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PCVEH_NoID">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}PCBASICVEH_NoID">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}CostNewAmt" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}NumDaysDrivenPerWeek" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}EstimatedAnnualDistance" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}FullTermAmt" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}NetChangeAmt" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}WrittenAmt" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}Displacement" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}Horsepower" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}LeasedVehInd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}LeasedDt" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}LicensePlateEffectiveDt" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}LicensePlateExpirationDt" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}LicensePlateNumber" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}NumCylinders" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}PurchaseDt" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}RegistrationStateProvCd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}TerritoryCd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}VehIdentificationNumber" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}ChassisSerialNumber" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}EngineSerialNumber" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}TransmissionSerialNumber" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}ColorCd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}VehSymbolCd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}AdditionalInterest" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}Color" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}GrossVehOrCombinedWeight" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}InspectionInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}RateSubClassCd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}VehRateGroupInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}ItemModificationInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}ExistingUnrepairedDamageInfo" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}ExistingUnrepairedDamageDesc" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PCVEH_NoID", propOrder = {
    "costNewAmt",
    "numDaysDrivenPerWeek",
    "estimatedAnnualDistance",
    "fullTermAmt",
    "netChangeAmt",
    "writtenAmt",
    "displacement",
    "horsepower",
    "leasedVehInd",
    "leasedDt",
    "licensePlateEffectiveDt",
    "licensePlateExpirationDt",
    "licensePlateNumber",
    "numCylinders",
    "purchaseDt",
    "registrationStateProvCd",
    "territoryCd",
    "vehIdentificationNumber",
    "chassisSerialNumber",
    "engineSerialNumber",
    "transmissionSerialNumber",
    "colorCd",
    "vehSymbolCd",
    "additionalInterest",
    "color",
    "grossVehOrCombinedWeight",
    "inspectionInfo",
    "rateSubClassCd",
    "vehRateGroupInfo",
    "itemModificationInfo",
    "existingUnrepairedDamageInfo",
    "existingUnrepairedDamageDesc"
})
public class PCVEHNoID
    extends PCBASICVEHNoID
{

    @XmlElement(name = "CostNewAmt")
    protected CURRENCY costNewAmt;
    @XmlElement(name = "NumDaysDrivenPerWeek")
    protected Long numDaysDrivenPerWeek;
    @XmlElement(name = "EstimatedAnnualDistance")
    protected MEASUREMENT estimatedAnnualDistance;
    @XmlElement(name = "FullTermAmt")
    protected CURRENCY fullTermAmt;
    @XmlElement(name = "NetChangeAmt")
    protected CURRENCY netChangeAmt;
    @XmlElement(name = "WrittenAmt")
    protected CURRENCY writtenAmt;
    @XmlElement(name = "Displacement")
    protected MEASUREMENT displacement;
    @XmlElement(name = "Horsepower")
    protected MEASUREMENT horsepower;
    @XmlElement(name = "LeasedVehInd")
    protected Boolean leasedVehInd;
    @XmlElement(name = "LeasedDt")
    protected Date leasedDt;
    @XmlElement(name = "LicensePlateEffectiveDt")
    protected Date licensePlateEffectiveDt;
    @XmlElement(name = "LicensePlateExpirationDt")
    protected Date licensePlateExpirationDt;
    @XmlElement(name = "LicensePlateNumber")
    protected C10 licensePlateNumber;
    @XmlElement(name = "NumCylinders")
    protected Long numCylinders;
    @XmlElement(name = "PurchaseDt")
    protected Date purchaseDt;
    @XmlElement(name = "RegistrationStateProvCd")
    protected OpenEnum registrationStateProvCd;
    @XmlElement(name = "TerritoryCd")
    protected OpenEnum territoryCd;
    @XmlElement(name = "VehIdentificationNumber")
    protected C25 vehIdentificationNumber;
    @XmlElement(name = "ChassisSerialNumber")
    protected C50 chassisSerialNumber;
    @XmlElement(name = "EngineSerialNumber")
    protected C50 engineSerialNumber;
    @XmlElement(name = "TransmissionSerialNumber")
    protected C50 transmissionSerialNumber;
    @XmlElement(name = "ColorCd")
    protected OpenEnum colorCd;
    @XmlElement(name = "VehSymbolCd")
    protected OpenEnum vehSymbolCd;
    @XmlElement(name = "AdditionalInterest")
    protected List<AdditionalInterestType> additionalInterest;
    @XmlElement(name = "Color")
    protected C25 color;
    @XmlElement(name = "GrossVehOrCombinedWeight")
    protected MEASUREMENT grossVehOrCombinedWeight;
    @XmlElement(name = "InspectionInfo")
    protected List<InspectionInfoType> inspectionInfo;
    @XmlElement(name = "RateSubClassCd")
    protected OpenEnum rateSubClassCd;
    @XmlElement(name = "VehRateGroupInfo")
    protected List<VehRateGroupInfoType> vehRateGroupInfo;
    @XmlElement(name = "ItemModificationInfo")
    protected List<ItemModificationInfoType> itemModificationInfo;
    @XmlElement(name = "ExistingUnrepairedDamageInfo")
    protected ExistingUnrepairedDamageInfoType existingUnrepairedDamageInfo;
    @XmlElement(name = "ExistingUnrepairedDamageDesc")
    protected C255 existingUnrepairedDamageDesc;

    /**
     * Gets the value of the costNewAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CURRENCY }
     *     
     */
    public CURRENCY getCostNewAmt() {
        return costNewAmt;
    }

    /**
     * Sets the value of the costNewAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CURRENCY }
     *     
     */
    public void setCostNewAmt(CURRENCY value) {
        this.costNewAmt = value;
    }

    /**
     * Gets the value of the numDaysDrivenPerWeek property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumDaysDrivenPerWeek() {
        return numDaysDrivenPerWeek;
    }

    /**
     * Sets the value of the numDaysDrivenPerWeek property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumDaysDrivenPerWeek(Long value) {
        this.numDaysDrivenPerWeek = value;
    }

    /**
     * Gets the value of the estimatedAnnualDistance property.
     * 
     * @return
     *     possible object is
     *     {@link MEASUREMENT }
     *     
     */
    public MEASUREMENT getEstimatedAnnualDistance() {
        return estimatedAnnualDistance;
    }

    /**
     * Sets the value of the estimatedAnnualDistance property.
     * 
     * @param value
     *     allowed object is
     *     {@link MEASUREMENT }
     *     
     */
    public void setEstimatedAnnualDistance(MEASUREMENT value) {
        this.estimatedAnnualDistance = value;
    }

    /**
     * Gets the value of the fullTermAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CURRENCY }
     *     
     */
    public CURRENCY getFullTermAmt() {
        return fullTermAmt;
    }

    /**
     * Sets the value of the fullTermAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CURRENCY }
     *     
     */
    public void setFullTermAmt(CURRENCY value) {
        this.fullTermAmt = value;
    }

    /**
     * Gets the value of the netChangeAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CURRENCY }
     *     
     */
    public CURRENCY getNetChangeAmt() {
        return netChangeAmt;
    }

    /**
     * Sets the value of the netChangeAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CURRENCY }
     *     
     */
    public void setNetChangeAmt(CURRENCY value) {
        this.netChangeAmt = value;
    }

    /**
     * Gets the value of the writtenAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CURRENCY }
     *     
     */
    public CURRENCY getWrittenAmt() {
        return writtenAmt;
    }

    /**
     * Sets the value of the writtenAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CURRENCY }
     *     
     */
    public void setWrittenAmt(CURRENCY value) {
        this.writtenAmt = value;
    }

    /**
     * Gets the value of the displacement property.
     * 
     * @return
     *     possible object is
     *     {@link MEASUREMENT }
     *     
     */
    public MEASUREMENT getDisplacement() {
        return displacement;
    }

    /**
     * Sets the value of the displacement property.
     * 
     * @param value
     *     allowed object is
     *     {@link MEASUREMENT }
     *     
     */
    public void setDisplacement(MEASUREMENT value) {
        this.displacement = value;
    }

    /**
     * Gets the value of the horsepower property.
     * 
     * @return
     *     possible object is
     *     {@link MEASUREMENT }
     *     
     */
    public MEASUREMENT getHorsepower() {
        return horsepower;
    }

    /**
     * Sets the value of the horsepower property.
     * 
     * @param value
     *     allowed object is
     *     {@link MEASUREMENT }
     *     
     */
    public void setHorsepower(MEASUREMENT value) {
        this.horsepower = value;
    }

    /**
     * Gets the value of the leasedVehInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getLeasedVehInd() {
        return leasedVehInd;
    }

    /**
     * Sets the value of the leasedVehInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLeasedVehInd(Boolean value) {
        this.leasedVehInd = value;
    }

    /**
     * Gets the value of the leasedDt property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getLeasedDt() {
        return leasedDt;
    }

    /**
     * Sets the value of the leasedDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setLeasedDt(Date value) {
        this.leasedDt = value;
    }

    /**
     * Gets the value of the licensePlateEffectiveDt property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getLicensePlateEffectiveDt() {
        return licensePlateEffectiveDt;
    }

    /**
     * Sets the value of the licensePlateEffectiveDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setLicensePlateEffectiveDt(Date value) {
        this.licensePlateEffectiveDt = value;
    }

    /**
     * Gets the value of the licensePlateExpirationDt property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getLicensePlateExpirationDt() {
        return licensePlateExpirationDt;
    }

    /**
     * Sets the value of the licensePlateExpirationDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setLicensePlateExpirationDt(Date value) {
        this.licensePlateExpirationDt = value;
    }

    /**
     * Gets the value of the licensePlateNumber property.
     * 
     * @return
     *     possible object is
     *     {@link C10 }
     *     
     */
    public C10 getLicensePlateNumber() {
        return licensePlateNumber;
    }

    /**
     * Sets the value of the licensePlateNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link C10 }
     *     
     */
    public void setLicensePlateNumber(C10 value) {
        this.licensePlateNumber = value;
    }

    /**
     * Gets the value of the numCylinders property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumCylinders() {
        return numCylinders;
    }

    /**
     * Sets the value of the numCylinders property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumCylinders(Long value) {
        this.numCylinders = value;
    }

    /**
     * Gets the value of the purchaseDt property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getPurchaseDt() {
        return purchaseDt;
    }

    /**
     * Sets the value of the purchaseDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setPurchaseDt(Date value) {
        this.purchaseDt = value;
    }

    /**
     * Gets the value of the registrationStateProvCd property.
     * 
     * @return
     *     possible object is
     *     {@link OpenEnum }
     *     
     */
    public OpenEnum getRegistrationStateProvCd() {
        return registrationStateProvCd;
    }

    /**
     * Sets the value of the registrationStateProvCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpenEnum }
     *     
     */
    public void setRegistrationStateProvCd(OpenEnum value) {
        this.registrationStateProvCd = value;
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
     * Gets the value of the vehIdentificationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link C25 }
     *     
     */
    public C25 getVehIdentificationNumber() {
        return vehIdentificationNumber;
    }

    /**
     * Sets the value of the vehIdentificationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link C25 }
     *     
     */
    public void setVehIdentificationNumber(C25 value) {
        this.vehIdentificationNumber = value;
    }

    /**
     * Gets the value of the chassisSerialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link C50 }
     *     
     */
    public C50 getChassisSerialNumber() {
        return chassisSerialNumber;
    }

    /**
     * Sets the value of the chassisSerialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link C50 }
     *     
     */
    public void setChassisSerialNumber(C50 value) {
        this.chassisSerialNumber = value;
    }

    /**
     * Gets the value of the engineSerialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link C50 }
     *     
     */
    public C50 getEngineSerialNumber() {
        return engineSerialNumber;
    }

    /**
     * Sets the value of the engineSerialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link C50 }
     *     
     */
    public void setEngineSerialNumber(C50 value) {
        this.engineSerialNumber = value;
    }

    /**
     * Gets the value of the transmissionSerialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link C50 }
     *     
     */
    public C50 getTransmissionSerialNumber() {
        return transmissionSerialNumber;
    }

    /**
     * Sets the value of the transmissionSerialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link C50 }
     *     
     */
    public void setTransmissionSerialNumber(C50 value) {
        this.transmissionSerialNumber = value;
    }

    /**
     * Gets the value of the colorCd property.
     * 
     * @return
     *     possible object is
     *     {@link OpenEnum }
     *     
     */
    public OpenEnum getColorCd() {
        return colorCd;
    }

    /**
     * Sets the value of the colorCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpenEnum }
     *     
     */
    public void setColorCd(OpenEnum value) {
        this.colorCd = value;
    }

    /**
     * Gets the value of the vehSymbolCd property.
     * 
     * @return
     *     possible object is
     *     {@link OpenEnum }
     *     
     */
    public OpenEnum getVehSymbolCd() {
        return vehSymbolCd;
    }

    /**
     * Sets the value of the vehSymbolCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpenEnum }
     *     
     */
    public void setVehSymbolCd(OpenEnum value) {
        this.vehSymbolCd = value;
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
     * Gets the value of the color property.
     * 
     * @return
     *     possible object is
     *     {@link C25 }
     *     
     */
    public C25 getColor() {
        return color;
    }

    /**
     * Sets the value of the color property.
     * 
     * @param value
     *     allowed object is
     *     {@link C25 }
     *     
     */
    public void setColor(C25 value) {
        this.color = value;
    }

    /**
     * Gets the value of the grossVehOrCombinedWeight property.
     * 
     * @return
     *     possible object is
     *     {@link MEASUREMENT }
     *     
     */
    public MEASUREMENT getGrossVehOrCombinedWeight() {
        return grossVehOrCombinedWeight;
    }

    /**
     * Sets the value of the grossVehOrCombinedWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link MEASUREMENT }
     *     
     */
    public void setGrossVehOrCombinedWeight(MEASUREMENT value) {
        this.grossVehOrCombinedWeight = value;
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
     * Gets the value of the rateSubClassCd property.
     * 
     * @return
     *     possible object is
     *     {@link OpenEnum }
     *     
     */
    public OpenEnum getRateSubClassCd() {
        return rateSubClassCd;
    }

    /**
     * Sets the value of the rateSubClassCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpenEnum }
     *     
     */
    public void setRateSubClassCd(OpenEnum value) {
        this.rateSubClassCd = value;
    }

    /**
     * Gets the value of the vehRateGroupInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vehRateGroupInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVehRateGroupInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VehRateGroupInfoType }
     * 
     * 
     */
    public List<VehRateGroupInfoType> getVehRateGroupInfo() {
        if (vehRateGroupInfo == null) {
            vehRateGroupInfo = new ArrayList<VehRateGroupInfoType>();
        }
        return this.vehRateGroupInfo;
    }

    /**
     * Gets the value of the itemModificationInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itemModificationInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItemModificationInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemModificationInfoType }
     * 
     * 
     */
    public List<ItemModificationInfoType> getItemModificationInfo() {
        if (itemModificationInfo == null) {
            itemModificationInfo = new ArrayList<ItemModificationInfoType>();
        }
        return this.itemModificationInfo;
    }

    /**
     * Gets the value of the existingUnrepairedDamageInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ExistingUnrepairedDamageInfoType }
     *     
     */
    public ExistingUnrepairedDamageInfoType getExistingUnrepairedDamageInfo() {
        return existingUnrepairedDamageInfo;
    }

    /**
     * Sets the value of the existingUnrepairedDamageInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExistingUnrepairedDamageInfoType }
     *     
     */
    public void setExistingUnrepairedDamageInfo(ExistingUnrepairedDamageInfoType value) {
        this.existingUnrepairedDamageInfo = value;
    }

    /**
     * Gets the value of the existingUnrepairedDamageDesc property.
     * 
     * @return
     *     possible object is
     *     {@link C255 }
     *     
     */
    public C255 getExistingUnrepairedDamageDesc() {
        return existingUnrepairedDamageDesc;
    }

    /**
     * Sets the value of the existingUnrepairedDamageDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link C255 }
     *     
     */
    public void setExistingUnrepairedDamageDesc(C255 value) {
        this.existingUnrepairedDamageDesc = value;
    }

}
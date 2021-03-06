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
 * <p>Java class for OtherOrPriorPolicy_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OtherOrPriorPolicy_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}PolicyCd"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}PolicyTypeCd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}NameInfo" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}PolicyNumber" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}LOBCd"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}LOBSubCd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}NAICCd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}InsurerName" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}ContractTerm" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}OriginalInceptionDt" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}CurrentRetroactiveDt" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}PolicyTerminatedCd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}PolicyTerminatedReasonDesc" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}PolicyTransferInd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}LengthTimeWithPreviousInsurer" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}Coverage" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}PolicyAmt" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}MinimumEarnedPremiumAmt" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}MinimumEarnedPct" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}RatingFactor" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}CompanyProductCd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}ConvictionDt" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}PriorInsurerReportDt" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}ReasonForTransferCd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}FloodWindPolicyInfo" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}ClaimsMadeInfo" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}ExperienceModInd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}ClaimHistoryReportStatusCd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}FirstDollarDefenseInd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}NumLosses" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}LossesDesc" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}TotalPaidLossesAmt" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}ReserveTotalAmt" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}CancelDeclineDt" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}CLUERefNumber" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}ID" />
 *       &lt;attribute name="DriverRef" type="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}IDREF" />
 *       &lt;attribute name="DriverNameRef" type="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}IDREF" />
 *       &lt;attribute name="InsuredNameRef" type="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}IDREF" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OtherOrPriorPolicy_Type", propOrder = {
    "policyCd",
    "policyTypeCd",
    "nameInfo",
    "policyNumber",
    "lobCd",
    "lobSubCd",
    "naicCd",
    "insurerName",
    "contractTerm",
    "originalInceptionDt",
    "currentRetroactiveDt",
    "policyTerminatedCd",
    "policyTerminatedReasonDesc",
    "policyTransferInd",
    "lengthTimeWithPreviousInsurer",
    "coverage",
    "policyAmt",
    "minimumEarnedPremiumAmt",
    "minimumEarnedPct",
    "ratingFactor",
    "companyProductCd",
    "convictionDt",
    "priorInsurerReportDt",
    "reasonForTransferCd",
    "floodWindPolicyInfo",
    "claimsMadeInfo",
    "experienceModInd",
    "claimHistoryReportStatusCd",
    "firstDollarDefenseInd",
    "numLosses",
    "lossesDesc",
    "totalPaidLossesAmt",
    "reserveTotalAmt",
    "cancelDeclineDt",
    "clueRefNumber"
})
public class OtherOrPriorPolicyType {

    @XmlElement(name = "PolicyCd", required = true)
    protected OtherPolicyType policyCd;
    @XmlElement(name = "PolicyTypeCd")
    protected PolicyType policyTypeCd;
    @XmlElement(name = "NameInfo")
    protected NameInfoType nameInfo;
    @XmlElement(name = "PolicyNumber")
    protected C25 policyNumber;
    @XmlElement(name = "LOBCd", required = true)
    protected LineOfBusiness lobCd;
    @XmlElement(name = "LOBSubCd")
    protected LineOfBusinessSubCode lobSubCd;
    @XmlElement(name = "NAICCd")
    protected OpenEnum naicCd;
    @XmlElement(name = "InsurerName")
    protected C255 insurerName;
    @XmlElement(name = "ContractTerm")
    protected DURATION contractTerm;
    @XmlElement(name = "OriginalInceptionDt")
    protected Date originalInceptionDt;
    @XmlElement(name = "CurrentRetroactiveDt")
    protected Date currentRetroactiveDt;
    @XmlElement(name = "PolicyTerminatedCd")
    protected ReasonTerminated policyTerminatedCd;
    @XmlElement(name = "PolicyTerminatedReasonDesc")
    protected CInfinite policyTerminatedReasonDesc;
    @XmlElement(name = "PolicyTransferInd")
    protected Boolean policyTransferInd;
    @XmlElement(name = "LengthTimeWithPreviousInsurer")
    protected MEASUREMENT lengthTimeWithPreviousInsurer;
    @XmlElement(name = "Coverage")
    protected List<CoverageType> coverage;
    @XmlElement(name = "PolicyAmt")
    protected CURRENCY policyAmt;
    @XmlElement(name = "MinimumEarnedPremiumAmt")
    protected CURRENCY minimumEarnedPremiumAmt;
    @XmlElement(name = "MinimumEarnedPct")
    protected PercentDecimal minimumEarnedPct;
    @XmlElement(name = "RatingFactor")
    protected Decimal ratingFactor;
    @XmlElement(name = "CompanyProductCd")
    protected OpenEnum companyProductCd;
    @XmlElement(name = "ConvictionDt")
    protected Date convictionDt;
    @XmlElement(name = "PriorInsurerReportDt")
    protected Date priorInsurerReportDt;
    @XmlElement(name = "ReasonForTransferCd")
    protected ReasonForTransfer reasonForTransferCd;
    @XmlElement(name = "FloodWindPolicyInfo")
    protected FloodWindPolicyInfoType floodWindPolicyInfo;
    @XmlElement(name = "ClaimsMadeInfo")
    protected ClaimsMadeInfoType claimsMadeInfo;
    @XmlElement(name = "ExperienceModInd")
    protected Boolean experienceModInd;
    @XmlElement(name = "ClaimHistoryReportStatusCd")
    protected ClaimHistoryReportStatus claimHistoryReportStatusCd;
    @XmlElement(name = "FirstDollarDefenseInd")
    protected Boolean firstDollarDefenseInd;
    @XmlElement(name = "NumLosses")
    protected Long numLosses;
    @XmlElement(name = "LossesDesc")
    protected CInfinite lossesDesc;
    @XmlElement(name = "TotalPaidLossesAmt")
    protected CURRENCY totalPaidLossesAmt;
    @XmlElement(name = "ReserveTotalAmt")
    protected CURRENCY reserveTotalAmt;
    @XmlElement(name = "CancelDeclineDt")
    protected Date cancelDeclineDt;
    @XmlElement(name = "CLUERefNumber")
    protected AssignedIdentifier clueRefNumber;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;
    @XmlAttribute(name = "DriverRef")
    @XmlIDREF
    protected Object driverRef;
    @XmlAttribute(name = "DriverNameRef")
    @XmlIDREF
    protected Object driverNameRef;
    @XmlAttribute(name = "InsuredNameRef")
    @XmlIDREF
    protected Object insuredNameRef;

    /**
     * Gets the value of the policyCd property.
     * 
     * @return
     *     possible object is
     *     {@link OtherPolicyType }
     *     
     */
    public OtherPolicyType getPolicyCd() {
        return policyCd;
    }

    /**
     * Sets the value of the policyCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherPolicyType }
     *     
     */
    public void setPolicyCd(OtherPolicyType value) {
        this.policyCd = value;
    }

    /**
     * Gets the value of the policyTypeCd property.
     * 
     * @return
     *     possible object is
     *     {@link PolicyType }
     *     
     */
    public PolicyType getPolicyTypeCd() {
        return policyTypeCd;
    }

    /**
     * Sets the value of the policyTypeCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link PolicyType }
     *     
     */
    public void setPolicyTypeCd(PolicyType value) {
        this.policyTypeCd = value;
    }

    /**
     * Gets the value of the nameInfo property.
     * 
     * @return
     *     possible object is
     *     {@link NameInfoType }
     *     
     */
    public NameInfoType getNameInfo() {
        return nameInfo;
    }

    /**
     * Sets the value of the nameInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameInfoType }
     *     
     */
    public void setNameInfo(NameInfoType value) {
        this.nameInfo = value;
    }

    /**
     * Gets the value of the policyNumber property.
     * 
     * @return
     *     possible object is
     *     {@link C25 }
     *     
     */
    public C25 getPolicyNumber() {
        return policyNumber;
    }

    /**
     * Sets the value of the policyNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link C25 }
     *     
     */
    public void setPolicyNumber(C25 value) {
        this.policyNumber = value;
    }

    /**
     * Gets the value of the lobCd property.
     * 
     * @return
     *     possible object is
     *     {@link LineOfBusiness }
     *     
     */
    public LineOfBusiness getLOBCd() {
        return lobCd;
    }

    /**
     * Sets the value of the lobCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link LineOfBusiness }
     *     
     */
    public void setLOBCd(LineOfBusiness value) {
        this.lobCd = value;
    }

    /**
     * Gets the value of the lobSubCd property.
     * 
     * @return
     *     possible object is
     *     {@link LineOfBusinessSubCode }
     *     
     */
    public LineOfBusinessSubCode getLOBSubCd() {
        return lobSubCd;
    }

    /**
     * Sets the value of the lobSubCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link LineOfBusinessSubCode }
     *     
     */
    public void setLOBSubCd(LineOfBusinessSubCode value) {
        this.lobSubCd = value;
    }

    /**
     * Gets the value of the naicCd property.
     * 
     * @return
     *     possible object is
     *     {@link OpenEnum }
     *     
     */
    public OpenEnum getNAICCd() {
        return naicCd;
    }

    /**
     * Sets the value of the naicCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpenEnum }
     *     
     */
    public void setNAICCd(OpenEnum value) {
        this.naicCd = value;
    }

    /**
     * Gets the value of the insurerName property.
     * 
     * @return
     *     possible object is
     *     {@link C255 }
     *     
     */
    public C255 getInsurerName() {
        return insurerName;
    }

    /**
     * Sets the value of the insurerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link C255 }
     *     
     */
    public void setInsurerName(C255 value) {
        this.insurerName = value;
    }

    /**
     * Gets the value of the contractTerm property.
     * 
     * @return
     *     possible object is
     *     {@link DURATION }
     *     
     */
    public DURATION getContractTerm() {
        return contractTerm;
    }

    /**
     * Sets the value of the contractTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link DURATION }
     *     
     */
    public void setContractTerm(DURATION value) {
        this.contractTerm = value;
    }

    /**
     * Gets the value of the originalInceptionDt property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getOriginalInceptionDt() {
        return originalInceptionDt;
    }

    /**
     * Sets the value of the originalInceptionDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setOriginalInceptionDt(Date value) {
        this.originalInceptionDt = value;
    }

    /**
     * Gets the value of the currentRetroactiveDt property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getCurrentRetroactiveDt() {
        return currentRetroactiveDt;
    }

    /**
     * Sets the value of the currentRetroactiveDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setCurrentRetroactiveDt(Date value) {
        this.currentRetroactiveDt = value;
    }

    /**
     * Gets the value of the policyTerminatedCd property.
     * 
     * @return
     *     possible object is
     *     {@link ReasonTerminated }
     *     
     */
    public ReasonTerminated getPolicyTerminatedCd() {
        return policyTerminatedCd;
    }

    /**
     * Sets the value of the policyTerminatedCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReasonTerminated }
     *     
     */
    public void setPolicyTerminatedCd(ReasonTerminated value) {
        this.policyTerminatedCd = value;
    }

    /**
     * Gets the value of the policyTerminatedReasonDesc property.
     * 
     * @return
     *     possible object is
     *     {@link CInfinite }
     *     
     */
    public CInfinite getPolicyTerminatedReasonDesc() {
        return policyTerminatedReasonDesc;
    }

    /**
     * Sets the value of the policyTerminatedReasonDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CInfinite }
     *     
     */
    public void setPolicyTerminatedReasonDesc(CInfinite value) {
        this.policyTerminatedReasonDesc = value;
    }

    /**
     * Gets the value of the policyTransferInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getPolicyTransferInd() {
        return policyTransferInd;
    }

    /**
     * Sets the value of the policyTransferInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPolicyTransferInd(Boolean value) {
        this.policyTransferInd = value;
    }

    /**
     * Gets the value of the lengthTimeWithPreviousInsurer property.
     * 
     * @return
     *     possible object is
     *     {@link MEASUREMENT }
     *     
     */
    public MEASUREMENT getLengthTimeWithPreviousInsurer() {
        return lengthTimeWithPreviousInsurer;
    }

    /**
     * Sets the value of the lengthTimeWithPreviousInsurer property.
     * 
     * @param value
     *     allowed object is
     *     {@link MEASUREMENT }
     *     
     */
    public void setLengthTimeWithPreviousInsurer(MEASUREMENT value) {
        this.lengthTimeWithPreviousInsurer = value;
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
     * Gets the value of the policyAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CURRENCY }
     *     
     */
    public CURRENCY getPolicyAmt() {
        return policyAmt;
    }

    /**
     * Sets the value of the policyAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CURRENCY }
     *     
     */
    public void setPolicyAmt(CURRENCY value) {
        this.policyAmt = value;
    }

    /**
     * Gets the value of the minimumEarnedPremiumAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CURRENCY }
     *     
     */
    public CURRENCY getMinimumEarnedPremiumAmt() {
        return minimumEarnedPremiumAmt;
    }

    /**
     * Sets the value of the minimumEarnedPremiumAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CURRENCY }
     *     
     */
    public void setMinimumEarnedPremiumAmt(CURRENCY value) {
        this.minimumEarnedPremiumAmt = value;
    }

    /**
     * Gets the value of the minimumEarnedPct property.
     * 
     * @return
     *     possible object is
     *     {@link PercentDecimal }
     *     
     */
    public PercentDecimal getMinimumEarnedPct() {
        return minimumEarnedPct;
    }

    /**
     * Sets the value of the minimumEarnedPct property.
     * 
     * @param value
     *     allowed object is
     *     {@link PercentDecimal }
     *     
     */
    public void setMinimumEarnedPct(PercentDecimal value) {
        this.minimumEarnedPct = value;
    }

    /**
     * Gets the value of the ratingFactor property.
     * 
     * @return
     *     possible object is
     *     {@link Decimal }
     *     
     */
    public Decimal getRatingFactor() {
        return ratingFactor;
    }

    /**
     * Sets the value of the ratingFactor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Decimal }
     *     
     */
    public void setRatingFactor(Decimal value) {
        this.ratingFactor = value;
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
     * Gets the value of the convictionDt property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getConvictionDt() {
        return convictionDt;
    }

    /**
     * Sets the value of the convictionDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setConvictionDt(Date value) {
        this.convictionDt = value;
    }

    /**
     * Gets the value of the priorInsurerReportDt property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getPriorInsurerReportDt() {
        return priorInsurerReportDt;
    }

    /**
     * Sets the value of the priorInsurerReportDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setPriorInsurerReportDt(Date value) {
        this.priorInsurerReportDt = value;
    }

    /**
     * Gets the value of the reasonForTransferCd property.
     * 
     * @return
     *     possible object is
     *     {@link ReasonForTransfer }
     *     
     */
    public ReasonForTransfer getReasonForTransferCd() {
        return reasonForTransferCd;
    }

    /**
     * Sets the value of the reasonForTransferCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReasonForTransfer }
     *     
     */
    public void setReasonForTransferCd(ReasonForTransfer value) {
        this.reasonForTransferCd = value;
    }

    /**
     * Gets the value of the floodWindPolicyInfo property.
     * 
     * @return
     *     possible object is
     *     {@link FloodWindPolicyInfoType }
     *     
     */
    public FloodWindPolicyInfoType getFloodWindPolicyInfo() {
        return floodWindPolicyInfo;
    }

    /**
     * Sets the value of the floodWindPolicyInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link FloodWindPolicyInfoType }
     *     
     */
    public void setFloodWindPolicyInfo(FloodWindPolicyInfoType value) {
        this.floodWindPolicyInfo = value;
    }

    /**
     * Gets the value of the claimsMadeInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ClaimsMadeInfoType }
     *     
     */
    public ClaimsMadeInfoType getClaimsMadeInfo() {
        return claimsMadeInfo;
    }

    /**
     * Sets the value of the claimsMadeInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClaimsMadeInfoType }
     *     
     */
    public void setClaimsMadeInfo(ClaimsMadeInfoType value) {
        this.claimsMadeInfo = value;
    }

    /**
     * Gets the value of the experienceModInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getExperienceModInd() {
        return experienceModInd;
    }

    /**
     * Sets the value of the experienceModInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExperienceModInd(Boolean value) {
        this.experienceModInd = value;
    }

    /**
     * Gets the value of the claimHistoryReportStatusCd property.
     * 
     * @return
     *     possible object is
     *     {@link ClaimHistoryReportStatus }
     *     
     */
    public ClaimHistoryReportStatus getClaimHistoryReportStatusCd() {
        return claimHistoryReportStatusCd;
    }

    /**
     * Sets the value of the claimHistoryReportStatusCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClaimHistoryReportStatus }
     *     
     */
    public void setClaimHistoryReportStatusCd(ClaimHistoryReportStatus value) {
        this.claimHistoryReportStatusCd = value;
    }

    /**
     * Gets the value of the firstDollarDefenseInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getFirstDollarDefenseInd() {
        return firstDollarDefenseInd;
    }

    /**
     * Sets the value of the firstDollarDefenseInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFirstDollarDefenseInd(Boolean value) {
        this.firstDollarDefenseInd = value;
    }

    /**
     * Gets the value of the numLosses property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumLosses() {
        return numLosses;
    }

    /**
     * Sets the value of the numLosses property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumLosses(Long value) {
        this.numLosses = value;
    }

    /**
     * Gets the value of the lossesDesc property.
     * 
     * @return
     *     possible object is
     *     {@link CInfinite }
     *     
     */
    public CInfinite getLossesDesc() {
        return lossesDesc;
    }

    /**
     * Sets the value of the lossesDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CInfinite }
     *     
     */
    public void setLossesDesc(CInfinite value) {
        this.lossesDesc = value;
    }

    /**
     * Gets the value of the totalPaidLossesAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CURRENCY }
     *     
     */
    public CURRENCY getTotalPaidLossesAmt() {
        return totalPaidLossesAmt;
    }

    /**
     * Sets the value of the totalPaidLossesAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CURRENCY }
     *     
     */
    public void setTotalPaidLossesAmt(CURRENCY value) {
        this.totalPaidLossesAmt = value;
    }

    /**
     * Gets the value of the reserveTotalAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CURRENCY }
     *     
     */
    public CURRENCY getReserveTotalAmt() {
        return reserveTotalAmt;
    }

    /**
     * Sets the value of the reserveTotalAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CURRENCY }
     *     
     */
    public void setReserveTotalAmt(CURRENCY value) {
        this.reserveTotalAmt = value;
    }

    /**
     * Gets the value of the cancelDeclineDt property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getCancelDeclineDt() {
        return cancelDeclineDt;
    }

    /**
     * Sets the value of the cancelDeclineDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setCancelDeclineDt(Date value) {
        this.cancelDeclineDt = value;
    }

    /**
     * Gets the value of the clueRefNumber property.
     * 
     * @return
     *     possible object is
     *     {@link AssignedIdentifier }
     *     
     */
    public AssignedIdentifier getCLUERefNumber() {
        return clueRefNumber;
    }

    /**
     * Sets the value of the clueRefNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssignedIdentifier }
     *     
     */
    public void setCLUERefNumber(AssignedIdentifier value) {
        this.clueRefNumber = value;
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
     * Gets the value of the driverRef property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getDriverRef() {
        return driverRef;
    }

    /**
     * Sets the value of the driverRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setDriverRef(Object value) {
        this.driverRef = value;
    }

    /**
     * Gets the value of the driverNameRef property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getDriverNameRef() {
        return driverNameRef;
    }

    /**
     * Sets the value of the driverNameRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setDriverNameRef(Object value) {
        this.driverNameRef = value;
    }

    /**
     * Gets the value of the insuredNameRef property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getInsuredNameRef() {
        return insuredNameRef;
    }

    /**
     * Sets the value of the insuredNameRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setInsuredNameRef(Object value) {
        this.insuredNameRef = value;
    }

}

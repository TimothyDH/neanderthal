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
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for CommlPolicySupplement_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommlPolicySupplement_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}AuditInd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}ReportingPeriodCd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}BusinessStartDt" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}CatastropheInd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}CounterSignatureInd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}OperationsDesc" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}GeneralLiabilityCd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}NatureBusinessCd" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}NumEmployees" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}PolicyTypeCd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}SubsidiariesCoverageNeededInd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}CommlParentOrSubsidiaryInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}FarmRanchTypeCd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}LengthTimeInBusiness" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}AnnualSalesAmt" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}TotalPayrollAmt" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}PriorYearTotalPayrollAmt" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}SelfInsuredInd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}AuditFrequencyCd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}ProposedRetroactiveDt" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}CreditOrSurcharge" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}MiscParty" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}AffiliationInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}ClaimsMadeInfo" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}SubsidiariesNatureBusinessCd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}AnimalInoculationInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}SafetyManualInd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}SafetyPositionInd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}MonthlySafetyMeetingInd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}OSHASafetyProgramInd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}OtherSafetyProgramInd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}CancelReasonCd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}ConditionCorrectedInd" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}ID" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommlPolicySupplement_Type", propOrder = {
    "auditInd",
    "reportingPeriodCd",
    "businessStartDt",
    "catastropheInd",
    "counterSignatureInd",
    "operationsDesc",
    "generalLiabilityCd",
    "natureBusinessCd",
    "numEmployees",
    "policyTypeCd",
    "subsidiariesCoverageNeededInd",
    "commlParentOrSubsidiaryInfo",
    "farmRanchTypeCd",
    "lengthTimeInBusiness",
    "annualSalesAmt",
    "totalPayrollAmt",
    "priorYearTotalPayrollAmt",
    "selfInsuredInd",
    "auditFrequencyCd",
    "proposedRetroactiveDt",
    "creditOrSurcharge",
    "miscParty",
    "affiliationInfo",
    "claimsMadeInfo",
    "subsidiariesNatureBusinessCd",
    "animalInoculationInfo",
    "safetyManualInd",
    "safetyPositionInd",
    "monthlySafetyMeetingInd",
    "oshaSafetyProgramInd",
    "otherSafetyProgramInd",
    "cancelReasonCd",
    "conditionCorrectedInd"
})
public class CommlPolicySupplementType {

    @XmlElement(name = "AuditInd")
    protected Boolean auditInd;
    @XmlElement(name = "ReportingPeriodCd")
    protected Frequency reportingPeriodCd;
    @XmlElement(name = "BusinessStartDt")
    protected Date businessStartDt;
    @XmlElement(name = "CatastropheInd")
    protected Boolean catastropheInd;
    @XmlElement(name = "CounterSignatureInd")
    protected Boolean counterSignatureInd;
    @XmlElement(name = "OperationsDesc")
    protected C255 operationsDesc;
    @XmlElement(name = "GeneralLiabilityCd")
    protected OpenEnum generalLiabilityCd;
    @XmlElement(name = "NatureBusinessCd")
    protected List<NatureOfBusiness> natureBusinessCd;
    @XmlElement(name = "NumEmployees")
    protected Long numEmployees;
    @XmlElement(name = "PolicyTypeCd")
    protected PolicyType policyTypeCd;
    @XmlElement(name = "SubsidiariesCoverageNeededInd")
    protected Boolean subsidiariesCoverageNeededInd;
    @XmlElement(name = "CommlParentOrSubsidiaryInfo")
    protected List<CommlParentOrSubsidiaryInfoType> commlParentOrSubsidiaryInfo;
    @XmlElement(name = "FarmRanchTypeCd")
    protected FarmRanchType farmRanchTypeCd;
    @XmlElement(name = "LengthTimeInBusiness")
    protected MEASUREMENT lengthTimeInBusiness;
    @XmlElement(name = "AnnualSalesAmt")
    protected CURRENCY annualSalesAmt;
    @XmlElement(name = "TotalPayrollAmt")
    protected CURRENCY totalPayrollAmt;
    @XmlElement(name = "PriorYearTotalPayrollAmt")
    protected CURRENCY priorYearTotalPayrollAmt;
    @XmlElement(name = "SelfInsuredInd")
    protected Boolean selfInsuredInd;
    @XmlElement(name = "AuditFrequencyCd")
    protected Frequency auditFrequencyCd;
    @XmlElement(name = "ProposedRetroactiveDt")
    protected Date proposedRetroactiveDt;
    @XmlElement(name = "CreditOrSurcharge")
    protected List<PCCREDITSURCHARGE> creditOrSurcharge;
    @XmlElement(name = "MiscParty")
    protected List<MiscPartyType> miscParty;
    @XmlElement(name = "AffiliationInfo")
    protected List<AffiliationInfoType> affiliationInfo;
    @XmlElement(name = "ClaimsMadeInfo")
    protected ClaimsMadeInfoType claimsMadeInfo;
    @XmlElement(name = "SubsidiariesNatureBusinessCd")
    protected NatureOfBusiness subsidiariesNatureBusinessCd;
    @XmlElement(name = "AnimalInoculationInfo")
    protected List<AnimalInoculationInfoType> animalInoculationInfo;
    @XmlElement(name = "SafetyManualInd")
    protected Boolean safetyManualInd;
    @XmlElement(name = "SafetyPositionInd")
    protected Boolean safetyPositionInd;
    @XmlElement(name = "MonthlySafetyMeetingInd")
    protected Boolean monthlySafetyMeetingInd;
    @XmlElement(name = "OSHASafetyProgramInd")
    protected Boolean oshaSafetyProgramInd;
    @XmlElement(name = "OtherSafetyProgramInd")
    protected Boolean otherSafetyProgramInd;
    @XmlElement(name = "CancelReasonCd")
    protected CancellationReason cancelReasonCd;
    @XmlElement(name = "ConditionCorrectedInd")
    protected Boolean conditionCorrectedInd;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;

    /**
     * Gets the value of the auditInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getAuditInd() {
        return auditInd;
    }

    /**
     * Sets the value of the auditInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAuditInd(Boolean value) {
        this.auditInd = value;
    }

    /**
     * Gets the value of the reportingPeriodCd property.
     * 
     * @return
     *     possible object is
     *     {@link Frequency }
     *     
     */
    public Frequency getReportingPeriodCd() {
        return reportingPeriodCd;
    }

    /**
     * Sets the value of the reportingPeriodCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Frequency }
     *     
     */
    public void setReportingPeriodCd(Frequency value) {
        this.reportingPeriodCd = value;
    }

    /**
     * Gets the value of the businessStartDt property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getBusinessStartDt() {
        return businessStartDt;
    }

    /**
     * Sets the value of the businessStartDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setBusinessStartDt(Date value) {
        this.businessStartDt = value;
    }

    /**
     * Gets the value of the catastropheInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getCatastropheInd() {
        return catastropheInd;
    }

    /**
     * Sets the value of the catastropheInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCatastropheInd(Boolean value) {
        this.catastropheInd = value;
    }

    /**
     * Gets the value of the counterSignatureInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getCounterSignatureInd() {
        return counterSignatureInd;
    }

    /**
     * Sets the value of the counterSignatureInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCounterSignatureInd(Boolean value) {
        this.counterSignatureInd = value;
    }

    /**
     * Gets the value of the operationsDesc property.
     * 
     * @return
     *     possible object is
     *     {@link C255 }
     *     
     */
    public C255 getOperationsDesc() {
        return operationsDesc;
    }

    /**
     * Sets the value of the operationsDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link C255 }
     *     
     */
    public void setOperationsDesc(C255 value) {
        this.operationsDesc = value;
    }

    /**
     * Gets the value of the generalLiabilityCd property.
     * 
     * @return
     *     possible object is
     *     {@link OpenEnum }
     *     
     */
    public OpenEnum getGeneralLiabilityCd() {
        return generalLiabilityCd;
    }

    /**
     * Sets the value of the generalLiabilityCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpenEnum }
     *     
     */
    public void setGeneralLiabilityCd(OpenEnum value) {
        this.generalLiabilityCd = value;
    }

    /**
     * Gets the value of the natureBusinessCd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the natureBusinessCd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNatureBusinessCd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NatureOfBusiness }
     * 
     * 
     */
    public List<NatureOfBusiness> getNatureBusinessCd() {
        if (natureBusinessCd == null) {
            natureBusinessCd = new ArrayList<NatureOfBusiness>();
        }
        return this.natureBusinessCd;
    }

    /**
     * Gets the value of the numEmployees property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumEmployees() {
        return numEmployees;
    }

    /**
     * Sets the value of the numEmployees property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumEmployees(Long value) {
        this.numEmployees = value;
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
     * Gets the value of the subsidiariesCoverageNeededInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getSubsidiariesCoverageNeededInd() {
        return subsidiariesCoverageNeededInd;
    }

    /**
     * Sets the value of the subsidiariesCoverageNeededInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSubsidiariesCoverageNeededInd(Boolean value) {
        this.subsidiariesCoverageNeededInd = value;
    }

    /**
     * Gets the value of the commlParentOrSubsidiaryInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the commlParentOrSubsidiaryInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCommlParentOrSubsidiaryInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommlParentOrSubsidiaryInfoType }
     * 
     * 
     */
    public List<CommlParentOrSubsidiaryInfoType> getCommlParentOrSubsidiaryInfo() {
        if (commlParentOrSubsidiaryInfo == null) {
            commlParentOrSubsidiaryInfo = new ArrayList<CommlParentOrSubsidiaryInfoType>();
        }
        return this.commlParentOrSubsidiaryInfo;
    }

    /**
     * Gets the value of the farmRanchTypeCd property.
     * 
     * @return
     *     possible object is
     *     {@link FarmRanchType }
     *     
     */
    public FarmRanchType getFarmRanchTypeCd() {
        return farmRanchTypeCd;
    }

    /**
     * Sets the value of the farmRanchTypeCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link FarmRanchType }
     *     
     */
    public void setFarmRanchTypeCd(FarmRanchType value) {
        this.farmRanchTypeCd = value;
    }

    /**
     * Gets the value of the lengthTimeInBusiness property.
     * 
     * @return
     *     possible object is
     *     {@link MEASUREMENT }
     *     
     */
    public MEASUREMENT getLengthTimeInBusiness() {
        return lengthTimeInBusiness;
    }

    /**
     * Sets the value of the lengthTimeInBusiness property.
     * 
     * @param value
     *     allowed object is
     *     {@link MEASUREMENT }
     *     
     */
    public void setLengthTimeInBusiness(MEASUREMENT value) {
        this.lengthTimeInBusiness = value;
    }

    /**
     * Gets the value of the annualSalesAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CURRENCY }
     *     
     */
    public CURRENCY getAnnualSalesAmt() {
        return annualSalesAmt;
    }

    /**
     * Sets the value of the annualSalesAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CURRENCY }
     *     
     */
    public void setAnnualSalesAmt(CURRENCY value) {
        this.annualSalesAmt = value;
    }

    /**
     * Gets the value of the totalPayrollAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CURRENCY }
     *     
     */
    public CURRENCY getTotalPayrollAmt() {
        return totalPayrollAmt;
    }

    /**
     * Sets the value of the totalPayrollAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CURRENCY }
     *     
     */
    public void setTotalPayrollAmt(CURRENCY value) {
        this.totalPayrollAmt = value;
    }

    /**
     * Gets the value of the priorYearTotalPayrollAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CURRENCY }
     *     
     */
    public CURRENCY getPriorYearTotalPayrollAmt() {
        return priorYearTotalPayrollAmt;
    }

    /**
     * Sets the value of the priorYearTotalPayrollAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CURRENCY }
     *     
     */
    public void setPriorYearTotalPayrollAmt(CURRENCY value) {
        this.priorYearTotalPayrollAmt = value;
    }

    /**
     * Gets the value of the selfInsuredInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getSelfInsuredInd() {
        return selfInsuredInd;
    }

    /**
     * Sets the value of the selfInsuredInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSelfInsuredInd(Boolean value) {
        this.selfInsuredInd = value;
    }

    /**
     * Gets the value of the auditFrequencyCd property.
     * 
     * @return
     *     possible object is
     *     {@link Frequency }
     *     
     */
    public Frequency getAuditFrequencyCd() {
        return auditFrequencyCd;
    }

    /**
     * Sets the value of the auditFrequencyCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Frequency }
     *     
     */
    public void setAuditFrequencyCd(Frequency value) {
        this.auditFrequencyCd = value;
    }

    /**
     * Gets the value of the proposedRetroactiveDt property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getProposedRetroactiveDt() {
        return proposedRetroactiveDt;
    }

    /**
     * Sets the value of the proposedRetroactiveDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setProposedRetroactiveDt(Date value) {
        this.proposedRetroactiveDt = value;
    }

    /**
     * Gets the value of the creditOrSurcharge property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the creditOrSurcharge property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCreditOrSurcharge().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PCCREDITSURCHARGE }
     * 
     * 
     */
    public List<PCCREDITSURCHARGE> getCreditOrSurcharge() {
        if (creditOrSurcharge == null) {
            creditOrSurcharge = new ArrayList<PCCREDITSURCHARGE>();
        }
        return this.creditOrSurcharge;
    }

    /**
     * Gets the value of the miscParty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the miscParty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMiscParty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MiscPartyType }
     * 
     * 
     */
    public List<MiscPartyType> getMiscParty() {
        if (miscParty == null) {
            miscParty = new ArrayList<MiscPartyType>();
        }
        return this.miscParty;
    }

    /**
     * Gets the value of the affiliationInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the affiliationInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAffiliationInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AffiliationInfoType }
     * 
     * 
     */
    public List<AffiliationInfoType> getAffiliationInfo() {
        if (affiliationInfo == null) {
            affiliationInfo = new ArrayList<AffiliationInfoType>();
        }
        return this.affiliationInfo;
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
     * Gets the value of the subsidiariesNatureBusinessCd property.
     * 
     * @return
     *     possible object is
     *     {@link NatureOfBusiness }
     *     
     */
    public NatureOfBusiness getSubsidiariesNatureBusinessCd() {
        return subsidiariesNatureBusinessCd;
    }

    /**
     * Sets the value of the subsidiariesNatureBusinessCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link NatureOfBusiness }
     *     
     */
    public void setSubsidiariesNatureBusinessCd(NatureOfBusiness value) {
        this.subsidiariesNatureBusinessCd = value;
    }

    /**
     * Gets the value of the animalInoculationInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the animalInoculationInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAnimalInoculationInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AnimalInoculationInfoType }
     * 
     * 
     */
    public List<AnimalInoculationInfoType> getAnimalInoculationInfo() {
        if (animalInoculationInfo == null) {
            animalInoculationInfo = new ArrayList<AnimalInoculationInfoType>();
        }
        return this.animalInoculationInfo;
    }

    /**
     * Gets the value of the safetyManualInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getSafetyManualInd() {
        return safetyManualInd;
    }

    /**
     * Sets the value of the safetyManualInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSafetyManualInd(Boolean value) {
        this.safetyManualInd = value;
    }

    /**
     * Gets the value of the safetyPositionInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getSafetyPositionInd() {
        return safetyPositionInd;
    }

    /**
     * Sets the value of the safetyPositionInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSafetyPositionInd(Boolean value) {
        this.safetyPositionInd = value;
    }

    /**
     * Gets the value of the monthlySafetyMeetingInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getMonthlySafetyMeetingInd() {
        return monthlySafetyMeetingInd;
    }

    /**
     * Sets the value of the monthlySafetyMeetingInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMonthlySafetyMeetingInd(Boolean value) {
        this.monthlySafetyMeetingInd = value;
    }

    /**
     * Gets the value of the oshaSafetyProgramInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getOSHASafetyProgramInd() {
        return oshaSafetyProgramInd;
    }

    /**
     * Sets the value of the oshaSafetyProgramInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOSHASafetyProgramInd(Boolean value) {
        this.oshaSafetyProgramInd = value;
    }

    /**
     * Gets the value of the otherSafetyProgramInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getOtherSafetyProgramInd() {
        return otherSafetyProgramInd;
    }

    /**
     * Sets the value of the otherSafetyProgramInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOtherSafetyProgramInd(Boolean value) {
        this.otherSafetyProgramInd = value;
    }

    /**
     * Gets the value of the cancelReasonCd property.
     * 
     * @return
     *     possible object is
     *     {@link CancellationReason }
     *     
     */
    public CancellationReason getCancelReasonCd() {
        return cancelReasonCd;
    }

    /**
     * Sets the value of the cancelReasonCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancellationReason }
     *     
     */
    public void setCancelReasonCd(CancellationReason value) {
        this.cancelReasonCd = value;
    }

    /**
     * Gets the value of the conditionCorrectedInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getConditionCorrectedInd() {
        return conditionCorrectedInd;
    }

    /**
     * Sets the value of the conditionCorrectedInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setConditionCorrectedInd(Boolean value) {
        this.conditionCorrectedInd = value;
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

}

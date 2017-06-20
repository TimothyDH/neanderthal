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
 * <p>Java class for FinancialResponsibilityFiling_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FinancialResponsibilityFiling_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}FilingRequiredByCd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}FilingCd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}FilingTerm" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}FilingFeeAmt" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}NameInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}FilingOriginalDt" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}FilingReasonCd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}StateProvCd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}ReasonForFilingDesc" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}FilingStatusCd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}IncidentDt" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}FinancialResponsibilityAmt" minOccurs="0"/>
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
@XmlType(name = "FinancialResponsibilityFiling_Type", propOrder = {
    "filingRequiredByCd",
    "filingCd",
    "filingTerm",
    "filingFeeAmt",
    "nameInfo",
    "filingOriginalDt",
    "filingReasonCd",
    "stateProvCd",
    "reasonForFilingDesc",
    "filingStatusCd",
    "incidentDt",
    "financialResponsibilityAmt"
})
public class FinancialResponsibilityFilingType {

    @XmlElement(name = "FilingRequiredByCd")
    protected FilingType filingRequiredByCd;
    @XmlElement(name = "FilingCd")
    protected FinancialResponsibilityFilings filingCd;
    @XmlElement(name = "FilingTerm")
    protected DURATION filingTerm;
    @XmlElement(name = "FilingFeeAmt")
    protected CURRENCY filingFeeAmt;
    @XmlElement(name = "NameInfo")
    protected List<NameInfoType> nameInfo;
    @XmlElement(name = "FilingOriginalDt")
    protected Date filingOriginalDt;
    @XmlElement(name = "FilingReasonCd")
    protected DrivingRecord filingReasonCd;
    @XmlElement(name = "StateProvCd")
    protected OpenEnum stateProvCd;
    @XmlElement(name = "ReasonForFilingDesc")
    protected CInfinite reasonForFilingDesc;
    @XmlElement(name = "FilingStatusCd")
    protected FinancialResponsibilityFilingStatus filingStatusCd;
    @XmlElement(name = "IncidentDt")
    protected Date incidentDt;
    @XmlElement(name = "FinancialResponsibilityAmt")
    protected CURRENCY financialResponsibilityAmt;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;

    /**
     * Gets the value of the filingRequiredByCd property.
     * 
     * @return
     *     possible object is
     *     {@link FilingType }
     *     
     */
    public FilingType getFilingRequiredByCd() {
        return filingRequiredByCd;
    }

    /**
     * Sets the value of the filingRequiredByCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link FilingType }
     *     
     */
    public void setFilingRequiredByCd(FilingType value) {
        this.filingRequiredByCd = value;
    }

    /**
     * Gets the value of the filingCd property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialResponsibilityFilings }
     *     
     */
    public FinancialResponsibilityFilings getFilingCd() {
        return filingCd;
    }

    /**
     * Sets the value of the filingCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialResponsibilityFilings }
     *     
     */
    public void setFilingCd(FinancialResponsibilityFilings value) {
        this.filingCd = value;
    }

    /**
     * Gets the value of the filingTerm property.
     * 
     * @return
     *     possible object is
     *     {@link DURATION }
     *     
     */
    public DURATION getFilingTerm() {
        return filingTerm;
    }

    /**
     * Sets the value of the filingTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link DURATION }
     *     
     */
    public void setFilingTerm(DURATION value) {
        this.filingTerm = value;
    }

    /**
     * Gets the value of the filingFeeAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CURRENCY }
     *     
     */
    public CURRENCY getFilingFeeAmt() {
        return filingFeeAmt;
    }

    /**
     * Sets the value of the filingFeeAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CURRENCY }
     *     
     */
    public void setFilingFeeAmt(CURRENCY value) {
        this.filingFeeAmt = value;
    }

    /**
     * Gets the value of the nameInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nameInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNameInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NameInfoType }
     * 
     * 
     */
    public List<NameInfoType> getNameInfo() {
        if (nameInfo == null) {
            nameInfo = new ArrayList<NameInfoType>();
        }
        return this.nameInfo;
    }

    /**
     * Gets the value of the filingOriginalDt property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getFilingOriginalDt() {
        return filingOriginalDt;
    }

    /**
     * Sets the value of the filingOriginalDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setFilingOriginalDt(Date value) {
        this.filingOriginalDt = value;
    }

    /**
     * Gets the value of the filingReasonCd property.
     * 
     * @return
     *     possible object is
     *     {@link DrivingRecord }
     *     
     */
    public DrivingRecord getFilingReasonCd() {
        return filingReasonCd;
    }

    /**
     * Sets the value of the filingReasonCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link DrivingRecord }
     *     
     */
    public void setFilingReasonCd(DrivingRecord value) {
        this.filingReasonCd = value;
    }

    /**
     * Gets the value of the stateProvCd property.
     * 
     * @return
     *     possible object is
     *     {@link OpenEnum }
     *     
     */
    public OpenEnum getStateProvCd() {
        return stateProvCd;
    }

    /**
     * Sets the value of the stateProvCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpenEnum }
     *     
     */
    public void setStateProvCd(OpenEnum value) {
        this.stateProvCd = value;
    }

    /**
     * Gets the value of the reasonForFilingDesc property.
     * 
     * @return
     *     possible object is
     *     {@link CInfinite }
     *     
     */
    public CInfinite getReasonForFilingDesc() {
        return reasonForFilingDesc;
    }

    /**
     * Sets the value of the reasonForFilingDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CInfinite }
     *     
     */
    public void setReasonForFilingDesc(CInfinite value) {
        this.reasonForFilingDesc = value;
    }

    /**
     * Gets the value of the filingStatusCd property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialResponsibilityFilingStatus }
     *     
     */
    public FinancialResponsibilityFilingStatus getFilingStatusCd() {
        return filingStatusCd;
    }

    /**
     * Sets the value of the filingStatusCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialResponsibilityFilingStatus }
     *     
     */
    public void setFilingStatusCd(FinancialResponsibilityFilingStatus value) {
        this.filingStatusCd = value;
    }

    /**
     * Gets the value of the incidentDt property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getIncidentDt() {
        return incidentDt;
    }

    /**
     * Sets the value of the incidentDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setIncidentDt(Date value) {
        this.incidentDt = value;
    }

    /**
     * Gets the value of the financialResponsibilityAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CURRENCY }
     *     
     */
    public CURRENCY getFinancialResponsibilityAmt() {
        return financialResponsibilityAmt;
    }

    /**
     * Sets the value of the financialResponsibilityAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CURRENCY }
     *     
     */
    public void setFinancialResponsibilityAmt(CURRENCY value) {
        this.financialResponsibilityAmt = value;
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
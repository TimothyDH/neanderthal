//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-147 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.02.24 at 10:20:12 PM EST 
//


package org.acord.standards.pc_surety.acord1.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for CounterSignature_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CounterSignature_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}StateProvCd"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}FieldOfficeCd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}ContractNumber" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}CommissionRatePct" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}PrintedDocumentsRequestedInd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}CounterSignatureLicenseNumber" minOccurs="0"/>
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
@XmlType(name = "CounterSignature_Type", propOrder = {
    "stateProvCd",
    "fieldOfficeCd",
    "contractNumber",
    "commissionRatePct",
    "printedDocumentsRequestedInd",
    "counterSignatureLicenseNumber"
})
public class CounterSignatureType {

    @XmlElement(name = "StateProvCd", required = true)
    protected OpenEnum stateProvCd;
    @XmlElement(name = "FieldOfficeCd")
    protected OpenEnum fieldOfficeCd;
    @XmlElement(name = "ContractNumber")
    protected C20 contractNumber;
    @XmlElement(name = "CommissionRatePct")
    protected PercentDecimal commissionRatePct;
    @XmlElement(name = "PrintedDocumentsRequestedInd")
    protected Boolean printedDocumentsRequestedInd;
    @XmlElement(name = "CounterSignatureLicenseNumber")
    protected C25 counterSignatureLicenseNumber;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;

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
     * Gets the value of the fieldOfficeCd property.
     * 
     * @return
     *     possible object is
     *     {@link OpenEnum }
     *     
     */
    public OpenEnum getFieldOfficeCd() {
        return fieldOfficeCd;
    }

    /**
     * Sets the value of the fieldOfficeCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpenEnum }
     *     
     */
    public void setFieldOfficeCd(OpenEnum value) {
        this.fieldOfficeCd = value;
    }

    /**
     * Gets the value of the contractNumber property.
     * 
     * @return
     *     possible object is
     *     {@link C20 }
     *     
     */
    public C20 getContractNumber() {
        return contractNumber;
    }

    /**
     * Sets the value of the contractNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link C20 }
     *     
     */
    public void setContractNumber(C20 value) {
        this.contractNumber = value;
    }

    /**
     * Gets the value of the commissionRatePct property.
     * 
     * @return
     *     possible object is
     *     {@link PercentDecimal }
     *     
     */
    public PercentDecimal getCommissionRatePct() {
        return commissionRatePct;
    }

    /**
     * Sets the value of the commissionRatePct property.
     * 
     * @param value
     *     allowed object is
     *     {@link PercentDecimal }
     *     
     */
    public void setCommissionRatePct(PercentDecimal value) {
        this.commissionRatePct = value;
    }

    /**
     * Gets the value of the printedDocumentsRequestedInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getPrintedDocumentsRequestedInd() {
        return printedDocumentsRequestedInd;
    }

    /**
     * Sets the value of the printedDocumentsRequestedInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrintedDocumentsRequestedInd(Boolean value) {
        this.printedDocumentsRequestedInd = value;
    }

    /**
     * Gets the value of the counterSignatureLicenseNumber property.
     * 
     * @return
     *     possible object is
     *     {@link C25 }
     *     
     */
    public C25 getCounterSignatureLicenseNumber() {
        return counterSignatureLicenseNumber;
    }

    /**
     * Sets the value of the counterSignatureLicenseNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link C25 }
     *     
     */
    public void setCounterSignatureLicenseNumber(C25 value) {
        this.counterSignatureLicenseNumber = value;
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
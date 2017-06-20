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
 * <p>Java class for ElectronicFundsTransfer_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ElectronicFundsTransfer_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}FromAcct" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}ToAcct" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}TransferAmt"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}Fee" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}EFTFrequencyCd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}EffectiveDt" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}EFTTrackingId" minOccurs="0"/>
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
@XmlType(name = "ElectronicFundsTransfer_Type", propOrder = {
    "fromAcct",
    "toAcct",
    "transferAmt",
    "fee",
    "eftFrequencyCd",
    "effectiveDt",
    "eftTrackingId"
})
public class ElectronicFundsTransferType {

    @XmlElement(name = "FromAcct")
    protected FromAcctType fromAcct;
    @XmlElement(name = "ToAcct")
    protected ToAcctType toAcct;
    @XmlElement(name = "TransferAmt", required = true)
    protected CURRENCY transferAmt;
    @XmlElement(name = "Fee")
    protected FeeType fee;
    @XmlElement(name = "EFTFrequencyCd")
    protected Frequency eftFrequencyCd;
    @XmlElement(name = "EffectiveDt")
    protected Date effectiveDt;
    @XmlElement(name = "EFTTrackingId")
    protected AssignedIdentifier eftTrackingId;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;

    /**
     * Gets the value of the fromAcct property.
     * 
     * @return
     *     possible object is
     *     {@link FromAcctType }
     *     
     */
    public FromAcctType getFromAcct() {
        return fromAcct;
    }

    /**
     * Sets the value of the fromAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link FromAcctType }
     *     
     */
    public void setFromAcct(FromAcctType value) {
        this.fromAcct = value;
    }

    /**
     * Gets the value of the toAcct property.
     * 
     * @return
     *     possible object is
     *     {@link ToAcctType }
     *     
     */
    public ToAcctType getToAcct() {
        return toAcct;
    }

    /**
     * Sets the value of the toAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link ToAcctType }
     *     
     */
    public void setToAcct(ToAcctType value) {
        this.toAcct = value;
    }

    /**
     * Gets the value of the transferAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CURRENCY }
     *     
     */
    public CURRENCY getTransferAmt() {
        return transferAmt;
    }

    /**
     * Sets the value of the transferAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CURRENCY }
     *     
     */
    public void setTransferAmt(CURRENCY value) {
        this.transferAmt = value;
    }

    /**
     * Gets the value of the fee property.
     * 
     * @return
     *     possible object is
     *     {@link FeeType }
     *     
     */
    public FeeType getFee() {
        return fee;
    }

    /**
     * Sets the value of the fee property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeeType }
     *     
     */
    public void setFee(FeeType value) {
        this.fee = value;
    }

    /**
     * Gets the value of the eftFrequencyCd property.
     * 
     * @return
     *     possible object is
     *     {@link Frequency }
     *     
     */
    public Frequency getEFTFrequencyCd() {
        return eftFrequencyCd;
    }

    /**
     * Sets the value of the eftFrequencyCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Frequency }
     *     
     */
    public void setEFTFrequencyCd(Frequency value) {
        this.eftFrequencyCd = value;
    }

    /**
     * Gets the value of the effectiveDt property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getEffectiveDt() {
        return effectiveDt;
    }

    /**
     * Sets the value of the effectiveDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setEffectiveDt(Date value) {
        this.effectiveDt = value;
    }

    /**
     * Gets the value of the eftTrackingId property.
     * 
     * @return
     *     possible object is
     *     {@link AssignedIdentifier }
     *     
     */
    public AssignedIdentifier getEFTTrackingId() {
        return eftTrackingId;
    }

    /**
     * Sets the value of the eftTrackingId property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssignedIdentifier }
     *     
     */
    public void setEFTTrackingId(AssignedIdentifier value) {
        this.eftTrackingId = value;
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
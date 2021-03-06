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
 * <p>Java class for CrimeMoneyAndSecurities_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CrimeMoneyAndSecurities_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}MoneyAndSecuritiesCoverageTypeCd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}MoneyAmt" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}SecuritiesOtherThanPayrollAmt" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}ChecksAmt" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}PayrollAmt" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}MoneyOvernightAmt" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}SecuritiesInBankAmt" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}AccountsPayableChecksAmt" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}MaxExposureAmt" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}MessengerProtectionInfo" minOccurs="0"/>
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
@XmlType(name = "CrimeMoneyAndSecurities_Type", propOrder = {
    "moneyAndSecuritiesCoverageTypeCd",
    "moneyAmt",
    "securitiesOtherThanPayrollAmt",
    "checksAmt",
    "payrollAmt",
    "moneyOvernightAmt",
    "securitiesInBankAmt",
    "accountsPayableChecksAmt",
    "maxExposureAmt",
    "messengerProtectionInfo"
})
public class CrimeMoneyAndSecuritiesType {

    @XmlElement(name = "MoneyAndSecuritiesCoverageTypeCd")
    protected CoverageOption moneyAndSecuritiesCoverageTypeCd;
    @XmlElement(name = "MoneyAmt")
    protected CURRENCY moneyAmt;
    @XmlElement(name = "SecuritiesOtherThanPayrollAmt")
    protected CURRENCY securitiesOtherThanPayrollAmt;
    @XmlElement(name = "ChecksAmt")
    protected CURRENCY checksAmt;
    @XmlElement(name = "PayrollAmt")
    protected CURRENCY payrollAmt;
    @XmlElement(name = "MoneyOvernightAmt")
    protected CURRENCY moneyOvernightAmt;
    @XmlElement(name = "SecuritiesInBankAmt")
    protected CURRENCY securitiesInBankAmt;
    @XmlElement(name = "AccountsPayableChecksAmt")
    protected CURRENCY accountsPayableChecksAmt;
    @XmlElement(name = "MaxExposureAmt")
    protected CURRENCY maxExposureAmt;
    @XmlElement(name = "MessengerProtectionInfo")
    protected MessengerProtectionInfoType messengerProtectionInfo;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;

    /**
     * Gets the value of the moneyAndSecuritiesCoverageTypeCd property.
     * 
     * @return
     *     possible object is
     *     {@link CoverageOption }
     *     
     */
    public CoverageOption getMoneyAndSecuritiesCoverageTypeCd() {
        return moneyAndSecuritiesCoverageTypeCd;
    }

    /**
     * Sets the value of the moneyAndSecuritiesCoverageTypeCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link CoverageOption }
     *     
     */
    public void setMoneyAndSecuritiesCoverageTypeCd(CoverageOption value) {
        this.moneyAndSecuritiesCoverageTypeCd = value;
    }

    /**
     * Gets the value of the moneyAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CURRENCY }
     *     
     */
    public CURRENCY getMoneyAmt() {
        return moneyAmt;
    }

    /**
     * Sets the value of the moneyAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CURRENCY }
     *     
     */
    public void setMoneyAmt(CURRENCY value) {
        this.moneyAmt = value;
    }

    /**
     * Gets the value of the securitiesOtherThanPayrollAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CURRENCY }
     *     
     */
    public CURRENCY getSecuritiesOtherThanPayrollAmt() {
        return securitiesOtherThanPayrollAmt;
    }

    /**
     * Sets the value of the securitiesOtherThanPayrollAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CURRENCY }
     *     
     */
    public void setSecuritiesOtherThanPayrollAmt(CURRENCY value) {
        this.securitiesOtherThanPayrollAmt = value;
    }

    /**
     * Gets the value of the checksAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CURRENCY }
     *     
     */
    public CURRENCY getChecksAmt() {
        return checksAmt;
    }

    /**
     * Sets the value of the checksAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CURRENCY }
     *     
     */
    public void setChecksAmt(CURRENCY value) {
        this.checksAmt = value;
    }

    /**
     * Gets the value of the payrollAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CURRENCY }
     *     
     */
    public CURRENCY getPayrollAmt() {
        return payrollAmt;
    }

    /**
     * Sets the value of the payrollAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CURRENCY }
     *     
     */
    public void setPayrollAmt(CURRENCY value) {
        this.payrollAmt = value;
    }

    /**
     * Gets the value of the moneyOvernightAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CURRENCY }
     *     
     */
    public CURRENCY getMoneyOvernightAmt() {
        return moneyOvernightAmt;
    }

    /**
     * Sets the value of the moneyOvernightAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CURRENCY }
     *     
     */
    public void setMoneyOvernightAmt(CURRENCY value) {
        this.moneyOvernightAmt = value;
    }

    /**
     * Gets the value of the securitiesInBankAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CURRENCY }
     *     
     */
    public CURRENCY getSecuritiesInBankAmt() {
        return securitiesInBankAmt;
    }

    /**
     * Sets the value of the securitiesInBankAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CURRENCY }
     *     
     */
    public void setSecuritiesInBankAmt(CURRENCY value) {
        this.securitiesInBankAmt = value;
    }

    /**
     * Gets the value of the accountsPayableChecksAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CURRENCY }
     *     
     */
    public CURRENCY getAccountsPayableChecksAmt() {
        return accountsPayableChecksAmt;
    }

    /**
     * Sets the value of the accountsPayableChecksAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CURRENCY }
     *     
     */
    public void setAccountsPayableChecksAmt(CURRENCY value) {
        this.accountsPayableChecksAmt = value;
    }

    /**
     * Gets the value of the maxExposureAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CURRENCY }
     *     
     */
    public CURRENCY getMaxExposureAmt() {
        return maxExposureAmt;
    }

    /**
     * Sets the value of the maxExposureAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CURRENCY }
     *     
     */
    public void setMaxExposureAmt(CURRENCY value) {
        this.maxExposureAmt = value;
    }

    /**
     * Gets the value of the messengerProtectionInfo property.
     * 
     * @return
     *     possible object is
     *     {@link MessengerProtectionInfoType }
     *     
     */
    public MessengerProtectionInfoType getMessengerProtectionInfo() {
        return messengerProtectionInfo;
    }

    /**
     * Sets the value of the messengerProtectionInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessengerProtectionInfoType }
     *     
     */
    public void setMessengerProtectionInfo(MessengerProtectionInfoType value) {
        this.messengerProtectionInfo = value;
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

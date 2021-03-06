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
 * <p>Java class for FinancialInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FinancialInfo_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}Last12MonthsInd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}TotalFoodLiquorOperatingExpensesAmt" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}TotalNonFoodLiquorOperatingExpensesAmt" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}NetProfitLossAmt" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}AccountsPayableAmt" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}NotesPayableExclBanksAmt" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}BankLoansPayableAmt" minOccurs="0"/>
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
@XmlType(name = "FinancialInfo_Type", propOrder = {
    "last12MonthsInd",
    "totalFoodLiquorOperatingExpensesAmt",
    "totalNonFoodLiquorOperatingExpensesAmt",
    "netProfitLossAmt",
    "accountsPayableAmt",
    "notesPayableExclBanksAmt",
    "bankLoansPayableAmt"
})
public class FinancialInfoType {

    @XmlElement(name = "Last12MonthsInd")
    protected Boolean last12MonthsInd;
    @XmlElement(name = "TotalFoodLiquorOperatingExpensesAmt")
    protected CURRENCY totalFoodLiquorOperatingExpensesAmt;
    @XmlElement(name = "TotalNonFoodLiquorOperatingExpensesAmt")
    protected CURRENCY totalNonFoodLiquorOperatingExpensesAmt;
    @XmlElement(name = "NetProfitLossAmt")
    protected CURRENCY netProfitLossAmt;
    @XmlElement(name = "AccountsPayableAmt")
    protected CURRENCY accountsPayableAmt;
    @XmlElement(name = "NotesPayableExclBanksAmt")
    protected CURRENCY notesPayableExclBanksAmt;
    @XmlElement(name = "BankLoansPayableAmt")
    protected CURRENCY bankLoansPayableAmt;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;

    /**
     * Gets the value of the last12MonthsInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getLast12MonthsInd() {
        return last12MonthsInd;
    }

    /**
     * Sets the value of the last12MonthsInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLast12MonthsInd(Boolean value) {
        this.last12MonthsInd = value;
    }

    /**
     * Gets the value of the totalFoodLiquorOperatingExpensesAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CURRENCY }
     *     
     */
    public CURRENCY getTotalFoodLiquorOperatingExpensesAmt() {
        return totalFoodLiquorOperatingExpensesAmt;
    }

    /**
     * Sets the value of the totalFoodLiquorOperatingExpensesAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CURRENCY }
     *     
     */
    public void setTotalFoodLiquorOperatingExpensesAmt(CURRENCY value) {
        this.totalFoodLiquorOperatingExpensesAmt = value;
    }

    /**
     * Gets the value of the totalNonFoodLiquorOperatingExpensesAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CURRENCY }
     *     
     */
    public CURRENCY getTotalNonFoodLiquorOperatingExpensesAmt() {
        return totalNonFoodLiquorOperatingExpensesAmt;
    }

    /**
     * Sets the value of the totalNonFoodLiquorOperatingExpensesAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CURRENCY }
     *     
     */
    public void setTotalNonFoodLiquorOperatingExpensesAmt(CURRENCY value) {
        this.totalNonFoodLiquorOperatingExpensesAmt = value;
    }

    /**
     * Gets the value of the netProfitLossAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CURRENCY }
     *     
     */
    public CURRENCY getNetProfitLossAmt() {
        return netProfitLossAmt;
    }

    /**
     * Sets the value of the netProfitLossAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CURRENCY }
     *     
     */
    public void setNetProfitLossAmt(CURRENCY value) {
        this.netProfitLossAmt = value;
    }

    /**
     * Gets the value of the accountsPayableAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CURRENCY }
     *     
     */
    public CURRENCY getAccountsPayableAmt() {
        return accountsPayableAmt;
    }

    /**
     * Sets the value of the accountsPayableAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CURRENCY }
     *     
     */
    public void setAccountsPayableAmt(CURRENCY value) {
        this.accountsPayableAmt = value;
    }

    /**
     * Gets the value of the notesPayableExclBanksAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CURRENCY }
     *     
     */
    public CURRENCY getNotesPayableExclBanksAmt() {
        return notesPayableExclBanksAmt;
    }

    /**
     * Sets the value of the notesPayableExclBanksAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CURRENCY }
     *     
     */
    public void setNotesPayableExclBanksAmt(CURRENCY value) {
        this.notesPayableExclBanksAmt = value;
    }

    /**
     * Gets the value of the bankLoansPayableAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CURRENCY }
     *     
     */
    public CURRENCY getBankLoansPayableAmt() {
        return bankLoansPayableAmt;
    }

    /**
     * Sets the value of the bankLoansPayableAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CURRENCY }
     *     
     */
    public void setBankLoansPayableAmt(CURRENCY value) {
        this.bankLoansPayableAmt = value;
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

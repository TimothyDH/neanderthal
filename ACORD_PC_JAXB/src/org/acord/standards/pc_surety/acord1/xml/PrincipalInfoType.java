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
 * <p>Java class for PrincipalInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PrincipalInfo_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}LiensSuitsJudgementsAgainstPrincipalInd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}SICCd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}StateProvCd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}KnownSinceDt" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}CreditScoreInfo" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}QuestionAnswer" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}RealEstateEquityAmt" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}LengthTimeInBusiness" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}FinancialStatementInfo" minOccurs="0"/>
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
@XmlType(name = "PrincipalInfo_Type", propOrder = {
    "liensSuitsJudgementsAgainstPrincipalInd",
    "sicCd",
    "stateProvCd",
    "knownSinceDt",
    "creditScoreInfo",
    "questionAnswer",
    "realEstateEquityAmt",
    "lengthTimeInBusiness",
    "financialStatementInfo"
})
public class PrincipalInfoType {

    @XmlElement(name = "LiensSuitsJudgementsAgainstPrincipalInd")
    protected Boolean liensSuitsJudgementsAgainstPrincipalInd;
    @XmlElement(name = "SICCd")
    protected OpenEnum sicCd;
    @XmlElement(name = "StateProvCd")
    protected OpenEnum stateProvCd;
    @XmlElement(name = "KnownSinceDt")
    protected Date knownSinceDt;
    @XmlElement(name = "CreditScoreInfo")
    protected CreditScoreInfoType creditScoreInfo;
    @XmlElement(name = "QuestionAnswer")
    protected List<QuestionAnswerType> questionAnswer;
    @XmlElement(name = "RealEstateEquityAmt")
    protected CURRENCY realEstateEquityAmt;
    @XmlElement(name = "LengthTimeInBusiness")
    protected MEASUREMENT lengthTimeInBusiness;
    @XmlElement(name = "FinancialStatementInfo")
    protected FinancialStatementInfoType financialStatementInfo;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;

    /**
     * Gets the value of the liensSuitsJudgementsAgainstPrincipalInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getLiensSuitsJudgementsAgainstPrincipalInd() {
        return liensSuitsJudgementsAgainstPrincipalInd;
    }

    /**
     * Sets the value of the liensSuitsJudgementsAgainstPrincipalInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLiensSuitsJudgementsAgainstPrincipalInd(Boolean value) {
        this.liensSuitsJudgementsAgainstPrincipalInd = value;
    }

    /**
     * Gets the value of the sicCd property.
     * 
     * @return
     *     possible object is
     *     {@link OpenEnum }
     *     
     */
    public OpenEnum getSICCd() {
        return sicCd;
    }

    /**
     * Sets the value of the sicCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpenEnum }
     *     
     */
    public void setSICCd(OpenEnum value) {
        this.sicCd = value;
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
     * Gets the value of the knownSinceDt property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getKnownSinceDt() {
        return knownSinceDt;
    }

    /**
     * Sets the value of the knownSinceDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setKnownSinceDt(Date value) {
        this.knownSinceDt = value;
    }

    /**
     * Gets the value of the creditScoreInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CreditScoreInfoType }
     *     
     */
    public CreditScoreInfoType getCreditScoreInfo() {
        return creditScoreInfo;
    }

    /**
     * Sets the value of the creditScoreInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditScoreInfoType }
     *     
     */
    public void setCreditScoreInfo(CreditScoreInfoType value) {
        this.creditScoreInfo = value;
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
     * Gets the value of the realEstateEquityAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CURRENCY }
     *     
     */
    public CURRENCY getRealEstateEquityAmt() {
        return realEstateEquityAmt;
    }

    /**
     * Sets the value of the realEstateEquityAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CURRENCY }
     *     
     */
    public void setRealEstateEquityAmt(CURRENCY value) {
        this.realEstateEquityAmt = value;
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
     * Gets the value of the financialStatementInfo property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialStatementInfoType }
     *     
     */
    public FinancialStatementInfoType getFinancialStatementInfo() {
        return financialStatementInfo;
    }

    /**
     * Sets the value of the financialStatementInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialStatementInfoType }
     *     
     */
    public void setFinancialStatementInfo(FinancialStatementInfoType value) {
        this.financialStatementInfo = value;
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

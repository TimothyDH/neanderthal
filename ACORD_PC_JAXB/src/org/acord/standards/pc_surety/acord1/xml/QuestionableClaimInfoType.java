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
 * <p>Java class for QuestionableClaimInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QuestionableClaimInfo_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}QuestionableReasonCd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}ReasonDesc" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}ReferralInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}InvestigatingPartyInfo" minOccurs="0"/>
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
@XmlType(name = "QuestionableClaimInfo_Type", propOrder = {
    "questionableReasonCd",
    "reasonDesc",
    "referralInfo",
    "investigatingPartyInfo"
})
public class QuestionableClaimInfoType {

    @XmlElement(name = "QuestionableReasonCd")
    protected OpenEnum questionableReasonCd;
    @XmlElement(name = "ReasonDesc")
    protected CInfinite reasonDesc;
    @XmlElement(name = "ReferralInfo")
    protected List<ReferralInfoType> referralInfo;
    @XmlElement(name = "InvestigatingPartyInfo")
    protected InvestigatingPartyInfoType investigatingPartyInfo;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;

    /**
     * Gets the value of the questionableReasonCd property.
     * 
     * @return
     *     possible object is
     *     {@link OpenEnum }
     *     
     */
    public OpenEnum getQuestionableReasonCd() {
        return questionableReasonCd;
    }

    /**
     * Sets the value of the questionableReasonCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpenEnum }
     *     
     */
    public void setQuestionableReasonCd(OpenEnum value) {
        this.questionableReasonCd = value;
    }

    /**
     * Gets the value of the reasonDesc property.
     * 
     * @return
     *     possible object is
     *     {@link CInfinite }
     *     
     */
    public CInfinite getReasonDesc() {
        return reasonDesc;
    }

    /**
     * Sets the value of the reasonDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CInfinite }
     *     
     */
    public void setReasonDesc(CInfinite value) {
        this.reasonDesc = value;
    }

    /**
     * Gets the value of the referralInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the referralInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReferralInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReferralInfoType }
     * 
     * 
     */
    public List<ReferralInfoType> getReferralInfo() {
        if (referralInfo == null) {
            referralInfo = new ArrayList<ReferralInfoType>();
        }
        return this.referralInfo;
    }

    /**
     * Gets the value of the investigatingPartyInfo property.
     * 
     * @return
     *     possible object is
     *     {@link InvestigatingPartyInfoType }
     *     
     */
    public InvestigatingPartyInfoType getInvestigatingPartyInfo() {
        return investigatingPartyInfo;
    }

    /**
     * Sets the value of the investigatingPartyInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestigatingPartyInfoType }
     *     
     */
    public void setInvestigatingPartyInfo(InvestigatingPartyInfoType value) {
        this.investigatingPartyInfo = value;
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

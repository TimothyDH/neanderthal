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
 * <p>Java class for ClaimsPartyInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClaimsPartyInfo_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}ClaimsPartyRoleCd" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}ClaimsPartyLocCd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}ClaimsPartyLocDesc" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}PartyTitle" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}InvolvementDesc" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}RelationshipToInsuredCd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}OtherOrPriorPolicy" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}AccountNumberId" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}AuthorizedRepInd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}SuitFiledInd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}ClosedDt" minOccurs="0"/>
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
@XmlType(name = "ClaimsPartyInfo_Type", propOrder = {
    "claimsPartyRoleCd",
    "claimsPartyLocCd",
    "claimsPartyLocDesc",
    "partyTitle",
    "involvementDesc",
    "relationshipToInsuredCd",
    "otherOrPriorPolicy",
    "accountNumberId",
    "authorizedRepInd",
    "suitFiledInd",
    "closedDt"
})
public class ClaimsPartyInfoType {

    @XmlElement(name = "ClaimsPartyRoleCd")
    protected List<ClaimsPartyRole> claimsPartyRoleCd;
    @XmlElement(name = "ClaimsPartyLocCd")
    protected ClaimsPartyLocation claimsPartyLocCd;
    @XmlElement(name = "ClaimsPartyLocDesc")
    protected C255 claimsPartyLocDesc;
    @XmlElement(name = "PartyTitle")
    protected C30 partyTitle;
    @XmlElement(name = "InvolvementDesc")
    protected CInfinite involvementDesc;
    @XmlElement(name = "RelationshipToInsuredCd")
    protected DriverRelatesTo relationshipToInsuredCd;
    @XmlElement(name = "OtherOrPriorPolicy")
    protected List<OtherOrPriorPolicyType> otherOrPriorPolicy;
    @XmlElement(name = "AccountNumberId")
    protected AssignedIdentifier accountNumberId;
    @XmlElement(name = "AuthorizedRepInd")
    protected Boolean authorizedRepInd;
    @XmlElement(name = "SuitFiledInd")
    protected Boolean suitFiledInd;
    @XmlElement(name = "ClosedDt")
    protected Date closedDt;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;

    /**
     * Gets the value of the claimsPartyRoleCd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the claimsPartyRoleCd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClaimsPartyRoleCd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClaimsPartyRole }
     * 
     * 
     */
    public List<ClaimsPartyRole> getClaimsPartyRoleCd() {
        if (claimsPartyRoleCd == null) {
            claimsPartyRoleCd = new ArrayList<ClaimsPartyRole>();
        }
        return this.claimsPartyRoleCd;
    }

    /**
     * Gets the value of the claimsPartyLocCd property.
     * 
     * @return
     *     possible object is
     *     {@link ClaimsPartyLocation }
     *     
     */
    public ClaimsPartyLocation getClaimsPartyLocCd() {
        return claimsPartyLocCd;
    }

    /**
     * Sets the value of the claimsPartyLocCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClaimsPartyLocation }
     *     
     */
    public void setClaimsPartyLocCd(ClaimsPartyLocation value) {
        this.claimsPartyLocCd = value;
    }

    /**
     * Gets the value of the claimsPartyLocDesc property.
     * 
     * @return
     *     possible object is
     *     {@link C255 }
     *     
     */
    public C255 getClaimsPartyLocDesc() {
        return claimsPartyLocDesc;
    }

    /**
     * Sets the value of the claimsPartyLocDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link C255 }
     *     
     */
    public void setClaimsPartyLocDesc(C255 value) {
        this.claimsPartyLocDesc = value;
    }

    /**
     * Gets the value of the partyTitle property.
     * 
     * @return
     *     possible object is
     *     {@link C30 }
     *     
     */
    public C30 getPartyTitle() {
        return partyTitle;
    }

    /**
     * Sets the value of the partyTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link C30 }
     *     
     */
    public void setPartyTitle(C30 value) {
        this.partyTitle = value;
    }

    /**
     * Gets the value of the involvementDesc property.
     * 
     * @return
     *     possible object is
     *     {@link CInfinite }
     *     
     */
    public CInfinite getInvolvementDesc() {
        return involvementDesc;
    }

    /**
     * Sets the value of the involvementDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CInfinite }
     *     
     */
    public void setInvolvementDesc(CInfinite value) {
        this.involvementDesc = value;
    }

    /**
     * Gets the value of the relationshipToInsuredCd property.
     * 
     * @return
     *     possible object is
     *     {@link DriverRelatesTo }
     *     
     */
    public DriverRelatesTo getRelationshipToInsuredCd() {
        return relationshipToInsuredCd;
    }

    /**
     * Sets the value of the relationshipToInsuredCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link DriverRelatesTo }
     *     
     */
    public void setRelationshipToInsuredCd(DriverRelatesTo value) {
        this.relationshipToInsuredCd = value;
    }

    /**
     * Gets the value of the otherOrPriorPolicy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherOrPriorPolicy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherOrPriorPolicy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OtherOrPriorPolicyType }
     * 
     * 
     */
    public List<OtherOrPriorPolicyType> getOtherOrPriorPolicy() {
        if (otherOrPriorPolicy == null) {
            otherOrPriorPolicy = new ArrayList<OtherOrPriorPolicyType>();
        }
        return this.otherOrPriorPolicy;
    }

    /**
     * Gets the value of the accountNumberId property.
     * 
     * @return
     *     possible object is
     *     {@link AssignedIdentifier }
     *     
     */
    public AssignedIdentifier getAccountNumberId() {
        return accountNumberId;
    }

    /**
     * Sets the value of the accountNumberId property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssignedIdentifier }
     *     
     */
    public void setAccountNumberId(AssignedIdentifier value) {
        this.accountNumberId = value;
    }

    /**
     * Gets the value of the authorizedRepInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getAuthorizedRepInd() {
        return authorizedRepInd;
    }

    /**
     * Sets the value of the authorizedRepInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAuthorizedRepInd(Boolean value) {
        this.authorizedRepInd = value;
    }

    /**
     * Gets the value of the suitFiledInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getSuitFiledInd() {
        return suitFiledInd;
    }

    /**
     * Sets the value of the suitFiledInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSuitFiledInd(Boolean value) {
        this.suitFiledInd = value;
    }

    /**
     * Gets the value of the closedDt property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getClosedDt() {
        return closedDt;
    }

    /**
     * Sets the value of the closedDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setClosedDt(Date value) {
        this.closedDt = value;
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

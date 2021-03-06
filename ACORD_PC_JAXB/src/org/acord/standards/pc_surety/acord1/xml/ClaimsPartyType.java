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
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for ClaimsParty_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClaimsParty_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}ItemIdInfo" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}GeneralPartyInfo" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}PersonInfo" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}ClaimsPartyInfo" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}ClaimsDriverInfo" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}ClaimsInjuredInfo" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}PartyInvestigationInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}ID" />
 *       &lt;attribute name="AuthorizedRepRef" type="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}IDREF" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClaimsParty_Type", propOrder = {
    "itemIdInfo",
    "generalPartyInfo",
    "personInfo",
    "claimsPartyInfo",
    "claimsDriverInfo",
    "claimsInjuredInfo",
    "partyInvestigationInfo"
})
public class ClaimsPartyType {

    @XmlElement(name = "ItemIdInfo")
    protected ItemIdInfoType itemIdInfo;
    @XmlElement(name = "GeneralPartyInfo")
    protected GeneralPartyInfoType generalPartyInfo;
    @XmlElement(name = "PersonInfo")
    protected PersonInfoType personInfo;
    @XmlElement(name = "ClaimsPartyInfo")
    protected ClaimsPartyInfoType claimsPartyInfo;
    @XmlElement(name = "ClaimsDriverInfo")
    protected ClaimsDriverInfoType claimsDriverInfo;
    @XmlElement(name = "ClaimsInjuredInfo")
    protected ClaimsInjuredInfoType claimsInjuredInfo;
    @XmlElement(name = "PartyInvestigationInfo")
    protected PartyInvestigationInfoType partyInvestigationInfo;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;
    @XmlAttribute(name = "AuthorizedRepRef")
    @XmlIDREF
    protected Object authorizedRepRef;

    /**
     * Gets the value of the itemIdInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ItemIdInfoType }
     *     
     */
    public ItemIdInfoType getItemIdInfo() {
        return itemIdInfo;
    }

    /**
     * Sets the value of the itemIdInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemIdInfoType }
     *     
     */
    public void setItemIdInfo(ItemIdInfoType value) {
        this.itemIdInfo = value;
    }

    /**
     * Gets the value of the generalPartyInfo property.
     * 
     * @return
     *     possible object is
     *     {@link GeneralPartyInfoType }
     *     
     */
    public GeneralPartyInfoType getGeneralPartyInfo() {
        return generalPartyInfo;
    }

    /**
     * Sets the value of the generalPartyInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeneralPartyInfoType }
     *     
     */
    public void setGeneralPartyInfo(GeneralPartyInfoType value) {
        this.generalPartyInfo = value;
    }

    /**
     * Gets the value of the personInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PersonInfoType }
     *     
     */
    public PersonInfoType getPersonInfo() {
        return personInfo;
    }

    /**
     * Sets the value of the personInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonInfoType }
     *     
     */
    public void setPersonInfo(PersonInfoType value) {
        this.personInfo = value;
    }

    /**
     * Gets the value of the claimsPartyInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ClaimsPartyInfoType }
     *     
     */
    public ClaimsPartyInfoType getClaimsPartyInfo() {
        return claimsPartyInfo;
    }

    /**
     * Sets the value of the claimsPartyInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClaimsPartyInfoType }
     *     
     */
    public void setClaimsPartyInfo(ClaimsPartyInfoType value) {
        this.claimsPartyInfo = value;
    }

    /**
     * Gets the value of the claimsDriverInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ClaimsDriverInfoType }
     *     
     */
    public ClaimsDriverInfoType getClaimsDriverInfo() {
        return claimsDriverInfo;
    }

    /**
     * Sets the value of the claimsDriverInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClaimsDriverInfoType }
     *     
     */
    public void setClaimsDriverInfo(ClaimsDriverInfoType value) {
        this.claimsDriverInfo = value;
    }

    /**
     * Gets the value of the claimsInjuredInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ClaimsInjuredInfoType }
     *     
     */
    public ClaimsInjuredInfoType getClaimsInjuredInfo() {
        return claimsInjuredInfo;
    }

    /**
     * Sets the value of the claimsInjuredInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClaimsInjuredInfoType }
     *     
     */
    public void setClaimsInjuredInfo(ClaimsInjuredInfoType value) {
        this.claimsInjuredInfo = value;
    }

    /**
     * Gets the value of the partyInvestigationInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PartyInvestigationInfoType }
     *     
     */
    public PartyInvestigationInfoType getPartyInvestigationInfo() {
        return partyInvestigationInfo;
    }

    /**
     * Sets the value of the partyInvestigationInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyInvestigationInfoType }
     *     
     */
    public void setPartyInvestigationInfo(PartyInvestigationInfoType value) {
        this.partyInvestigationInfo = value;
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
     * Gets the value of the authorizedRepRef property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAuthorizedRepRef() {
        return authorizedRepRef;
    }

    /**
     * Sets the value of the authorizedRepRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAuthorizedRepRef(Object value) {
        this.authorizedRepRef = value;
    }

}

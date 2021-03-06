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
 * <p>Java class for PremiumAuditInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PremiumAuditInfo_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}AuditInfo" minOccurs="0"/>
 *         &lt;group ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}AUDIT_CHOICE" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}SignatureInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}TotalExposureInfo" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "PremiumAuditInfo_Type", propOrder = {
    "auditInfo",
    "premiumAuditWorkCompInfo",
    "premiumAuditLiabilityInfo",
    "signatureInfo",
    "totalExposureInfo"
})
public class PremiumAuditInfoType {

    @XmlElement(name = "AuditInfo")
    protected AuditInfoType auditInfo;
    @XmlElement(name = "PremiumAuditWorkCompInfo")
    protected PremiumAuditWorkCompInfoType premiumAuditWorkCompInfo;
    @XmlElement(name = "PremiumAuditLiabilityInfo")
    protected PremiumAuditLiabilityInfoType premiumAuditLiabilityInfo;
    @XmlElement(name = "SignatureInfo")
    protected List<SignatureInfoType> signatureInfo;
    @XmlElement(name = "TotalExposureInfo")
    protected List<TotalExposureInfoType> totalExposureInfo;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;

    /**
     * Gets the value of the auditInfo property.
     * 
     * @return
     *     possible object is
     *     {@link AuditInfoType }
     *     
     */
    public AuditInfoType getAuditInfo() {
        return auditInfo;
    }

    /**
     * Sets the value of the auditInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuditInfoType }
     *     
     */
    public void setAuditInfo(AuditInfoType value) {
        this.auditInfo = value;
    }

    /**
     * Gets the value of the premiumAuditWorkCompInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PremiumAuditWorkCompInfoType }
     *     
     */
    public PremiumAuditWorkCompInfoType getPremiumAuditWorkCompInfo() {
        return premiumAuditWorkCompInfo;
    }

    /**
     * Sets the value of the premiumAuditWorkCompInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PremiumAuditWorkCompInfoType }
     *     
     */
    public void setPremiumAuditWorkCompInfo(PremiumAuditWorkCompInfoType value) {
        this.premiumAuditWorkCompInfo = value;
    }

    /**
     * Gets the value of the premiumAuditLiabilityInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PremiumAuditLiabilityInfoType }
     *     
     */
    public PremiumAuditLiabilityInfoType getPremiumAuditLiabilityInfo() {
        return premiumAuditLiabilityInfo;
    }

    /**
     * Sets the value of the premiumAuditLiabilityInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PremiumAuditLiabilityInfoType }
     *     
     */
    public void setPremiumAuditLiabilityInfo(PremiumAuditLiabilityInfoType value) {
        this.premiumAuditLiabilityInfo = value;
    }

    /**
     * Gets the value of the signatureInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the signatureInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSignatureInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SignatureInfoType }
     * 
     * 
     */
    public List<SignatureInfoType> getSignatureInfo() {
        if (signatureInfo == null) {
            signatureInfo = new ArrayList<SignatureInfoType>();
        }
        return this.signatureInfo;
    }

    /**
     * Gets the value of the totalExposureInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the totalExposureInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTotalExposureInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TotalExposureInfoType }
     * 
     * 
     */
    public List<TotalExposureInfoType> getTotalExposureInfo() {
        if (totalExposureInfo == null) {
            totalExposureInfo = new ArrayList<TotalExposureInfoType>();
        }
        return this.totalExposureInfo;
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

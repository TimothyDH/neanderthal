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
 * <p>Java class for AuditInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AuditInfo_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}ItemIdInfo" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}AuditTypeCd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}AuditPeriod" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}AuditSourceCd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}AuditRenderedCd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}LastCashAuditDt" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}LastInventoryAuditDt" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}AuditMethodCd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}AuditFrequencyCd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}AuditTransactionTypeCd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}EstimatedAuditInd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}ReviewAuditCd" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}ID" />
 *       &lt;attribute name="AuditorRef" type="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}IDREF" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuditInfo_Type", propOrder = {
    "itemIdInfo",
    "auditTypeCd",
    "auditPeriod",
    "auditSourceCd",
    "auditRenderedCd",
    "lastCashAuditDt",
    "lastInventoryAuditDt",
    "auditMethodCd",
    "auditFrequencyCd",
    "auditTransactionTypeCd",
    "estimatedAuditInd",
    "reviewAuditCd"
})
public class AuditInfoType {

    @XmlElement(name = "ItemIdInfo")
    protected ItemIdInfoType itemIdInfo;
    @XmlElement(name = "AuditTypeCd")
    protected AuditType auditTypeCd;
    @XmlElement(name = "AuditPeriod")
    protected DURATION auditPeriod;
    @XmlElement(name = "AuditSourceCd")
    protected AuditSource auditSourceCd;
    @XmlElement(name = "AuditRenderedCd")
    protected AuditRendered auditRenderedCd;
    @XmlElement(name = "LastCashAuditDt")
    protected Date lastCashAuditDt;
    @XmlElement(name = "LastInventoryAuditDt")
    protected Date lastInventoryAuditDt;
    @XmlElement(name = "AuditMethodCd")
    protected AuditMethodType auditMethodCd;
    @XmlElement(name = "AuditFrequencyCd")
    protected Frequency auditFrequencyCd;
    @XmlElement(name = "AuditTransactionTypeCd")
    protected AuditTransactionType auditTransactionTypeCd;
    @XmlElement(name = "EstimatedAuditInd")
    protected Boolean estimatedAuditInd;
    @XmlElement(name = "ReviewAuditCd")
    protected OpenEnum reviewAuditCd;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;
    @XmlAttribute(name = "AuditorRef")
    @XmlIDREF
    protected Object auditorRef;

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
     * Gets the value of the auditTypeCd property.
     * 
     * @return
     *     possible object is
     *     {@link AuditType }
     *     
     */
    public AuditType getAuditTypeCd() {
        return auditTypeCd;
    }

    /**
     * Sets the value of the auditTypeCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuditType }
     *     
     */
    public void setAuditTypeCd(AuditType value) {
        this.auditTypeCd = value;
    }

    /**
     * Gets the value of the auditPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link DURATION }
     *     
     */
    public DURATION getAuditPeriod() {
        return auditPeriod;
    }

    /**
     * Sets the value of the auditPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link DURATION }
     *     
     */
    public void setAuditPeriod(DURATION value) {
        this.auditPeriod = value;
    }

    /**
     * Gets the value of the auditSourceCd property.
     * 
     * @return
     *     possible object is
     *     {@link AuditSource }
     *     
     */
    public AuditSource getAuditSourceCd() {
        return auditSourceCd;
    }

    /**
     * Sets the value of the auditSourceCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuditSource }
     *     
     */
    public void setAuditSourceCd(AuditSource value) {
        this.auditSourceCd = value;
    }

    /**
     * Gets the value of the auditRenderedCd property.
     * 
     * @return
     *     possible object is
     *     {@link AuditRendered }
     *     
     */
    public AuditRendered getAuditRenderedCd() {
        return auditRenderedCd;
    }

    /**
     * Sets the value of the auditRenderedCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuditRendered }
     *     
     */
    public void setAuditRenderedCd(AuditRendered value) {
        this.auditRenderedCd = value;
    }

    /**
     * Gets the value of the lastCashAuditDt property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getLastCashAuditDt() {
        return lastCashAuditDt;
    }

    /**
     * Sets the value of the lastCashAuditDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setLastCashAuditDt(Date value) {
        this.lastCashAuditDt = value;
    }

    /**
     * Gets the value of the lastInventoryAuditDt property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getLastInventoryAuditDt() {
        return lastInventoryAuditDt;
    }

    /**
     * Sets the value of the lastInventoryAuditDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setLastInventoryAuditDt(Date value) {
        this.lastInventoryAuditDt = value;
    }

    /**
     * Gets the value of the auditMethodCd property.
     * 
     * @return
     *     possible object is
     *     {@link AuditMethodType }
     *     
     */
    public AuditMethodType getAuditMethodCd() {
        return auditMethodCd;
    }

    /**
     * Sets the value of the auditMethodCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuditMethodType }
     *     
     */
    public void setAuditMethodCd(AuditMethodType value) {
        this.auditMethodCd = value;
    }

    /**
     * Gets the value of the auditFrequencyCd property.
     * 
     * @return
     *     possible object is
     *     {@link Frequency }
     *     
     */
    public Frequency getAuditFrequencyCd() {
        return auditFrequencyCd;
    }

    /**
     * Sets the value of the auditFrequencyCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Frequency }
     *     
     */
    public void setAuditFrequencyCd(Frequency value) {
        this.auditFrequencyCd = value;
    }

    /**
     * Gets the value of the auditTransactionTypeCd property.
     * 
     * @return
     *     possible object is
     *     {@link AuditTransactionType }
     *     
     */
    public AuditTransactionType getAuditTransactionTypeCd() {
        return auditTransactionTypeCd;
    }

    /**
     * Sets the value of the auditTransactionTypeCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuditTransactionType }
     *     
     */
    public void setAuditTransactionTypeCd(AuditTransactionType value) {
        this.auditTransactionTypeCd = value;
    }

    /**
     * Gets the value of the estimatedAuditInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getEstimatedAuditInd() {
        return estimatedAuditInd;
    }

    /**
     * Sets the value of the estimatedAuditInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEstimatedAuditInd(Boolean value) {
        this.estimatedAuditInd = value;
    }

    /**
     * Gets the value of the reviewAuditCd property.
     * 
     * @return
     *     possible object is
     *     {@link OpenEnum }
     *     
     */
    public OpenEnum getReviewAuditCd() {
        return reviewAuditCd;
    }

    /**
     * Sets the value of the reviewAuditCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpenEnum }
     *     
     */
    public void setReviewAuditCd(OpenEnum value) {
        this.reviewAuditCd = value;
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
     * Gets the value of the auditorRef property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAuditorRef() {
        return auditorRef;
    }

    /**
     * Sets the value of the auditorRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAuditorRef(Object value) {
        this.auditorRef = value;
    }

}

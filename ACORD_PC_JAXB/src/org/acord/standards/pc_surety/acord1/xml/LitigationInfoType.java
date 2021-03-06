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
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for LitigationInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LitigationInfo_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}CourtTypeCd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}Caption" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}CourtName" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}Addr" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}DocketNum" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}LitigationStatusCd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}LitigationDispositionCd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}DefenseCategoryCd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}ThresholdTypeCd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}ThresholdStateProvCd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}ThresholdAmt" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}EventInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}ID" />
 *       &lt;attribute name="AuthorizedRepRef" type="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}IDREF" />
 *       &lt;attribute name="PlaintiffRefs" type="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}IDREFS" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LitigationInfo_Type", propOrder = {
    "courtTypeCd",
    "caption",
    "courtName",
    "addr",
    "docketNum",
    "litigationStatusCd",
    "litigationDispositionCd",
    "defenseCategoryCd",
    "thresholdTypeCd",
    "thresholdStateProvCd",
    "thresholdAmt",
    "eventInfo"
})
public class LitigationInfoType {

    @XmlElement(name = "CourtTypeCd")
    protected CourtType courtTypeCd;
    @XmlElement(name = "Caption")
    protected C255 caption;
    @XmlElement(name = "CourtName")
    protected C255 courtName;
    @XmlElement(name = "Addr")
    protected AddrType addr;
    @XmlElement(name = "DocketNum")
    protected C60 docketNum;
    @XmlElement(name = "LitigationStatusCd")
    protected LitigationStatus litigationStatusCd;
    @XmlElement(name = "LitigationDispositionCd")
    protected LitigationDisposition litigationDispositionCd;
    @XmlElement(name = "DefenseCategoryCd")
    protected DefenseCategory defenseCategoryCd;
    @XmlElement(name = "ThresholdTypeCd")
    protected ThresholdType thresholdTypeCd;
    @XmlElement(name = "ThresholdStateProvCd")
    protected OpenEnum thresholdStateProvCd;
    @XmlElement(name = "ThresholdAmt")
    protected CURRENCY thresholdAmt;
    @XmlElement(name = "EventInfo")
    protected List<EventInfoType> eventInfo;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;
    @XmlAttribute(name = "AuthorizedRepRef")
    @XmlIDREF
    protected Object authorizedRepRef;
    @XmlAttribute(name = "PlaintiffRefs")
    @XmlIDREF
    protected List<Object> plaintiffRefs;

    /**
     * Gets the value of the courtTypeCd property.
     * 
     * @return
     *     possible object is
     *     {@link CourtType }
     *     
     */
    public CourtType getCourtTypeCd() {
        return courtTypeCd;
    }

    /**
     * Sets the value of the courtTypeCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link CourtType }
     *     
     */
    public void setCourtTypeCd(CourtType value) {
        this.courtTypeCd = value;
    }

    /**
     * Gets the value of the caption property.
     * 
     * @return
     *     possible object is
     *     {@link C255 }
     *     
     */
    public C255 getCaption() {
        return caption;
    }

    /**
     * Sets the value of the caption property.
     * 
     * @param value
     *     allowed object is
     *     {@link C255 }
     *     
     */
    public void setCaption(C255 value) {
        this.caption = value;
    }

    /**
     * Gets the value of the courtName property.
     * 
     * @return
     *     possible object is
     *     {@link C255 }
     *     
     */
    public C255 getCourtName() {
        return courtName;
    }

    /**
     * Sets the value of the courtName property.
     * 
     * @param value
     *     allowed object is
     *     {@link C255 }
     *     
     */
    public void setCourtName(C255 value) {
        this.courtName = value;
    }

    /**
     * Gets the value of the addr property.
     * 
     * @return
     *     possible object is
     *     {@link AddrType }
     *     
     */
    public AddrType getAddr() {
        return addr;
    }

    /**
     * Sets the value of the addr property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddrType }
     *     
     */
    public void setAddr(AddrType value) {
        this.addr = value;
    }

    /**
     * Gets the value of the docketNum property.
     * 
     * @return
     *     possible object is
     *     {@link C60 }
     *     
     */
    public C60 getDocketNum() {
        return docketNum;
    }

    /**
     * Sets the value of the docketNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link C60 }
     *     
     */
    public void setDocketNum(C60 value) {
        this.docketNum = value;
    }

    /**
     * Gets the value of the litigationStatusCd property.
     * 
     * @return
     *     possible object is
     *     {@link LitigationStatus }
     *     
     */
    public LitigationStatus getLitigationStatusCd() {
        return litigationStatusCd;
    }

    /**
     * Sets the value of the litigationStatusCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link LitigationStatus }
     *     
     */
    public void setLitigationStatusCd(LitigationStatus value) {
        this.litigationStatusCd = value;
    }

    /**
     * Gets the value of the litigationDispositionCd property.
     * 
     * @return
     *     possible object is
     *     {@link LitigationDisposition }
     *     
     */
    public LitigationDisposition getLitigationDispositionCd() {
        return litigationDispositionCd;
    }

    /**
     * Sets the value of the litigationDispositionCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link LitigationDisposition }
     *     
     */
    public void setLitigationDispositionCd(LitigationDisposition value) {
        this.litigationDispositionCd = value;
    }

    /**
     * Gets the value of the defenseCategoryCd property.
     * 
     * @return
     *     possible object is
     *     {@link DefenseCategory }
     *     
     */
    public DefenseCategory getDefenseCategoryCd() {
        return defenseCategoryCd;
    }

    /**
     * Sets the value of the defenseCategoryCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link DefenseCategory }
     *     
     */
    public void setDefenseCategoryCd(DefenseCategory value) {
        this.defenseCategoryCd = value;
    }

    /**
     * Gets the value of the thresholdTypeCd property.
     * 
     * @return
     *     possible object is
     *     {@link ThresholdType }
     *     
     */
    public ThresholdType getThresholdTypeCd() {
        return thresholdTypeCd;
    }

    /**
     * Sets the value of the thresholdTypeCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ThresholdType }
     *     
     */
    public void setThresholdTypeCd(ThresholdType value) {
        this.thresholdTypeCd = value;
    }

    /**
     * Gets the value of the thresholdStateProvCd property.
     * 
     * @return
     *     possible object is
     *     {@link OpenEnum }
     *     
     */
    public OpenEnum getThresholdStateProvCd() {
        return thresholdStateProvCd;
    }

    /**
     * Sets the value of the thresholdStateProvCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpenEnum }
     *     
     */
    public void setThresholdStateProvCd(OpenEnum value) {
        this.thresholdStateProvCd = value;
    }

    /**
     * Gets the value of the thresholdAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CURRENCY }
     *     
     */
    public CURRENCY getThresholdAmt() {
        return thresholdAmt;
    }

    /**
     * Sets the value of the thresholdAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CURRENCY }
     *     
     */
    public void setThresholdAmt(CURRENCY value) {
        this.thresholdAmt = value;
    }

    /**
     * Gets the value of the eventInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eventInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEventInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EventInfoType }
     * 
     * 
     */
    public List<EventInfoType> getEventInfo() {
        if (eventInfo == null) {
            eventInfo = new ArrayList<EventInfoType>();
        }
        return this.eventInfo;
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

    /**
     * Gets the value of the plaintiffRefs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the plaintiffRefs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPlaintiffRefs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getPlaintiffRefs() {
        if (plaintiffRefs == null) {
            plaintiffRefs = new ArrayList<Object>();
        }
        return this.plaintiffRefs;
    }

}

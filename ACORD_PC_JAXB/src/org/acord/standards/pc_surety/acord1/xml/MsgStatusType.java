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
 * <p>Java class for MsgStatus_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MsgStatus_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}MsgStatusCd"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}MsgErrorCd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}MsgStatusDesc" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}PendingResponseAvailDt" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}PendingResponseExpDt" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}ExtendedStatus" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}ChangeStatus" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "MsgStatus_Type", propOrder = {
    "msgStatusCd",
    "msgErrorCd",
    "msgStatusDesc",
    "pendingResponseAvailDt",
    "pendingResponseExpDt",
    "extendedStatus",
    "changeStatus"
})
public class MsgStatusType {

    @XmlElement(name = "MsgStatusCd", required = true)
    protected MessageStatus msgStatusCd;
    @XmlElement(name = "MsgErrorCd")
    protected MessageError msgErrorCd;
    @XmlElement(name = "MsgStatusDesc")
    protected CInfinite msgStatusDesc;
    @XmlElement(name = "PendingResponseAvailDt")
    protected DateTime pendingResponseAvailDt;
    @XmlElement(name = "PendingResponseExpDt")
    protected DateTime pendingResponseExpDt;
    @XmlElement(name = "ExtendedStatus")
    protected List<ExtendedStatusType> extendedStatus;
    @XmlElement(name = "ChangeStatus")
    protected List<ChangeStatusType> changeStatus;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;

    /**
     * Gets the value of the msgStatusCd property.
     * 
     * @return
     *     possible object is
     *     {@link MessageStatus }
     *     
     */
    public MessageStatus getMsgStatusCd() {
        return msgStatusCd;
    }

    /**
     * Sets the value of the msgStatusCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageStatus }
     *     
     */
    public void setMsgStatusCd(MessageStatus value) {
        this.msgStatusCd = value;
    }

    /**
     * Gets the value of the msgErrorCd property.
     * 
     * @return
     *     possible object is
     *     {@link MessageError }
     *     
     */
    public MessageError getMsgErrorCd() {
        return msgErrorCd;
    }

    /**
     * Sets the value of the msgErrorCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageError }
     *     
     */
    public void setMsgErrorCd(MessageError value) {
        this.msgErrorCd = value;
    }

    /**
     * Gets the value of the msgStatusDesc property.
     * 
     * @return
     *     possible object is
     *     {@link CInfinite }
     *     
     */
    public CInfinite getMsgStatusDesc() {
        return msgStatusDesc;
    }

    /**
     * Sets the value of the msgStatusDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CInfinite }
     *     
     */
    public void setMsgStatusDesc(CInfinite value) {
        this.msgStatusDesc = value;
    }

    /**
     * Gets the value of the pendingResponseAvailDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getPendingResponseAvailDt() {
        return pendingResponseAvailDt;
    }

    /**
     * Sets the value of the pendingResponseAvailDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setPendingResponseAvailDt(DateTime value) {
        this.pendingResponseAvailDt = value;
    }

    /**
     * Gets the value of the pendingResponseExpDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getPendingResponseExpDt() {
        return pendingResponseExpDt;
    }

    /**
     * Sets the value of the pendingResponseExpDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setPendingResponseExpDt(DateTime value) {
        this.pendingResponseExpDt = value;
    }

    /**
     * Gets the value of the extendedStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extendedStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtendedStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExtendedStatusType }
     * 
     * 
     */
    public List<ExtendedStatusType> getExtendedStatus() {
        if (extendedStatus == null) {
            extendedStatus = new ArrayList<ExtendedStatusType>();
        }
        return this.extendedStatus;
    }

    /**
     * Gets the value of the changeStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the changeStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChangeStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChangeStatusType }
     * 
     * 
     */
    public List<ChangeStatusType> getChangeStatus() {
        if (changeStatus == null) {
            changeStatus = new ArrayList<ChangeStatusType>();
        }
        return this.changeStatus;
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

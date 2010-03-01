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
 * <p>Java class for EDPInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EDPInfo_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}LocationEquipmentCd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}ItemInfo" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}AlarmAndSecurity" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}MediaAndDataInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}OperationsDesc" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}ID" />
 *       &lt;attribute name="LocationRef" type="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}IDREF" />
 *       &lt;attribute name="SubLocationRef" type="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}IDREF" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EDPInfo_Type", propOrder = {
    "locationEquipmentCd",
    "itemInfo",
    "alarmAndSecurity",
    "mediaAndDataInfo",
    "operationsDesc"
})
public class EDPInfoType {

    @XmlElement(name = "LocationEquipmentCd")
    protected ItemLocation locationEquipmentCd;
    @XmlElement(name = "ItemInfo")
    protected ItemInfoType itemInfo;
    @XmlElement(name = "AlarmAndSecurity")
    protected List<AlarmAndSecurityType> alarmAndSecurity;
    @XmlElement(name = "MediaAndDataInfo")
    protected List<MediaAndDataInfoType> mediaAndDataInfo;
    @XmlElement(name = "OperationsDesc")
    protected C255 operationsDesc;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;
    @XmlAttribute(name = "LocationRef")
    @XmlIDREF
    protected Object locationRef;
    @XmlAttribute(name = "SubLocationRef")
    @XmlIDREF
    protected Object subLocationRef;

    /**
     * Gets the value of the locationEquipmentCd property.
     * 
     * @return
     *     possible object is
     *     {@link ItemLocation }
     *     
     */
    public ItemLocation getLocationEquipmentCd() {
        return locationEquipmentCd;
    }

    /**
     * Sets the value of the locationEquipmentCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemLocation }
     *     
     */
    public void setLocationEquipmentCd(ItemLocation value) {
        this.locationEquipmentCd = value;
    }

    /**
     * Gets the value of the itemInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ItemInfoType }
     *     
     */
    public ItemInfoType getItemInfo() {
        return itemInfo;
    }

    /**
     * Sets the value of the itemInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemInfoType }
     *     
     */
    public void setItemInfo(ItemInfoType value) {
        this.itemInfo = value;
    }

    /**
     * Gets the value of the alarmAndSecurity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the alarmAndSecurity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlarmAndSecurity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AlarmAndSecurityType }
     * 
     * 
     */
    public List<AlarmAndSecurityType> getAlarmAndSecurity() {
        if (alarmAndSecurity == null) {
            alarmAndSecurity = new ArrayList<AlarmAndSecurityType>();
        }
        return this.alarmAndSecurity;
    }

    /**
     * Gets the value of the mediaAndDataInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mediaAndDataInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMediaAndDataInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MediaAndDataInfoType }
     * 
     * 
     */
    public List<MediaAndDataInfoType> getMediaAndDataInfo() {
        if (mediaAndDataInfo == null) {
            mediaAndDataInfo = new ArrayList<MediaAndDataInfoType>();
        }
        return this.mediaAndDataInfo;
    }

    /**
     * Gets the value of the operationsDesc property.
     * 
     * @return
     *     possible object is
     *     {@link C255 }
     *     
     */
    public C255 getOperationsDesc() {
        return operationsDesc;
    }

    /**
     * Sets the value of the operationsDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link C255 }
     *     
     */
    public void setOperationsDesc(C255 value) {
        this.operationsDesc = value;
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
     * Gets the value of the locationRef property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getLocationRef() {
        return locationRef;
    }

    /**
     * Sets the value of the locationRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setLocationRef(Object value) {
        this.locationRef = value;
    }

    /**
     * Gets the value of the subLocationRef property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getSubLocationRef() {
        return subLocationRef;
    }

    /**
     * Sets the value of the subLocationRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setSubLocationRef(Object value) {
        this.subLocationRef = value;
    }

}
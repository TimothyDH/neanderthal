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
 * <p>Java class for MatchInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MatchInfo_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}NumMatches" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}NumPersonMatches" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}NumVehMatches" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}AdditionalMatchInfo" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "MatchInfo_Type", propOrder = {
    "numMatches",
    "numPersonMatches",
    "numVehMatches",
    "additionalMatchInfo"
})
public class MatchInfoType {

    @XmlElement(name = "NumMatches")
    protected Long numMatches;
    @XmlElement(name = "NumPersonMatches")
    protected Long numPersonMatches;
    @XmlElement(name = "NumVehMatches")
    protected Long numVehMatches;
    @XmlElement(name = "AdditionalMatchInfo")
    protected List<AdditionalMatchInfoType> additionalMatchInfo;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;

    /**
     * Gets the value of the numMatches property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumMatches() {
        return numMatches;
    }

    /**
     * Sets the value of the numMatches property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumMatches(Long value) {
        this.numMatches = value;
    }

    /**
     * Gets the value of the numPersonMatches property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumPersonMatches() {
        return numPersonMatches;
    }

    /**
     * Sets the value of the numPersonMatches property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumPersonMatches(Long value) {
        this.numPersonMatches = value;
    }

    /**
     * Gets the value of the numVehMatches property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumVehMatches() {
        return numVehMatches;
    }

    /**
     * Sets the value of the numVehMatches property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumVehMatches(Long value) {
        this.numVehMatches = value;
    }

    /**
     * Gets the value of the additionalMatchInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalMatchInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalMatchInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalMatchInfoType }
     * 
     * 
     */
    public List<AdditionalMatchInfoType> getAdditionalMatchInfo() {
        if (additionalMatchInfo == null) {
            additionalMatchInfo = new ArrayList<AdditionalMatchInfoType>();
        }
        return this.additionalMatchInfo;
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

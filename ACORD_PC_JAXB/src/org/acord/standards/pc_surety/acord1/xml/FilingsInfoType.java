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
 * <p>Java class for FilingsInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FilingsInfo_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}StateProvCd" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}PUCFilingInd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}PSCFilingInd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}DOTNumber" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}MotorCarrierNumber" minOccurs="0"/>
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
@XmlType(name = "FilingsInfo_Type", propOrder = {
    "stateProvCd",
    "pucFilingInd",
    "pscFilingInd",
    "dotNumber",
    "motorCarrierNumber"
})
public class FilingsInfoType {

    @XmlElement(name = "StateProvCd")
    protected List<OpenEnum> stateProvCd;
    @XmlElement(name = "PUCFilingInd")
    protected Boolean pucFilingInd;
    @XmlElement(name = "PSCFilingInd")
    protected Boolean pscFilingInd;
    @XmlElement(name = "DOTNumber")
    protected Long dotNumber;
    @XmlElement(name = "MotorCarrierNumber")
    protected Long motorCarrierNumber;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;

    /**
     * Gets the value of the stateProvCd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stateProvCd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStateProvCd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OpenEnum }
     * 
     * 
     */
    public List<OpenEnum> getStateProvCd() {
        if (stateProvCd == null) {
            stateProvCd = new ArrayList<OpenEnum>();
        }
        return this.stateProvCd;
    }

    /**
     * Gets the value of the pucFilingInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getPUCFilingInd() {
        return pucFilingInd;
    }

    /**
     * Sets the value of the pucFilingInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPUCFilingInd(Boolean value) {
        this.pucFilingInd = value;
    }

    /**
     * Gets the value of the pscFilingInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getPSCFilingInd() {
        return pscFilingInd;
    }

    /**
     * Sets the value of the pscFilingInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPSCFilingInd(Boolean value) {
        this.pscFilingInd = value;
    }

    /**
     * Gets the value of the dotNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDOTNumber() {
        return dotNumber;
    }

    /**
     * Sets the value of the dotNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDOTNumber(Long value) {
        this.dotNumber = value;
    }

    /**
     * Gets the value of the motorCarrierNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMotorCarrierNumber() {
        return motorCarrierNumber;
    }

    /**
     * Sets the value of the motorCarrierNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMotorCarrierNumber(Long value) {
        this.motorCarrierNumber = value;
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

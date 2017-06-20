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
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for FlueInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FlueInfo_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}FuelTypeCd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}VentLocCd" minOccurs="0"/>
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
@XmlType(name = "FlueInfo_Type", propOrder = {
    "fuelTypeCd",
    "ventLocCd"
})
public class FlueInfoType {

    @XmlElement(name = "FuelTypeCd")
    protected FuelType fuelTypeCd;
    @XmlElement(name = "VentLocCd")
    protected VentLocation ventLocCd;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;

    /**
     * Gets the value of the fuelTypeCd property.
     * 
     * @return
     *     possible object is
     *     {@link FuelType }
     *     
     */
    public FuelType getFuelTypeCd() {
        return fuelTypeCd;
    }

    /**
     * Sets the value of the fuelTypeCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link FuelType }
     *     
     */
    public void setFuelTypeCd(FuelType value) {
        this.fuelTypeCd = value;
    }

    /**
     * Gets the value of the ventLocCd property.
     * 
     * @return
     *     possible object is
     *     {@link VentLocation }
     *     
     */
    public VentLocation getVentLocCd() {
        return ventLocCd;
    }

    /**
     * Sets the value of the ventLocCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link VentLocation }
     *     
     */
    public void setVentLocCd(VentLocation value) {
        this.ventLocCd = value;
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
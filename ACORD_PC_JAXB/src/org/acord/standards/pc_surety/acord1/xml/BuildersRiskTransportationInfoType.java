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
 * <p>Java class for BuildersRiskTransportationInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BuildersRiskTransportationInfo_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}ItemValueAmt" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}ApplicantRiskPct" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}CommonCarrierRiskPct" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}Distance" minOccurs="0"/>
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
@XmlType(name = "BuildersRiskTransportationInfo_Type", propOrder = {
    "itemValueAmt",
    "applicantRiskPct",
    "commonCarrierRiskPct",
    "distance"
})
public class BuildersRiskTransportationInfoType {

    @XmlElement(name = "ItemValueAmt")
    protected CURRENCY itemValueAmt;
    @XmlElement(name = "ApplicantRiskPct")
    protected PercentLong applicantRiskPct;
    @XmlElement(name = "CommonCarrierRiskPct")
    protected PercentLong commonCarrierRiskPct;
    @XmlElement(name = "Distance")
    protected MEASUREMENT distance;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;

    /**
     * Gets the value of the itemValueAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CURRENCY }
     *     
     */
    public CURRENCY getItemValueAmt() {
        return itemValueAmt;
    }

    /**
     * Sets the value of the itemValueAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CURRENCY }
     *     
     */
    public void setItemValueAmt(CURRENCY value) {
        this.itemValueAmt = value;
    }

    /**
     * Gets the value of the applicantRiskPct property.
     * 
     * @return
     *     possible object is
     *     {@link PercentLong }
     *     
     */
    public PercentLong getApplicantRiskPct() {
        return applicantRiskPct;
    }

    /**
     * Sets the value of the applicantRiskPct property.
     * 
     * @param value
     *     allowed object is
     *     {@link PercentLong }
     *     
     */
    public void setApplicantRiskPct(PercentLong value) {
        this.applicantRiskPct = value;
    }

    /**
     * Gets the value of the commonCarrierRiskPct property.
     * 
     * @return
     *     possible object is
     *     {@link PercentLong }
     *     
     */
    public PercentLong getCommonCarrierRiskPct() {
        return commonCarrierRiskPct;
    }

    /**
     * Sets the value of the commonCarrierRiskPct property.
     * 
     * @param value
     *     allowed object is
     *     {@link PercentLong }
     *     
     */
    public void setCommonCarrierRiskPct(PercentLong value) {
        this.commonCarrierRiskPct = value;
    }

    /**
     * Gets the value of the distance property.
     * 
     * @return
     *     possible object is
     *     {@link MEASUREMENT }
     *     
     */
    public MEASUREMENT getDistance() {
        return distance;
    }

    /**
     * Sets the value of the distance property.
     * 
     * @param value
     *     allowed object is
     *     {@link MEASUREMENT }
     *     
     */
    public void setDistance(MEASUREMENT value) {
        this.distance = value;
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

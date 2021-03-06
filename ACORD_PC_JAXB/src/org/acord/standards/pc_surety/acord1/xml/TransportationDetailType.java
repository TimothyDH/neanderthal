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
 * <p>Java class for TransportationDetail_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransportationDetail_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}ShipmentDt" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}ShippingInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}AnnualGrossSalesFOBPct" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}ContingentCoverageFOBInd" minOccurs="0"/>
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
@XmlType(name = "TransportationDetail_Type", propOrder = {
    "shipmentDt",
    "shippingInfo",
    "annualGrossSalesFOBPct",
    "contingentCoverageFOBInd"
})
public class TransportationDetailType {

    @XmlElement(name = "ShipmentDt")
    protected Date shipmentDt;
    @XmlElement(name = "ShippingInfo")
    protected List<ShippingInfoType> shippingInfo;
    @XmlElement(name = "AnnualGrossSalesFOBPct")
    protected PercentLong annualGrossSalesFOBPct;
    @XmlElement(name = "ContingentCoverageFOBInd")
    protected Boolean contingentCoverageFOBInd;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;

    /**
     * Gets the value of the shipmentDt property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getShipmentDt() {
        return shipmentDt;
    }

    /**
     * Sets the value of the shipmentDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setShipmentDt(Date value) {
        this.shipmentDt = value;
    }

    /**
     * Gets the value of the shippingInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shippingInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShippingInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShippingInfoType }
     * 
     * 
     */
    public List<ShippingInfoType> getShippingInfo() {
        if (shippingInfo == null) {
            shippingInfo = new ArrayList<ShippingInfoType>();
        }
        return this.shippingInfo;
    }

    /**
     * Gets the value of the annualGrossSalesFOBPct property.
     * 
     * @return
     *     possible object is
     *     {@link PercentLong }
     *     
     */
    public PercentLong getAnnualGrossSalesFOBPct() {
        return annualGrossSalesFOBPct;
    }

    /**
     * Sets the value of the annualGrossSalesFOBPct property.
     * 
     * @param value
     *     allowed object is
     *     {@link PercentLong }
     *     
     */
    public void setAnnualGrossSalesFOBPct(PercentLong value) {
        this.annualGrossSalesFOBPct = value;
    }

    /**
     * Gets the value of the contingentCoverageFOBInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getContingentCoverageFOBInd() {
        return contingentCoverageFOBInd;
    }

    /**
     * Sets the value of the contingentCoverageFOBInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setContingentCoverageFOBInd(Boolean value) {
        this.contingentCoverageFOBInd = value;
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

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-147 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.02.24 at 10:20:12 PM EST 
//


package org.acord.standards.pc_surety.acord1.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Deductible_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Deductible_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}PCDEDUCTIBLE">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}IndexAdjustment" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Deductible_Type", propOrder = {
    "indexAdjustment"
})
public class DeductibleType2
    extends PCDEDUCTIBLE
{

    @XmlElement(name = "IndexAdjustment")
    protected IndexAdjustmentType indexAdjustment;

    /**
     * Gets the value of the indexAdjustment property.
     * 
     * @return
     *     possible object is
     *     {@link IndexAdjustmentType }
     *     
     */
    public IndexAdjustmentType getIndexAdjustment() {
        return indexAdjustment;
    }

    /**
     * Sets the value of the indexAdjustment property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndexAdjustmentType }
     *     
     */
    public void setIndexAdjustment(IndexAdjustmentType value) {
        this.indexAdjustment = value;
    }

}
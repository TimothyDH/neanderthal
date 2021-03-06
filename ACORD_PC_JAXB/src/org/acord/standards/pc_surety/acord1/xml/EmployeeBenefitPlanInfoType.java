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
 * <p>Java class for EmployeeBenefitPlanInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EmployeeBenefitPlanInfo_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}PlanName" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}NumEmployees" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}NumPlanParticipants" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}PlanAssetValueAmt" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}ID" />
 *       &lt;attribute name="PrincipalAddrRef" type="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}IDREF" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EmployeeBenefitPlanInfo_Type", propOrder = {
    "planName",
    "numEmployees",
    "numPlanParticipants",
    "planAssetValueAmt"
})
public class EmployeeBenefitPlanInfoType {

    @XmlElement(name = "PlanName")
    protected C255 planName;
    @XmlElement(name = "NumEmployees")
    protected Long numEmployees;
    @XmlElement(name = "NumPlanParticipants")
    protected Long numPlanParticipants;
    @XmlElement(name = "PlanAssetValueAmt")
    protected CURRENCY planAssetValueAmt;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;
    @XmlAttribute(name = "PrincipalAddrRef")
    @XmlIDREF
    protected Object principalAddrRef;

    /**
     * Gets the value of the planName property.
     * 
     * @return
     *     possible object is
     *     {@link C255 }
     *     
     */
    public C255 getPlanName() {
        return planName;
    }

    /**
     * Sets the value of the planName property.
     * 
     * @param value
     *     allowed object is
     *     {@link C255 }
     *     
     */
    public void setPlanName(C255 value) {
        this.planName = value;
    }

    /**
     * Gets the value of the numEmployees property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumEmployees() {
        return numEmployees;
    }

    /**
     * Sets the value of the numEmployees property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumEmployees(Long value) {
        this.numEmployees = value;
    }

    /**
     * Gets the value of the numPlanParticipants property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumPlanParticipants() {
        return numPlanParticipants;
    }

    /**
     * Sets the value of the numPlanParticipants property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumPlanParticipants(Long value) {
        this.numPlanParticipants = value;
    }

    /**
     * Gets the value of the planAssetValueAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CURRENCY }
     *     
     */
    public CURRENCY getPlanAssetValueAmt() {
        return planAssetValueAmt;
    }

    /**
     * Sets the value of the planAssetValueAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CURRENCY }
     *     
     */
    public void setPlanAssetValueAmt(CURRENCY value) {
        this.planAssetValueAmt = value;
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
     * Gets the value of the principalAddrRef property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getPrincipalAddrRef() {
        return principalAddrRef;
    }

    /**
     * Sets the value of the principalAddrRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setPrincipalAddrRef(Object value) {
        this.principalAddrRef = value;
    }

}

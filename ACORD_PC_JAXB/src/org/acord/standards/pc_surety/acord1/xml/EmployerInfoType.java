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
 * <p>Java class for EmployerInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EmployerInfo_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}NCCIIDNumber" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}SelfInsuredInd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}LessorInd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}SpecificProductsDesc" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}EmployerPayrollCd" minOccurs="0"/>
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
@XmlType(name = "EmployerInfo_Type", propOrder = {
    "ncciidNumber",
    "selfInsuredInd",
    "lessorInd",
    "specificProductsDesc",
    "employerPayrollCd"
})
public class EmployerInfoType {

    @XmlElement(name = "NCCIIDNumber")
    protected AssignedIdentifier ncciidNumber;
    @XmlElement(name = "SelfInsuredInd")
    protected Boolean selfInsuredInd;
    @XmlElement(name = "LessorInd")
    protected Boolean lessorInd;
    @XmlElement(name = "SpecificProductsDesc")
    protected C255 specificProductsDesc;
    @XmlElement(name = "EmployerPayrollCd")
    protected OpenEnum employerPayrollCd;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;

    /**
     * Gets the value of the ncciidNumber property.
     * 
     * @return
     *     possible object is
     *     {@link AssignedIdentifier }
     *     
     */
    public AssignedIdentifier getNCCIIDNumber() {
        return ncciidNumber;
    }

    /**
     * Sets the value of the ncciidNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssignedIdentifier }
     *     
     */
    public void setNCCIIDNumber(AssignedIdentifier value) {
        this.ncciidNumber = value;
    }

    /**
     * Gets the value of the selfInsuredInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getSelfInsuredInd() {
        return selfInsuredInd;
    }

    /**
     * Sets the value of the selfInsuredInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSelfInsuredInd(Boolean value) {
        this.selfInsuredInd = value;
    }

    /**
     * Gets the value of the lessorInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getLessorInd() {
        return lessorInd;
    }

    /**
     * Sets the value of the lessorInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLessorInd(Boolean value) {
        this.lessorInd = value;
    }

    /**
     * Gets the value of the specificProductsDesc property.
     * 
     * @return
     *     possible object is
     *     {@link C255 }
     *     
     */
    public C255 getSpecificProductsDesc() {
        return specificProductsDesc;
    }

    /**
     * Sets the value of the specificProductsDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link C255 }
     *     
     */
    public void setSpecificProductsDesc(C255 value) {
        this.specificProductsDesc = value;
    }

    /**
     * Gets the value of the employerPayrollCd property.
     * 
     * @return
     *     possible object is
     *     {@link OpenEnum }
     *     
     */
    public OpenEnum getEmployerPayrollCd() {
        return employerPayrollCd;
    }

    /**
     * Sets the value of the employerPayrollCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpenEnum }
     *     
     */
    public void setEmployerPayrollCd(OpenEnum value) {
        this.employerPayrollCd = value;
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

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
 * <p>Java class for WorkCompAuditExposureInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WorkCompAuditExposureInfo_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}AuditPeriod" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}RatingClassificationCd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}RatingClassificationDescCd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}CommlCoverage" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}PremiumBasisCd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}Exposure" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}ID" />
 *       &lt;attribute name="EmployeeRef" type="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}IDREF" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WorkCompAuditExposureInfo_Type", propOrder = {
    "auditPeriod",
    "ratingClassificationCd",
    "ratingClassificationDescCd",
    "commlCoverage",
    "premiumBasisCd",
    "exposure"
})
public class WorkCompAuditExposureInfoType {

    @XmlElement(name = "AuditPeriod")
    protected DURATION auditPeriod;
    @XmlElement(name = "RatingClassificationCd")
    protected OpenEnum ratingClassificationCd;
    @XmlElement(name = "RatingClassificationDescCd")
    protected OpenEnum ratingClassificationDescCd;
    @XmlElement(name = "CommlCoverage")
    protected List<CommlCoverageType> commlCoverage;
    @XmlElement(name = "PremiumBasisCd")
    protected PremiumBase premiumBasisCd;
    @XmlElement(name = "Exposure")
    protected Decimal exposure;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;
    @XmlAttribute(name = "EmployeeRef")
    @XmlIDREF
    protected Object employeeRef;

    /**
     * Gets the value of the auditPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link DURATION }
     *     
     */
    public DURATION getAuditPeriod() {
        return auditPeriod;
    }

    /**
     * Sets the value of the auditPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link DURATION }
     *     
     */
    public void setAuditPeriod(DURATION value) {
        this.auditPeriod = value;
    }

    /**
     * Gets the value of the ratingClassificationCd property.
     * 
     * @return
     *     possible object is
     *     {@link OpenEnum }
     *     
     */
    public OpenEnum getRatingClassificationCd() {
        return ratingClassificationCd;
    }

    /**
     * Sets the value of the ratingClassificationCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpenEnum }
     *     
     */
    public void setRatingClassificationCd(OpenEnum value) {
        this.ratingClassificationCd = value;
    }

    /**
     * Gets the value of the ratingClassificationDescCd property.
     * 
     * @return
     *     possible object is
     *     {@link OpenEnum }
     *     
     */
    public OpenEnum getRatingClassificationDescCd() {
        return ratingClassificationDescCd;
    }

    /**
     * Sets the value of the ratingClassificationDescCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpenEnum }
     *     
     */
    public void setRatingClassificationDescCd(OpenEnum value) {
        this.ratingClassificationDescCd = value;
    }

    /**
     * Gets the value of the commlCoverage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the commlCoverage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCommlCoverage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommlCoverageType }
     * 
     * 
     */
    public List<CommlCoverageType> getCommlCoverage() {
        if (commlCoverage == null) {
            commlCoverage = new ArrayList<CommlCoverageType>();
        }
        return this.commlCoverage;
    }

    /**
     * Gets the value of the premiumBasisCd property.
     * 
     * @return
     *     possible object is
     *     {@link PremiumBase }
     *     
     */
    public PremiumBase getPremiumBasisCd() {
        return premiumBasisCd;
    }

    /**
     * Sets the value of the premiumBasisCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link PremiumBase }
     *     
     */
    public void setPremiumBasisCd(PremiumBase value) {
        this.premiumBasisCd = value;
    }

    /**
     * Gets the value of the exposure property.
     * 
     * @return
     *     possible object is
     *     {@link Decimal }
     *     
     */
    public Decimal getExposure() {
        return exposure;
    }

    /**
     * Sets the value of the exposure property.
     * 
     * @param value
     *     allowed object is
     *     {@link Decimal }
     *     
     */
    public void setExposure(Decimal value) {
        this.exposure = value;
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
     * Gets the value of the employeeRef property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getEmployeeRef() {
        return employeeRef;
    }

    /**
     * Sets the value of the employeeRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setEmployeeRef(Object value) {
        this.employeeRef = value;
    }

}

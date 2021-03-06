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
 * <p>Java class for Certification_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Certification_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}CertificationCd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}PilotRatingCd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}CertifiedInd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}OtherCertification" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}OtherRating" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}CertificationDt" minOccurs="0"/>
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
@XmlType(name = "Certification_Type", propOrder = {
    "certificationCd",
    "pilotRatingCd",
    "certifiedInd",
    "otherCertification",
    "otherRating",
    "certificationDt"
})
public class CertificationType2 {

    @XmlElement(name = "CertificationCd")
    protected CertificationType certificationCd;
    @XmlElement(name = "PilotRatingCd")
    protected PilotRating pilotRatingCd;
    @XmlElement(name = "CertifiedInd")
    protected Boolean certifiedInd;
    @XmlElement(name = "OtherCertification")
    protected C20 otherCertification;
    @XmlElement(name = "OtherRating")
    protected C20 otherRating;
    @XmlElement(name = "CertificationDt")
    protected Date certificationDt;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;

    /**
     * Gets the value of the certificationCd property.
     * 
     * @return
     *     possible object is
     *     {@link CertificationType }
     *     
     */
    public CertificationType getCertificationCd() {
        return certificationCd;
    }

    /**
     * Sets the value of the certificationCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link CertificationType }
     *     
     */
    public void setCertificationCd(CertificationType value) {
        this.certificationCd = value;
    }

    /**
     * Gets the value of the pilotRatingCd property.
     * 
     * @return
     *     possible object is
     *     {@link PilotRating }
     *     
     */
    public PilotRating getPilotRatingCd() {
        return pilotRatingCd;
    }

    /**
     * Sets the value of the pilotRatingCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link PilotRating }
     *     
     */
    public void setPilotRatingCd(PilotRating value) {
        this.pilotRatingCd = value;
    }

    /**
     * Gets the value of the certifiedInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getCertifiedInd() {
        return certifiedInd;
    }

    /**
     * Sets the value of the certifiedInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCertifiedInd(Boolean value) {
        this.certifiedInd = value;
    }

    /**
     * Gets the value of the otherCertification property.
     * 
     * @return
     *     possible object is
     *     {@link C20 }
     *     
     */
    public C20 getOtherCertification() {
        return otherCertification;
    }

    /**
     * Sets the value of the otherCertification property.
     * 
     * @param value
     *     allowed object is
     *     {@link C20 }
     *     
     */
    public void setOtherCertification(C20 value) {
        this.otherCertification = value;
    }

    /**
     * Gets the value of the otherRating property.
     * 
     * @return
     *     possible object is
     *     {@link C20 }
     *     
     */
    public C20 getOtherRating() {
        return otherRating;
    }

    /**
     * Sets the value of the otherRating property.
     * 
     * @param value
     *     allowed object is
     *     {@link C20 }
     *     
     */
    public void setOtherRating(C20 value) {
        this.otherRating = value;
    }

    /**
     * Gets the value of the certificationDt property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getCertificationDt() {
        return certificationDt;
    }

    /**
     * Sets the value of the certificationDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setCertificationDt(Date value) {
        this.certificationDt = value;
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

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
 * <p>Java class for FloodCommunityInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FloodCommunityInfo_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}CommunityNumber" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}PanelNumber" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}FloodSuffix" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}FloodZoneCd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}CommunityRateClassCd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}InfoSourceCd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}CommunityProgramTypeCd" minOccurs="0"/>
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
@XmlType(name = "FloodCommunityInfo_Type", propOrder = {
    "communityNumber",
    "panelNumber",
    "floodSuffix",
    "floodZoneCd",
    "communityRateClassCd",
    "infoSourceCd",
    "communityProgramTypeCd"
})
public class FloodCommunityInfoType {

    @XmlElement(name = "CommunityNumber")
    protected Long communityNumber;
    @XmlElement(name = "PanelNumber")
    protected Long panelNumber;
    @XmlElement(name = "FloodSuffix")
    protected C2 floodSuffix;
    @XmlElement(name = "FloodZoneCd")
    protected OpenEnum floodZoneCd;
    @XmlElement(name = "CommunityRateClassCd")
    protected OpenEnum communityRateClassCd;
    @XmlElement(name = "InfoSourceCd")
    protected InformationSource infoSourceCd;
    @XmlElement(name = "CommunityProgramTypeCd")
    protected CommunityProgramType communityProgramTypeCd;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;

    /**
     * Gets the value of the communityNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCommunityNumber() {
        return communityNumber;
    }

    /**
     * Sets the value of the communityNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCommunityNumber(Long value) {
        this.communityNumber = value;
    }

    /**
     * Gets the value of the panelNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPanelNumber() {
        return panelNumber;
    }

    /**
     * Sets the value of the panelNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPanelNumber(Long value) {
        this.panelNumber = value;
    }

    /**
     * Gets the value of the floodSuffix property.
     * 
     * @return
     *     possible object is
     *     {@link C2 }
     *     
     */
    public C2 getFloodSuffix() {
        return floodSuffix;
    }

    /**
     * Sets the value of the floodSuffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link C2 }
     *     
     */
    public void setFloodSuffix(C2 value) {
        this.floodSuffix = value;
    }

    /**
     * Gets the value of the floodZoneCd property.
     * 
     * @return
     *     possible object is
     *     {@link OpenEnum }
     *     
     */
    public OpenEnum getFloodZoneCd() {
        return floodZoneCd;
    }

    /**
     * Sets the value of the floodZoneCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpenEnum }
     *     
     */
    public void setFloodZoneCd(OpenEnum value) {
        this.floodZoneCd = value;
    }

    /**
     * Gets the value of the communityRateClassCd property.
     * 
     * @return
     *     possible object is
     *     {@link OpenEnum }
     *     
     */
    public OpenEnum getCommunityRateClassCd() {
        return communityRateClassCd;
    }

    /**
     * Sets the value of the communityRateClassCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpenEnum }
     *     
     */
    public void setCommunityRateClassCd(OpenEnum value) {
        this.communityRateClassCd = value;
    }

    /**
     * Gets the value of the infoSourceCd property.
     * 
     * @return
     *     possible object is
     *     {@link InformationSource }
     *     
     */
    public InformationSource getInfoSourceCd() {
        return infoSourceCd;
    }

    /**
     * Sets the value of the infoSourceCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link InformationSource }
     *     
     */
    public void setInfoSourceCd(InformationSource value) {
        this.infoSourceCd = value;
    }

    /**
     * Gets the value of the communityProgramTypeCd property.
     * 
     * @return
     *     possible object is
     *     {@link CommunityProgramType }
     *     
     */
    public CommunityProgramType getCommunityProgramTypeCd() {
        return communityProgramTypeCd;
    }

    /**
     * Sets the value of the communityProgramTypeCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommunityProgramType }
     *     
     */
    public void setCommunityProgramTypeCd(CommunityProgramType value) {
        this.communityProgramTypeCd = value;
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

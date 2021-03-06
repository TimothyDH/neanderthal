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
 * <p>Java class for ChimneyInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChimneyInfo_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}ChimneyCd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}UnitLocationCd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}LiningCd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}GroundUpChimneyInd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}InstallationCd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}PipeVentStyleCd" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}Diameter" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}Length" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}ThimbleInd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}StovePipeCd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}ThimbleInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}ChimneyCleaning" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}FlueInfo" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "ChimneyInfo_Type", propOrder = {
    "chimneyCd",
    "unitLocationCd",
    "liningCd",
    "groundUpChimneyInd",
    "installationCd",
    "pipeVentStyleCd",
    "diameter",
    "length",
    "thimbleInd",
    "stovePipeCd",
    "thimbleInfo",
    "chimneyCleaning",
    "flueInfo"
})
public class ChimneyInfoType {

    @XmlElement(name = "ChimneyCd")
    protected Chimney chimneyCd;
    @XmlElement(name = "UnitLocationCd")
    protected UnitLocation unitLocationCd;
    @XmlElement(name = "LiningCd")
    protected Lining liningCd;
    @XmlElement(name = "GroundUpChimneyInd")
    protected Boolean groundUpChimneyInd;
    @XmlElement(name = "InstallationCd")
    protected Installation installationCd;
    @XmlElement(name = "PipeVentStyleCd")
    protected List<PipeVentStyle> pipeVentStyleCd;
    @XmlElement(name = "Diameter")
    protected MEASUREMENT diameter;
    @XmlElement(name = "Length")
    protected MEASUREMENT length;
    @XmlElement(name = "ThimbleInd")
    protected Boolean thimbleInd;
    @XmlElement(name = "StovePipeCd")
    protected StovePipe stovePipeCd;
    @XmlElement(name = "ThimbleInfo")
    protected List<ThimbleInfoType> thimbleInfo;
    @XmlElement(name = "ChimneyCleaning")
    protected ChimneyCleaningType chimneyCleaning;
    @XmlElement(name = "FlueInfo")
    protected List<FlueInfoType> flueInfo;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;

    /**
     * Gets the value of the chimneyCd property.
     * 
     * @return
     *     possible object is
     *     {@link Chimney }
     *     
     */
    public Chimney getChimneyCd() {
        return chimneyCd;
    }

    /**
     * Sets the value of the chimneyCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Chimney }
     *     
     */
    public void setChimneyCd(Chimney value) {
        this.chimneyCd = value;
    }

    /**
     * Gets the value of the unitLocationCd property.
     * 
     * @return
     *     possible object is
     *     {@link UnitLocation }
     *     
     */
    public UnitLocation getUnitLocationCd() {
        return unitLocationCd;
    }

    /**
     * Sets the value of the unitLocationCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitLocation }
     *     
     */
    public void setUnitLocationCd(UnitLocation value) {
        this.unitLocationCd = value;
    }

    /**
     * Gets the value of the liningCd property.
     * 
     * @return
     *     possible object is
     *     {@link Lining }
     *     
     */
    public Lining getLiningCd() {
        return liningCd;
    }

    /**
     * Sets the value of the liningCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Lining }
     *     
     */
    public void setLiningCd(Lining value) {
        this.liningCd = value;
    }

    /**
     * Gets the value of the groundUpChimneyInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getGroundUpChimneyInd() {
        return groundUpChimneyInd;
    }

    /**
     * Sets the value of the groundUpChimneyInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGroundUpChimneyInd(Boolean value) {
        this.groundUpChimneyInd = value;
    }

    /**
     * Gets the value of the installationCd property.
     * 
     * @return
     *     possible object is
     *     {@link Installation }
     *     
     */
    public Installation getInstallationCd() {
        return installationCd;
    }

    /**
     * Sets the value of the installationCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Installation }
     *     
     */
    public void setInstallationCd(Installation value) {
        this.installationCd = value;
    }

    /**
     * Gets the value of the pipeVentStyleCd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pipeVentStyleCd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPipeVentStyleCd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PipeVentStyle }
     * 
     * 
     */
    public List<PipeVentStyle> getPipeVentStyleCd() {
        if (pipeVentStyleCd == null) {
            pipeVentStyleCd = new ArrayList<PipeVentStyle>();
        }
        return this.pipeVentStyleCd;
    }

    /**
     * Gets the value of the diameter property.
     * 
     * @return
     *     possible object is
     *     {@link MEASUREMENT }
     *     
     */
    public MEASUREMENT getDiameter() {
        return diameter;
    }

    /**
     * Sets the value of the diameter property.
     * 
     * @param value
     *     allowed object is
     *     {@link MEASUREMENT }
     *     
     */
    public void setDiameter(MEASUREMENT value) {
        this.diameter = value;
    }

    /**
     * Gets the value of the length property.
     * 
     * @return
     *     possible object is
     *     {@link MEASUREMENT }
     *     
     */
    public MEASUREMENT getLength() {
        return length;
    }

    /**
     * Sets the value of the length property.
     * 
     * @param value
     *     allowed object is
     *     {@link MEASUREMENT }
     *     
     */
    public void setLength(MEASUREMENT value) {
        this.length = value;
    }

    /**
     * Gets the value of the thimbleInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getThimbleInd() {
        return thimbleInd;
    }

    /**
     * Sets the value of the thimbleInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setThimbleInd(Boolean value) {
        this.thimbleInd = value;
    }

    /**
     * Gets the value of the stovePipeCd property.
     * 
     * @return
     *     possible object is
     *     {@link StovePipe }
     *     
     */
    public StovePipe getStovePipeCd() {
        return stovePipeCd;
    }

    /**
     * Sets the value of the stovePipeCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link StovePipe }
     *     
     */
    public void setStovePipeCd(StovePipe value) {
        this.stovePipeCd = value;
    }

    /**
     * Gets the value of the thimbleInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the thimbleInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getThimbleInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ThimbleInfoType }
     * 
     * 
     */
    public List<ThimbleInfoType> getThimbleInfo() {
        if (thimbleInfo == null) {
            thimbleInfo = new ArrayList<ThimbleInfoType>();
        }
        return this.thimbleInfo;
    }

    /**
     * Gets the value of the chimneyCleaning property.
     * 
     * @return
     *     possible object is
     *     {@link ChimneyCleaningType }
     *     
     */
    public ChimneyCleaningType getChimneyCleaning() {
        return chimneyCleaning;
    }

    /**
     * Sets the value of the chimneyCleaning property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChimneyCleaningType }
     *     
     */
    public void setChimneyCleaning(ChimneyCleaningType value) {
        this.chimneyCleaning = value;
    }

    /**
     * Gets the value of the flueInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the flueInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFlueInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FlueInfoType }
     * 
     * 
     */
    public List<FlueInfoType> getFlueInfo() {
        if (flueInfo == null) {
            flueInfo = new ArrayList<FlueInfoType>();
        }
        return this.flueInfo;
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

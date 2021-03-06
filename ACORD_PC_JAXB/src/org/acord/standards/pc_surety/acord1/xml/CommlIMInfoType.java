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
 * <p>Java class for CommlIMInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommlIMInfo_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}CommlIMClassCd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}CommlCoverage" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}CreditOrSurcharge" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}RatingCalc" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}CurrentTermAmt" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}NetChangeAmt" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}WrittenAmt" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}PremiumInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}CommlIMLocation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}SubcontractorInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}CommlIMPropertyInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}ID" />
 *       &lt;attribute name="MiscPartyRefs" type="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}IDREFS" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommlIMInfo_Type", propOrder = {
    "commlIMClassCd",
    "commlCoverage",
    "creditOrSurcharge",
    "ratingCalc",
    "currentTermAmt",
    "netChangeAmt",
    "writtenAmt",
    "premiumInfo",
    "commlIMLocation",
    "subcontractorInfo",
    "commlIMPropertyInfo"
})
public class CommlIMInfoType {

    @XmlElement(name = "CommlIMClassCd")
    protected CommlIMClass commlIMClassCd;
    @XmlElement(name = "CommlCoverage")
    protected List<CommlCoverageType> commlCoverage;
    @XmlElement(name = "CreditOrSurcharge")
    protected List<PCCREDITSURCHARGE> creditOrSurcharge;
    @XmlElement(name = "RatingCalc")
    protected List<RatingCalcType> ratingCalc;
    @XmlElement(name = "CurrentTermAmt")
    protected CURRENCY currentTermAmt;
    @XmlElement(name = "NetChangeAmt")
    protected CURRENCY netChangeAmt;
    @XmlElement(name = "WrittenAmt")
    protected CURRENCY writtenAmt;
    @XmlElement(name = "PremiumInfo")
    protected List<PremiumInfoType> premiumInfo;
    @XmlElement(name = "CommlIMLocation")
    protected List<CommlIMLocationType> commlIMLocation;
    @XmlElement(name = "SubcontractorInfo")
    protected List<SubcontractorInfoType> subcontractorInfo;
    @XmlElement(name = "CommlIMPropertyInfo")
    protected List<CommlIMPropertyInfoType> commlIMPropertyInfo;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;
    @XmlAttribute(name = "MiscPartyRefs")
    @XmlIDREF
    protected List<Object> miscPartyRefs;

    /**
     * Gets the value of the commlIMClassCd property.
     * 
     * @return
     *     possible object is
     *     {@link CommlIMClass }
     *     
     */
    public CommlIMClass getCommlIMClassCd() {
        return commlIMClassCd;
    }

    /**
     * Sets the value of the commlIMClassCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommlIMClass }
     *     
     */
    public void setCommlIMClassCd(CommlIMClass value) {
        this.commlIMClassCd = value;
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
     * Gets the value of the creditOrSurcharge property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the creditOrSurcharge property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCreditOrSurcharge().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PCCREDITSURCHARGE }
     * 
     * 
     */
    public List<PCCREDITSURCHARGE> getCreditOrSurcharge() {
        if (creditOrSurcharge == null) {
            creditOrSurcharge = new ArrayList<PCCREDITSURCHARGE>();
        }
        return this.creditOrSurcharge;
    }

    /**
     * Gets the value of the ratingCalc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ratingCalc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRatingCalc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RatingCalcType }
     * 
     * 
     */
    public List<RatingCalcType> getRatingCalc() {
        if (ratingCalc == null) {
            ratingCalc = new ArrayList<RatingCalcType>();
        }
        return this.ratingCalc;
    }

    /**
     * Gets the value of the currentTermAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CURRENCY }
     *     
     */
    public CURRENCY getCurrentTermAmt() {
        return currentTermAmt;
    }

    /**
     * Sets the value of the currentTermAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CURRENCY }
     *     
     */
    public void setCurrentTermAmt(CURRENCY value) {
        this.currentTermAmt = value;
    }

    /**
     * Gets the value of the netChangeAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CURRENCY }
     *     
     */
    public CURRENCY getNetChangeAmt() {
        return netChangeAmt;
    }

    /**
     * Sets the value of the netChangeAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CURRENCY }
     *     
     */
    public void setNetChangeAmt(CURRENCY value) {
        this.netChangeAmt = value;
    }

    /**
     * Gets the value of the writtenAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CURRENCY }
     *     
     */
    public CURRENCY getWrittenAmt() {
        return writtenAmt;
    }

    /**
     * Sets the value of the writtenAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CURRENCY }
     *     
     */
    public void setWrittenAmt(CURRENCY value) {
        this.writtenAmt = value;
    }

    /**
     * Gets the value of the premiumInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the premiumInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPremiumInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PremiumInfoType }
     * 
     * 
     */
    public List<PremiumInfoType> getPremiumInfo() {
        if (premiumInfo == null) {
            premiumInfo = new ArrayList<PremiumInfoType>();
        }
        return this.premiumInfo;
    }

    /**
     * Gets the value of the commlIMLocation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the commlIMLocation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCommlIMLocation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommlIMLocationType }
     * 
     * 
     */
    public List<CommlIMLocationType> getCommlIMLocation() {
        if (commlIMLocation == null) {
            commlIMLocation = new ArrayList<CommlIMLocationType>();
        }
        return this.commlIMLocation;
    }

    /**
     * Gets the value of the subcontractorInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subcontractorInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubcontractorInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SubcontractorInfoType }
     * 
     * 
     */
    public List<SubcontractorInfoType> getSubcontractorInfo() {
        if (subcontractorInfo == null) {
            subcontractorInfo = new ArrayList<SubcontractorInfoType>();
        }
        return this.subcontractorInfo;
    }

    /**
     * Gets the value of the commlIMPropertyInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the commlIMPropertyInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCommlIMPropertyInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommlIMPropertyInfoType }
     * 
     * 
     */
    public List<CommlIMPropertyInfoType> getCommlIMPropertyInfo() {
        if (commlIMPropertyInfo == null) {
            commlIMPropertyInfo = new ArrayList<CommlIMPropertyInfoType>();
        }
        return this.commlIMPropertyInfo;
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
     * Gets the value of the miscPartyRefs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the miscPartyRefs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMiscPartyRefs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getMiscPartyRefs() {
        if (miscPartyRefs == null) {
            miscPartyRefs = new ArrayList<Object>();
        }
        return this.miscPartyRefs;
    }

}

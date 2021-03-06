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
 * <p>Java class for TieDownHangaring_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TieDownHangaring_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}TieDownProvider" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}TieDownDesc" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}NumTieDowns" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}MaxValueAmt" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}MaxValueAllAircraftAmt" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}StorageHangarDesc" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}ConstructionCd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}BldgArea" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}QuestionAnswer" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}ID" />
 *       &lt;attribute name="LocationRef" type="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}IDREF" />
 *       &lt;attribute name="SubLocationRef" type="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}IDREF" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TieDownHangaring_Type", propOrder = {
    "tieDownProvider",
    "tieDownDesc",
    "numTieDowns",
    "maxValueAmt",
    "maxValueAllAircraftAmt",
    "storageHangarDesc",
    "constructionCd",
    "bldgArea",
    "questionAnswer"
})
public class TieDownHangaringType {

    @XmlElement(name = "TieDownProvider")
    protected C255 tieDownProvider;
    @XmlElement(name = "TieDownDesc")
    protected C255 tieDownDesc;
    @XmlElement(name = "NumTieDowns")
    protected Long numTieDowns;
    @XmlElement(name = "MaxValueAmt")
    protected CURRENCY maxValueAmt;
    @XmlElement(name = "MaxValueAllAircraftAmt")
    protected CURRENCY maxValueAllAircraftAmt;
    @XmlElement(name = "StorageHangarDesc")
    protected C255 storageHangarDesc;
    @XmlElement(name = "ConstructionCd")
    protected ConstructionType constructionCd;
    @XmlElement(name = "BldgArea")
    protected MEASUREMENT bldgArea;
    @XmlElement(name = "QuestionAnswer")
    protected List<QuestionAnswerType> questionAnswer;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;
    @XmlAttribute(name = "LocationRef")
    @XmlIDREF
    protected Object locationRef;
    @XmlAttribute(name = "SubLocationRef")
    @XmlIDREF
    protected Object subLocationRef;

    /**
     * Gets the value of the tieDownProvider property.
     * 
     * @return
     *     possible object is
     *     {@link C255 }
     *     
     */
    public C255 getTieDownProvider() {
        return tieDownProvider;
    }

    /**
     * Sets the value of the tieDownProvider property.
     * 
     * @param value
     *     allowed object is
     *     {@link C255 }
     *     
     */
    public void setTieDownProvider(C255 value) {
        this.tieDownProvider = value;
    }

    /**
     * Gets the value of the tieDownDesc property.
     * 
     * @return
     *     possible object is
     *     {@link C255 }
     *     
     */
    public C255 getTieDownDesc() {
        return tieDownDesc;
    }

    /**
     * Sets the value of the tieDownDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link C255 }
     *     
     */
    public void setTieDownDesc(C255 value) {
        this.tieDownDesc = value;
    }

    /**
     * Gets the value of the numTieDowns property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumTieDowns() {
        return numTieDowns;
    }

    /**
     * Sets the value of the numTieDowns property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumTieDowns(Long value) {
        this.numTieDowns = value;
    }

    /**
     * Gets the value of the maxValueAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CURRENCY }
     *     
     */
    public CURRENCY getMaxValueAmt() {
        return maxValueAmt;
    }

    /**
     * Sets the value of the maxValueAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CURRENCY }
     *     
     */
    public void setMaxValueAmt(CURRENCY value) {
        this.maxValueAmt = value;
    }

    /**
     * Gets the value of the maxValueAllAircraftAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CURRENCY }
     *     
     */
    public CURRENCY getMaxValueAllAircraftAmt() {
        return maxValueAllAircraftAmt;
    }

    /**
     * Sets the value of the maxValueAllAircraftAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CURRENCY }
     *     
     */
    public void setMaxValueAllAircraftAmt(CURRENCY value) {
        this.maxValueAllAircraftAmt = value;
    }

    /**
     * Gets the value of the storageHangarDesc property.
     * 
     * @return
     *     possible object is
     *     {@link C255 }
     *     
     */
    public C255 getStorageHangarDesc() {
        return storageHangarDesc;
    }

    /**
     * Sets the value of the storageHangarDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link C255 }
     *     
     */
    public void setStorageHangarDesc(C255 value) {
        this.storageHangarDesc = value;
    }

    /**
     * Gets the value of the constructionCd property.
     * 
     * @return
     *     possible object is
     *     {@link ConstructionType }
     *     
     */
    public ConstructionType getConstructionCd() {
        return constructionCd;
    }

    /**
     * Sets the value of the constructionCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConstructionType }
     *     
     */
    public void setConstructionCd(ConstructionType value) {
        this.constructionCd = value;
    }

    /**
     * Gets the value of the bldgArea property.
     * 
     * @return
     *     possible object is
     *     {@link MEASUREMENT }
     *     
     */
    public MEASUREMENT getBldgArea() {
        return bldgArea;
    }

    /**
     * Sets the value of the bldgArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link MEASUREMENT }
     *     
     */
    public void setBldgArea(MEASUREMENT value) {
        this.bldgArea = value;
    }

    /**
     * Gets the value of the questionAnswer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the questionAnswer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQuestionAnswer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QuestionAnswerType }
     * 
     * 
     */
    public List<QuestionAnswerType> getQuestionAnswer() {
        if (questionAnswer == null) {
            questionAnswer = new ArrayList<QuestionAnswerType>();
        }
        return this.questionAnswer;
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
     * Gets the value of the locationRef property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getLocationRef() {
        return locationRef;
    }

    /**
     * Sets the value of the locationRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setLocationRef(Object value) {
        this.locationRef = value;
    }

    /**
     * Gets the value of the subLocationRef property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getSubLocationRef() {
        return subLocationRef;
    }

    /**
     * Sets the value of the subLocationRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setSubLocationRef(Object value) {
        this.subLocationRef = value;
    }

}

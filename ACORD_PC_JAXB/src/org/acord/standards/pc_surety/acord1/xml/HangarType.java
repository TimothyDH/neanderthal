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
 * <p>Java class for Hangar_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Hangar_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}NumHangarsInsured" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}NumAircraft" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}MaxValueAllAircraftAmt" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}NumSpacesLeased" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}LeasedAccessDesc" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}InsurerName" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}HangarDesc" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}StorageItemsDesc" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}OperationsDesc" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}HangarAgreementDesc" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}AircraftOwnedServiced" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}CommlCoverage" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "Hangar_Type", propOrder = {
    "numHangarsInsured",
    "numAircraft",
    "maxValueAllAircraftAmt",
    "numSpacesLeased",
    "leasedAccessDesc",
    "insurerName",
    "hangarDesc",
    "storageItemsDesc",
    "operationsDesc",
    "hangarAgreementDesc",
    "aircraftOwnedServiced",
    "commlCoverage",
    "questionAnswer"
})
public class HangarType {

    @XmlElement(name = "NumHangarsInsured")
    protected Long numHangarsInsured;
    @XmlElement(name = "NumAircraft")
    protected Long numAircraft;
    @XmlElement(name = "MaxValueAllAircraftAmt")
    protected CURRENCY maxValueAllAircraftAmt;
    @XmlElement(name = "NumSpacesLeased")
    protected Long numSpacesLeased;
    @XmlElement(name = "LeasedAccessDesc")
    protected C255 leasedAccessDesc;
    @XmlElement(name = "InsurerName")
    protected C255 insurerName;
    @XmlElement(name = "HangarDesc")
    protected C255 hangarDesc;
    @XmlElement(name = "StorageItemsDesc")
    protected C255 storageItemsDesc;
    @XmlElement(name = "OperationsDesc")
    protected C255 operationsDesc;
    @XmlElement(name = "HangarAgreementDesc")
    protected C255 hangarAgreementDesc;
    @XmlElement(name = "AircraftOwnedServiced")
    protected List<AircraftOwnedServicedType> aircraftOwnedServiced;
    @XmlElement(name = "CommlCoverage")
    protected List<CommlCoverageType> commlCoverage;
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
     * Gets the value of the numHangarsInsured property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumHangarsInsured() {
        return numHangarsInsured;
    }

    /**
     * Sets the value of the numHangarsInsured property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumHangarsInsured(Long value) {
        this.numHangarsInsured = value;
    }

    /**
     * Gets the value of the numAircraft property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumAircraft() {
        return numAircraft;
    }

    /**
     * Sets the value of the numAircraft property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumAircraft(Long value) {
        this.numAircraft = value;
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
     * Gets the value of the numSpacesLeased property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumSpacesLeased() {
        return numSpacesLeased;
    }

    /**
     * Sets the value of the numSpacesLeased property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumSpacesLeased(Long value) {
        this.numSpacesLeased = value;
    }

    /**
     * Gets the value of the leasedAccessDesc property.
     * 
     * @return
     *     possible object is
     *     {@link C255 }
     *     
     */
    public C255 getLeasedAccessDesc() {
        return leasedAccessDesc;
    }

    /**
     * Sets the value of the leasedAccessDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link C255 }
     *     
     */
    public void setLeasedAccessDesc(C255 value) {
        this.leasedAccessDesc = value;
    }

    /**
     * Gets the value of the insurerName property.
     * 
     * @return
     *     possible object is
     *     {@link C255 }
     *     
     */
    public C255 getInsurerName() {
        return insurerName;
    }

    /**
     * Sets the value of the insurerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link C255 }
     *     
     */
    public void setInsurerName(C255 value) {
        this.insurerName = value;
    }

    /**
     * Gets the value of the hangarDesc property.
     * 
     * @return
     *     possible object is
     *     {@link C255 }
     *     
     */
    public C255 getHangarDesc() {
        return hangarDesc;
    }

    /**
     * Sets the value of the hangarDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link C255 }
     *     
     */
    public void setHangarDesc(C255 value) {
        this.hangarDesc = value;
    }

    /**
     * Gets the value of the storageItemsDesc property.
     * 
     * @return
     *     possible object is
     *     {@link C255 }
     *     
     */
    public C255 getStorageItemsDesc() {
        return storageItemsDesc;
    }

    /**
     * Sets the value of the storageItemsDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link C255 }
     *     
     */
    public void setStorageItemsDesc(C255 value) {
        this.storageItemsDesc = value;
    }

    /**
     * Gets the value of the operationsDesc property.
     * 
     * @return
     *     possible object is
     *     {@link C255 }
     *     
     */
    public C255 getOperationsDesc() {
        return operationsDesc;
    }

    /**
     * Sets the value of the operationsDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link C255 }
     *     
     */
    public void setOperationsDesc(C255 value) {
        this.operationsDesc = value;
    }

    /**
     * Gets the value of the hangarAgreementDesc property.
     * 
     * @return
     *     possible object is
     *     {@link C255 }
     *     
     */
    public C255 getHangarAgreementDesc() {
        return hangarAgreementDesc;
    }

    /**
     * Sets the value of the hangarAgreementDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link C255 }
     *     
     */
    public void setHangarAgreementDesc(C255 value) {
        this.hangarAgreementDesc = value;
    }

    /**
     * Gets the value of the aircraftOwnedServiced property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the aircraftOwnedServiced property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAircraftOwnedServiced().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AircraftOwnedServicedType }
     * 
     * 
     */
    public List<AircraftOwnedServicedType> getAircraftOwnedServiced() {
        if (aircraftOwnedServiced == null) {
            aircraftOwnedServiced = new ArrayList<AircraftOwnedServicedType>();
        }
        return this.aircraftOwnedServiced;
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

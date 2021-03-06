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
 * <p>Java class for WorkCompScheduleState_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WorkCompScheduleState_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}StateProvCd"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}AnniversaryRatingDt" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}CreditOrSurcharge" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}RatingBureauId" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}WorkCompScheduleRateClass" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}ParticipatingPlanInd" minOccurs="0"/>
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
@XmlType(name = "WorkCompScheduleState_Type", propOrder = {
    "stateProvCd",
    "anniversaryRatingDt",
    "creditOrSurcharge",
    "ratingBureauId",
    "workCompScheduleRateClass",
    "participatingPlanInd"
})
public class WorkCompScheduleStateType {

    @XmlElement(name = "StateProvCd", required = true)
    protected OpenEnum stateProvCd;
    @XmlElement(name = "AnniversaryRatingDt")
    protected Date anniversaryRatingDt;
    @XmlElement(name = "CreditOrSurcharge")
    protected List<PCCREDITSURCHARGE> creditOrSurcharge;
    @XmlElement(name = "RatingBureauId")
    protected AssignedIdentifier ratingBureauId;
    @XmlElement(name = "WorkCompScheduleRateClass")
    protected List<WorkCompScheduleRateClassType> workCompScheduleRateClass;
    @XmlElement(name = "ParticipatingPlanInd")
    protected Boolean participatingPlanInd;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;

    /**
     * Gets the value of the stateProvCd property.
     * 
     * @return
     *     possible object is
     *     {@link OpenEnum }
     *     
     */
    public OpenEnum getStateProvCd() {
        return stateProvCd;
    }

    /**
     * Sets the value of the stateProvCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpenEnum }
     *     
     */
    public void setStateProvCd(OpenEnum value) {
        this.stateProvCd = value;
    }

    /**
     * Gets the value of the anniversaryRatingDt property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getAnniversaryRatingDt() {
        return anniversaryRatingDt;
    }

    /**
     * Sets the value of the anniversaryRatingDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setAnniversaryRatingDt(Date value) {
        this.anniversaryRatingDt = value;
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
     * Gets the value of the ratingBureauId property.
     * 
     * @return
     *     possible object is
     *     {@link AssignedIdentifier }
     *     
     */
    public AssignedIdentifier getRatingBureauId() {
        return ratingBureauId;
    }

    /**
     * Sets the value of the ratingBureauId property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssignedIdentifier }
     *     
     */
    public void setRatingBureauId(AssignedIdentifier value) {
        this.ratingBureauId = value;
    }

    /**
     * Gets the value of the workCompScheduleRateClass property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the workCompScheduleRateClass property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWorkCompScheduleRateClass().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WorkCompScheduleRateClassType }
     * 
     * 
     */
    public List<WorkCompScheduleRateClassType> getWorkCompScheduleRateClass() {
        if (workCompScheduleRateClass == null) {
            workCompScheduleRateClass = new ArrayList<WorkCompScheduleRateClassType>();
        }
        return this.workCompScheduleRateClass;
    }

    /**
     * Gets the value of the participatingPlanInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getParticipatingPlanInd() {
        return participatingPlanInd;
    }

    /**
     * Sets the value of the participatingPlanInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setParticipatingPlanInd(Boolean value) {
        this.participatingPlanInd = value;
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

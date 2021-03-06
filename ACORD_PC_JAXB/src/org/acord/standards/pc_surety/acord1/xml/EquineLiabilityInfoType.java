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
 * <p>Java class for EquineLiabilityInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EquineLiabilityInfo_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}NumTotalStalls" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}MonthlyBoardingRateAmt" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}NumEventsAnnually" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}WorkCompInd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}PastureFencingInd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}TotallyFencedInd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}FencingDesc" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}FenceMaintenanceDesc" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}FenceConditionDesc" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}RidingFacilitiesInd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}IndoorRidingFacilitiesInd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}OutdoorRidingFacilitiesInd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}OpenFieldRidingFacilitiesInd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}TrailRidingFacilitiesInd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}RidingInstructionInd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}NumRidingStudents" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}RidingInstructionReceiptsAmt" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}NumRidingInstructionHorses" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}NumSoldHorses" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}BreedsSoldDesc" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}NumPublicEvents" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}EventsOnPremisesInd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}EventsOffPremisesInd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}NumEventParticipants" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}NumEventSpectators" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}EventEntrantReleasesInd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}TackSalesInd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}TackSalesReceiptsAmt" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}ItemsSoldDesc" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}OtherOperationsDesc" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}NumOnPremiseIndependentTrainers" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}ID" />
 *       &lt;attribute name="OtherOrPriorPolicyRef" type="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}IDREF" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EquineLiabilityInfo_Type", propOrder = {
    "numTotalStalls",
    "monthlyBoardingRateAmt",
    "numEventsAnnually",
    "workCompInd",
    "pastureFencingInd",
    "totallyFencedInd",
    "fencingDesc",
    "fenceMaintenanceDesc",
    "fenceConditionDesc",
    "ridingFacilitiesInd",
    "indoorRidingFacilitiesInd",
    "outdoorRidingFacilitiesInd",
    "openFieldRidingFacilitiesInd",
    "trailRidingFacilitiesInd",
    "ridingInstructionInd",
    "numRidingStudents",
    "ridingInstructionReceiptsAmt",
    "numRidingInstructionHorses",
    "numSoldHorses",
    "breedsSoldDesc",
    "numPublicEvents",
    "eventsOnPremisesInd",
    "eventsOffPremisesInd",
    "numEventParticipants",
    "numEventSpectators",
    "eventEntrantReleasesInd",
    "tackSalesInd",
    "tackSalesReceiptsAmt",
    "itemsSoldDesc",
    "otherOperationsDesc",
    "numOnPremiseIndependentTrainers"
})
public class EquineLiabilityInfoType {

    @XmlElement(name = "NumTotalStalls")
    protected Long numTotalStalls;
    @XmlElement(name = "MonthlyBoardingRateAmt")
    protected CURRENCY monthlyBoardingRateAmt;
    @XmlElement(name = "NumEventsAnnually")
    protected Long numEventsAnnually;
    @XmlElement(name = "WorkCompInd")
    protected Boolean workCompInd;
    @XmlElement(name = "PastureFencingInd")
    protected Boolean pastureFencingInd;
    @XmlElement(name = "TotallyFencedInd")
    protected Boolean totallyFencedInd;
    @XmlElement(name = "FencingDesc")
    protected C255 fencingDesc;
    @XmlElement(name = "FenceMaintenanceDesc")
    protected C255 fenceMaintenanceDesc;
    @XmlElement(name = "FenceConditionDesc")
    protected C255 fenceConditionDesc;
    @XmlElement(name = "RidingFacilitiesInd")
    protected Boolean ridingFacilitiesInd;
    @XmlElement(name = "IndoorRidingFacilitiesInd")
    protected Boolean indoorRidingFacilitiesInd;
    @XmlElement(name = "OutdoorRidingFacilitiesInd")
    protected Boolean outdoorRidingFacilitiesInd;
    @XmlElement(name = "OpenFieldRidingFacilitiesInd")
    protected Boolean openFieldRidingFacilitiesInd;
    @XmlElement(name = "TrailRidingFacilitiesInd")
    protected Boolean trailRidingFacilitiesInd;
    @XmlElement(name = "RidingInstructionInd")
    protected Boolean ridingInstructionInd;
    @XmlElement(name = "NumRidingStudents")
    protected Long numRidingStudents;
    @XmlElement(name = "RidingInstructionReceiptsAmt")
    protected CURRENCY ridingInstructionReceiptsAmt;
    @XmlElement(name = "NumRidingInstructionHorses")
    protected Long numRidingInstructionHorses;
    @XmlElement(name = "NumSoldHorses")
    protected Long numSoldHorses;
    @XmlElement(name = "BreedsSoldDesc")
    protected C255 breedsSoldDesc;
    @XmlElement(name = "NumPublicEvents")
    protected Long numPublicEvents;
    @XmlElement(name = "EventsOnPremisesInd")
    protected Boolean eventsOnPremisesInd;
    @XmlElement(name = "EventsOffPremisesInd")
    protected Boolean eventsOffPremisesInd;
    @XmlElement(name = "NumEventParticipants")
    protected Long numEventParticipants;
    @XmlElement(name = "NumEventSpectators")
    protected Long numEventSpectators;
    @XmlElement(name = "EventEntrantReleasesInd")
    protected Boolean eventEntrantReleasesInd;
    @XmlElement(name = "TackSalesInd")
    protected Boolean tackSalesInd;
    @XmlElement(name = "TackSalesReceiptsAmt")
    protected CURRENCY tackSalesReceiptsAmt;
    @XmlElement(name = "ItemsSoldDesc")
    protected C255 itemsSoldDesc;
    @XmlElement(name = "OtherOperationsDesc")
    protected C255 otherOperationsDesc;
    @XmlElement(name = "NumOnPremiseIndependentTrainers")
    protected Long numOnPremiseIndependentTrainers;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;
    @XmlAttribute(name = "OtherOrPriorPolicyRef")
    @XmlIDREF
    protected Object otherOrPriorPolicyRef;

    /**
     * Gets the value of the numTotalStalls property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumTotalStalls() {
        return numTotalStalls;
    }

    /**
     * Sets the value of the numTotalStalls property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumTotalStalls(Long value) {
        this.numTotalStalls = value;
    }

    /**
     * Gets the value of the monthlyBoardingRateAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CURRENCY }
     *     
     */
    public CURRENCY getMonthlyBoardingRateAmt() {
        return monthlyBoardingRateAmt;
    }

    /**
     * Sets the value of the monthlyBoardingRateAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CURRENCY }
     *     
     */
    public void setMonthlyBoardingRateAmt(CURRENCY value) {
        this.monthlyBoardingRateAmt = value;
    }

    /**
     * Gets the value of the numEventsAnnually property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumEventsAnnually() {
        return numEventsAnnually;
    }

    /**
     * Sets the value of the numEventsAnnually property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumEventsAnnually(Long value) {
        this.numEventsAnnually = value;
    }

    /**
     * Gets the value of the workCompInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getWorkCompInd() {
        return workCompInd;
    }

    /**
     * Sets the value of the workCompInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWorkCompInd(Boolean value) {
        this.workCompInd = value;
    }

    /**
     * Gets the value of the pastureFencingInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getPastureFencingInd() {
        return pastureFencingInd;
    }

    /**
     * Sets the value of the pastureFencingInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPastureFencingInd(Boolean value) {
        this.pastureFencingInd = value;
    }

    /**
     * Gets the value of the totallyFencedInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getTotallyFencedInd() {
        return totallyFencedInd;
    }

    /**
     * Sets the value of the totallyFencedInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTotallyFencedInd(Boolean value) {
        this.totallyFencedInd = value;
    }

    /**
     * Gets the value of the fencingDesc property.
     * 
     * @return
     *     possible object is
     *     {@link C255 }
     *     
     */
    public C255 getFencingDesc() {
        return fencingDesc;
    }

    /**
     * Sets the value of the fencingDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link C255 }
     *     
     */
    public void setFencingDesc(C255 value) {
        this.fencingDesc = value;
    }

    /**
     * Gets the value of the fenceMaintenanceDesc property.
     * 
     * @return
     *     possible object is
     *     {@link C255 }
     *     
     */
    public C255 getFenceMaintenanceDesc() {
        return fenceMaintenanceDesc;
    }

    /**
     * Sets the value of the fenceMaintenanceDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link C255 }
     *     
     */
    public void setFenceMaintenanceDesc(C255 value) {
        this.fenceMaintenanceDesc = value;
    }

    /**
     * Gets the value of the fenceConditionDesc property.
     * 
     * @return
     *     possible object is
     *     {@link C255 }
     *     
     */
    public C255 getFenceConditionDesc() {
        return fenceConditionDesc;
    }

    /**
     * Sets the value of the fenceConditionDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link C255 }
     *     
     */
    public void setFenceConditionDesc(C255 value) {
        this.fenceConditionDesc = value;
    }

    /**
     * Gets the value of the ridingFacilitiesInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getRidingFacilitiesInd() {
        return ridingFacilitiesInd;
    }

    /**
     * Sets the value of the ridingFacilitiesInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRidingFacilitiesInd(Boolean value) {
        this.ridingFacilitiesInd = value;
    }

    /**
     * Gets the value of the indoorRidingFacilitiesInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getIndoorRidingFacilitiesInd() {
        return indoorRidingFacilitiesInd;
    }

    /**
     * Sets the value of the indoorRidingFacilitiesInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIndoorRidingFacilitiesInd(Boolean value) {
        this.indoorRidingFacilitiesInd = value;
    }

    /**
     * Gets the value of the outdoorRidingFacilitiesInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getOutdoorRidingFacilitiesInd() {
        return outdoorRidingFacilitiesInd;
    }

    /**
     * Sets the value of the outdoorRidingFacilitiesInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOutdoorRidingFacilitiesInd(Boolean value) {
        this.outdoorRidingFacilitiesInd = value;
    }

    /**
     * Gets the value of the openFieldRidingFacilitiesInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getOpenFieldRidingFacilitiesInd() {
        return openFieldRidingFacilitiesInd;
    }

    /**
     * Sets the value of the openFieldRidingFacilitiesInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOpenFieldRidingFacilitiesInd(Boolean value) {
        this.openFieldRidingFacilitiesInd = value;
    }

    /**
     * Gets the value of the trailRidingFacilitiesInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getTrailRidingFacilitiesInd() {
        return trailRidingFacilitiesInd;
    }

    /**
     * Sets the value of the trailRidingFacilitiesInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTrailRidingFacilitiesInd(Boolean value) {
        this.trailRidingFacilitiesInd = value;
    }

    /**
     * Gets the value of the ridingInstructionInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getRidingInstructionInd() {
        return ridingInstructionInd;
    }

    /**
     * Sets the value of the ridingInstructionInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRidingInstructionInd(Boolean value) {
        this.ridingInstructionInd = value;
    }

    /**
     * Gets the value of the numRidingStudents property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumRidingStudents() {
        return numRidingStudents;
    }

    /**
     * Sets the value of the numRidingStudents property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumRidingStudents(Long value) {
        this.numRidingStudents = value;
    }

    /**
     * Gets the value of the ridingInstructionReceiptsAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CURRENCY }
     *     
     */
    public CURRENCY getRidingInstructionReceiptsAmt() {
        return ridingInstructionReceiptsAmt;
    }

    /**
     * Sets the value of the ridingInstructionReceiptsAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CURRENCY }
     *     
     */
    public void setRidingInstructionReceiptsAmt(CURRENCY value) {
        this.ridingInstructionReceiptsAmt = value;
    }

    /**
     * Gets the value of the numRidingInstructionHorses property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumRidingInstructionHorses() {
        return numRidingInstructionHorses;
    }

    /**
     * Sets the value of the numRidingInstructionHorses property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumRidingInstructionHorses(Long value) {
        this.numRidingInstructionHorses = value;
    }

    /**
     * Gets the value of the numSoldHorses property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumSoldHorses() {
        return numSoldHorses;
    }

    /**
     * Sets the value of the numSoldHorses property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumSoldHorses(Long value) {
        this.numSoldHorses = value;
    }

    /**
     * Gets the value of the breedsSoldDesc property.
     * 
     * @return
     *     possible object is
     *     {@link C255 }
     *     
     */
    public C255 getBreedsSoldDesc() {
        return breedsSoldDesc;
    }

    /**
     * Sets the value of the breedsSoldDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link C255 }
     *     
     */
    public void setBreedsSoldDesc(C255 value) {
        this.breedsSoldDesc = value;
    }

    /**
     * Gets the value of the numPublicEvents property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumPublicEvents() {
        return numPublicEvents;
    }

    /**
     * Sets the value of the numPublicEvents property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumPublicEvents(Long value) {
        this.numPublicEvents = value;
    }

    /**
     * Gets the value of the eventsOnPremisesInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getEventsOnPremisesInd() {
        return eventsOnPremisesInd;
    }

    /**
     * Sets the value of the eventsOnPremisesInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEventsOnPremisesInd(Boolean value) {
        this.eventsOnPremisesInd = value;
    }

    /**
     * Gets the value of the eventsOffPremisesInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getEventsOffPremisesInd() {
        return eventsOffPremisesInd;
    }

    /**
     * Sets the value of the eventsOffPremisesInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEventsOffPremisesInd(Boolean value) {
        this.eventsOffPremisesInd = value;
    }

    /**
     * Gets the value of the numEventParticipants property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumEventParticipants() {
        return numEventParticipants;
    }

    /**
     * Sets the value of the numEventParticipants property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumEventParticipants(Long value) {
        this.numEventParticipants = value;
    }

    /**
     * Gets the value of the numEventSpectators property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumEventSpectators() {
        return numEventSpectators;
    }

    /**
     * Sets the value of the numEventSpectators property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumEventSpectators(Long value) {
        this.numEventSpectators = value;
    }

    /**
     * Gets the value of the eventEntrantReleasesInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getEventEntrantReleasesInd() {
        return eventEntrantReleasesInd;
    }

    /**
     * Sets the value of the eventEntrantReleasesInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEventEntrantReleasesInd(Boolean value) {
        this.eventEntrantReleasesInd = value;
    }

    /**
     * Gets the value of the tackSalesInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getTackSalesInd() {
        return tackSalesInd;
    }

    /**
     * Sets the value of the tackSalesInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTackSalesInd(Boolean value) {
        this.tackSalesInd = value;
    }

    /**
     * Gets the value of the tackSalesReceiptsAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CURRENCY }
     *     
     */
    public CURRENCY getTackSalesReceiptsAmt() {
        return tackSalesReceiptsAmt;
    }

    /**
     * Sets the value of the tackSalesReceiptsAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CURRENCY }
     *     
     */
    public void setTackSalesReceiptsAmt(CURRENCY value) {
        this.tackSalesReceiptsAmt = value;
    }

    /**
     * Gets the value of the itemsSoldDesc property.
     * 
     * @return
     *     possible object is
     *     {@link C255 }
     *     
     */
    public C255 getItemsSoldDesc() {
        return itemsSoldDesc;
    }

    /**
     * Sets the value of the itemsSoldDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link C255 }
     *     
     */
    public void setItemsSoldDesc(C255 value) {
        this.itemsSoldDesc = value;
    }

    /**
     * Gets the value of the otherOperationsDesc property.
     * 
     * @return
     *     possible object is
     *     {@link C255 }
     *     
     */
    public C255 getOtherOperationsDesc() {
        return otherOperationsDesc;
    }

    /**
     * Sets the value of the otherOperationsDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link C255 }
     *     
     */
    public void setOtherOperationsDesc(C255 value) {
        this.otherOperationsDesc = value;
    }

    /**
     * Gets the value of the numOnPremiseIndependentTrainers property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumOnPremiseIndependentTrainers() {
        return numOnPremiseIndependentTrainers;
    }

    /**
     * Sets the value of the numOnPremiseIndependentTrainers property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumOnPremiseIndependentTrainers(Long value) {
        this.numOnPremiseIndependentTrainers = value;
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
     * Gets the value of the otherOrPriorPolicyRef property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getOtherOrPriorPolicyRef() {
        return otherOrPriorPolicyRef;
    }

    /**
     * Sets the value of the otherOrPriorPolicyRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setOtherOrPriorPolicyRef(Object value) {
        this.otherOrPriorPolicyRef = value;
    }

}

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
 * <p>Java class for PersonInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PersonInfo_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}GenderCd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}BirthDt" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}DeathDt" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}MaritalStatusCd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}OccupationDesc" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}OccupationClassCd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}TitleRelationshipCd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}LengthTimeEmployed" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}LengthTimeCurrentOccupation" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}LengthTimeWithPreviousEmployer" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}LengthTimeCurrentAddr" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}EmployerCd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}EmployerDesc" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}MiscParty" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}MembershipInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}DoNotSolicitInd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}CitizenshipCountryCd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}NumDependents" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}EducationLevelCd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}MilitaryServiceInfo" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}CoInsuredSameAddressInsuredInd" minOccurs="0"/>
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
@XmlType(name = "PersonInfo_Type", propOrder = {
    "genderCd",
    "birthDt",
    "deathDt",
    "maritalStatusCd",
    "occupationDesc",
    "occupationClassCd",
    "titleRelationshipCd",
    "lengthTimeEmployed",
    "lengthTimeCurrentOccupation",
    "lengthTimeWithPreviousEmployer",
    "lengthTimeCurrentAddr",
    "employerCd",
    "employerDesc",
    "miscParty",
    "membershipInfo",
    "doNotSolicitInd",
    "citizenshipCountryCd",
    "numDependents",
    "educationLevelCd",
    "militaryServiceInfo",
    "coInsuredSameAddressInsuredInd"
})
public class PersonInfoType {

    @XmlElement(name = "GenderCd")
    protected Gender genderCd;
    @XmlElement(name = "BirthDt")
    protected Date birthDt;
    @XmlElement(name = "DeathDt")
    protected Date deathDt;
    @XmlElement(name = "MaritalStatusCd")
    protected MaritalStatus maritalStatusCd;
    @XmlElement(name = "OccupationDesc")
    protected C255 occupationDesc;
    @XmlElement(name = "OccupationClassCd")
    protected OccupationClass occupationClassCd;
    @XmlElement(name = "TitleRelationshipCd")
    protected TitleRelationship titleRelationshipCd;
    @XmlElement(name = "LengthTimeEmployed")
    protected MEASUREMENT lengthTimeEmployed;
    @XmlElement(name = "LengthTimeCurrentOccupation")
    protected MEASUREMENT lengthTimeCurrentOccupation;
    @XmlElement(name = "LengthTimeWithPreviousEmployer")
    protected MEASUREMENT lengthTimeWithPreviousEmployer;
    @XmlElement(name = "LengthTimeCurrentAddr")
    protected DURATION lengthTimeCurrentAddr;
    @XmlElement(name = "EmployerCd")
    protected Employer employerCd;
    @XmlElement(name = "EmployerDesc")
    protected C255 employerDesc;
    @XmlElement(name = "MiscParty")
    protected List<MiscPartyType> miscParty;
    @XmlElement(name = "MembershipInfo")
    protected List<MembershipInfoType> membershipInfo;
    @XmlElement(name = "DoNotSolicitInd")
    protected Boolean doNotSolicitInd;
    @XmlElement(name = "CitizenshipCountryCd")
    protected OpenEnum citizenshipCountryCd;
    @XmlElement(name = "NumDependents")
    protected Long numDependents;
    @XmlElement(name = "EducationLevelCd")
    protected EducationLevel educationLevelCd;
    @XmlElement(name = "MilitaryServiceInfo")
    protected MilitaryServiceInfoType militaryServiceInfo;
    @XmlElement(name = "CoInsuredSameAddressInsuredInd")
    protected Boolean coInsuredSameAddressInsuredInd;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;

    /**
     * Gets the value of the genderCd property.
     * 
     * @return
     *     possible object is
     *     {@link Gender }
     *     
     */
    public Gender getGenderCd() {
        return genderCd;
    }

    /**
     * Sets the value of the genderCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Gender }
     *     
     */
    public void setGenderCd(Gender value) {
        this.genderCd = value;
    }

    /**
     * Gets the value of the birthDt property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getBirthDt() {
        return birthDt;
    }

    /**
     * Sets the value of the birthDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setBirthDt(Date value) {
        this.birthDt = value;
    }

    /**
     * Gets the value of the deathDt property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getDeathDt() {
        return deathDt;
    }

    /**
     * Sets the value of the deathDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setDeathDt(Date value) {
        this.deathDt = value;
    }

    /**
     * Gets the value of the maritalStatusCd property.
     * 
     * @return
     *     possible object is
     *     {@link MaritalStatus }
     *     
     */
    public MaritalStatus getMaritalStatusCd() {
        return maritalStatusCd;
    }

    /**
     * Sets the value of the maritalStatusCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaritalStatus }
     *     
     */
    public void setMaritalStatusCd(MaritalStatus value) {
        this.maritalStatusCd = value;
    }

    /**
     * Gets the value of the occupationDesc property.
     * 
     * @return
     *     possible object is
     *     {@link C255 }
     *     
     */
    public C255 getOccupationDesc() {
        return occupationDesc;
    }

    /**
     * Sets the value of the occupationDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link C255 }
     *     
     */
    public void setOccupationDesc(C255 value) {
        this.occupationDesc = value;
    }

    /**
     * Gets the value of the occupationClassCd property.
     * 
     * @return
     *     possible object is
     *     {@link OccupationClass }
     *     
     */
    public OccupationClass getOccupationClassCd() {
        return occupationClassCd;
    }

    /**
     * Sets the value of the occupationClassCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link OccupationClass }
     *     
     */
    public void setOccupationClassCd(OccupationClass value) {
        this.occupationClassCd = value;
    }

    /**
     * Gets the value of the titleRelationshipCd property.
     * 
     * @return
     *     possible object is
     *     {@link TitleRelationship }
     *     
     */
    public TitleRelationship getTitleRelationshipCd() {
        return titleRelationshipCd;
    }

    /**
     * Sets the value of the titleRelationshipCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link TitleRelationship }
     *     
     */
    public void setTitleRelationshipCd(TitleRelationship value) {
        this.titleRelationshipCd = value;
    }

    /**
     * Gets the value of the lengthTimeEmployed property.
     * 
     * @return
     *     possible object is
     *     {@link MEASUREMENT }
     *     
     */
    public MEASUREMENT getLengthTimeEmployed() {
        return lengthTimeEmployed;
    }

    /**
     * Sets the value of the lengthTimeEmployed property.
     * 
     * @param value
     *     allowed object is
     *     {@link MEASUREMENT }
     *     
     */
    public void setLengthTimeEmployed(MEASUREMENT value) {
        this.lengthTimeEmployed = value;
    }

    /**
     * Gets the value of the lengthTimeCurrentOccupation property.
     * 
     * @return
     *     possible object is
     *     {@link MEASUREMENT }
     *     
     */
    public MEASUREMENT getLengthTimeCurrentOccupation() {
        return lengthTimeCurrentOccupation;
    }

    /**
     * Sets the value of the lengthTimeCurrentOccupation property.
     * 
     * @param value
     *     allowed object is
     *     {@link MEASUREMENT }
     *     
     */
    public void setLengthTimeCurrentOccupation(MEASUREMENT value) {
        this.lengthTimeCurrentOccupation = value;
    }

    /**
     * Gets the value of the lengthTimeWithPreviousEmployer property.
     * 
     * @return
     *     possible object is
     *     {@link MEASUREMENT }
     *     
     */
    public MEASUREMENT getLengthTimeWithPreviousEmployer() {
        return lengthTimeWithPreviousEmployer;
    }

    /**
     * Sets the value of the lengthTimeWithPreviousEmployer property.
     * 
     * @param value
     *     allowed object is
     *     {@link MEASUREMENT }
     *     
     */
    public void setLengthTimeWithPreviousEmployer(MEASUREMENT value) {
        this.lengthTimeWithPreviousEmployer = value;
    }

    /**
     * Gets the value of the lengthTimeCurrentAddr property.
     * 
     * @return
     *     possible object is
     *     {@link DURATION }
     *     
     */
    public DURATION getLengthTimeCurrentAddr() {
        return lengthTimeCurrentAddr;
    }

    /**
     * Sets the value of the lengthTimeCurrentAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link DURATION }
     *     
     */
    public void setLengthTimeCurrentAddr(DURATION value) {
        this.lengthTimeCurrentAddr = value;
    }

    /**
     * Gets the value of the employerCd property.
     * 
     * @return
     *     possible object is
     *     {@link Employer }
     *     
     */
    public Employer getEmployerCd() {
        return employerCd;
    }

    /**
     * Sets the value of the employerCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Employer }
     *     
     */
    public void setEmployerCd(Employer value) {
        this.employerCd = value;
    }

    /**
     * Gets the value of the employerDesc property.
     * 
     * @return
     *     possible object is
     *     {@link C255 }
     *     
     */
    public C255 getEmployerDesc() {
        return employerDesc;
    }

    /**
     * Sets the value of the employerDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link C255 }
     *     
     */
    public void setEmployerDesc(C255 value) {
        this.employerDesc = value;
    }

    /**
     * Gets the value of the miscParty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the miscParty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMiscParty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MiscPartyType }
     * 
     * 
     */
    public List<MiscPartyType> getMiscParty() {
        if (miscParty == null) {
            miscParty = new ArrayList<MiscPartyType>();
        }
        return this.miscParty;
    }

    /**
     * Gets the value of the membershipInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the membershipInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMembershipInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MembershipInfoType }
     * 
     * 
     */
    public List<MembershipInfoType> getMembershipInfo() {
        if (membershipInfo == null) {
            membershipInfo = new ArrayList<MembershipInfoType>();
        }
        return this.membershipInfo;
    }

    /**
     * Gets the value of the doNotSolicitInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getDoNotSolicitInd() {
        return doNotSolicitInd;
    }

    /**
     * Sets the value of the doNotSolicitInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDoNotSolicitInd(Boolean value) {
        this.doNotSolicitInd = value;
    }

    /**
     * Gets the value of the citizenshipCountryCd property.
     * 
     * @return
     *     possible object is
     *     {@link OpenEnum }
     *     
     */
    public OpenEnum getCitizenshipCountryCd() {
        return citizenshipCountryCd;
    }

    /**
     * Sets the value of the citizenshipCountryCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpenEnum }
     *     
     */
    public void setCitizenshipCountryCd(OpenEnum value) {
        this.citizenshipCountryCd = value;
    }

    /**
     * Gets the value of the numDependents property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumDependents() {
        return numDependents;
    }

    /**
     * Sets the value of the numDependents property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumDependents(Long value) {
        this.numDependents = value;
    }

    /**
     * Gets the value of the educationLevelCd property.
     * 
     * @return
     *     possible object is
     *     {@link EducationLevel }
     *     
     */
    public EducationLevel getEducationLevelCd() {
        return educationLevelCd;
    }

    /**
     * Sets the value of the educationLevelCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link EducationLevel }
     *     
     */
    public void setEducationLevelCd(EducationLevel value) {
        this.educationLevelCd = value;
    }

    /**
     * Gets the value of the militaryServiceInfo property.
     * 
     * @return
     *     possible object is
     *     {@link MilitaryServiceInfoType }
     *     
     */
    public MilitaryServiceInfoType getMilitaryServiceInfo() {
        return militaryServiceInfo;
    }

    /**
     * Sets the value of the militaryServiceInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link MilitaryServiceInfoType }
     *     
     */
    public void setMilitaryServiceInfo(MilitaryServiceInfoType value) {
        this.militaryServiceInfo = value;
    }

    /**
     * Gets the value of the coInsuredSameAddressInsuredInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getCoInsuredSameAddressInsuredInd() {
        return coInsuredSameAddressInsuredInd;
    }

    /**
     * Sets the value of the coInsuredSameAddressInsuredInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCoInsuredSameAddressInsuredInd(Boolean value) {
        this.coInsuredSameAddressInsuredInd = value;
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

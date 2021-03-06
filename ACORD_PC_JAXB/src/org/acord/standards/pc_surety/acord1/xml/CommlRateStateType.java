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
 * <p>Java class for CommlRateState_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommlRateState_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}NAICCd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}StateProvCd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}CommlAutoHiredInfo" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}CommlAutoNonOwnedInfo" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}CommlAutoDriveOtherCarInfo" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}CommlAutoAdditionalClassInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}QuestionAnswer" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}CommlVeh" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}CommlCoverage" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}WorkCompInd" minOccurs="0"/>
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
@XmlType(name = "CommlRateState_Type", propOrder = {
    "naicCd",
    "stateProvCd",
    "commlAutoHiredInfo",
    "commlAutoNonOwnedInfo",
    "commlAutoDriveOtherCarInfo",
    "commlAutoAdditionalClassInfo",
    "questionAnswer",
    "commlVeh",
    "commlCoverage",
    "workCompInd"
})
public class CommlRateStateType {

    @XmlElement(name = "NAICCd")
    protected OpenEnum naicCd;
    @XmlElement(name = "StateProvCd")
    protected OpenEnum stateProvCd;
    @XmlElement(name = "CommlAutoHiredInfo")
    protected CommlAutoHiredInfoType commlAutoHiredInfo;
    @XmlElement(name = "CommlAutoNonOwnedInfo")
    protected CommlAutoNonOwnedInfoType commlAutoNonOwnedInfo;
    @XmlElement(name = "CommlAutoDriveOtherCarInfo")
    protected CommlAutoDriveOtherCarInfoType commlAutoDriveOtherCarInfo;
    @XmlElement(name = "CommlAutoAdditionalClassInfo")
    protected List<CommlAutoAdditionalClassInfoType> commlAutoAdditionalClassInfo;
    @XmlElement(name = "QuestionAnswer")
    protected List<QuestionAnswerType> questionAnswer;
    @XmlElement(name = "CommlVeh")
    protected List<CommlVehType> commlVeh;
    @XmlElement(name = "CommlCoverage")
    protected List<CommlCoverageType> commlCoverage;
    @XmlElement(name = "WorkCompInd")
    protected Boolean workCompInd;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;

    /**
     * Gets the value of the naicCd property.
     * 
     * @return
     *     possible object is
     *     {@link OpenEnum }
     *     
     */
    public OpenEnum getNAICCd() {
        return naicCd;
    }

    /**
     * Sets the value of the naicCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpenEnum }
     *     
     */
    public void setNAICCd(OpenEnum value) {
        this.naicCd = value;
    }

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
     * Gets the value of the commlAutoHiredInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CommlAutoHiredInfoType }
     *     
     */
    public CommlAutoHiredInfoType getCommlAutoHiredInfo() {
        return commlAutoHiredInfo;
    }

    /**
     * Sets the value of the commlAutoHiredInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommlAutoHiredInfoType }
     *     
     */
    public void setCommlAutoHiredInfo(CommlAutoHiredInfoType value) {
        this.commlAutoHiredInfo = value;
    }

    /**
     * Gets the value of the commlAutoNonOwnedInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CommlAutoNonOwnedInfoType }
     *     
     */
    public CommlAutoNonOwnedInfoType getCommlAutoNonOwnedInfo() {
        return commlAutoNonOwnedInfo;
    }

    /**
     * Sets the value of the commlAutoNonOwnedInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommlAutoNonOwnedInfoType }
     *     
     */
    public void setCommlAutoNonOwnedInfo(CommlAutoNonOwnedInfoType value) {
        this.commlAutoNonOwnedInfo = value;
    }

    /**
     * Gets the value of the commlAutoDriveOtherCarInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CommlAutoDriveOtherCarInfoType }
     *     
     */
    public CommlAutoDriveOtherCarInfoType getCommlAutoDriveOtherCarInfo() {
        return commlAutoDriveOtherCarInfo;
    }

    /**
     * Sets the value of the commlAutoDriveOtherCarInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommlAutoDriveOtherCarInfoType }
     *     
     */
    public void setCommlAutoDriveOtherCarInfo(CommlAutoDriveOtherCarInfoType value) {
        this.commlAutoDriveOtherCarInfo = value;
    }

    /**
     * Gets the value of the commlAutoAdditionalClassInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the commlAutoAdditionalClassInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCommlAutoAdditionalClassInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommlAutoAdditionalClassInfoType }
     * 
     * 
     */
    public List<CommlAutoAdditionalClassInfoType> getCommlAutoAdditionalClassInfo() {
        if (commlAutoAdditionalClassInfo == null) {
            commlAutoAdditionalClassInfo = new ArrayList<CommlAutoAdditionalClassInfoType>();
        }
        return this.commlAutoAdditionalClassInfo;
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
     * Gets the value of the commlVeh property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the commlVeh property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCommlVeh().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommlVehType }
     * 
     * 
     */
    public List<CommlVehType> getCommlVeh() {
        if (commlVeh == null) {
            commlVeh = new ArrayList<CommlVehType>();
        }
        return this.commlVeh;
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

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
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PersPkgInlandMarineLineBusiness_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PersPkgInlandMarineLineBusiness_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}PCLINEBUSINESS">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}Coverage" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}SafeVaultCharacteristics" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}AlarmAndSecurity" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}QuestionAnswer" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="PropScheduleRefs" use="required" type="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}IDREFS" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersPkgInlandMarineLineBusiness_Type", propOrder = {
    "coverage",
    "safeVaultCharacteristics",
    "alarmAndSecurity",
    "questionAnswer"
})
public class PersPkgInlandMarineLineBusinessType
    extends PCLINEBUSINESS
{

    @XmlElement(name = "Coverage")
    protected List<CoverageType> coverage;
    @XmlElement(name = "SafeVaultCharacteristics")
    protected List<SafeVaultCharacteristicsType> safeVaultCharacteristics;
    @XmlElement(name = "AlarmAndSecurity")
    protected List<AlarmAndSecurityType> alarmAndSecurity;
    @XmlElement(name = "QuestionAnswer")
    protected List<QuestionAnswerType> questionAnswer;
    @XmlAttribute(name = "PropScheduleRefs", required = true)
    @XmlIDREF
    protected List<Object> propScheduleRefs;

    /**
     * Gets the value of the coverage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the coverage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCoverage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CoverageType }
     * 
     * 
     */
    public List<CoverageType> getCoverage() {
        if (coverage == null) {
            coverage = new ArrayList<CoverageType>();
        }
        return this.coverage;
    }

    /**
     * Gets the value of the safeVaultCharacteristics property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the safeVaultCharacteristics property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSafeVaultCharacteristics().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SafeVaultCharacteristicsType }
     * 
     * 
     */
    public List<SafeVaultCharacteristicsType> getSafeVaultCharacteristics() {
        if (safeVaultCharacteristics == null) {
            safeVaultCharacteristics = new ArrayList<SafeVaultCharacteristicsType>();
        }
        return this.safeVaultCharacteristics;
    }

    /**
     * Gets the value of the alarmAndSecurity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the alarmAndSecurity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlarmAndSecurity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AlarmAndSecurityType }
     * 
     * 
     */
    public List<AlarmAndSecurityType> getAlarmAndSecurity() {
        if (alarmAndSecurity == null) {
            alarmAndSecurity = new ArrayList<AlarmAndSecurityType>();
        }
        return this.alarmAndSecurity;
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
     * Gets the value of the propScheduleRefs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the propScheduleRefs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPropScheduleRefs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getPropScheduleRefs() {
        if (propScheduleRefs == null) {
            propScheduleRefs = new ArrayList<Object>();
        }
        return this.propScheduleRefs;
    }

}
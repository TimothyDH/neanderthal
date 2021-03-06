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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FarmLineBusiness_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FarmLineBusiness_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}PCLINEBUSINESS">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}Dwell" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}Structure" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}PersDriver" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}VehInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}PropertySchedule" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}Watercraft" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}WatercraftAccessory" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}FarmLiabilityInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}Coverage" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}QuestionAnswer" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FarmLineBusiness_Type", propOrder = {
    "dwell",
    "structure",
    "persDriver",
    "vehInfo",
    "propertySchedule",
    "watercraft",
    "watercraftAccessory",
    "farmLiabilityInfo",
    "coverage",
    "questionAnswer"
})
public class FarmLineBusinessType
    extends PCLINEBUSINESS
{

    @XmlElement(name = "Dwell")
    protected List<DwellType> dwell;
    @XmlElement(name = "Structure")
    protected List<StructureType2> structure;
    @XmlElement(name = "PersDriver")
    protected List<PersDriverType> persDriver;
    @XmlElement(name = "VehInfo")
    protected List<VehInfoType> vehInfo;
    @XmlElement(name = "PropertySchedule")
    protected List<PropertyScheduleType> propertySchedule;
    @XmlElement(name = "Watercraft")
    protected List<WatercraftType> watercraft;
    @XmlElement(name = "WatercraftAccessory")
    protected List<WatercraftAccessoryType> watercraftAccessory;
    @XmlElement(name = "FarmLiabilityInfo")
    protected List<FarmLiabilityInfoType> farmLiabilityInfo;
    @XmlElement(name = "Coverage")
    protected List<CoverageType> coverage;
    @XmlElement(name = "QuestionAnswer")
    protected List<QuestionAnswerType> questionAnswer;

    /**
     * Gets the value of the dwell property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dwell property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDwell().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DwellType }
     * 
     * 
     */
    public List<DwellType> getDwell() {
        if (dwell == null) {
            dwell = new ArrayList<DwellType>();
        }
        return this.dwell;
    }

    /**
     * Gets the value of the structure property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the structure property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStructure().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StructureType2 }
     * 
     * 
     */
    public List<StructureType2> getStructure() {
        if (structure == null) {
            structure = new ArrayList<StructureType2>();
        }
        return this.structure;
    }

    /**
     * Gets the value of the persDriver property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the persDriver property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersDriver().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PersDriverType }
     * 
     * 
     */
    public List<PersDriverType> getPersDriver() {
        if (persDriver == null) {
            persDriver = new ArrayList<PersDriverType>();
        }
        return this.persDriver;
    }

    /**
     * Gets the value of the vehInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vehInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVehInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VehInfoType }
     * 
     * 
     */
    public List<VehInfoType> getVehInfo() {
        if (vehInfo == null) {
            vehInfo = new ArrayList<VehInfoType>();
        }
        return this.vehInfo;
    }

    /**
     * Gets the value of the propertySchedule property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the propertySchedule property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPropertySchedule().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PropertyScheduleType }
     * 
     * 
     */
    public List<PropertyScheduleType> getPropertySchedule() {
        if (propertySchedule == null) {
            propertySchedule = new ArrayList<PropertyScheduleType>();
        }
        return this.propertySchedule;
    }

    /**
     * Gets the value of the watercraft property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the watercraft property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWatercraft().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WatercraftType }
     * 
     * 
     */
    public List<WatercraftType> getWatercraft() {
        if (watercraft == null) {
            watercraft = new ArrayList<WatercraftType>();
        }
        return this.watercraft;
    }

    /**
     * Gets the value of the watercraftAccessory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the watercraftAccessory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWatercraftAccessory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WatercraftAccessoryType }
     * 
     * 
     */
    public List<WatercraftAccessoryType> getWatercraftAccessory() {
        if (watercraftAccessory == null) {
            watercraftAccessory = new ArrayList<WatercraftAccessoryType>();
        }
        return this.watercraftAccessory;
    }

    /**
     * Gets the value of the farmLiabilityInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the farmLiabilityInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFarmLiabilityInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FarmLiabilityInfoType }
     * 
     * 
     */
    public List<FarmLiabilityInfoType> getFarmLiabilityInfo() {
        if (farmLiabilityInfo == null) {
            farmLiabilityInfo = new ArrayList<FarmLiabilityInfoType>();
        }
        return this.farmLiabilityInfo;
    }

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

}

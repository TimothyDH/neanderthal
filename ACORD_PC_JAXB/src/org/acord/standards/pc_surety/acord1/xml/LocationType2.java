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
 * <p>Java class for Location_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Location_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}ItemIdInfo"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}Addr"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}CountyTownCd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}RiskLocationCd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}EarthquakeZoneCd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}TaxCodeInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}SubLocation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}AdditionalInterest" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}FireDistrict" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}FireDistrictCd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}FireStation" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}Communications" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}LocationName" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}LocationDesc" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}CatastropheZoneCd" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}ID" />
 *       &lt;attribute name="NameInfoRef" type="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}IDREF" />
 *       &lt;attribute name="NameInfoRefs" type="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}IDREFS" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Location_Type", propOrder = {
    "itemIdInfo",
    "addr",
    "countyTownCd",
    "riskLocationCd",
    "earthquakeZoneCd",
    "taxCodeInfo",
    "subLocation",
    "additionalInterest",
    "fireDistrict",
    "fireDistrictCd",
    "fireStation",
    "communications",
    "locationName",
    "locationDesc",
    "catastropheZoneCd"
})
public class LocationType2 {

    @XmlElement(name = "ItemIdInfo", required = true)
    protected ItemIdInfoType itemIdInfo;
    @XmlElement(name = "Addr", required = true)
    protected AddrType addr;
    @XmlElement(name = "CountyTownCd")
    protected OpenEnum countyTownCd;
    @XmlElement(name = "RiskLocationCd")
    protected LocationType riskLocationCd;
    @XmlElement(name = "EarthquakeZoneCd")
    protected OpenEnum earthquakeZoneCd;
    @XmlElement(name = "TaxCodeInfo")
    protected List<TaxCodeInfoType> taxCodeInfo;
    @XmlElement(name = "SubLocation")
    protected List<SubLocationType> subLocation;
    @XmlElement(name = "AdditionalInterest")
    protected List<AdditionalInterestType> additionalInterest;
    @XmlElement(name = "FireDistrict")
    protected C64 fireDistrict;
    @XmlElement(name = "FireDistrictCd")
    protected OpenEnum fireDistrictCd;
    @XmlElement(name = "FireStation")
    protected C100 fireStation;
    @XmlElement(name = "Communications")
    protected CommunicationsType communications;
    @XmlElement(name = "LocationName")
    protected C255 locationName;
    @XmlElement(name = "LocationDesc")
    protected CInfinite locationDesc;
    @XmlElement(name = "CatastropheZoneCd")
    protected List<OpenEnum> catastropheZoneCd;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;
    @XmlAttribute(name = "NameInfoRef")
    @XmlIDREF
    protected Object nameInfoRef;
    @XmlAttribute(name = "NameInfoRefs")
    @XmlIDREF
    protected List<Object> nameInfoRefs;

    /**
     * Gets the value of the itemIdInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ItemIdInfoType }
     *     
     */
    public ItemIdInfoType getItemIdInfo() {
        return itemIdInfo;
    }

    /**
     * Sets the value of the itemIdInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemIdInfoType }
     *     
     */
    public void setItemIdInfo(ItemIdInfoType value) {
        this.itemIdInfo = value;
    }

    /**
     * Gets the value of the addr property.
     * 
     * @return
     *     possible object is
     *     {@link AddrType }
     *     
     */
    public AddrType getAddr() {
        return addr;
    }

    /**
     * Sets the value of the addr property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddrType }
     *     
     */
    public void setAddr(AddrType value) {
        this.addr = value;
    }

    /**
     * Gets the value of the countyTownCd property.
     * 
     * @return
     *     possible object is
     *     {@link OpenEnum }
     *     
     */
    public OpenEnum getCountyTownCd() {
        return countyTownCd;
    }

    /**
     * Sets the value of the countyTownCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpenEnum }
     *     
     */
    public void setCountyTownCd(OpenEnum value) {
        this.countyTownCd = value;
    }

    /**
     * Gets the value of the riskLocationCd property.
     * 
     * @return
     *     possible object is
     *     {@link LocationType }
     *     
     */
    public LocationType getRiskLocationCd() {
        return riskLocationCd;
    }

    /**
     * Sets the value of the riskLocationCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationType }
     *     
     */
    public void setRiskLocationCd(LocationType value) {
        this.riskLocationCd = value;
    }

    /**
     * Gets the value of the earthquakeZoneCd property.
     * 
     * @return
     *     possible object is
     *     {@link OpenEnum }
     *     
     */
    public OpenEnum getEarthquakeZoneCd() {
        return earthquakeZoneCd;
    }

    /**
     * Sets the value of the earthquakeZoneCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpenEnum }
     *     
     */
    public void setEarthquakeZoneCd(OpenEnum value) {
        this.earthquakeZoneCd = value;
    }

    /**
     * Gets the value of the taxCodeInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxCodeInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxCodeInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaxCodeInfoType }
     * 
     * 
     */
    public List<TaxCodeInfoType> getTaxCodeInfo() {
        if (taxCodeInfo == null) {
            taxCodeInfo = new ArrayList<TaxCodeInfoType>();
        }
        return this.taxCodeInfo;
    }

    /**
     * Gets the value of the subLocation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subLocation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubLocation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SubLocationType }
     * 
     * 
     */
    public List<SubLocationType> getSubLocation() {
        if (subLocation == null) {
            subLocation = new ArrayList<SubLocationType>();
        }
        return this.subLocation;
    }

    /**
     * Gets the value of the additionalInterest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalInterest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalInterest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalInterestType }
     * 
     * 
     */
    public List<AdditionalInterestType> getAdditionalInterest() {
        if (additionalInterest == null) {
            additionalInterest = new ArrayList<AdditionalInterestType>();
        }
        return this.additionalInterest;
    }

    /**
     * Gets the value of the fireDistrict property.
     * 
     * @return
     *     possible object is
     *     {@link C64 }
     *     
     */
    public C64 getFireDistrict() {
        return fireDistrict;
    }

    /**
     * Sets the value of the fireDistrict property.
     * 
     * @param value
     *     allowed object is
     *     {@link C64 }
     *     
     */
    public void setFireDistrict(C64 value) {
        this.fireDistrict = value;
    }

    /**
     * Gets the value of the fireDistrictCd property.
     * 
     * @return
     *     possible object is
     *     {@link OpenEnum }
     *     
     */
    public OpenEnum getFireDistrictCd() {
        return fireDistrictCd;
    }

    /**
     * Sets the value of the fireDistrictCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpenEnum }
     *     
     */
    public void setFireDistrictCd(OpenEnum value) {
        this.fireDistrictCd = value;
    }

    /**
     * Gets the value of the fireStation property.
     * 
     * @return
     *     possible object is
     *     {@link C100 }
     *     
     */
    public C100 getFireStation() {
        return fireStation;
    }

    /**
     * Sets the value of the fireStation property.
     * 
     * @param value
     *     allowed object is
     *     {@link C100 }
     *     
     */
    public void setFireStation(C100 value) {
        this.fireStation = value;
    }

    /**
     * Gets the value of the communications property.
     * 
     * @return
     *     possible object is
     *     {@link CommunicationsType }
     *     
     */
    public CommunicationsType getCommunications() {
        return communications;
    }

    /**
     * Sets the value of the communications property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommunicationsType }
     *     
     */
    public void setCommunications(CommunicationsType value) {
        this.communications = value;
    }

    /**
     * Gets the value of the locationName property.
     * 
     * @return
     *     possible object is
     *     {@link C255 }
     *     
     */
    public C255 getLocationName() {
        return locationName;
    }

    /**
     * Sets the value of the locationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link C255 }
     *     
     */
    public void setLocationName(C255 value) {
        this.locationName = value;
    }

    /**
     * Gets the value of the locationDesc property.
     * 
     * @return
     *     possible object is
     *     {@link CInfinite }
     *     
     */
    public CInfinite getLocationDesc() {
        return locationDesc;
    }

    /**
     * Sets the value of the locationDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CInfinite }
     *     
     */
    public void setLocationDesc(CInfinite value) {
        this.locationDesc = value;
    }

    /**
     * Gets the value of the catastropheZoneCd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the catastropheZoneCd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCatastropheZoneCd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OpenEnum }
     * 
     * 
     */
    public List<OpenEnum> getCatastropheZoneCd() {
        if (catastropheZoneCd == null) {
            catastropheZoneCd = new ArrayList<OpenEnum>();
        }
        return this.catastropheZoneCd;
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
     * Gets the value of the nameInfoRef property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getNameInfoRef() {
        return nameInfoRef;
    }

    /**
     * Sets the value of the nameInfoRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setNameInfoRef(Object value) {
        this.nameInfoRef = value;
    }

    /**
     * Gets the value of the nameInfoRefs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nameInfoRefs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNameInfoRefs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getNameInfoRefs() {
        if (nameInfoRefs == null) {
            nameInfoRefs = new ArrayList<Object>();
        }
        return this.nameInfoRefs;
    }

}

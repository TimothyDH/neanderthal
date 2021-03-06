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
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for RateSyncReturnInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RateSyncReturnInfo_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}Rate" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}RatePerThousandAmt" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}RangeInfo" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}RateLevelNumber" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}MinMaxInfo" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}CreditOrSurcharge" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}PremiumAmt" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}PremiumRateCd" minOccurs="0"/>
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
@XmlType(name = "RateSyncReturnInfo_Type", propOrder = {
    "rate",
    "ratePerThousandAmt",
    "rangeInfo",
    "rateLevelNumber",
    "minMaxInfo",
    "creditOrSurcharge",
    "premiumAmt",
    "premiumRateCd"
})
public class RateSyncReturnInfoType {

    @XmlElement(name = "Rate")
    protected Decimal rate;
    @XmlElement(name = "RatePerThousandAmt")
    protected CURRENCY ratePerThousandAmt;
    @XmlElement(name = "RangeInfo")
    protected RangeInfoType rangeInfo;
    @XmlElement(name = "RateLevelNumber")
    protected Long rateLevelNumber;
    @XmlElement(name = "MinMaxInfo")
    protected MinMaxInfoType minMaxInfo;
    @XmlElement(name = "CreditOrSurcharge")
    protected PCCREDITSURCHARGE creditOrSurcharge;
    @XmlElement(name = "PremiumAmt")
    protected CURRENCY premiumAmt;
    @XmlElement(name = "PremiumRateCd")
    protected RateScaleType premiumRateCd;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;

    /**
     * Gets the value of the rate property.
     * 
     * @return
     *     possible object is
     *     {@link Decimal }
     *     
     */
    public Decimal getRate() {
        return rate;
    }

    /**
     * Sets the value of the rate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Decimal }
     *     
     */
    public void setRate(Decimal value) {
        this.rate = value;
    }

    /**
     * Gets the value of the ratePerThousandAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CURRENCY }
     *     
     */
    public CURRENCY getRatePerThousandAmt() {
        return ratePerThousandAmt;
    }

    /**
     * Sets the value of the ratePerThousandAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CURRENCY }
     *     
     */
    public void setRatePerThousandAmt(CURRENCY value) {
        this.ratePerThousandAmt = value;
    }

    /**
     * Gets the value of the rangeInfo property.
     * 
     * @return
     *     possible object is
     *     {@link RangeInfoType }
     *     
     */
    public RangeInfoType getRangeInfo() {
        return rangeInfo;
    }

    /**
     * Sets the value of the rangeInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link RangeInfoType }
     *     
     */
    public void setRangeInfo(RangeInfoType value) {
        this.rangeInfo = value;
    }

    /**
     * Gets the value of the rateLevelNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRateLevelNumber() {
        return rateLevelNumber;
    }

    /**
     * Sets the value of the rateLevelNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRateLevelNumber(Long value) {
        this.rateLevelNumber = value;
    }

    /**
     * Gets the value of the minMaxInfo property.
     * 
     * @return
     *     possible object is
     *     {@link MinMaxInfoType }
     *     
     */
    public MinMaxInfoType getMinMaxInfo() {
        return minMaxInfo;
    }

    /**
     * Sets the value of the minMaxInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link MinMaxInfoType }
     *     
     */
    public void setMinMaxInfo(MinMaxInfoType value) {
        this.minMaxInfo = value;
    }

    /**
     * Gets the value of the creditOrSurcharge property.
     * 
     * @return
     *     possible object is
     *     {@link PCCREDITSURCHARGE }
     *     
     */
    public PCCREDITSURCHARGE getCreditOrSurcharge() {
        return creditOrSurcharge;
    }

    /**
     * Sets the value of the creditOrSurcharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link PCCREDITSURCHARGE }
     *     
     */
    public void setCreditOrSurcharge(PCCREDITSURCHARGE value) {
        this.creditOrSurcharge = value;
    }

    /**
     * Gets the value of the premiumAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CURRENCY }
     *     
     */
    public CURRENCY getPremiumAmt() {
        return premiumAmt;
    }

    /**
     * Sets the value of the premiumAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CURRENCY }
     *     
     */
    public void setPremiumAmt(CURRENCY value) {
        this.premiumAmt = value;
    }

    /**
     * Gets the value of the premiumRateCd property.
     * 
     * @return
     *     possible object is
     *     {@link RateScaleType }
     *     
     */
    public RateScaleType getPremiumRateCd() {
        return premiumRateCd;
    }

    /**
     * Sets the value of the premiumRateCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateScaleType }
     *     
     */
    public void setPremiumRateCd(RateScaleType value) {
        this.premiumRateCd = value;
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

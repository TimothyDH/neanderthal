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
 * <p>Java class for ClaimsMadeInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClaimsMadeInfo_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}UnlimitedPriorActsCoverageInd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}CurrentRetroactiveDt" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}ProposedRetroactiveDt" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}UninterruptedClmMadeCovEntryDt" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}DiscoveryPeriod" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}DiscoveryPct" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}DiscoveryPremiumAmt" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}RetroactiveCoverageInd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}ClaimsMadeInd" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}KnownAccidentsExcludedInd" minOccurs="0"/>
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
@XmlType(name = "ClaimsMadeInfo_Type", propOrder = {
    "unlimitedPriorActsCoverageInd",
    "currentRetroactiveDt",
    "proposedRetroactiveDt",
    "uninterruptedClmMadeCovEntryDt",
    "discoveryPeriod",
    "discoveryPct",
    "discoveryPremiumAmt",
    "retroactiveCoverageInd",
    "claimsMadeInd",
    "knownAccidentsExcludedInd"
})
public class ClaimsMadeInfoType {

    @XmlElement(name = "UnlimitedPriorActsCoverageInd")
    protected Boolean unlimitedPriorActsCoverageInd;
    @XmlElement(name = "CurrentRetroactiveDt")
    protected Date currentRetroactiveDt;
    @XmlElement(name = "ProposedRetroactiveDt")
    protected Date proposedRetroactiveDt;
    @XmlElement(name = "UninterruptedClmMadeCovEntryDt")
    protected Date uninterruptedClmMadeCovEntryDt;
    @XmlElement(name = "DiscoveryPeriod")
    protected DURATION discoveryPeriod;
    @XmlElement(name = "DiscoveryPct")
    protected PercentDecimal discoveryPct;
    @XmlElement(name = "DiscoveryPremiumAmt")
    protected CURRENCY discoveryPremiumAmt;
    @XmlElement(name = "RetroactiveCoverageInd")
    protected Boolean retroactiveCoverageInd;
    @XmlElement(name = "ClaimsMadeInd")
    protected Boolean claimsMadeInd;
    @XmlElement(name = "KnownAccidentsExcludedInd")
    protected Boolean knownAccidentsExcludedInd;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;

    /**
     * Gets the value of the unlimitedPriorActsCoverageInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getUnlimitedPriorActsCoverageInd() {
        return unlimitedPriorActsCoverageInd;
    }

    /**
     * Sets the value of the unlimitedPriorActsCoverageInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUnlimitedPriorActsCoverageInd(Boolean value) {
        this.unlimitedPriorActsCoverageInd = value;
    }

    /**
     * Gets the value of the currentRetroactiveDt property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getCurrentRetroactiveDt() {
        return currentRetroactiveDt;
    }

    /**
     * Sets the value of the currentRetroactiveDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setCurrentRetroactiveDt(Date value) {
        this.currentRetroactiveDt = value;
    }

    /**
     * Gets the value of the proposedRetroactiveDt property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getProposedRetroactiveDt() {
        return proposedRetroactiveDt;
    }

    /**
     * Sets the value of the proposedRetroactiveDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setProposedRetroactiveDt(Date value) {
        this.proposedRetroactiveDt = value;
    }

    /**
     * Gets the value of the uninterruptedClmMadeCovEntryDt property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getUninterruptedClmMadeCovEntryDt() {
        return uninterruptedClmMadeCovEntryDt;
    }

    /**
     * Sets the value of the uninterruptedClmMadeCovEntryDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setUninterruptedClmMadeCovEntryDt(Date value) {
        this.uninterruptedClmMadeCovEntryDt = value;
    }

    /**
     * Gets the value of the discoveryPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link DURATION }
     *     
     */
    public DURATION getDiscoveryPeriod() {
        return discoveryPeriod;
    }

    /**
     * Sets the value of the discoveryPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link DURATION }
     *     
     */
    public void setDiscoveryPeriod(DURATION value) {
        this.discoveryPeriod = value;
    }

    /**
     * Gets the value of the discoveryPct property.
     * 
     * @return
     *     possible object is
     *     {@link PercentDecimal }
     *     
     */
    public PercentDecimal getDiscoveryPct() {
        return discoveryPct;
    }

    /**
     * Sets the value of the discoveryPct property.
     * 
     * @param value
     *     allowed object is
     *     {@link PercentDecimal }
     *     
     */
    public void setDiscoveryPct(PercentDecimal value) {
        this.discoveryPct = value;
    }

    /**
     * Gets the value of the discoveryPremiumAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CURRENCY }
     *     
     */
    public CURRENCY getDiscoveryPremiumAmt() {
        return discoveryPremiumAmt;
    }

    /**
     * Sets the value of the discoveryPremiumAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CURRENCY }
     *     
     */
    public void setDiscoveryPremiumAmt(CURRENCY value) {
        this.discoveryPremiumAmt = value;
    }

    /**
     * Gets the value of the retroactiveCoverageInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getRetroactiveCoverageInd() {
        return retroactiveCoverageInd;
    }

    /**
     * Sets the value of the retroactiveCoverageInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRetroactiveCoverageInd(Boolean value) {
        this.retroactiveCoverageInd = value;
    }

    /**
     * Gets the value of the claimsMadeInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getClaimsMadeInd() {
        return claimsMadeInd;
    }

    /**
     * Sets the value of the claimsMadeInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setClaimsMadeInd(Boolean value) {
        this.claimsMadeInd = value;
    }

    /**
     * Gets the value of the knownAccidentsExcludedInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getKnownAccidentsExcludedInd() {
        return knownAccidentsExcludedInd;
    }

    /**
     * Sets the value of the knownAccidentsExcludedInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setKnownAccidentsExcludedInd(Boolean value) {
        this.knownAccidentsExcludedInd = value;
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

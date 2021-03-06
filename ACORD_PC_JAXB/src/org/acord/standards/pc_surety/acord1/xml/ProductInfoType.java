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
 * <p>Java class for ProductInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductInfo_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}ProductDesignedDesc" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}ProductMfgDesc" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}DiscontinuedDesc" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}ModificationDesc" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}ModificationReason" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}LiquidChemDesc" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}HazardDesc" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}RepairOperationsDesc" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}AircraftOwnedServiced" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}ServiceContractDesc" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}ContractHarmlessDesc" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}SpacecraftInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}ProductManufacturing" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "ProductInfo_Type", propOrder = {
    "productDesignedDesc",
    "productMfgDesc",
    "discontinuedDesc",
    "modificationDesc",
    "modificationReason",
    "liquidChemDesc",
    "hazardDesc",
    "repairOperationsDesc",
    "aircraftOwnedServiced",
    "serviceContractDesc",
    "contractHarmlessDesc",
    "spacecraftInfo",
    "productManufacturing"
})
public class ProductInfoType {

    @XmlElement(name = "ProductDesignedDesc")
    protected CInfinite productDesignedDesc;
    @XmlElement(name = "ProductMfgDesc")
    protected CInfinite productMfgDesc;
    @XmlElement(name = "DiscontinuedDesc")
    protected C255 discontinuedDesc;
    @XmlElement(name = "ModificationDesc")
    protected C255 modificationDesc;
    @XmlElement(name = "ModificationReason")
    protected C255 modificationReason;
    @XmlElement(name = "LiquidChemDesc")
    protected C255 liquidChemDesc;
    @XmlElement(name = "HazardDesc")
    protected C255 hazardDesc;
    @XmlElement(name = "RepairOperationsDesc")
    protected C255 repairOperationsDesc;
    @XmlElement(name = "AircraftOwnedServiced")
    protected List<AircraftOwnedServicedType> aircraftOwnedServiced;
    @XmlElement(name = "ServiceContractDesc")
    protected C255 serviceContractDesc;
    @XmlElement(name = "ContractHarmlessDesc")
    protected C255 contractHarmlessDesc;
    @XmlElement(name = "SpacecraftInfo")
    protected List<SpacecraftInfoType> spacecraftInfo;
    @XmlElement(name = "ProductManufacturing")
    protected List<ProductManufacturingType> productManufacturing;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;

    /**
     * Gets the value of the productDesignedDesc property.
     * 
     * @return
     *     possible object is
     *     {@link CInfinite }
     *     
     */
    public CInfinite getProductDesignedDesc() {
        return productDesignedDesc;
    }

    /**
     * Sets the value of the productDesignedDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CInfinite }
     *     
     */
    public void setProductDesignedDesc(CInfinite value) {
        this.productDesignedDesc = value;
    }

    /**
     * Gets the value of the productMfgDesc property.
     * 
     * @return
     *     possible object is
     *     {@link CInfinite }
     *     
     */
    public CInfinite getProductMfgDesc() {
        return productMfgDesc;
    }

    /**
     * Sets the value of the productMfgDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CInfinite }
     *     
     */
    public void setProductMfgDesc(CInfinite value) {
        this.productMfgDesc = value;
    }

    /**
     * Gets the value of the discontinuedDesc property.
     * 
     * @return
     *     possible object is
     *     {@link C255 }
     *     
     */
    public C255 getDiscontinuedDesc() {
        return discontinuedDesc;
    }

    /**
     * Sets the value of the discontinuedDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link C255 }
     *     
     */
    public void setDiscontinuedDesc(C255 value) {
        this.discontinuedDesc = value;
    }

    /**
     * Gets the value of the modificationDesc property.
     * 
     * @return
     *     possible object is
     *     {@link C255 }
     *     
     */
    public C255 getModificationDesc() {
        return modificationDesc;
    }

    /**
     * Sets the value of the modificationDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link C255 }
     *     
     */
    public void setModificationDesc(C255 value) {
        this.modificationDesc = value;
    }

    /**
     * Gets the value of the modificationReason property.
     * 
     * @return
     *     possible object is
     *     {@link C255 }
     *     
     */
    public C255 getModificationReason() {
        return modificationReason;
    }

    /**
     * Sets the value of the modificationReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link C255 }
     *     
     */
    public void setModificationReason(C255 value) {
        this.modificationReason = value;
    }

    /**
     * Gets the value of the liquidChemDesc property.
     * 
     * @return
     *     possible object is
     *     {@link C255 }
     *     
     */
    public C255 getLiquidChemDesc() {
        return liquidChemDesc;
    }

    /**
     * Sets the value of the liquidChemDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link C255 }
     *     
     */
    public void setLiquidChemDesc(C255 value) {
        this.liquidChemDesc = value;
    }

    /**
     * Gets the value of the hazardDesc property.
     * 
     * @return
     *     possible object is
     *     {@link C255 }
     *     
     */
    public C255 getHazardDesc() {
        return hazardDesc;
    }

    /**
     * Sets the value of the hazardDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link C255 }
     *     
     */
    public void setHazardDesc(C255 value) {
        this.hazardDesc = value;
    }

    /**
     * Gets the value of the repairOperationsDesc property.
     * 
     * @return
     *     possible object is
     *     {@link C255 }
     *     
     */
    public C255 getRepairOperationsDesc() {
        return repairOperationsDesc;
    }

    /**
     * Sets the value of the repairOperationsDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link C255 }
     *     
     */
    public void setRepairOperationsDesc(C255 value) {
        this.repairOperationsDesc = value;
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
     * Gets the value of the serviceContractDesc property.
     * 
     * @return
     *     possible object is
     *     {@link C255 }
     *     
     */
    public C255 getServiceContractDesc() {
        return serviceContractDesc;
    }

    /**
     * Sets the value of the serviceContractDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link C255 }
     *     
     */
    public void setServiceContractDesc(C255 value) {
        this.serviceContractDesc = value;
    }

    /**
     * Gets the value of the contractHarmlessDesc property.
     * 
     * @return
     *     possible object is
     *     {@link C255 }
     *     
     */
    public C255 getContractHarmlessDesc() {
        return contractHarmlessDesc;
    }

    /**
     * Sets the value of the contractHarmlessDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link C255 }
     *     
     */
    public void setContractHarmlessDesc(C255 value) {
        this.contractHarmlessDesc = value;
    }

    /**
     * Gets the value of the spacecraftInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the spacecraftInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpacecraftInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SpacecraftInfoType }
     * 
     * 
     */
    public List<SpacecraftInfoType> getSpacecraftInfo() {
        if (spacecraftInfo == null) {
            spacecraftInfo = new ArrayList<SpacecraftInfoType>();
        }
        return this.spacecraftInfo;
    }

    /**
     * Gets the value of the productManufacturing property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productManufacturing property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductManufacturing().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductManufacturingType }
     * 
     * 
     */
    public List<ProductManufacturingType> getProductManufacturing() {
        if (productManufacturing == null) {
            productManufacturing = new ArrayList<ProductManufacturingType>();
        }
        return this.productManufacturing;
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

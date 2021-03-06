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
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for SuretyBondInqRs_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SuretyBondInqRs_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}MSGRSINFO"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}AsOfDt" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}Requestor" minOccurs="0"/>
 *         &lt;group ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}SURETYBONDINQRS_CHOICE"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}SuretyBond" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}RemarkText" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}FileAttachmentInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SuretyBondInqRs_Type", propOrder = {
    "rqUID",
    "transactionResponseDt",
    "transactionEffectiveDt",
    "curCd",
    "codeList",
    "conversionRate",
    "msgStatus",
    "spxEditVersionApplied",
    "acordStandardVersionCd",
    "asOfDt",
    "requestor",
    "partyInqInfo",
    "suretyBondInqInfo",
    "suretyBondTransactionInqInfo",
    "suretyBondDetailInqInfo",
    "suretyBond",
    "remarkText",
    "fileAttachmentInfo"
})
public class SuretyBondInqRsType {

    @XmlElement(name = "RqUID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String rqUID;
    @XmlElement(name = "TransactionResponseDt", required = true)
    protected DateTime transactionResponseDt;
    @XmlElement(name = "TransactionEffectiveDt")
    protected DateTime transactionEffectiveDt;
    @XmlElement(name = "CurCd")
    protected OpenEnum curCd;
    @XmlElement(name = "CodeList")
    protected List<CodeListType> codeList;
    @XmlElement(name = "ConversionRate")
    protected List<ConversionRateType> conversionRate;
    @XmlElement(name = "MsgStatus", required = true)
    protected MsgStatusType msgStatus;
    @XmlElement(name = "SPXEditVersionApplied")
    protected AssignedIdentifier spxEditVersionApplied;
    @XmlElement(name = "ACORDStandardVersionCd")
    protected ACORDStandardVersion acordStandardVersionCd;
    @XmlElement(name = "AsOfDt")
    protected Date asOfDt;
    @XmlElement(name = "Requestor")
    protected RequestorType2 requestor;
    @XmlElement(name = "PartyInqInfo")
    protected PartyInqInfoType partyInqInfo;
    @XmlElement(name = "SuretyBondInqInfo")
    protected SuretyBondInqInfoType suretyBondInqInfo;
    @XmlElement(name = "SuretyBondTransactionInqInfo")
    protected SuretyBondTransactionInqInfoType suretyBondTransactionInqInfo;
    @XmlElement(name = "SuretyBondDetailInqInfo")
    protected SuretyBondDetailInqInfoType suretyBondDetailInqInfo;
    @XmlElement(name = "SuretyBond")
    protected List<SuretyBondType> suretyBond;
    @XmlElement(name = "RemarkText")
    protected List<RemarkText> remarkText;
    @XmlElement(name = "FileAttachmentInfo")
    protected List<FileAttachmentInfoType> fileAttachmentInfo;

    /**
     * Gets the value of the rqUID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRqUID() {
        return rqUID;
    }

    /**
     * Sets the value of the rqUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRqUID(String value) {
        this.rqUID = value;
    }

    /**
     * Gets the value of the transactionResponseDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getTransactionResponseDt() {
        return transactionResponseDt;
    }

    /**
     * Sets the value of the transactionResponseDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setTransactionResponseDt(DateTime value) {
        this.transactionResponseDt = value;
    }

    /**
     * Gets the value of the transactionEffectiveDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getTransactionEffectiveDt() {
        return transactionEffectiveDt;
    }

    /**
     * Sets the value of the transactionEffectiveDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setTransactionEffectiveDt(DateTime value) {
        this.transactionEffectiveDt = value;
    }

    /**
     * Gets the value of the curCd property.
     * 
     * @return
     *     possible object is
     *     {@link OpenEnum }
     *     
     */
    public OpenEnum getCurCd() {
        return curCd;
    }

    /**
     * Sets the value of the curCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpenEnum }
     *     
     */
    public void setCurCd(OpenEnum value) {
        this.curCd = value;
    }

    /**
     * Gets the value of the codeList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the codeList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCodeList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeListType }
     * 
     * 
     */
    public List<CodeListType> getCodeList() {
        if (codeList == null) {
            codeList = new ArrayList<CodeListType>();
        }
        return this.codeList;
    }

    /**
     * Gets the value of the conversionRate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the conversionRate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConversionRate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConversionRateType }
     * 
     * 
     */
    public List<ConversionRateType> getConversionRate() {
        if (conversionRate == null) {
            conversionRate = new ArrayList<ConversionRateType>();
        }
        return this.conversionRate;
    }

    /**
     * Gets the value of the msgStatus property.
     * 
     * @return
     *     possible object is
     *     {@link MsgStatusType }
     *     
     */
    public MsgStatusType getMsgStatus() {
        return msgStatus;
    }

    /**
     * Sets the value of the msgStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link MsgStatusType }
     *     
     */
    public void setMsgStatus(MsgStatusType value) {
        this.msgStatus = value;
    }

    /**
     * Gets the value of the spxEditVersionApplied property.
     * 
     * @return
     *     possible object is
     *     {@link AssignedIdentifier }
     *     
     */
    public AssignedIdentifier getSPXEditVersionApplied() {
        return spxEditVersionApplied;
    }

    /**
     * Sets the value of the spxEditVersionApplied property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssignedIdentifier }
     *     
     */
    public void setSPXEditVersionApplied(AssignedIdentifier value) {
        this.spxEditVersionApplied = value;
    }

    /**
     * Gets the value of the acordStandardVersionCd property.
     * 
     * @return
     *     possible object is
     *     {@link ACORDStandardVersion }
     *     
     */
    public ACORDStandardVersion getACORDStandardVersionCd() {
        return acordStandardVersionCd;
    }

    /**
     * Sets the value of the acordStandardVersionCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ACORDStandardVersion }
     *     
     */
    public void setACORDStandardVersionCd(ACORDStandardVersion value) {
        this.acordStandardVersionCd = value;
    }

    /**
     * Gets the value of the asOfDt property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getAsOfDt() {
        return asOfDt;
    }

    /**
     * Sets the value of the asOfDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setAsOfDt(Date value) {
        this.asOfDt = value;
    }

    /**
     * Gets the value of the requestor property.
     * 
     * @return
     *     possible object is
     *     {@link RequestorType2 }
     *     
     */
    public RequestorType2 getRequestor() {
        return requestor;
    }

    /**
     * Sets the value of the requestor property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestorType2 }
     *     
     */
    public void setRequestor(RequestorType2 value) {
        this.requestor = value;
    }

    /**
     * Gets the value of the partyInqInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PartyInqInfoType }
     *     
     */
    public PartyInqInfoType getPartyInqInfo() {
        return partyInqInfo;
    }

    /**
     * Sets the value of the partyInqInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyInqInfoType }
     *     
     */
    public void setPartyInqInfo(PartyInqInfoType value) {
        this.partyInqInfo = value;
    }

    /**
     * Gets the value of the suretyBondInqInfo property.
     * 
     * @return
     *     possible object is
     *     {@link SuretyBondInqInfoType }
     *     
     */
    public SuretyBondInqInfoType getSuretyBondInqInfo() {
        return suretyBondInqInfo;
    }

    /**
     * Sets the value of the suretyBondInqInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SuretyBondInqInfoType }
     *     
     */
    public void setSuretyBondInqInfo(SuretyBondInqInfoType value) {
        this.suretyBondInqInfo = value;
    }

    /**
     * Gets the value of the suretyBondTransactionInqInfo property.
     * 
     * @return
     *     possible object is
     *     {@link SuretyBondTransactionInqInfoType }
     *     
     */
    public SuretyBondTransactionInqInfoType getSuretyBondTransactionInqInfo() {
        return suretyBondTransactionInqInfo;
    }

    /**
     * Sets the value of the suretyBondTransactionInqInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SuretyBondTransactionInqInfoType }
     *     
     */
    public void setSuretyBondTransactionInqInfo(SuretyBondTransactionInqInfoType value) {
        this.suretyBondTransactionInqInfo = value;
    }

    /**
     * Gets the value of the suretyBondDetailInqInfo property.
     * 
     * @return
     *     possible object is
     *     {@link SuretyBondDetailInqInfoType }
     *     
     */
    public SuretyBondDetailInqInfoType getSuretyBondDetailInqInfo() {
        return suretyBondDetailInqInfo;
    }

    /**
     * Sets the value of the suretyBondDetailInqInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SuretyBondDetailInqInfoType }
     *     
     */
    public void setSuretyBondDetailInqInfo(SuretyBondDetailInqInfoType value) {
        this.suretyBondDetailInqInfo = value;
    }

    /**
     * Gets the value of the suretyBond property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the suretyBond property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSuretyBond().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SuretyBondType }
     * 
     * 
     */
    public List<SuretyBondType> getSuretyBond() {
        if (suretyBond == null) {
            suretyBond = new ArrayList<SuretyBondType>();
        }
        return this.suretyBond;
    }

    /**
     * Gets the value of the remarkText property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the remarkText property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRemarkText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RemarkText }
     * 
     * 
     */
    public List<RemarkText> getRemarkText() {
        if (remarkText == null) {
            remarkText = new ArrayList<RemarkText>();
        }
        return this.remarkText;
    }

    /**
     * Gets the value of the fileAttachmentInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fileAttachmentInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFileAttachmentInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FileAttachmentInfoType }
     * 
     * 
     */
    public List<FileAttachmentInfoType> getFileAttachmentInfo() {
        if (fileAttachmentInfo == null) {
            fileAttachmentInfo = new ArrayList<FileAttachmentInfoType>();
        }
        return this.fileAttachmentInfo;
    }

}

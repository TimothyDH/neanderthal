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
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}Empty">
 *       &lt;attribute name="SPFieldEditRefs" type="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}IDREFS" />
 *       &lt;attribute name="SPRelationalEditRefs" type="{http://www.ACORD.org/standards/PC_Surety/ACORD1/xml/}IDREFS" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "SPEditIds")
public class SPEditIds
    extends Empty
{

    @XmlAttribute(name = "SPFieldEditRefs")
    @XmlIDREF
    protected List<Object> spFieldEditRefs;
    @XmlAttribute(name = "SPRelationalEditRefs")
    @XmlIDREF
    protected List<Object> spRelationalEditRefs;

    /**
     * Gets the value of the spFieldEditRefs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the spFieldEditRefs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSPFieldEditRefs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getSPFieldEditRefs() {
        if (spFieldEditRefs == null) {
            spFieldEditRefs = new ArrayList<Object>();
        }
        return this.spFieldEditRefs;
    }

    /**
     * Gets the value of the spRelationalEditRefs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the spRelationalEditRefs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSPRelationalEditRefs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getSPRelationalEditRefs() {
        if (spRelationalEditRefs == null) {
            spRelationalEditRefs = new ArrayList<Object>();
        }
        return this.spRelationalEditRefs;
    }

}

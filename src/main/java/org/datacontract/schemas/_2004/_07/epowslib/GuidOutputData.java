
package org.datacontract.schemas._2004._07.epowslib;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for GuidOutputData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GuidOutputData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes}PageOutputData"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ExecutionData" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="listaGuidow" type="{http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes}GuidOutputElement" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GuidOutputData", propOrder = {
    "executionData",
    "listaGuidow"
})
public class GuidOutputData
    extends PageOutputData
{

    @XmlElement(name = "ExecutionData")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar executionData;
    @XmlElementRef(name = "listaGuidow", namespace = "http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", type = JAXBElement.class, required = false)
    protected JAXBElement<GuidOutputElement> listaGuidow;

    /**
     * Gets the value of the executionData property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExecutionData() {
        return executionData;
    }

    /**
     * Sets the value of the executionData property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExecutionData(XMLGregorianCalendar value) {
        this.executionData = value;
    }

    /**
     * Gets the value of the listaGuidow property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GuidOutputElement }{@code >}
     *     
     */
    public JAXBElement<GuidOutputElement> getListaGuidow() {
        return listaGuidow;
    }

    /**
     * Sets the value of the listaGuidow property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GuidOutputElement }{@code >}
     *     
     */
    public void setListaGuidow(JAXBElement<GuidOutputElement> value) {
        this.listaGuidow = value;
    }

}

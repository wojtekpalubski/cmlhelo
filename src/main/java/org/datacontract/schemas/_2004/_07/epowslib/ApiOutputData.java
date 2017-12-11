
package org.datacontract.schemas._2004._07.epowslib;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ApiOutputData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ApiOutputData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes}OutputData"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="wersjaApi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApiOutputData", propOrder = {
    "wersjaApi"
})
public class ApiOutputData
    extends OutputData
{

    @XmlElementRef(name = "wersjaApi", namespace = "http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> wersjaApi;

    /**
     * Gets the value of the wersjaApi property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWersjaApi() {
        return wersjaApi;
    }

    /**
     * Sets the value of the wersjaApi property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWersjaApi(JAXBElement<String> value) {
        this.wersjaApi = value;
    }

}

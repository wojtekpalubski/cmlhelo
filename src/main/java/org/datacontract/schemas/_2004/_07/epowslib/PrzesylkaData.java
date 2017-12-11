
package org.datacontract.schemas._2004._07.epowslib;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PrzesylkaData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PrzesylkaData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GuidPrzesylka" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/&gt;
 *         &lt;element name="IDPrzesylka" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/&gt;
 *         &lt;element name="NumerNadawczy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PrzesylkaData", propOrder = {
    "guidPrzesylka",
    "idPrzesylka",
    "numerNadawczy"
})
public class PrzesylkaData {

    @XmlElement(name = "GuidPrzesylka")
    protected String guidPrzesylka;
    @XmlElement(name = "IDPrzesylka")
    protected String idPrzesylka;
    @XmlElementRef(name = "NumerNadawczy", namespace = "http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numerNadawczy;

    /**
     * Gets the value of the guidPrzesylka property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuidPrzesylka() {
        return guidPrzesylka;
    }

    /**
     * Sets the value of the guidPrzesylka property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuidPrzesylka(String value) {
        this.guidPrzesylka = value;
    }

    /**
     * Gets the value of the idPrzesylka property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDPrzesylka() {
        return idPrzesylka;
    }

    /**
     * Sets the value of the idPrzesylka property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDPrzesylka(String value) {
        this.idPrzesylka = value;
    }

    /**
     * Gets the value of the numerNadawczy property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNumerNadawczy() {
        return numerNadawczy;
    }

    /**
     * Sets the value of the numerNadawczy property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNumerNadawczy(JAXBElement<String> value) {
        this.numerNadawczy = value;
    }

}

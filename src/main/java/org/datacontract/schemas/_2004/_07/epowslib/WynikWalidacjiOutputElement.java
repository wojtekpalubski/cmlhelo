
package org.datacontract.schemas._2004._07.epowslib;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WynikWalidacjiOutputElement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WynikWalidacjiOutputElement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="informacjaWalidacji" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="kodWalidacji" type="{http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes}KodWalidacji" minOccurs="0"/&gt;
 *         &lt;element name="liczbaPorzadkowa" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="opisWalidacji" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WynikWalidacjiOutputElement", propOrder = {
    "informacjaWalidacji",
    "kodWalidacji",
    "liczbaPorzadkowa",
    "opisWalidacji",
    "status"
})
@XmlSeeAlso({
    ImportEknWynikWalidacjiOutputElement.class,
    NadajEknWynikWalidacjiOutputElement.class
})
public class WynikWalidacjiOutputElement {

    @XmlElementRef(name = "informacjaWalidacji", namespace = "http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> informacjaWalidacji;
    @XmlSchemaType(name = "string")
    protected KodWalidacji kodWalidacji;
    protected Integer liczbaPorzadkowa;
    @XmlElementRef(name = "opisWalidacji", namespace = "http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> opisWalidacji;
    protected Boolean status;

    /**
     * Gets the value of the informacjaWalidacji property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInformacjaWalidacji() {
        return informacjaWalidacji;
    }

    /**
     * Sets the value of the informacjaWalidacji property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInformacjaWalidacji(JAXBElement<String> value) {
        this.informacjaWalidacji = value;
    }

    /**
     * Gets the value of the kodWalidacji property.
     * 
     * @return
     *     possible object is
     *     {@link KodWalidacji }
     *     
     */
    public KodWalidacji getKodWalidacji() {
        return kodWalidacji;
    }

    /**
     * Sets the value of the kodWalidacji property.
     * 
     * @param value
     *     allowed object is
     *     {@link KodWalidacji }
     *     
     */
    public void setKodWalidacji(KodWalidacji value) {
        this.kodWalidacji = value;
    }

    /**
     * Gets the value of the liczbaPorzadkowa property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLiczbaPorzadkowa() {
        return liczbaPorzadkowa;
    }

    /**
     * Sets the value of the liczbaPorzadkowa property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLiczbaPorzadkowa(Integer value) {
        this.liczbaPorzadkowa = value;
    }

    /**
     * Gets the value of the opisWalidacji property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOpisWalidacji() {
        return opisWalidacji;
    }

    /**
     * Sets the value of the opisWalidacji property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOpisWalidacji(JAXBElement<String> value) {
        this.opisWalidacji = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStatus(Boolean value) {
        this.status = value;
    }

}

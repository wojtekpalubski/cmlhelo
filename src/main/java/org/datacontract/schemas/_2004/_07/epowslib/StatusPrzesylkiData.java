
package org.datacontract.schemas._2004._07.epowslib;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatusPrzesylkiData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatusPrzesylkiData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GeneralShort" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IDStatusPrzesylki" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusPrzesylkiData", propOrder = {
    "description",
    "generalShort",
    "idStatusPrzesylki"
})
public class StatusPrzesylkiData {

    @XmlElementRef(name = "Description", namespace = "http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> description;
    @XmlElementRef(name = "GeneralShort", namespace = "http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> generalShort;
    @XmlElement(name = "IDStatusPrzesylki")
    protected Integer idStatusPrzesylki;

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDescription(JAXBElement<String> value) {
        this.description = value;
    }

    /**
     * Gets the value of the generalShort property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGeneralShort() {
        return generalShort;
    }

    /**
     * Sets the value of the generalShort property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGeneralShort(JAXBElement<String> value) {
        this.generalShort = value;
    }

    /**
     * Gets the value of the idStatusPrzesylki property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIDStatusPrzesylki() {
        return idStatusPrzesylki;
    }

    /**
     * Sets the value of the idStatusPrzesylki property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIDStatusPrzesylki(Integer value) {
        this.idStatusPrzesylki = value;
    }

}

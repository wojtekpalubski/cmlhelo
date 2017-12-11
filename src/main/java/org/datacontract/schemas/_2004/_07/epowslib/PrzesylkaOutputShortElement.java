
package org.datacontract.schemas._2004._07.epowslib;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for PrzesylkaOutputShortElement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PrzesylkaOutputShortElement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DateType" type="{http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes}HistoryActionDate" minOccurs="0"/&gt;
 *         &lt;element name="Guid" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/&gt;
 *         &lt;element name="IDHistoriaPrzesylki" type="{http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes}GuidOutputElement" minOccurs="0"/&gt;
 *         &lt;element name="IDPrzesylkaStatus" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="NumerNadania" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PlacowkaAwizo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="StatusDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PrzesylkaOutputShortElement", propOrder = {
    "dateType",
    "guid",
    "idHistoriaPrzesylki",
    "idPrzesylkaStatus",
    "numerNadania",
    "placowkaAwizo",
    "statusDate"
})
public class PrzesylkaOutputShortElement {

    @XmlElementRef(name = "DateType", namespace = "http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", type = JAXBElement.class, required = false)
    protected JAXBElement<HistoryActionDate> dateType;
    @XmlElement(name = "Guid")
    protected String guid;
    @XmlElementRef(name = "IDHistoriaPrzesylki", namespace = "http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", type = JAXBElement.class, required = false)
    protected JAXBElement<GuidOutputElement> idHistoriaPrzesylki;
    @XmlElement(name = "IDPrzesylkaStatus")
    protected Integer idPrzesylkaStatus;
    @XmlElementRef(name = "NumerNadania", namespace = "http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numerNadania;
    @XmlElementRef(name = "PlacowkaAwizo", namespace = "http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> placowkaAwizo;
    @XmlElementRef(name = "StatusDate", namespace = "http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> statusDate;

    /**
     * Gets the value of the dateType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link HistoryActionDate }{@code >}
     *     
     */
    public JAXBElement<HistoryActionDate> getDateType() {
        return dateType;
    }

    /**
     * Sets the value of the dateType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link HistoryActionDate }{@code >}
     *     
     */
    public void setDateType(JAXBElement<HistoryActionDate> value) {
        this.dateType = value;
    }

    /**
     * Gets the value of the guid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuid() {
        return guid;
    }

    /**
     * Sets the value of the guid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuid(String value) {
        this.guid = value;
    }

    /**
     * Gets the value of the idHistoriaPrzesylki property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GuidOutputElement }{@code >}
     *     
     */
    public JAXBElement<GuidOutputElement> getIDHistoriaPrzesylki() {
        return idHistoriaPrzesylki;
    }

    /**
     * Sets the value of the idHistoriaPrzesylki property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GuidOutputElement }{@code >}
     *     
     */
    public void setIDHistoriaPrzesylki(JAXBElement<GuidOutputElement> value) {
        this.idHistoriaPrzesylki = value;
    }

    /**
     * Gets the value of the idPrzesylkaStatus property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIDPrzesylkaStatus() {
        return idPrzesylkaStatus;
    }

    /**
     * Sets the value of the idPrzesylkaStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIDPrzesylkaStatus(Integer value) {
        this.idPrzesylkaStatus = value;
    }

    /**
     * Gets the value of the numerNadania property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNumerNadania() {
        return numerNadania;
    }

    /**
     * Sets the value of the numerNadania property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNumerNadania(JAXBElement<String> value) {
        this.numerNadania = value;
    }

    /**
     * Gets the value of the placowkaAwizo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPlacowkaAwizo() {
        return placowkaAwizo;
    }

    /**
     * Sets the value of the placowkaAwizo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPlacowkaAwizo(JAXBElement<String> value) {
        this.placowkaAwizo = value;
    }

    /**
     * Gets the value of the statusDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getStatusDate() {
        return statusDate;
    }

    /**
     * Sets the value of the statusDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setStatusDate(JAXBElement<XMLGregorianCalendar> value) {
        this.statusDate = value;
    }

}

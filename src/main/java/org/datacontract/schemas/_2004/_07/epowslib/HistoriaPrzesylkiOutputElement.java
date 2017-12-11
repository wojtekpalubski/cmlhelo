
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
 * <p>Java class for HistoriaPrzesylkiOutputElement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HistoriaPrzesylkiOutputElement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DateType" type="{http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes}HistoryActionDate" minOccurs="0"/&gt;
 *         &lt;element name="EntryDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="IDHistoriaPrzesylki" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/&gt;
 *         &lt;element name="KartaEPO" type="{http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes}KartaEPOData" minOccurs="0"/&gt;
 *         &lt;element name="PlacowkaAwizacyjna" type="{http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes}PlacowkaData" minOccurs="0"/&gt;
 *         &lt;element name="PlacowkaMacierzysta" type="{http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes}PlacowkaData" minOccurs="0"/&gt;
 *         &lt;element name="PlacowkaOperacji" type="{http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes}PlacowkaData" minOccurs="0"/&gt;
 *         &lt;element name="Przesylka" type="{http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes}PrzesylkaData" minOccurs="0"/&gt;
 *         &lt;element name="Status" type="{http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes}StatusPrzesylkiData" minOccurs="0"/&gt;
 *         &lt;element name="User" type="{http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes}UserData" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HistoriaPrzesylkiOutputElement", propOrder = {
    "dateType",
    "entryDate",
    "idHistoriaPrzesylki",
    "kartaEPO",
    "placowkaAwizacyjna",
    "placowkaMacierzysta",
    "placowkaOperacji",
    "przesylka",
    "status",
    "user"
})
public class HistoriaPrzesylkiOutputElement {

    @XmlElementRef(name = "DateType", namespace = "http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", type = JAXBElement.class, required = false)
    protected JAXBElement<HistoryActionDate> dateType;
    @XmlElement(name = "EntryDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar entryDate;
    @XmlElement(name = "IDHistoriaPrzesylki")
    protected String idHistoriaPrzesylki;
    @XmlElementRef(name = "KartaEPO", namespace = "http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", type = JAXBElement.class, required = false)
    protected JAXBElement<KartaEPOData> kartaEPO;
    @XmlElementRef(name = "PlacowkaAwizacyjna", namespace = "http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", type = JAXBElement.class, required = false)
    protected JAXBElement<PlacowkaData> placowkaAwizacyjna;
    @XmlElementRef(name = "PlacowkaMacierzysta", namespace = "http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", type = JAXBElement.class, required = false)
    protected JAXBElement<PlacowkaData> placowkaMacierzysta;
    @XmlElementRef(name = "PlacowkaOperacji", namespace = "http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", type = JAXBElement.class, required = false)
    protected JAXBElement<PlacowkaData> placowkaOperacji;
    @XmlElementRef(name = "Przesylka", namespace = "http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", type = JAXBElement.class, required = false)
    protected JAXBElement<PrzesylkaData> przesylka;
    @XmlElementRef(name = "Status", namespace = "http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", type = JAXBElement.class, required = false)
    protected JAXBElement<StatusPrzesylkiData> status;
    @XmlElementRef(name = "User", namespace = "http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", type = JAXBElement.class, required = false)
    protected JAXBElement<UserData> user;

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
     * Gets the value of the entryDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEntryDate() {
        return entryDate;
    }

    /**
     * Sets the value of the entryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEntryDate(XMLGregorianCalendar value) {
        this.entryDate = value;
    }

    /**
     * Gets the value of the idHistoriaPrzesylki property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDHistoriaPrzesylki() {
        return idHistoriaPrzesylki;
    }

    /**
     * Sets the value of the idHistoriaPrzesylki property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDHistoriaPrzesylki(String value) {
        this.idHistoriaPrzesylki = value;
    }

    /**
     * Gets the value of the kartaEPO property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link KartaEPOData }{@code >}
     *     
     */
    public JAXBElement<KartaEPOData> getKartaEPO() {
        return kartaEPO;
    }

    /**
     * Sets the value of the kartaEPO property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link KartaEPOData }{@code >}
     *     
     */
    public void setKartaEPO(JAXBElement<KartaEPOData> value) {
        this.kartaEPO = value;
    }

    /**
     * Gets the value of the placowkaAwizacyjna property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PlacowkaData }{@code >}
     *     
     */
    public JAXBElement<PlacowkaData> getPlacowkaAwizacyjna() {
        return placowkaAwizacyjna;
    }

    /**
     * Sets the value of the placowkaAwizacyjna property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PlacowkaData }{@code >}
     *     
     */
    public void setPlacowkaAwizacyjna(JAXBElement<PlacowkaData> value) {
        this.placowkaAwizacyjna = value;
    }

    /**
     * Gets the value of the placowkaMacierzysta property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PlacowkaData }{@code >}
     *     
     */
    public JAXBElement<PlacowkaData> getPlacowkaMacierzysta() {
        return placowkaMacierzysta;
    }

    /**
     * Sets the value of the placowkaMacierzysta property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PlacowkaData }{@code >}
     *     
     */
    public void setPlacowkaMacierzysta(JAXBElement<PlacowkaData> value) {
        this.placowkaMacierzysta = value;
    }

    /**
     * Gets the value of the placowkaOperacji property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PlacowkaData }{@code >}
     *     
     */
    public JAXBElement<PlacowkaData> getPlacowkaOperacji() {
        return placowkaOperacji;
    }

    /**
     * Sets the value of the placowkaOperacji property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PlacowkaData }{@code >}
     *     
     */
    public void setPlacowkaOperacji(JAXBElement<PlacowkaData> value) {
        this.placowkaOperacji = value;
    }

    /**
     * Gets the value of the przesylka property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PrzesylkaData }{@code >}
     *     
     */
    public JAXBElement<PrzesylkaData> getPrzesylka() {
        return przesylka;
    }

    /**
     * Sets the value of the przesylka property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PrzesylkaData }{@code >}
     *     
     */
    public void setPrzesylka(JAXBElement<PrzesylkaData> value) {
        this.przesylka = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StatusPrzesylkiData }{@code >}
     *     
     */
    public JAXBElement<StatusPrzesylkiData> getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StatusPrzesylkiData }{@code >}
     *     
     */
    public void setStatus(JAXBElement<StatusPrzesylkiData> value) {
        this.status = value;
    }

    /**
     * Gets the value of the user property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UserData }{@code >}
     *     
     */
    public JAXBElement<UserData> getUser() {
        return user;
    }

    /**
     * Sets the value of the user property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UserData }{@code >}
     *     
     */
    public void setUser(JAXBElement<UserData> value) {
        this.user = value;
    }

}


package org.datacontract.schemas._2004._07.epowslib;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.datacontract.schemas._2004._07.domain.GeneralPrzesylkaStatus;
import org.datacontract.schemas._2004._07.domain.StatusyPrzesylek;


/**
 * <p>Java class for PrzesylkaOutputElement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PrzesylkaOutputElement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AdresatNazwa1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AdresatNazwa2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CreationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="DataAwizo1" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="DataAwizo2" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="DataNadania" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="DataOdbioru" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="DataZwrotu" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="Dom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DoreczonoWOkienku" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="GeneralShortStatus" type="{http://schemas.datacontract.org/2004/07/Domain.Types}GeneralPrzesylkaStatus" minOccurs="0"/&gt;
 *         &lt;element name="GeneralStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Guid" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/&gt;
 *         &lt;element name="IDKartaEPO" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/&gt;
 *         &lt;element name="IDPrzesylka" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/&gt;
 *         &lt;element name="InnaPrzyczyna" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="InnyOdbiorca" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="KodPocztowy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Kraj" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Lokal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Miejscowosc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NumerDokumentu" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NumerNadania" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Pismo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PlacowkaAwizacyjna" type="{http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes}PlacowkaData" minOccurs="0"/&gt;
 *         &lt;element name="PlacowkaMacierzysta" type="{http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes}PlacowkaData" minOccurs="0"/&gt;
 *         &lt;element name="PlacowkaOperacji" type="{http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes}PlacowkaData" minOccurs="0"/&gt;
 *         &lt;element name="Rodzaj" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ShortStatus" type="{http://schemas.datacontract.org/2004/07/Domain.Types}StatusyPrzesylek" minOccurs="0"/&gt;
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="StatusDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="Sygnatura" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Ulica" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PrzesylkaOutputElement", propOrder = {
    "adresatNazwa1",
    "adresatNazwa2",
    "creationDate",
    "dataAwizo1",
    "dataAwizo2",
    "dataNadania",
    "dataOdbioru",
    "dataZwrotu",
    "dom",
    "doreczonoWOkienku",
    "generalShortStatus",
    "generalStatus",
    "guid",
    "idKartaEPO",
    "idPrzesylka",
    "innaPrzyczyna",
    "innyOdbiorca",
    "kodPocztowy",
    "kraj",
    "lokal",
    "miejscowosc",
    "numerDokumentu",
    "numerNadania",
    "pismo",
    "placowkaAwizacyjna",
    "placowkaMacierzysta",
    "placowkaOperacji",
    "rodzaj",
    "shortStatus",
    "status",
    "statusDate",
    "sygnatura",
    "ulica"
})
public class PrzesylkaOutputElement {

    @XmlElementRef(name = "AdresatNazwa1", namespace = "http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> adresatNazwa1;
    @XmlElementRef(name = "AdresatNazwa2", namespace = "http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> adresatNazwa2;
    @XmlElement(name = "CreationDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creationDate;
    @XmlElementRef(name = "DataAwizo1", namespace = "http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> dataAwizo1;
    @XmlElementRef(name = "DataAwizo2", namespace = "http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> dataAwizo2;
    @XmlElementRef(name = "DataNadania", namespace = "http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> dataNadania;
    @XmlElementRef(name = "DataOdbioru", namespace = "http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> dataOdbioru;
    @XmlElementRef(name = "DataZwrotu", namespace = "http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> dataZwrotu;
    @XmlElementRef(name = "Dom", namespace = "http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dom;
    @XmlElement(name = "DoreczonoWOkienku")
    protected Integer doreczonoWOkienku;
    @XmlElementRef(name = "GeneralShortStatus", namespace = "http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", type = JAXBElement.class, required = false)
    protected JAXBElement<GeneralPrzesylkaStatus> generalShortStatus;
    @XmlElementRef(name = "GeneralStatus", namespace = "http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> generalStatus;
    @XmlElement(name = "Guid")
    protected String guid;
    @XmlElementRef(name = "IDKartaEPO", namespace = "http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> idKartaEPO;
    @XmlElement(name = "IDPrzesylka")
    protected String idPrzesylka;
    @XmlElementRef(name = "InnaPrzyczyna", namespace = "http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> innaPrzyczyna;
    @XmlElementRef(name = "InnyOdbiorca", namespace = "http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> innyOdbiorca;
    @XmlElementRef(name = "KodPocztowy", namespace = "http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> kodPocztowy;
    @XmlElementRef(name = "Kraj", namespace = "http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> kraj;
    @XmlElementRef(name = "Lokal", namespace = "http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lokal;
    @XmlElementRef(name = "Miejscowosc", namespace = "http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> miejscowosc;
    @XmlElementRef(name = "NumerDokumentu", namespace = "http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numerDokumentu;
    @XmlElementRef(name = "NumerNadania", namespace = "http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numerNadania;
    @XmlElementRef(name = "Pismo", namespace = "http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pismo;
    @XmlElementRef(name = "PlacowkaAwizacyjna", namespace = "http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", type = JAXBElement.class, required = false)
    protected JAXBElement<PlacowkaData> placowkaAwizacyjna;
    @XmlElementRef(name = "PlacowkaMacierzysta", namespace = "http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", type = JAXBElement.class, required = false)
    protected JAXBElement<PlacowkaData> placowkaMacierzysta;
    @XmlElementRef(name = "PlacowkaOperacji", namespace = "http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", type = JAXBElement.class, required = false)
    protected JAXBElement<PlacowkaData> placowkaOperacji;
    @XmlElementRef(name = "Rodzaj", namespace = "http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> rodzaj;
    @XmlElement(name = "ShortStatus")
    @XmlSchemaType(name = "string")
    protected StatusyPrzesylek shortStatus;
    @XmlElementRef(name = "Status", namespace = "http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> status;
    @XmlElementRef(name = "StatusDate", namespace = "http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> statusDate;
    @XmlElementRef(name = "Sygnatura", namespace = "http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sygnatura;
    @XmlElementRef(name = "Ulica", namespace = "http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ulica;

    /**
     * Gets the value of the adresatNazwa1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAdresatNazwa1() {
        return adresatNazwa1;
    }

    /**
     * Sets the value of the adresatNazwa1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAdresatNazwa1(JAXBElement<String> value) {
        this.adresatNazwa1 = value;
    }

    /**
     * Gets the value of the adresatNazwa2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAdresatNazwa2() {
        return adresatNazwa2;
    }

    /**
     * Sets the value of the adresatNazwa2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAdresatNazwa2(JAXBElement<String> value) {
        this.adresatNazwa2 = value;
    }

    /**
     * Gets the value of the creationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreationDate() {
        return creationDate;
    }

    /**
     * Sets the value of the creationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreationDate(XMLGregorianCalendar value) {
        this.creationDate = value;
    }

    /**
     * Gets the value of the dataAwizo1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getDataAwizo1() {
        return dataAwizo1;
    }

    /**
     * Sets the value of the dataAwizo1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setDataAwizo1(JAXBElement<XMLGregorianCalendar> value) {
        this.dataAwizo1 = value;
    }

    /**
     * Gets the value of the dataAwizo2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getDataAwizo2() {
        return dataAwizo2;
    }

    /**
     * Sets the value of the dataAwizo2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setDataAwizo2(JAXBElement<XMLGregorianCalendar> value) {
        this.dataAwizo2 = value;
    }

    /**
     * Gets the value of the dataNadania property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getDataNadania() {
        return dataNadania;
    }

    /**
     * Sets the value of the dataNadania property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setDataNadania(JAXBElement<XMLGregorianCalendar> value) {
        this.dataNadania = value;
    }

    /**
     * Gets the value of the dataOdbioru property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getDataOdbioru() {
        return dataOdbioru;
    }

    /**
     * Sets the value of the dataOdbioru property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setDataOdbioru(JAXBElement<XMLGregorianCalendar> value) {
        this.dataOdbioru = value;
    }

    /**
     * Gets the value of the dataZwrotu property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getDataZwrotu() {
        return dataZwrotu;
    }

    /**
     * Sets the value of the dataZwrotu property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setDataZwrotu(JAXBElement<XMLGregorianCalendar> value) {
        this.dataZwrotu = value;
    }

    /**
     * Gets the value of the dom property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDom() {
        return dom;
    }

    /**
     * Sets the value of the dom property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDom(JAXBElement<String> value) {
        this.dom = value;
    }

    /**
     * Gets the value of the doreczonoWOkienku property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDoreczonoWOkienku() {
        return doreczonoWOkienku;
    }

    /**
     * Sets the value of the doreczonoWOkienku property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDoreczonoWOkienku(Integer value) {
        this.doreczonoWOkienku = value;
    }

    /**
     * Gets the value of the generalShortStatus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GeneralPrzesylkaStatus }{@code >}
     *     
     */
    public JAXBElement<GeneralPrzesylkaStatus> getGeneralShortStatus() {
        return generalShortStatus;
    }

    /**
     * Sets the value of the generalShortStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GeneralPrzesylkaStatus }{@code >}
     *     
     */
    public void setGeneralShortStatus(JAXBElement<GeneralPrzesylkaStatus> value) {
        this.generalShortStatus = value;
    }

    /**
     * Gets the value of the generalStatus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGeneralStatus() {
        return generalStatus;
    }

    /**
     * Sets the value of the generalStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGeneralStatus(JAXBElement<String> value) {
        this.generalStatus = value;
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
     * Gets the value of the idKartaEPO property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIDKartaEPO() {
        return idKartaEPO;
    }

    /**
     * Sets the value of the idKartaEPO property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIDKartaEPO(JAXBElement<String> value) {
        this.idKartaEPO = value;
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
     * Gets the value of the innaPrzyczyna property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInnaPrzyczyna() {
        return innaPrzyczyna;
    }

    /**
     * Sets the value of the innaPrzyczyna property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInnaPrzyczyna(JAXBElement<String> value) {
        this.innaPrzyczyna = value;
    }

    /**
     * Gets the value of the innyOdbiorca property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInnyOdbiorca() {
        return innyOdbiorca;
    }

    /**
     * Sets the value of the innyOdbiorca property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInnyOdbiorca(JAXBElement<String> value) {
        this.innyOdbiorca = value;
    }

    /**
     * Gets the value of the kodPocztowy property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getKodPocztowy() {
        return kodPocztowy;
    }

    /**
     * Sets the value of the kodPocztowy property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setKodPocztowy(JAXBElement<String> value) {
        this.kodPocztowy = value;
    }

    /**
     * Gets the value of the kraj property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getKraj() {
        return kraj;
    }

    /**
     * Sets the value of the kraj property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setKraj(JAXBElement<String> value) {
        this.kraj = value;
    }

    /**
     * Gets the value of the lokal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLokal() {
        return lokal;
    }

    /**
     * Sets the value of the lokal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLokal(JAXBElement<String> value) {
        this.lokal = value;
    }

    /**
     * Gets the value of the miejscowosc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMiejscowosc() {
        return miejscowosc;
    }

    /**
     * Sets the value of the miejscowosc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMiejscowosc(JAXBElement<String> value) {
        this.miejscowosc = value;
    }

    /**
     * Gets the value of the numerDokumentu property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNumerDokumentu() {
        return numerDokumentu;
    }

    /**
     * Sets the value of the numerDokumentu property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNumerDokumentu(JAXBElement<String> value) {
        this.numerDokumentu = value;
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
     * Gets the value of the pismo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPismo() {
        return pismo;
    }

    /**
     * Sets the value of the pismo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPismo(JAXBElement<String> value) {
        this.pismo = value;
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
     * Gets the value of the rodzaj property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRodzaj() {
        return rodzaj;
    }

    /**
     * Sets the value of the rodzaj property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRodzaj(JAXBElement<String> value) {
        this.rodzaj = value;
    }

    /**
     * Gets the value of the shortStatus property.
     * 
     * @return
     *     possible object is
     *     {@link StatusyPrzesylek }
     *     
     */
    public StatusyPrzesylek getShortStatus() {
        return shortStatus;
    }

    /**
     * Sets the value of the shortStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusyPrzesylek }
     *     
     */
    public void setShortStatus(StatusyPrzesylek value) {
        this.shortStatus = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStatus(JAXBElement<String> value) {
        this.status = value;
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

    /**
     * Gets the value of the sygnatura property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSygnatura() {
        return sygnatura;
    }

    /**
     * Sets the value of the sygnatura property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSygnatura(JAXBElement<String> value) {
        this.sygnatura = value;
    }

    /**
     * Gets the value of the ulica property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUlica() {
        return ulica;
    }

    /**
     * Sets the value of the ulica property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUlica(JAXBElement<String> value) {
        this.ulica = value;
    }

}

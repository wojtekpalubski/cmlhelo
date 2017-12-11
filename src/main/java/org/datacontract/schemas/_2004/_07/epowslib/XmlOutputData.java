
package org.datacontract.schemas._2004._07.epowslib;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for XmlOutputData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="XmlOutputData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes}OutputData"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="czyBlad" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="dokumentXmlBase64" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="identyfikatorDokumentu" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/&gt;
 *         &lt;element name="nazwaPliku" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="opisBledu" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="wielkoscNiespakowanegoPliku" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XmlOutputData", propOrder = {
    "czyBlad",
    "dokumentXmlBase64",
    "identyfikatorDokumentu",
    "nazwaPliku",
    "opisBledu",
    "wielkoscNiespakowanegoPliku"
})
public class XmlOutputData
    extends OutputData
{

    protected Boolean czyBlad;
    @XmlElementRef(name = "dokumentXmlBase64", namespace = "http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dokumentXmlBase64;
    protected String identyfikatorDokumentu;
    @XmlElementRef(name = "nazwaPliku", namespace = "http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nazwaPliku;
    @XmlElementRef(name = "opisBledu", namespace = "http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> opisBledu;
    protected Integer wielkoscNiespakowanegoPliku;

    /**
     * Gets the value of the czyBlad property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCzyBlad() {
        return czyBlad;
    }

    /**
     * Sets the value of the czyBlad property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCzyBlad(Boolean value) {
        this.czyBlad = value;
    }

    /**
     * Gets the value of the dokumentXmlBase64 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDokumentXmlBase64() {
        return dokumentXmlBase64;
    }

    /**
     * Sets the value of the dokumentXmlBase64 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDokumentXmlBase64(JAXBElement<String> value) {
        this.dokumentXmlBase64 = value;
    }

    /**
     * Gets the value of the identyfikatorDokumentu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentyfikatorDokumentu() {
        return identyfikatorDokumentu;
    }

    /**
     * Sets the value of the identyfikatorDokumentu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentyfikatorDokumentu(String value) {
        this.identyfikatorDokumentu = value;
    }

    /**
     * Gets the value of the nazwaPliku property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNazwaPliku() {
        return nazwaPliku;
    }

    /**
     * Sets the value of the nazwaPliku property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNazwaPliku(JAXBElement<String> value) {
        this.nazwaPliku = value;
    }

    /**
     * Gets the value of the opisBledu property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOpisBledu() {
        return opisBledu;
    }

    /**
     * Sets the value of the opisBledu property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOpisBledu(JAXBElement<String> value) {
        this.opisBledu = value;
    }

    /**
     * Gets the value of the wielkoscNiespakowanegoPliku property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getWielkoscNiespakowanegoPliku() {
        return wielkoscNiespakowanegoPliku;
    }

    /**
     * Sets the value of the wielkoscNiespakowanegoPliku property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setWielkoscNiespakowanegoPliku(Integer value) {
        this.wielkoscNiespakowanegoPliku = value;
    }

}

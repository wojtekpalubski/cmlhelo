
package org.datacontract.schemas._2004._07.epowslib;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatusPrzesylkiOutputData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatusPrzesylkiOutputData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes}PageOutputData"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="listaStatusPrzesylki" type="{http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes}ArrayOfStatusPrzesylkiOutputElement" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusPrzesylkiOutputData", propOrder = {
    "listaStatusPrzesylki"
})
public class StatusPrzesylkiOutputData
    extends PageOutputData
{

    @XmlElementRef(name = "listaStatusPrzesylki", namespace = "http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfStatusPrzesylkiOutputElement> listaStatusPrzesylki;

    /**
     * Gets the value of the listaStatusPrzesylki property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfStatusPrzesylkiOutputElement }{@code >}
     *     
     */
    public JAXBElement<ArrayOfStatusPrzesylkiOutputElement> getListaStatusPrzesylki() {
        return listaStatusPrzesylki;
    }

    /**
     * Sets the value of the listaStatusPrzesylki property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfStatusPrzesylkiOutputElement }{@code >}
     *     
     */
    public void setListaStatusPrzesylki(JAXBElement<ArrayOfStatusPrzesylkiOutputElement> value) {
        this.listaStatusPrzesylki = value;
    }

}

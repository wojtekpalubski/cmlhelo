
package org.datacontract.schemas._2004._07.epowslib;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HistoriaPrzesylkiOutputData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HistoriaPrzesylkiOutputData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes}PageOutputData"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="listaHistoriaPrzesylki" type="{http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes}ArrayOfHistoriaPrzesylkiOutputElement" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HistoriaPrzesylkiOutputData", propOrder = {
    "listaHistoriaPrzesylki"
})
public class HistoriaPrzesylkiOutputData
    extends PageOutputData
{

    @XmlElementRef(name = "listaHistoriaPrzesylki", namespace = "http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfHistoriaPrzesylkiOutputElement> listaHistoriaPrzesylki;

    /**
     * Gets the value of the listaHistoriaPrzesylki property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfHistoriaPrzesylkiOutputElement }{@code >}
     *     
     */
    public JAXBElement<ArrayOfHistoriaPrzesylkiOutputElement> getListaHistoriaPrzesylki() {
        return listaHistoriaPrzesylki;
    }

    /**
     * Sets the value of the listaHistoriaPrzesylki property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfHistoriaPrzesylkiOutputElement }{@code >}
     *     
     */
    public void setListaHistoriaPrzesylki(JAXBElement<ArrayOfHistoriaPrzesylkiOutputElement> value) {
        this.listaHistoriaPrzesylki = value;
    }

}

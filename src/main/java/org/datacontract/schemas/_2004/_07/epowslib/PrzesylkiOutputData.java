
package org.datacontract.schemas._2004._07.epowslib;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PrzesylkiOutputData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PrzesylkiOutputData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes}PageOutputData"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="listaPrzesylek" type="{http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes}ArrayOfPrzesylkaOutputElement" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PrzesylkiOutputData", propOrder = {
    "listaPrzesylek"
})
public class PrzesylkiOutputData
    extends PageOutputData
{

    @XmlElementRef(name = "listaPrzesylek", namespace = "http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfPrzesylkaOutputElement> listaPrzesylek;

    /**
     * Gets the value of the listaPrzesylek property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPrzesylkaOutputElement }{@code >}
     *     
     */
    public JAXBElement<ArrayOfPrzesylkaOutputElement> getListaPrzesylek() {
        return listaPrzesylek;
    }

    /**
     * Sets the value of the listaPrzesylek property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPrzesylkaOutputElement }{@code >}
     *     
     */
    public void setListaPrzesylek(JAXBElement<ArrayOfPrzesylkaOutputElement> value) {
        this.listaPrzesylek = value;
    }

}


package org.datacontract.schemas._2004._07.epowslib;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KodPocztowyOutputData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KodPocztowyOutputData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes}PageOutputData"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="listaKodowPocztowych" type="{http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes}KodPocztowyOutputElement" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KodPocztowyOutputData", propOrder = {
    "listaKodowPocztowych"
})
public class KodPocztowyOutputData
    extends PageOutputData
{

    @XmlElementRef(name = "listaKodowPocztowych", namespace = "http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", type = JAXBElement.class, required = false)
    protected JAXBElement<KodPocztowyOutputElement> listaKodowPocztowych;

    /**
     * Gets the value of the listaKodowPocztowych property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link KodPocztowyOutputElement }{@code >}
     *     
     */
    public JAXBElement<KodPocztowyOutputElement> getListaKodowPocztowych() {
        return listaKodowPocztowych;
    }

    /**
     * Sets the value of the listaKodowPocztowych property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link KodPocztowyOutputElement }{@code >}
     *     
     */
    public void setListaKodowPocztowych(JAXBElement<KodPocztowyOutputElement> value) {
        this.listaKodowPocztowych = value;
    }

}

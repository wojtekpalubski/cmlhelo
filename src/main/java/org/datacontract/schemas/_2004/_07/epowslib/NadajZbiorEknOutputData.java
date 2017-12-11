
package org.datacontract.schemas._2004._07.epowslib;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NadajZbiorEknOutputData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NadajZbiorEknOutputData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes}PageOutputData"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IDEknZbior" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/&gt;
 *         &lt;element name="IDXmlEknZbior" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/&gt;
 *         &lt;element name="wynikiWalidacji" type="{http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes}ArrayOfNadajEknWynikWalidacjiOutputElement" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NadajZbiorEknOutputData", propOrder = {
    "idEknZbior",
    "idXmlEknZbior",
    "wynikiWalidacji"
})
public class NadajZbiorEknOutputData
    extends PageOutputData
{

    @XmlElement(name = "IDEknZbior")
    protected String idEknZbior;
    @XmlElement(name = "IDXmlEknZbior")
    protected String idXmlEknZbior;
    @XmlElementRef(name = "wynikiWalidacji", namespace = "http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfNadajEknWynikWalidacjiOutputElement> wynikiWalidacji;

    /**
     * Gets the value of the idEknZbior property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDEknZbior() {
        return idEknZbior;
    }

    /**
     * Sets the value of the idEknZbior property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDEknZbior(String value) {
        this.idEknZbior = value;
    }

    /**
     * Gets the value of the idXmlEknZbior property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDXmlEknZbior() {
        return idXmlEknZbior;
    }

    /**
     * Sets the value of the idXmlEknZbior property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDXmlEknZbior(String value) {
        this.idXmlEknZbior = value;
    }

    /**
     * Gets the value of the wynikiWalidacji property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfNadajEknWynikWalidacjiOutputElement }{@code >}
     *     
     */
    public JAXBElement<ArrayOfNadajEknWynikWalidacjiOutputElement> getWynikiWalidacji() {
        return wynikiWalidacji;
    }

    /**
     * Sets the value of the wynikiWalidacji property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfNadajEknWynikWalidacjiOutputElement }{@code >}
     *     
     */
    public void setWynikiWalidacji(JAXBElement<ArrayOfNadajEknWynikWalidacjiOutputElement> value) {
        this.wynikiWalidacji = value;
    }

}


package pl.gov.ms.msepo;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.epowslib.XmlOutputData;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PobierzStatusyPrzesylekPoNumerachNadawczychXmlResult" type="{http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes}XmlOutputData" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "pobierzStatusyPrzesylekPoNumerachNadawczychXmlResult"
})
@XmlRootElement(name = "PobierzStatusyPrzesylekPoNumerachNadawczychXmlResponse")
public class PobierzStatusyPrzesylekPoNumerachNadawczychXmlResponse {

    @XmlElementRef(name = "PobierzStatusyPrzesylekPoNumerachNadawczychXmlResult", namespace = "http://ms.gov.pl/msepo", type = JAXBElement.class, required = false)
    protected JAXBElement<XmlOutputData> pobierzStatusyPrzesylekPoNumerachNadawczychXmlResult;

    /**
     * Gets the value of the pobierzStatusyPrzesylekPoNumerachNadawczychXmlResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XmlOutputData }{@code >}
     *     
     */
    public JAXBElement<XmlOutputData> getPobierzStatusyPrzesylekPoNumerachNadawczychXmlResult() {
        return pobierzStatusyPrzesylekPoNumerachNadawczychXmlResult;
    }

    /**
     * Sets the value of the pobierzStatusyPrzesylekPoNumerachNadawczychXmlResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XmlOutputData }{@code >}
     *     
     */
    public void setPobierzStatusyPrzesylekPoNumerachNadawczychXmlResult(JAXBElement<XmlOutputData> value) {
        this.pobierzStatusyPrzesylekPoNumerachNadawczychXmlResult = value;
    }

}


package pl.gov.ms.msepo;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.epowslib.ListaDoreczenPdfOutputData;


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
 *         &lt;element name="PobierzPdfPotwierdzeniaDoreczenPoNumerachNadawczychResult" type="{http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes}ListaDoreczenPdfOutputData" minOccurs="0"/&gt;
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
    "pobierzPdfPotwierdzeniaDoreczenPoNumerachNadawczychResult"
})
@XmlRootElement(name = "PobierzPdfPotwierdzeniaDoreczenPoNumerachNadawczychResponse")
public class PobierzPdfPotwierdzeniaDoreczenPoNumerachNadawczychResponse {

    @XmlElementRef(name = "PobierzPdfPotwierdzeniaDoreczenPoNumerachNadawczychResult", namespace = "http://ms.gov.pl/msepo", type = JAXBElement.class, required = false)
    protected JAXBElement<ListaDoreczenPdfOutputData> pobierzPdfPotwierdzeniaDoreczenPoNumerachNadawczychResult;

    /**
     * Gets the value of the pobierzPdfPotwierdzeniaDoreczenPoNumerachNadawczychResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ListaDoreczenPdfOutputData }{@code >}
     *     
     */
    public JAXBElement<ListaDoreczenPdfOutputData> getPobierzPdfPotwierdzeniaDoreczenPoNumerachNadawczychResult() {
        return pobierzPdfPotwierdzeniaDoreczenPoNumerachNadawczychResult;
    }

    /**
     * Sets the value of the pobierzPdfPotwierdzeniaDoreczenPoNumerachNadawczychResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ListaDoreczenPdfOutputData }{@code >}
     *     
     */
    public void setPobierzPdfPotwierdzeniaDoreczenPoNumerachNadawczychResult(JAXBElement<ListaDoreczenPdfOutputData> value) {
        this.pobierzPdfPotwierdzeniaDoreczenPoNumerachNadawczychResult = value;
    }

}

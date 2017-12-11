
package pl.gov.ms.msepo;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.epowslib.NadajZbiorEknOutputData;


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
 *         &lt;element name="NadanieZbioruEknResult" type="{http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes}NadajZbiorEknOutputData" minOccurs="0"/&gt;
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
    "nadanieZbioruEknResult"
})
@XmlRootElement(name = "NadanieZbioruEknResponse")
public class NadanieZbioruEknResponse {

    @XmlElementRef(name = "NadanieZbioruEknResult", namespace = "http://ms.gov.pl/msepo", type = JAXBElement.class, required = false)
    protected JAXBElement<NadajZbiorEknOutputData> nadanieZbioruEknResult;

    /**
     * Gets the value of the nadanieZbioruEknResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NadajZbiorEknOutputData }{@code >}
     *     
     */
    public JAXBElement<NadajZbiorEknOutputData> getNadanieZbioruEknResult() {
        return nadanieZbioruEknResult;
    }

    /**
     * Sets the value of the nadanieZbioruEknResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NadajZbiorEknOutputData }{@code >}
     *     
     */
    public void setNadanieZbioruEknResult(JAXBElement<NadajZbiorEknOutputData> value) {
        this.nadanieZbioruEknResult = value;
    }

}

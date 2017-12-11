
package pl.gov.ms.msepo;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.epowslib.KodPocztowyOutputData;


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
 *         &lt;element name="PobierzKodyPocztoweResult" type="{http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes}KodPocztowyOutputData" minOccurs="0"/&gt;
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
    "pobierzKodyPocztoweResult"
})
@XmlRootElement(name = "PobierzKodyPocztoweResponse")
public class PobierzKodyPocztoweResponse {

    @XmlElementRef(name = "PobierzKodyPocztoweResult", namespace = "http://ms.gov.pl/msepo", type = JAXBElement.class, required = false)
    protected JAXBElement<KodPocztowyOutputData> pobierzKodyPocztoweResult;

    /**
     * Gets the value of the pobierzKodyPocztoweResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link KodPocztowyOutputData }{@code >}
     *     
     */
    public JAXBElement<KodPocztowyOutputData> getPobierzKodyPocztoweResult() {
        return pobierzKodyPocztoweResult;
    }

    /**
     * Sets the value of the pobierzKodyPocztoweResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link KodPocztowyOutputData }{@code >}
     *     
     */
    public void setPobierzKodyPocztoweResult(JAXBElement<KodPocztowyOutputData> value) {
        this.pobierzKodyPocztoweResult = value;
    }

}

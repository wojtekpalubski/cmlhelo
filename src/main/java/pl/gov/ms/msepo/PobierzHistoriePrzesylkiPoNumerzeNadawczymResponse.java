
package pl.gov.ms.msepo;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.epowslib.HistoriaPrzesylkiOutputData;


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
 *         &lt;element name="PobierzHistoriePrzesylkiPoNumerzeNadawczymResult" type="{http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes}HistoriaPrzesylkiOutputData" minOccurs="0"/&gt;
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
    "pobierzHistoriePrzesylkiPoNumerzeNadawczymResult"
})
@XmlRootElement(name = "PobierzHistoriePrzesylkiPoNumerzeNadawczymResponse")
public class PobierzHistoriePrzesylkiPoNumerzeNadawczymResponse {

    @XmlElementRef(name = "PobierzHistoriePrzesylkiPoNumerzeNadawczymResult", namespace = "http://ms.gov.pl/msepo", type = JAXBElement.class, required = false)
    protected JAXBElement<HistoriaPrzesylkiOutputData> pobierzHistoriePrzesylkiPoNumerzeNadawczymResult;

    /**
     * Gets the value of the pobierzHistoriePrzesylkiPoNumerzeNadawczymResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link HistoriaPrzesylkiOutputData }{@code >}
     *     
     */
    public JAXBElement<HistoriaPrzesylkiOutputData> getPobierzHistoriePrzesylkiPoNumerzeNadawczymResult() {
        return pobierzHistoriePrzesylkiPoNumerzeNadawczymResult;
    }

    /**
     * Sets the value of the pobierzHistoriePrzesylkiPoNumerzeNadawczymResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link HistoriaPrzesylkiOutputData }{@code >}
     *     
     */
    public void setPobierzHistoriePrzesylkiPoNumerzeNadawczymResult(JAXBElement<HistoriaPrzesylkiOutputData> value) {
        this.pobierzHistoriePrzesylkiPoNumerzeNadawczymResult = value;
    }

}

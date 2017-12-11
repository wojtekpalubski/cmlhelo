
package org.datacontract.schemas._2004._07.epowslib;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KartaEPOData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KartaEPOData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IDKartaEPO" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/&gt;
 *         &lt;element name="Numer" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KartaEPOData", propOrder = {
    "idKartaEPO",
    "numer"
})
public class KartaEPOData {

    @XmlElement(name = "IDKartaEPO")
    protected String idKartaEPO;
    @XmlElement(name = "Numer")
    protected Integer numer;

    /**
     * Gets the value of the idKartaEPO property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDKartaEPO() {
        return idKartaEPO;
    }

    /**
     * Sets the value of the idKartaEPO property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDKartaEPO(String value) {
        this.idKartaEPO = value;
    }

    /**
     * Gets the value of the numer property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumer() {
        return numer;
    }

    /**
     * Sets the value of the numer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumer(Integer value) {
        this.numer = value;
    }

}

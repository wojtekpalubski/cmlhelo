
package org.datacontract.schemas._2004._07.epowslib;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PageOutputData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PageOutputData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes}OutputData"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="iloscStron" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="liczbaWszystkichElementow" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="numerStrony" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="wielkoscStrony" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PageOutputData", propOrder = {
    "iloscStron",
    "liczbaWszystkichElementow",
    "numerStrony",
    "wielkoscStrony"
})
@XmlSeeAlso({
    PrzesylkiOutputData.class,
    PrzesylkiOutputShortData.class,
    GuidOutputData.class,
    NumerNadawczyOutputData.class,
    HistoriaPrzesylkiOutputData.class,
    HistoriaPrzesylkiOutputDataExtend.class,
    ImportZbiorEknOutputData.class,
    NadajZbiorEknOutputData.class,
    KodPocztowyOutputData.class,
    StatusPrzesylkiOutputData.class
})
public class PageOutputData
    extends OutputData
{

    protected Integer iloscStron;
    protected Integer liczbaWszystkichElementow;
    protected Integer numerStrony;
    protected Integer wielkoscStrony;

    /**
     * Gets the value of the iloscStron property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIloscStron() {
        return iloscStron;
    }

    /**
     * Sets the value of the iloscStron property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIloscStron(Integer value) {
        this.iloscStron = value;
    }

    /**
     * Gets the value of the liczbaWszystkichElementow property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLiczbaWszystkichElementow() {
        return liczbaWszystkichElementow;
    }

    /**
     * Sets the value of the liczbaWszystkichElementow property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLiczbaWszystkichElementow(Integer value) {
        this.liczbaWszystkichElementow = value;
    }

    /**
     * Gets the value of the numerStrony property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumerStrony() {
        return numerStrony;
    }

    /**
     * Sets the value of the numerStrony property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumerStrony(Integer value) {
        this.numerStrony = value;
    }

    /**
     * Gets the value of the wielkoscStrony property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getWielkoscStrony() {
        return wielkoscStrony;
    }

    /**
     * Sets the value of the wielkoscStrony property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setWielkoscStrony(Integer value) {
        this.wielkoscStrony = value;
    }

}

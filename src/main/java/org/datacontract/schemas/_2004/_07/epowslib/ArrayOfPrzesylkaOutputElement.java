
package org.datacontract.schemas._2004._07.epowslib;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfPrzesylkaOutputElement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfPrzesylkaOutputElement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PrzesylkaOutputElement" type="{http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes}PrzesylkaOutputElement" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPrzesylkaOutputElement", propOrder = {
    "przesylkaOutputElement"
})
public class ArrayOfPrzesylkaOutputElement {

    @XmlElement(name = "PrzesylkaOutputElement", nillable = true)
    protected List<PrzesylkaOutputElement> przesylkaOutputElement;

    /**
     * Gets the value of the przesylkaOutputElement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the przesylkaOutputElement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrzesylkaOutputElement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PrzesylkaOutputElement }
     * 
     * 
     */
    public List<PrzesylkaOutputElement> getPrzesylkaOutputElement() {
        if (przesylkaOutputElement == null) {
            przesylkaOutputElement = new ArrayList<PrzesylkaOutputElement>();
        }
        return this.przesylkaOutputElement;
    }

}

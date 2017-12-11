
package org.datacontract.schemas._2004._07.epowslib;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfStatusPrzesylkiOutputElement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfStatusPrzesylkiOutputElement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="StatusPrzesylkiOutputElement" type="{http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes}StatusPrzesylkiOutputElement" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfStatusPrzesylkiOutputElement", propOrder = {
    "statusPrzesylkiOutputElement"
})
public class ArrayOfStatusPrzesylkiOutputElement {

    @XmlElement(name = "StatusPrzesylkiOutputElement", nillable = true)
    protected List<StatusPrzesylkiOutputElement> statusPrzesylkiOutputElement;

    /**
     * Gets the value of the statusPrzesylkiOutputElement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the statusPrzesylkiOutputElement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStatusPrzesylkiOutputElement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StatusPrzesylkiOutputElement }
     * 
     * 
     */
    public List<StatusPrzesylkiOutputElement> getStatusPrzesylkiOutputElement() {
        if (statusPrzesylkiOutputElement == null) {
            statusPrzesylkiOutputElement = new ArrayList<StatusPrzesylkiOutputElement>();
        }
        return this.statusPrzesylkiOutputElement;
    }

}

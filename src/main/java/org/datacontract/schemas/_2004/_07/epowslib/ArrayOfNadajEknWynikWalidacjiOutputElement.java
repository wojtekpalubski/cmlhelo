
package org.datacontract.schemas._2004._07.epowslib;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfNadajEknWynikWalidacjiOutputElement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfNadajEknWynikWalidacjiOutputElement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NadajEknWynikWalidacjiOutputElement" type="{http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes}NadajEknWynikWalidacjiOutputElement" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfNadajEknWynikWalidacjiOutputElement", propOrder = {
    "nadajEknWynikWalidacjiOutputElement"
})
public class ArrayOfNadajEknWynikWalidacjiOutputElement {

    @XmlElement(name = "NadajEknWynikWalidacjiOutputElement", nillable = true)
    protected List<NadajEknWynikWalidacjiOutputElement> nadajEknWynikWalidacjiOutputElement;

    /**
     * Gets the value of the nadajEknWynikWalidacjiOutputElement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nadajEknWynikWalidacjiOutputElement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNadajEknWynikWalidacjiOutputElement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NadajEknWynikWalidacjiOutputElement }
     * 
     * 
     */
    public List<NadajEknWynikWalidacjiOutputElement> getNadajEknWynikWalidacjiOutputElement() {
        if (nadajEknWynikWalidacjiOutputElement == null) {
            nadajEknWynikWalidacjiOutputElement = new ArrayList<NadajEknWynikWalidacjiOutputElement>();
        }
        return this.nadajEknWynikWalidacjiOutputElement;
    }

}

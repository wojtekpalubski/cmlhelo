
package org.datacontract.schemas._2004._07.domain;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.datacontract.schemas._2004._07.domain package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GeneralPrzesylkaStatus_QNAME = new QName("http://schemas.datacontract.org/2004/07/Domain.Types", "GeneralPrzesylkaStatus");
    private final static QName _StatusyPrzesylek_QNAME = new QName("http://schemas.datacontract.org/2004/07/Domain.Types", "StatusyPrzesylek");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.datacontract.schemas._2004._07.domain
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GeneralPrzesylkaStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Domain.Types", name = "GeneralPrzesylkaStatus")
    public JAXBElement<GeneralPrzesylkaStatus> createGeneralPrzesylkaStatus(GeneralPrzesylkaStatus value) {
        return new JAXBElement<GeneralPrzesylkaStatus>(_GeneralPrzesylkaStatus_QNAME, GeneralPrzesylkaStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StatusyPrzesylek }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Domain.Types", name = "StatusyPrzesylek")
    public JAXBElement<StatusyPrzesylek> createStatusyPrzesylek(StatusyPrzesylek value) {
        return new JAXBElement<StatusyPrzesylek>(_StatusyPrzesylek_QNAME, StatusyPrzesylek.class, null, value);
    }

}

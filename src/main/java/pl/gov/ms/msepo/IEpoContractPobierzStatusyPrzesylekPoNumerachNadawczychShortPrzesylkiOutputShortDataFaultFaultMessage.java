
package pl.gov.ms.msepo;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.0.6
 * 2017-12-11T12:55:36.969+01:00
 * Generated source version: 3.0.6
 */

@WebFault(name = "PrzesylkiOutputShortData", targetNamespace = "http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes")
public class IEpoContractPobierzStatusyPrzesylekPoNumerachNadawczychShortPrzesylkiOutputShortDataFaultFaultMessage extends Exception {
    
    private org.datacontract.schemas._2004._07.epowslib.PrzesylkiOutputShortData przesylkiOutputShortData;

    public IEpoContractPobierzStatusyPrzesylekPoNumerachNadawczychShortPrzesylkiOutputShortDataFaultFaultMessage() {
        super();
    }
    
    public IEpoContractPobierzStatusyPrzesylekPoNumerachNadawczychShortPrzesylkiOutputShortDataFaultFaultMessage(String message) {
        super(message);
    }
    
    public IEpoContractPobierzStatusyPrzesylekPoNumerachNadawczychShortPrzesylkiOutputShortDataFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public IEpoContractPobierzStatusyPrzesylekPoNumerachNadawczychShortPrzesylkiOutputShortDataFaultFaultMessage(String message, org.datacontract.schemas._2004._07.epowslib.PrzesylkiOutputShortData przesylkiOutputShortData) {
        super(message);
        this.przesylkiOutputShortData = przesylkiOutputShortData;
    }

    public IEpoContractPobierzStatusyPrzesylekPoNumerachNadawczychShortPrzesylkiOutputShortDataFaultFaultMessage(String message, org.datacontract.schemas._2004._07.epowslib.PrzesylkiOutputShortData przesylkiOutputShortData, Throwable cause) {
        super(message, cause);
        this.przesylkiOutputShortData = przesylkiOutputShortData;
    }

    public org.datacontract.schemas._2004._07.epowslib.PrzesylkiOutputShortData getFaultInfo() {
        return this.przesylkiOutputShortData;
    }
}


package pl.gov.ms.msepo;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.0.6
 * 2017-12-11T12:55:36.844+01:00
 * Generated source version: 3.0.6
 */

@WebFault(name = "StatusPrzesylkiOutputData", targetNamespace = "http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes")
public class IEpoContractPobierzListeStatusowPrzesylekStatusPrzesylkiOutputDataFaultFaultMessage extends Exception {
    
    private org.datacontract.schemas._2004._07.epowslib.StatusPrzesylkiOutputData statusPrzesylkiOutputData;

    public IEpoContractPobierzListeStatusowPrzesylekStatusPrzesylkiOutputDataFaultFaultMessage() {
        super();
    }
    
    public IEpoContractPobierzListeStatusowPrzesylekStatusPrzesylkiOutputDataFaultFaultMessage(String message) {
        super(message);
    }
    
    public IEpoContractPobierzListeStatusowPrzesylekStatusPrzesylkiOutputDataFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public IEpoContractPobierzListeStatusowPrzesylekStatusPrzesylkiOutputDataFaultFaultMessage(String message, org.datacontract.schemas._2004._07.epowslib.StatusPrzesylkiOutputData statusPrzesylkiOutputData) {
        super(message);
        this.statusPrzesylkiOutputData = statusPrzesylkiOutputData;
    }

    public IEpoContractPobierzListeStatusowPrzesylekStatusPrzesylkiOutputDataFaultFaultMessage(String message, org.datacontract.schemas._2004._07.epowslib.StatusPrzesylkiOutputData statusPrzesylkiOutputData, Throwable cause) {
        super(message, cause);
        this.statusPrzesylkiOutputData = statusPrzesylkiOutputData;
    }

    public org.datacontract.schemas._2004._07.epowslib.StatusPrzesylkiOutputData getFaultInfo() {
        return this.statusPrzesylkiOutputData;
    }
}
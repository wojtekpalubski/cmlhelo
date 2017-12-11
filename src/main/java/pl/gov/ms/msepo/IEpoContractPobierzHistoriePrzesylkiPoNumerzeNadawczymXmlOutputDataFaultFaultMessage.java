
package pl.gov.ms.msepo;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.0.6
 * 2017-12-11T12:55:37.032+01:00
 * Generated source version: 3.0.6
 */

@WebFault(name = "OutputData", targetNamespace = "http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes")
public class IEpoContractPobierzHistoriePrzesylkiPoNumerzeNadawczymXmlOutputDataFaultFaultMessage extends Exception {
    
    private org.datacontract.schemas._2004._07.epowslib.OutputData outputData;

    public IEpoContractPobierzHistoriePrzesylkiPoNumerzeNadawczymXmlOutputDataFaultFaultMessage() {
        super();
    }
    
    public IEpoContractPobierzHistoriePrzesylkiPoNumerzeNadawczymXmlOutputDataFaultFaultMessage(String message) {
        super(message);
    }
    
    public IEpoContractPobierzHistoriePrzesylkiPoNumerzeNadawczymXmlOutputDataFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public IEpoContractPobierzHistoriePrzesylkiPoNumerzeNadawczymXmlOutputDataFaultFaultMessage(String message, org.datacontract.schemas._2004._07.epowslib.OutputData outputData) {
        super(message);
        this.outputData = outputData;
    }

    public IEpoContractPobierzHistoriePrzesylkiPoNumerzeNadawczymXmlOutputDataFaultFaultMessage(String message, org.datacontract.schemas._2004._07.epowslib.OutputData outputData, Throwable cause) {
        super(message, cause);
        this.outputData = outputData;
    }

    public org.datacontract.schemas._2004._07.epowslib.OutputData getFaultInfo() {
        return this.outputData;
    }
}
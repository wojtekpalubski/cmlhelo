
package pl.gov.ms.msepo;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.0.6
 * 2017-12-11T12:55:36.954+01:00
 * Generated source version: 3.0.6
 */

@WebFault(name = "KodPocztowyOutputData", targetNamespace = "http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes")
public class IEpoContractPobierzKodyPocztoweKodPocztowyOutputDataFaultFaultMessage extends Exception {
    
    private org.datacontract.schemas._2004._07.epowslib.KodPocztowyOutputData kodPocztowyOutputData;

    public IEpoContractPobierzKodyPocztoweKodPocztowyOutputDataFaultFaultMessage() {
        super();
    }
    
    public IEpoContractPobierzKodyPocztoweKodPocztowyOutputDataFaultFaultMessage(String message) {
        super(message);
    }
    
    public IEpoContractPobierzKodyPocztoweKodPocztowyOutputDataFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public IEpoContractPobierzKodyPocztoweKodPocztowyOutputDataFaultFaultMessage(String message, org.datacontract.schemas._2004._07.epowslib.KodPocztowyOutputData kodPocztowyOutputData) {
        super(message);
        this.kodPocztowyOutputData = kodPocztowyOutputData;
    }

    public IEpoContractPobierzKodyPocztoweKodPocztowyOutputDataFaultFaultMessage(String message, org.datacontract.schemas._2004._07.epowslib.KodPocztowyOutputData kodPocztowyOutputData, Throwable cause) {
        super(message, cause);
        this.kodPocztowyOutputData = kodPocztowyOutputData;
    }

    public org.datacontract.schemas._2004._07.epowslib.KodPocztowyOutputData getFaultInfo() {
        return this.kodPocztowyOutputData;
    }
}


package pl.gov.ms.msepo;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.0.6
 * 2017-12-11T12:55:36.735+01:00
 * Generated source version: 3.0.6
 */

@WebFault(name = "ImportZbiorEknOutputData", targetNamespace = "http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes")
public class IEpoContractImportZbioruEknImportZbiorEknOutputDataFaultFaultMessage extends Exception {
    
    private org.datacontract.schemas._2004._07.epowslib.ImportZbiorEknOutputData importZbiorEknOutputData;

    public IEpoContractImportZbioruEknImportZbiorEknOutputDataFaultFaultMessage() {
        super();
    }
    
    public IEpoContractImportZbioruEknImportZbiorEknOutputDataFaultFaultMessage(String message) {
        super(message);
    }
    
    public IEpoContractImportZbioruEknImportZbiorEknOutputDataFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public IEpoContractImportZbioruEknImportZbiorEknOutputDataFaultFaultMessage(String message, org.datacontract.schemas._2004._07.epowslib.ImportZbiorEknOutputData importZbiorEknOutputData) {
        super(message);
        this.importZbiorEknOutputData = importZbiorEknOutputData;
    }

    public IEpoContractImportZbioruEknImportZbiorEknOutputDataFaultFaultMessage(String message, org.datacontract.schemas._2004._07.epowslib.ImportZbiorEknOutputData importZbiorEknOutputData, Throwable cause) {
        super(message, cause);
        this.importZbiorEknOutputData = importZbiorEknOutputData;
    }

    public org.datacontract.schemas._2004._07.epowslib.ImportZbiorEknOutputData getFaultInfo() {
        return this.importZbiorEknOutputData;
    }
}

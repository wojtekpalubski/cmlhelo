
package pl.gov.ms.msepo;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.0.6
 * 2017-12-11T12:55:36.766+01:00
 * Generated source version: 3.0.6
 */

@WebFault(name = "ImportZbiorEknOutputData", targetNamespace = "http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes")
public class IEpoContractImportZbioruEknZipImportZbiorEknOutputDataFaultFaultMessage extends Exception {
    
    private org.datacontract.schemas._2004._07.epowslib.ImportZbiorEknOutputData importZbiorEknOutputData;

    public IEpoContractImportZbioruEknZipImportZbiorEknOutputDataFaultFaultMessage() {
        super();
    }
    
    public IEpoContractImportZbioruEknZipImportZbiorEknOutputDataFaultFaultMessage(String message) {
        super(message);
    }
    
    public IEpoContractImportZbioruEknZipImportZbiorEknOutputDataFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public IEpoContractImportZbioruEknZipImportZbiorEknOutputDataFaultFaultMessage(String message, org.datacontract.schemas._2004._07.epowslib.ImportZbiorEknOutputData importZbiorEknOutputData) {
        super(message);
        this.importZbiorEknOutputData = importZbiorEknOutputData;
    }

    public IEpoContractImportZbioruEknZipImportZbiorEknOutputDataFaultFaultMessage(String message, org.datacontract.schemas._2004._07.epowslib.ImportZbiorEknOutputData importZbiorEknOutputData, Throwable cause) {
        super(message, cause);
        this.importZbiorEknOutputData = importZbiorEknOutputData;
    }

    public org.datacontract.schemas._2004._07.epowslib.ImportZbiorEknOutputData getFaultInfo() {
        return this.importZbiorEknOutputData;
    }
}

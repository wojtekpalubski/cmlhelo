
package pl.gov.ms.msepo;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.0.6
 * 2017-12-11T12:55:36.844+01:00
 * Generated source version: 3.0.6
 */

@WebFault(name = "NadajZbiorEknOutputData", targetNamespace = "http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes")
public class IEpoContractNadanieZbioruEknZipNadajZbiorEknOutputDataFaultFaultMessage extends Exception {
    
    private org.datacontract.schemas._2004._07.epowslib.NadajZbiorEknOutputData nadajZbiorEknOutputData;

    public IEpoContractNadanieZbioruEknZipNadajZbiorEknOutputDataFaultFaultMessage() {
        super();
    }
    
    public IEpoContractNadanieZbioruEknZipNadajZbiorEknOutputDataFaultFaultMessage(String message) {
        super(message);
    }
    
    public IEpoContractNadanieZbioruEknZipNadajZbiorEknOutputDataFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public IEpoContractNadanieZbioruEknZipNadajZbiorEknOutputDataFaultFaultMessage(String message, org.datacontract.schemas._2004._07.epowslib.NadajZbiorEknOutputData nadajZbiorEknOutputData) {
        super(message);
        this.nadajZbiorEknOutputData = nadajZbiorEknOutputData;
    }

    public IEpoContractNadanieZbioruEknZipNadajZbiorEknOutputDataFaultFaultMessage(String message, org.datacontract.schemas._2004._07.epowslib.NadajZbiorEknOutputData nadajZbiorEknOutputData, Throwable cause) {
        super(message, cause);
        this.nadajZbiorEknOutputData = nadajZbiorEknOutputData;
    }

    public org.datacontract.schemas._2004._07.epowslib.NadajZbiorEknOutputData getFaultInfo() {
        return this.nadajZbiorEknOutputData;
    }
}

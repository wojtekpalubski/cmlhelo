
package pl.gov.ms.msepo;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringstring;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfguid;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring;
import org.datacontract.schemas._2004._07.epowslib.ApiOutputData;
import org.datacontract.schemas._2004._07.epowslib.GuidOutputData;
import org.datacontract.schemas._2004._07.epowslib.HistoriaPrzesylkiOutputData;
import org.datacontract.schemas._2004._07.epowslib.HistoriaPrzesylkiOutputDataExtend;
import org.datacontract.schemas._2004._07.epowslib.ImportZbiorEknOutputData;
import org.datacontract.schemas._2004._07.epowslib.KodPocztowyOutputData;
import org.datacontract.schemas._2004._07.epowslib.ListaDoreczenPdfOutputData;
import org.datacontract.schemas._2004._07.epowslib.NadajZbiorEknOutputData;
import org.datacontract.schemas._2004._07.epowslib.NumerNadawczyOutputData;
import org.datacontract.schemas._2004._07.epowslib.PrzesylkiOutputData;
import org.datacontract.schemas._2004._07.epowslib.PrzesylkiOutputShortData;
import org.datacontract.schemas._2004._07.epowslib.StatusPrzesylkiOutputData;
import org.datacontract.schemas._2004._07.epowslib.XmlOutputData;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the pl.gov.ms.msepo package. 
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

    private final static QName _PobierzStatusyPrzesylekPoNumerachNadawczychUserName_QNAME = new QName("http://ms.gov.pl/msepo", "userName");
    private final static QName _PobierzStatusyPrzesylekPoNumerachNadawczychPassword_QNAME = new QName("http://ms.gov.pl/msepo", "password");
    private final static QName _PobierzStatusyPrzesylekPoNumerachNadawczychApiKey_QNAME = new QName("http://ms.gov.pl/msepo", "apiKey");
    private final static QName _PobierzStatusyPrzesylekPoNumerachNadawczychNumeryNadawcze_QNAME = new QName("http://ms.gov.pl/msepo", "numeryNadawcze");
    private final static QName _PobierzStatusyPrzesylekPoNumerachNadawczychResponsePobierzStatusyPrzesylekPoNumerachNadawczychResult_QNAME = new QName("http://ms.gov.pl/msepo", "PobierzStatusyPrzesylekPoNumerachNadawczychResult");
    private final static QName _PobierzStatusyPrzesylekPoNumerachNadawczychShortResponsePobierzStatusyPrzesylekPoNumerachNadawczychShortResult_QNAME = new QName("http://ms.gov.pl/msepo", "PobierzStatusyPrzesylekPoNumerachNadawczychShortResult");
    private final static QName _PobierzStatusyPrzesylekPoGuidachGuidPrzesylki_QNAME = new QName("http://ms.gov.pl/msepo", "guidPrzesylki");
    private final static QName _PobierzStatusyPrzesylekPoGuidachResponsePobierzStatusyPrzesylekPoGuidachResult_QNAME = new QName("http://ms.gov.pl/msepo", "PobierzStatusyPrzesylekPoGuidachResult");
    private final static QName _PobierzStatusyPrzesylekPoGuidachShortResponsePobierzStatusyPrzesylekPoGuidachShortResult_QNAME = new QName("http://ms.gov.pl/msepo", "PobierzStatusyPrzesylekPoGuidachShortResult");
    private final static QName _PobierzStatusyPrzesylekZaOkresDataDo_QNAME = new QName("http://ms.gov.pl/msepo", "dataDo");
    private final static QName _PobierzStatusyPrzesylekZaOkresResponsePobierzStatusyPrzesylekZaOkresResult_QNAME = new QName("http://ms.gov.pl/msepo", "PobierzStatusyPrzesylekZaOkresResult");
    private final static QName _PobierzGuidyPrzesylekZaOkresResponsePobierzGuidyPrzesylekZaOkresResult_QNAME = new QName("http://ms.gov.pl/msepo", "PobierzGuidyPrzesylekZaOkresResult");
    private final static QName _PobierzNumeryNadawczePrzesylekZaOkresResponsePobierzNumeryNadawczePrzesylekZaOkresResult_QNAME = new QName("http://ms.gov.pl/msepo", "PobierzNumeryNadawczePrzesylekZaOkresResult");
    private final static QName _PobierzStatusyPrzesylekSortColumn_QNAME = new QName("http://ms.gov.pl/msepo", "sortColumn");
    private final static QName _PobierzStatusyPrzesylekSortDirection_QNAME = new QName("http://ms.gov.pl/msepo", "sortDirection");
    private final static QName _PobierzStatusyPrzesylekFiltersValues_QNAME = new QName("http://ms.gov.pl/msepo", "filtersValues");
    private final static QName _PobierzStatusyPrzesylekResponsePobierzStatusyPrzesylekResult_QNAME = new QName("http://ms.gov.pl/msepo", "PobierzStatusyPrzesylekResult");
    private final static QName _PobierzStatusyPrzesylekPoNumerachNadawczychXmlResponsePobierzStatusyPrzesylekPoNumerachNadawczychXmlResult_QNAME = new QName("http://ms.gov.pl/msepo", "PobierzStatusyPrzesylekPoNumerachNadawczychXmlResult");
    private final static QName _PobierzStatusyPrzesylekPoGuidachXmlResponsePobierzStatusyPrzesylekPoGuidachXmlResult_QNAME = new QName("http://ms.gov.pl/msepo", "PobierzStatusyPrzesylekPoGuidachXmlResult");
    private final static QName _PobierzStatusyPrzesylekXmlResponsePobierzStatusyPrzesylekXmlResult_QNAME = new QName("http://ms.gov.pl/msepo", "PobierzStatusyPrzesylekXmlResult");
    private final static QName _PobierzHistoriePrzesylkiPoNumerzeNadawczymNumerNadawczy_QNAME = new QName("http://ms.gov.pl/msepo", "numerNadawczy");
    private final static QName _PobierzHistoriePrzesylkiPoNumerzeNadawczymResponsePobierzHistoriePrzesylkiPoNumerzeNadawczymResult_QNAME = new QName("http://ms.gov.pl/msepo", "PobierzHistoriePrzesylkiPoNumerzeNadawczymResult");
    private final static QName _PobierzHistoriePrzesylkiPoGuidPrzesylekZaOkresIdPrzesylek_QNAME = new QName("http://ms.gov.pl/msepo", "idPrzesylek");
    private final static QName _PobierzHistoriePrzesylkiPoGuidPrzesylekZaOkresResponsePobierzHistoriePrzesylkiPoGuidPrzesylekZaOkresResult_QNAME = new QName("http://ms.gov.pl/msepo", "PobierzHistoriePrzesylkiPoGuidPrzesylekZaOkresResult");
    private final static QName _PobierzHistoriePrzesylkiPoGuidPrzesylkiResponsePobierzHistoriePrzesylkiPoGuidPrzesylkiResult_QNAME = new QName("http://ms.gov.pl/msepo", "PobierzHistoriePrzesylkiPoGuidPrzesylkiResult");
    private final static QName _PobierzHistoriePrzesylkiPoNumerzeNadawczymXmlResponsePobierzHistoriePrzesylkiPoNumerzeNadawczymXmlResult_QNAME = new QName("http://ms.gov.pl/msepo", "PobierzHistoriePrzesylkiPoNumerzeNadawczymXmlResult");
    private final static QName _PobierzHistoriePrzesylkiPoGuidPrzesylkiXmlResponsePobierzHistoriePrzesylkiPoGuidPrzesylkiXmlResult_QNAME = new QName("http://ms.gov.pl/msepo", "PobierzHistoriePrzesylkiPoGuidPrzesylkiXmlResult");
    private final static QName _ImportZbioruEknXml_QNAME = new QName("http://ms.gov.pl/msepo", "xml");
    private final static QName _ImportZbioruEknResponseImportZbioruEknResult_QNAME = new QName("http://ms.gov.pl/msepo", "ImportZbioruEknResult");
    private final static QName _ImportZbioruEknBase64Base64Xml_QNAME = new QName("http://ms.gov.pl/msepo", "base64xml");
    private final static QName _ImportZbioruEknBase64ResponseImportZbioruEknBase64Result_QNAME = new QName("http://ms.gov.pl/msepo", "ImportZbioruEknBase64Result");
    private final static QName _ImportZbioruEknZipZipFile_QNAME = new QName("http://ms.gov.pl/msepo", "zipFile");
    private final static QName _ImportZbioruEknZipResponseImportZbioruEknZipResult_QNAME = new QName("http://ms.gov.pl/msepo", "ImportZbioruEknZipResult");
    private final static QName _NadanieZbioruEknZipResponseNadanieZbioruEknZipResult_QNAME = new QName("http://ms.gov.pl/msepo", "NadanieZbioruEknZipResult");
    private final static QName _NadanieZbioruEknResponseNadanieZbioruEknResult_QNAME = new QName("http://ms.gov.pl/msepo", "NadanieZbioruEknResult");
    private final static QName _NadanieZbioruEknBase64ResponseNadanieZbioruEknBase64Result_QNAME = new QName("http://ms.gov.pl/msepo", "NadanieZbioruEknBase64Result");
    private final static QName _PobierzPdfPotwierdzeniaDoreczenPoNumerachNadawczychResponsePobierzPdfPotwierdzeniaDoreczenPoNumerachNadawczychResult_QNAME = new QName("http://ms.gov.pl/msepo", "PobierzPdfPotwierdzeniaDoreczenPoNumerachNadawczychResult");
    private final static QName _PobierzPdfPotwierdzeniaDoreczenPoGuidachResponsePobierzPdfPotwierdzeniaDoreczenPoGuidachResult_QNAME = new QName("http://ms.gov.pl/msepo", "PobierzPdfPotwierdzeniaDoreczenPoGuidachResult");
    private final static QName _PobierzXmlPotwierdzeniaDoreczenPoNumerachNadawczychResponsePobierzXmlPotwierdzeniaDoreczenPoNumerachNadawczychResult_QNAME = new QName("http://ms.gov.pl/msepo", "PobierzXmlPotwierdzeniaDoreczenPoNumerachNadawczychResult");
    private final static QName _PobierzXmlPotwierdzeniaDoreczenPoGuidachResponsePobierzXmlPotwierdzeniaDoreczenPoGuidachResult_QNAME = new QName("http://ms.gov.pl/msepo", "PobierzXmlPotwierdzeniaDoreczenPoGuidachResult");
    private final static QName _PobierzKodyPocztoweDataOd_QNAME = new QName("http://ms.gov.pl/msepo", "dataOd");
    private final static QName _PobierzKodyPocztoweMaska_QNAME = new QName("http://ms.gov.pl/msepo", "maska");
    private final static QName _PobierzKodyPocztoweResponsePobierzKodyPocztoweResult_QNAME = new QName("http://ms.gov.pl/msepo", "PobierzKodyPocztoweResult");
    private final static QName _PobierzListeStatusowPrzesylekResponsePobierzListeStatusowPrzesylekResult_QNAME = new QName("http://ms.gov.pl/msepo", "PobierzListeStatusowPrzesylekResult");
    private final static QName _PobierzWersjeApiResponsePobierzWersjeApiResult_QNAME = new QName("http://ms.gov.pl/msepo", "PobierzWersjeApiResult");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: pl.gov.ms.msepo
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PobierzStatusyPrzesylekPoNumerachNadawczych }
     * 
     */
    public PobierzStatusyPrzesylekPoNumerachNadawczych createPobierzStatusyPrzesylekPoNumerachNadawczych() {
        return new PobierzStatusyPrzesylekPoNumerachNadawczych();
    }

    /**
     * Create an instance of {@link PobierzStatusyPrzesylekPoNumerachNadawczychResponse }
     * 
     */
    public PobierzStatusyPrzesylekPoNumerachNadawczychResponse createPobierzStatusyPrzesylekPoNumerachNadawczychResponse() {
        return new PobierzStatusyPrzesylekPoNumerachNadawczychResponse();
    }

    /**
     * Create an instance of {@link PobierzStatusyPrzesylekPoNumerachNadawczychShort }
     * 
     */
    public PobierzStatusyPrzesylekPoNumerachNadawczychShort createPobierzStatusyPrzesylekPoNumerachNadawczychShort() {
        return new PobierzStatusyPrzesylekPoNumerachNadawczychShort();
    }

    /**
     * Create an instance of {@link PobierzStatusyPrzesylekPoNumerachNadawczychShortResponse }
     * 
     */
    public PobierzStatusyPrzesylekPoNumerachNadawczychShortResponse createPobierzStatusyPrzesylekPoNumerachNadawczychShortResponse() {
        return new PobierzStatusyPrzesylekPoNumerachNadawczychShortResponse();
    }

    /**
     * Create an instance of {@link PobierzStatusyPrzesylekPoGuidach }
     * 
     */
    public PobierzStatusyPrzesylekPoGuidach createPobierzStatusyPrzesylekPoGuidach() {
        return new PobierzStatusyPrzesylekPoGuidach();
    }

    /**
     * Create an instance of {@link PobierzStatusyPrzesylekPoGuidachResponse }
     * 
     */
    public PobierzStatusyPrzesylekPoGuidachResponse createPobierzStatusyPrzesylekPoGuidachResponse() {
        return new PobierzStatusyPrzesylekPoGuidachResponse();
    }

    /**
     * Create an instance of {@link PobierzStatusyPrzesylekPoGuidachShort }
     * 
     */
    public PobierzStatusyPrzesylekPoGuidachShort createPobierzStatusyPrzesylekPoGuidachShort() {
        return new PobierzStatusyPrzesylekPoGuidachShort();
    }

    /**
     * Create an instance of {@link PobierzStatusyPrzesylekPoGuidachShortResponse }
     * 
     */
    public PobierzStatusyPrzesylekPoGuidachShortResponse createPobierzStatusyPrzesylekPoGuidachShortResponse() {
        return new PobierzStatusyPrzesylekPoGuidachShortResponse();
    }

    /**
     * Create an instance of {@link PobierzStatusyPrzesylekZaOkres }
     * 
     */
    public PobierzStatusyPrzesylekZaOkres createPobierzStatusyPrzesylekZaOkres() {
        return new PobierzStatusyPrzesylekZaOkres();
    }

    /**
     * Create an instance of {@link PobierzStatusyPrzesylekZaOkresResponse }
     * 
     */
    public PobierzStatusyPrzesylekZaOkresResponse createPobierzStatusyPrzesylekZaOkresResponse() {
        return new PobierzStatusyPrzesylekZaOkresResponse();
    }

    /**
     * Create an instance of {@link PobierzGuidyPrzesylekZaOkres }
     * 
     */
    public PobierzGuidyPrzesylekZaOkres createPobierzGuidyPrzesylekZaOkres() {
        return new PobierzGuidyPrzesylekZaOkres();
    }

    /**
     * Create an instance of {@link PobierzGuidyPrzesylekZaOkresResponse }
     * 
     */
    public PobierzGuidyPrzesylekZaOkresResponse createPobierzGuidyPrzesylekZaOkresResponse() {
        return new PobierzGuidyPrzesylekZaOkresResponse();
    }

    /**
     * Create an instance of {@link PobierzNumeryNadawczePrzesylekZaOkres }
     * 
     */
    public PobierzNumeryNadawczePrzesylekZaOkres createPobierzNumeryNadawczePrzesylekZaOkres() {
        return new PobierzNumeryNadawczePrzesylekZaOkres();
    }

    /**
     * Create an instance of {@link PobierzNumeryNadawczePrzesylekZaOkresResponse }
     * 
     */
    public PobierzNumeryNadawczePrzesylekZaOkresResponse createPobierzNumeryNadawczePrzesylekZaOkresResponse() {
        return new PobierzNumeryNadawczePrzesylekZaOkresResponse();
    }

    /**
     * Create an instance of {@link PobierzStatusyPrzesylek }
     * 
     */
    public PobierzStatusyPrzesylek createPobierzStatusyPrzesylek() {
        return new PobierzStatusyPrzesylek();
    }

    /**
     * Create an instance of {@link PobierzStatusyPrzesylekResponse }
     * 
     */
    public PobierzStatusyPrzesylekResponse createPobierzStatusyPrzesylekResponse() {
        return new PobierzStatusyPrzesylekResponse();
    }

    /**
     * Create an instance of {@link PobierzStatusyPrzesylekPoNumerachNadawczychXml }
     * 
     */
    public PobierzStatusyPrzesylekPoNumerachNadawczychXml createPobierzStatusyPrzesylekPoNumerachNadawczychXml() {
        return new PobierzStatusyPrzesylekPoNumerachNadawczychXml();
    }

    /**
     * Create an instance of {@link PobierzStatusyPrzesylekPoNumerachNadawczychXmlResponse }
     * 
     */
    public PobierzStatusyPrzesylekPoNumerachNadawczychXmlResponse createPobierzStatusyPrzesylekPoNumerachNadawczychXmlResponse() {
        return new PobierzStatusyPrzesylekPoNumerachNadawczychXmlResponse();
    }

    /**
     * Create an instance of {@link PobierzStatusyPrzesylekPoGuidachXml }
     * 
     */
    public PobierzStatusyPrzesylekPoGuidachXml createPobierzStatusyPrzesylekPoGuidachXml() {
        return new PobierzStatusyPrzesylekPoGuidachXml();
    }

    /**
     * Create an instance of {@link PobierzStatusyPrzesylekPoGuidachXmlResponse }
     * 
     */
    public PobierzStatusyPrzesylekPoGuidachXmlResponse createPobierzStatusyPrzesylekPoGuidachXmlResponse() {
        return new PobierzStatusyPrzesylekPoGuidachXmlResponse();
    }

    /**
     * Create an instance of {@link PobierzStatusyPrzesylekXml }
     * 
     */
    public PobierzStatusyPrzesylekXml createPobierzStatusyPrzesylekXml() {
        return new PobierzStatusyPrzesylekXml();
    }

    /**
     * Create an instance of {@link PobierzStatusyPrzesylekXmlResponse }
     * 
     */
    public PobierzStatusyPrzesylekXmlResponse createPobierzStatusyPrzesylekXmlResponse() {
        return new PobierzStatusyPrzesylekXmlResponse();
    }

    /**
     * Create an instance of {@link PobierzHistoriePrzesylkiPoNumerzeNadawczym }
     * 
     */
    public PobierzHistoriePrzesylkiPoNumerzeNadawczym createPobierzHistoriePrzesylkiPoNumerzeNadawczym() {
        return new PobierzHistoriePrzesylkiPoNumerzeNadawczym();
    }

    /**
     * Create an instance of {@link PobierzHistoriePrzesylkiPoNumerzeNadawczymResponse }
     * 
     */
    public PobierzHistoriePrzesylkiPoNumerzeNadawczymResponse createPobierzHistoriePrzesylkiPoNumerzeNadawczymResponse() {
        return new PobierzHistoriePrzesylkiPoNumerzeNadawczymResponse();
    }

    /**
     * Create an instance of {@link PobierzHistoriePrzesylkiPoGuidPrzesylekZaOkres }
     * 
     */
    public PobierzHistoriePrzesylkiPoGuidPrzesylekZaOkres createPobierzHistoriePrzesylkiPoGuidPrzesylekZaOkres() {
        return new PobierzHistoriePrzesylkiPoGuidPrzesylekZaOkres();
    }

    /**
     * Create an instance of {@link PobierzHistoriePrzesylkiPoGuidPrzesylekZaOkresResponse }
     * 
     */
    public PobierzHistoriePrzesylkiPoGuidPrzesylekZaOkresResponse createPobierzHistoriePrzesylkiPoGuidPrzesylekZaOkresResponse() {
        return new PobierzHistoriePrzesylkiPoGuidPrzesylekZaOkresResponse();
    }

    /**
     * Create an instance of {@link PobierzHistoriePrzesylkiPoGuidPrzesylki }
     * 
     */
    public PobierzHistoriePrzesylkiPoGuidPrzesylki createPobierzHistoriePrzesylkiPoGuidPrzesylki() {
        return new PobierzHistoriePrzesylkiPoGuidPrzesylki();
    }

    /**
     * Create an instance of {@link PobierzHistoriePrzesylkiPoGuidPrzesylkiResponse }
     * 
     */
    public PobierzHistoriePrzesylkiPoGuidPrzesylkiResponse createPobierzHistoriePrzesylkiPoGuidPrzesylkiResponse() {
        return new PobierzHistoriePrzesylkiPoGuidPrzesylkiResponse();
    }

    /**
     * Create an instance of {@link PobierzHistoriePrzesylkiPoNumerzeNadawczymXml }
     * 
     */
    public PobierzHistoriePrzesylkiPoNumerzeNadawczymXml createPobierzHistoriePrzesylkiPoNumerzeNadawczymXml() {
        return new PobierzHistoriePrzesylkiPoNumerzeNadawczymXml();
    }

    /**
     * Create an instance of {@link PobierzHistoriePrzesylkiPoNumerzeNadawczymXmlResponse }
     * 
     */
    public PobierzHistoriePrzesylkiPoNumerzeNadawczymXmlResponse createPobierzHistoriePrzesylkiPoNumerzeNadawczymXmlResponse() {
        return new PobierzHistoriePrzesylkiPoNumerzeNadawczymXmlResponse();
    }

    /**
     * Create an instance of {@link PobierzHistoriePrzesylkiPoGuidPrzesylkiXml }
     * 
     */
    public PobierzHistoriePrzesylkiPoGuidPrzesylkiXml createPobierzHistoriePrzesylkiPoGuidPrzesylkiXml() {
        return new PobierzHistoriePrzesylkiPoGuidPrzesylkiXml();
    }

    /**
     * Create an instance of {@link PobierzHistoriePrzesylkiPoGuidPrzesylkiXmlResponse }
     * 
     */
    public PobierzHistoriePrzesylkiPoGuidPrzesylkiXmlResponse createPobierzHistoriePrzesylkiPoGuidPrzesylkiXmlResponse() {
        return new PobierzHistoriePrzesylkiPoGuidPrzesylkiXmlResponse();
    }

    /**
     * Create an instance of {@link ImportZbioruEkn }
     * 
     */
    public ImportZbioruEkn createImportZbioruEkn() {
        return new ImportZbioruEkn();
    }

    /**
     * Create an instance of {@link ImportZbioruEknResponse }
     * 
     */
    public ImportZbioruEknResponse createImportZbioruEknResponse() {
        return new ImportZbioruEknResponse();
    }

    /**
     * Create an instance of {@link ImportZbioruEknBase64 }
     * 
     */
    public ImportZbioruEknBase64 createImportZbioruEknBase64() {
        return new ImportZbioruEknBase64();
    }

    /**
     * Create an instance of {@link ImportZbioruEknBase64Response }
     * 
     */
    public ImportZbioruEknBase64Response createImportZbioruEknBase64Response() {
        return new ImportZbioruEknBase64Response();
    }

    /**
     * Create an instance of {@link ImportZbioruEknZip }
     * 
     */
    public ImportZbioruEknZip createImportZbioruEknZip() {
        return new ImportZbioruEknZip();
    }

    /**
     * Create an instance of {@link ImportZbioruEknZipResponse }
     * 
     */
    public ImportZbioruEknZipResponse createImportZbioruEknZipResponse() {
        return new ImportZbioruEknZipResponse();
    }

    /**
     * Create an instance of {@link NadanieZbioruEknZip }
     * 
     */
    public NadanieZbioruEknZip createNadanieZbioruEknZip() {
        return new NadanieZbioruEknZip();
    }

    /**
     * Create an instance of {@link NadanieZbioruEknZipResponse }
     * 
     */
    public NadanieZbioruEknZipResponse createNadanieZbioruEknZipResponse() {
        return new NadanieZbioruEknZipResponse();
    }

    /**
     * Create an instance of {@link NadanieZbioruEkn }
     * 
     */
    public NadanieZbioruEkn createNadanieZbioruEkn() {
        return new NadanieZbioruEkn();
    }

    /**
     * Create an instance of {@link NadanieZbioruEknResponse }
     * 
     */
    public NadanieZbioruEknResponse createNadanieZbioruEknResponse() {
        return new NadanieZbioruEknResponse();
    }

    /**
     * Create an instance of {@link NadanieZbioruEknBase64 }
     * 
     */
    public NadanieZbioruEknBase64 createNadanieZbioruEknBase64() {
        return new NadanieZbioruEknBase64();
    }

    /**
     * Create an instance of {@link NadanieZbioruEknBase64Response }
     * 
     */
    public NadanieZbioruEknBase64Response createNadanieZbioruEknBase64Response() {
        return new NadanieZbioruEknBase64Response();
    }

    /**
     * Create an instance of {@link PobierzPdfPotwierdzeniaDoreczenPoNumerachNadawczych }
     * 
     */
    public PobierzPdfPotwierdzeniaDoreczenPoNumerachNadawczych createPobierzPdfPotwierdzeniaDoreczenPoNumerachNadawczych() {
        return new PobierzPdfPotwierdzeniaDoreczenPoNumerachNadawczych();
    }

    /**
     * Create an instance of {@link PobierzPdfPotwierdzeniaDoreczenPoNumerachNadawczychResponse }
     * 
     */
    public PobierzPdfPotwierdzeniaDoreczenPoNumerachNadawczychResponse createPobierzPdfPotwierdzeniaDoreczenPoNumerachNadawczychResponse() {
        return new PobierzPdfPotwierdzeniaDoreczenPoNumerachNadawczychResponse();
    }

    /**
     * Create an instance of {@link PobierzPdfPotwierdzeniaDoreczenPoGuidach }
     * 
     */
    public PobierzPdfPotwierdzeniaDoreczenPoGuidach createPobierzPdfPotwierdzeniaDoreczenPoGuidach() {
        return new PobierzPdfPotwierdzeniaDoreczenPoGuidach();
    }

    /**
     * Create an instance of {@link PobierzPdfPotwierdzeniaDoreczenPoGuidachResponse }
     * 
     */
    public PobierzPdfPotwierdzeniaDoreczenPoGuidachResponse createPobierzPdfPotwierdzeniaDoreczenPoGuidachResponse() {
        return new PobierzPdfPotwierdzeniaDoreczenPoGuidachResponse();
    }

    /**
     * Create an instance of {@link PobierzXmlPotwierdzeniaDoreczenPoNumerachNadawczych }
     * 
     */
    public PobierzXmlPotwierdzeniaDoreczenPoNumerachNadawczych createPobierzXmlPotwierdzeniaDoreczenPoNumerachNadawczych() {
        return new PobierzXmlPotwierdzeniaDoreczenPoNumerachNadawczych();
    }

    /**
     * Create an instance of {@link PobierzXmlPotwierdzeniaDoreczenPoNumerachNadawczychResponse }
     * 
     */
    public PobierzXmlPotwierdzeniaDoreczenPoNumerachNadawczychResponse createPobierzXmlPotwierdzeniaDoreczenPoNumerachNadawczychResponse() {
        return new PobierzXmlPotwierdzeniaDoreczenPoNumerachNadawczychResponse();
    }

    /**
     * Create an instance of {@link PobierzXmlPotwierdzeniaDoreczenPoGuidach }
     * 
     */
    public PobierzXmlPotwierdzeniaDoreczenPoGuidach createPobierzXmlPotwierdzeniaDoreczenPoGuidach() {
        return new PobierzXmlPotwierdzeniaDoreczenPoGuidach();
    }

    /**
     * Create an instance of {@link PobierzXmlPotwierdzeniaDoreczenPoGuidachResponse }
     * 
     */
    public PobierzXmlPotwierdzeniaDoreczenPoGuidachResponse createPobierzXmlPotwierdzeniaDoreczenPoGuidachResponse() {
        return new PobierzXmlPotwierdzeniaDoreczenPoGuidachResponse();
    }

    /**
     * Create an instance of {@link PobierzKodyPocztowe }
     * 
     */
    public PobierzKodyPocztowe createPobierzKodyPocztowe() {
        return new PobierzKodyPocztowe();
    }

    /**
     * Create an instance of {@link PobierzKodyPocztoweResponse }
     * 
     */
    public PobierzKodyPocztoweResponse createPobierzKodyPocztoweResponse() {
        return new PobierzKodyPocztoweResponse();
    }

    /**
     * Create an instance of {@link PobierzListeStatusowPrzesylek }
     * 
     */
    public PobierzListeStatusowPrzesylek createPobierzListeStatusowPrzesylek() {
        return new PobierzListeStatusowPrzesylek();
    }

    /**
     * Create an instance of {@link PobierzListeStatusowPrzesylekResponse }
     * 
     */
    public PobierzListeStatusowPrzesylekResponse createPobierzListeStatusowPrzesylekResponse() {
        return new PobierzListeStatusowPrzesylekResponse();
    }

    /**
     * Create an instance of {@link PobierzWersjeApi }
     * 
     */
    public PobierzWersjeApi createPobierzWersjeApi() {
        return new PobierzWersjeApi();
    }

    /**
     * Create an instance of {@link PobierzWersjeApiResponse }
     * 
     */
    public PobierzWersjeApiResponse createPobierzWersjeApiResponse() {
        return new PobierzWersjeApiResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ms.gov.pl/msepo", name = "userName", scope = PobierzStatusyPrzesylekPoNumerachNadawczych.class)
    public JAXBElement<String> createPobierzStatusyPrzesylekPoNumerachNadawczychUserName(String value) {
        return new JAXBElement<String>(_PobierzStatusyPrzesylekPoNumerachNadawczychUserName_QNAME, String.class, PobierzStatusyPrzesylekPoNumerachNadawczych.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ms.gov.pl/msepo", name = "password", scope = PobierzStatusyPrzesylekPoNumerachNadawczych.class)
    public JAXBElement<String> createPobierzStatusyPrzesylekPoNumerachNadawczychPassword(String value) {
        return new JAXBElement<String>(_PobierzStatusyPrzesylekPoNumerachNadawczychPassword_QNAME, String.class, PobierzStatusyPrzesylekPoNumerachNadawczych.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ms.gov.pl/msepo", name = "apiKey", scope = PobierzStatusyPrzesylekPoNumerachNadawczych.class)
    public JAXBElement<String> createPobierzStatusyPrzesylekPoNumerachNadawczychApiKey(String value) {
        return new JAXBElement<String>(_PobierzStatusyPrzesylekPoNumerachNadawczychApiKey_QNAME, String.class, PobierzStatusyPrzesylekPoNumerachNadawczych.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ms.gov.pl/msepo", name = "numeryNadawcze", scope = PobierzStatusyPrzesylekPoNumerachNadawczych.class)
    public JAXBElement<ArrayOfstring> createPobierzStatusyPrzesylekPoNumerachNadawczychNumeryNadawcze(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_PobierzStatusyPrzesylekPoNumerachNadawczychNumeryNadawcze_QNAME, ArrayOfstring.class, PobierzStatusyPrzesylekPoNumerachNadawczych.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PrzesylkiOutputData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ms.gov.pl/msepo", name = "PobierzStatusyPrzesylekPoNumerachNadawczychResult", scope = PobierzStatusyPrzesylekPoNumerachNadawczychResponse.class)
    public JAXBElement<PrzesylkiOutputData> createPobierzStatusyPrzesylekPoNumerachNadawczychResponsePobierzStatusyPrzesylekPoNumerachNadawczychResult(PrzesylkiOutputData value) {
        return new JAXBElement<PrzesylkiOutputData>(_PobierzStatusyPrzesylekPoNumerachNadawczychResponsePobierzStatusyPrzesylekPoNumerachNadawczychResult_QNAME, PrzesylkiOutputData.class, PobierzStatusyPrzesylekPoNumerachNadawczychResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ms.gov.pl/msepo", name = "userName", scope = PobierzStatusyPrzesylekPoNumerachNadawczychShort.class)
    public JAXBElement<String> createPobierzStatusyPrzesylekPoNumerachNadawczychShortUserName(String value) {
        return new JAXBElement<String>(_PobierzStatusyPrzesylekPoNumerachNadawczychUserName_QNAME, String.class, PobierzStatusyPrzesylekPoNumerachNadawczychShort.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ms.gov.pl/msepo", name = "password", scope = PobierzStatusyPrzesylekPoNumerachNadawczychShort.class)
    public JAXBElement<String> createPobierzStatusyPrzesylekPoNumerachNadawczychShortPassword(String value) {
        return new JAXBElement<String>(_PobierzStatusyPrzesylekPoNumerachNadawczychPassword_QNAME, String.class, PobierzStatusyPrzesylekPoNumerachNadawczychShort.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ms.gov.pl/msepo", name = "apiKey", scope = PobierzStatusyPrzesylekPoNumerachNadawczychShort.class)
    public JAXBElement<String> createPobierzStatusyPrzesylekPoNumerachNadawczychShortApiKey(String value) {
        return new JAXBElement<String>(_PobierzStatusyPrzesylekPoNumerachNadawczychApiKey_QNAME, String.class, PobierzStatusyPrzesylekPoNumerachNadawczychShort.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ms.gov.pl/msepo", name = "numeryNadawcze", scope = PobierzStatusyPrzesylekPoNumerachNadawczychShort.class)
    public JAXBElement<ArrayOfstring> createPobierzStatusyPrzesylekPoNumerachNadawczychShortNumeryNadawcze(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_PobierzStatusyPrzesylekPoNumerachNadawczychNumeryNadawcze_QNAME, ArrayOfstring.class, PobierzStatusyPrzesylekPoNumerachNadawczychShort.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PrzesylkiOutputShortData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ms.gov.pl/msepo", name = "PobierzStatusyPrzesylekPoNumerachNadawczychShortResult", scope = PobierzStatusyPrzesylekPoNumerachNadawczychShortResponse.class)
    public JAXBElement<PrzesylkiOutputShortData> createPobierzStatusyPrzesylekPoNumerachNadawczychShortResponsePobierzStatusyPrzesylekPoNumerachNadawczychShortResult(PrzesylkiOutputShortData value) {
        return new JAXBElement<PrzesylkiOutputShortData>(_PobierzStatusyPrzesylekPoNumerachNadawczychShortResponsePobierzStatusyPrzesylekPoNumerachNadawczychShortResult_QNAME, PrzesylkiOutputShortData.class, PobierzStatusyPrzesylekPoNumerachNadawczychShortResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ms.gov.pl/msepo", name = "userName", scope = PobierzStatusyPrzesylekPoGuidach.class)
    public JAXBElement<String> createPobierzStatusyPrzesylekPoGuidachUserName(String value) {
        return new JAXBElement<String>(_PobierzStatusyPrzesylekPoNumerachNadawczychUserName_QNAME, String.class, PobierzStatusyPrzesylekPoGuidach.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ms.gov.pl/msepo", name = "password", scope = PobierzStatusyPrzesylekPoGuidach.class)
    public JAXBElement<String> createPobierzStatusyPrzesylekPoGuidachPassword(String value) {
        return new JAXBElement<String>(_PobierzStatusyPrzesylekPoNumerachNadawczychPassword_QNAME, String.class, PobierzStatusyPrzesylekPoGuidach.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ms.gov.pl/msepo", name = "apiKey", scope = PobierzStatusyPrzesylekPoGuidach.class)
    public JAXBElement<String> createPobierzStatusyPrzesylekPoGuidachApiKey(String value) {
        return new JAXBElement<String>(_PobierzStatusyPrzesylekPoNumerachNadawczychApiKey_QNAME, String.class, PobierzStatusyPrzesylekPoGuidach.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfguid }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ms.gov.pl/msepo", name = "guidPrzesylki", scope = PobierzStatusyPrzesylekPoGuidach.class)
    public JAXBElement<ArrayOfguid> createPobierzStatusyPrzesylekPoGuidachGuidPrzesylki(ArrayOfguid value) {
        return new JAXBElement<ArrayOfguid>(_PobierzStatusyPrzesylekPoGuidachGuidPrzesylki_QNAME, ArrayOfguid.class, PobierzStatusyPrzesylekPoGuidach.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PrzesylkiOutputData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ms.gov.pl/msepo", name = "PobierzStatusyPrzesylekPoGuidachResult", scope = PobierzStatusyPrzesylekPoGuidachResponse.class)
    public JAXBElement<PrzesylkiOutputData> createPobierzStatusyPrzesylekPoGuidachResponsePobierzStatusyPrzesylekPoGuidachResult(PrzesylkiOutputData value) {
        return new JAXBElement<PrzesylkiOutputData>(_PobierzStatusyPrzesylekPoGuidachResponsePobierzStatusyPrzesylekPoGuidachResult_QNAME, PrzesylkiOutputData.class, PobierzStatusyPrzesylekPoGuidachResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ms.gov.pl/msepo", name = "userName", scope = PobierzStatusyPrzesylekPoGuidachShort.class)
    public JAXBElement<String> createPobierzStatusyPrzesylekPoGuidachShortUserName(String value) {
        return new JAXBElement<String>(_PobierzStatusyPrzesylekPoNumerachNadawczychUserName_QNAME, String.class, PobierzStatusyPrzesylekPoGuidachShort.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ms.gov.pl/msepo", name = "password", scope = PobierzStatusyPrzesylekPoGuidachShort.class)
    public JAXBElement<String> createPobierzStatusyPrzesylekPoGuidachShortPassword(String value) {
        return new JAXBElement<String>(_PobierzStatusyPrzesylekPoNumerachNadawczychPassword_QNAME, String.class, PobierzStatusyPrzesylekPoGuidachShort.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ms.gov.pl/msepo", name = "apiKey", scope = PobierzStatusyPrzesylekPoGuidachShort.class)
    public JAXBElement<String> createPobierzStatusyPrzesylekPoGuidachShortApiKey(String value) {
        return new JAXBElement<String>(_PobierzStatusyPrzesylekPoNumerachNadawczychApiKey_QNAME, String.class, PobierzStatusyPrzesylekPoGuidachShort.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfguid }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ms.gov.pl/msepo", name = "guidPrzesylki", scope = PobierzStatusyPrzesylekPoGuidachShort.class)
    public JAXBElement<ArrayOfguid> createPobierzStatusyPrzesylekPoGuidachShortGuidPrzesylki(ArrayOfguid value) {
        return new JAXBElement<ArrayOfguid>(_PobierzStatusyPrzesylekPoGuidachGuidPrzesylki_QNAME, ArrayOfguid.class, PobierzStatusyPrzesylekPoGuidachShort.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PrzesylkiOutputShortData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ms.gov.pl/msepo", name = "PobierzStatusyPrzesylekPoGuidachShortResult", scope = PobierzStatusyPrzesylekPoGuidachShortResponse.class)
    public JAXBElement<PrzesylkiOutputShortData> createPobierzStatusyPrzesylekPoGuidachShortResponsePobierzStatusyPrzesylekPoGuidachShortResult(PrzesylkiOutputShortData value) {
        return new JAXBElement<PrzesylkiOutputShortData>(_PobierzStatusyPrzesylekPoGuidachShortResponsePobierzStatusyPrzesylekPoGuidachShortResult_QNAME, PrzesylkiOutputShortData.class, PobierzStatusyPrzesylekPoGuidachShortResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ms.gov.pl/msepo", name = "userName", scope = PobierzStatusyPrzesylekZaOkres.class)
    public JAXBElement<String> createPobierzStatusyPrzesylekZaOkresUserName(String value) {
        return new JAXBElement<String>(_PobierzStatusyPrzesylekPoNumerachNadawczychUserName_QNAME, String.class, PobierzStatusyPrzesylekZaOkres.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ms.gov.pl/msepo", name = "password", scope = PobierzStatusyPrzesylekZaOkres.class)
    public JAXBElement<String> createPobierzStatusyPrzesylekZaOkresPassword(String value) {
        return new JAXBElement<String>(_PobierzStatusyPrzesylekPoNumerachNadawczychPassword_QNAME, String.class, PobierzStatusyPrzesylekZaOkres.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ms.gov.pl/msepo", name = "apiKey", scope = PobierzStatusyPrzesylekZaOkres.class)
    public JAXBElement<String> createPobierzStatusyPrzesylekZaOkresApiKey(String value) {
        return new JAXBElement<String>(_PobierzStatusyPrzesylekPoNumerachNadawczychApiKey_QNAME, String.class, PobierzStatusyPrzesylekZaOkres.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ms.gov.pl/msepo", name = "dataDo", scope = PobierzStatusyPrzesylekZaOkres.class)
    public JAXBElement<XMLGregorianCalendar> createPobierzStatusyPrzesylekZaOkresDataDo(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_PobierzStatusyPrzesylekZaOkresDataDo_QNAME, XMLGregorianCalendar.class, PobierzStatusyPrzesylekZaOkres.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfguid }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ms.gov.pl/msepo", name = "guidPrzesylki", scope = PobierzStatusyPrzesylekZaOkres.class)
    public JAXBElement<ArrayOfguid> createPobierzStatusyPrzesylekZaOkresGuidPrzesylki(ArrayOfguid value) {
        return new JAXBElement<ArrayOfguid>(_PobierzStatusyPrzesylekPoGuidachGuidPrzesylki_QNAME, ArrayOfguid.class, PobierzStatusyPrzesylekZaOkres.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PrzesylkiOutputShortData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ms.gov.pl/msepo", name = "PobierzStatusyPrzesylekZaOkresResult", scope = PobierzStatusyPrzesylekZaOkresResponse.class)
    public JAXBElement<PrzesylkiOutputShortData> createPobierzStatusyPrzesylekZaOkresResponsePobierzStatusyPrzesylekZaOkresResult(PrzesylkiOutputShortData value) {
        return new JAXBElement<PrzesylkiOutputShortData>(_PobierzStatusyPrzesylekZaOkresResponsePobierzStatusyPrzesylekZaOkresResult_QNAME, PrzesylkiOutputShortData.class, PobierzStatusyPrzesylekZaOkresResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ms.gov.pl/msepo", name = "userName", scope = PobierzGuidyPrzesylekZaOkres.class)
    public JAXBElement<String> createPobierzGuidyPrzesylekZaOkresUserName(String value) {
        return new JAXBElement<String>(_PobierzStatusyPrzesylekPoNumerachNadawczychUserName_QNAME, String.class, PobierzGuidyPrzesylekZaOkres.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ms.gov.pl/msepo", name = "password", scope = PobierzGuidyPrzesylekZaOkres.class)
    public JAXBElement<String> createPobierzGuidyPrzesylekZaOkresPassword(String value) {
        return new JAXBElement<String>(_PobierzStatusyPrzesylekPoNumerachNadawczychPassword_QNAME, String.class, PobierzGuidyPrzesylekZaOkres.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ms.gov.pl/msepo", name = "apiKey", scope = PobierzGuidyPrzesylekZaOkres.class)
    public JAXBElement<String> createPobierzGuidyPrzesylekZaOkresApiKey(String value) {
        return new JAXBElement<String>(_PobierzStatusyPrzesylekPoNumerachNadawczychApiKey_QNAME, String.class, PobierzGuidyPrzesylekZaOkres.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ms.gov.pl/msepo", name = "dataDo", scope = PobierzGuidyPrzesylekZaOkres.class)
    public JAXBElement<XMLGregorianCalendar> createPobierzGuidyPrzesylekZaOkresDataDo(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_PobierzStatusyPrzesylekZaOkresDataDo_QNAME, XMLGregorianCalendar.class, PobierzGuidyPrzesylekZaOkres.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GuidOutputData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ms.gov.pl/msepo", name = "PobierzGuidyPrzesylekZaOkresResult", scope = PobierzGuidyPrzesylekZaOkresResponse.class)
    public JAXBElement<GuidOutputData> createPobierzGuidyPrzesylekZaOkresResponsePobierzGuidyPrzesylekZaOkresResult(GuidOutputData value) {
        return new JAXBElement<GuidOutputData>(_PobierzGuidyPrzesylekZaOkresResponsePobierzGuidyPrzesylekZaOkresResult_QNAME, GuidOutputData.class, PobierzGuidyPrzesylekZaOkresResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ms.gov.pl/msepo", name = "userName", scope = PobierzNumeryNadawczePrzesylekZaOkres.class)
    public JAXBElement<String> createPobierzNumeryNadawczePrzesylekZaOkresUserName(String value) {
        return new JAXBElement<String>(_PobierzStatusyPrzesylekPoNumerachNadawczychUserName_QNAME, String.class, PobierzNumeryNadawczePrzesylekZaOkres.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ms.gov.pl/msepo", name = "password", scope = PobierzNumeryNadawczePrzesylekZaOkres.class)
    public JAXBElement<String> createPobierzNumeryNadawczePrzesylekZaOkresPassword(String value) {
        return new JAXBElement<String>(_PobierzStatusyPrzesylekPoNumerachNadawczychPassword_QNAME, String.class, PobierzNumeryNadawczePrzesylekZaOkres.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ms.gov.pl/msepo", name = "apiKey", scope = PobierzNumeryNadawczePrzesylekZaOkres.class)
    public JAXBElement<String> createPobierzNumeryNadawczePrzesylekZaOkresApiKey(String value) {
        return new JAXBElement<String>(_PobierzStatusyPrzesylekPoNumerachNadawczychApiKey_QNAME, String.class, PobierzNumeryNadawczePrzesylekZaOkres.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ms.gov.pl/msepo", name = "dataDo", scope = PobierzNumeryNadawczePrzesylekZaOkres.class)
    public JAXBElement<XMLGregorianCalendar> createPobierzNumeryNadawczePrzesylekZaOkresDataDo(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_PobierzStatusyPrzesylekZaOkresDataDo_QNAME, XMLGregorianCalendar.class, PobierzNumeryNadawczePrzesylekZaOkres.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NumerNadawczyOutputData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ms.gov.pl/msepo", name = "PobierzNumeryNadawczePrzesylekZaOkresResult", scope = PobierzNumeryNadawczePrzesylekZaOkresResponse.class)
    public JAXBElement<NumerNadawczyOutputData> createPobierzNumeryNadawczePrzesylekZaOkresResponsePobierzNumeryNadawczePrzesylekZaOkresResult(NumerNadawczyOutputData value) {
        return new JAXBElement<NumerNadawczyOutputData>(_PobierzNumeryNadawczePrzesylekZaOkresResponsePobierzNumeryNadawczePrzesylekZaOkresResult_QNAME, NumerNadawczyOutputData.class, PobierzNumeryNadawczePrzesylekZaOkresResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ms.gov.pl/msepo", name = "userName", scope = PobierzStatusyPrzesylek.class)
    public JAXBElement<String> createPobierzStatusyPrzesylekUserName(String value) {
        return new JAXBElement<String>(_PobierzStatusyPrzesylekPoNumerachNadawczychUserName_QNAME, String.class, PobierzStatusyPrzesylek.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ms.gov.pl/msepo", name = "password", scope = PobierzStatusyPrzesylek.class)
    public JAXBElement<String> createPobierzStatusyPrzesylekPassword(String value) {
        return new JAXBElement<String>(_PobierzStatusyPrzesylekPoNumerachNadawczychPassword_QNAME, String.class, PobierzStatusyPrzesylek.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ms.gov.pl/msepo", name = "apiKey", scope = PobierzStatusyPrzesylek.class)
    public JAXBElement<String> createPobierzStatusyPrzesylekApiKey(String value) {
        return new JAXBElement<String>(_PobierzStatusyPrzesylekPoNumerachNadawczychApiKey_QNAME, String.class, PobierzStatusyPrzesylek.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ms.gov.pl/msepo", name = "sortColumn", scope = PobierzStatusyPrzesylek.class)
    public JAXBElement<String> createPobierzStatusyPrzesylekSortColumn(String value) {
        return new JAXBElement<String>(_PobierzStatusyPrzesylekSortColumn_QNAME, String.class, PobierzStatusyPrzesylek.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ms.gov.pl/msepo", name = "sortDirection", scope = PobierzStatusyPrzesylek.class)
    public JAXBElement<String> createPobierzStatusyPrzesylekSortDirection(String value) {
        return new JAXBElement<String>(_PobierzStatusyPrzesylekSortDirection_QNAME, String.class, PobierzStatusyPrzesylek.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfstringstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ms.gov.pl/msepo", name = "filtersValues", scope = PobierzStatusyPrzesylek.class)
    public JAXBElement<ArrayOfKeyValueOfstringstring> createPobierzStatusyPrzesylekFiltersValues(ArrayOfKeyValueOfstringstring value) {
        return new JAXBElement<ArrayOfKeyValueOfstringstring>(_PobierzStatusyPrzesylekFiltersValues_QNAME, ArrayOfKeyValueOfstringstring.class, PobierzStatusyPrzesylek.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PrzesylkiOutputData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ms.gov.pl/msepo", name = "PobierzStatusyPrzesylekResult", scope = PobierzStatusyPrzesylekResponse.class)
    public JAXBElement<PrzesylkiOutputData> createPobierzStatusyPrzesylekResponsePobierzStatusyPrzesylekResult(PrzesylkiOutputData value) {
        return new JAXBElement<PrzesylkiOutputData>(_PobierzStatusyPrzesylekResponsePobierzStatusyPrzesylekResult_QNAME, PrzesylkiOutputData.class, PobierzStatusyPrzesylekResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ms.gov.pl/msepo", name = "userName", scope = PobierzStatusyPrzesylekPoNumerachNadawczychXml.class)
    public JAXBElement<String> createPobierzStatusyPrzesylekPoNumerachNadawczychXmlUserName(String value) {
        return new JAXBElement<String>(_PobierzStatusyPrzesylekPoNumerachNadawczychUserName_QNAME, String.class, PobierzStatusyPrzesylekPoNumerachNadawczychXml.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ms.gov.pl/msepo", name = "password", scope = PobierzStatusyPrzesylekPoNumerachNadawczychXml.class)
    public JAXBElement<String> createPobierzStatusyPrzesylekPoNumerachNadawczychXmlPassword(String value) {
        return new JAXBElement<String>(_PobierzStatusyPrzesylekPoNumerachNadawczychPassword_QNAME, String.class, PobierzStatusyPrzesylekPoNumerachNadawczychXml.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ms.gov.pl/msepo", name = "apiKey", scope = PobierzStatusyPrzesylekPoNumerachNadawczychXml.class)
    public JAXBElement<String> createPobierzStatusyPrzesylekPoNumerachNadawczychXmlApiKey(String value) {
        return new JAXBElement<String>(_PobierzStatusyPrzesylekPoNumerachNadawczychApiKey_QNAME, String.class, PobierzStatusyPrzesylekPoNumerachNadawczychXml.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ms.gov.pl/msepo", name = "numeryNadawcze", scope = PobierzStatusyPrzesylekPoNumerachNadawczychXml.class)
    public JAXBElement<ArrayOfstring> createPobierzStatusyPrzesylekPoNumerachNadawczychXmlNumeryNadawcze(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_PobierzStatusyPrzesylekPoNumerachNadawczychNumeryNadawcze_QNAME, ArrayOfstring.class, PobierzStatusyPrzesylekPoNumerachNadawczychXml.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XmlOutputData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ms.gov.pl/msepo", name = "PobierzStatusyPrzesylekPoNumerachNadawczychXmlResult", scope = PobierzStatusyPrzesylekPoNumerachNadawczychXmlResponse.class)
    public JAXBElement<XmlOutputData> createPobierzStatusyPrzesylekPoNumerachNadawczychXmlResponsePobierzStatusyPrzesylekPoNumerachNadawczychXmlResult(XmlOutputData value) {
        return new JAXBElement<XmlOutputData>(_PobierzStatusyPrzesylekPoNumerachNadawczychXmlResponsePobierzStatusyPrzesylekPoNumerachNadawczychXmlResult_QNAME, XmlOutputData.class, PobierzStatusyPrzesylekPoNumerachNadawczychXmlResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ms.gov.pl/msepo", name = "userName", scope = PobierzStatusyPrzesylekPoGuidachXml.class)
    public JAXBElement<String> createPobierzStatusyPrzesylekPoGuidachXmlUserName(String value) {
        return new JAXBElement<String>(_PobierzStatusyPrzesylekPoNumerachNadawczychUserName_QNAME, String.class, PobierzStatusyPrzesylekPoGuidachXml.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ms.gov.pl/msepo", name = "password", scope = PobierzStatusyPrzesylekPoGuidachXml.class)
    public JAXBElement<String> createPobierzStatusyPrzesylekPoGuidachXmlPassword(String value) {
        return new JAXBElement<String>(_PobierzStatusyPrzesylekPoNumerachNadawczychPassword_QNAME, String.class, PobierzStatusyPrzesylekPoGuidachXml.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ms.gov.pl/msepo", name = "apiKey", scope = PobierzStatusyPrzesylekPoGuidachXml.class)
    public JAXBElement<String> createPobierzStatusyPrzesylekPoGuidachXmlApiKey(String value) {
        return new JAXBElement<String>(_PobierzStatusyPrzesylekPoNumerachNadawczychApiKey_QNAME, String.class, PobierzStatusyPrzesylekPoGuidachXml.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfguid }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ms.gov.pl/msepo", name = "guidPrzesylki", scope = PobierzStatusyPrzesylekPoGuidachXml.class)
    public JAXBElement<ArrayOfguid> createPobierzStatusyPrzesylekPoGuidachXmlGuidPrzesylki(ArrayOfguid value) {
        return new JAXBElement<ArrayOfguid>(_PobierzStatusyPrzesylekPoGuidachGuidPrzesylki_QNAME, ArrayOfguid.class, PobierzStatusyPrzesylekPoGuidachXml.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XmlOutputData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ms.gov.pl/msepo", name = "PobierzStatusyPrzesylekPoGuidachXmlResult", scope = PobierzStatusyPrzesylekPoGuidachXmlResponse.class)
    public JAXBElement<XmlOutputData> createPobierzStatusyPrzesylekPoGuidachXmlResponsePobierzStatusyPrzesylekPoGuidachXmlResult(XmlOutputData value) {
        return new JAXBElement<XmlOutputData>(_PobierzStatusyPrzesylekPoGuidachXmlResponsePobierzStatusyPrzesylekPoGuidachXmlResult_QNAME, XmlOutputData.class, PobierzStatusyPrzesylekPoGuidachXmlResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ms.gov.pl/msepo", name = "userName", scope = PobierzStatusyPrzesylekXml.class)
    public JAXBElement<String> createPobierzStatusyPrzesylekXmlUserName(String value) {
        return new JAXBElement<String>(_PobierzStatusyPrzesylekPoNumerachNadawczychUserName_QNAME, String.class, PobierzStatusyPrzesylekXml.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ms.gov.pl/msepo", name = "password", scope = PobierzStatusyPrzesylekXml.class)
    public JAXBElement<String> createPobierzStatusyPrzesylekXmlPassword(String value) {
        return new JAXBElement<String>(_PobierzStatusyPrzesylekPoNumerachNadawczychPassword_QNAME, String.class, PobierzStatusyPrzesylekXml.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ms.gov.pl/msepo", name = "apiKey", scope = PobierzStatusyPrzesylekXml.class)
    public JAXBElement<String> createPobierzStatusyPrzesylekXmlApiKey(String value) {
        return new JAXBElement<String>(_PobierzStatusyPrzesylekPoNumerachNadawczychApiKey_QNAME, String.class, PobierzStatusyPrzesylekXml.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ms.gov.pl/msepo", name = "sortColumn", scope = PobierzStatusyPrzesylekXml.class)
    public JAXBElement<String> createPobierzStatusyPrzesylekXmlSortColumn(String value) {
        return new JAXBElement<String>(_PobierzStatusyPrzesylekSortColumn_QNAME, String.class, PobierzStatusyPrzesylekXml.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ms.gov.pl/msepo", name = "sortDirection", scope = PobierzStatusyPrzesylekXml.class)
    public JAXBElement<String> createPobierzStatusyPrzesylekXmlSortDirection(String value) {
        return new JAXBElement<String>(_PobierzStatusyPrzesylekSortDirection_QNAME, String.class, PobierzStatusyPrzesylekXml.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfstringstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ms.gov.pl/msepo", name = "filtersValues", scope = PobierzStatusyPrzesylekXml.class)
    public JAXBElement<ArrayOfKeyValueOfstringstring> createPobierzStatusyPrzesylekXmlFiltersValues(ArrayOfKeyValueOfstringstring value) {
        return new JAXBElement<ArrayOfKeyValueOfstringstring>(_PobierzStatusyPrzesylekFiltersValues_QNAME, ArrayOfKeyValueOfstringstring.class, PobierzStatusyPrzesylekXml.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XmlOutputData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ms.gov.pl/msepo", name = "PobierzStatusyPrzesylekXmlResult", scope = PobierzStatusyPrzesylekXmlResponse.class)
    public JAXBElement<XmlOutputData> createPobierzStatusyPrzesylekXmlResponsePobierzStatusyPrzesylekXmlResult(XmlOutputData value) {
        return new JAXBElement<XmlOutputData>(_PobierzStatusyPrzesylekXmlResponsePobierzStatusyPrzesylekXmlResult_QNAME, XmlOutputData.class, PobierzStatusyPrzesylekXmlResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ms.gov.pl/msepo", name = "userName", scope = PobierzHistoriePrzesylkiPoNumerzeNadawczym.class)
    public JAXBElement<String> createPobierzHistoriePrzesylkiPoNumerzeNadawczymUserName(String value) {
        return new JAXBElement<String>(_PobierzStatusyPrzesylekPoNumerachNadawczychUserName_QNAME, String.class, PobierzHistoriePrzesylkiPoNumerzeNadawczym.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ms.gov.pl/msepo", name = "password", scope = PobierzHistoriePrzesylkiPoNumerzeNadawczym.class)
    public JAXBElement<String> createPobierzHistoriePrzesylkiPoNumerzeNadawczymPassword(String value) {
        return new JAXBElement<String>(_PobierzStatusyPrzesylekPoNumerachNadawczychPassword_QNAME, String.class, PobierzHistoriePrzesylkiPoNumerzeNadawczym.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ms.gov.pl/msepo", name = "apiKey", scope = PobierzHistoriePrzesylkiPoNumerzeNadawczym.class)
    public JAXBElement<String> createPobierzHistoriePrzesylkiPoNumerzeNadawczymApiKey(String value) {
        return new JAXBElement<String>(_PobierzStatusyPrzesylekPoNumerachNadawczychApiKey_QNAME, String.class, PobierzHistoriePrzesylkiPoNumerzeNadawczym.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ms.gov.pl/msepo", name = "numerNadawczy", scope = PobierzHistoriePrzesylkiPoNumerzeNadawczym.class)
    public JAXBElement<String> createPobierzHistoriePrzesylkiPoNumerzeNadawczymNumerNadawczy(String value) {
        return new JAXBElement<String>(_PobierzHistoriePrzesylkiPoNumerzeNadawczymNumerNadawczy_QNAME, String.class, PobierzHistoriePrzesylkiPoNumerzeNadawczym.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HistoriaPrzesylkiOutputData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ms.gov.pl/msepo", name = "PobierzHistoriePrzesylkiPoNumerzeNadawczymResult", scope = PobierzHistoriePrzesylkiPoNumerzeNadawczymResponse.class)
    public JAXBElement<HistoriaPrzesylkiOutputData> createPobierzHistoriePrzesylkiPoNumerzeNadawczymResponsePobierzHistoriePrzesylkiPoNumerzeNadawczymResult(HistoriaPrzesylkiOutputData value) {
        return new JAXBElement<HistoriaPrzesylkiOutputData>(_PobierzHistoriePrzesylkiPoNumerzeNadawczymResponsePobierzHistoriePrzesylkiPoNumerzeNadawczymResult_QNAME, HistoriaPrzesylkiOutputData.class, PobierzHistoriePrzesylkiPoNumerzeNadawczymResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ms.gov.pl/msepo", name = "userName", scope = PobierzHistoriePrzesylkiPoGuidPrzesylekZaOkres.class)
    public JAXBElement<String> createPobierzHistoriePrzesylkiPoGuidPrzesylekZaOkresUserName(String value) {
        return new JAXBElement<String>(_PobierzStatusyPrzesylekPoNumerachNadawczychUserName_QNAME, String.class, PobierzHistoriePrzesylkiPoGuidPrzesylekZaOkres.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ms.gov.pl/msepo", name = "password", scope = PobierzHistoriePrzesylkiPoGuidPrzesylekZaOkres.class)
    public JAXBElement<String> createPobierzHistoriePrzesylkiPoGuidPrzesylekZaOkresPassword(String value) {
        return new JAXBElement<String>(_PobierzStatusyPrzesylekPoNumerachNadawczychPassword_QNAME, String.class, PobierzHistoriePrzesylkiPoGuidPrzesylekZaOkres.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ms.gov.pl/msepo", name = "apiKey", scope = PobierzHistoriePrzesylkiPoGuidPrzesylekZaOkres.class)
    public JAXBElement<String> createPobierzHistoriePrzesylkiPoGuidPrzesylekZaOkresApiKey(String value) {
        return new JAXBElement<String>(_PobierzStatusyPrzesylekPoNumerachNadawczychApiKey_QNAME, String.class, PobierzHistoriePrzesylkiPoGuidPrzesylekZaOkres.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ms.gov.pl/msepo", name = "dataDo", scope = PobierzHistoriePrzesylkiPoGuidPrzesylekZaOkres.class)
    public JAXBElement<XMLGregorianCalendar> createPobierzHistoriePrzesylkiPoGuidPrzesylekZaOkresDataDo(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_PobierzStatusyPrzesylekZaOkresDataDo_QNAME, XMLGregorianCalendar.class, PobierzHistoriePrzesylkiPoGuidPrzesylekZaOkres.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfguid }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ms.gov.pl/msepo", name = "idPrzesylek", scope = PobierzHistoriePrzesylkiPoGuidPrzesylekZaOkres.class)
    public JAXBElement<ArrayOfguid> createPobierzHistoriePrzesylkiPoGuidPrzesylekZaOkresIdPrzesylek(ArrayOfguid value) {
        return new JAXBElement<ArrayOfguid>(_PobierzHistoriePrzesylkiPoGuidPrzesylekZaOkresIdPrzesylek_QNAME, ArrayOfguid.class, PobierzHistoriePrzesylkiPoGuidPrzesylekZaOkres.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HistoriaPrzesylkiOutputDataExtend }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ms.gov.pl/msepo", name = "PobierzHistoriePrzesylkiPoGuidPrzesylekZaOkresResult", scope = PobierzHistoriePrzesylkiPoGuidPrzesylekZaOkresResponse.class)
    public JAXBElement<HistoriaPrzesylkiOutputDataExtend> createPobierzHistoriePrzesylkiPoGuidPrzesylekZaOkresResponsePobierzHistoriePrzesylkiPoGuidPrzesylekZaOkresResult(HistoriaPrzesylkiOutputDataExtend value) {
        return new JAXBElement<HistoriaPrzesylkiOutputDataExtend>(_PobierzHistoriePrzesylkiPoGuidPrzesylekZaOkresResponsePobierzHistoriePrzesylkiPoGuidPrzesylekZaOkresResult_QNAME, HistoriaPrzesylkiOutputDataExtend.class, PobierzHistoriePrzesylkiPoGuidPrzesylekZaOkresResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ms.gov.pl/msepo", name = "userName", scope = PobierzHistoriePrzesylkiPoGuidPrzesylki.class)
    public JAXBElement<String> createPobierzHistoriePrzesylkiPoGuidPrzesylkiUserName(String value) {
        return new JAXBElement<String>(_PobierzStatusyPrzesylekPoNumerachNadawczychUserName_QNAME, String.class, PobierzHistoriePrzesylkiPoGuidPrzesylki.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ms.gov.pl/msepo", name = "password", scope = PobierzHistoriePrzesylkiPoGuidPrzesylki.class)
    public JAXBElement<String> createPobierzHistoriePrzesylkiPoGuidPrzesylkiPassword(String value) {
        return new JAXBElement<String>(_PobierzStatusyPrzesylekPoNumerachNadawczychPassword_QNAME, String.class, PobierzHistoriePrzesylkiPoGuidPrzesylki.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ms.gov.pl/msepo", name = "apiKey", scope = PobierzHistoriePrzesylkiPoGuidPrzesylki.class)
    public JAXBElement<String> createPobierzHistoriePrzesylkiPoGuidPrzesylkiApiKey(String value) {
        return new JAXBElement<String>(_PobierzStatusyPrzesylekPoNumerachNadawczychApiKey_QNAME, String.class, PobierzHistoriePrzesylkiPoGuidPrzesylki.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HistoriaPrzesylkiOutputData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ms.gov.pl/msepo", name = "PobierzHistoriePrzesylkiPoGuidPrzesylkiResult", scope = PobierzHistoriePrzesylkiPoGuidPrzesylkiResponse.class)
    public JAXBElement<HistoriaPrzesylkiOutputData> createPobierzHistoriePrzesylkiPoGuidPrzesylkiResponsePobierzHistoriePrzesylkiPoGuidPrzesylkiResult(HistoriaPrzesylkiOutputData value) {
        return new JAXBElement<HistoriaPrzesylkiOutputData>(_PobierzHistoriePrzesylkiPoGuidPrzesylkiResponsePobierzHistoriePrzesylkiPoGuidPrzesylkiResult_QNAME, HistoriaPrzesylkiOutputData.class, PobierzHistoriePrzesylkiPoGuidPrzesylkiResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ms.gov.pl/msepo", name = "userName", scope = PobierzHistoriePrzesylkiPoNumerzeNadawczymXml.class)
    public JAXBElement<String> createPobierzHistoriePrzesylkiPoNumerzeNadawczymXmlUserName(String value) {
        return new JAXBElement<String>(_PobierzStatusyPrzesylekPoNumerachNadawczychUserName_QNAME, String.class, PobierzHistoriePrzesylkiPoNumerzeNadawczymXml.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ms.gov.pl/msepo", name = "password", scope = PobierzHistoriePrzesylkiPoNumerzeNadawczymXml.class)
    public JAXBElement<String> createPobierzHistoriePrzesylkiPoNumerzeNadawczymXmlPassword(String value) {
        return new JAXBElement<String>(_PobierzStatusyPrzesylekPoNumerachNadawczychPassword_QNAME, String.class, PobierzHistoriePrzesylkiPoNumerzeNadawczymXml.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ms.gov.pl/msepo", name = "apiKey", scope = PobierzHistoriePrzesylkiPoNumerzeNadawczymXml.class)
    public JAXBElement<String> createPobierzHistoriePrzesylkiPoNumerzeNadawczymXmlApiKey(String value) {
        return new JAXBElement<String>(_PobierzStatusyPrzesylekPoNumerachNadawczychApiKey_QNAME, String.class, PobierzHistoriePrzesylkiPoNumerzeNadawczymXml.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ms.gov.pl/msepo", name = "numerNadawczy", scope = PobierzHistoriePrzesylkiPoNumerzeNadawczymXml.class)
    public JAXBElement<String> createPobierzHistoriePrzesylkiPoNumerzeNadawczymXmlNumerNadawczy(String value) {
        return new JAXBElement<String>(_PobierzHistoriePrzesylkiPoNumerzeNadawczymNumerNadawczy_QNAME, String.class, PobierzHistoriePrzesylkiPoNumerzeNadawczymXml.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XmlOutputData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ms.gov.pl/msepo", name = "PobierzHistoriePrzesylkiPoNumerzeNadawczymXmlResult", scope = PobierzHistoriePrzesylkiPoNumerzeNadawczymXmlResponse.class)
    public JAXBElement<XmlOutputData> createPobierzHistoriePrzesylkiPoNumerzeNadawczymXmlResponsePobierzHistoriePrzesylkiPoNumerzeNadawczymXmlResult(XmlOutputData value) {
        return new JAXBElement<XmlOutputData>(_PobierzHistoriePrzesylkiPoNumerzeNadawczymXmlResponsePobierzHistoriePrzesylkiPoNumerzeNadawczymXmlResult_QNAME, XmlOutputData.class, PobierzHistoriePrzesylkiPoNumerzeNadawczymXmlResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ms.gov.pl/msepo", name = "userName", scope = PobierzHistoriePrzesylkiPoGuidPrzesylkiXml.class)
    public JAXBElement<String> createPobierzHistoriePrzesylkiPoGuidPrzesylkiXmlUserName(String value) {
        return new JAXBElement<String>(_PobierzStatusyPrzesylekPoNumerachNadawczychUserName_QNAME, String.class, PobierzHistoriePrzesylkiPoGuidPrzesylkiXml.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ms.gov.pl/msepo", name = "password", scope = PobierzHistoriePrzesylkiPoGuidPrzesylkiXml.class)
    public JAXBElement<String> createPobierzHistoriePrzesylkiPoGuidPrzesylkiXmlPassword(String value) {
        return new JAXBElement<String>(_PobierzStatusyPrzesylekPoNumerachNadawczychPassword_QNAME, String.class, PobierzHistoriePrzesylkiPoGuidPrzesylkiXml.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ms.gov.pl/msepo", name = "apiKey", scope = PobierzHistoriePrzesylkiPoGuidPrzesylkiXml.class)
    public JAXBElement<String> createPobierzHistoriePrzesylkiPoGuidPrzesylkiXmlApiKey(String value) {
        return new JAXBElement<String>(_PobierzStatusyPrzesylekPoNumerachNadawczychApiKey_QNAME, String.class, PobierzHistoriePrzesylkiPoGuidPrzesylkiXml.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XmlOutputData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ms.gov.pl/msepo", name = "PobierzHistoriePrzesylkiPoGuidPrzesylkiXmlResult", scope = PobierzHistoriePrzesylkiPoGuidPrzesylkiXmlResponse.class)
    public JAXBElement<XmlOutputData> createPobierzHistoriePrzesylkiPoGuidPrzesylkiXmlResponsePobierzHistoriePrzesylkiPoGuidPrzesylkiXmlResult(XmlOutputData value) {
        return new JAXBElement<XmlOutputData>(_PobierzHistoriePrzesylkiPoGuidPrzesylkiXmlResponsePobierzHistoriePrzesylkiPoGuidPrzesylkiXmlResult_QNAME, XmlOutputData.class, PobierzHistoriePrzesylkiPoGuidPrzesylkiXmlResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ms.gov.pl/msepo", name = "userName", scope = ImportZbioruEkn.class)
    public JAXBElement<String> createImportZbioruEknUserName(String value) {
        return new JAXBElement<String>(_PobierzStatusyPrzesylekPoNumerachNadawczychUserName_QNAME, String.class, ImportZbioruEkn.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ms.gov.pl/msepo", name = "password", scope = ImportZbioruEkn.class)
    public JAXBElement<String> createImportZbioruEknPassword(String value) {
        return new JAXBElement<String>(_PobierzStatusyPrzesylekPoNumerachNadawczychPassword_QNAME, String.class, ImportZbioruEkn.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ms.gov.pl/msepo", name = "apiKey", scope = ImportZbioruEkn.class)
    public JAXBElement<String> createImportZbioruEknApiKey(String value) {
        return new JAXBElement<String>(_PobierzStatusyPrzesylekPoNumerachNadawczychApiKey_QNAME, String.class, ImportZbioruEkn.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ms.gov.pl/msepo", name = "xml", scope = ImportZbioruEkn.class)
    public JAXBElement<String> createImportZbioruEknXml(String value) {
        return new JAXBElement<String>(_ImportZbioruEknXml_QNAME, String.class, ImportZbioruEkn.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ImportZbiorEknOutputData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ms.gov.pl/msepo", name = "ImportZbioruEknResult", scope = ImportZbioruEknResponse.class)
    public JAXBElement<ImportZbiorEknOutputData> createImportZbioruEknResponseImportZbioruEknResult(ImportZbiorEknOutputData value) {
        return new JAXBElement<ImportZbiorEknOutputData>(_ImportZbioruEknResponseImportZbioruEknResult_QNAME, ImportZbiorEknOutputData.class, ImportZbioruEknResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ms.gov.pl/msepo", name = "userName", scope = ImportZbioruEknBase64 .class)
    public JAXBElement<String> createImportZbioruEknBase64UserName(String value) {
        return new JAXBElement<String>(_PobierzStatusyPrzesylekPoNumerachNadawczychUserName_QNAME, String.class, ImportZbioruEknBase64 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ms.gov.pl/msepo", name = "password", scope = ImportZbioruEknBase64 .class)
    public JAXBElement<String> createImportZbioruEknBase64Password(String value) {
        return new JAXBElement<String>(_PobierzStatusyPrzesylekPoNumerachNadawczychPassword_QNAME, String.class, ImportZbioruEknBase64 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ms.gov.pl/msepo", name = "apiKey", scope = ImportZbioruEknBase64 .class)
    public JAXBElement<String> createImportZbioruEknBase64ApiKey(String value) {
        return new JAXBElement<String>(_PobierzStatusyPrzesylekPoNumerachNadawczychApiKey_QNAME, String.class, ImportZbioruEknBase64 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ms.gov.pl/msepo", name = "base64xml", scope = ImportZbioruEknBase64 .class)
    public JAXBElement<String> createImportZbioruEknBase64Base64Xml(String value) {
        return new JAXBElement<String>(_ImportZbioruEknBase64Base64Xml_QNAME, String.class, ImportZbioruEknBase64 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ImportZbiorEknOutputData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ms.gov.pl/msepo", name = "ImportZbioruEknBase64Result", scope = ImportZbioruEknBase64Response.class)
    public JAXBElement<ImportZbiorEknOutputData> createImportZbioruEknBase64ResponseImportZbioruEknBase64Result(ImportZbiorEknOutputData value) {
        return new JAXBElement<ImportZbiorEknOutputData>(_ImportZbioruEknBase64ResponseImportZbioruEknBase64Result_QNAME, ImportZbiorEknOutputData.class, ImportZbioruEknBase64Response.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ms.gov.pl/msepo", name = "userName", scope = ImportZbioruEknZip.class)
    public JAXBElement<String> createImportZbioruEknZipUserName(String value) {
        return new JAXBElement<String>(_PobierzStatusyPrzesylekPoNumerachNadawczychUserName_QNAME, String.class, ImportZbioruEknZip.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ms.gov.pl/msepo", name = "password", scope = ImportZbioruEknZip.class)
    public JAXBElement<String> createImportZbioruEknZipPassword(String value) {
        return new JAXBElement<String>(_PobierzStatusyPrzesylekPoNumerachNadawczychPassword_QNAME, String.class, ImportZbioruEknZip.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ms.gov.pl/msepo", name = "apiKey", scope = ImportZbioruEknZip.class)
    public JAXBElement<String> createImportZbioruEknZipApiKey(String value) {
        return new JAXBElement<String>(_PobierzStatusyPrzesylekPoNumerachNadawczychApiKey_QNAME, String.class, ImportZbioruEknZip.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ms.gov.pl/msepo", name = "zipFile", scope = ImportZbioruEknZip.class)
    public JAXBElement<String> createImportZbioruEknZipZipFile(String value) {
        return new JAXBElement<String>(_ImportZbioruEknZipZipFile_QNAME, String.class, ImportZbioruEknZip.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ImportZbiorEknOutputData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ms.gov.pl/msepo", name = "ImportZbioruEknZipResult", scope = ImportZbioruEknZipResponse.class)
    public JAXBElement<ImportZbiorEknOutputData> createImportZbioruEknZipResponseImportZbioruEknZipResult(ImportZbiorEknOutputData value) {
        return new JAXBElement<ImportZbiorEknOutputData>(_ImportZbioruEknZipResponseImportZbioruEknZipResult_QNAME, ImportZbiorEknOutputData.class, ImportZbioruEknZipResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ms.gov.pl/msepo", name = "userName", scope = NadanieZbioruEknZip.class)
    public JAXBElement<String> createNadanieZbioruEknZipUserName(String value) {
        return new JAXBElement<String>(_PobierzStatusyPrzesylekPoNumerachNadawczychUserName_QNAME, String.class, NadanieZbioruEknZip.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ms.gov.pl/msepo", name = "password", scope = NadanieZbioruEknZip.class)
    public JAXBElement<String> createNadanieZbioruEknZipPassword(String value) {
        return new JAXBElement<String>(_PobierzStatusyPrzesylekPoNumerachNadawczychPassword_QNAME, String.class, NadanieZbioruEknZip.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ms.gov.pl/msepo", name = "apiKey", scope = NadanieZbioruEknZip.class)
    public JAXBElement<String> createNadanieZbioruEknZipApiKey(String value) {
        return new JAXBElement<String>(_PobierzStatusyPrzesylekPoNumerachNadawczychApiKey_QNAME, String.class, NadanieZbioruEknZip.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ms.gov.pl/msepo", name = "zipFile", scope = NadanieZbioruEknZip.class)
    public JAXBElement<String> createNadanieZbioruEknZipZipFile(String value) {
        return new JAXBElement<String>(_ImportZbioruEknZipZipFile_QNAME, String.class, NadanieZbioruEknZip.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NadajZbiorEknOutputData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ms.gov.pl/msepo", name = "NadanieZbioruEknZipResult", scope = NadanieZbioruEknZipResponse.class)
    public JAXBElement<NadajZbiorEknOutputData> createNadanieZbioruEknZipResponseNadanieZbioruEknZipResult(NadajZbiorEknOutputData value) {
        return new JAXBElement<NadajZbiorEknOutputData>(_NadanieZbioruEknZipResponseNadanieZbioruEknZipResult_QNAME, NadajZbiorEknOutputData.class, NadanieZbioruEknZipResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ms.gov.pl/msepo", name = "userName", scope = NadanieZbioruEkn.class)
    public JAXBElement<String> createNadanieZbioruEknUserName(String value) {
        return new JAXBElement<String>(_PobierzStatusyPrzesylekPoNumerachNadawczychUserName_QNAME, String.class, NadanieZbioruEkn.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ms.gov.pl/msepo", name = "password", scope = NadanieZbioruEkn.class)
    public JAXBElement<String> createNadanieZbioruEknPassword(String value) {
        return new JAXBElement<String>(_PobierzStatusyPrzesylekPoNumerachNadawczychPassword_QNAME, String.class, NadanieZbioruEkn.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ms.gov.pl/msepo", name = "apiKey", scope = NadanieZbioruEkn.class)
    public JAXBElement<String> createNadanieZbioruEknApiKey(String value) {
        return new JAXBElement<String>(_PobierzStatusyPrzesylekPoNumerachNadawczychApiKey_QNAME, String.class, NadanieZbioruEkn.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ms.gov.pl/msepo", name = "xml", scope = NadanieZbioruEkn.class)
    public JAXBElement<String> createNadanieZbioruEknXml(String value) {
        return new JAXBElement<String>(_ImportZbioruEknXml_QNAME, String.class, NadanieZbioruEkn.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NadajZbiorEknOutputData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ms.gov.pl/msepo", name = "NadanieZbioruEknResult", scope = NadanieZbioruEknResponse.class)
    public JAXBElement<NadajZbiorEknOutputData> createNadanieZbioruEknResponseNadanieZbioruEknResult(NadajZbiorEknOutputData value) {
        return new JAXBElement<NadajZbiorEknOutputData>(_NadanieZbioruEknResponseNadanieZbioruEknResult_QNAME, NadajZbiorEknOutputData.class, NadanieZbioruEknResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ms.gov.pl/msepo", name = "userName", scope = NadanieZbioruEknBase64 .class)
    public JAXBElement<String> createNadanieZbioruEknBase64UserName(String value) {
        return new JAXBElement<String>(_PobierzStatusyPrzesylekPoNumerachNadawczychUserName_QNAME, String.class, NadanieZbioruEknBase64 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ms.gov.pl/msepo", name = "password", scope = NadanieZbioruEknBase64 .class)
    public JAXBElement<String> createNadanieZbioruEknBase64Password(String value) {
        return new JAXBElement<String>(_PobierzStatusyPrzesylekPoNumerachNadawczychPassword_QNAME, String.class, NadanieZbioruEknBase64 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ms.gov.pl/msepo", name = "apiKey", scope = NadanieZbioruEknBase64 .class)
    public JAXBElement<String> createNadanieZbioruEknBase64ApiKey(String value) {
        return new JAXBElement<String>(_PobierzStatusyPrzesylekPoNumerachNadawczychApiKey_QNAME, String.class, NadanieZbioruEknBase64 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ms.gov.pl/msepo", name = "base64xml", scope = NadanieZbioruEknBase64 .class)
    public JAXBElement<String> createNadanieZbioruEknBase64Base64Xml(String value) {
        return new JAXBElement<String>(_ImportZbioruEknBase64Base64Xml_QNAME, String.class, NadanieZbioruEknBase64 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NadajZbiorEknOutputData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ms.gov.pl/msepo", name = "NadanieZbioruEknBase64Result", scope = NadanieZbioruEknBase64Response.class)
    public JAXBElement<NadajZbiorEknOutputData> createNadanieZbioruEknBase64ResponseNadanieZbioruEknBase64Result(NadajZbiorEknOutputData value) {
        return new JAXBElement<NadajZbiorEknOutputData>(_NadanieZbioruEknBase64ResponseNadanieZbioruEknBase64Result_QNAME, NadajZbiorEknOutputData.class, NadanieZbioruEknBase64Response.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ms.gov.pl/msepo", name = "userName", scope = PobierzPdfPotwierdzeniaDoreczenPoNumerachNadawczych.class)
    public JAXBElement<String> createPobierzPdfPotwierdzeniaDoreczenPoNumerachNadawczychUserName(String value) {
        return new JAXBElement<String>(_PobierzStatusyPrzesylekPoNumerachNadawczychUserName_QNAME, String.class, PobierzPdfPotwierdzeniaDoreczenPoNumerachNadawczych.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ms.gov.pl/msepo", name = "password", scope = PobierzPdfPotwierdzeniaDoreczenPoNumerachNadawczych.class)
    public JAXBElement<String> createPobierzPdfPotwierdzeniaDoreczenPoNumerachNadawczychPassword(String value) {
        return new JAXBElement<String>(_PobierzStatusyPrzesylekPoNumerachNadawczychPassword_QNAME, String.class, PobierzPdfPotwierdzeniaDoreczenPoNumerachNadawczych.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ms.gov.pl/msepo", name = "apiKey", scope = PobierzPdfPotwierdzeniaDoreczenPoNumerachNadawczych.class)
    public JAXBElement<String> createPobierzPdfPotwierdzeniaDoreczenPoNumerachNadawczychApiKey(String value) {
        return new JAXBElement<String>(_PobierzStatusyPrzesylekPoNumerachNadawczychApiKey_QNAME, String.class, PobierzPdfPotwierdzeniaDoreczenPoNumerachNadawczych.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ms.gov.pl/msepo", name = "numeryNadawcze", scope = PobierzPdfPotwierdzeniaDoreczenPoNumerachNadawczych.class)
    public JAXBElement<ArrayOfstring> createPobierzPdfPotwierdzeniaDoreczenPoNumerachNadawczychNumeryNadawcze(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_PobierzStatusyPrzesylekPoNumerachNadawczychNumeryNadawcze_QNAME, ArrayOfstring.class, PobierzPdfPotwierdzeniaDoreczenPoNumerachNadawczych.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListaDoreczenPdfOutputData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ms.gov.pl/msepo", name = "PobierzPdfPotwierdzeniaDoreczenPoNumerachNadawczychResult", scope = PobierzPdfPotwierdzeniaDoreczenPoNumerachNadawczychResponse.class)
    public JAXBElement<ListaDoreczenPdfOutputData> createPobierzPdfPotwierdzeniaDoreczenPoNumerachNadawczychResponsePobierzPdfPotwierdzeniaDoreczenPoNumerachNadawczychResult(ListaDoreczenPdfOutputData value) {
        return new JAXBElement<ListaDoreczenPdfOutputData>(_PobierzPdfPotwierdzeniaDoreczenPoNumerachNadawczychResponsePobierzPdfPotwierdzeniaDoreczenPoNumerachNadawczychResult_QNAME, ListaDoreczenPdfOutputData.class, PobierzPdfPotwierdzeniaDoreczenPoNumerachNadawczychResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ms.gov.pl/msepo", name = "userName", scope = PobierzPdfPotwierdzeniaDoreczenPoGuidach.class)
    public JAXBElement<String> createPobierzPdfPotwierdzeniaDoreczenPoGuidachUserName(String value) {
        return new JAXBElement<String>(_PobierzStatusyPrzesylekPoNumerachNadawczychUserName_QNAME, String.class, PobierzPdfPotwierdzeniaDoreczenPoGuidach.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ms.gov.pl/msepo", name = "password", scope = PobierzPdfPotwierdzeniaDoreczenPoGuidach.class)
    public JAXBElement<String> createPobierzPdfPotwierdzeniaDoreczenPoGuidachPassword(String value) {
        return new JAXBElement<String>(_PobierzStatusyPrzesylekPoNumerachNadawczychPassword_QNAME, String.class, PobierzPdfPotwierdzeniaDoreczenPoGuidach.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ms.gov.pl/msepo", name = "apiKey", scope = PobierzPdfPotwierdzeniaDoreczenPoGuidach.class)
    public JAXBElement<String> createPobierzPdfPotwierdzeniaDoreczenPoGuidachApiKey(String value) {
        return new JAXBElement<String>(_PobierzStatusyPrzesylekPoNumerachNadawczychApiKey_QNAME, String.class, PobierzPdfPotwierdzeniaDoreczenPoGuidach.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfguid }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ms.gov.pl/msepo", name = "guidPrzesylki", scope = PobierzPdfPotwierdzeniaDoreczenPoGuidach.class)
    public JAXBElement<ArrayOfguid> createPobierzPdfPotwierdzeniaDoreczenPoGuidachGuidPrzesylki(ArrayOfguid value) {
        return new JAXBElement<ArrayOfguid>(_PobierzStatusyPrzesylekPoGuidachGuidPrzesylki_QNAME, ArrayOfguid.class, PobierzPdfPotwierdzeniaDoreczenPoGuidach.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListaDoreczenPdfOutputData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ms.gov.pl/msepo", name = "PobierzPdfPotwierdzeniaDoreczenPoGuidachResult", scope = PobierzPdfPotwierdzeniaDoreczenPoGuidachResponse.class)
    public JAXBElement<ListaDoreczenPdfOutputData> createPobierzPdfPotwierdzeniaDoreczenPoGuidachResponsePobierzPdfPotwierdzeniaDoreczenPoGuidachResult(ListaDoreczenPdfOutputData value) {
        return new JAXBElement<ListaDoreczenPdfOutputData>(_PobierzPdfPotwierdzeniaDoreczenPoGuidachResponsePobierzPdfPotwierdzeniaDoreczenPoGuidachResult_QNAME, ListaDoreczenPdfOutputData.class, PobierzPdfPotwierdzeniaDoreczenPoGuidachResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ms.gov.pl/msepo", name = "userName", scope = PobierzXmlPotwierdzeniaDoreczenPoNumerachNadawczych.class)
    public JAXBElement<String> createPobierzXmlPotwierdzeniaDoreczenPoNumerachNadawczychUserName(String value) {
        return new JAXBElement<String>(_PobierzStatusyPrzesylekPoNumerachNadawczychUserName_QNAME, String.class, PobierzXmlPotwierdzeniaDoreczenPoNumerachNadawczych.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ms.gov.pl/msepo", name = "password", scope = PobierzXmlPotwierdzeniaDoreczenPoNumerachNadawczych.class)
    public JAXBElement<String> createPobierzXmlPotwierdzeniaDoreczenPoNumerachNadawczychPassword(String value) {
        return new JAXBElement<String>(_PobierzStatusyPrzesylekPoNumerachNadawczychPassword_QNAME, String.class, PobierzXmlPotwierdzeniaDoreczenPoNumerachNadawczych.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ms.gov.pl/msepo", name = "apiKey", scope = PobierzXmlPotwierdzeniaDoreczenPoNumerachNadawczych.class)
    public JAXBElement<String> createPobierzXmlPotwierdzeniaDoreczenPoNumerachNadawczychApiKey(String value) {
        return new JAXBElement<String>(_PobierzStatusyPrzesylekPoNumerachNadawczychApiKey_QNAME, String.class, PobierzXmlPotwierdzeniaDoreczenPoNumerachNadawczych.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ms.gov.pl/msepo", name = "numeryNadawcze", scope = PobierzXmlPotwierdzeniaDoreczenPoNumerachNadawczych.class)
    public JAXBElement<ArrayOfstring> createPobierzXmlPotwierdzeniaDoreczenPoNumerachNadawczychNumeryNadawcze(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_PobierzStatusyPrzesylekPoNumerachNadawczychNumeryNadawcze_QNAME, ArrayOfstring.class, PobierzXmlPotwierdzeniaDoreczenPoNumerachNadawczych.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XmlOutputData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ms.gov.pl/msepo", name = "PobierzXmlPotwierdzeniaDoreczenPoNumerachNadawczychResult", scope = PobierzXmlPotwierdzeniaDoreczenPoNumerachNadawczychResponse.class)
    public JAXBElement<XmlOutputData> createPobierzXmlPotwierdzeniaDoreczenPoNumerachNadawczychResponsePobierzXmlPotwierdzeniaDoreczenPoNumerachNadawczychResult(XmlOutputData value) {
        return new JAXBElement<XmlOutputData>(_PobierzXmlPotwierdzeniaDoreczenPoNumerachNadawczychResponsePobierzXmlPotwierdzeniaDoreczenPoNumerachNadawczychResult_QNAME, XmlOutputData.class, PobierzXmlPotwierdzeniaDoreczenPoNumerachNadawczychResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ms.gov.pl/msepo", name = "userName", scope = PobierzXmlPotwierdzeniaDoreczenPoGuidach.class)
    public JAXBElement<String> createPobierzXmlPotwierdzeniaDoreczenPoGuidachUserName(String value) {
        return new JAXBElement<String>(_PobierzStatusyPrzesylekPoNumerachNadawczychUserName_QNAME, String.class, PobierzXmlPotwierdzeniaDoreczenPoGuidach.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ms.gov.pl/msepo", name = "password", scope = PobierzXmlPotwierdzeniaDoreczenPoGuidach.class)
    public JAXBElement<String> createPobierzXmlPotwierdzeniaDoreczenPoGuidachPassword(String value) {
        return new JAXBElement<String>(_PobierzStatusyPrzesylekPoNumerachNadawczychPassword_QNAME, String.class, PobierzXmlPotwierdzeniaDoreczenPoGuidach.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ms.gov.pl/msepo", name = "apiKey", scope = PobierzXmlPotwierdzeniaDoreczenPoGuidach.class)
    public JAXBElement<String> createPobierzXmlPotwierdzeniaDoreczenPoGuidachApiKey(String value) {
        return new JAXBElement<String>(_PobierzStatusyPrzesylekPoNumerachNadawczychApiKey_QNAME, String.class, PobierzXmlPotwierdzeniaDoreczenPoGuidach.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfguid }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ms.gov.pl/msepo", name = "guidPrzesylki", scope = PobierzXmlPotwierdzeniaDoreczenPoGuidach.class)
    public JAXBElement<ArrayOfguid> createPobierzXmlPotwierdzeniaDoreczenPoGuidachGuidPrzesylki(ArrayOfguid value) {
        return new JAXBElement<ArrayOfguid>(_PobierzStatusyPrzesylekPoGuidachGuidPrzesylki_QNAME, ArrayOfguid.class, PobierzXmlPotwierdzeniaDoreczenPoGuidach.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XmlOutputData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ms.gov.pl/msepo", name = "PobierzXmlPotwierdzeniaDoreczenPoGuidachResult", scope = PobierzXmlPotwierdzeniaDoreczenPoGuidachResponse.class)
    public JAXBElement<XmlOutputData> createPobierzXmlPotwierdzeniaDoreczenPoGuidachResponsePobierzXmlPotwierdzeniaDoreczenPoGuidachResult(XmlOutputData value) {
        return new JAXBElement<XmlOutputData>(_PobierzXmlPotwierdzeniaDoreczenPoGuidachResponsePobierzXmlPotwierdzeniaDoreczenPoGuidachResult_QNAME, XmlOutputData.class, PobierzXmlPotwierdzeniaDoreczenPoGuidachResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ms.gov.pl/msepo", name = "userName", scope = PobierzKodyPocztowe.class)
    public JAXBElement<String> createPobierzKodyPocztoweUserName(String value) {
        return new JAXBElement<String>(_PobierzStatusyPrzesylekPoNumerachNadawczychUserName_QNAME, String.class, PobierzKodyPocztowe.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ms.gov.pl/msepo", name = "password", scope = PobierzKodyPocztowe.class)
    public JAXBElement<String> createPobierzKodyPocztowePassword(String value) {
        return new JAXBElement<String>(_PobierzStatusyPrzesylekPoNumerachNadawczychPassword_QNAME, String.class, PobierzKodyPocztowe.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ms.gov.pl/msepo", name = "apiKey", scope = PobierzKodyPocztowe.class)
    public JAXBElement<String> createPobierzKodyPocztoweApiKey(String value) {
        return new JAXBElement<String>(_PobierzStatusyPrzesylekPoNumerachNadawczychApiKey_QNAME, String.class, PobierzKodyPocztowe.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ms.gov.pl/msepo", name = "dataOd", scope = PobierzKodyPocztowe.class)
    public JAXBElement<XMLGregorianCalendar> createPobierzKodyPocztoweDataOd(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_PobierzKodyPocztoweDataOd_QNAME, XMLGregorianCalendar.class, PobierzKodyPocztowe.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ms.gov.pl/msepo", name = "dataDo", scope = PobierzKodyPocztowe.class)
    public JAXBElement<XMLGregorianCalendar> createPobierzKodyPocztoweDataDo(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_PobierzStatusyPrzesylekZaOkresDataDo_QNAME, XMLGregorianCalendar.class, PobierzKodyPocztowe.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ms.gov.pl/msepo", name = "maska", scope = PobierzKodyPocztowe.class)
    public JAXBElement<String> createPobierzKodyPocztoweMaska(String value) {
        return new JAXBElement<String>(_PobierzKodyPocztoweMaska_QNAME, String.class, PobierzKodyPocztowe.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KodPocztowyOutputData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ms.gov.pl/msepo", name = "PobierzKodyPocztoweResult", scope = PobierzKodyPocztoweResponse.class)
    public JAXBElement<KodPocztowyOutputData> createPobierzKodyPocztoweResponsePobierzKodyPocztoweResult(KodPocztowyOutputData value) {
        return new JAXBElement<KodPocztowyOutputData>(_PobierzKodyPocztoweResponsePobierzKodyPocztoweResult_QNAME, KodPocztowyOutputData.class, PobierzKodyPocztoweResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ms.gov.pl/msepo", name = "userName", scope = PobierzListeStatusowPrzesylek.class)
    public JAXBElement<String> createPobierzListeStatusowPrzesylekUserName(String value) {
        return new JAXBElement<String>(_PobierzStatusyPrzesylekPoNumerachNadawczychUserName_QNAME, String.class, PobierzListeStatusowPrzesylek.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ms.gov.pl/msepo", name = "password", scope = PobierzListeStatusowPrzesylek.class)
    public JAXBElement<String> createPobierzListeStatusowPrzesylekPassword(String value) {
        return new JAXBElement<String>(_PobierzStatusyPrzesylekPoNumerachNadawczychPassword_QNAME, String.class, PobierzListeStatusowPrzesylek.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ms.gov.pl/msepo", name = "apiKey", scope = PobierzListeStatusowPrzesylek.class)
    public JAXBElement<String> createPobierzListeStatusowPrzesylekApiKey(String value) {
        return new JAXBElement<String>(_PobierzStatusyPrzesylekPoNumerachNadawczychApiKey_QNAME, String.class, PobierzListeStatusowPrzesylek.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StatusPrzesylkiOutputData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ms.gov.pl/msepo", name = "PobierzListeStatusowPrzesylekResult", scope = PobierzListeStatusowPrzesylekResponse.class)
    public JAXBElement<StatusPrzesylkiOutputData> createPobierzListeStatusowPrzesylekResponsePobierzListeStatusowPrzesylekResult(StatusPrzesylkiOutputData value) {
        return new JAXBElement<StatusPrzesylkiOutputData>(_PobierzListeStatusowPrzesylekResponsePobierzListeStatusowPrzesylekResult_QNAME, StatusPrzesylkiOutputData.class, PobierzListeStatusowPrzesylekResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApiOutputData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ms.gov.pl/msepo", name = "PobierzWersjeApiResult", scope = PobierzWersjeApiResponse.class)
    public JAXBElement<ApiOutputData> createPobierzWersjeApiResponsePobierzWersjeApiResult(ApiOutputData value) {
        return new JAXBElement<ApiOutputData>(_PobierzWersjeApiResponsePobierzWersjeApiResult_QNAME, ApiOutputData.class, PobierzWersjeApiResponse.class, value);
    }

}


package org.datacontract.schemas._2004._07.epowslib;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import org.datacontract.schemas._2004._07.domain.GeneralPrzesylkaStatus;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.datacontract.schemas._2004._07.epowslib package. 
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

    private final static QName _PrzesylkiOutputData_QNAME = new QName("http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", "PrzesylkiOutputData");
    private final static QName _PageOutputData_QNAME = new QName("http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", "PageOutputData");
    private final static QName _OutputData_QNAME = new QName("http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", "OutputData");
    private final static QName _KodOdpowiedzi_QNAME = new QName("http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", "KodOdpowiedzi");
    private final static QName _ArrayOfPrzesylkaOutputElement_QNAME = new QName("http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", "ArrayOfPrzesylkaOutputElement");
    private final static QName _PrzesylkaOutputElement_QNAME = new QName("http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", "PrzesylkaOutputElement");
    private final static QName _PlacowkaData_QNAME = new QName("http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", "PlacowkaData");
    private final static QName _PrzesylkiOutputShortData_QNAME = new QName("http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", "PrzesylkiOutputShortData");
    private final static QName _ArrayOfPrzesylkaOutputShortElement_QNAME = new QName("http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", "ArrayOfPrzesylkaOutputShortElement");
    private final static QName _PrzesylkaOutputShortElement_QNAME = new QName("http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", "PrzesylkaOutputShortElement");
    private final static QName _HistoryActionDate_QNAME = new QName("http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", "HistoryActionDate");
    private final static QName _DateTypes_QNAME = new QName("http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", "DateTypes");
    private final static QName _GuidOutputElement_QNAME = new QName("http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", "GuidOutputElement");
    private final static QName _GuidOutputData_QNAME = new QName("http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", "GuidOutputData");
    private final static QName _NumerNadawczyOutputData_QNAME = new QName("http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", "NumerNadawczyOutputData");
    private final static QName _NumerNadawczyOutputElement_QNAME = new QName("http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", "NumerNadawczyOutputElement");
    private final static QName _XmlOutputData_QNAME = new QName("http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", "XmlOutputData");
    private final static QName _HistoriaPrzesylkiOutputData_QNAME = new QName("http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", "HistoriaPrzesylkiOutputData");
    private final static QName _ArrayOfHistoriaPrzesylkiOutputElement_QNAME = new QName("http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", "ArrayOfHistoriaPrzesylkiOutputElement");
    private final static QName _HistoriaPrzesylkiOutputElement_QNAME = new QName("http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", "HistoriaPrzesylkiOutputElement");
    private final static QName _KartaEPOData_QNAME = new QName("http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", "KartaEPOData");
    private final static QName _PrzesylkaData_QNAME = new QName("http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", "PrzesylkaData");
    private final static QName _StatusPrzesylkiData_QNAME = new QName("http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", "StatusPrzesylkiData");
    private final static QName _UserData_QNAME = new QName("http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", "UserData");
    private final static QName _HistoriaPrzesylkiOutputDataExtend_QNAME = new QName("http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", "HistoriaPrzesylkiOutputDataExtend");
    private final static QName _ImportZbiorEknOutputData_QNAME = new QName("http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", "ImportZbiorEknOutputData");
    private final static QName _ArrayOfImportEknWynikWalidacjiOutputElement_QNAME = new QName("http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", "ArrayOfImportEknWynikWalidacjiOutputElement");
    private final static QName _ImportEknWynikWalidacjiOutputElement_QNAME = new QName("http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", "ImportEknWynikWalidacjiOutputElement");
    private final static QName _WynikWalidacjiOutputElement_QNAME = new QName("http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", "WynikWalidacjiOutputElement");
    private final static QName _KodWalidacji_QNAME = new QName("http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", "KodWalidacji");
    private final static QName _NadajZbiorEknOutputData_QNAME = new QName("http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", "NadajZbiorEknOutputData");
    private final static QName _ArrayOfNadajEknWynikWalidacjiOutputElement_QNAME = new QName("http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", "ArrayOfNadajEknWynikWalidacjiOutputElement");
    private final static QName _NadajEknWynikWalidacjiOutputElement_QNAME = new QName("http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", "NadajEknWynikWalidacjiOutputElement");
    private final static QName _ListaDoreczenPdfOutputData_QNAME = new QName("http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", "ListaDoreczenPdfOutputData");
    private final static QName _KodPocztowyOutputData_QNAME = new QName("http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", "KodPocztowyOutputData");
    private final static QName _KodPocztowyOutputElement_QNAME = new QName("http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", "KodPocztowyOutputElement");
    private final static QName _StatusPrzesylkiOutputData_QNAME = new QName("http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", "StatusPrzesylkiOutputData");
    private final static QName _ArrayOfStatusPrzesylkiOutputElement_QNAME = new QName("http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", "ArrayOfStatusPrzesylkiOutputElement");
    private final static QName _StatusPrzesylkiOutputElement_QNAME = new QName("http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", "StatusPrzesylkiOutputElement");
    private final static QName _ApiOutputData_QNAME = new QName("http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", "ApiOutputData");
    private final static QName _OutputDataOpis_QNAME = new QName("http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", "opis");
    private final static QName _OutputDataInformacja_QNAME = new QName("http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", "informacja");
    private final static QName _ApiOutputDataWersjaApi_QNAME = new QName("http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", "wersjaApi");
    private final static QName _StatusPrzesylkiOutputElementDescription_QNAME = new QName("http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", "Description");
    private final static QName _StatusPrzesylkiOutputElementGeneral_QNAME = new QName("http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", "General");
    private final static QName _StatusPrzesylkiOutputElementGeneralShort_QNAME = new QName("http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", "GeneralShort");
    private final static QName _StatusPrzesylkiOutputElementShort_QNAME = new QName("http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", "Short");
    private final static QName _StatusPrzesylkiOutputDataListaStatusPrzesylki_QNAME = new QName("http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", "listaStatusPrzesylki");
    private final static QName _KodPocztowyOutputDataListaKodowPocztowych_QNAME = new QName("http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", "listaKodowPocztowych");
    private final static QName _ListaDoreczenPdfOutputDataDokumentPdfBase64_QNAME = new QName("http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", "dokumentPdfBase64");
    private final static QName _ListaDoreczenPdfOutputDataNazwaPliku_QNAME = new QName("http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", "nazwaPliku");
    private final static QName _ListaDoreczenPdfOutputDataOpisBledu_QNAME = new QName("http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", "opisBledu");
    private final static QName _WynikWalidacjiOutputElementInformacjaWalidacji_QNAME = new QName("http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", "informacjaWalidacji");
    private final static QName _WynikWalidacjiOutputElementOpisWalidacji_QNAME = new QName("http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", "opisWalidacji");
    private final static QName _NadajEknWynikWalidacjiOutputElementGuid_QNAME = new QName("http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", "guid");
    private final static QName _NadajEknWynikWalidacjiOutputElementNumerNadania_QNAME = new QName("http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", "numerNadania");
    private final static QName _NadajZbiorEknOutputDataWynikiWalidacji_QNAME = new QName("http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", "wynikiWalidacji");
    private final static QName _HistoriaPrzesylkiOutputDataExtendHistoriaPrzesylki_QNAME = new QName("http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", "historiaPrzesylki");
    private final static QName _UserDataUserName_QNAME = new QName("http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", "UserName");
    private final static QName _PrzesylkaDataNumerNadawczy_QNAME = new QName("http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", "NumerNadawczy");
    private final static QName _HistoriaPrzesylkiOutputElementDateType_QNAME = new QName("http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", "DateType");
    private final static QName _HistoriaPrzesylkiOutputElementKartaEPO_QNAME = new QName("http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", "KartaEPO");
    private final static QName _HistoriaPrzesylkiOutputElementPlacowkaAwizacyjna_QNAME = new QName("http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", "PlacowkaAwizacyjna");
    private final static QName _HistoriaPrzesylkiOutputElementPlacowkaMacierzysta_QNAME = new QName("http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", "PlacowkaMacierzysta");
    private final static QName _HistoriaPrzesylkiOutputElementPlacowkaOperacji_QNAME = new QName("http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", "PlacowkaOperacji");
    private final static QName _HistoriaPrzesylkiOutputElementPrzesylka_QNAME = new QName("http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", "Przesylka");
    private final static QName _HistoriaPrzesylkiOutputElementStatus_QNAME = new QName("http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", "Status");
    private final static QName _HistoriaPrzesylkiOutputElementUser_QNAME = new QName("http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", "User");
    private final static QName _HistoriaPrzesylkiOutputDataListaHistoriaPrzesylki_QNAME = new QName("http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", "listaHistoriaPrzesylki");
    private final static QName _XmlOutputDataDokumentXmlBase64_QNAME = new QName("http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", "dokumentXmlBase64");
    private final static QName _NumerNadawczyOutputDataListaNumerowNadawczych_QNAME = new QName("http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", "listaNumerowNadawczych");
    private final static QName _GuidOutputDataListaGuidow_QNAME = new QName("http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", "listaGuidow");
    private final static QName _PrzesylkaOutputShortElementIDHistoriaPrzesylki_QNAME = new QName("http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", "IDHistoriaPrzesylki");
    private final static QName _PrzesylkaOutputShortElementNumerNadania_QNAME = new QName("http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", "NumerNadania");
    private final static QName _PrzesylkaOutputShortElementPlacowkaAwizo_QNAME = new QName("http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", "PlacowkaAwizo");
    private final static QName _PrzesylkaOutputShortElementStatusDate_QNAME = new QName("http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", "StatusDate");
    private final static QName _PrzesylkiOutputShortDataListaPrzesylek_QNAME = new QName("http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", "listaPrzesylek");
    private final static QName _PlacowkaDataNazwa_QNAME = new QName("http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", "Nazwa");
    private final static QName _PrzesylkaOutputElementAdresatNazwa1_QNAME = new QName("http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", "AdresatNazwa1");
    private final static QName _PrzesylkaOutputElementAdresatNazwa2_QNAME = new QName("http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", "AdresatNazwa2");
    private final static QName _PrzesylkaOutputElementDataAwizo1_QNAME = new QName("http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", "DataAwizo1");
    private final static QName _PrzesylkaOutputElementDataAwizo2_QNAME = new QName("http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", "DataAwizo2");
    private final static QName _PrzesylkaOutputElementDataNadania_QNAME = new QName("http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", "DataNadania");
    private final static QName _PrzesylkaOutputElementDataOdbioru_QNAME = new QName("http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", "DataOdbioru");
    private final static QName _PrzesylkaOutputElementDataZwrotu_QNAME = new QName("http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", "DataZwrotu");
    private final static QName _PrzesylkaOutputElementDom_QNAME = new QName("http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", "Dom");
    private final static QName _PrzesylkaOutputElementGeneralShortStatus_QNAME = new QName("http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", "GeneralShortStatus");
    private final static QName _PrzesylkaOutputElementGeneralStatus_QNAME = new QName("http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", "GeneralStatus");
    private final static QName _PrzesylkaOutputElementIDKartaEPO_QNAME = new QName("http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", "IDKartaEPO");
    private final static QName _PrzesylkaOutputElementInnaPrzyczyna_QNAME = new QName("http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", "InnaPrzyczyna");
    private final static QName _PrzesylkaOutputElementInnyOdbiorca_QNAME = new QName("http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", "InnyOdbiorca");
    private final static QName _PrzesylkaOutputElementKodPocztowy_QNAME = new QName("http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", "KodPocztowy");
    private final static QName _PrzesylkaOutputElementKraj_QNAME = new QName("http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", "Kraj");
    private final static QName _PrzesylkaOutputElementLokal_QNAME = new QName("http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", "Lokal");
    private final static QName _PrzesylkaOutputElementMiejscowosc_QNAME = new QName("http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", "Miejscowosc");
    private final static QName _PrzesylkaOutputElementNumerDokumentu_QNAME = new QName("http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", "NumerDokumentu");
    private final static QName _PrzesylkaOutputElementPismo_QNAME = new QName("http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", "Pismo");
    private final static QName _PrzesylkaOutputElementRodzaj_QNAME = new QName("http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", "Rodzaj");
    private final static QName _PrzesylkaOutputElementSygnatura_QNAME = new QName("http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", "Sygnatura");
    private final static QName _PrzesylkaOutputElementUlica_QNAME = new QName("http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", "Ulica");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.datacontract.schemas._2004._07.epowslib
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PrzesylkiOutputData }
     * 
     */
    public PrzesylkiOutputData createPrzesylkiOutputData() {
        return new PrzesylkiOutputData();
    }

    /**
     * Create an instance of {@link PageOutputData }
     * 
     */
    public PageOutputData createPageOutputData() {
        return new PageOutputData();
    }

    /**
     * Create an instance of {@link OutputData }
     * 
     */
    public OutputData createOutputData() {
        return new OutputData();
    }

    /**
     * Create an instance of {@link ArrayOfPrzesylkaOutputElement }
     * 
     */
    public ArrayOfPrzesylkaOutputElement createArrayOfPrzesylkaOutputElement() {
        return new ArrayOfPrzesylkaOutputElement();
    }

    /**
     * Create an instance of {@link PrzesylkaOutputElement }
     * 
     */
    public PrzesylkaOutputElement createPrzesylkaOutputElement() {
        return new PrzesylkaOutputElement();
    }

    /**
     * Create an instance of {@link PlacowkaData }
     * 
     */
    public PlacowkaData createPlacowkaData() {
        return new PlacowkaData();
    }

    /**
     * Create an instance of {@link PrzesylkiOutputShortData }
     * 
     */
    public PrzesylkiOutputShortData createPrzesylkiOutputShortData() {
        return new PrzesylkiOutputShortData();
    }

    /**
     * Create an instance of {@link ArrayOfPrzesylkaOutputShortElement }
     * 
     */
    public ArrayOfPrzesylkaOutputShortElement createArrayOfPrzesylkaOutputShortElement() {
        return new ArrayOfPrzesylkaOutputShortElement();
    }

    /**
     * Create an instance of {@link PrzesylkaOutputShortElement }
     * 
     */
    public PrzesylkaOutputShortElement createPrzesylkaOutputShortElement() {
        return new PrzesylkaOutputShortElement();
    }

    /**
     * Create an instance of {@link HistoryActionDate }
     * 
     */
    public HistoryActionDate createHistoryActionDate() {
        return new HistoryActionDate();
    }

    /**
     * Create an instance of {@link GuidOutputElement }
     * 
     */
    public GuidOutputElement createGuidOutputElement() {
        return new GuidOutputElement();
    }

    /**
     * Create an instance of {@link GuidOutputData }
     * 
     */
    public GuidOutputData createGuidOutputData() {
        return new GuidOutputData();
    }

    /**
     * Create an instance of {@link NumerNadawczyOutputData }
     * 
     */
    public NumerNadawczyOutputData createNumerNadawczyOutputData() {
        return new NumerNadawczyOutputData();
    }

    /**
     * Create an instance of {@link NumerNadawczyOutputElement }
     * 
     */
    public NumerNadawczyOutputElement createNumerNadawczyOutputElement() {
        return new NumerNadawczyOutputElement();
    }

    /**
     * Create an instance of {@link XmlOutputData }
     * 
     */
    public XmlOutputData createXmlOutputData() {
        return new XmlOutputData();
    }

    /**
     * Create an instance of {@link HistoriaPrzesylkiOutputData }
     * 
     */
    public HistoriaPrzesylkiOutputData createHistoriaPrzesylkiOutputData() {
        return new HistoriaPrzesylkiOutputData();
    }

    /**
     * Create an instance of {@link ArrayOfHistoriaPrzesylkiOutputElement }
     * 
     */
    public ArrayOfHistoriaPrzesylkiOutputElement createArrayOfHistoriaPrzesylkiOutputElement() {
        return new ArrayOfHistoriaPrzesylkiOutputElement();
    }

    /**
     * Create an instance of {@link HistoriaPrzesylkiOutputElement }
     * 
     */
    public HistoriaPrzesylkiOutputElement createHistoriaPrzesylkiOutputElement() {
        return new HistoriaPrzesylkiOutputElement();
    }

    /**
     * Create an instance of {@link KartaEPOData }
     * 
     */
    public KartaEPOData createKartaEPOData() {
        return new KartaEPOData();
    }

    /**
     * Create an instance of {@link PrzesylkaData }
     * 
     */
    public PrzesylkaData createPrzesylkaData() {
        return new PrzesylkaData();
    }

    /**
     * Create an instance of {@link StatusPrzesylkiData }
     * 
     */
    public StatusPrzesylkiData createStatusPrzesylkiData() {
        return new StatusPrzesylkiData();
    }

    /**
     * Create an instance of {@link UserData }
     * 
     */
    public UserData createUserData() {
        return new UserData();
    }

    /**
     * Create an instance of {@link HistoriaPrzesylkiOutputDataExtend }
     * 
     */
    public HistoriaPrzesylkiOutputDataExtend createHistoriaPrzesylkiOutputDataExtend() {
        return new HistoriaPrzesylkiOutputDataExtend();
    }

    /**
     * Create an instance of {@link ImportZbiorEknOutputData }
     * 
     */
    public ImportZbiorEknOutputData createImportZbiorEknOutputData() {
        return new ImportZbiorEknOutputData();
    }

    /**
     * Create an instance of {@link ArrayOfImportEknWynikWalidacjiOutputElement }
     * 
     */
    public ArrayOfImportEknWynikWalidacjiOutputElement createArrayOfImportEknWynikWalidacjiOutputElement() {
        return new ArrayOfImportEknWynikWalidacjiOutputElement();
    }

    /**
     * Create an instance of {@link ImportEknWynikWalidacjiOutputElement }
     * 
     */
    public ImportEknWynikWalidacjiOutputElement createImportEknWynikWalidacjiOutputElement() {
        return new ImportEknWynikWalidacjiOutputElement();
    }

    /**
     * Create an instance of {@link WynikWalidacjiOutputElement }
     * 
     */
    public WynikWalidacjiOutputElement createWynikWalidacjiOutputElement() {
        return new WynikWalidacjiOutputElement();
    }

    /**
     * Create an instance of {@link NadajZbiorEknOutputData }
     * 
     */
    public NadajZbiorEknOutputData createNadajZbiorEknOutputData() {
        return new NadajZbiorEknOutputData();
    }

    /**
     * Create an instance of {@link ArrayOfNadajEknWynikWalidacjiOutputElement }
     * 
     */
    public ArrayOfNadajEknWynikWalidacjiOutputElement createArrayOfNadajEknWynikWalidacjiOutputElement() {
        return new ArrayOfNadajEknWynikWalidacjiOutputElement();
    }

    /**
     * Create an instance of {@link NadajEknWynikWalidacjiOutputElement }
     * 
     */
    public NadajEknWynikWalidacjiOutputElement createNadajEknWynikWalidacjiOutputElement() {
        return new NadajEknWynikWalidacjiOutputElement();
    }

    /**
     * Create an instance of {@link ListaDoreczenPdfOutputData }
     * 
     */
    public ListaDoreczenPdfOutputData createListaDoreczenPdfOutputData() {
        return new ListaDoreczenPdfOutputData();
    }

    /**
     * Create an instance of {@link KodPocztowyOutputData }
     * 
     */
    public KodPocztowyOutputData createKodPocztowyOutputData() {
        return new KodPocztowyOutputData();
    }

    /**
     * Create an instance of {@link KodPocztowyOutputElement }
     * 
     */
    public KodPocztowyOutputElement createKodPocztowyOutputElement() {
        return new KodPocztowyOutputElement();
    }

    /**
     * Create an instance of {@link StatusPrzesylkiOutputData }
     * 
     */
    public StatusPrzesylkiOutputData createStatusPrzesylkiOutputData() {
        return new StatusPrzesylkiOutputData();
    }

    /**
     * Create an instance of {@link ArrayOfStatusPrzesylkiOutputElement }
     * 
     */
    public ArrayOfStatusPrzesylkiOutputElement createArrayOfStatusPrzesylkiOutputElement() {
        return new ArrayOfStatusPrzesylkiOutputElement();
    }

    /**
     * Create an instance of {@link StatusPrzesylkiOutputElement }
     * 
     */
    public StatusPrzesylkiOutputElement createStatusPrzesylkiOutputElement() {
        return new StatusPrzesylkiOutputElement();
    }

    /**
     * Create an instance of {@link ApiOutputData }
     * 
     */
    public ApiOutputData createApiOutputData() {
        return new ApiOutputData();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PrzesylkiOutputData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", name = "PrzesylkiOutputData")
    public JAXBElement<PrzesylkiOutputData> createPrzesylkiOutputData(PrzesylkiOutputData value) {
        return new JAXBElement<PrzesylkiOutputData>(_PrzesylkiOutputData_QNAME, PrzesylkiOutputData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PageOutputData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", name = "PageOutputData")
    public JAXBElement<PageOutputData> createPageOutputData(PageOutputData value) {
        return new JAXBElement<PageOutputData>(_PageOutputData_QNAME, PageOutputData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OutputData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", name = "OutputData")
    public JAXBElement<OutputData> createOutputData(OutputData value) {
        return new JAXBElement<OutputData>(_OutputData_QNAME, OutputData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KodOdpowiedzi }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", name = "KodOdpowiedzi")
    public JAXBElement<KodOdpowiedzi> createKodOdpowiedzi(KodOdpowiedzi value) {
        return new JAXBElement<KodOdpowiedzi>(_KodOdpowiedzi_QNAME, KodOdpowiedzi.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPrzesylkaOutputElement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", name = "ArrayOfPrzesylkaOutputElement")
    public JAXBElement<ArrayOfPrzesylkaOutputElement> createArrayOfPrzesylkaOutputElement(ArrayOfPrzesylkaOutputElement value) {
        return new JAXBElement<ArrayOfPrzesylkaOutputElement>(_ArrayOfPrzesylkaOutputElement_QNAME, ArrayOfPrzesylkaOutputElement.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PrzesylkaOutputElement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", name = "PrzesylkaOutputElement")
    public JAXBElement<PrzesylkaOutputElement> createPrzesylkaOutputElement(PrzesylkaOutputElement value) {
        return new JAXBElement<PrzesylkaOutputElement>(_PrzesylkaOutputElement_QNAME, PrzesylkaOutputElement.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PlacowkaData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", name = "PlacowkaData")
    public JAXBElement<PlacowkaData> createPlacowkaData(PlacowkaData value) {
        return new JAXBElement<PlacowkaData>(_PlacowkaData_QNAME, PlacowkaData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PrzesylkiOutputShortData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", name = "PrzesylkiOutputShortData")
    public JAXBElement<PrzesylkiOutputShortData> createPrzesylkiOutputShortData(PrzesylkiOutputShortData value) {
        return new JAXBElement<PrzesylkiOutputShortData>(_PrzesylkiOutputShortData_QNAME, PrzesylkiOutputShortData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPrzesylkaOutputShortElement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", name = "ArrayOfPrzesylkaOutputShortElement")
    public JAXBElement<ArrayOfPrzesylkaOutputShortElement> createArrayOfPrzesylkaOutputShortElement(ArrayOfPrzesylkaOutputShortElement value) {
        return new JAXBElement<ArrayOfPrzesylkaOutputShortElement>(_ArrayOfPrzesylkaOutputShortElement_QNAME, ArrayOfPrzesylkaOutputShortElement.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PrzesylkaOutputShortElement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", name = "PrzesylkaOutputShortElement")
    public JAXBElement<PrzesylkaOutputShortElement> createPrzesylkaOutputShortElement(PrzesylkaOutputShortElement value) {
        return new JAXBElement<PrzesylkaOutputShortElement>(_PrzesylkaOutputShortElement_QNAME, PrzesylkaOutputShortElement.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HistoryActionDate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", name = "HistoryActionDate")
    public JAXBElement<HistoryActionDate> createHistoryActionDate(HistoryActionDate value) {
        return new JAXBElement<HistoryActionDate>(_HistoryActionDate_QNAME, HistoryActionDate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DateTypes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", name = "DateTypes")
    public JAXBElement<DateTypes> createDateTypes(DateTypes value) {
        return new JAXBElement<DateTypes>(_DateTypes_QNAME, DateTypes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GuidOutputElement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", name = "GuidOutputElement")
    public JAXBElement<GuidOutputElement> createGuidOutputElement(GuidOutputElement value) {
        return new JAXBElement<GuidOutputElement>(_GuidOutputElement_QNAME, GuidOutputElement.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GuidOutputData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", name = "GuidOutputData")
    public JAXBElement<GuidOutputData> createGuidOutputData(GuidOutputData value) {
        return new JAXBElement<GuidOutputData>(_GuidOutputData_QNAME, GuidOutputData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NumerNadawczyOutputData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", name = "NumerNadawczyOutputData")
    public JAXBElement<NumerNadawczyOutputData> createNumerNadawczyOutputData(NumerNadawczyOutputData value) {
        return new JAXBElement<NumerNadawczyOutputData>(_NumerNadawczyOutputData_QNAME, NumerNadawczyOutputData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NumerNadawczyOutputElement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", name = "NumerNadawczyOutputElement")
    public JAXBElement<NumerNadawczyOutputElement> createNumerNadawczyOutputElement(NumerNadawczyOutputElement value) {
        return new JAXBElement<NumerNadawczyOutputElement>(_NumerNadawczyOutputElement_QNAME, NumerNadawczyOutputElement.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XmlOutputData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", name = "XmlOutputData")
    public JAXBElement<XmlOutputData> createXmlOutputData(XmlOutputData value) {
        return new JAXBElement<XmlOutputData>(_XmlOutputData_QNAME, XmlOutputData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HistoriaPrzesylkiOutputData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", name = "HistoriaPrzesylkiOutputData")
    public JAXBElement<HistoriaPrzesylkiOutputData> createHistoriaPrzesylkiOutputData(HistoriaPrzesylkiOutputData value) {
        return new JAXBElement<HistoriaPrzesylkiOutputData>(_HistoriaPrzesylkiOutputData_QNAME, HistoriaPrzesylkiOutputData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfHistoriaPrzesylkiOutputElement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", name = "ArrayOfHistoriaPrzesylkiOutputElement")
    public JAXBElement<ArrayOfHistoriaPrzesylkiOutputElement> createArrayOfHistoriaPrzesylkiOutputElement(ArrayOfHistoriaPrzesylkiOutputElement value) {
        return new JAXBElement<ArrayOfHistoriaPrzesylkiOutputElement>(_ArrayOfHistoriaPrzesylkiOutputElement_QNAME, ArrayOfHistoriaPrzesylkiOutputElement.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HistoriaPrzesylkiOutputElement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", name = "HistoriaPrzesylkiOutputElement")
    public JAXBElement<HistoriaPrzesylkiOutputElement> createHistoriaPrzesylkiOutputElement(HistoriaPrzesylkiOutputElement value) {
        return new JAXBElement<HistoriaPrzesylkiOutputElement>(_HistoriaPrzesylkiOutputElement_QNAME, HistoriaPrzesylkiOutputElement.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KartaEPOData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", name = "KartaEPOData")
    public JAXBElement<KartaEPOData> createKartaEPOData(KartaEPOData value) {
        return new JAXBElement<KartaEPOData>(_KartaEPOData_QNAME, KartaEPOData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PrzesylkaData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", name = "PrzesylkaData")
    public JAXBElement<PrzesylkaData> createPrzesylkaData(PrzesylkaData value) {
        return new JAXBElement<PrzesylkaData>(_PrzesylkaData_QNAME, PrzesylkaData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StatusPrzesylkiData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", name = "StatusPrzesylkiData")
    public JAXBElement<StatusPrzesylkiData> createStatusPrzesylkiData(StatusPrzesylkiData value) {
        return new JAXBElement<StatusPrzesylkiData>(_StatusPrzesylkiData_QNAME, StatusPrzesylkiData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", name = "UserData")
    public JAXBElement<UserData> createUserData(UserData value) {
        return new JAXBElement<UserData>(_UserData_QNAME, UserData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HistoriaPrzesylkiOutputDataExtend }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", name = "HistoriaPrzesylkiOutputDataExtend")
    public JAXBElement<HistoriaPrzesylkiOutputDataExtend> createHistoriaPrzesylkiOutputDataExtend(HistoriaPrzesylkiOutputDataExtend value) {
        return new JAXBElement<HistoriaPrzesylkiOutputDataExtend>(_HistoriaPrzesylkiOutputDataExtend_QNAME, HistoriaPrzesylkiOutputDataExtend.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ImportZbiorEknOutputData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", name = "ImportZbiorEknOutputData")
    public JAXBElement<ImportZbiorEknOutputData> createImportZbiorEknOutputData(ImportZbiorEknOutputData value) {
        return new JAXBElement<ImportZbiorEknOutputData>(_ImportZbiorEknOutputData_QNAME, ImportZbiorEknOutputData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfImportEknWynikWalidacjiOutputElement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", name = "ArrayOfImportEknWynikWalidacjiOutputElement")
    public JAXBElement<ArrayOfImportEknWynikWalidacjiOutputElement> createArrayOfImportEknWynikWalidacjiOutputElement(ArrayOfImportEknWynikWalidacjiOutputElement value) {
        return new JAXBElement<ArrayOfImportEknWynikWalidacjiOutputElement>(_ArrayOfImportEknWynikWalidacjiOutputElement_QNAME, ArrayOfImportEknWynikWalidacjiOutputElement.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ImportEknWynikWalidacjiOutputElement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", name = "ImportEknWynikWalidacjiOutputElement")
    public JAXBElement<ImportEknWynikWalidacjiOutputElement> createImportEknWynikWalidacjiOutputElement(ImportEknWynikWalidacjiOutputElement value) {
        return new JAXBElement<ImportEknWynikWalidacjiOutputElement>(_ImportEknWynikWalidacjiOutputElement_QNAME, ImportEknWynikWalidacjiOutputElement.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WynikWalidacjiOutputElement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", name = "WynikWalidacjiOutputElement")
    public JAXBElement<WynikWalidacjiOutputElement> createWynikWalidacjiOutputElement(WynikWalidacjiOutputElement value) {
        return new JAXBElement<WynikWalidacjiOutputElement>(_WynikWalidacjiOutputElement_QNAME, WynikWalidacjiOutputElement.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KodWalidacji }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", name = "KodWalidacji")
    public JAXBElement<KodWalidacji> createKodWalidacji(KodWalidacji value) {
        return new JAXBElement<KodWalidacji>(_KodWalidacji_QNAME, KodWalidacji.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NadajZbiorEknOutputData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", name = "NadajZbiorEknOutputData")
    public JAXBElement<NadajZbiorEknOutputData> createNadajZbiorEknOutputData(NadajZbiorEknOutputData value) {
        return new JAXBElement<NadajZbiorEknOutputData>(_NadajZbiorEknOutputData_QNAME, NadajZbiorEknOutputData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfNadajEknWynikWalidacjiOutputElement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", name = "ArrayOfNadajEknWynikWalidacjiOutputElement")
    public JAXBElement<ArrayOfNadajEknWynikWalidacjiOutputElement> createArrayOfNadajEknWynikWalidacjiOutputElement(ArrayOfNadajEknWynikWalidacjiOutputElement value) {
        return new JAXBElement<ArrayOfNadajEknWynikWalidacjiOutputElement>(_ArrayOfNadajEknWynikWalidacjiOutputElement_QNAME, ArrayOfNadajEknWynikWalidacjiOutputElement.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NadajEknWynikWalidacjiOutputElement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", name = "NadajEknWynikWalidacjiOutputElement")
    public JAXBElement<NadajEknWynikWalidacjiOutputElement> createNadajEknWynikWalidacjiOutputElement(NadajEknWynikWalidacjiOutputElement value) {
        return new JAXBElement<NadajEknWynikWalidacjiOutputElement>(_NadajEknWynikWalidacjiOutputElement_QNAME, NadajEknWynikWalidacjiOutputElement.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListaDoreczenPdfOutputData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", name = "ListaDoreczenPdfOutputData")
    public JAXBElement<ListaDoreczenPdfOutputData> createListaDoreczenPdfOutputData(ListaDoreczenPdfOutputData value) {
        return new JAXBElement<ListaDoreczenPdfOutputData>(_ListaDoreczenPdfOutputData_QNAME, ListaDoreczenPdfOutputData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KodPocztowyOutputData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", name = "KodPocztowyOutputData")
    public JAXBElement<KodPocztowyOutputData> createKodPocztowyOutputData(KodPocztowyOutputData value) {
        return new JAXBElement<KodPocztowyOutputData>(_KodPocztowyOutputData_QNAME, KodPocztowyOutputData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KodPocztowyOutputElement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", name = "KodPocztowyOutputElement")
    public JAXBElement<KodPocztowyOutputElement> createKodPocztowyOutputElement(KodPocztowyOutputElement value) {
        return new JAXBElement<KodPocztowyOutputElement>(_KodPocztowyOutputElement_QNAME, KodPocztowyOutputElement.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StatusPrzesylkiOutputData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", name = "StatusPrzesylkiOutputData")
    public JAXBElement<StatusPrzesylkiOutputData> createStatusPrzesylkiOutputData(StatusPrzesylkiOutputData value) {
        return new JAXBElement<StatusPrzesylkiOutputData>(_StatusPrzesylkiOutputData_QNAME, StatusPrzesylkiOutputData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfStatusPrzesylkiOutputElement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", name = "ArrayOfStatusPrzesylkiOutputElement")
    public JAXBElement<ArrayOfStatusPrzesylkiOutputElement> createArrayOfStatusPrzesylkiOutputElement(ArrayOfStatusPrzesylkiOutputElement value) {
        return new JAXBElement<ArrayOfStatusPrzesylkiOutputElement>(_ArrayOfStatusPrzesylkiOutputElement_QNAME, ArrayOfStatusPrzesylkiOutputElement.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StatusPrzesylkiOutputElement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", name = "StatusPrzesylkiOutputElement")
    public JAXBElement<StatusPrzesylkiOutputElement> createStatusPrzesylkiOutputElement(StatusPrzesylkiOutputElement value) {
        return new JAXBElement<StatusPrzesylkiOutputElement>(_StatusPrzesylkiOutputElement_QNAME, StatusPrzesylkiOutputElement.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApiOutputData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", name = "ApiOutputData")
    public JAXBElement<ApiOutputData> createApiOutputData(ApiOutputData value) {
        return new JAXBElement<ApiOutputData>(_ApiOutputData_QNAME, ApiOutputData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", name = "opis", scope = OutputData.class)
    public JAXBElement<String> createOutputDataOpis(String value) {
        return new JAXBElement<String>(_OutputDataOpis_QNAME, String.class, OutputData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", name = "informacja", scope = OutputData.class)
    public JAXBElement<String> createOutputDataInformacja(String value) {
        return new JAXBElement<String>(_OutputDataInformacja_QNAME, String.class, OutputData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", name = "wersjaApi", scope = ApiOutputData.class)
    public JAXBElement<String> createApiOutputDataWersjaApi(String value) {
        return new JAXBElement<String>(_ApiOutputDataWersjaApi_QNAME, String.class, ApiOutputData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", name = "Description", scope = StatusPrzesylkiOutputElement.class)
    public JAXBElement<String> createStatusPrzesylkiOutputElementDescription(String value) {
        return new JAXBElement<String>(_StatusPrzesylkiOutputElementDescription_QNAME, String.class, StatusPrzesylkiOutputElement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", name = "General", scope = StatusPrzesylkiOutputElement.class)
    public JAXBElement<String> createStatusPrzesylkiOutputElementGeneral(String value) {
        return new JAXBElement<String>(_StatusPrzesylkiOutputElementGeneral_QNAME, String.class, StatusPrzesylkiOutputElement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", name = "GeneralShort", scope = StatusPrzesylkiOutputElement.class)
    public JAXBElement<String> createStatusPrzesylkiOutputElementGeneralShort(String value) {
        return new JAXBElement<String>(_StatusPrzesylkiOutputElementGeneralShort_QNAME, String.class, StatusPrzesylkiOutputElement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", name = "Short", scope = StatusPrzesylkiOutputElement.class)
    public JAXBElement<String> createStatusPrzesylkiOutputElementShort(String value) {
        return new JAXBElement<String>(_StatusPrzesylkiOutputElementShort_QNAME, String.class, StatusPrzesylkiOutputElement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfStatusPrzesylkiOutputElement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", name = "listaStatusPrzesylki", scope = StatusPrzesylkiOutputData.class)
    public JAXBElement<ArrayOfStatusPrzesylkiOutputElement> createStatusPrzesylkiOutputDataListaStatusPrzesylki(ArrayOfStatusPrzesylkiOutputElement value) {
        return new JAXBElement<ArrayOfStatusPrzesylkiOutputElement>(_StatusPrzesylkiOutputDataListaStatusPrzesylki_QNAME, ArrayOfStatusPrzesylkiOutputElement.class, StatusPrzesylkiOutputData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KodPocztowyOutputElement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", name = "listaKodowPocztowych", scope = KodPocztowyOutputData.class)
    public JAXBElement<KodPocztowyOutputElement> createKodPocztowyOutputDataListaKodowPocztowych(KodPocztowyOutputElement value) {
        return new JAXBElement<KodPocztowyOutputElement>(_KodPocztowyOutputDataListaKodowPocztowych_QNAME, KodPocztowyOutputElement.class, KodPocztowyOutputData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", name = "dokumentPdfBase64", scope = ListaDoreczenPdfOutputData.class)
    public JAXBElement<String> createListaDoreczenPdfOutputDataDokumentPdfBase64(String value) {
        return new JAXBElement<String>(_ListaDoreczenPdfOutputDataDokumentPdfBase64_QNAME, String.class, ListaDoreczenPdfOutputData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", name = "nazwaPliku", scope = ListaDoreczenPdfOutputData.class)
    public JAXBElement<String> createListaDoreczenPdfOutputDataNazwaPliku(String value) {
        return new JAXBElement<String>(_ListaDoreczenPdfOutputDataNazwaPliku_QNAME, String.class, ListaDoreczenPdfOutputData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", name = "opisBledu", scope = ListaDoreczenPdfOutputData.class)
    public JAXBElement<String> createListaDoreczenPdfOutputDataOpisBledu(String value) {
        return new JAXBElement<String>(_ListaDoreczenPdfOutputDataOpisBledu_QNAME, String.class, ListaDoreczenPdfOutputData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", name = "informacjaWalidacji", scope = WynikWalidacjiOutputElement.class)
    public JAXBElement<String> createWynikWalidacjiOutputElementInformacjaWalidacji(String value) {
        return new JAXBElement<String>(_WynikWalidacjiOutputElementInformacjaWalidacji_QNAME, String.class, WynikWalidacjiOutputElement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", name = "opisWalidacji", scope = WynikWalidacjiOutputElement.class)
    public JAXBElement<String> createWynikWalidacjiOutputElementOpisWalidacji(String value) {
        return new JAXBElement<String>(_WynikWalidacjiOutputElementOpisWalidacji_QNAME, String.class, WynikWalidacjiOutputElement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", name = "guid", scope = NadajEknWynikWalidacjiOutputElement.class)
    public JAXBElement<String> createNadajEknWynikWalidacjiOutputElementGuid(String value) {
        return new JAXBElement<String>(_NadajEknWynikWalidacjiOutputElementGuid_QNAME, String.class, NadajEknWynikWalidacjiOutputElement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", name = "numerNadania", scope = NadajEknWynikWalidacjiOutputElement.class)
    public JAXBElement<String> createNadajEknWynikWalidacjiOutputElementNumerNadania(String value) {
        return new JAXBElement<String>(_NadajEknWynikWalidacjiOutputElementNumerNadania_QNAME, String.class, NadajEknWynikWalidacjiOutputElement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfNadajEknWynikWalidacjiOutputElement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", name = "wynikiWalidacji", scope = NadajZbiorEknOutputData.class)
    public JAXBElement<ArrayOfNadajEknWynikWalidacjiOutputElement> createNadajZbiorEknOutputDataWynikiWalidacji(ArrayOfNadajEknWynikWalidacjiOutputElement value) {
        return new JAXBElement<ArrayOfNadajEknWynikWalidacjiOutputElement>(_NadajZbiorEknOutputDataWynikiWalidacji_QNAME, ArrayOfNadajEknWynikWalidacjiOutputElement.class, NadajZbiorEknOutputData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", name = "guid", scope = ImportEknWynikWalidacjiOutputElement.class)
    public JAXBElement<String> createImportEknWynikWalidacjiOutputElementGuid(String value) {
        return new JAXBElement<String>(_NadajEknWynikWalidacjiOutputElementGuid_QNAME, String.class, ImportEknWynikWalidacjiOutputElement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", name = "numerNadania", scope = ImportEknWynikWalidacjiOutputElement.class)
    public JAXBElement<String> createImportEknWynikWalidacjiOutputElementNumerNadania(String value) {
        return new JAXBElement<String>(_NadajEknWynikWalidacjiOutputElementNumerNadania_QNAME, String.class, ImportEknWynikWalidacjiOutputElement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfImportEknWynikWalidacjiOutputElement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", name = "wynikiWalidacji", scope = ImportZbiorEknOutputData.class)
    public JAXBElement<ArrayOfImportEknWynikWalidacjiOutputElement> createImportZbiorEknOutputDataWynikiWalidacji(ArrayOfImportEknWynikWalidacjiOutputElement value) {
        return new JAXBElement<ArrayOfImportEknWynikWalidacjiOutputElement>(_NadajZbiorEknOutputDataWynikiWalidacji_QNAME, ArrayOfImportEknWynikWalidacjiOutputElement.class, ImportZbiorEknOutputData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HistoriaPrzesylkiOutputData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", name = "historiaPrzesylki", scope = HistoriaPrzesylkiOutputDataExtend.class)
    public JAXBElement<HistoriaPrzesylkiOutputData> createHistoriaPrzesylkiOutputDataExtendHistoriaPrzesylki(HistoriaPrzesylkiOutputData value) {
        return new JAXBElement<HistoriaPrzesylkiOutputData>(_HistoriaPrzesylkiOutputDataExtendHistoriaPrzesylki_QNAME, HistoriaPrzesylkiOutputData.class, HistoriaPrzesylkiOutputDataExtend.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", name = "UserName", scope = UserData.class)
    public JAXBElement<String> createUserDataUserName(String value) {
        return new JAXBElement<String>(_UserDataUserName_QNAME, String.class, UserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", name = "Description", scope = StatusPrzesylkiData.class)
    public JAXBElement<String> createStatusPrzesylkiDataDescription(String value) {
        return new JAXBElement<String>(_StatusPrzesylkiOutputElementDescription_QNAME, String.class, StatusPrzesylkiData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", name = "GeneralShort", scope = StatusPrzesylkiData.class)
    public JAXBElement<String> createStatusPrzesylkiDataGeneralShort(String value) {
        return new JAXBElement<String>(_StatusPrzesylkiOutputElementGeneralShort_QNAME, String.class, StatusPrzesylkiData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", name = "NumerNadawczy", scope = PrzesylkaData.class)
    public JAXBElement<String> createPrzesylkaDataNumerNadawczy(String value) {
        return new JAXBElement<String>(_PrzesylkaDataNumerNadawczy_QNAME, String.class, PrzesylkaData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HistoryActionDate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", name = "DateType", scope = HistoriaPrzesylkiOutputElement.class)
    public JAXBElement<HistoryActionDate> createHistoriaPrzesylkiOutputElementDateType(HistoryActionDate value) {
        return new JAXBElement<HistoryActionDate>(_HistoriaPrzesylkiOutputElementDateType_QNAME, HistoryActionDate.class, HistoriaPrzesylkiOutputElement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KartaEPOData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", name = "KartaEPO", scope = HistoriaPrzesylkiOutputElement.class)
    public JAXBElement<KartaEPOData> createHistoriaPrzesylkiOutputElementKartaEPO(KartaEPOData value) {
        return new JAXBElement<KartaEPOData>(_HistoriaPrzesylkiOutputElementKartaEPO_QNAME, KartaEPOData.class, HistoriaPrzesylkiOutputElement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PlacowkaData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", name = "PlacowkaAwizacyjna", scope = HistoriaPrzesylkiOutputElement.class)
    public JAXBElement<PlacowkaData> createHistoriaPrzesylkiOutputElementPlacowkaAwizacyjna(PlacowkaData value) {
        return new JAXBElement<PlacowkaData>(_HistoriaPrzesylkiOutputElementPlacowkaAwizacyjna_QNAME, PlacowkaData.class, HistoriaPrzesylkiOutputElement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PlacowkaData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", name = "PlacowkaMacierzysta", scope = HistoriaPrzesylkiOutputElement.class)
    public JAXBElement<PlacowkaData> createHistoriaPrzesylkiOutputElementPlacowkaMacierzysta(PlacowkaData value) {
        return new JAXBElement<PlacowkaData>(_HistoriaPrzesylkiOutputElementPlacowkaMacierzysta_QNAME, PlacowkaData.class, HistoriaPrzesylkiOutputElement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PlacowkaData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", name = "PlacowkaOperacji", scope = HistoriaPrzesylkiOutputElement.class)
    public JAXBElement<PlacowkaData> createHistoriaPrzesylkiOutputElementPlacowkaOperacji(PlacowkaData value) {
        return new JAXBElement<PlacowkaData>(_HistoriaPrzesylkiOutputElementPlacowkaOperacji_QNAME, PlacowkaData.class, HistoriaPrzesylkiOutputElement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PrzesylkaData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", name = "Przesylka", scope = HistoriaPrzesylkiOutputElement.class)
    public JAXBElement<PrzesylkaData> createHistoriaPrzesylkiOutputElementPrzesylka(PrzesylkaData value) {
        return new JAXBElement<PrzesylkaData>(_HistoriaPrzesylkiOutputElementPrzesylka_QNAME, PrzesylkaData.class, HistoriaPrzesylkiOutputElement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StatusPrzesylkiData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", name = "Status", scope = HistoriaPrzesylkiOutputElement.class)
    public JAXBElement<StatusPrzesylkiData> createHistoriaPrzesylkiOutputElementStatus(StatusPrzesylkiData value) {
        return new JAXBElement<StatusPrzesylkiData>(_HistoriaPrzesylkiOutputElementStatus_QNAME, StatusPrzesylkiData.class, HistoriaPrzesylkiOutputElement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", name = "User", scope = HistoriaPrzesylkiOutputElement.class)
    public JAXBElement<UserData> createHistoriaPrzesylkiOutputElementUser(UserData value) {
        return new JAXBElement<UserData>(_HistoriaPrzesylkiOutputElementUser_QNAME, UserData.class, HistoriaPrzesylkiOutputElement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfHistoriaPrzesylkiOutputElement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", name = "listaHistoriaPrzesylki", scope = HistoriaPrzesylkiOutputData.class)
    public JAXBElement<ArrayOfHistoriaPrzesylkiOutputElement> createHistoriaPrzesylkiOutputDataListaHistoriaPrzesylki(ArrayOfHistoriaPrzesylkiOutputElement value) {
        return new JAXBElement<ArrayOfHistoriaPrzesylkiOutputElement>(_HistoriaPrzesylkiOutputDataListaHistoriaPrzesylki_QNAME, ArrayOfHistoriaPrzesylkiOutputElement.class, HistoriaPrzesylkiOutputData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", name = "dokumentXmlBase64", scope = XmlOutputData.class)
    public JAXBElement<String> createXmlOutputDataDokumentXmlBase64(String value) {
        return new JAXBElement<String>(_XmlOutputDataDokumentXmlBase64_QNAME, String.class, XmlOutputData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", name = "nazwaPliku", scope = XmlOutputData.class)
    public JAXBElement<String> createXmlOutputDataNazwaPliku(String value) {
        return new JAXBElement<String>(_ListaDoreczenPdfOutputDataNazwaPliku_QNAME, String.class, XmlOutputData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", name = "opisBledu", scope = XmlOutputData.class)
    public JAXBElement<String> createXmlOutputDataOpisBledu(String value) {
        return new JAXBElement<String>(_ListaDoreczenPdfOutputDataOpisBledu_QNAME, String.class, XmlOutputData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NumerNadawczyOutputElement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", name = "listaNumerowNadawczych", scope = NumerNadawczyOutputData.class)
    public JAXBElement<NumerNadawczyOutputElement> createNumerNadawczyOutputDataListaNumerowNadawczych(NumerNadawczyOutputElement value) {
        return new JAXBElement<NumerNadawczyOutputElement>(_NumerNadawczyOutputDataListaNumerowNadawczych_QNAME, NumerNadawczyOutputElement.class, NumerNadawczyOutputData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GuidOutputElement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", name = "listaGuidow", scope = GuidOutputData.class)
    public JAXBElement<GuidOutputElement> createGuidOutputDataListaGuidow(GuidOutputElement value) {
        return new JAXBElement<GuidOutputElement>(_GuidOutputDataListaGuidow_QNAME, GuidOutputElement.class, GuidOutputData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HistoryActionDate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", name = "DateType", scope = PrzesylkaOutputShortElement.class)
    public JAXBElement<HistoryActionDate> createPrzesylkaOutputShortElementDateType(HistoryActionDate value) {
        return new JAXBElement<HistoryActionDate>(_HistoriaPrzesylkiOutputElementDateType_QNAME, HistoryActionDate.class, PrzesylkaOutputShortElement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GuidOutputElement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", name = "IDHistoriaPrzesylki", scope = PrzesylkaOutputShortElement.class)
    public JAXBElement<GuidOutputElement> createPrzesylkaOutputShortElementIDHistoriaPrzesylki(GuidOutputElement value) {
        return new JAXBElement<GuidOutputElement>(_PrzesylkaOutputShortElementIDHistoriaPrzesylki_QNAME, GuidOutputElement.class, PrzesylkaOutputShortElement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", name = "NumerNadania", scope = PrzesylkaOutputShortElement.class)
    public JAXBElement<String> createPrzesylkaOutputShortElementNumerNadania(String value) {
        return new JAXBElement<String>(_PrzesylkaOutputShortElementNumerNadania_QNAME, String.class, PrzesylkaOutputShortElement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", name = "PlacowkaAwizo", scope = PrzesylkaOutputShortElement.class)
    public JAXBElement<String> createPrzesylkaOutputShortElementPlacowkaAwizo(String value) {
        return new JAXBElement<String>(_PrzesylkaOutputShortElementPlacowkaAwizo_QNAME, String.class, PrzesylkaOutputShortElement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", name = "StatusDate", scope = PrzesylkaOutputShortElement.class)
    public JAXBElement<XMLGregorianCalendar> createPrzesylkaOutputShortElementStatusDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_PrzesylkaOutputShortElementStatusDate_QNAME, XMLGregorianCalendar.class, PrzesylkaOutputShortElement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPrzesylkaOutputShortElement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", name = "listaPrzesylek", scope = PrzesylkiOutputShortData.class)
    public JAXBElement<ArrayOfPrzesylkaOutputShortElement> createPrzesylkiOutputShortDataListaPrzesylek(ArrayOfPrzesylkaOutputShortElement value) {
        return new JAXBElement<ArrayOfPrzesylkaOutputShortElement>(_PrzesylkiOutputShortDataListaPrzesylek_QNAME, ArrayOfPrzesylkaOutputShortElement.class, PrzesylkiOutputShortData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", name = "Nazwa", scope = PlacowkaData.class)
    public JAXBElement<String> createPlacowkaDataNazwa(String value) {
        return new JAXBElement<String>(_PlacowkaDataNazwa_QNAME, String.class, PlacowkaData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", name = "AdresatNazwa1", scope = PrzesylkaOutputElement.class)
    public JAXBElement<String> createPrzesylkaOutputElementAdresatNazwa1(String value) {
        return new JAXBElement<String>(_PrzesylkaOutputElementAdresatNazwa1_QNAME, String.class, PrzesylkaOutputElement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", name = "AdresatNazwa2", scope = PrzesylkaOutputElement.class)
    public JAXBElement<String> createPrzesylkaOutputElementAdresatNazwa2(String value) {
        return new JAXBElement<String>(_PrzesylkaOutputElementAdresatNazwa2_QNAME, String.class, PrzesylkaOutputElement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", name = "DataAwizo1", scope = PrzesylkaOutputElement.class)
    public JAXBElement<XMLGregorianCalendar> createPrzesylkaOutputElementDataAwizo1(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_PrzesylkaOutputElementDataAwizo1_QNAME, XMLGregorianCalendar.class, PrzesylkaOutputElement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", name = "DataAwizo2", scope = PrzesylkaOutputElement.class)
    public JAXBElement<XMLGregorianCalendar> createPrzesylkaOutputElementDataAwizo2(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_PrzesylkaOutputElementDataAwizo2_QNAME, XMLGregorianCalendar.class, PrzesylkaOutputElement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", name = "DataNadania", scope = PrzesylkaOutputElement.class)
    public JAXBElement<XMLGregorianCalendar> createPrzesylkaOutputElementDataNadania(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_PrzesylkaOutputElementDataNadania_QNAME, XMLGregorianCalendar.class, PrzesylkaOutputElement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", name = "DataOdbioru", scope = PrzesylkaOutputElement.class)
    public JAXBElement<XMLGregorianCalendar> createPrzesylkaOutputElementDataOdbioru(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_PrzesylkaOutputElementDataOdbioru_QNAME, XMLGregorianCalendar.class, PrzesylkaOutputElement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", name = "DataZwrotu", scope = PrzesylkaOutputElement.class)
    public JAXBElement<XMLGregorianCalendar> createPrzesylkaOutputElementDataZwrotu(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_PrzesylkaOutputElementDataZwrotu_QNAME, XMLGregorianCalendar.class, PrzesylkaOutputElement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", name = "Dom", scope = PrzesylkaOutputElement.class)
    public JAXBElement<String> createPrzesylkaOutputElementDom(String value) {
        return new JAXBElement<String>(_PrzesylkaOutputElementDom_QNAME, String.class, PrzesylkaOutputElement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GeneralPrzesylkaStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", name = "GeneralShortStatus", scope = PrzesylkaOutputElement.class)
    public JAXBElement<GeneralPrzesylkaStatus> createPrzesylkaOutputElementGeneralShortStatus(GeneralPrzesylkaStatus value) {
        return new JAXBElement<GeneralPrzesylkaStatus>(_PrzesylkaOutputElementGeneralShortStatus_QNAME, GeneralPrzesylkaStatus.class, PrzesylkaOutputElement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", name = "GeneralStatus", scope = PrzesylkaOutputElement.class)
    public JAXBElement<String> createPrzesylkaOutputElementGeneralStatus(String value) {
        return new JAXBElement<String>(_PrzesylkaOutputElementGeneralStatus_QNAME, String.class, PrzesylkaOutputElement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", name = "IDKartaEPO", scope = PrzesylkaOutputElement.class)
    public JAXBElement<String> createPrzesylkaOutputElementIDKartaEPO(String value) {
        return new JAXBElement<String>(_PrzesylkaOutputElementIDKartaEPO_QNAME, String.class, PrzesylkaOutputElement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", name = "InnaPrzyczyna", scope = PrzesylkaOutputElement.class)
    public JAXBElement<String> createPrzesylkaOutputElementInnaPrzyczyna(String value) {
        return new JAXBElement<String>(_PrzesylkaOutputElementInnaPrzyczyna_QNAME, String.class, PrzesylkaOutputElement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", name = "InnyOdbiorca", scope = PrzesylkaOutputElement.class)
    public JAXBElement<String> createPrzesylkaOutputElementInnyOdbiorca(String value) {
        return new JAXBElement<String>(_PrzesylkaOutputElementInnyOdbiorca_QNAME, String.class, PrzesylkaOutputElement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", name = "KodPocztowy", scope = PrzesylkaOutputElement.class)
    public JAXBElement<String> createPrzesylkaOutputElementKodPocztowy(String value) {
        return new JAXBElement<String>(_PrzesylkaOutputElementKodPocztowy_QNAME, String.class, PrzesylkaOutputElement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", name = "Kraj", scope = PrzesylkaOutputElement.class)
    public JAXBElement<String> createPrzesylkaOutputElementKraj(String value) {
        return new JAXBElement<String>(_PrzesylkaOutputElementKraj_QNAME, String.class, PrzesylkaOutputElement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", name = "Lokal", scope = PrzesylkaOutputElement.class)
    public JAXBElement<String> createPrzesylkaOutputElementLokal(String value) {
        return new JAXBElement<String>(_PrzesylkaOutputElementLokal_QNAME, String.class, PrzesylkaOutputElement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", name = "Miejscowosc", scope = PrzesylkaOutputElement.class)
    public JAXBElement<String> createPrzesylkaOutputElementMiejscowosc(String value) {
        return new JAXBElement<String>(_PrzesylkaOutputElementMiejscowosc_QNAME, String.class, PrzesylkaOutputElement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", name = "NumerDokumentu", scope = PrzesylkaOutputElement.class)
    public JAXBElement<String> createPrzesylkaOutputElementNumerDokumentu(String value) {
        return new JAXBElement<String>(_PrzesylkaOutputElementNumerDokumentu_QNAME, String.class, PrzesylkaOutputElement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", name = "NumerNadania", scope = PrzesylkaOutputElement.class)
    public JAXBElement<String> createPrzesylkaOutputElementNumerNadania(String value) {
        return new JAXBElement<String>(_PrzesylkaOutputShortElementNumerNadania_QNAME, String.class, PrzesylkaOutputElement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", name = "Pismo", scope = PrzesylkaOutputElement.class)
    public JAXBElement<String> createPrzesylkaOutputElementPismo(String value) {
        return new JAXBElement<String>(_PrzesylkaOutputElementPismo_QNAME, String.class, PrzesylkaOutputElement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PlacowkaData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", name = "PlacowkaAwizacyjna", scope = PrzesylkaOutputElement.class)
    public JAXBElement<PlacowkaData> createPrzesylkaOutputElementPlacowkaAwizacyjna(PlacowkaData value) {
        return new JAXBElement<PlacowkaData>(_HistoriaPrzesylkiOutputElementPlacowkaAwizacyjna_QNAME, PlacowkaData.class, PrzesylkaOutputElement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PlacowkaData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", name = "PlacowkaMacierzysta", scope = PrzesylkaOutputElement.class)
    public JAXBElement<PlacowkaData> createPrzesylkaOutputElementPlacowkaMacierzysta(PlacowkaData value) {
        return new JAXBElement<PlacowkaData>(_HistoriaPrzesylkiOutputElementPlacowkaMacierzysta_QNAME, PlacowkaData.class, PrzesylkaOutputElement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PlacowkaData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", name = "PlacowkaOperacji", scope = PrzesylkaOutputElement.class)
    public JAXBElement<PlacowkaData> createPrzesylkaOutputElementPlacowkaOperacji(PlacowkaData value) {
        return new JAXBElement<PlacowkaData>(_HistoriaPrzesylkiOutputElementPlacowkaOperacji_QNAME, PlacowkaData.class, PrzesylkaOutputElement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", name = "Rodzaj", scope = PrzesylkaOutputElement.class)
    public JAXBElement<String> createPrzesylkaOutputElementRodzaj(String value) {
        return new JAXBElement<String>(_PrzesylkaOutputElementRodzaj_QNAME, String.class, PrzesylkaOutputElement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", name = "Status", scope = PrzesylkaOutputElement.class)
    public JAXBElement<String> createPrzesylkaOutputElementStatus(String value) {
        return new JAXBElement<String>(_HistoriaPrzesylkiOutputElementStatus_QNAME, String.class, PrzesylkaOutputElement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", name = "StatusDate", scope = PrzesylkaOutputElement.class)
    public JAXBElement<XMLGregorianCalendar> createPrzesylkaOutputElementStatusDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_PrzesylkaOutputShortElementStatusDate_QNAME, XMLGregorianCalendar.class, PrzesylkaOutputElement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", name = "Sygnatura", scope = PrzesylkaOutputElement.class)
    public JAXBElement<String> createPrzesylkaOutputElementSygnatura(String value) {
        return new JAXBElement<String>(_PrzesylkaOutputElementSygnatura_QNAME, String.class, PrzesylkaOutputElement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", name = "Ulica", scope = PrzesylkaOutputElement.class)
    public JAXBElement<String> createPrzesylkaOutputElementUlica(String value) {
        return new JAXBElement<String>(_PrzesylkaOutputElementUlica_QNAME, String.class, PrzesylkaOutputElement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPrzesylkaOutputElement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EpoWSLib.DataTypes", name = "listaPrzesylek", scope = PrzesylkiOutputData.class)
    public JAXBElement<ArrayOfPrzesylkaOutputElement> createPrzesylkiOutputDataListaPrzesylek(ArrayOfPrzesylkaOutputElement value) {
        return new JAXBElement<ArrayOfPrzesylkaOutputElement>(_PrzesylkiOutputShortDataListaPrzesylek_QNAME, ArrayOfPrzesylkaOutputElement.class, PrzesylkiOutputData.class, value);
    }

}

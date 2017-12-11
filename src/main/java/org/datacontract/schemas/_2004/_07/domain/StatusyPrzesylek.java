
package org.datacontract.schemas._2004._07.domain;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatusyPrzesylek.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="StatusyPrzesylek"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Dodana"/&gt;
 *     &lt;enumeration value="Usunieta"/&gt;
 *     &lt;enumeration value="OczekujacaNaNadanie"/&gt;
 *     &lt;enumeration value="Nadana"/&gt;
 *     &lt;enumeration value="WUrzedzieOddawczym"/&gt;
 *     &lt;enumeration value="DoreczonaAdresatowi"/&gt;
 *     &lt;enumeration value="DoreczonaAdresatowiNieMoglPotwierdzicOdbioru"/&gt;
 *     &lt;enumeration value="DoreczonaDoZK"/&gt;
 *     &lt;enumeration value="DoreczonaOsobieUprawnionej"/&gt;
 *     &lt;enumeration value="DoreczonaDoroslemuDomownikowi"/&gt;
 *     &lt;enumeration value="DoreczonaAdministracjiDomu"/&gt;
 *     &lt;enumeration value="DoreczonaDozorcyDomu"/&gt;
 *     &lt;enumeration value="DoreczonaSoltysowi"/&gt;
 *     &lt;enumeration value="DoreczonaPrzelozonemuSluzbyWieziennej"/&gt;
 *     &lt;enumeration value="PozostawionaWPlacowceAwizo1WDrzwiachAdresata"/&gt;
 *     &lt;enumeration value="PozostawionaWPlacowceAwizo1WSkrzynceOddawczej"/&gt;
 *     &lt;enumeration value="PozostawionaWPlacowceAwizo1WSkrytcePocztowej"/&gt;
 *     &lt;enumeration value="WystawionoAwizo2"/&gt;
 *     &lt;enumeration value="NieDoreczonaGdyzAdresatOdmowilPrzyjecia"/&gt;
 *     &lt;enumeration value="NieDoreczonaGdyzNiepelnyAdres"/&gt;
 *     &lt;enumeration value="NieDoreczonaZInnychPrzyczyn"/&gt;
 *     &lt;enumeration value="UmieszczonaNaKarcieEPO"/&gt;
 *     &lt;enumeration value="OdwiazanaOdKartyEpo"/&gt;
 *     &lt;enumeration value="Zwrot"/&gt;
 *     &lt;enumeration value="PrzesylkaNiePodjetaWTerminie"/&gt;
 *     &lt;enumeration value="Wydana"/&gt;
 *     &lt;enumeration value="PozostawionaWUrzedzieGminyAwizo1WDrzwiachAdresata"/&gt;
 *     &lt;enumeration value="PozostawionaWUrzedzieGminyAwizo1WSkrzynceOddawczej"/&gt;
 *     &lt;enumeration value="PozostawionaWUrzedzieGminyAwizo1WSkrytcePocztowej"/&gt;
 *     &lt;enumeration value="DoreczonaUpowaznionemuPracownikowi"/&gt;
 *     &lt;enumeration value="WydanaUpowaznionemuPracownikowi"/&gt;
 *     &lt;enumeration value="WydanaOsobieUprawnionejDoReprezentacji"/&gt;
 *     &lt;enumeration value="WydanaPelnomocnikowiPocztowemu"/&gt;
 *     &lt;enumeration value="DoreczonoMetodaTradycyjna"/&gt;
 *     &lt;enumeration value="Odrzucona"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "StatusyPrzesylek", namespace = "http://schemas.datacontract.org/2004/07/Domain.Types")
@XmlEnum
public enum StatusyPrzesylek {

    @XmlEnumValue("Dodana")
    DODANA("Dodana"),
    @XmlEnumValue("Usunieta")
    USUNIETA("Usunieta"),
    @XmlEnumValue("OczekujacaNaNadanie")
    OCZEKUJACA_NA_NADANIE("OczekujacaNaNadanie"),
    @XmlEnumValue("Nadana")
    NADANA("Nadana"),
    @XmlEnumValue("WUrzedzieOddawczym")
    W_URZEDZIE_ODDAWCZYM("WUrzedzieOddawczym"),
    @XmlEnumValue("DoreczonaAdresatowi")
    DORECZONA_ADRESATOWI("DoreczonaAdresatowi"),
    @XmlEnumValue("DoreczonaAdresatowiNieMoglPotwierdzicOdbioru")
    DORECZONA_ADRESATOWI_NIE_MOGL_POTWIERDZIC_ODBIORU("DoreczonaAdresatowiNieMoglPotwierdzicOdbioru"),
    @XmlEnumValue("DoreczonaDoZK")
    DORECZONA_DO_ZK("DoreczonaDoZK"),
    @XmlEnumValue("DoreczonaOsobieUprawnionej")
    DORECZONA_OSOBIE_UPRAWNIONEJ("DoreczonaOsobieUprawnionej"),
    @XmlEnumValue("DoreczonaDoroslemuDomownikowi")
    DORECZONA_DOROSLEMU_DOMOWNIKOWI("DoreczonaDoroslemuDomownikowi"),
    @XmlEnumValue("DoreczonaAdministracjiDomu")
    DORECZONA_ADMINISTRACJI_DOMU("DoreczonaAdministracjiDomu"),
    @XmlEnumValue("DoreczonaDozorcyDomu")
    DORECZONA_DOZORCY_DOMU("DoreczonaDozorcyDomu"),
    @XmlEnumValue("DoreczonaSoltysowi")
    DORECZONA_SOLTYSOWI("DoreczonaSoltysowi"),
    @XmlEnumValue("DoreczonaPrzelozonemuSluzbyWieziennej")
    DORECZONA_PRZELOZONEMU_SLUZBY_WIEZIENNEJ("DoreczonaPrzelozonemuSluzbyWieziennej"),
    @XmlEnumValue("PozostawionaWPlacowceAwizo1WDrzwiachAdresata")
    POZOSTAWIONA_W_PLACOWCE_AWIZO_1_W_DRZWIACH_ADRESATA("PozostawionaWPlacowceAwizo1WDrzwiachAdresata"),
    @XmlEnumValue("PozostawionaWPlacowceAwizo1WSkrzynceOddawczej")
    POZOSTAWIONA_W_PLACOWCE_AWIZO_1_W_SKRZYNCE_ODDAWCZEJ("PozostawionaWPlacowceAwizo1WSkrzynceOddawczej"),
    @XmlEnumValue("PozostawionaWPlacowceAwizo1WSkrytcePocztowej")
    POZOSTAWIONA_W_PLACOWCE_AWIZO_1_W_SKRYTCE_POCZTOWEJ("PozostawionaWPlacowceAwizo1WSkrytcePocztowej"),
    @XmlEnumValue("WystawionoAwizo2")
    WYSTAWIONO_AWIZO_2("WystawionoAwizo2"),
    @XmlEnumValue("NieDoreczonaGdyzAdresatOdmowilPrzyjecia")
    NIE_DORECZONA_GDYZ_ADRESAT_ODMOWIL_PRZYJECIA("NieDoreczonaGdyzAdresatOdmowilPrzyjecia"),
    @XmlEnumValue("NieDoreczonaGdyzNiepelnyAdres")
    NIE_DORECZONA_GDYZ_NIEPELNY_ADRES("NieDoreczonaGdyzNiepelnyAdres"),
    @XmlEnumValue("NieDoreczonaZInnychPrzyczyn")
    NIE_DORECZONA_Z_INNYCH_PRZYCZYN("NieDoreczonaZInnychPrzyczyn"),
    @XmlEnumValue("UmieszczonaNaKarcieEPO")
    UMIESZCZONA_NA_KARCIE_EPO("UmieszczonaNaKarcieEPO"),
    @XmlEnumValue("OdwiazanaOdKartyEpo")
    ODWIAZANA_OD_KARTY_EPO("OdwiazanaOdKartyEpo"),
    @XmlEnumValue("Zwrot")
    ZWROT("Zwrot"),
    @XmlEnumValue("PrzesylkaNiePodjetaWTerminie")
    PRZESYLKA_NIE_PODJETA_W_TERMINIE("PrzesylkaNiePodjetaWTerminie"),
    @XmlEnumValue("Wydana")
    WYDANA("Wydana"),
    @XmlEnumValue("PozostawionaWUrzedzieGminyAwizo1WDrzwiachAdresata")
    POZOSTAWIONA_W_URZEDZIE_GMINY_AWIZO_1_W_DRZWIACH_ADRESATA("PozostawionaWUrzedzieGminyAwizo1WDrzwiachAdresata"),
    @XmlEnumValue("PozostawionaWUrzedzieGminyAwizo1WSkrzynceOddawczej")
    POZOSTAWIONA_W_URZEDZIE_GMINY_AWIZO_1_W_SKRZYNCE_ODDAWCZEJ("PozostawionaWUrzedzieGminyAwizo1WSkrzynceOddawczej"),
    @XmlEnumValue("PozostawionaWUrzedzieGminyAwizo1WSkrytcePocztowej")
    POZOSTAWIONA_W_URZEDZIE_GMINY_AWIZO_1_W_SKRYTCE_POCZTOWEJ("PozostawionaWUrzedzieGminyAwizo1WSkrytcePocztowej"),
    @XmlEnumValue("DoreczonaUpowaznionemuPracownikowi")
    DORECZONA_UPOWAZNIONEMU_PRACOWNIKOWI("DoreczonaUpowaznionemuPracownikowi"),
    @XmlEnumValue("WydanaUpowaznionemuPracownikowi")
    WYDANA_UPOWAZNIONEMU_PRACOWNIKOWI("WydanaUpowaznionemuPracownikowi"),
    @XmlEnumValue("WydanaOsobieUprawnionejDoReprezentacji")
    WYDANA_OSOBIE_UPRAWNIONEJ_DO_REPREZENTACJI("WydanaOsobieUprawnionejDoReprezentacji"),
    @XmlEnumValue("WydanaPelnomocnikowiPocztowemu")
    WYDANA_PELNOMOCNIKOWI_POCZTOWEMU("WydanaPelnomocnikowiPocztowemu"),
    @XmlEnumValue("DoreczonoMetodaTradycyjna")
    DORECZONO_METODA_TRADYCYJNA("DoreczonoMetodaTradycyjna"),
    @XmlEnumValue("Odrzucona")
    ODRZUCONA("Odrzucona");
    private final String value;

    StatusyPrzesylek(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StatusyPrzesylek fromValue(String v) {
        for (StatusyPrzesylek c: StatusyPrzesylek.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

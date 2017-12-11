
package org.datacontract.schemas._2004._07.domain;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GeneralPrzesylkaStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="GeneralPrzesylkaStatus"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Dodana"/&gt;
 *     &lt;enumeration value="Usunieta"/&gt;
 *     &lt;enumeration value="OczekujacaNaNadanie"/&gt;
 *     &lt;enumeration value="Nadana"/&gt;
 *     &lt;enumeration value="WUrzedzieOddawczym"/&gt;
 *     &lt;enumeration value="DoreczonaAdresatowi"/&gt;
 *     &lt;enumeration value="DoreczonaInnejOsobie"/&gt;
 *     &lt;enumeration value="Awizo1"/&gt;
 *     &lt;enumeration value="Awizo2"/&gt;
 *     &lt;enumeration value="Zwrot"/&gt;
 *     &lt;enumeration value="UmieszczonaNaKarcieEPO"/&gt;
 *     &lt;enumeration value="OdwiazanaOdKartyEpo"/&gt;
 *     &lt;enumeration value="Wydana"/&gt;
 *     &lt;enumeration value="WydanaInnejOsobie"/&gt;
 *     &lt;enumeration value="DoreczonoMetodaTradycyjna"/&gt;
 *     &lt;enumeration value="Odrzucona"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "GeneralPrzesylkaStatus", namespace = "http://schemas.datacontract.org/2004/07/Domain.Types")
@XmlEnum
public enum GeneralPrzesylkaStatus {

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
    @XmlEnumValue("DoreczonaInnejOsobie")
    DORECZONA_INNEJ_OSOBIE("DoreczonaInnejOsobie"),
    @XmlEnumValue("Awizo1")
    AWIZO_1("Awizo1"),
    @XmlEnumValue("Awizo2")
    AWIZO_2("Awizo2"),
    @XmlEnumValue("Zwrot")
    ZWROT("Zwrot"),
    @XmlEnumValue("UmieszczonaNaKarcieEPO")
    UMIESZCZONA_NA_KARCIE_EPO("UmieszczonaNaKarcieEPO"),
    @XmlEnumValue("OdwiazanaOdKartyEpo")
    ODWIAZANA_OD_KARTY_EPO("OdwiazanaOdKartyEpo"),
    @XmlEnumValue("Wydana")
    WYDANA("Wydana"),
    @XmlEnumValue("WydanaInnejOsobie")
    WYDANA_INNEJ_OSOBIE("WydanaInnejOsobie"),
    @XmlEnumValue("DoreczonoMetodaTradycyjna")
    DORECZONO_METODA_TRADYCYJNA("DoreczonoMetodaTradycyjna"),
    @XmlEnumValue("Odrzucona")
    ODRZUCONA("Odrzucona");
    private final String value;

    GeneralPrzesylkaStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GeneralPrzesylkaStatus fromValue(String v) {
        for (GeneralPrzesylkaStatus c: GeneralPrzesylkaStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

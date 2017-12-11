
package org.datacontract.schemas._2004._07.epowslib;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DateTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DateTypes"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DataAwizo1"/&gt;
 *     &lt;enumeration value="DataAwizo2"/&gt;
 *     &lt;enumeration value="DataZwrotu"/&gt;
 *     &lt;enumeration value="DataOdbioru"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DateTypes")
@XmlEnum
public enum DateTypes {

    @XmlEnumValue("DataAwizo1")
    DATA_AWIZO_1("DataAwizo1"),
    @XmlEnumValue("DataAwizo2")
    DATA_AWIZO_2("DataAwizo2"),
    @XmlEnumValue("DataZwrotu")
    DATA_ZWROTU("DataZwrotu"),
    @XmlEnumValue("DataOdbioru")
    DATA_ODBIORU("DataOdbioru");
    private final String value;

    DateTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DateTypes fromValue(String v) {
        for (DateTypes c: DateTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

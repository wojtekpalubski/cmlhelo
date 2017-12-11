
package org.datacontract.schemas._2004._07.epowslib;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KodWalidacji.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="KodWalidacji"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="OK"/&gt;
 *     &lt;enumeration value="InternalServerError"/&gt;
 *     &lt;enumeration value="AuthorizationError"/&gt;
 *     &lt;enumeration value="ValidationError"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "KodWalidacji")
@XmlEnum
public enum KodWalidacji {

    OK("OK"),
    @XmlEnumValue("InternalServerError")
    INTERNAL_SERVER_ERROR("InternalServerError"),
    @XmlEnumValue("AuthorizationError")
    AUTHORIZATION_ERROR("AuthorizationError"),
    @XmlEnumValue("ValidationError")
    VALIDATION_ERROR("ValidationError");
    private final String value;

    KodWalidacji(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static KodWalidacji fromValue(String v) {
        for (KodWalidacji c: KodWalidacji.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

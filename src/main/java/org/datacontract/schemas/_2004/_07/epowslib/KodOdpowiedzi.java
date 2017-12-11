
package org.datacontract.schemas._2004._07.epowslib;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KodOdpowiedzi.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="KodOdpowiedzi"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="OK"/&gt;
 *     &lt;enumeration value="Created"/&gt;
 *     &lt;enumeration value="BadRequest"/&gt;
 *     &lt;enumeration value="Unauthorized"/&gt;
 *     &lt;enumeration value="NotFound"/&gt;
 *     &lt;enumeration value="MethodNotAllowed"/&gt;
 *     &lt;enumeration value="InternalServerError"/&gt;
 *     &lt;enumeration value="ServiceUnavailable"/&gt;
 *     &lt;enumeration value="AuthenticationError"/&gt;
 *     &lt;enumeration value="AuthorizationError"/&gt;
 *     &lt;enumeration value="ValidationError"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "KodOdpowiedzi")
@XmlEnum
public enum KodOdpowiedzi {

    OK("OK"),
    @XmlEnumValue("Created")
    CREATED("Created"),
    @XmlEnumValue("BadRequest")
    BAD_REQUEST("BadRequest"),
    @XmlEnumValue("Unauthorized")
    UNAUTHORIZED("Unauthorized"),
    @XmlEnumValue("NotFound")
    NOT_FOUND("NotFound"),
    @XmlEnumValue("MethodNotAllowed")
    METHOD_NOT_ALLOWED("MethodNotAllowed"),
    @XmlEnumValue("InternalServerError")
    INTERNAL_SERVER_ERROR("InternalServerError"),
    @XmlEnumValue("ServiceUnavailable")
    SERVICE_UNAVAILABLE("ServiceUnavailable"),
    @XmlEnumValue("AuthenticationError")
    AUTHENTICATION_ERROR("AuthenticationError"),
    @XmlEnumValue("AuthorizationError")
    AUTHORIZATION_ERROR("AuthorizationError"),
    @XmlEnumValue("ValidationError")
    VALIDATION_ERROR("ValidationError");
    private final String value;

    KodOdpowiedzi(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static KodOdpowiedzi fromValue(String v) {
        for (KodOdpowiedzi c: KodOdpowiedzi.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

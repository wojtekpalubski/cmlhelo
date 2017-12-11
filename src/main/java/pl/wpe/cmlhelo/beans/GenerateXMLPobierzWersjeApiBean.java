package pl.wpe.cmlhelo.beans;

public class GenerateXMLPobierzWersjeApiBean {
	private static String user = "";
	private static String haslo = "";
	private static String apikey = "";

	public static String map(String string) {
		String xml = "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:msep=\"http://ms.gov.pl/msepo\">\r\n"
				+ "   <soapenv:Header/>\r\n" + "   <soapenv:Body>\r\n" + "      <msep:PobierzWersjeApi/>\r\n"
				+ "   </soapenv:Body>\r\n" + "</soapenv:Envelope>";

		return xml;
	}
}

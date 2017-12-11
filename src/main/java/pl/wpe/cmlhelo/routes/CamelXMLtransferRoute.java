package pl.wpe.cmlhelo.routes;

import javax.xml.bind.JAXBContext;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.converter.jaxb.JaxbDataFormat;
import org.springframework.stereotype.Component;

import pl.wpe.cmlhelo.beans.Plik;
import pl.wpe.cmlhelo.procesory.XMLPlikProcessor;

@Component
public class CamelXMLtransferRoute extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		JaxbDataFormat jxb =new JaxbDataFormat("pl.wpe.cmlhelo.beans.Plik");
		jxb.setContext(JAXBContext.newInstance(pl.wpe.cmlhelo.beans.Plik.class));
		
		System.out.println("Startuje CamelXMLtransferRoute");
		from("file:xml/we?delay=10000")
		.log("Przetwarzam XML ${file:name} > obj")
		.unmarshal(jxb)
		.log("Plik ${file:name}: ${body}")
		.log("Przetwarzanie pliku ${file:name}")
		.bean(Plik.class, "podniesWersje")
		.log("Plik ${file:name} po podniesieniu wersji: ${body}")
		.bean(Plik.class, "przetworz")
		.log("Plik ${file:name}: po przetworzeniu ${body}")
		.log("Plik ${file:name}: zaczynam przetwarzanie procesorem")
		.process(new XMLPlikProcessor())
		.log("Plik ${file:name}: po przetworzeniu procesorem ${body}")
		.log("Zapis XML ${file:name}")
		.to("file:xml/wy?fileExist=Override");
	}

}

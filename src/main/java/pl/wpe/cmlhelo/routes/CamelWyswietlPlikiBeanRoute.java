package pl.wpe.cmlhelo.routes;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

import pl.wpe.cmlhelo.beans.NumerowaneWierszeBean;

//@Component	
public class CamelWyswietlPlikiBeanRoute extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		System.out.println("Startuje CamelWyswietlPlikiBean");
		from("file:wyswietl2?move=wyswietlone&delay=20000&include=plik[0-9].txt")
		.log("Wyswietlam bean plik ${file:name}")
		.bean(new NumerowaneWierszeBean())
		.to("stream:out");
	}

}

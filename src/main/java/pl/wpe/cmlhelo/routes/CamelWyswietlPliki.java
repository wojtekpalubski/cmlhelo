package pl.wpe.cmlhelo.routes;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

import pl.wpe.cmlhelo.procesory.NumerujWierszeProcessor;

@Component
public class CamelWyswietlPliki extends RouteBuilder{

	@Override
	public void configure() throws Exception {
		System.out.println("Startuje CamelWyswietlPliki");
		from("file:wyswietl?move=wyswietlone&delay=20000&include=plik[0-9].txt")
		.log("Wyswietlam plik ${file:name}")
		.process(new NumerujWierszeProcessor())
		.to("stream:out");
	}

}

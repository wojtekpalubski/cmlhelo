package pl.wpe.cmlhelo.routes;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

//@Component
public class CamelFileMoveRoute extends RouteBuilder {
	@Override
	public void configure() throws Exception {
		System.out.println("Startuje CamelFileMove");
		from("file:przesuniecie?noop=true&delete=true&delay=10000")
		.log("Przenioslem plik ${file:name}")
		.to("file:przesuniecie/wy?fileExist=Override");
	}
}

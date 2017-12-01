package pl.wpe.cmlhelo.routes;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class CamelXMLRoute extends RouteBuilder {
    @Override
    public void configure() throws Exception {
    	System.out.println("Startuje CamelXMLRoute");
        from("file:we")
                .log("Receiving order ${file:name}")
                .choice()
                .when().xpath("//order/customer/country[text() = 'UK']")
                .log("Sending order ${file:name} to the UK")
                .to("file:work/cbr/output/uk")
                .when().xpath("//order/customer/country[text() = 'US']")
                .log("Sending order ${file:name} to the US")
                .to("file:work/cbr/output/us")
                .otherwise()
                .log("Sending order ${file:name} to another country")
                .to("file:wy")
                .log("Done processing ${file:name}");
    }
}

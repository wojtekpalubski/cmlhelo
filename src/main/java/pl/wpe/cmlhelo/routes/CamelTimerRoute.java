package pl.wpe.cmlhelo.routes;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;
import pl.wpe.cmlhelo.procesory.PrintStringProcessor;

//@Component
public class CamelTimerRoute extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        System.out.println("Startuje CamelTimer");
        from("timer:foo?period=15s")
                .process(new PrintStringProcessor())
                .process(new PrintStringProcessor(10))
                .process(new PrintStringProcessor(3000))
                .to("log:bar");
    }
}

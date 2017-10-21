package pl.wpe.cmlhelo;

import org.apache.camel.CamelContext;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class CamelCopy  {

    //@Override
    public void configure() {
//        from("file://plikwe?noop=true").to("file://plikwy");
        //from("timer:foo?period=5000")                .to("log:bar");
    }

}



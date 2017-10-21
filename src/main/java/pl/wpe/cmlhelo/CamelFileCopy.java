package pl.wpe.cmlhelo;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class CamelFileCopy extends RouteBuilder {
    @Override
    public void configure() throws Exception {
        from("file://plikwe.txt?noop=true").to("file://plikwy.txt?fileExist=Override");
    }
}

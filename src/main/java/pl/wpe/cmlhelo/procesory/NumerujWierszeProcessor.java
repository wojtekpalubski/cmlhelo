package pl.wpe.cmlhelo.procesory;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;


public class NumerujWierszeProcessor implements Processor {
	public void process(Exchange exchange) throws InterruptedException {
		System.out.println("Zaczynam numerowanie wierszy");
		AtomicInteger i=new AtomicInteger(0);
        Arrays.asList(exchange.getIn().getBody(String.class).split("\n"))
        .stream()
        .map(w->i.getAndIncrement()+" "+w)
        .collect(Collectors.toList());
        
        System.out.println("Ponumerowano wierszy: "+i.get());
    }
}

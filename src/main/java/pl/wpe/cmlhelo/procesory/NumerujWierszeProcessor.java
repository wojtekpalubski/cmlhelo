package pl.wpe.cmlhelo.procesory;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;


/**
 * Wyciąga z Exchange wejściowego body jako string, 
 * numeruje kazdy wiersz i zapisuje go do body exchange
 * @author Wojciech.Palubski
 *
 */
public class NumerujWierszeProcessor implements Processor {
	private AtomicInteger i=new AtomicInteger(0);
	
	public void process(Exchange exchange) throws InterruptedException {
		System.out.println("Zaczynam numerowanie wierszy");
		i.set(0);
//        Arrays.asList(exchange.getIn().getBody(String.class).split("\n"))
//        .stream()
//        .map(w->i.getAndIncrement()+" "+w)
//        .collect(Collectors.joining("\n"));
        exchange.getIn().setBody(Arrays.asList(exchange.getIn().getBody(String.class).split("\n"))
                .stream()
                .map(w->i.getAndIncrement()+" "+w)
                .collect(Collectors.joining("\n")));
        System.out.println("Ponumerowano wierszy: "+(i.get()));
    }
}

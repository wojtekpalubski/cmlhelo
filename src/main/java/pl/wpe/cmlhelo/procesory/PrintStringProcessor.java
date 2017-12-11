package pl.wpe.cmlhelo.procesory;


import org.apache.camel.Processor;
import org.apache.camel.Exchange;

public class PrintStringProcessor implements Processor {
    private long slip=0;

    public PrintStringProcessor(){}
    public PrintStringProcessor(long slip){
        this.slip=slip;
    }
    public void process(Exchange exchange) throws InterruptedException {
        Thread.sleep(slip);
//        System.out.println("-="+exchange.getIn().getBody(String.class));

    }
}

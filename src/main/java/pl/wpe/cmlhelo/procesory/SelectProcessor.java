/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.wpe.cmlhelo.procesory;

import java.util.List;
import java.util.logging.Logger;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;

/**
 *
 * @author Wojciech.Palubski
 */
public class SelectProcessor implements Processor  {

    @Override
    public void process(Exchange exchange) throws Exception {
		System.out.println("Zaczynam procesor SelectProcessor");
		List p=exchange.getIn().getBody(List.class);
//		p.forEach(System.out::println);
		//exchange.getIn().setBody(p);
        System.out.println("Przetworzono SelectProcessor: "+p.size());
    }
    
}

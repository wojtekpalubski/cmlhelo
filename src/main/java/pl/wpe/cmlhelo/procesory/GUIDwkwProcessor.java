/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.wpe.cmlhelo.procesory;

import java.util.UUID;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;

/**
 *
 * @author Wojciech.Palubski
 */
public class GUIDwkwProcessor implements Processor{

    @Override
    public void process(Exchange exchange) throws Exception {
        exchange.getIn().setHeader("GUID", UUID.randomUUID().toString());
        Double d=(Math.random()*1000);
        exchange.getIn().setHeader("WKW",String.format("%d", d.intValue()));
        
    }
    
}

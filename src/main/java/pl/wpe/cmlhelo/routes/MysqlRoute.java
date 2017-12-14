/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.wpe.cmlhelo.routes;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;
import pl.wpe.cmlhelo.procesory.GUIDwkwProcessor;
import pl.wpe.cmlhelo.procesory.SelectProcessor;

@Component
public class MysqlRoute extends RouteBuilder{

    @Override
    public void configure() throws Exception {
        System.out.println("Startuje MysqlRoute");
        from("timer:mysqlTimer?period=50")
                .to("log:generacjaGUID")
                .process(new GUIDwkwProcessor())
                .to("log:zapisDoBazy")
                .to("sql:insert into wyslane values(:#GUID,:#WKW)")
//                .setBody(constant("select count(*) from camel"))
//                .to("jdbc:dataSource")
                .to("log:odczytZBazy")
                .to("sql:select * from wyslane")
                .process(new SelectProcessor())
                .to("log:zMysql?showBody=false");
    }
    
}

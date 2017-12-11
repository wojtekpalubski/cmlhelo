package pl.wpe.cmlhelo.routes;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

import pl.wpe.cmlhelo.beans.GenerateXMLPobierzWersjeApiBean;


//@Component
//public class GetVersionApiRoute extends RouteBuilder {
//
//	@Override
//	public void configure() throws Exception {
//		from("timer://getVersionApi?period=60s")
//		.log("wywoluje GetWersjeApi")
//		.bean(new GenerateXMLPobierzWersjeApiBean())
//		.to("cxf://https://saepo:9023/EpoService.svc?serviceName=PobierzWersjeApi&serviceClass=pl.gov.ms.msepo.PobierzWersjeApi")
//		.log("po GetWersjeApi: "+body())
//				;
//	}
//}

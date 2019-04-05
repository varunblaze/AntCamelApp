package routebuilder;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.properties.PropertiesComponent;

public class FileProcessrRouteBuilder extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		// TODO Auto-generated method stub
		        // configure properties component
		        PropertiesComponent pc = getContext().getComponent("properties", PropertiesComponent.class);
		        pc.setLocation("classpath:camel.properties");

		        // lets shutdown faster in case of in-flight messages stack up
		        getContext().getShutdownStrategy().setTimeout(10);
/*
		        from("{{ftp.server}}")
		            .to("file:target/download")
		            .log("Downloaded file ${file:name} complete.");
*/
		        from("file:D://test")
				   .log("${body}")
				   .log("${file:name}")
				   .to("stream:out");
			System.out.println("Use ctrl + c to stop this application.");
		        System.out.println("*********************************************************************************");
		
	}

}

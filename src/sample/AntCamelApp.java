package sample;

import org.apache.camel.Main;

import routebuilder.FileProcessrRouteBuilder;
public class AntCamelApp  {

	
	  public static void main(String[] args) throws Exception {
	        Main main = new Main();
	        main.addRouteBuilder(new FileProcessrRouteBuilder());
	        main.run();
	}
}


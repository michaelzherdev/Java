import javax.xml.ws.Endpoint;

import org.mzherdev.ProductCatalog;


public class TestMartPublisher {
	
	public static void main(String[] args) {
		
		Endpoint.publish("http://localhost:1234/productcatalog",
				new ProductCatalog());
	}

}

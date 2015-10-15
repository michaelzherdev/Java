package org.mzherdev;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;

import org.mzherdev.model.Product;


//SEI: service entpoint interface
@WebService(name="TestMartCatalog", portName="TestCatalogPort",
serviceName="TestMartCatalogService", targetNamespace="http://www.testmart.com")
public interface ProductCatalogInterface {

	@WebMethod(action="fetch categories", operationName="fetchCategories") 
	public abstract List<String> getProductCategories();
	
	@WebMethod
	public abstract List<String> getProducts(String category);
	
	@WebMethod
	public abstract boolean addProduct(String category, String product);
	
	@WebMethod
	@WebResult(name="Product")
	public abstract List<Product> getProductsV2(String category);

}
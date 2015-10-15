package org.mzherdev;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import org.mzherdev.business.ProductServiceImpl;
import org.mzherdev.model.Product;

//@WebService(name="TestMartCatalog", portName="TestCatalogPort",
//	serviceName="TestMartCatalogService", targetNamespace="http://www.testmart.com")
@WebService(endpointInterface="org.mzherdev.ProductCatalogInterface")
public class ProductCatalog implements ProductCatalogInterface {
	
	ProductServiceImpl productService = new  ProductServiceImpl();
	
	/* (non-Javadoc)
	 * @see org.mzherdev.ProductCatalogInterface#getProductCategories()
	 */
	@Override
	// - optional
	public List<String> getProductCategories() {
//		List<String> categories = new ArrayList<String>();
//		categories.add("Books");
//		categories.add("Music");
//		categories.add("Movies");
//		return categories;
		return productService.getProductCategories();
	}

	/* (non-Javadoc)
	 * @see org.mzherdev.ProductCatalogInterface#getProducts(java.lang.String)
	 */
	@Override
	@WebMethod//(exclude=true)
	public List<String> getProducts(String category) {
		return productService.getProducts(category);
	}
	
	/* (non-Javadoc)
	 * @see org.mzherdev.ProductCatalogInterface#addProduct(java.lang.String, java.lang.String)
	 */
	@Override
	@WebMethod//(exclude=true)
	public boolean addProduct(String category, String product) {
		return productService.addProduct(category, product);
	}
	
	/* (non-Javadoc)
	 * @see org.mzherdev.ProductCatalogInterface#getProductsV2(java.lang.String)
	 */
	@Override
	@WebMethod
	public List<Product> getProductsV2(String category) {
		return productService.getProductsV2(category);
	}
}

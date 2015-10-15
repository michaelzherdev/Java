package org.mzherdev.business;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebMethod;

import org.mzherdev.model.Product;

public class ProductServiceImpl {
	
	List<String> bookList = new ArrayList<String>();
	List<String> musicList = new ArrayList<String>();
	List<String> movieList = new ArrayList<String>();
	
	

	public ProductServiceImpl() {
		bookList.add("Inferno");
		bookList.add("JoyLand");
		bookList.add("The Game of Thrones");
		
		musicList.add("Random Access Memories");
		musicList.add("Night Visions");
		musicList.add("Nevermind");
		
		movieList.add("Oz the Great and Powerful");
		movieList.add("Despicable Me");
		movieList.add("Star Trek Into Darkness");
	}



	public List<String> getProductCategories() {
		List<String> categories = new ArrayList<String>();
		categories.add("Books");
		categories.add("Music");
		categories.add("Movies");
		return categories;
	}
	
	public List<String> getProducts(String category) {
		switch(category.toLowerCase()) {
		case "books": 
			return bookList;
		case "music": 
			return musicList;
		case "movie": 
			return movieList;
		}
		return null;
	}
	
	public boolean addProduct(String category, String product) {
		switch(category.toLowerCase()) {
		case "books": 
			bookList.add(product);
			break;
		case "music": 
			musicList.add(product);
			break;
		case "movie": 
			movieList.add(product);
			break;
		default: 
			return false;
		}
		return true;
	}
	
	@WebMethod
	public List<Product> getProductsV2(String category) {
		List<Product> productList = new ArrayList<Product>();
		productList.add(new Product("Java Book", "1234", 999.99));
		productList.add(new Product("Another Book", "4567", 12.50));
		return productList;
	}
}


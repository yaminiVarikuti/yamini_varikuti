package com.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import com.demo.pojo.Product;



public interface ProductService{
	
	Product CreatProductDetails(Product product); ///done
	
	// add for product
		Product addProductDetails(Product product);  //ignore it

		// list of all products

		List<Product> ListOfProducts(Product product);  //done
		// Delete of Product

		void deleteProduct(Long id); //done

		// view of particular Product by id

	     Optional<Product> getProductById(long id);  //done

		// update of particular Product by id

	     Product updateOfProductById(Long id); //done
	
}
	



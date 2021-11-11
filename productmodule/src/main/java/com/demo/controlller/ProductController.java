package com.demo.controlller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.pojo.Product;
import com.demo.serviceImpl.ProductServiceImpl;



@RestController
@RequestMapping("/vi/api")
public class ProductController {

	@Autowired
	ProductServiceImpl productServiceImpl;

	// api for add product details
	@PostMapping("/createproduct")
	Product createProductDetails(@RequestBody Product productinfo) {

		Product prodinfo = productServiceImpl.CreatProductDetails(productinfo);

		return prodinfo;

	}

	// api for get product details by id
	@GetMapping("/product/{id}")
	Optional<Product> getProductById(@PathVariable(value = "id") Long id) {

		Optional<Product> prod = productServiceImpl.getProductById(id);

		return prod;

	}

	// api for get product list
	@GetMapping("/listofproducts")
	public List<Product> listOfProducts(Product product) {

		List<Product> listOfProductsdetails = productServiceImpl.ListOfProducts(product);

		return listOfProductsdetails;
	}

	// api for delete product by id
	@DeleteMapping("/productdeletedbyid/{id}")
	public Map<String,Boolean> deleteById(@PathVariable(value = "id") Long id) {
	      Map<String,Boolean> response = new HashMap<>();
		
		Optional<Product> prod = productServiceImpl.getProductById(id);
		
		if(prod!=null) {
			productServiceImpl.deleteProduct(id);
			response.put("deleted", Boolean.TRUE);
			return response;
		}
			
			response.put(" not deleted", Boolean.FALSE);
			return response;
	}

}

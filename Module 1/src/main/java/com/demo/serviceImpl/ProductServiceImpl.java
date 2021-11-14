package com.demo.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.pojo.Product;
import com.demo.repositary.ProductRepositary;
import com.demo.service.ProductService;



@Service
public class ProductServiceImpl implements ProductService {
	// injecting the dependencies of ProductRepositary......jpa repositary
	@Autowired
	ProductRepositary productRepositary; // formed object internally by spring ioc using autwired priniple

	// add prodcut api logic part

	@Override
	public Product CreatProductDetails(Product product) {

		return productRepositary.save(product);
	}

	@Override
	public Product addProductDetails(Product product) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> ListOfProducts(Product product) {

		List<Product> listOfProducts = productRepositary.findAll();

		return listOfProducts;
	}

	@Override
	public void deleteProduct(Long id) {

		productRepositary.deleteById(id);

	}

	@Override
	public Optional<Product> getProductById(long id) {

		Optional<Product> prod = productRepositary.findById(id);

		return prod;
	}

	@Override
	public Product updateOfProductById(Long id) {
		Product product=null;
		try {
			 product = productRepositary.findById(id)
					.orElseThrow(() -> new Exception("Prodcut not found for this id :: " + id));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return product;
	
		
	}

}

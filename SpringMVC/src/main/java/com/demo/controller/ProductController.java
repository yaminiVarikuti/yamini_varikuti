package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.demo.service.ProductManager;
@Controller
@RequestMapping("/employee-module")
public class ProductController {
	@Autowired
	ProductManager manager;
	@RequestMapping(value="/getProductDetails",method= RequestMethod.GET)
	public String getProductDetails(Model model) {
		model.addAttribute(manager.getProductDetails());
		return "productListDisplay";
		
	}
	
	

}

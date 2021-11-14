package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.demo.dao.ProductDAO;
import com.demo.model.ProductVO;

public class ProductManagerImpl implements ProductManager{
	@Autowired
	ProductDAO dao;

	@Override
	public List<ProductVO> getProductDetails() {
		
		return dao.getProductDetails();
	}
	
}

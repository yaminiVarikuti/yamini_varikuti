package com.demo.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.demo.dao.ProductDAO;
import com.demo.model.ProductVO;

@Repository
public class ProductDAOImpl  implements ProductDAO{
	

		public List<ProductVO> getProductDetails() 
		{
			List<ProductVO> employees = new ArrayList<ProductVO>();
			
			ProductVO vo1 = new ProductVO();
			vo1.setId(1);
			vo1.setProductname("samsung");
			vo1.setProducttype("Mobile");
			employees.add(vo1);
			
			//EmployeeVO vo2 = new EmployeeVO();
			//vo2.setId(2);
			//vo2.setFirstName("Raj");
			//vo2.setLastName("Kishore");
			//employees.add(vo2);
			
			return employees;
		}

}

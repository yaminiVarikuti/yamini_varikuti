package com.demo.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.pojo.Student;
import com.demo.serviceImpl.StudentserviceImpl;
@RestController
@RequestMapping("/yamin/api")
public class StudentController {
	
	@Autowired
	StudentserviceImpl studentServiceImpl;

	// api for add shop details
	@PostMapping("/createstudent")
	Student createStudentDetails(@RequestBody Student shopinfo) {

		Student shopinfo1 = studentServiceImpl.creatStudentDetails(shopinfo);

		return shopinfo1;

	}

	// api for get shop details by id
	@GetMapping("/student/{id}")
	Student updateShoppoingById(@PathVariable(value = "id") Integer id) {

		Student prod =studentServiceImpl.updateOfStudentById(id);

		return prod;

	}

	// api for get shop list
	@GetMapping("/listofstudents")
	public List<Student> listOfshopping(Student customer) {

		List<Student> listOfStudentdetails = studentServiceImpl.ListOfStudent(customer);

		return listOfStudentdetails;
	}

	// api for delete product by id
	@DeleteMapping("/customerdeletedbyid/{id}")
	public Map<String,Boolean> deleteById(@PathVariable(value = "id") Integer id) {
	      Map<String,Boolean> response = new HashMap<>();
		
	      Student prod = studentServiceImpl.updateOfStudentById(id);
		
		if(prod!=null) {
			studentServiceImpl.deleteStudentById(id);
			response.put("deleted", Boolean.TRUE);
			return response;
		}
			
			response.put(" not deleted", Boolean.FALSE);
			return response;
	}

}

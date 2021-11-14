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

import com.demo.pojo.User;
import com.demo.serviceImpl.UserServiceImpl;
@RestController
@RequestMapping("/yamini/api")
public class UserController {

	@Autowired
	UserServiceImpl userServiceImpl;

	// api for add shop details
	@PostMapping("/createuser")
	User createUserDetails(@RequestBody User shopinfo) {

		User shopinfo1 = userServiceImpl.creatUserDetails(shopinfo);

		return shopinfo1;

	}

	// api for get shop details by id
	@GetMapping("/student/{id}")
	User updateUserById(@PathVariable(value = "id") Integer id) {

		User prod = userServiceImpl.updateOfUserById(id);

		return prod;

	}

	// api for get shop list
	@GetMapping("/listofusers")
	public List<User> listOfUser(User customer) {

		List<User> listOfUserdetails = userServiceImpl.ListOfUser(customer);

		return listOfUserdetails;
	}

	// api for delete product by id
	@DeleteMapping("/Userdeletedbyid/{id}")
	public Map<String,Boolean> deleteById(@PathVariable(value = "id") Integer id) {
	      Map<String,Boolean> response = new HashMap<>();
		
	      User prod = userServiceImpl.updateOfUserById(id);
		
		if(prod!=null) {
			userServiceImpl.deleteUserById(id);
			response.put("deleted", Boolean.TRUE);
			return response;
		}
			
			response.put(" not deleted", Boolean.FALSE);
			return response;
	}


}

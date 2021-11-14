package com.dmo.service;

import java.util.List;
import java.util.Optional;

import com.demo.pojo.User;

public interface UserService {
	User creatUserDetails(User customer);

	// add for customer
	User addUserDetails(User customer);

	// list of all customers

	List<User> ListOfUser(User customer);

	// view of particular customer by id

	Optional<User> updateUserById(Integer id);

	// update of particular customer by id

	User updateOfUserById(Integer id);

	// Delete of Product
	void deleteUserById(Integer id);

	

}

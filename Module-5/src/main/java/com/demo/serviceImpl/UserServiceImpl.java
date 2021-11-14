package com.demo.serviceImpl;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.demo.pojo.User;
import com.demo.repositary.UserRepositary;
import com.dmo.service.UserService;

public class UserServiceImpl implements UserService {
	@Autowired
	UserRepositary userRepositary;

	@Override
	public User creatUserDetails(User customer) {
		return customer;
		
		

		
	}

	@Override
	public User addUserDetails(User customer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> ListOfUser(User customer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<User> updateUserById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User updateOfUserById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteUserById(Integer id) {
		// TODO Auto-generated method stub
		
	}

}

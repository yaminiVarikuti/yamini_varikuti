package com.demo.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.pojo.User;

public interface UserRepositary {
	@Repository
	public interface CustomerRepositary extends JpaRepository<User, Integer>{

	}


}

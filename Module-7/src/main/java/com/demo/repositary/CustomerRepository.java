package com.demo.repositary;

import java.math.BigInteger;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.pojo.Passenger;

@Repository
public interface CustomerRepository extends JpaRepository<Passenger, BigInteger>{
	

}

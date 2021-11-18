package com.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.demo.pojo.Passenger;
import com.demo.repositary.CustomerRepository;
import com.demo.service.CustomerService;

public class CustomerServiceImpl implements CustomerService{
	@Autowired
	CustomerRepository customerrepository;
	

	@Override
	public Passenger createpassengerDetails(Passenger passenger) {
	
		return customerrepository.save(passenger);
	}

	@Override
	public List<Passenger> getAllPassengers() {

		
		return customerrepository.findAll();
	}

}

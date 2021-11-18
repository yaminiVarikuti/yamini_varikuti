package com.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.demo.pojo.Passenger;

@Service
public interface CustomerService {
	
	public Passenger createpassengerDetails(Passenger passenger);
	
	public List<Passenger> getAllPassengers();

}

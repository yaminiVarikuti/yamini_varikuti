package com.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.pojo.Passenger;

@RestController
@RequestMapping("/customer")
public class CustomerController {
	@PostMapping("")
	public Passenger createpassengerDetails(@RequestBody Passenger pass) {
		return pass;
		
	}
	@GetMapping("")
	public List<Passenger> getAllPassengers(){
		List<Passenger> passengerList = new ArrayList<>();
		return passengerList;
		
	}

}

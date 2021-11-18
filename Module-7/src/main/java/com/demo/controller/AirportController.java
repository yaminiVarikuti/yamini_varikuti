package com.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.pojo.Airport;
import com.demo.serviceImpl.AirportServiceImpl;

@RestController
@RequestMapping("/vi/api/airport")
public class AirportController {

	@Autowired
	AirportServiceImpl airportServiceImpl;

	
	@PostMapping("")
	Airport createAirportDetails(@RequestBody Airport airport) {
		System.out.println(airport);

		Airport prodinfo = airportServiceImpl.addAirportDetails(airport);

		return prodinfo;

	}
	@GetMapping("")
	public List<Airport> getAllAirportDetails(){
		return airportServiceImpl.ListOfAirports() ;
	}

}

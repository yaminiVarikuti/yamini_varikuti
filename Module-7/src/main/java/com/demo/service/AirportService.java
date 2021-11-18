package com.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.demo.pojo.Airport;
@Service
public interface AirportService {

	
	// add for product
		Airport addAirportDetails(Airport product);  

		// list of all products

		List<Airport> ListOfAirports();  
		// Delete of Product

	
	  

	    

}

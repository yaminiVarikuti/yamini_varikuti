package com.demo.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.demo.pojo.Airport;
import com.demo.repositary.AirportRepositary;
import com.demo.service.AirportService;
@Component
public class AirportServiceImpl implements AirportService{
	@Autowired
	AirportRepositary repositary;

	@Override
	public Airport addAirportDetails(Airport product) {
		
		return repositary.save(product);
	
	}
	public List<Airport> get(Airport product) {
	 List<Airport> listairportdetails = new ArrayList<Airport>();

		Airport a1 = new Airport();
		a1.setAirportcode("ap14");
		a1.setAirportlocation("Delhi");
		a1.setAirportname("A.P");
		listairportdetails.add(a1);
		return listairportdetails;	
	}
	@Override
	public List<Airport> ListOfAirports() {
		// TODO Auto-generated method stub
		System.out.println(repositary.findAll().size());
		return repositary.findAll();
	}

	
}

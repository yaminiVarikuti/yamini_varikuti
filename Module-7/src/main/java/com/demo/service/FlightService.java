package com.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.demo.pojo.Flight;
import com.demo.pojo.ScheduleFlight;

@Service
public interface FlightService {
	public Flight addFlight(Flight flight);
	
	public ScheduleFlight scheduleFlight(ScheduleFlight scheduleFlight);
	
	public List<ScheduleFlight> searchAvailableFlights( String deptairport, String arrairport,
			 String deptdatetime);

}

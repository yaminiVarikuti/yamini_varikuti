package com.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.demo.pojo.Flight;
import com.demo.pojo.ScheduleFlight;
import com.demo.repositary.FlightRepository;
import com.demo.repositary.ScheduleFlightRepository;
import com.demo.service.FlightService;

public class FlightServiceImpl implements FlightService{
	@Autowired
	FlightRepository flightrepository;
	@Autowired
	ScheduleFlightRepository scheduleFlightrepository;
	@Override
	public Flight addFlight(Flight flight) {

		return flightrepository.save(flight);
	}


	@Override
	public List<ScheduleFlight> searchAvailableFlights(String deptairport, String arrairport, String deptdatetime) {

		return scheduleFlightrepository.findAll();
	}

	@Override
	public ScheduleFlight scheduleFlight(ScheduleFlight scheduleFlight) {

		return scheduleFlightrepository.save(scheduleFlight);
	}

}

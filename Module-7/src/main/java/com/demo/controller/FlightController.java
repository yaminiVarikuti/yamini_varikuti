package com.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.pojo.Flight;
import com.demo.pojo.ScheduleFlight;

@RestController
@RequestMapping("/vi/api/filght")
public class FlightController {
	
	@PostMapping("")
	public Flight addFlight(@RequestBody Flight flight) {
		return flight;
	}
	@PostMapping("/schedule")
	public ScheduleFlight scheduleFlight(@RequestBody ScheduleFlight scheduleflight) {
		return new ScheduleFlight();
	}
	
	@GetMapping("/search/{deptairport}/{arrairport}/{deptdatetime}")
	public List<ScheduleFlight> searchAvailableFlights(@PathVariable String deptairport,@PathVariable String arrairport,
			@PathVariable String deptdatetime){
		return new ArrayList<>();
	}
	

}

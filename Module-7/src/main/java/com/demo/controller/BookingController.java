package com.demo.controller;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.pojo.Booking;
import com.demo.service.BookingService;
import com.demo.serviceImpl.BookingServiceImpl;

@RestController
@RequestMapping("/vi/api/booking")
public class BookingController {
	@Autowired
	BookingServiceImpl bookingService;
	@PostMapping("")
	public Booking bookFlight(@RequestBody Booking booking) {
		return bookingService.bookFlight(booking);
	}
	@PutMapping("/{bookingId}")
	public Booking updateBooking(@PathVariable BigInteger bookingId,@RequestBody Booking booking) {
		return bookingService.modifyBooking(bookingId, booking);
	}
	@DeleteMapping("/{bookingId}")
	public List<Booking> cancelBooking(@PathVariable BigInteger bookingId){
		return bookingService.cancelBooking(bookingId);
	}
	@GetMapping("/{bookingId}")
	public Optional<Booking> getCurrentBooking(@PathVariable BigInteger bookingId) {
		return bookingService.currentBookings(bookingId);
	}

}

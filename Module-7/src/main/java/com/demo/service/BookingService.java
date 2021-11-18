package com.demo.service;

import java.math.BigInteger;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.demo.pojo.Booking;

@Service
public interface BookingService {
	public Booking bookFlight(Booking booking);
	
	public Booking modifyBooking(BigInteger bookingId, Booking booking);
	
	public List<Booking> cancelBooking(BigInteger bookingId);
	
	public Optional<Booking> currentBookings(BigInteger bookingId);
	
	

}

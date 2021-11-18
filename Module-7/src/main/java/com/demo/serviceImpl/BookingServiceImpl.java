package com.demo.serviceImpl;

import java.math.BigInteger;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.demo.pojo.Booking;
import com.demo.repositary.BookingRepository;
import com.demo.service.BookingService;

@Component
public class BookingServiceImpl implements BookingService {
	@Autowired
	BookingRepository bookingRepository;

	@Override
	public Booking bookFlight(Booking booking) {
		return bookingRepository.save(booking);
	}

	@Override
	public Booking modifyBooking(BigInteger bookingId, Booking booking) {

		Booking exitBooking = bookingRepository.getById(bookingId);
		if(exitBooking!= null) {
		return bookingRepository.save(booking);
		}
		else {
			return null;
		}
	}

	@Override
	public List<Booking> cancelBooking(BigInteger bookingId) {
		// TODO Auto-generated method stub
		bookingRepository.deleteById(bookingId);
		return bookingRepository.findAll();
	}

	@Override
	public Optional<Booking> currentBookings(BigInteger bookingId) {
		// TODO Auto-generated method stub
		return bookingRepository.findById(bookingId);
	}

}

package com.demo.repositary;


import java.math.BigInteger;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.demo.pojo.Booking;

@Repository
public interface BookingRepository extends JpaRepository<Booking, BigInteger>{
	
//	@Modifying
//	@Query("UPDATE Booking b set b.bookingdate= :booking.getBookingDate(),b.numberofpassengers= :booking.getNumberofpassengers where b.bookingid= :bookingId")
//	public Booking modifyBooking(@Param("bookingId") BigInteger bookingId, @Param("booking") Booking booking);

//	@Query("Select * from Booking b where b.bookingId= :bookingId")
//	public Booking getByBookingId(@Param("bookingId") BigInteger bookingId);
}

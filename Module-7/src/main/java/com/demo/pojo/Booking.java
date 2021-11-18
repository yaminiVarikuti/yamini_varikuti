package com.demo.pojo;

import java.math.BigInteger;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name ="booking")
public class Booking {
	@Id
	@GeneratedValue
	private BigInteger bookingid;
	private String bookingdate;
	private String numberofpassengers;
	public BigInteger getBookingid() {
		return bookingid;
	}
	public void setBookingid(BigInteger bookingid) {
		this.bookingid = bookingid;
	}
	public String getBookingdate() {
		return bookingdate;
	}
	public void setBookingdate(String bookingdate) {
		this.bookingdate = bookingdate;
	}
	public String getNumberofpassengers() {
		return numberofpassengers;
	}
	public void setNumberofpassengers(String numberofpassengers) {
		this.numberofpassengers = numberofpassengers;
	}
	@Override
	public String toString() {
		return "Booking [bookingid=" + bookingid + ", bookingdate=" + bookingdate + ", numberofpassengers="
				+ numberofpassengers + ", getBookingid()=" + getBookingid() + ", getBookingdate()=" + getBookingdate()
				+ ", getNumberofpassengers()=" + getNumberofpassengers() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	

}

package com.demo.pojo;

import java.math.BigInteger;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Passenger")
public class Passenger {
	@Id
	@GeneratedValue
	private BigInteger pnrnum;
	private String passengername;
	private Integer passengerage;
	private BigInteger passengerUIN;
	private Double luggage;
	public BigInteger getPnrnum() {
		return pnrnum;
	}
	public void setPnrnum(BigInteger pnrnum) {
		this.pnrnum = pnrnum;
	}
	public String getPassengername() {
		return passengername;
	}
	public void setPassengername(String passengername) {
		this.passengername = passengername;
	}
	public Integer getPassengerage() {
		return passengerage;
	}
	public void setPassengerage(Integer passengerage) {
		this.passengerage = passengerage;
	}
	public BigInteger getPassengerUIN() {
		return passengerUIN;
	}
	public void setPassengerUIN(BigInteger passengerUIN) {
		this.passengerUIN = passengerUIN;
	}
	public Double getLuggage() {
		return luggage;
	}
	public void setLuggage(Double luggage) {
		this.luggage = luggage;
	}
	@Override
	public String toString() {
		return "Passenger [pnrnum=" + pnrnum + ", passengername=" + passengername + ", passengerage=" + passengerage
				+ ", passengerUIN=" + passengerUIN + ", luggage=" + luggage + ", getPnrnum()=" + getPnrnum()
				+ ", getPassengername()=" + getPassengername() + ", getPassengerage()=" + getPassengerage()
				+ ", getPassengerUIN()=" + getPassengerUIN() + ", getLuggage()=" + getLuggage() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
}

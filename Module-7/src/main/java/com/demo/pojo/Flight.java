package com.demo.pojo;

import java.math.BigInteger;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name ="Flight")
public class Flight {
	@Id
	@GeneratedValue
	private BigInteger flightid;
	private String flightname;
	private String numberofseats;
	@OneToOne
	private Airport deptairport;
	@OneToOne
	private Airport arrAirport;
	public Airport getDeptairport() {
		return deptairport;
	}
	public void setDeptairport(Airport deptairport) {
		this.deptairport = deptairport;
	}
	public Airport getArrAirport() {
		return arrAirport;
	}
	public void setArrAirport(Airport arrAirport) {
		this.arrAirport = arrAirport;
	}
	public BigInteger getFlightid() {
		return flightid;
	}
	public void setFlightid(BigInteger flightid) {
		this.flightid = flightid;
	}
	public String getFlightname() {
		return flightname;
	}
	public void setFlightname(String flightname) {
		this.flightname = flightname;
	}
	public String getNumberofseats() {
		return numberofseats;
	}
	public void setNumberofseats(String numberofseats) {
		this.numberofseats = numberofseats;
	}
	@Override
	public String toString() {
		return "Flight [flightid=" + flightid + ", flightname=" + flightname + ", numberofseats=" + numberofseats
				+ ", deptairport=" + deptairport + ", arrAirport=" + arrAirport + ", getDeptairport()="
				+ getDeptairport() + ", getArrAirport()=" + getArrAirport() + ", getFlightid()=" + getFlightid()
				+ ", getFlightname()=" + getFlightname() + ", getNumberofseats()=" + getNumberofseats()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	

}

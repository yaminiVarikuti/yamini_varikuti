package com.demo.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import org.hibernate.annotations.GenericGenerator;

import com.sun.istack.NotNull;

@Entity
@Table(name="Airport")
public class Airport {
	
	@Id 
	@GeneratedValue(generator="system-uuid")
	@GenericGenerator(  name="system-uuid", strategy = "uuid")
	@Column(name = "code", updatable = false, nullable = false)
	private String airportcode;
	@NotNull
	@Column(name="name")
	private String airportname;
	@NotNull
	@Column(name="loc")
	private String airportlocation;
	public String getAirportcode() {
		return airportcode;
	}
	public void setAirportcode(String airportcode) {
		this.airportcode = airportcode;
	}
	public String getAirportname() {
		return airportname;
	}
	public void setAirportname(String airportname) {
		this.airportname = airportname;
	}
	public String getAirportlocation() {
		return airportlocation;
	}
	public void setAirportlocation(String airportlocation) {
		this.airportlocation = airportlocation;
	}
	@Override
	public String toString() {
		return "Airport [airportcode=" + airportcode + ", airportname=" + airportname + ", airportlocation="
				+ airportlocation + ", getAirportcode()=" + getAirportcode() + ", getAirportname()=" + getAirportname()
				+ ", getAirportlocation()=" + getAirportlocation() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
	
	

}

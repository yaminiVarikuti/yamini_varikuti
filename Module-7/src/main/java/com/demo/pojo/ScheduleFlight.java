package com.demo.pojo;

import java.math.BigInteger;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name ="ScheduleFlight")
public class ScheduleFlight {
	@Id
	@GeneratedValue
	private BigInteger scheduleflightid;
	@OneToOne
	private Flight flight;
	private Integer availableseats;
	@OneToOne
	private Schedule schedule;
	public BigInteger getScheduleflightid() {
		return scheduleflightid;
	}
	public void setScheduleflightid(BigInteger scheduleflightid) {
		this.scheduleflightid = scheduleflightid;
	
	}
	public Integer getAvailableseats() {
		return availableseats;
	}
	public void setAvailableseats(Integer availableseats) {
		this.availableseats = availableseats;
	}
	public Schedule getSchedule() {
		return schedule;
	}
	public void setSchedule(Schedule schedule) {
		this.schedule = schedule;
	}
	@Override
	public String toString() {
		return "ScheduleFlight [scheduleflightid=" + scheduleflightid +  ", availableseats="
				+ availableseats + ", schedule=" + schedule + ", getScheduleflightid()=" + getScheduleflightid()
				 + ", getAvailableseats()=" + getAvailableseats() + ", getSchedule()="
				+ getSchedule() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
	

}

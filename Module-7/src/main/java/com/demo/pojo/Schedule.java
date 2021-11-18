package com.demo.pojo;

import java.math.BigInteger;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Schdule")
public class Schedule {
	@Id
	@GeneratedValue
	private BigInteger scheduleid;
	@OneToOne
	private Airport srcairport;
	private String deptdatetime;
	private String arrivaldate;
	public BigInteger getScheduleid() {
		return scheduleid;
	}
	public void setScheduleid(BigInteger scheduleid) {
		this.scheduleid = scheduleid;
	}
	public Airport getSrcairport() {
		return srcairport;
	}
	public void setSrcairport(Airport srcairport) {
		this.srcairport = srcairport;
	}
	public String getDeptdatetime() {
		return deptdatetime;
	}
	public void setDeptdatetime(String deptdatetime) {
		this.deptdatetime = deptdatetime;
	}
	public String getArrivaldate() {
		return arrivaldate;
	}
	public void setArrivaldate(String arrivaldate) {
		this.arrivaldate = arrivaldate;
	}
	@Override
	public String toString() {
		return "Schedule [scheduleid=" + scheduleid + ", srcairport=" + srcairport + ", deptdatetime=" + deptdatetime
				+ ", arrivaldate=" + arrivaldate + ", getScheduleid()=" + getScheduleid() + ", getSrcairport()="
				+ getSrcairport() + ", getDeptdatetime()=" + getDeptdatetime() + ", getArrivaldate()="
				+ getArrivaldate() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
	

}

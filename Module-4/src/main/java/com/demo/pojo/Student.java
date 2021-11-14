package com.demo.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import com.sun.istack.NotNull;

@Entity
@Table(name="student")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@NotEmpty
	@Column(name="userid")
	private Integer studentid;
	@NotNull
	@Column(name="studentname")
	private String studentname;
	@NotNull
	@Column(name="studenttype")
	private String studenttype;
	public Integer getStudentid() {
		return studentid;
	}
	public void setStudentid(Integer studentid) {
		this.studentid = studentid;
	}
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	public String getStudenttype() {
		return studenttype;
	}
	public void setStudenttype(String studenttype) {
		this.studenttype = studenttype;
	}
	@Override
	public String toString() {
		return "Student [studentid=" + studentid + ", studentname=" + studentname + ", studenttype=" + studenttype
				+ ", getStudentid()=" + getStudentid() + ", getStudentname()=" + getStudentname()
				+ ", getStudenttype()=" + getStudenttype() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	

}

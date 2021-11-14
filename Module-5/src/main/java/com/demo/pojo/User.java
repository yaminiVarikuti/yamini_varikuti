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
@Table(name="user")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@NotEmpty
	@Column(name="userid")
	private Integer userifd;
	@NotNull
	@Column(name="username")
	private String username;
	@NotNull
	@Column(name="useraddress")
	private String useraddress;
	public Integer getUserifd() {
		return userifd;
	}
	public void setUserifd(Integer userifd) {
		this.userifd = userifd;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUseraddress() {
		return useraddress;
	}
	public void setUseraddress(String useraddress) {
		this.useraddress = useraddress;
	}
	@Override
	public String toString() {
		return "User [userifd=" + userifd + ", username=" + username + ", useraddress=" + useraddress
				+ ", getUserifd()=" + getUserifd() + ", getUsername()=" + getUsername() + ", getUseraddress()="
				+ getUseraddress() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	

}

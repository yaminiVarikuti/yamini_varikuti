package com.demo;

import com.demo.pojo.Employee;
import com.demo.service.EmployeeDaoimpl;

public class MainClass {
	public static void main(String[] args) {
		EmployeeDaoimpl studentDaoimpl = new EmployeeDaoimpl();
		Employee stude = new Employee();
		//insert 1st record
		stude.setEmpid(146);
		stude.setEmployeename("yamini");
		stude.setEmployeeage("23");
		studentDaoimpl.createEmployee(stude);
		System.out.println("Done!...");
	}
	
	}



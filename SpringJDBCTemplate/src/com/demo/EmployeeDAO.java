package com.demo;

import java.util.List;

import javax.sql.DataSource;

public interface EmployeeDAO {
	

		// looking for data soruce like mysql db
		public void setDataSoruce(DataSource ds);
		
		// insert records for employee
		public void createEmployee(int id,String address);
		
		//update records
		
		//public void updateEmployee(int id,String address);

		public int updateEmployeeRecords(Employee emp);
		public List<Employee> listAllEmployees();

		

	}





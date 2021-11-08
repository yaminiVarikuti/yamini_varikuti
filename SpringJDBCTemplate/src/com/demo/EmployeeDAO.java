package com.demo;

import java.util.List;

import javax.sql.DataSource;

public interface EmployeeDAO {
	

		// looking for data soruce like mysql db
		public void setDataSoruce(DataSource ds);
		
		// insert records for student
		public void createEmployee(int id,String address);
		
	

	}





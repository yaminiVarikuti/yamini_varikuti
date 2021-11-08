package com.demo;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class EmployeeRowMapping  implements RowMapper<Employee>{
	
//	@Override
	//public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {

		
	//	Employee emp= new Employee();
		// mapping results in colums
	//	emp.setEmpid(rs.getInt("employeeid"));
	//	emp.setEmpaddress(rs.getString("address"));
		
	//	return null;
	//}
	
	
	   // this resultSEt is coming from db row mapping alread given in jdbc topics in core java	  
	
		public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
			Employee stud= new Employee();
			// mapping results in colums
			stud.setEmpid(rs.getInt("id"));
			stud.setEmpaddress(rs.getString("address"));
			return stud;
		}

}

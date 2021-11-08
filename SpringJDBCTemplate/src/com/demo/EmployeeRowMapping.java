package com.demo;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class EmployeeRowMapping  implements RowMapper<Employee>{

	@Override
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {

		
		Employee emp= new Employee();
		// mapping results in colums
		emp.setEmpid(rs.getInt("employeeid"));
		emp.setEmpaddress(rs.getString("address"));
		
		return null;
	}

}

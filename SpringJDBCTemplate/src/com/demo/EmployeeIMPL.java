package com.demo;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeIMPL implements EmployeeDAO {
	

	private DataSource dataSourceprop;
	private JdbcTemplate JdbcTemplateoobject;

	@Override
	public void setDataSoruce(DataSource ds) {
		this.dataSourceprop=ds;
		this.JdbcTemplateoobject = new JdbcTemplate(dataSourceprop);
		
	}

	@Override
	public void createEmployee(int id, String address) {
		

		String sql="insert  into employee(idemployee,employeeaddress) values(?,?)";
		
		JdbcTemplateoobject.update(sql,id,address);
		
    	return;
		
		
	}
		
	}



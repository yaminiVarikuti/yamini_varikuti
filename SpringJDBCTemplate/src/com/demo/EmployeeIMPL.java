package com.demo;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
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
	
	//update
	@Override
	public int updateEmployeeRecords(Employee emp) {
		String updateemployee ="UPDATE employee set empid =? empaddress=?";
		JdbcTemplateoobject.update(updateemployee,new Object[] {
				emp.getEmpaddress(), Integer.valueOf(emp.getEmpid())
		});
		return 0;	
	}
	
	
	
	
	public void deleteEmployee(int emp2) {
		String deleteemployee = "DELETE FROM employee WHERE empid = 146 ";
		JdbcTemplateoobject.update(deleteemployee);
		return;
		
	}
	public List<Employee> listAllEmployees(){
		List<Employee> emplists = new ArrayList<Employee>();
		String emplist ="select*from employee";
		emplists = JdbcTemplateoobject.query(emplist, new BeanPropertyRowMapper(Employee.class));
		return emplists;
	}

	

		
	}

	




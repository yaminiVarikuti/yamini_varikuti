package com.demo;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		
		
	ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	
	EmployeeIMPL emp = (EmployeeIMPL)context.getBean("studentdao");
	System.out.println("Recorded creation.....");
	emp.createEmployee(40, "A.P");
	
	System.out.println("done....");
	

	// for update
	Employee emp1 = new Employee();
	emp1.setEmpid(156);//update the details on the bases of id
	emp1.setEmpaddress("U.P");
	
	emp.updateEmployeeRecords(emp1);
	
	/// retrive the list of students from DB
	
			List<Employee> lse = emp.listAllEmployees();{
				
				for(Employee emp11:lse) {
				
					String empaddress= emp11.getEmpaddress();
					int empid= emp11.getEmpid();
					
					System.out.println(" Employee  Address "+empaddress+"Employee ID "+empid);
			
					
				}
	
	}
			Employee emp2 = new Employee();
			EmployeeIMPL em = (EmployeeIMPL)context.getBean("studentdao");
			System.out.println("DEleted....");
			
			
			
			
			
	}
	

}

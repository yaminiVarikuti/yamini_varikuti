package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		
		
	ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	
	EmployeeIMPL emp = (EmployeeIMPL)context.getBean("studentdao");
	System.out.println("Recorded creation.....");
	emp.createEmployee(50, "A.P");
	
	System.out.println("done....");
	
	
	
	
	
	}

}

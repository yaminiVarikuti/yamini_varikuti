package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		ApplicationContext con = new ClassPathXmlApplicationContext("bean.xml");
		Empolyee emp = (Empolyee)con.getBean("empname");
		System.out.println(emp.getEmpname());

	}
}

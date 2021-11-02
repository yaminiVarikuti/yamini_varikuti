package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		ApplicationContext con = new ClassPathXmlApplicationContext("bean.xml");
		
		//setting values.
		College colname =(College)con.getBean("colname");
		College colname1=(College)con.getBean("colname");
		
		colname.setCollegename("College of AP");
		System.out.println("JNTU---->"+colname.getCollegename());
		
		colname1.setCollegename("College of TS");
		System.out.println("JNTUH---->"+colname1.getCollegename());
		
	}

}

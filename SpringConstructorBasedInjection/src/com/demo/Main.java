package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		User us = (User) context.getBean("username");
		System.out.println(us.getUseraddress());
		System.out.println(us.getUsername());
	}

}

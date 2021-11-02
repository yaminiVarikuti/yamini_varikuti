package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

	
public class MainClass {

		public static void main(String[] args) {

			ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
			JavaCollection collect = (JavaCollection)context.getBean("collection");
			System.out.println(collect.getAddressList());
			System.out.println(collect.getAddressMap());
			System.out.println(collect.getAddressProp());
			System.out.println(collect.getAddressSet());
			JavaCollection jc= new JavaCollection();
			System.out.println(jc);
			
			

}
}

package com.demo.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtil {
		static SessionFactory sessionfactoryobj;
		static Session sessionobj;
		
		public static SessionFactory buildSessionFactory() {
			
			//creating Configuration Instance& passing Hibernate Configuration File
			Configuration config = new Configuration();
			config.configure("hibernate.cfg.xml");
			//since Hibernate version 4.x, serviceRegistry is being used
			ServiceRegistry serviceRegistryobj = new StandardServiceRegistryBuilder().applySettings(config.getProperties()).build();
			
			//creating Hibernate SessionFactory Instance
			sessionfactoryobj = config.buildSessionFactory(serviceRegistryobj);
			
			return sessionfactoryobj;
		}
	

}

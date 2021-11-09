package com.demo.service;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.demo.dao.EmployeeDAO;
import com.demo.pojo.Employee;
import com.demo.util.HibernateUtil;

public class EmployeeDaoimpl implements EmployeeDAO {
	static SessionFactory sessionFactoryObj;
	static Session sessionObj;
	
	@Override
	public Employee  createEmployee(Employee student) {
		Transaction tx = null;
		try {
		
		//enable the session by calling opensession method
		sessionObj = HibernateUtil.buildSessionFactory().openSession();
		tx = sessionObj.beginTransaction();
		//create a object of student class
		
		sessionObj.save(student); //insert into table and formed the sql query automatically
		//"insert into student values (?,?)
		tx.commit();
		
		
		}catch(Exception e) {
			if(tx != null)
				tx.rollback();
			e.printStackTrace();
			
		}
		finally {
			sessionObj.close();
		}
		return student;
		
	}

}

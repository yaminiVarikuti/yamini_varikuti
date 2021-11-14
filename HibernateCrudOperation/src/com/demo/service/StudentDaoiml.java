package com.demo.service;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.demo.dao.StudentDAO;
import com.demo.pojo.Student;
import com.demo.util.HibernetUtil;

public class StudentDaoiml implements StudentDAO {

	static SessionFactory sessionFactoryObj;
	static Session sessionObj;

	@Override
	public Student createStudent(Student student) {

		Transaction tx = null;
		try {
			// enbble the session by calling opensesion method
			sessionObj = HibernetUtil.buildSessionFactory().openSession();
			tx = sessionObj.beginTransaction();

			sessionObj.save(student);// insert into table and formed the sql query automaticall "insert into student
										// values(?,?)
			tx.commit();

		} catch (Exception e) {

			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			sessionObj.close();
		}

		return student;

	}

	@Override
	public Student viewStudentById(Integer id) {

		return null;
	}


	public void deleteStudentById(Integer id) {

		Transaction tx = null;
		Student studObj =null;
		try {
			// enbble the session by calling opensesion method
			sessionObj = HibernetUtil.buildSessionFactory().openSession();
			tx = sessionObj.beginTransaction();
			studObj = findById(id);
		
			sessionObj.delete(studObj);
		    sessionObj.getTransaction().commit();
		}
			
			
			catch(Exception sqlException) {
	            
	            sqlException.printStackTrace();
	        } 
			
			finally {
	            if(sessionObj != null) {
	                sessionObj.close();
	            }
	            
			}

	}

	@Override
	public List<Student> viewAllStudents(Student student) {
		// TODO Auto-generated method stub
		return null;
	}

	// api for update

	@Override
	public Student updateStudentById(Integer id) {
		Transaction tx = null;
		Student stuObj = null;
		try {
			// enbble the session by calling opensesion method
			sessionObj = HibernetUtil.buildSessionFactory().openSession();
			tx = sessionObj.beginTransaction();

			stuObj = (Student) sessionObj.get(Student.class, id);
			stuObj.setAge("201");
			stuObj.setStudname("ankit kumar");

			sessionObj.save(stuObj);// insert into table and formed the sql query automaticall "insert into student
									// values(?,?)
			tx.commit();
			System.out.println("Completed...updatation");

		} catch (Exception e) {

			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			sessionObj.close();
		}
		return stuObj;

	}

	@Override
	public Student findById(Integer id) {

		Transaction tx = null;
		Student findbyid = null;
		try {
			// enbble the session by calling opensesion method
			sessionObj = HibernetUtil.buildSessionFactory().openSession();
			tx = sessionObj.beginTransaction();

			findbyid = (Student) sessionObj.load(Student.class, id);

			tx.commit();
			System.out.println("Completed...find by id "+findbyid.getId());

		} catch (Exception e) {

			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} 
		return findbyid;

	}

}

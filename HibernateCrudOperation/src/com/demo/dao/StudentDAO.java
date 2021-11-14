package com.demo.dao;

import java.util.List;

import com.demo.pojo.Student;

public interface StudentDAO {
	
	
	// insert records for student
	public Student createStudent(Student student);   //done
	
	
	// update records for student
	public Student updateStudentById(Integer id);   //pending
	
	// view records for student by id
	public Student viewStudentById(Integer id);   //pending
	
	
	// delete records for student by id
		public void deleteStudentById(Integer id);   //pending
		
	// delete records for student by id
	public List<Student> viewAllStudents(Student student);   //pending
	
	//find by id
	Student findById(Integer id);
	
}

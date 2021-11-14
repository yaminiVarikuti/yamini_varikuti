package com.demo.service;

import java.util.List;
import java.util.Optional;

import com.demo.pojo.Student;

public interface StudentService {
	Student creatStudentDetails(Student customer);

	// add for customer
	Student addStudentDetails(Student customer);

	// list of all customers

	List<Student> ListOfStudent(Student customer);

	// view of particular customer by id

	Optional<Student> updateStudentById(Integer id);

	// update of particular customer by id

	Student updateOfStudentById(Integer id);

	// Delete of Product
	void deleteStudentById(Integer id);


}

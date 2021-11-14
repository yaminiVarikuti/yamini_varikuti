package com.demo;

import com.demo.pojo.Student;
import com.demo.service.StudentDaoiml;

public class MainClient {

	
	public static void main(String[] args) {
		
		StudentDaoiml studentDaoiml = new StudentDaoiml();
		Student stude = new Student();
		// insert once record
		stude.setId(101);
		stude.setStudname("yamini");
		stude.setAge("23");
	//	studentDaoiml.createStudent(stude);
		
		//for update
		studentDaoiml.updateStudentById(1);
		
		//for delete api
	//	studentDaoiml.deleteStudentById(2);
		System.out.println("  done....");
	
	}

}

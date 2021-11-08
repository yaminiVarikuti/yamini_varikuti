package com.demo;

import com.demo.pojo.Student;
import com.demo.service.StudentDaoimpl;

public class MainClass {
	public static void main(String[] args) {
		StudentDaoimpl studentDaoimpl = new StudentDaoimpl();
		Student stude = new Student();
		//insert 1st record
		stude.setId(101);
		stude.setStudname("yamini");
		stude.setAge("23");
		studentDaoimpl.createStudent(stude);
		System.out.println("Done!...");
	}

}

package com.demo.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.pojo.Student;

public interface StudentRepositary {
	@Repository
	public interface CustomerRepositary extends JpaRepository<Student, Integer>{

	}

}

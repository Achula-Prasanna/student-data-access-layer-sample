package com.prasanna.student.dal;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.prasanna.student.dal.entities.Student;
import com.prasanna.student.dal.repository.StudentRepository;

@SpringBootTest
class StudentdalApplicationTests {

	@Autowired
	private StudentRepository repo;
	
	@Test
	void testCreateStudent() {
		Student student = new Student();
		student.setName("Prasanna");
		student.setCourse("CSE");
		student.setFee(30d);
		repo.save(student);
	}
	
	@Test
	void testFindStudentById() {
		Student student = repo.findById(1l).get();
		System.out.println(student);
	}
	
	@Test
	void testUpdateStudent() {
		Student student = repo.findById(1l).get();
		student.setFee(50d);
		repo.save(student);
	}
	
	@Test
	void testDeleteStudent() {
		Student student = repo.findById(3l).get();
		repo.delete(student);
	}
}

package com.prasanna.student.dal.repository;

import org.springframework.data.repository.CrudRepository;

import com.prasanna.student.dal.entities.Student;

public interface StudentRepository extends CrudRepository<Student, Long> {

}

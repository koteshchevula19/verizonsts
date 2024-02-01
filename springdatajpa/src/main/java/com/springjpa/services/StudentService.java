package com.springjpa.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springjpa.entities.Student;
import com.springjpa.repositories.StudentRepository;

@Service
public class StudentService {

	// add student

	@Autowired
	StudentRepository repository;

	public void addNewStudent(Student student) {
		repository.save(student);
	}

}

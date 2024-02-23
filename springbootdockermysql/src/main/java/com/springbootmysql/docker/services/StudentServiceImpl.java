package com.springbootmysql.docker.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbootmysql.docker.entities.Student;
import com.springbootmysql.docker.repositories.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository repository;
	
	

	@Override
	public Iterable<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public void addNewStudent(Student student) {
		repository.save(student);
		
	}
	
}

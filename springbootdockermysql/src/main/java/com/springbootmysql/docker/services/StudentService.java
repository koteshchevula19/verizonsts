package com.springbootmysql.docker.services;

import com.springbootmysql.docker.entities.Student;

public interface StudentService {

	public Iterable<Student> getAllStudents();
	
	public void addNewStudent(Student student);
	
}

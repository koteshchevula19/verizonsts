package com.springbootmysql.docker.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springbootmysql.docker.entities.Student;
import com.springbootmysql.docker.services.StudentService;

@RestController
@RequestMapping("students")
public class StudentController {

	@Autowired
	private StudentService service;
	
	@GetMapping
	public Iterable<Student> getAllStudents(){
		return service.getAllStudents();
	}
	
	@PostMapping
	public void addNewStudent(@RequestBody Student student) {
		service.addNewStudent(student);
	}
}

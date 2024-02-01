package com.springjpa.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springjpa.entities.Student;
import com.springjpa.services.StudentService;

@RestController
@RequestMapping("api")
public class StudentControlller {

	@Autowired
	StudentService service;
	
	@PostMapping("/student")
	public void addNewStudent(@RequestBody Student student) {
		service.addNewStudent(student);
	}
	
}

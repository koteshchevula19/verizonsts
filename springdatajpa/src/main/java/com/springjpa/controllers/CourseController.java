package com.springjpa.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springjpa.entities.Course;
import com.springjpa.entities.Student;
import com.springjpa.services.CourseService;

@RestController
@RequestMapping("api")
public class CourseController {

	@Autowired
	CourseService service;
	
	@PostMapping("/course/student/{studentId}")
	public void addNewCourse(@RequestBody Course course,@PathVariable Integer studentId) {
		course.setStudent(new Student(studentId));
		service.addNewCourse(course);
	}
}

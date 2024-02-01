package com.springjpa.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springjpa.entities.Course;
import com.springjpa.repositories.CourseRepository;

@Service
public class CourseService {

	
	@Autowired
	CourseRepository repository;
	
	// add course to the add student
	
	public void addNewCourse(Course course) {
		repository.save(course);
	}
}

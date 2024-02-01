package com.springjpa.repositories;

import org.springframework.data.repository.CrudRepository;

import com.springjpa.entities.Course;

public interface CourseRepository extends CrudRepository<Course, Integer> {

}

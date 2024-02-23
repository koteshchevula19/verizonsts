package com.springbootmysql.docker.repositories;

import org.springframework.data.repository.CrudRepository;

import com.springbootmysql.docker.entities.Student;

public interface StudentRepository extends CrudRepository<Student, Integer> {

}

package com.springmobilemnpsoftware.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.springmobilemnpsoftware.entities.User;

public interface UserRepository extends CrudRepository<User, Integer> {

Optional<User> findByMail(String mail);
}


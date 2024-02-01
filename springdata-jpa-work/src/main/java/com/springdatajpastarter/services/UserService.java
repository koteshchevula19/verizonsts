package com.springdatajpastarter.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springdatajpastarter.entities.User;
import com.springdatajpastarter.repostories.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository repository;
	
	public Iterable<User> getAllUsersDetails() {
		return repository.findAll();
	}
	
	public Optional<User> getUserDetailsById(Integer id) {
		return repository.findById(id);
	}
	
	public void addNewUser(User user) {
		 repository.save(user);
	}
	
	public void updateExistingUserDetailsById(User user) {
		repository.save(user);
	}
	
	public void deleteExistingUserById(Integer id) {
		repository.deleteById(id);
	}
	
	public long CountOfUsers() {
		return repository.count();
	}
	
	public List<User> getUsersByName(String name){
		return repository.findByName(name);
	}
	
	public List<User> getUsersByEmail(String email){
		return repository.findByEmail(email);
	}
	
	public List<User> getUsersByIdAndName(Integer id,String name){
		return repository.findByBothIdAndName(id, name);
	}
}

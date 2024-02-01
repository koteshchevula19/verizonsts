package com.springdatajpastarter.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springdatajpastarter.entities.User;
import com.springdatajpastarter.services.UserService;

@RestController
@RequestMapping("api/v1")
public class UserController {

	@Autowired
	UserService service;
	
	@GetMapping("/users")
	Iterable<User> getAllUsersDetails() {
		return service.getAllUsersDetails();
	}
	
	@GetMapping("/user/{id}")
	Optional<User> getUserDetailsById(@PathVariable Integer id) {
		return service.getUserDetailsById(id);
	}
	
	@PostMapping("/user")
	void addNewUser(@RequestBody User user) {
		 service.addNewUser(user);
	}
	
	@PutMapping("/user/{id}")
	void updateExistingUserDetailsById(@PathVariable Integer id,@RequestBody User user) {
		service.updateExistingUserDetailsById(user);
	}
	
	@DeleteMapping("/user/{id}")
	void deleteExistingUserById(@PathVariable Integer id) {
		service.deleteExistingUserById(id);
	}
	
	@GetMapping("/users/count")
	public long CountOfUsers() {
		return service.CountOfUsers();
	}
	
	@GetMapping("/users/name/{name}")
	public List<User> getUsersByName(@PathVariable String name){
		return service.getUsersByName(name);
	}
	
	@GetMapping("/users/email/{email}")
	public List<User> getUsersByEmail(@PathVariable String email){
		return service.getUsersByEmail(email);
	}
	@GetMapping("/users/id/{id}/name/{name}")
	public List<User> getUsersByIdAndName(@PathVariable Integer id,@PathVariable String name){
		return service.getUsersByIdAndName(id, name);
	}
	
}

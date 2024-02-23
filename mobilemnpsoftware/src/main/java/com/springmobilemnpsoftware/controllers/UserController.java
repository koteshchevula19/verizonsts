package com.springmobilemnpsoftware.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springmobilemnpsoftware.dto.UserCredentials;
import com.springmobilemnpsoftware.entities.User;
import com.springmobilemnpsoftware.services.UserService;

@RestController
@RequestMapping("api/v1/users")
@CrossOrigin("*")
public class UserController {

	@Autowired
	UserService service;
	
	@PostMapping("/signUp")
	public String addUser(@RequestBody User user) {
		return service.addUser(user);
	}
	
	@PostMapping("/signIn")
	public String signIn(UserCredentials userCredentials) {
	
		return service.signIn(userCredentials.getMail(),userCredentials.getPassword());
	}
	
	@GetMapping
	public Iterable<User> allUsers()
	{
		return service.allUsers();
	}
}

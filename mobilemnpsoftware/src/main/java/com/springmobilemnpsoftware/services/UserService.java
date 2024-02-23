package com.springmobilemnpsoftware.services;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.springmobilemnpsoftware.entities.User;
import com.springmobilemnpsoftware.exceptions.SignUpException;
import com.springmobilemnpsoftware.exceptions.UserNotFoundException;
import com.springmobilemnpsoftware.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;

	public String addUser(User user) {
		Optional<User> existedUser = repository.findByMail(user.getMail());
		if (existedUser.isPresent()) {
			throw new SignUpException();
		} else {
			repository.save(existedUser.get());
			return "User Saved Successfully";
		}

	}

	public String signIn(String mail, String password) {
		// TODO Auto-generated method stub

		Optional<User> user=repository.findByMail(mail);
		if(user.isPresent()) {
			User existingUser = user.get();
			if(existingUser.getPassword().equals(password)){
				return "signin successfull";
			}
		}
		throw new UserNotFoundException();
	}

	public Iterable<User> allUsers() {
		return repository.findAll();
	}

}

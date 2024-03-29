package com.springjpa.bankapplication.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springjpa.bankapplication.entities.User;
import com.springjpa.bankapplication.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository repository;

	public String addNewUser(User user) {
		Optional<User> existedUser = repository.findByEmail(user.getEmail());
		if (existedUser.isPresent()) {
			return "User Already existed";
		} else {
			repository.save(user);
			return "User Saved Successfully";
		}

	}

	public String sigiIn(String email, String password) {
		Optional<User> existedUser = repository.findByEmail(email);
		if (existedUser.get().getPassword().equals(password)) {
			return "sign in successful";
		}
		return "sign in failed";
	}

	public User updateBalance(Integer id, String transactionType, Double transactionAmount) {
		Optional<User> optionalUser = repository.findById(id);

		if (optionalUser.isPresent()) {
			User user = optionalUser.get();
			Double currentBalance = user.getBalance();
			if (transactionType.equalsIgnoreCase("self deposit")) {
				Double updatedBalance = currentBalance + transactionAmount;
				user.setBalance(updatedBalance);
				return repository.save(user);
			} else {
				if (currentBalance >= transactionAmount) {
					Double updatedBalance = currentBalance - transactionAmount;
					user.setBalance(updatedBalance);
					return repository.save(user);
				}
				return null;
			}
		}
		return null;

	}

}

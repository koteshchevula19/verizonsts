package com.springjpa.bankapplication.services;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springjpa.bankapplication.entities.Transaction;
import com.springjpa.bankapplication.entities.User;
import com.springjpa.bankapplication.repositories.TransactionRepository;

@Service
public class TransactionService {

	@Autowired
	TransactionRepository repository;
	@Autowired
	UserService userService;
	
	
//	public String addNewTransaction( Transaction transaction,Integer userId) {
//		
//		repository.save(transaction);
//		return "Saved transaction";
//	} transaction
	
	public void selfDepositById(Transaction transaction,Integer userId) {
		transaction.setUser(new User(userId));
		transaction.setTransactionDateTime(LocalDateTime.now());
		transaction.setTransactionParty(null);
		transaction.setTransactionType("Self Deposit");
		userService.updateBalance(userId,transaction.getTransactionType(),transaction.getTransactionAmount());
		repository.save(transaction);
	
	}
	
	public void transferById(Transaction transaction,Integer userId,Integer transactionParty) {
		transaction.setUser(new User(userId));
		transaction.setTransactionDateTime(LocalDateTime.now());
		transaction.setTransactionParty(transactionParty);
		transaction.setTransactionType("Debited");
//		userService
		repository.save(transaction);
	
	}

	public void withdrawById(Transaction transaction, Integer userId) {
		transaction.setUser(new User(userId));
		transaction.setTransactionDateTime(LocalDateTime.now());
		transaction.setTransactionParty(null);
		transaction.setTransactionType("Withdrawl");
		userService.updateBalance(userId,transaction.getTransactionType(),transaction.getTransactionAmount());
		repository.save(transaction);
		
	}
}

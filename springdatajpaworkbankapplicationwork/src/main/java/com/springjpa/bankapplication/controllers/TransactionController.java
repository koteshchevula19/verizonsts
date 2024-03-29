package com.springjpa.bankapplication.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springjpa.bankapplication.entities.Transaction;
import com.springjpa.bankapplication.services.TransactionService;

@RestController
@RequestMapping("api/v1")
public class TransactionController {

	@Autowired
	TransactionService service;
	
	@PostMapping("transactions/users/deposit/{userId}")
	public void selfDepositById(@RequestBody Transaction transaction, @PathVariable Integer userId) {
		service.selfDepositById(transaction, userId);
	}
	
	@PostMapping("transactions/users/withdraw/{userId}")
	public void withdrawById(@RequestBody Transaction transaction, @PathVariable Integer userId) {
		service.withdrawById(transaction, userId);
	}
	
	@PostMapping("transactions/user/transfer/{userId}")
	public void transferById(@RequestBody Transaction transaction,@PathVariable Integer userId,@RequestParam Integer transactionParty) {
	service.transferById(transaction, userId, transactionParty);
	}

}

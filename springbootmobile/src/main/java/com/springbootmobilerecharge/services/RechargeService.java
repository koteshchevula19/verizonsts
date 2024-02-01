package com.springbootmobilerecharge.services;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.springbootmobilerecharge.entities.Customer;
import com.springbootmobilerecharge.entities.Recharge;
import com.springbootmobilerecharge.repository.RechargeRepository;

@Service
public class RechargeService {

	@Autowired
	RechargeRepository repo;
	
	@Autowired
	CustomerService service;
	
	public void rechargeBymobileNumber(Recharge recharge,Integer id,Long mobile) {
		
		recharge.setCustomer(new Customer(id));
		recharge.setRecargeDateTime(LocalDateTime.now());
		
			repo.save(recharge);
	}
	
}

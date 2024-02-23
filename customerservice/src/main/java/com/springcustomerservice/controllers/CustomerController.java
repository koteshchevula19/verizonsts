package com.springcustomerservice.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springcustomerservice.entities.Customer;
import com.springcustomerservice.services.CustomerService;

@RestController
@RequestMapping("api/v1")
public class CustomerController {

	@Autowired
	CustomerService customerService;
	
	@GetMapping("/customers/name/{name}")
	Optional<Customer> getByCustomerName(String name){
		return 	customerService.getByCustomerName(name);
		}
		
	@GetMapping("/customers/subscriptionpaln/{subscriptionpaln}")
		Iterable<Customer> getByCustomerBySubscription(String subscriptionpaln){
			return 	customerService.getByCustomerBySubscription(subscriptionpaln);
			}
}

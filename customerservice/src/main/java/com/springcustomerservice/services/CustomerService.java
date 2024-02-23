package com.springcustomerservice.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.springcustomerservice.entities.Customer;
import com.springcustomerservice.repositories.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	RestTemplate restTemplate;
	
	@Autowired
	CustomerRepository customerRepository;
	
	public Optional<Customer> getByCustomerName(String name){
	return 	customerRepository.findByCustomerName(name);
	}
	
	public Iterable<Customer> getByCustomerBySubscription(String subscriptionpaln){
		return 	customerRepository.findByCustomerSubscription(subscriptionpaln);
		}
	
	
}

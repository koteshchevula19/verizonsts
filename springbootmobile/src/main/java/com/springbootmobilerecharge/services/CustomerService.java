package com.springbootmobilerecharge.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.springbootmobilerecharge.entities.Customer;
import com.springbootmobilerecharge.repository.CustomerRepository;

@Service
public class CustomerService {

	
	@Autowired
	CustomerRepository repo;
	
public void  addCustomer( Customer customer) {
		repo.save(customer);
	}
public String getCustomerBalanceByMobile(  Long mobile) {
	Optional<Customer> customer = repo.findByMobile(mobile);
	
	if(customer.isPresent()) {
		Customer existedCustomer=customer.get();
		return existedCustomer.getName()+"baalnce is :"+existedCustomer.getBalance();
	}
	return "";

}

public Optional<Customer> updateBalance(){
	return null;
}
}
package com.springcustomerservice.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springcustomerservice.entities.Customer;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Integer> {

	Optional<Customer> findByCustomerName(String customerName);
	
	Iterable<Customer> findByCustomerSubscription(String customerSubscription);
}

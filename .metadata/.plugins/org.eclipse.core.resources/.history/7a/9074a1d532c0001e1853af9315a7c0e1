package com.springbootmobilerecharge.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springbootmobilerecharge.entities.Customer;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Integer> {

	Optional<Customer> findByMobile(Long mobile);
}

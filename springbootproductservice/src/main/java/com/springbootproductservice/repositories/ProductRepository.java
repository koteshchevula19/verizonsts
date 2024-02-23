package com.springbootproductservice.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.springbootproductservice.entities.Product;

public interface ProductRepository extends CrudRepository<Product, Integer> {

	Optional<Product> findByProductName(String productName);
	
}

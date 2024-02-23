package com.springbootcartservice.repositories;

import org.springframework.data.repository.CrudRepository;

import com.springbootcartservice.entities.Cart;

public interface CartRepository extends CrudRepository<Cart, Integer> {

}

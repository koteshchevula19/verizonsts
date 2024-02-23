package com.springbootcartservice.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springbootcartservice.dto.Product;
import com.springbootcartservice.entities.Cart;
import com.springbootcartservice.services.CartService;

@RestController
@RequestMapping("api/v1")
public class CartController {

	@Autowired
	CartService service;
	
	@GetMapping("cartitems")
	public Iterable<Cart> getAllItems(){
		return service.getAllItems();
	}
	
	 @PostMapping("/id/{productId}/quantity/{quantity}")
	    public Cart addToCart(@PathVariable int productId,
	                              @PathVariable int quantity){
	        return service.addItemToCart(productId,quantity);
	    }
	
	 @GetMapping("/{id}")
	 public Product getProduct(@PathVariable Integer id) {
		 return service.getProductDetails(id);
	 }
	
	
}

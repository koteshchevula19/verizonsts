package com.springbootproductservice.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springbootproductservice.entities.Product;
import com.springbootproductservice.servces.ProductService;

@RestController
@RequestMapping("api/v1")
public class ProductController {

	@Autowired
	ProductService service;
	
	@PostMapping("/products")
	public void addProduct(@RequestBody Product product) {
		service.addProduct(product);
	}
	
	@GetMapping("/products/id/{id}")
	public Product  getProductById(@PathVariable Integer id) {
		return service.getProductById(id);
	}
	
	@GetMapping("/products")
	public Iterable<Product> getAllProducts(){
		return service.getAllProducts();
	}
	
	@GetMapping("/products/{productName}")
	public Product getProductByName(String productName) {
        return service.getProductByName(productName);
    }

	@PutMapping("/products")
	public void updateProduct(@RequestBody Product product) {
		service.updateProduct(product);
	}
	
	@DeleteMapping("/products/{id}")
	public void deleteProductById(Integer id) {
		service.deleteProductById(id);
	}
	
}


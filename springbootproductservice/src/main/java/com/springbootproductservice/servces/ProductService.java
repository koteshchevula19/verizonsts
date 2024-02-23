package com.springbootproductservice.servces;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbootproductservice.entities.Product;
import com.springbootproductservice.repositories.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	ProductRepository repository;

	public void addProduct(Product product) {
		// TODO Auto-generated method stub
		repository.save(product);
	}
	
	public Product getProductById(Integer id){
		return repository.findById(id).get();
	}
	 public Product getProductByName(String productName) {
	        return repository.findByProductName(productName).orElse(null);
	    }


	public Iterable<Product> getAllProducts() {
		return repository.findAll();
	}
	
	public void updateProduct(Product product) {
		repository.save(product);
	}
	
	public void deleteProductById(Integer id) {
		repository.deleteById(id);
	}
	

}

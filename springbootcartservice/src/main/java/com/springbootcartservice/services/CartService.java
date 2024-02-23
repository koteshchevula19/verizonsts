package com.springbootcartservice.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.springbootcartservice.dto.Product;
import com.springbootcartservice.entities.Cart;
import com.springbootcartservice.repositories.CartRepository;

@Service
public class CartService {

	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	CartRepository repository;
	
	public Cart addItemToCart(int productId,int quantity) {
		
		 Product product = getProductDetails(productId);
	        Double total = product.getProductPrice()*quantity;
	        Cart item=new Cart();
	        item.setPrice(total);
	        item.setProductId(productId);
	        item.setQuantity(quantity);
		return repository.save(item);
	}
	
	 public Iterable<Cart> getAllItems(){
	        return repository.findAll();
	    }
	
	  public Product getProductDetails(int productId) {
	      Product product =  restTemplate.getForObject("http://PRODUCT-SERVICE/api/v1/products/id/1",
	                            Product.class);
	      
	        return product;
	        
	  }
}

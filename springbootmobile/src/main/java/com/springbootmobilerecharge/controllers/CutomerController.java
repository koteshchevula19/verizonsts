package com.springbootmobilerecharge.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springbootmobilerecharge.entities.Customer;
import com.springbootmobilerecharge.services.CustomerService;

@RestController
@RequestMapping("api/v1")
public class CutomerController {

	@Autowired
	CustomerService service;
	
	@PostMapping("/customers")
	public void  addCustomer(@RequestBody Customer customer) {
		service.addCustomer(customer);
	}
	
	@GetMapping("/customers/baalnce")
	
	public String getCustomerBalanceByMobile(@RequestBody  Long mobile) {
		return service.getCustomerBalanceByMobile(mobile);
	}
}

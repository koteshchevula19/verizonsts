package com.springboootjdbcstarter.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.springboootjdbcstarter.service.LaptopService;

@RestController
public class LaptopController {

	
	@Autowired
	LaptopService laptopService;
	
	@GetMapping("/name{id}")
	public String getLaptopNameById(@PathVariable Integer id) {

		return laptopService.getLaptopNameById(id);
		
	}
	
	
	}

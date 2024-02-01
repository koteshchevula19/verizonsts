package com.springboootjdbcstarter.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbootjdbcstarter.repository.LaptopRepository;

@Service
public class LaptopService {
	
	@Autowired
	LaptopRepository laptopRepository;
	
	public String getLaptopNameById(Integer id) {
		
		
		return laptopRepository.getLaptopNameById(id);
	}
	
	

}

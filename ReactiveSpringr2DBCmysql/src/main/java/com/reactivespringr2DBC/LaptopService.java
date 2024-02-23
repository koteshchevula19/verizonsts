package com.reactivespringr2DBC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import reactor.core.publisher.Flux;

@Service
public class LaptopService {

	@Autowired
	LaptopRepository repository;
	
   public Flux<Laptop> getAllLaptops() {
	
	   return repository.findAll();
	}

}

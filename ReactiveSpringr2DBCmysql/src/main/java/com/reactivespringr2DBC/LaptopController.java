package com.reactivespringr2DBC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Flux;

@RestController
@RequestMapping("api/v1")
public class LaptopController {

	@Autowired
	LaptopService service;
	
	@GetMapping("/laptops")
	public  Flux<Laptop> getAllLaptops() {
		return service.getAllLaptops();
	}
}

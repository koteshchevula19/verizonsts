package com.springboootjdbcstarter.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboootjdbcstarter.dto.Laptop;
import com.springboootjdbcstarter.service.LaptopService;

@RestController
@CrossOrigin
@RequestMapping("api")
public class LaptopController {

	@Autowired
	LaptopService laptopService;
	
	@GetMapping("/laptops/{id}")
	public String getLaptopNameById(@PathVariable Integer id) {

		return laptopService.getLaptopNameById(id);
		
	}
	
	@PostMapping("/laptops")
	public int addNewLaptop(@RequestBody Laptop laptop) {
		return laptopService.addNewLaptop(laptop);
	}
	
	@PutMapping("/laptops/{id}")
	public int updateLaptop(@PathVariable Integer id, @RequestBody Laptop laptop){
		return laptopService.updateLaptop(id, laptop);
	}
	
	@GetMapping("/laptops")
	public List<Laptop> getAllLaptopdetails(){
	
		return laptopService.getAllLaptopdetails();
	}
	@DeleteMapping("laptops/{id}")
	public int deleteLaptopById(@PathVariable Integer id){
		return laptopService.deleteLaptopById(id);
	}
}

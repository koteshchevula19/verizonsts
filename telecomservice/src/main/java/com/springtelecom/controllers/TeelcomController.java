package com.springtelecom.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springtelecom.entities.Telecom;
import com.springtelecom.services.TelecomService;

@RestController
@RequestMapping("api/v1")
public class TeelcomController {

	@Autowired 
	TelecomService service;
	
	@GetMapping("/telecoms/{comapnyName}")
	public Optional<Telecom>  getByName(String companyName){
		return service.getByName(companyName);
	}
	
	@GetMapping("/telecoms")
	public Iterable<Telecom> getAllCompanies()
	{
		return service.getAllCompanies();
	}
	
	@PostMapping("/telecoms")
	public void addCompany(@RequestBody Telecom telecom) {
		service.addCompany(telecom);
	}
}

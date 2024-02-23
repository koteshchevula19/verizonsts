package com.springtelecom.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springtelecom.entities.Telecom;
import com.springtelecom.repositories.TelecomRepository;



@Service
public class TelecomService {

	
	@Autowired
	TelecomRepository repository;
	
	public Optional<Telecom>  getByName(String companyName){
		return repository.findByCompanyName(companyName);
	}

	public Iterable<Telecom> getAllCompanies() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	public void addCompany(Telecom telecom) {
		// TODO Auto-generated method stub
		repository.save(telecom);
	}
	
	
}

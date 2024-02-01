package com.springboootjdbcstarter.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboootjdbcstarter.dto.Laptop;
import com.springboootjdbcstarter.repository.LaptopRepository;

@Service
public class LaptopService {

	@Autowired
	LaptopRepository laptopRepository;
	
	public String getLaptopNameById(Integer id) {
		
		
		return laptopRepository.getLaptopNameById(id);
	}
	
	public int addNewLaptop(Laptop laptop) {
		return laptopRepository.addNewLaptop(laptop);
	}
	public int updateLaptop(Integer id, Laptop laptop) {
		
	return laptopRepository.updateLaptop(id, laptop);
	}
	
	public List<Laptop> getAllLaptopdetails(){
		return laptopRepository.getAllLaptopdetails();
	}
	public int deleteLaptopById(Integer id) {
		return laptopRepository.deleteLaptopById(id);
	}
}

package com.springdatajpastarter.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springdatajpastarter.entities.Place;
import com.springdatajpastarter.entities.User;
import com.springdatajpastarter.services.PlaceService;

@RestController
@RequestMapping("api/v1")
public class PlaceConroller {

	@Autowired
	PlaceService service;
	
	//Get all the places by userId
	
	@GetMapping("/places/user/{userId}")
	public List<Place> getAllPlacesByUserId(@PathVariable Integer userId){
		return service.getAllPlacesByUserId(userId);
	}
	
//  Add a new Place
  @PostMapping("/place/user/{userId}")
  void addNewPlace(@RequestBody Place place, @PathVariable Integer userId){
      place.setUser(new User(userId, "", "", ""));
      service.addNewPlace(place);
  }
}

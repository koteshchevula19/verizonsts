package com.springdatajpastarter.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springdatajpastarter.entities.Place;
import com.springdatajpastarter.repostories.PlaceRepository;

@Service
public class PlaceService {

	@Autowired
	PlaceRepository repository;
	
	public List<Place> getAllPlacesByUserId(Integer userId){
		return repository.findByUserId(userId);
	}
	
	 public Optional<Place> getPlaceById(Integer id){

	        return repository.findById(id);
	    }


	    public void addNewPlace(Place place){
	        repository.save(place);
	    }


	    public void updateExistingPlace(Place place){

	        repository.save(place);
	    }


	    public void deleteExistingPlace(Integer id){
	        repository.deleteById(id);
	    }

	
}

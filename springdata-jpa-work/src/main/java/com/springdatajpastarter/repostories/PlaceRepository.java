package com.springdatajpastarter.repostories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springdatajpastarter.entities.Place;

@Repository
public interface PlaceRepository extends CrudRepository<Place, Integer> {

	List<Place> findByUserId(Integer userId);
}

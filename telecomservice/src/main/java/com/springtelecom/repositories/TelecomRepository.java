package com.springtelecom.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springtelecom.entities.Telecom;

@Repository
public interface TelecomRepository  extends CrudRepository<Telecom, Integer>{

	Optional<Telecom> findByCompanyName(String companyName);
}


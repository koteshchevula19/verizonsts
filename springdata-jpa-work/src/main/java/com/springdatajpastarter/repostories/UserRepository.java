package com.springdatajpastarter.repostories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.springdatajpastarter.entities.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {
	
	List<User> findByName(String name);
	
	List<User> findByEmail(String email);
	
	@Query("select u from User u where u.id=:id and u.name=:name")
	List<User> findByBothIdAndName(@Param("id") Integer id,@Param("name") String name);
 
}

package com.springbootjdbcstarter.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class LaptopRepository {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public String getLaptopNameById(Integer id) {
		return jdbcTemplate.queryForObject("slect name from laptop where id=?",String.class,id);
	}
}

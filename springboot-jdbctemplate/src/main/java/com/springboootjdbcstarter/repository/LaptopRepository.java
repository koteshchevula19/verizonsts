package com.springboootjdbcstarter.repository;

import java.sql.ResultSet;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.springboootjdbcstarter.dto.Laptop;

@Repository
public class LaptopRepository {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public String getLaptopNameById(Integer id) {
		return jdbcTemplate.queryForObject("select name from laptop where id=?",String.class,id);
	}
	
	public int addNewLaptop(Laptop laptop) {
		return jdbcTemplate.update("insert into laptop (name,manufacturer) values (?,?)", laptop.getName(),laptop.getManufacturer()); 
	}
	
	public int updateLaptop(Integer id, Laptop laptop) {
	
		return jdbcTemplate.update("update laptop set name=?,manufacturer=? where id=?",laptop.getName(),laptop.getManufacturer(),id );
	}
	
	public List<Laptop> getAllLaptopdetails(){
	
		return jdbcTemplate.query("select * from laptop",(ResultSet rs, int numRows)
				-> new Laptop(
						rs.getString("name"),
						rs.getString("manufacturer"))
				
				);
	}
	
	public int deleteLaptopById(Integer id) {
		return jdbcTemplate.update("delete from laptop where id=?",id);
	}
}

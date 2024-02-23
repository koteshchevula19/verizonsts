package com.springmobilemnpsoftware.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private Long mobile;
	
	private String name;
	
	private String mail;
	
	private String password;
	
	private String service;
	
	private Double balance;
	
	private boolean active;
	
	
}

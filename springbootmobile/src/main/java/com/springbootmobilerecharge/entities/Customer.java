package com.springbootmobilerecharge.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String name;
	
	private Double balance;
	
	private Long mobile;

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", balance=" + balance + ", mobile=" + mobile + "]";
	}

	public Customer( String name, Double balance, Long mobile) {
		super();
		
		this.name = name;
		this.balance = balance;
		this.mobile = mobile;
	}
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	public Customer(Integer id) {
		this.id=id;
		// TODO Auto-generated constructor stub
	}
	public Customer(Long mobile) {
		// TODO Auto-generated constructor stub
	
	this.mobile=mobile;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public Long getMobile() {
		return mobile;
	}

	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}
	
	
	
	
}

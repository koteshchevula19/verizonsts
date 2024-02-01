package com.springbootmobilerecharge.entities;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Recharge {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer rechargeId;
	
	private LocalDateTime recargeDateTime;
	
	private Double rechargeAmount;
	
	private Long rechargeMobile;
	
	@ManyToOne
	private Customer customer;

	

	public Recharge(Integer rechargeId, Double rechargeAmount,Integer customerId, Long rechargeMobile) {
		super();
		this.rechargeId = rechargeId;
		this.rechargeAmount = rechargeAmount;
		this.customer = new Customer(customerId);
		this.rechargeMobile=rechargeMobile;
	}
	public Recharge() {
		// TODO Auto-generated constructor stub
	}
	public Integer getRechargeId() {
		return rechargeId;
	}
	public void setRechargeId(Integer rechargeId) {
		this.rechargeId = rechargeId;
	}
	public LocalDateTime getRecargeDateTime() {
		return recargeDateTime;
	}
	public void setRecargeDateTime(LocalDateTime recargeDateTime) {
		this.recargeDateTime = recargeDateTime;
	}
	public Double getRechargeAmount() {
		return rechargeAmount;
	}
	public void setRechargeAmount(Double rechargeAmount) {
		this.rechargeAmount = rechargeAmount;
	}
	public Long getRechargeMobile() {
		return rechargeMobile;
	}
	public void setRechargeMobile(Long rechargeMobile) {
		this.rechargeMobile = rechargeMobile;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
}

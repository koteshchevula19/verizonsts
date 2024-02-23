package com.springmobilemnpsoftware.entities;

import java.sql.Date;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import lombok.Data;

@Entity
@Data
public class Billing {

	@Id
	private String billId;
	
	@PrePersist
	public void generateBillID() {
		this.billId= UUID.randomUUID().toString().substring(2,13);
	}
	
	
	private Date billingDate;
	
	
}


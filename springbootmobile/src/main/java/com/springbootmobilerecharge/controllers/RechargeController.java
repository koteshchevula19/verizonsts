package com.springbootmobilerecharge.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springbootmobilerecharge.entities.Recharge;
import com.springbootmobilerecharge.services.CustomerService;
import com.springbootmobilerecharge.services.RechargeService;

@RestController
@RequestMapping("api/v1")
public class RechargeController {

	@Autowired
	RechargeService rechargeService;
	
	@Autowired
	CustomerService customerService;
	
	@PostMapping("recharges/customers/{id}/") 
	public void rechargeBymobileNumber(@RequestBody Recharge recharge, @PathVariable Integer id,@RequestBody Long mobile) {
		rechargeService.rechargeBymobileNumber(recharge,id, mobile);
	}
	
	
}
package com.springbootmobilerecharge.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springbootmobilerecharge.entities.Recharge;

@Repository
public interface RechargeRepository extends CrudRepository<Recharge, Integer> {

}

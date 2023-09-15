package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Billing;

@Repository
public interface BillingRepository extends CrudRepository<Billing, Integer> {

}

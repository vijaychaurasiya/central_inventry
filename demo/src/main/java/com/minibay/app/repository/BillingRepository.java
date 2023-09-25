package com.minibay.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.minibay.app.entity.Billing;

@Repository
public interface BillingRepository extends CrudRepository<Billing, Integer> {

}

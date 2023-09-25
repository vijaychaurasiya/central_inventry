package com.minibay.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.minibay.app.entity.Shipment;

@Repository
public interface ShipmentRepository extends CrudRepository<Shipment, Integer> {

}

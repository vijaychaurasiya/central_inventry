package com.minibay.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.minibay.app.entity.Order;

@Repository
public interface OrderRepository extends CrudRepository<Order, Integer>{

}

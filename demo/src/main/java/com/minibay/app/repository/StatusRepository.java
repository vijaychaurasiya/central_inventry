package com.minibay.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.minibay.app.entity.Status;

@Repository
public interface StatusRepository extends CrudRepository<Status, Integer> {

}

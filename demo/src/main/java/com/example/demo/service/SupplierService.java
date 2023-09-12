package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.dto.SupplierDTO;
import com.example.demo.entity.Supplier;
import com.example.demo.repository.SupplierRepository;

@Service
public class SupplierService {

	@Autowired
	SupplierRepository repository;
	
	@Autowired
	SupplierDTO supplierDTO;
	
	
	public ResponseEntity<String> registerSupplier(Supplier supplier) {
		Supplier repoSupplier= repository.findByUserName(supplier.getEmail(), supplier.getPassword());
		if(repoSupplier!=null) {
			return new ResponseEntity<String>("User already registered", HttpStatus.FOUND);
		}
		repoSupplier=repository.save(supplier);
		
		supplierDTO.setFirstName(repoSupplier.getFirstName());
		supplierDTO.setLastName(repoSupplier.getLastName());
		supplierDTO.setBaseUrl(repoSupplier.getBaseUrl());
		supplierDTO.setConsumerKey(repoSupplier.getConsumerKey());
		supplierDTO.setConsumerSecret(repoSupplier.getConsumerSecret());
		supplierDTO.setEmail(repoSupplier.getEmail());
		supplierDTO.setPhone(repoSupplier.getPhone());
		
		return new ResponseEntity<String>("Registration Successful", HttpStatus.OK);
	}

	
	
	
	public ResponseEntity<String> loginSupplier(Supplier supplier) {
		
		Supplier repoSupplier= repository.findByUserName(supplier.getEmail(), supplier.getPassword());
		if(repoSupplier==null) {
			return new ResponseEntity<String>("Wrong Credentials", HttpStatus.NOT_FOUND);
		}
		 
		supplierDTO.setFirstName(repoSupplier.getFirstName());
		supplierDTO.setLastName(repoSupplier.getLastName());
		supplierDTO.setBaseUrl(repoSupplier.getBaseUrl());
		supplierDTO.setConsumerKey(repoSupplier.getConsumerKey());
		supplierDTO.setConsumerSecret(repoSupplier.getConsumerSecret());
		supplierDTO.setEmail(repoSupplier.getEmail());
		supplierDTO.setPhone(repoSupplier.getPhone());
		
		return new ResponseEntity<String>("Login Successful", HttpStatus.OK);
	}


	public ResponseEntity<String> logout() {
		supplierDTO.setBaseUrl(null);;
		return new ResponseEntity<>("Logout", HttpStatus.OK);
	}
	
}

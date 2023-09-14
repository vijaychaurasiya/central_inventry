package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.SupplierDTO;
import com.example.demo.entity.Supplier;
import com.example.demo.service.SupplierService;

@RestController
@RequestMapping("/supplier")
public class SupplierController {
	
	@Autowired
	Supplier supplier;

	@Autowired
	SupplierDTO supplierDTO;
	
	@Autowired
	SupplierService supplierService;
   
	@PostMapping("/register")
	public ResponseEntity<String> registerSupplier(@RequestBody SupplierDTO supplierDTO){
		supplier.setFirstName(supplierDTO.getFirstName());
		supplier.setLastName(supplierDTO.getLastName());
		supplier.setPhone(supplierDTO.getPhone());
		supplier.setEmail(supplierDTO.getEmail());
		supplier.setPassword(supplierDTO.getPassword());
		
		return supplierService.registerSupplier(supplier);
	}
	
	@PostMapping("/login")
	public ResponseEntity<String> loginSupplier(@RequestBody SupplierDTO supplierDTO){
		supplier.setEmail(supplierDTO.getEmail());
		supplier.setPassword(supplierDTO.getPassword());
		
		return supplierService.loginSupplier(supplier);
	}
	
	@PostMapping("/logout")
	public ResponseEntity<String> logoutSupplier(){
		supplier.setEmail(supplierDTO.getEmail());
		return supplierService.logout(supplier);
		 
	}
}

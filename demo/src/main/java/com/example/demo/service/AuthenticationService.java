package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Supplier;
import com.example.demo.repository.SupplierRepository;

@Service
public class AuthenticationService {

	@Autowired
	SupplierRepository supplierRepository;
	
	public boolean authenticate(String token,int id) {
		Supplier supplier= supplierRepository.existById(id);
		if(supplier.getToken().equals(token)) {
			//System.out.println("supplier"+ supplier.getToken()+" "+"header"+token);
			//System.out.println(supplier.getToken().equals(token));
		return true;
		}
		
		return false;
	}
}

package com.minibay.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.minibay.app.entity.Supplier;
import com.minibay.app.repository.SupplierRepository;

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

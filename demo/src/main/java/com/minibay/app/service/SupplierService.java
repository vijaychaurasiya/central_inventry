package com.minibay.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import java.util.Random;

import com.minibay.app.dto.SupplierDTO;
import com.minibay.app.entity.Supplier;
import com.minibay.app.repository.SupplierRepository;

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
		 
		String token = generateRandomString(20);
        //System.out.println(repoSupplier);
		
		supplier.setId(repoSupplier.getId());
		supplier.setFirstName(repoSupplier.getFirstName());
		supplier.setLastName(repoSupplier.getLastName());
		supplier.setBaseUrl(repoSupplier.getBaseUrl());
		supplier.setConsumerKey(repoSupplier.getConsumerKey());
		supplier.setConsumerSecret(repoSupplier.getConsumerSecret());
		supplier.setEmail(repoSupplier.getEmail());
		supplier.setPhone(repoSupplier.getPhone());
		supplier.setToken(token);
        repository.save(supplier);
       // System.out.println(repoSupplier);
        repoSupplier= repository.findByUserName(supplier.getEmail(), supplier.getPassword());
        //System.out.println(repoSupplier);
        supplierDTO.setId(repoSupplier.getId());
		supplierDTO.setFirstName(repoSupplier.getFirstName());
		supplierDTO.setLastName(repoSupplier.getLastName());
		supplierDTO.setBaseUrl(repoSupplier.getBaseUrl());
		supplierDTO.setConsumerKey(repoSupplier.getConsumerKey());
		supplierDTO.setConsumerSecret(repoSupplier.getConsumerSecret());
		supplierDTO.setEmail(repoSupplier.getEmail());
		supplierDTO.setPhone(repoSupplier.getPhone());
		supplierDTO.setToken(repoSupplier.getToken());
		
		 HttpHeaders headers = new HttpHeaders();
	        headers.add("Authorization", token);
		//System.out.println(supplierDTO);
	        return ResponseEntity.ok()
	                .headers(headers)
	                .body("Login Successful");
	}


	public ResponseEntity<String> logout(Supplier supplier) {
		supplier.setEmail(supplierDTO.getEmail());
		 supplier.setToken("0");
	        repository.save(supplier);
	       // Supplier repoSupplier= repository.findByUserName(supplier.getEmail(), supplier.getPassword());
	    	supplierDTO.setFirstName(null);
			supplierDTO.setLastName(null);
			supplierDTO.setBaseUrl(null);
			supplierDTO.setConsumerKey(null);
			supplierDTO.setConsumerSecret(null);
			supplierDTO.setEmail(null);
			supplierDTO.setPhone(null);
		    supplierDTO.setBaseUrl(null);
		return new ResponseEntity<>("Logout", HttpStatus.OK);
	}
	
	


    // Method to generate a random string of a specified length
    public static String generateRandomString(int length) {
    	final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();
        StringBuilder sb = new StringBuilder(length);

        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(CHARACTERS.length());
            char randomChar = CHARACTERS.charAt(randomIndex);
            sb.append(randomChar);
        }

        return sb.toString();
    }

	
}

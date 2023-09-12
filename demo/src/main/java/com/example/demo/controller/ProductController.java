package com.example.demo.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.dto.ProductDTO;
import com.example.demo.dto.SupplierDTO;
import com.example.demo.entity.Supplier;

@RestController
public class ProductController {
	
	@Autowired
	SupplierDTO supplierDTO;

	@GetMapping("/products")
	public ResponseEntity<List<Object>> getProducts() throws Exception{
		if(supplierDTO.getBaseUrl()==null || supplierDTO.getConsumerKey()==null || supplierDTO.getConsumerSecret()==null) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);    
		}
		String url=supplierDTO.getBaseUrl()+"products/?consumer_key="+supplierDTO.getConsumerKey()+"&consumer_secret="+supplierDTO.getConsumerSecret();
		//System.out.println(url);
		RestTemplate restTemplate=new RestTemplate();
		Object[] productList= restTemplate.getForObject(url, Object[].class);
		return new ResponseEntity<>(Arrays.asList(productList),HttpStatus.OK);
		
		
	}
	
	@GetMapping("/products/{id}")
	public ResponseEntity<ProductDTO> getSpecificProducts(@PathVariable("id") int id){
		String strId= String.valueOf(id);
		if(supplierDTO.getBaseUrl()==null || supplierDTO.getConsumerKey()==null || supplierDTO.getConsumerSecret()==null) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);    
		}
		String url=supplierDTO.getBaseUrl()+"products/"+strId+"/?consumer_key="+supplierDTO.getConsumerKey()+"&consumer_secret="+supplierDTO.getConsumerSecret();   
		RestTemplate restTemplate=new RestTemplate();
		ProductDTO product= restTemplate.getForObject(url, ProductDTO.class);
		return new ResponseEntity<>(product, HttpStatus.OK);
		
	}
	
	@PutMapping("/products/{id}")
	public ProductDTO updateProducts(@PathVariable("id") int id, @RequestBody ProductDTO productDTO){
		String strId= String.valueOf(id); 
		String url=supplierDTO.getBaseUrl()+"products/"+strId+"/?consumer_key="+supplierDTO.getConsumerKey()+"&consumer_secret="+supplierDTO.getConsumerSecret();   
		System.out.println(url);
		RestTemplate restTemplate=new RestTemplate();
		ProductDTO product= restTemplate.postForObject(url,productDTO, ProductDTO.class);
		return product;
		
	}
}

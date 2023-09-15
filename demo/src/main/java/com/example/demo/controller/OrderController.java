package com.example.demo.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import com.example.demo.dto.OrderDTO;
import com.example.demo.dto.SupplierDTO;
import com.example.demo.service.AuthenticationService;
import com.example.demo.service.BillingService;
import com.example.demo.service.OrderService;

@RestController
public class OrderController {
    
	@Autowired
	SupplierDTO supplierDTO;
	
	@Autowired
	OrderService orderService;
	
	@Autowired
	BillingService billingService;
	
    @Autowired
    AuthenticationService authenticationService;
	
	@GetMapping("/orders")
	public ResponseEntity<OrderDTO []> getOrders(@RequestHeader("Authorization") String authorization ) throws Exception{
		
		boolean token=authenticationService.authenticate(authorization,supplierDTO.getId());
		if(!token) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);    
		}
		String url=supplierDTO.getBaseUrl()+"orders/?consumer_key="+supplierDTO.getConsumerKey()+"&consumer_secret="+supplierDTO.getConsumerSecret();
		//System.out.println(url);
		RestTemplate restTemplate=new RestTemplate();
		OrderDTO[] orderList= restTemplate.getForObject(url, OrderDTO[].class);
		//System.out.println("orderList controller "+ orderList);
		orderService.saveOrder(orderList);
		billingService.saveBilling(orderList);
		return new ResponseEntity<>(orderList,HttpStatus.OK);
		
		
	}
	
	@GetMapping("/orders/{id}")
	public ResponseEntity<OrderDTO> getSpecificOrder(@PathVariable("id") int id){
		String strId= String.valueOf(id);
		boolean token=authenticationService.authenticate(supplierDTO.getToken(),supplierDTO.getId());
		if(!token) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);    
		}
		String url=supplierDTO.getBaseUrl()+"orders/"+strId+"/?consumer_key="+supplierDTO.getConsumerKey()+"&consumer_secret="+supplierDTO.getConsumerSecret();   
		RestTemplate restTemplate=new RestTemplate();
		OrderDTO order= restTemplate.getForObject(url, OrderDTO.class);
		return new ResponseEntity<>(order, HttpStatus.OK);
		
	}
	
	@PostMapping("/orders")
	public ResponseEntity<OrderDTO> createOrder(@RequestBody OrderDTO orderDTO){
		boolean token=authenticationService.authenticate(supplierDTO.getToken(),supplierDTO.getId());
		if(!token) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		} 
		String url=supplierDTO.getBaseUrl()+"orders/?consumer_key="+supplierDTO.getConsumerKey()+"&consumer_secret="+supplierDTO.getConsumerSecret();   
		//System.out.println(url);
		RestTemplate restTemplate=new RestTemplate();
		OrderDTO order= restTemplate.postForObject(url,orderDTO, OrderDTO.class);
		return new ResponseEntity<>(order,HttpStatus.OK);
		
	}
}

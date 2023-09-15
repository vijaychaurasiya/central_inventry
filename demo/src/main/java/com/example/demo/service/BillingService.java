package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.OrderDTO;
import com.example.demo.entity.Billing;
import com.example.demo.repository.BillingRepository;

@Service
public class BillingService {
   
	@Autowired
	BillingRepository billingRepository;
	
    public void saveBilling(OrderDTO [] orderList) {
    	List<Billing> billings=mapToEntity(orderList);
    	billingRepository.saveAll(billings);
    }
    
    public List<Billing> mapToEntity(OrderDTO [] orderList){
    	List<Billing> billingEntities=new ArrayList();
    	for(OrderDTO orderDTO: orderList) {
    		Billing billing=mapFromDTO(orderDTO);
    		billingEntities.add(billing);
    	}
    	return billingEntities;
    }
    
    public Billing mapFromDTO(OrderDTO orderDTO) {
    	Billing billing = new Billing();
    	billing.setOrder_id(orderDTO.getId());
    	billing.setFirst_name(orderDTO.getBilling().get("first_name"));
        billing.setLast_name(orderDTO.getBilling().get("last_name"));
        billing.setCompany(orderDTO.getBilling().get("company"));
        billing.setAddress_1(orderDTO.getBilling().get("address_1"));
        billing.setAddress_2(orderDTO.getBilling().get("address_2"));
        billing.setCity(orderDTO.getBilling().get("city"));
        billing.setState(orderDTO.getBilling().get("state"));
        billing.setPostcode(orderDTO.getBilling().get("postcode"));
        billing.setCountry(orderDTO.getBilling().get("country"));
        billing.setEmail(orderDTO.getBilling().get("email"));
        billing.setPhone(orderDTO.getBilling().get("phone"));
    	return billing;
    }
}

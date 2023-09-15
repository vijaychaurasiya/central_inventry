package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.OrderDTO;
import com.example.demo.entity.Order;
import com.example.demo.repository.OrderRepository;


@Service
public class OrderService {

	@Autowired
	OrderRepository orderRepository;
	
	public void saveOrder(OrderDTO [] orderList) {
		List<Order> orders= mapToEntities(orderList);
		//System.out.println("main methos "+orders);
		orderRepository.saveAll(orders);
	}
	
	
	public List<Order> mapToEntities(OrderDTO [] orderList) {
	    List<Order> orderEntities = new ArrayList<>();
	    //System.out.println("orderList "+orderList);
	    for (OrderDTO orderDTO : orderList) {
	            //System.out.println("Received OrderDTO: " + orderDTO);
	            Order order = mapFromDTO(orderDTO);
	            orderEntities.add(order);
	    }
	    return orderEntities;
	}
	
	public Order mapFromDTO(OrderDTO orderDTO) {
		 Order order= new Order();
	    order.setId(orderDTO.getId());
	    order.setParent_id(orderDTO.getParent_id());
	    order.setNumber(orderDTO.getNumber());
	    order.setOrder_key(orderDTO.getOrder_key());
	    order.setCreated_via(orderDTO.getCreated_via());
	    order.setVersion(orderDTO.getVersion());
	    order.setStatus(orderDTO.getStatus());
	    order.setCurrency(orderDTO.getCurrency());
	    order.setDate_created(orderDTO.getDate_created());
	    order.setDate_created_gmt(orderDTO.getDate_created_gmt());
	    order.setDate_modified(orderDTO.getDate_modified());
	    order.setDate_modified_gmt(orderDTO.getDate_modified_gmt());
	    order.setDiscount_total(orderDTO.getDiscount_total());
	    order.setDiscount_tax(orderDTO.getDiscount_tax());
	    order.setShipping_total(orderDTO.getShipping_total());
	    order.setShipping_tax(orderDTO.getShipping_tax());
	    order.setCart_tax(orderDTO.getCart_tax());
	    order.setTotal(orderDTO.getTotal());
	    order.setTotal_tax(orderDTO.getTotal_tax());
	    order.setPrices_include_tax(orderDTO.isPrices_include_tax());
	    order.setCustomer_id(orderDTO.getCustomer_id());
	    order.setCustomer_ip_address(orderDTO.getCustomer_ip_address());
	    order.setCustomer_user_agent(orderDTO.getCustomer_user_agent());
	    order.setCustomer_note(orderDTO.getCustomer_note());
	    order.setPayment_method(orderDTO.getPayment_method());
	    order.setPayment_method_title(orderDTO.getPayment_method_title());
	    order.setTransaction_id(orderDTO.getTransaction_id());
	    order.setDate_paid(orderDTO.getDate_paid());
	    order.setDate_paid_gmt(orderDTO.getDate_paid_gmt());
	    order.setDate_completed(orderDTO.getDate_completed());
	    order.setDate_completed_gmt(orderDTO.getDate_completed_gmt());
	    order.setCart_hash(orderDTO.getCart_hash());
	   // System.out.println("order "+order);
	    return order;
	}


}

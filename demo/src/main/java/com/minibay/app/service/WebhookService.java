package com.minibay.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.minibay.app.dto.ShipmentDTO;
import com.minibay.app.entity.Shipment;
import com.minibay.app.repository.ShipmentRepository;


@Service
public class WebhookService {
	
	@Autowired
	Shipment shipment;
	
	@Autowired
	ShipmentRepository shipmentRepository;
	
	public ResponseEntity<String> getStatus(ShipmentDTO shipmentDTO){
		
		shipment.setAwb(shipmentDTO.getAwb());
		shipment.setNslCode(shipmentDTO.getNslCode());
		shipment.setPickUpDate(shipmentDTO.getPickUpDate());
		shipment.setReferenceNo(shipmentDTO.getReferenceNo());
		shipment.setSortCode(shipmentDTO.getSortCode());
		shipment.setStatus(shipmentDTO.getStatus().getStatus());
		shipment.setStatusDateTime(shipmentDTO.getStatus().getStatusDateTime());
		shipment.setInstructions(shipmentDTO.getStatus().getInstructions());
		shipment.setStatusLocation(shipmentDTO.getStatus().getStatusLocation());
		shipment.setStatusType(shipmentDTO.getStatus().getStatusType());
		
		shipmentRepository.save(shipment);
		
		return new ResponseEntity<>("Success", HttpStatus.OK);
		
		
		
	}

}

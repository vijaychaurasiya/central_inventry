package com.minibay.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.minibay.app.dto.ShipmentDTO;
import com.minibay.app.entity.Shipment;
import com.minibay.app.entity.Status;
import com.minibay.app.repository.ShipmentRepository;
import com.minibay.app.repository.StatusRepository;

@Service
public class WebhookService {
	
	@Autowired
	Status status;
	
	@Autowired
	Shipment shipment;
	
	@Autowired
	StatusRepository statusRepository;
	
	@Autowired
	ShipmentRepository shipmentRepository;
	
	public ResponseEntity<String> getStatus(ShipmentDTO shipmentDTO){
		status.setStatus(shipmentDTO.getStatus().getStatus());
		status.setAWB(shipmentDTO.getAwb());
		status.setStatusDateTime(shipmentDTO.getStatus().getStatusDateTime());
		status.setInstructions(shipmentDTO.getStatus().getInstructions());
		status.setStatusLocation(shipmentDTO.getStatus().getStatusLocation());
		status.setStatusType(shipmentDTO.getStatus().getStatusType());
		
		shipment.setAwb(shipmentDTO.getAwb());
		shipment.setNslCode(shipmentDTO.getNslCode());
		shipment.setPickUpDate(shipmentDTO.getPickUpDate());
		shipment.setReferenceNo(shipmentDTO.getReferenceNo());
		shipment.setSortCode(shipmentDTO.getSortCode());
		
		statusRepository.save(status);
		shipmentRepository.save(shipment);
		
		return new ResponseEntity<>("Success", HttpStatus.OK);
		
		
		
	}

}

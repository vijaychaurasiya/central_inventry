package com.minibay.app.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.minibay.app.dto.PayloadDTO;
import com.minibay.app.dto.ShipmentDTO;
import com.minibay.app.entity.Shipment;
import com.minibay.app.service.WebhookService;



@RestController
@RequestMapping("/order")
public class WebhookController {
	
	@Autowired
	WebhookService webhookService;
	
	@PostMapping("/shipment_status")
    public ResponseEntity<String> getStatus(@RequestBody PayloadDTO payloadDTO, @RequestHeader("Authorization") String authorization) {
		System.out.println(payloadDTO);
		if(!authorization.equals("PJP8Jf0DvsG9dPLkKm5jszZsAUtnPvVZcuA1d#JoSG&3R9lowRbJGx8kQCW818iNwEpNOBc7Uh6BaPP*#PLgS95IvIi#GwGWI=kh")) {
			return new ResponseEntity<>("Authorization failed", HttpStatus.UNAUTHORIZED);
		}
		if(payloadDTO==null) {
			return new ResponseEntity<>("null", HttpStatus.NO_CONTENT);
		}
       return webhookService.getStatus(payloadDTO.getShipmentDTO());
    }

}

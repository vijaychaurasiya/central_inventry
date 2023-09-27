package com.minibay.app.dto;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonProperty;

@Component
public class PayloadDTO {
	
	@JsonProperty("Shipment")
     private ShipmentDTO shipmentDTO;
	
	public PayloadDTO() {
		
	}

	public PayloadDTO(ShipmentDTO shipmentDTO) {
		super();
		this.shipmentDTO = shipmentDTO;
	}

	public ShipmentDTO getShipmentDTO() {
		return shipmentDTO;
	}

	public void setShipmentDTO(ShipmentDTO shipmentDTO) {
		this.shipmentDTO = shipmentDTO;
	}

	@Override
	public String toString() {
		return "PayloadDTO [shipmentDTO=" + shipmentDTO + "]";
	}
	
	
	
}

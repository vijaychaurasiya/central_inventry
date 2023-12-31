package com.minibay.app.dto;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

public class StatusDTO {
	@JsonProperty("Status")
    private String status;
	
	@JsonProperty("StatusDateTime")
    private Date statusDateTime;
	
	@JsonProperty("StatusType")
    private String statusType;
	
	@JsonProperty("StatusLocation")
    private String statusLocation;
	
	@JsonProperty("Instructions")
    private String instructions;

    public StatusDTO() {
    	
    }

	public StatusDTO(String status, Date statusDateTime, String statusType, String statusLocation,
			String instructions) {
		super();
		this.status = status;
		this.statusDateTime = statusDateTime;
		this.statusType = statusType;
		this.statusLocation = statusLocation;
		this.instructions = instructions;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getStatusDateTime() {
		return statusDateTime;
	}

	public void setStatusDateTime(Date statusDateTime) {
		this.statusDateTime = statusDateTime;
	}

	public String getStatusType() {
		return statusType;
	}

	public void setStatusType(String statusType) {
		this.statusType = statusType;
	}

	public String getStatusLocation() {
		return statusLocation;
	}

	public void setStatusLocation(String statusLocation) {
		this.statusLocation = statusLocation;
	}

	public String getInstructions() {
		return instructions;
	}

	public void setInstructions(String instructions) {
		this.instructions = instructions;
	}

	@Override
	public String toString() {
		return "StatusDTO [status=" + status + ", statusDateTime=" + statusDateTime + ", statusType=" + statusType
				+ ", statusLocation=" + statusLocation + ", instructions=" + instructions + "]";
	}
    
    
    
}

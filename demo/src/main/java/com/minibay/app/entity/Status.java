package com.minibay.app.entity;

import javax.persistence.*;

import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@Entity
public class Status {

    @Id
    private String awb; // Primary Key

    private String status;

    @Temporal(TemporalType.TIMESTAMP)
    private Date statusDateTime;

    private String statusType;

    private String statusLocation;

    private String instructions;

    public Status() {
    	
    }

	public Status(String aWB, String status, Date statusDateTime, String statusType, String statusLocation,
			String instructions) {
		super();
		awb = aWB;
		this.status = status;
		this.statusDateTime = statusDateTime;
		this.statusType = statusType;
		this.statusLocation = statusLocation;
		this.instructions = instructions;
	}

	public String getAWB() {
		return awb;
	}

	public void setAWB(String aWB) {
		awb = aWB;
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
		return "Status [AWB=" + awb + ", status=" + status + ", statusDateTime=" + statusDateTime + ", statusType="
				+ statusType + ", statusLocation=" + statusLocation + ", instructions=" + instructions + "]";
	}
    
    
}


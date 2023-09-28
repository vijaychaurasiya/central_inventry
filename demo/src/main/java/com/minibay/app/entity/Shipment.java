package com.minibay.app.entity;

import javax.persistence.*;

import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@Entity
public class Shipment {

    @Id
    private String awb; // Primary Key

    @Temporal(TemporalType.TIMESTAMP)
    private Date pickUpDate;

    private String nslCode;

    private String sortCode;

    private String referenceNo;
    
    private String status;

    @Temporal(TemporalType.TIMESTAMP)
    private Date statusDateTime;

    private String statusType;

    private String statusLocation;

    private String instructions;
    
    
    
    public Shipment(){
    	
    }


	public Shipment(String awb, Date pickUpDate, String nslCode, String sortCode, String referenceNo, String status,
			Date statusDateTime, String statusType, String statusLocation, String instructions) {
		super();
		this.awb = awb;
		this.pickUpDate = pickUpDate;
		this.nslCode = nslCode;
		this.sortCode = sortCode;
		this.referenceNo = referenceNo;
		this.status = status;
		this.statusDateTime = statusDateTime;
		this.statusType = statusType;
		this.statusLocation = statusLocation;
		this.instructions = instructions;
	}

	public String getAwb() {
		return awb;
	}

	public void setAwb(String awb) {
		this.awb = awb;
	}

	public Date getPickUpDate() {
		return pickUpDate;
	}

	public void setPickUpDate(Date pickUpDate) {
		this.pickUpDate = pickUpDate;
	}

	public String getNslCode() {
		return nslCode;
	}

	public void setNslCode(String nslCode) {
		this.nslCode = nslCode;
	}

	public String getSortCode() {
		return sortCode;
	}

	public void setSortCode(String sortCode) {
		this.sortCode = sortCode;
	}

	public String getReferenceNo() {
		return referenceNo;
	}

	public void setReferenceNo(String referenceNo) {
		this.referenceNo = referenceNo;
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
		return "Shipment [awb=" + awb + ", pickUpDate=" + pickUpDate + ", nslCode=" + nslCode + ", sortCode=" + sortCode
				+ ", referenceNo=" + referenceNo + ", status=" + status + ", statusDateTime=" + statusDateTime
				+ ", statusType=" + statusType + ", statusLocation=" + statusLocation + ", instructions=" + instructions
				+ "]";
	}

	
}

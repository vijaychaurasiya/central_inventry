package com.minibay.app.dto;

import java.time.LocalDateTime;
import java.util.Date;

public class ShipmentDTO {
    private StatusDTO status;
    private Date pickUpDate;
    private String nslCode;
    private String sortCode;
    private String referenceNo;
    private String awb;
    
    public ShipmentDTO() {
    	
    }
    
	public ShipmentDTO(StatusDTO status, Date pickUpDate, String nslCode, String sortCode, String referenceNo,
			String awb) {
		super();
		this.status = status;
		this.pickUpDate = pickUpDate;
		this.nslCode = nslCode;
		this.sortCode = sortCode;
		this.referenceNo = referenceNo;
		this.awb = awb;
	}
	public StatusDTO getStatus() {
		return status;
	}
	public void setStatus(StatusDTO status) {
		this.status = status;
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
	public String getAwb() {
		return awb;
	}
	public void setAwb(String awb) {
		this.awb = awb;
	}
	
	@Override
	public String toString() {
		return "ShipmentDTO [status=" + status + ", pickUpDate=" + pickUpDate + ", nslCode=" + nslCode + ", sortCode="
				+ sortCode + ", referenceNo=" + referenceNo + ", awb=" + awb + "]";
	}
	  
}


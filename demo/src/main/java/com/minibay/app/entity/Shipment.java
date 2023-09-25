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
    
    public Shipment(){
    	
    }

	public Shipment(String awb, Date pickUpDate, String nslCode, String sortCode, String referenceNo) {
		super();
		this.awb = awb;
		this.pickUpDate = pickUpDate;
		this.nslCode = nslCode;
		this.sortCode = sortCode;
		this.referenceNo = referenceNo;
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

	@Override
	public String toString() {
		return "Shipment [awb=" + awb + ", pickUpDate=" + pickUpDate + ", nslCode=" + nslCode + ", sortCode=" + sortCode
				+ ", referenceNo=" + referenceNo + "]";
	}

	
}

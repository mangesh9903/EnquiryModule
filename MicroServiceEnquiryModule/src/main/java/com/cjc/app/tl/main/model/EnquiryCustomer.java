package com.cjc.app.tl.main.model;




import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class EnquiryCustomer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int enquiryCustomerId;
	
	private String enquiryCustomerName;
	
	private long enquiryCustomerMobileNo;
	
	private String enquiryCustomerEmailId;
	
	private String  enquiryCustomerAddress;
	
	private long enquiryCustomerUid;
	
	private String enquiryCustomerPanNo;
	
	private String enquiryCustomerDob;
	
	private String status;
	
	private String occupation;
	
	private double enquiryCustomerYearlyIncome;
	
	private String cibilStatus;

	public String getEnquiryCustomerDob() {
		return enquiryCustomerDob;
	}

	public void setEnquiryCustomerDob(String enquiryCustomerDob) {
		this.enquiryCustomerDob = enquiryCustomerDob;
	}
	public int getEnquiryCustomerId() {
		return enquiryCustomerId;
	}

	public void setEnquiryCustomerId(int enquiryCustomerId) {
		this.enquiryCustomerId = enquiryCustomerId;
	}

	public String getEnquiryCustomerName() {
		return enquiryCustomerName;
	}

	public void setEnquiryCustomerName(String enquiryCustomerName) {
		this.enquiryCustomerName = enquiryCustomerName;
	}

	public long getEnquiryCustomerMobileNo() {
		return enquiryCustomerMobileNo;
	}

	public void setEnquiryCustomerMobileNo(long enquiryCustomerMobileNo) {
		this.enquiryCustomerMobileNo = enquiryCustomerMobileNo;
	}

	public String getEnquiryCustomerEmailId() {
		return enquiryCustomerEmailId;
	}

	public void setEnquiryCustomerEmailId(String enquiryCustomerEmailId) {
		this.enquiryCustomerEmailId = enquiryCustomerEmailId;
	}

	public String getEnquiryCustomerAddress() {
		return enquiryCustomerAddress;
	}

	public void setEnquiryCustomerAddress(String enquiryCustomerAddress) {
		this.enquiryCustomerAddress = enquiryCustomerAddress;
	}

	public long getEnquiryCustomerUid() {
		return enquiryCustomerUid;
	}

	public void setEnquiryCustomerUid(long enquiryCustomerUid) {
		this.enquiryCustomerUid = enquiryCustomerUid;
	}

	public String getEnquiryCustomerPanNo() {
		return enquiryCustomerPanNo;
	}

	public void setEnquiryCustomerPanNo(String enquiryCustomerPanNo) {
		this.enquiryCustomerPanNo = enquiryCustomerPanNo;
	}

	

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	

	public double getEnquiryCustomerYearlyIncome() {
		return enquiryCustomerYearlyIncome;
	}

	public void setEnquiryCustomerYearlyIncome(double enquiryCustomerYearlyIncome) {
		this.enquiryCustomerYearlyIncome = enquiryCustomerYearlyIncome;
	}

	public String getCibilStatus() {
		return cibilStatus;
	}

	public void setCibilStatus(String cibilStatus) {
		this.cibilStatus = cibilStatus;
	}

	@Override
	public String toString() {
		return "EnquiryCustomer [enquiryCustomerId=" + enquiryCustomerId + ", enquiryCustomerName="
				+ enquiryCustomerName + ", enquiryCustomerMobileNo=" + enquiryCustomerMobileNo
				+ ", enquiryCustomerEmailId=" + enquiryCustomerEmailId + ", enquiryCustomerAddress="
				+ enquiryCustomerAddress + ", enquiryCustomerUid=" + enquiryCustomerUid + ", enquiryCustomerPanNo="
				+ enquiryCustomerPanNo + ", enquiryCustomerDob=" + enquiryCustomerDob + ", status=" + status
				+ ", occupation=" + occupation + ", enquiryCustomerYearlyIncome=" + enquiryCustomerYearlyIncome
				+ ", cibilStatus=" + cibilStatus + "]";
	}
	

}

package com.ailiens.optimusprime.autobots.rest.dto.n3ow.v2.search;

import com.ailiens.optimusprime.domain.Accounts;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class CustomerDetails {
	private String customerName;
	private String mobileNumber;
	private String emailId;

	public CustomerDetails(Accounts accounts) {
		if (accounts != null) {
			String fullName = "";
			if (accounts.getFirstName() != null)
				fullName = fullName + accounts.getFirstName();
			if (accounts.getLastName() != null)
				fullName = fullName + " " + accounts.getLastName();
			this.customerName = fullName;
			this.mobileNumber = accounts.getPhoneNumber();
			this.emailId = accounts.getEmail();
		}
	}
	public CustomerDetails(){

	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}

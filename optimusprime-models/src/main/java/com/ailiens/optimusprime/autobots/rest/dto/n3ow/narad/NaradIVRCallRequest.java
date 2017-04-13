package com.ailiens.optimusprime.autobots.rest.dto.n3ow.narad;

import org.apache.commons.lang.builder.ToStringBuilder;

public class NaradIVRCallRequest {

	private String consignmentid;

	private String phoneno;

	private String fcid;

	public String getConsignmentid() {
		return consignmentid;
	}

	public void setConsignmentid(String consignmentid) {
		this.consignmentid = consignmentid;
	}

	public NaradIVRCallRequest(){

	}
	public String getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}

	public String getFcid() {
		return fcid;
	}

	public void setFcid(String fcid) {
		this.fcid = fcid;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

}

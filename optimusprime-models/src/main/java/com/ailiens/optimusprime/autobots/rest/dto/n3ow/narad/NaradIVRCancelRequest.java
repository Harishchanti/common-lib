package com.ailiens.optimusprime.autobots.rest.dto.n3ow.narad;

import org.apache.commons.lang.builder.ToStringBuilder;

public class NaradIVRCancelRequest {

	private String consignmentid;

	private String phoneno;

	public String getConsignmentid() {
		return consignmentid;
	}

	public void setConsignmentid(String consignmentid) {
		this.consignmentid = consignmentid;
	}
	public NaradIVRCancelRequest(){

	}

	public String getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

}

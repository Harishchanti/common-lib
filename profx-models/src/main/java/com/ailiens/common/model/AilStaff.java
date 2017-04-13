package com.ailiens.common.model;

import javax.validation.constraints.Pattern;
import java.io.Serializable;

public class AilStaff implements Serializable{

	/**
	 *
	 */
	private static final long serialVersionUID = 6322994332472385223L;
	private String storeID;
	@Pattern(regexp = "[0-9]{10}+")
    private String mobileNumber;
	private String landLineNumber;
	private String sapCode;
	private String designation;
	private String team;
	private String crmNumber;
	private String warehouseName;



	public String getStoreID() {
		return storeID;
	}

	public void setStoreID(String storeID) {
		this.storeID = storeID;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getLandLineNumber() {
		return landLineNumber;
	}

	public void setLandLineNumber(String landLineNumber) {
		this.landLineNumber = landLineNumber;
	}

	public String getSapCode() {
		return sapCode;
	}

	public void setSapCode(String sapCode) {
		this.sapCode = sapCode;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public String getCrmNumber() {
		return crmNumber;
	}

	public void setCrmNumber(String crmNumber) {
		this.crmNumber = crmNumber;
	}

	public String getWarehouseName() {
		return warehouseName;
	}

	public void setWarehouseName(String warehouseName) {
		this.warehouseName = warehouseName;
	}



}

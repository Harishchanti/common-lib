package com.ailiens.common.beans;

import org.mongodb.morphia.annotations.Id;

public class MappingsBean {

	@Id
	private String id;
	//id is secondaryColor

	private String secondaryColorHexCode;

	private String createdBy;

	private String createdTime;

	private String lastModifiedTime;

	private String lastModifiedBy;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSecondaryColorHexCode() {
		return secondaryColorHexCode;
	}

	public void setSecondaryColorHexCode(String secondaryColorHexCode) {
		this.secondaryColorHexCode = secondaryColorHexCode;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(String createdTime) {
		this.createdTime = createdTime;
	}

	public String getLastModifiedTime() {
		return lastModifiedTime;
	}

	public void setLastModifiedTime(String lastModifiedTime) {
		this.lastModifiedTime = lastModifiedTime;
	}

	public String getLastModifiedBy() {
		return lastModifiedBy;
	}

	public void setLastModifiedBy(String lastModifiedBy) {
		this.lastModifiedBy = lastModifiedBy;
	}


}

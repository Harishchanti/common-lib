package com.ailiens.common.beans;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.mongodb.morphia.annotations.Id;

@JsonDeserialize(as = EanStyleMappingBean.class)
public class EanStyleMappingBean  {

	@Id
	private String ean;
	private String styleId;
	private String createdBy;
	private String createdTime;
	private String lastModifiedTime;
	private String lastModifiedBy;

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
	public String getEan() {
		return ean;
	}
	public void setEan(String ean) {
		this.ean = ean;
	}
	public String getStyleId() {
		return styleId;
	}
	public void setStyleId(String styleId) {
		this.styleId = styleId;
	}
	public String getLastModifiedBy() {
		return lastModifiedBy;
	}
	public void setLastModifiedBy(String lastModifiedBy) {
		this.lastModifiedBy = lastModifiedBy;
	}


}

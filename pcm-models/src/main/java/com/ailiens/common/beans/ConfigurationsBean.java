package com.ailiens.common.beans;

import org.mongodb.morphia.annotations.Id;

import java.util.List;


public class ConfigurationsBean {

	private String createdBy;

	private String createdTime;

	private String lastModifiedTime;

	@Id
	private String id;

	private String legalBrandName;

	private List<String> options;

	private String channel;

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

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getLegalBrandName() {
		return legalBrandName;
	}

	public void setLegalBrandName(String legalBrandName) {
		this.legalBrandName = legalBrandName;
	}

	public List<String> getOptions() {
		return options;
	}

	public void setOptions(List<String> options) {
		this.options = options;
	}

	public String getChannel() {
		return channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
	}
}

package com.ailiens.common.beans;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Id;

import java.util.Map;

public class RequestResponseLogBean {
	@Id
	private ObjectId id;

	private String createdTime;

	private Map<String,Object> request;

	private String response;

	private String service;

	public ObjectId getId() {
		return id;
	}

	public void setId(ObjectId id) {
		this.id = id;
	}

	public String getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(String createdTime) {
		this.createdTime = createdTime;
	}

	public Map<String,Object> getRequest() {
		return request;
	}

	public void setRequest(Map<String,Object> request) {
		this.request = request;
	}

	public String getResponse() {
		return response;
	}

	public void setResponse(String response) {
		this.response = response;
	}

	public String getService() {
		return service;
	}

	public void setService(String service) {
		this.service = service;
	}
}

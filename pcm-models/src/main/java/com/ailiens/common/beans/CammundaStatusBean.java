package com.ailiens.common.beans;

import java.io.Serializable;


public class CammundaStatusBean implements Serializable{

	private String status;

	private String key;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}
}

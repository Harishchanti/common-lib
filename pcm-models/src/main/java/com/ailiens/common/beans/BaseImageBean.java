package com.ailiens.common.beans;

import java.util.List;
import java.util.Map;

public class BaseImageBean {

	private Map<String,String> approved;

	private Map<String,List<String>> available;

	public Map<String, String> getApproved() {
		return approved;
	}

	public void setApproved(Map<String, String> approved) {
		this.approved = approved;
	}

	public Map<String, List<String>> getAvailable() {
		return available;
	}

	public void setAvailable(Map<String, List<String>> available) {
		this.available = available;
	}

}

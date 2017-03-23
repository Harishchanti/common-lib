package com.ailiens.common.beans;

import org.mongodb.morphia.annotations.Embedded;

import java.util.Map;

@Embedded
public class Condition{

	private Map<String,Object> condition;

	public Map<String, Object> getCondition() {
		return condition;
	}

	public void setCondition(Map<String, Object> condition) {
		this.condition = condition;
	}


}

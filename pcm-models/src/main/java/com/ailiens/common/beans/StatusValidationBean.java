package com.ailiens.common.beans;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

import java.util.List;
import java.util.Map;

@Entity("statusvalidation")
public class StatusValidationBean {

	@Id
	private ObjectId id;

	private Map<String,Map<String,List<String>>> statusDetail;

	public Map<String, Map<String, List<String>>> getStatusDetail() {
		return statusDetail;
	}

	public void setStatusDetail(Map<String, Map<String, List<String>>> statusDetail) {
		this.statusDetail = statusDetail;
	}

}

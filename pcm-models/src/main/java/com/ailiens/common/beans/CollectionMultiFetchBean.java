package com.ailiens.common.beans;

import java.util.List;
import java.util.Map;

public class CollectionMultiFetchBean {

	private List<String> collectionIds;
	private Integer index;
	private Integer size;
	private List<String> requiredFields;
	private Map<String,Object> conditions;
	private Boolean completeResponse;

	public List<String> getCollectionIds() {
		return collectionIds;
	}
	public void setCollectionIds(List<String> collectionIds) {
		this.collectionIds = collectionIds;
	}
	public Integer getIndex() {
		return index;
	}
	public void setIndex(Integer index) {
		this.index = index;
	}
	public Integer getSize() {
		return size;
	}
	public void setSize(Integer size) {
		this.size = size;
	}
	public List<String> getRequiredFields() {
		return requiredFields;
	}
	public void setRequiredFields(List<String> requiredFields) {
		this.requiredFields = requiredFields;
	}
	public Map<String, Object> getConditions() {
		return conditions;
	}
	public void setConditions(Map<String, Object> conditions) {
		this.conditions = conditions;
	}
	public Boolean getCompleteResponse() {
		return completeResponse;
	}
	public void setCompleteResponse(Boolean completeResponse) {
		this.completeResponse = completeResponse;
	}

}

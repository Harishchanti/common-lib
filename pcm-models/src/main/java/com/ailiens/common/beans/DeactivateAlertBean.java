package com.ailiens.common.beans;

import java.util.List;

public class DeactivateAlertBean {

	private String styleId;

	private String deactivatedFlag;

	private List<String> lookIds;

	private List<String> collectionIds;

	public String getStyleId() {
		return styleId;
	}

	public void setStyleId(String styleId) {
		this.styleId = styleId;
	}

	public String getDeactivatedFlag() {
		return deactivatedFlag;
	}

	public void setDeactivatedFlag(String deactivatedFlag) {
		this.deactivatedFlag = deactivatedFlag;
	}

	public List<String> getLookIds() {
		return lookIds;
	}

	public void setLookIds(List<String> lookIds) {
		this.lookIds = lookIds;
	}

	public List<String> getCollectionIds() {
		return collectionIds;
	}

	public void setCollectionIds(List<String> collectionIds) {
		this.collectionIds = collectionIds;
	}

}

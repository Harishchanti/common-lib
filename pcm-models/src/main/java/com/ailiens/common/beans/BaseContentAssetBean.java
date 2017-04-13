package com.ailiens.common.beans;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Id;


public class BaseContentAssetBean extends BaseAssetBean {
	@Id
	private ObjectId id;
	private String assetType;
	private String value;
	private String locale;
	private String previousId;

	public ObjectId getId() {
		return id;
	}
	public void setId(ObjectId id) {
		this.id = id;
	}
	public String getAssetType() {
		return assetType;
	}
	public void setAssetType(String assetType) {
		this.assetType = assetType;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getLocale() {
		return locale;
	}
	public void setLocale(String locale) {
		this.locale = locale;
	}
	public String getPreviousId() {
		return previousId;
	}
	public void setPreviousId(String previousId) {
		this.previousId = previousId;
	}
}

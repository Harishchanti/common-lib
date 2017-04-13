package com.ailiens.common.beans;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Id;


public class BasePriceAssetBean extends BaseAssetBean{

	@Id
	private ObjectId id;
	private String assetType;
	private String location;
	private Double value;
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
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Double getValue() {
		return value;
	}
	public void setValue(Double value) {
		this.value = value;
	}
	public String getPreviousId() {
		return previousId;
	}
	public void setPreviousId(String previousId) {
		this.previousId = previousId;
	}
}

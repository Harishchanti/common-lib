package com.ailiens.common.beans;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Id;


public class BaseVideoAssetBean extends BaseAssetBean{

	@Id
	private ObjectId id;
	private String url;
	private String videoType;
	private String previousId;

	public ObjectId getId() {
		return id;
	}
	public void setId(ObjectId id) {
		this.id = id;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getVideoType() {
		return videoType;
	}
	public void setVideoType(String videoType) {
		this.videoType = videoType;
	}
	public String getPreviousId() {
		return previousId;
	}
	public void setPreviousId(String previousId) {
		this.previousId = previousId;
	}
}

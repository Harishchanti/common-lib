package com.ailiens.common.beans;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Id;

import java.util.List;
import java.util.Map;

@JsonDeserialize(as = LooksBaseInfoAssetBean.class)
public class LooksBaseInfoAssetBean extends BaseAssetBean implements BaseLooksAssetBean {

	@Id
	private ObjectId id;
	private String lookId;

	private Map<String,StylesInLooksBean> styleIds;
	private String lookSlot;
	private String name;
	private String story;
	private String description;
	private List<String> brand;
	private String url;
	private String urlPart;
	private String previousId;

	public ObjectId getId() {
		return id;
	}

	public void setId(ObjectId id) {
		this.id = id;
	}

	public String getLookId() {
		return lookId;
	}

	public void setLookId(String lookId) {
		this.lookId = lookId;
	}
	public Map<String, StylesInLooksBean> getStyleIds() {
		return styleIds;
	}

	public void setStyleIds(Map<String, StylesInLooksBean> styleIds) {
		this.styleIds = styleIds;
	}

	public String getPreviousId() {
		return previousId;
	}

	public void setPreviousId(String previousId) {
		this.previousId = previousId;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStory() {
		return story;
	}

	public void setStory(String story) {
		this.story = story;
	}

	public String getLookSlot() {
		return lookSlot;
	}

	public void setLookSlot(String lookSlot) {
		this.lookSlot = lookSlot;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<String> getBrand() {
		return brand;
	}

	public void setBrand(List<String> brand) {
		this.brand = brand;
	}

	public String getUrlPart() {
		return urlPart;
	}

	public void setUrlPart(String urlPart) {
		this.urlPart = urlPart;
	}


}

package com.ailiens.common.beans;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.mongodb.morphia.annotations.Id;

import java.util.List;
import java.util.Map;

@JsonDeserialize(as = LooksAssetBean.class)
@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class LooksAssetBean extends BaseAssetBean implements BaseLooksAssetBean {

	@Id
	private String id;
	private String lookId;
	private Map<String,StylesInLooksBean> styleIds;
	private String lookSlot;
	private String name;
	private String story;
	private String description;
	private List<String> brand;
	private String url;
	private String urlPart;
	private Map<String,String> images;
	private List<String> listOfStyleId;
	private String h1tag;
	private String metaDescription;
	private String pageTitle;


	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getLookId() {
		return lookId;
	}
	public void setLookId(String lookId) {
		this.lookId = lookId;
	}
	@Override
	public String getPreviousId() {
		// TODO Auto-generated method stub
		return null;
	}
	public Map<String, StylesInLooksBean> getStyleIds() {
		return styleIds;
	}
	public void setStyleIds(Map<String, StylesInLooksBean> styleIds) {
		this.styleIds = styleIds;
	}
	public String getLookSlot() {
		return lookSlot;
	}
	public void setLookSlot(String lookSlot) {
		this.lookSlot = lookSlot;
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
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getUrlPart() {
		return urlPart;
	}
	public void setUrlPart(String urlPart) {
		this.urlPart = urlPart;
	}
	public Map<String, String> getImages() {
		return images;
	}
	public void setImages(Map<String, String> images) {
		this.images = images;
	}
	public List<String> getListOfStyleId() {
		return listOfStyleId;
	}
	public void setListOfStyleId(List<String> listOfStyleId) {
		this.listOfStyleId = listOfStyleId;
	}
	public String getH1tag() {
		return h1tag;
	}
	public void setH1tag(String h1tag) {
		this.h1tag = h1tag;
	}
	public String getMetaDescription() {
		return metaDescription;
	}
	public void setMetaDescription(String metaDescription) {
		this.metaDescription = metaDescription;
	}
	public String getPageTitle() {
		return pageTitle;
	}
	public void setPageTitle(String pageTitle) {
		this.pageTitle = pageTitle;
	}

}

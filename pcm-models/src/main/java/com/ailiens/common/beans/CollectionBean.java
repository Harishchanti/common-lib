package com.ailiens.common.beans;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import org.hibernate.validator.constraints.NotEmpty;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

import java.util.List;
import java.util.Map;

@JsonInclude(Include.NON_NULL)
@Entity("collection")
public class CollectionBean extends BaseBean {

	@Id
	private String id;

	private String docType;

	@NotEmpty
	private String label;

	@NotEmpty
	private String collectionType;

	private List<String> styleIds;

	private Map<String,Object> filters;

	private List<String> otherCollections;

	private List<String> newArrivals;

	private String versionName;

	private String url;
	private String somUrl;
	private String urlPart;

	private String h1tag;

	private String metaDescription;

	private String pageTitle;

	private Map<String, CollectionBean> otherCollectionDetails;

	private String message;
	private Boolean success;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDocType() {
		return docType;
	}

	public void setDocType(String docType) {
		this.docType = docType;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getCollectionType() {
		return collectionType;
	}

	public void setCollectionType(String collectionType) {
		this.collectionType = collectionType;
	}

	public Map<String, Object> getFilters() {
		return filters;
	}

	public void setFilters(Map<String, Object> filters) {
		this.filters = filters;
	}

	public List<String> getStyleIds() {
		return styleIds;
	}

	public void setStyleIds(List<String> styleIds) {
		this.styleIds = styleIds;
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

	public List<String> getOtherCollections() {
		return otherCollections;
	}

	public void setOtherCollections(List<String> otherCollections) {
		this.otherCollections = otherCollections;
	}

	public List<String> getNewArrivals() {
		return newArrivals;
	}

	public void setNewArrivals(List<String> newArrivals) {
		this.newArrivals = newArrivals;
	}

	public String getSomUrl() {
		return somUrl;
	}

	public void setSomUrl(String somUrl) {
		this.somUrl = somUrl;
	}

	public Map<String, CollectionBean> getOtherCollectionDetails() {
		return otherCollectionDetails;
	}

	public void setOtherCollectionDetails(Map<String, CollectionBean> collectionBeanMap) {
		this.otherCollectionDetails = collectionBeanMap;
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

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Boolean getSuccess() {
		return success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getVersionName() {
		return versionName;
	}

	public void setVersionName(String versionName) {
		this.versionName = versionName;
	}
}

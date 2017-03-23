package com.ailiens.common.beans;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Id;

import javax.validation.constraints.Pattern;
import java.util.List;

@JsonDeserialize(as = BrandBaseInfoBean.class)
public class BrandBaseInfoBean extends BaseAssetBean implements BaseBrandAssetBean {

	@Id
	private ObjectId id;
	private String brandId;

	@Pattern(regexp="(Recommended|NNNOW Exclusive|Trending|New)")
	private String brandType;
	private String landingPageUrl;
	private String brandName;
	private String story;
	private String previousId;
	private String url;
	private String urlPart;
	private Boolean featuredBrand;
	private List<String> legalBrandName;
	private String parentBrand;
	private List<String> sapBrand;
	private String collectionId;

	public ObjectId getId() {
		return id;
	}
	public void setId(ObjectId id) {
		this.id = id;
	}
	public String getBrandId() {
		return brandId;
	}
	public void setBrandId(String brandId) {
		this.brandId = brandId;
	}
	public String getBrandType() {
		return brandType;
	}
	public void setBrandType(String brandType) {
		this.brandType = brandType;
	}
	public String getLandingPageUrl() {
		return landingPageUrl;
	}
	public void setLandingPageUrl(String landingPageUrl) {
		this.landingPageUrl = landingPageUrl;
	}
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public String getPreviousId() {
		return previousId;
	}
	public void setPreviousId(String previousId) {
		this.previousId = previousId;
	}
	public String getStory() {
		return story;
	}
	public void setStory(String story) {
		this.story = story;
	}
	public Boolean getFeaturedBrand() {
		return featuredBrand;
	}
	public void setFeaturedBrand(Boolean featuredBrand) {
		this.featuredBrand = featuredBrand;
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
	public List<String> getLegalBrandName() {
		return legalBrandName;
	}
	public void setLegalBrandName(List<String> legalBrandName) {
		this.legalBrandName = legalBrandName;
	}
	public List<String> getSapBrand() {
		return sapBrand;
	}
	public void setSapBrand(List<String> sapBrand) {
		this.sapBrand = sapBrand;
	}
	public String getCollectionId() {
		return collectionId;
	}
	public void setCollectionId(String collectionId) {
		this.collectionId = collectionId;
	}
	public String getParentBrand() {
		return parentBrand;
	}
	public void setParentBrand(String parentBrand) {
		this.parentBrand = parentBrand;
	}
}

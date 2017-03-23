package com.ailiens.common.beans;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.mongodb.morphia.annotations.Id;

import java.util.List;
import java.util.Map;


@JsonDeserialize(as = BrandAssetBean.class)
@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class BrandAssetBean extends BaseAssetBean implements BaseBrandAssetBean {

	@Id
	private String id;
	private String brandId;
	private String brandType;
	private String landingPageUrl;
	private String brandName;
	private String story;
	private String url;
	private String urlPart;
	private String somUrl;
	private Boolean featuredBrand;
	private List<String> legalBrandName;
	private List<String> sapBrand;
	private Map<String,String> images;
	private String collectionId;
	private String parentBrand;
	private String productListingUrl;
	private String previousId;
	private String h1tag;
	private String metaDescription;
	private String pageTitle;

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
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getBrandId() {
		return brandId;
	}
	public void setBrandId(String brandId) {
		this.brandId = brandId;
	}
	@Override
	public String getPreviousId() {
		// TODO Auto-generated method stub
		return null;
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
	public String getStory() {
		return story;
	}
	public void setStory(String story) {
		this.story = story;
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
	public Boolean getFeaturedBrand() {
		return featuredBrand;
	}
	public void setFeaturedBrand(Boolean featuredBrand) {
		this.featuredBrand = featuredBrand;
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
	public Map<String, String> getImages() {
		return images;
	}
	public void setImages(Map<String, String> images) {
		this.images = images;
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
	public String getSomUrl() {
		return somUrl;
	}
	public void setSomUrl(String somUrl) {
		this.somUrl = somUrl;
	}
	public void setPreviousId(String previousId) {
		this.previousId = previousId;
	}
	public String getProductListingUrl() {
		return productListingUrl;
	}
	public void setProductListingUrl(String productListingUrl) {
		this.productListingUrl = productListingUrl;
	}
}

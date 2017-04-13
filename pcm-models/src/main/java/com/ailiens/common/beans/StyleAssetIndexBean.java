package com.ailiens.common.beans;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.util.List;
import java.util.Map;

@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class StyleAssetIndexBean implements BaseStyleBean {

	private String styleId;

	private String baseProduct;

	private String vendorArticleNumber;

	private String vendorArticleName;

	private String brand;

	private String ageGroup;

	private String baseColor;

	private String fashionType;

	private String year;

	private String washCare;

	private String primaryImage;

	private Map<String,String> images;

	private String name;

	private String story;

	private List<String> finerDetails;
	private String compositionAndCare;

	private Double price;


	private List<String> color;

	private List<String> usage;

	private List<String> season;

	private List<String> campaign;

	private List<String> material;

	private List<String> occasion;

	private List<String> sizes;

	private List<String> categories;

	private Map<String,Object> specificAttributes;

	private String url;

	public String getStyleId() {
		return styleId;
	}

	public void setStyleId(String styleId) {
		this.styleId = styleId;
	}

	public String getBaseProduct() {
		return baseProduct;
	}

	public void setBaseProduct(String baseProduct) {
		this.baseProduct = baseProduct;
	}

	public String getVendorArticleNumber() {
		return vendorArticleNumber;
	}

	public void setVendorArticleNumber(String vendorArticleNumber) {
		this.vendorArticleNumber = vendorArticleNumber;
	}

	public String getVendorArticleName() {
		return vendorArticleName;
	}

	public void setVendorArticleName(String vendorArticleName) {
		this.vendorArticleName = vendorArticleName;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getAgeGroup() {
		return ageGroup;
	}

	public void setAgeGroup(String ageGroup) {
		this.ageGroup = ageGroup;
	}

	public String getBaseColor() {
		return baseColor;
	}

	public void setBaseColor(String baseColor) {
		this.baseColor = baseColor;
	}

	public String getFashionType() {
		return fashionType;
	}

	public void setFashionType(String fashionType) {
		this.fashionType = fashionType;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getWashCare() {
		return washCare;
	}

	public void setWashCare(String washCare) {
		this.washCare = washCare;
	}

	public String getPrimaryImage() {
		return primaryImage;
	}

	public void setPrimaryImage(String primaryImage) {
		this.primaryImage = primaryImage;
	}

	public Map<String, String> getImages() {
		return images;
	}

	public void setImages(Map<String, String> images) {
		this.images = images;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getColor() {
		return color;
	}

	public void setColor(List<String> color) {
		this.color = color;
	}

	public List<String> getUsage() {
		return usage;
	}

	public void setUsage(List<String> usage) {
		this.usage = usage;
	}

	public List<String> getSeason() {
		return season;
	}

	public void setSeason(List<String> season) {
		this.season = season;
	}

	public List<String> getCampaign() {
		return campaign;
	}

	public void setCampaign(List<String> campaign) {
		this.campaign = campaign;
	}

	public List<String> getMaterial() {
		return material;
	}

	public void setMaterial(List<String> material) {
		this.material = material;
	}

	public List<String> getOccasion() {
		return occasion;
	}

	public void setOccasion(List<String> occasion) {
		this.occasion = occasion;
	}

	public List<String> getSizes() {
		return sizes;
	}

	public void setSizes(List<String> sizes) {
		this.sizes = sizes;
	}

	public Map<String, Object> getSpecificAttributes() {
		return specificAttributes;
	}

	public void setSpecificAttributes(Map<String, Object> specificAttributes) {
		this.specificAttributes = specificAttributes;
	}

	public String getStory() {
		return story;
	}

	public void setStory(String story) {
		this.story = story;
	}

	public List<String> getFinerDetails() {
		return finerDetails;
	}

	public void setFinerDetails(List<String> finerDetails) {
		this.finerDetails = finerDetails;
	}

	public String getCompositionAndCare() {
		return compositionAndCare;
	}

	public void setCompositionAndCare(String compositionAndCare) {
		this.compositionAndCare = compositionAndCare;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public List<String> getCategories() {
		return categories;
	}

	public void setCategories(List<String> categories) {
		this.categories = categories;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
}

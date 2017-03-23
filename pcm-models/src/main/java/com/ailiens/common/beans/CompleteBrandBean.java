package com.ailiens.common.beans;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.util.List;
import java.util.Map;

@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class CompleteBrandBean extends BaseAssetBean{

	private String brandId;
	private BrandAssetBean brand;
	private List<BrandBaseInfoBean> baseInfomation;

	private Map<String,List<BrandContentAssetBean>> content;
	private Map<String,List<BrandImageAssetBean>> images;
	private Map<String,List<BrandVideoBean>> videos;

	public String getBrandId() {
		return brandId;
	}
	public void setBrandId(String brandId) {
		this.brandId = brandId;
	}
	public BrandAssetBean getBrand() {
		return brand;
	}
	public void setBrand(BrandAssetBean brand) {
		this.brand = brand;
	}
	public List<BrandBaseInfoBean> getBaseInfomation() {
		return baseInfomation;
	}
	public void setBaseInfomation(List<BrandBaseInfoBean> baseInfomation) {
		this.baseInfomation = baseInfomation;
	}
	public Map<String, List<BrandContentAssetBean>> getContent() {
		return content;
	}
	public void setContent(Map<String, List<BrandContentAssetBean>> content) {
		this.content = content;
	}
	public Map<String, List<BrandImageAssetBean>> getImages() {
		return images;
	}
	public void setImages(Map<String, List<BrandImageAssetBean>> images) {
		this.images = images;
	}
	public Map<String, List<BrandVideoBean>> getVideos() {
		return videos;
	}
	public void setVideos(Map<String, List<BrandVideoBean>> videos) {
		this.videos = videos;
	}
}

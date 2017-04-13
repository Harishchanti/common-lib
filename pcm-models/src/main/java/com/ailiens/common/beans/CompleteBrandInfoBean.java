package com.ailiens.common.beans;

import java.util.Map;

public class CompleteBrandInfoBean {
	private String brandId;
	private BrandAssetBean brand;
	private Map<String,BrandBaseInfoBean> baseInfomation;

	private Map<String,Map<String,BrandImageAssetBean>> images;

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

	public Map<String, BrandBaseInfoBean> getBaseInfomation() {
		return baseInfomation;
	}

	public void setBaseInfomation(Map<String, BrandBaseInfoBean> baseInfomation) {
		this.baseInfomation = baseInfomation;
	}

	public Map<String, Map<String, BrandImageAssetBean>> getImages() {
		return images;
	}

	public void setImages(Map<String, Map<String, BrandImageAssetBean>> images) {
		this.images = images;
	}
}

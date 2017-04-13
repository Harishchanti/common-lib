package com.ailiens.common.beans;

public class BrandVideoBean extends BaseVideoAssetBean implements BaseBrandAssetBean {

	private String brandId;

	public String getBrandId() {
		return brandId;
	}

	public void setBrandId(String brandId) {
		this.brandId = brandId;
	}
}

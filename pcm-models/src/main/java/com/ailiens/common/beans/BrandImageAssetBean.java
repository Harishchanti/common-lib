package com.ailiens.common.beans;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;


@JsonDeserialize(as = BrandImageAssetBean.class)
public class BrandImageAssetBean extends BaseImageAssetBean implements BaseBrandAssetBean {

	private String brandId;

	public String getBrandId() {
		return brandId;
	}

	public void setBrandId(String brandId) {
		this.brandId = brandId;
	}
}

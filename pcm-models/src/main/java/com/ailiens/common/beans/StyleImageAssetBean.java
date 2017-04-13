package com.ailiens.common.beans;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;


@JsonDeserialize(as = StyleImageAssetBean.class)
public class StyleImageAssetBean extends BaseImageAssetBean implements BaseStyleAssetBean {

	private String styleId;

	public String getStyleId() {
		return styleId;
	}

	public void setStyleId(String styleId) {
		this.styleId = styleId;
	}

}

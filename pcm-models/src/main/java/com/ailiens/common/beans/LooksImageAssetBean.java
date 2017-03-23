package com.ailiens.common.beans;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;


@JsonDeserialize(as = LooksImageAssetBean.class)
public class LooksImageAssetBean extends BaseImageAssetBean implements BaseLooksAssetBean {

	private String lookId;

	public String getLookId() {
		return lookId;
	}
	public void setLookId(String lookId) {
		this.lookId = lookId;
	}
}

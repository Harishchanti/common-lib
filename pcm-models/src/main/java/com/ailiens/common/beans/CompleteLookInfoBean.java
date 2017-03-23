package com.ailiens.common.beans;

import java.util.Map;

public class CompleteLookInfoBean {
	private String lookId;
	private LooksAssetBean look;
	private Map<String,LooksBaseInfoAssetBean> baseInfomation;
	private Map<String,Map<String,LooksImageAssetBean>> images;

	public String getLookId() {
		return lookId;
	}

	public void setLookId(String lookId) {
		this.lookId = lookId;
	}

	public LooksAssetBean getLook() {
		return look;
	}

	public void setLook(LooksAssetBean look) {
		this.look = look;
	}

	public Map<String, LooksBaseInfoAssetBean> getBaseInfomation() {
		return baseInfomation;
	}

	public void setBaseInfomation(Map<String, LooksBaseInfoAssetBean> baseInfomation) {
		this.baseInfomation = baseInfomation;
	}

	public Map<String, Map<String, LooksImageAssetBean>> getImages() {
		return images;
	}

	public void setImages(Map<String, Map<String, LooksImageAssetBean>> images) {
		this.images = images;
	}
}

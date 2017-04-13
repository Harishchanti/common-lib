package com.ailiens.common.beans;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.util.List;
import java.util.Map;

@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class CompleteLooksBean extends BaseAssetBean{

	private String lookId;
	private LooksAssetBean look;
	private List<LooksBaseInfoAssetBean> baseInfomation;

	private Map<String,List<LooksContentAssetBean>> content;
	private Map<String,List<LooksImageAssetBean>> images;
	private Map<String,List<LooksVideoAssetBean>> videos;
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
	public List<LooksBaseInfoAssetBean> getBaseInfomation() {
		return baseInfomation;
	}
	public void setBaseInfomation(List<LooksBaseInfoAssetBean> baseInfomation) {
		this.baseInfomation = baseInfomation;
	}
	public Map<String, List<LooksContentAssetBean>> getContent() {
		return content;
	}
	public void setContent(Map<String, List<LooksContentAssetBean>> content) {
		this.content = content;
	}
	public Map<String, List<LooksImageAssetBean>> getImages() {
		return images;
	}
	public void setImages(Map<String, List<LooksImageAssetBean>> images) {
		this.images = images;
	}
	public Map<String, List<LooksVideoAssetBean>> getVideos() {
		return videos;
	}
	public void setVideos(Map<String, List<LooksVideoAssetBean>> videos) {
		this.videos = videos;
	}
}

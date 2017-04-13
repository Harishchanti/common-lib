package com.ailiens.common.beans;

import java.util.Map;

public class CompleteStyleInfoBean {

	private String styleId;
	private StyleAssetBean style;
	private Map<String,StyleBaseInfoAssetBean> baseInfomation;

	private Map<String,SizeChartAssetBean> sizeCharts;
	private Map<String,StyleCrossSellInfoAssetBean> crossSellInfo;
	private Map<String,StyleMargineAssetBean> margins;
	private Map<String,Map<String,StyleContentAssetBean>> content;
	private Map<String,Map<String,StyleImageAssetBean>> images;
	private Map<String,Map<String,StyleVideoAssetBean>> videos;
	private Map<String,Map<String,StylePriceAssetBean>> price;
	public String getStyleId() {
		return styleId;
	}
	public void setStyleId(String styleId) {
		this.styleId = styleId;
	}
	public StyleAssetBean getStyle() {
		return style;
	}
	public void setStyle(StyleAssetBean style) {
		this.style = style;
	}
	public Map<String, StyleBaseInfoAssetBean> getBaseInfomation() {
		return baseInfomation;
	}
	public void setBaseInfomation(Map<String, StyleBaseInfoAssetBean> baseInfomation) {
		this.baseInfomation = baseInfomation;
	}
	public Map<String, Map<String, StyleContentAssetBean>> getContent() {
		return content;
	}
	public void setContent(Map<String, Map<String, StyleContentAssetBean>> content) {
		this.content = content;
	}
	public Map<String, Map<String, StyleImageAssetBean>> getImages() {
		return images;
	}
	public void setImages(Map<String, Map<String, StyleImageAssetBean>> images) {
		this.images = images;
	}
	public Map<String, Map<String, StyleVideoAssetBean>> getVideos() {
		return videos;
	}
	public void setVideos(Map<String, Map<String, StyleVideoAssetBean>> videos) {
		this.videos = videos;
	}
	public Map<String, Map<String, StylePriceAssetBean>> getPrice() {
		return price;
	}
	public void setPrice(Map<String, Map<String, StylePriceAssetBean>> price) {
		this.price = price;
	}
	public Map<String, SizeChartAssetBean> getSizeCharts() {
		return sizeCharts;
	}
	public void setSizeCharts(Map<String, SizeChartAssetBean> sizeCharts) {
		this.sizeCharts = sizeCharts;
	}
	public Map<String, StyleMargineAssetBean> getMargins() {
		return margins;
	}
	public void setMargins(Map<String, StyleMargineAssetBean> margins) {
		this.margins = margins;
	}
	public Map<String, StyleCrossSellInfoAssetBean> getCrossSellInfo() {
		return crossSellInfo;
	}
	public void setCrossSellInfo(
			Map<String, StyleCrossSellInfoAssetBean> crossSellInfo) {
		this.crossSellInfo = crossSellInfo;
	}

}

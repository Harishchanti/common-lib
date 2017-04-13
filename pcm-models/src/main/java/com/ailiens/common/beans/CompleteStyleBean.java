package com.ailiens.common.beans;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.util.List;
import java.util.Map;

@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class CompleteStyleBean extends BaseAssetBean{

	private String styleId;
	private StyleAssetBean style;
	private List<StyleBaseInfoAssetBean> baseInfomation;

	private Map<String,List<StyleMargineAssetBean>> margine;
	private Map<String,List<StyleContentAssetBean>> content;
	private Map<String,List<SizeChartAssetBean>> sizeCharts;
	private Map<String,List<StyleCrossSellInfoAssetBean>> crossSellInfo;
	private Map<String,List<StyleImageAssetBean>> images;
	private Map<String,List<StyleVideoAssetBean>> videos;
	private Map<String,List<StylePriceAssetBean>> price;

	public String getStyleId() {
		return styleId;
	}
	public void setStyleId(String styleId) {
		this.styleId = styleId;
	}
	public StyleAssetBean getStyle() {
		return style;
	}
	public void setStyle(StyleAssetBean styleBean) {
		this.style = styleBean;
	}
	public List<StyleBaseInfoAssetBean> getBaseInfomation() {
		return baseInfomation;
	}
	public void setBaseInfomation(List<StyleBaseInfoAssetBean> baseInfomation) {
		this.baseInfomation = baseInfomation;
	}
	public Map<String, List<StyleContentAssetBean>> getContent() {
		return content;
	}
	public void setContent(Map<String, List<StyleContentAssetBean>> content) {
		this.content = content;
	}
	public Map<String, List<StyleImageAssetBean>> getImages() {
		return images;
	}
	public void setImages(Map<String, List<StyleImageAssetBean>> images) {
		this.images = images;
	}
	public Map<String, List<StyleVideoAssetBean>> getVideos() {
		return videos;
	}
	public void setVideos(Map<String, List<StyleVideoAssetBean>> videos) {
		this.videos = videos;
	}
	public Map<String, List<StylePriceAssetBean>> getPrice() {
		return price;
	}
	public void setPrice(Map<String, List<StylePriceAssetBean>> price) {
		this.price = price;
	}
	public Map<String, List<SizeChartAssetBean>> getSizeCharts() {
		return sizeCharts;
	}
	public void setSizeCharts(Map<String, List<SizeChartAssetBean>> sizeCharts) {
		this.sizeCharts = sizeCharts;
	}
	public Map<String, List<StyleMargineAssetBean>> getMargine() {
		return margine;
	}
	public void setMargine(Map<String, List<StyleMargineAssetBean>> margine) {
		this.margine = margine;
	}
	public Map<String, List<StyleCrossSellInfoAssetBean>> getCrossSellInfo() {
		return crossSellInfo;
	}
	public void setCrossSellInfo(Map<String, List<StyleCrossSellInfoAssetBean>> crossSellInfo) {
		this.crossSellInfo = crossSellInfo;
	}
}

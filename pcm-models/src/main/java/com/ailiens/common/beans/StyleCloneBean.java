package com.ailiens.common.beans;

import java.util.List;

public class StyleCloneBean {

	public String sourceStyleId;
	public List<String> destinationStyleIds;
	public boolean baseInfoAsset;
	public boolean sizeChartAsset;
	public boolean imageAsset;
	public boolean videoAsset;

	public String getSourceStyleId() {
		return sourceStyleId;
	}
	public void setSourceStyleId(String sourceStyleId) {
		this.sourceStyleId = sourceStyleId;
	}
	public List<String> getDestinationStyleIds() {
		return destinationStyleIds;
	}
	public void setDestinationStyleIds(List<String> destinationStyleIds) {
		this.destinationStyleIds = destinationStyleIds;
	}
	public boolean isBaseInfoAsset() {
		return baseInfoAsset;
	}
	public void setBaseInfoAsset(boolean baseInfoAsset) {
		this.baseInfoAsset = baseInfoAsset;
	}
	public boolean isSizeChartAsset() {
		return sizeChartAsset;
	}
	public void setSizeChartAsset(boolean sizeChartAsset) {
		this.sizeChartAsset = sizeChartAsset;
	}
	public boolean isImageAsset() {
		return imageAsset;
	}
	public void setImageAsset(boolean imageAsset) {
		this.imageAsset = imageAsset;
	}
	public boolean isVideoAsset() {
		return videoAsset;
	}
	public void setVideoAsset(boolean videoAsset) {
		this.videoAsset = videoAsset;
	}

}

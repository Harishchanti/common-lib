package com.ailiens.common.beans;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize(as = NickFuryResponseBean.class)
public class NickFuryResponseBean {

	private String sapBrand;
	private String sapStyleId;
	private String secondarySize;
	private String level1;
	private String level2;
	private String level3;
	private String baseColor;
	private String styleId;
	private String message;
	private Boolean success;
	public String getSapBrand() {
		return sapBrand;
	}
	public void setSapBrand(String sapBrand) {
		this.sapBrand = sapBrand;
	}
	public String getSapStyleId() {
		return sapStyleId;
	}
	public void setSapStyleId(String sapStyleId) {
		this.sapStyleId = sapStyleId;
	}
	public String getSecondarySize() {
		return secondarySize;
	}
	public void setSecondarySize(String secondarySize) {
		this.secondarySize = secondarySize;
	}
	public String getLevel1() {
		return level1;
	}
	public void setLevel1(String level1) {
		this.level1 = level1;
	}
	public String getLevel2() {
		return level2;
	}
	public void setLevel2(String level2) {
		this.level2 = level2;
	}
	public String getLevel3() {
		return level3;
	}
	public void setLevel3(String level3) {
		this.level3 = level3;
	}
	public String getBaseColor() {
		return baseColor;
	}
	public void setBaseColor(String baseColor) {
		this.baseColor = baseColor;
	}
	public String getStyleId() {
		return styleId;
	}
	public void setStyleId(String styleId) {
		this.styleId = styleId;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Boolean getSuccess() {
		return success;
	}
	public void setSuccess(Boolean success) {
		this.success = success;
	}
}

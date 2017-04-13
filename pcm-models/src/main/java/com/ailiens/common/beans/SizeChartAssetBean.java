package com.ailiens.common.beans;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Id;

@JsonDeserialize(as = SizeChartAssetBean.class)
public class SizeChartAssetBean extends BaseAssetBean implements BaseStyleAssetBean {

	@Id
	private ObjectId id;
	private String sizeChartId;
	private String styleId;
	private String previousId;

	public ObjectId getId() {
		return id;
	}

	public void setId(ObjectId id) {
		this.id = id;
	}

	public String getSizeChartId() {
		return sizeChartId;
	}

	public void setSizeChartId(String sizeChartId) {
		this.sizeChartId = sizeChartId;
	}

	public String getStyleId() {
		return styleId;
	}

	public void setStyleId(String styleId) {
		this.styleId = styleId;
	}

	@Override
	public String getPreviousId() {
		return previousId;
	}

	public void setPreviousId(String previousId) {
		this.previousId = previousId;
	}
}

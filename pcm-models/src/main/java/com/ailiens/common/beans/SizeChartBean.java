package com.ailiens.common.beans;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

import java.util.List;
import java.util.Map;

@JsonInclude(Include.NON_NULL)
@Entity("sizeChart")
public class SizeChartBean extends BaseBean implements BaseSizeChartBean {

	@Id
	private String sizeChartId;

	private String docType;

	private String brand;

	private String name;

	private Map<String,List<List<SizeMeasurementBean>>> measurements;

	private String imageUrl;

	public String getSizeChartId() {
		return sizeChartId;
	}

	public void setSizeChartId(String sizeChartId) {
		this.sizeChartId = sizeChartId;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getDocType() {
		return docType;
	}

	public void setDocType(String docType) {
		this.docType = docType;
	}

	public Map<String, List<List<SizeMeasurementBean>>> getMeasurements() {
		return measurements;
	}

	public void setMeasurements(
			Map<String, List<List<SizeMeasurementBean>>> measurements) {
		this.measurements = measurements;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
}

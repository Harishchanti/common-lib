package com.ailiens.common;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * A EanData DTO
 */

public class EanDataDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	@NotNull
	//@JsonProperty("skuId")
	private String ean;

	@JsonIgnore
	private String id;

	@NotNull
	private String styleId;

	private String sapStyleId;

	private String sapSkuId;

	private String skuId;

	private String size;

	private String sizeAttribute;

	@NotNull
	@DecimalMin("0.0")
	private Double mrp;

	private Double tradeSp;

	private Double grossSP;

	private String taxClass;

	private String ageGroup;

	private String pdpSize;

	private String sapSize;

	private String sapSizeAttribute;

	private Long eventId;

	private List<FCInventorySearch> fCInventorys = new ArrayList<FCInventorySearch>();

	public String getStyleId() {
		return styleId;
	}

	public void setStyleId(String styleId) {
		this.styleId = styleId;
	}

	public String getSapStyleId() {
		return sapStyleId;
	}

	public void setSapStyleId(String sapStyleId) {
		this.sapStyleId = sapStyleId;
	}

	public String getSapSkuId() {
		return sapSkuId;
	}

	public void setSapSkuId(String sapSkuId) {
		this.sapSkuId = sapSkuId;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getSizeAttribute() {
		return sizeAttribute;
	}

	public void setSizeAttribute(String sizeAttribute) {
		this.sizeAttribute = sizeAttribute;
	}

	public Double getMrp() {
		return mrp;
	}

	public void setMrp(Double mrp) {
		this.mrp = mrp;
	}

	public Double getTradeSp() {
		return tradeSp;
	}

	public void setTradeSp(Double tradeSp) {
		this.tradeSp = tradeSp;
		this.grossSP = tradeSp;
	}

	public String getTaxClass() {
		return taxClass;
	}

	public void setTaxClass(String taxClass) {
		this.taxClass = taxClass;
	}

	public String getAgeGroup() {
		return ageGroup;
	}

	public void setAgeGroup(String ageGroup) {
		this.ageGroup = ageGroup;
	}

	public String getPdpSize() {
		return pdpSize;
	}

	public void setPdpSize(String pdpSize) {
		this.pdpSize = pdpSize;
	}

	public String getSapSize() {
		return sapSize;
	}

	public void setSapSize(String sapSize) {
		this.sapSize = sapSize;
	}

	public String getSapSizeAttribute() {
		return sapSizeAttribute;
	}

	public void setSapSizeAttribute(String sapSizeAttribute) {
		this.sapSizeAttribute = sapSizeAttribute;
	}

	public String getEan() {
		return ean;
	}

	public void setEan(String ean) {
		this.ean = ean;
		this.skuId = ean;
	}

	public Long getEventId() {
		return eventId;
	}

	public void setEventId(Long eventId) {
		this.eventId = eventId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ean == null) ? 0 : ean.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EanDataDTO other = (EanDataDTO) obj;
		if (ean == null) {
			if (other.ean != null)
				return false;
		} else if (!ean.equals(other.ean))
			return false;
		return true;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public List<FCInventorySearch> getfCInventorys() {
		return fCInventorys;
	}

	public void setfCInventorys(List<FCInventorySearch> fCInventory) {
		this.fCInventorys = fCInventory;
	}

	public String getSkuId() {
		return skuId;
	}

	public void setSkuId(String skuId) {
		//this.skuId = skuId;
	}

	public Double getGrossSP() {
		return grossSP;
	}

	public void setGrossSP(Double grossSP) {
		this.grossSP = grossSP;
		this.tradeSp =  grossSP;
	}

	@Override
	public String toString() {
		return "EanDataDTO [ean=" + ean + ", id=" + id + ", styleId=" + styleId + ", sapStyleId=" + sapStyleId
				+ ", sapSkuId=" + sapSkuId + ", size=" + size + ", sizeAttribute=" + sizeAttribute + ", mrp=" + mrp
				+ ", tradeSp=" + tradeSp + ", taxClass=" + taxClass + ", ageGroup=" + ageGroup + ", pdpSize=" + pdpSize
				+ ", sapSize=" + sapSize + ", sapSizeAttribute=" + sapSizeAttribute + ", eventId=" + eventId
				+ ", fCInventory=" + fCInventorys + "]";
	}

}

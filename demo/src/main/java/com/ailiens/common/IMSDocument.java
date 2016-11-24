package com.ailiens.common;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class IMSDocument {

	private String skuId;
	private String sapSkuId;
	private String styleId;
	private String taxClass;
	private Integer quantity;
	private Double mrp;
	private Double grossSP;
	private String ageGroup;
	private String size;
	private String pdpSize;
	private List<String> promotions;
	private List<String> fcsWithInventory;
	private List<FCInventory> fcinventorys;

	public String getSkuId() {
		return skuId;
	}

	public void setSkuId(String skuId) {
		this.skuId = skuId;
	}

	public String getSapSkuId() {
		return sapSkuId;
	}

	public void setSapSkuId(String sapSkuId) {
		this.sapSkuId = sapSkuId;
	}

	public String getStyleId() {
		return styleId;
	}

	public void setStyleId(String styleId) {
		this.styleId = styleId;
	}

	public String getTaxClass() {
		return taxClass;
	}

	public void setTaxClass(String taxClass) {
		this.taxClass = taxClass;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getMrp() {
		return mrp;
	}

	public void setMrp(Double mrp) {
		this.mrp = mrp;
	}

	public Double getGrossSP() {
		return grossSP;
	}

	public void setGrossSP(Double grossSP) {
		this.grossSP = grossSP;
	}

	public String getAgeGroup() {
		return ageGroup;
	}

	public void setAgeGroup(String ageGroup) {
		this.ageGroup = ageGroup;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getPdpSize() {
		return pdpSize;
	}

	public void setPdpSize(String pdpSize) {
		this.pdpSize = pdpSize;
	}

	public List<String> getPromotions() {
		return promotions;
	}

	public void setPromotions(List<String> promotions) {
		this.promotions = promotions;
	}

	public List<String> getFcsWithInventory() {
		return fcsWithInventory;
	}

	public void setFcsWithInventory(List<String> fcsWithInventory) {
		this.fcsWithInventory = fcsWithInventory;
	}

	public List<FCInventory> getFcinventorys() {
		return fcinventorys;
	}

	public void setFcinventorys(List<FCInventory> fcinventorys) {
		this.fcinventorys = fcinventorys;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("IMSDocument [");
		if (skuId != null)
			builder.append("skuId=").append(skuId).append(", ");
		if (sapSkuId != null)
			builder.append("sapSkuId=").append(sapSkuId).append(", ");
		if (styleId != null)
			builder.append("styleId=").append(styleId).append(", ");
		if (taxClass != null)
			builder.append("taxClass=").append(taxClass).append(", ");
		if (quantity != null)
			builder.append("quantity=").append(quantity).append(", ");
		if (mrp != null)
			builder.append("mrp=").append(mrp).append(", ");
		if (grossSP != null)
			builder.append("grossSP=").append(grossSP).append(", ");
		if (ageGroup != null)
			builder.append("ageGroup=").append(ageGroup).append(", ");
		if (size != null)
			builder.append("size=").append(size).append(", ");
		if (pdpSize != null)
			builder.append("pdpSize=").append(pdpSize).append(", ");
		if (promotions != null)
			builder.append("promotions=").append(promotions).append(", ");
		if (fcinventorys != null)
			builder.append("fcinventorys=").append(fcinventorys);
		builder.append("]");
		return builder.toString();
	}

}

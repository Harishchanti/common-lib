package com.ailiens.optimusprime.autobots.rest.dto.n3ow.v2.search;

import com.ailiens.optimusprime.domain.MBOProduct;
import com.ailiens.optimusprime.domain.OrderLine;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.math.BigDecimal;

public class ItemDetailsV2DTO {
	private String itemId;
	private String itemStatus;
	private String huCode;
	private String sapOrderNo;
	private String description;
	private String skuId;
	private String color;
	private String size;
	private String brand;
	private BigDecimal mrp;
	private String eanCode;
	private String category1;
	private String category2;
	private String category3;
	private String image;
	private String styleId;
	private String sapStyleId;

	public ItemDetailsV2DTO(OrderLine orderLine, MBOProduct mboProduct) {
		if (orderLine != null) {
			this.itemId = orderLine.getOrderLineId();
			if (orderLine.getOrderLineStates() != null)
				this.itemStatus = orderLine.getOrderLineStates().getName();
			this.huCode = orderLine.getWarehoueItemId();
			this.sapOrderNo = orderLine.getSapOrderNo();
		}
		if (mboProduct != null) {
			this.description = mboProduct.getDescription();
			this.skuId = mboProduct.getSku();
			this.color = mboProduct.getColor();
			this.size = mboProduct.getSize();
			this.brand = mboProduct.getBrand();
			this.mrp = mboProduct.getMrp();
			this.eanCode = mboProduct.getEanCode();
			this.category1 = mboProduct.getCategory1();
			this.category2 = mboProduct.getCategory2();
			this.category3 = mboProduct.getCategory3();
			this.image = mboProduct.getImage();
			this.styleId = mboProduct.getStyleId();
			this.sapStyleId = mboProduct.getSapStyleId();
		}
	}
	public ItemDetailsV2DTO()
	{

	}

	public String getItemId() {
		return itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getHuCode() {
		return huCode;
	}

	public void setHuCode(String huCode) {
		this.huCode = huCode;
	}

	public String getSapOrderNo() {
		return sapOrderNo;
	}

	public void setSapOrderNo(String sapOrderNo) {
		this.sapOrderNo = sapOrderNo;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getSkuId() {
		return skuId;
	}

	public void setSkuId(String skuId) {
		this.skuId = skuId;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public BigDecimal getMrp() {
		return mrp;
	}

	public void setMrp(BigDecimal mrp) {
		this.mrp = mrp;
	}

	public String getEanCode() {
		return eanCode;
	}

	public void setEanCode(String eanCode) {
		this.eanCode = eanCode;
	}

	public String getCategory1() {
		return category1;
	}

	public void setCategory1(String category1) {
		this.category1 = category1;
	}

	public String getCategory2() {
		return category2;
	}

	public void setCategory2(String category2) {
		this.category2 = category2;
	}

	public String getCategory3() {
		return category3;
	}

	public void setCategory3(String category3) {
		this.category3 = category3;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

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

	public String getItemStatus() {
		return itemStatus;
	}

	public void setItemStatus(String itemStatus) {
		this.itemStatus = itemStatus;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}

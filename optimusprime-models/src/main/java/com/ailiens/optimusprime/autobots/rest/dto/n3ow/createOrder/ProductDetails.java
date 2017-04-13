
package com.ailiens.optimusprime.autobots.rest.dto.n3ow.createOrder;

import java.math.BigDecimal;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class ProductDetails {

	private String skuId;
	private String color;
	private String size;
	private String brand;
	private BigDecimal mrp;
	private BigDecimal grossSP;
	private String styleId;
	private String category1;
	private String category2;
	private String category3;
	private String image;
	private String description;
	private String eanCode;
	private String sapStyleId;

	/**
	 *
	 * @return
	 *     The skuId
	 */
	public String getSkuId() {
		return skuId;
	}

	public ProductDetails(){

	}
	/**
	 *
	 * @param skuId
	 *     The skuId
	 */
	public void setSkuId(String skuId) {
		this.skuId = skuId;
	}

	/**
	 *
	 * @return
	 *     The color
	 */
	public String getColor() {
		return color;
	}

	/**
	 *
	 * @param color
	 *     The color
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 *
	 * @return
	 *     The size
	 */
	public String getSize() {
		return size;
	}

	/**
	 *
	 * @param size
	 *     The size
	 */
	public void setSize(String size) {
		this.size = size;
	}

	/**
	 *
	 * @return
	 *     The brand
	 */
	public String getBrand() {
		return brand;
	}

	/**
	 *
	 * @param brand
	 *     The brand
	 */
	public void setBrand(String brand) {
		this.brand = brand;
	}

	/**
	 *
	 * @return
	 *     The mrp
	 */
	public BigDecimal getMrp() {
		return mrp;
	}

	/**
	 *
	 * @param mrp
	 *     The mrp
	 */
	public void setMrp(BigDecimal mrp) {
		this.mrp = mrp;
	}

	/**
	 *
	 * @return
	 *     The grossSP
	 */
	public BigDecimal getGrossSP() {
		return grossSP;
	}

	/**
	 *
	 * @param grossSP
	 *     The grossSP
	 */
	public void setGrossSP(BigDecimal grossSP) {
		this.grossSP = grossSP;
	}

	/**
	 *
	 * @return
	 *     The styleId
	 */
	public String getStyleId() {
		return styleId;
	}

	/**
	 *
	 * @param styleId
	 *     The styleId
	 */
	public void setStyleId(String styleId) {
		this.styleId = styleId;
	}

	/**
	 *
	 * @return
	 *     The category1
	 */
	public String getCategory1() {
		return category1;
	}

	/**
	 *
	 * @param category1
	 *     The category1
	 */
	public void setCategory1(String category1) {
		this.category1 = category1;
	}

	/**
	 *
	 * @return
	 *     The category2
	 */
	public String getCategory2() {
		return category2;
	}

	/**
	 *
	 * @param category2
	 *     The category2
	 */
	public void setCategory2(String category2) {
		this.category2 = category2;
	}

	/**
	 *
	 * @return
	 *     The category3
	 */
	public String getCategory3() {
		return category3;
	}

	/**
	 *
	 * @param category3
	 *     The category
	 */
	public void setCategory3(String category3) {
		this.category3 = category3;
	}

	/**
	 *
	 * @return
	 *     The image
	 */
	public String getImage() {
		return image;
	}

	/**
	 *
	 * @param image
	 *     The image
	 */
	public void setImage(String image) {
		this.image = image;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getEanCode() {
		return eanCode;
	}

	public void setEanCode(String eanCode) {
		this.eanCode = eanCode;
	}

	public String getSapStyleId() {
		return sapStyleId;
	}

	public void setSapStyleId(String sapStyleId) {
		this.sapStyleId = sapStyleId;
	}
}

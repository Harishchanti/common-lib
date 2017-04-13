package com.ailiens.optimusprime.autobots.rest.dto.n3ow.Voucher;

import java.math.BigDecimal;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class VoucherBean {

	private String channel;
	private String orderId;
	private BigDecimal price;
	private String reasonCode;
	private String reasonName;
	private String userId;
	private String voucherName;
	private String voucherType;
	private String brand;
	private String storeId;

	public VoucherBean(){

	}
	/**
	 * 
	 * @return
	 * The channel
	 */
	public String getChannel() {
		return channel;
	}

	/**
	 * 
	 * @param channel
	 * The channel
	 */
	public void setChannel(String channel) {
		this.channel = channel;
	}

	/**
	 * 
	 * @return
	 * The Brand
	 */
	public String getBrand() {
		return brand;
	}

	/**
	 * 
	 * @param brand
	 * The Brand
	 */
	public void setBrand(String brand) {
		this.brand = brand;
	}

	/**
	 * 
	 * @return
	 * The StoreId
	 */
	public String getStoreId() {
		return storeId;
	}

	/**
	 * 
	 * @param channel
	 * The channel
	 */
	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}



	/**
	 * 
	 * @return
	 * The orderId
	 */
	public String getOrderId() {
		return orderId;
	}

	/**
	 * 
	 * @param orderId
	 * The orderId
	 */
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	/**
	 * 
	 * @return
	 * The price
	 */
	public BigDecimal getPrice() {
		return price;
	}

	/**
	 * 
	 * @param price
	 * The price
	 */
	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	/**
	 * 
	 * @return
	 * The reasonCode
	 */
	public String getReasonCode() {
		return reasonCode;
	}

	/**
	 * 
	 * @param reasonCode
	 * The reasonCode
	 */
	public void setReasonCode(String reasonCode) {
		this.reasonCode = reasonCode;
	}

	/**
	 * 
	 * @return
	 * The reasonName
	 */
	public String getReasonName() {
		return reasonName;
	}

	/**
	 * 
	 * @param reasonName
	 * The reasonName
	 */
	public void setReasonName(String reasonName) {
		this.reasonName = reasonName;
	}

	/**
	 * 
	 * @return
	 * The userId
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * 
	 * @param userId
	 * The userId
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}

	/**
	 * 
	 * @return
	 * The voucherName
	 */
	public String getVoucherName() {
		return voucherName;
	}

	/**
	 * 
	 * @param voucherName
	 * The voucherName
	 */
	public void setVoucherName(String voucherName) {
		this.voucherName = voucherName;
	}

	/**
	 * 
	 * @return
	 * The voucherType
	 */
	public String getVoucherType() {
		return voucherType;
	}

	/**
	 * 
	 * @param voucherType
	 * The voucherType
	 */
	public void setVoucherType(String voucherType) {
		this.voucherType = voucherType;
	}

}
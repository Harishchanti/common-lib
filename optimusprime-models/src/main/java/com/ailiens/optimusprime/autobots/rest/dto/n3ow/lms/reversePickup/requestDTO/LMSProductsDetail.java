
package com.ailiens.optimusprime.autobots.rest.dto.n3ow.lms.reversePickup.requestDTO;

import javax.annotation.Generated;
import org.apache.commons.lang.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class LMSProductsDetail {

	private String returnId;
	private String productCode;
	private Long quantity;
	private String category;
	private Double totalPrice;

	/**
	 *
	 * @return
	 *     The productCode
	 */
	public String getReturnId() {
		return returnId;
	}

	public LMSProductsDetail(){

	}
	/**
	 *
	 * @param returnId
	 *     The returnId
	 */
	public void setReturnId(String returnId) {
		this.returnId = returnId;
	}
	/**
	 *
	 * @return
	 *     The productCode
	 */
	public String getProductCode() {
		return productCode;
	}

	/**
	 *
	 * @param productCode
	 *     The productCode
	 */
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	/**
	 *
	 * @return
	 *     The quantity
	 */
	public Long getQuantity() {
		return quantity;
	}

	/**
	 *
	 * @param quantity
	 *     The quantity
	 */
	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

	/**
	 *
	 * @return
	 *     The category
	 */
	public String getCategory() {
		return category;
	}

	/**
	 *
	 * @param category
	 *     The category
	 */
	public void setCategory(String category) {
		this.category = category;
	}

	/**
	 *
	 * @return
	 *     The totalPrice
	 */
	public Double getTotalPrice() {
		return totalPrice;
	}

	/**
	 *
	 * @param totalPrice
	 *     The totalPrice
	 */
	public void setTotalPrice(Double totalPrice) {
		this.totalPrice = totalPrice;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

}

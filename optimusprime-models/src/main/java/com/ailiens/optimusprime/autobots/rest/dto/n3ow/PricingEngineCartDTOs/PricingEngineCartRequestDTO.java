
package com.ailiens.optimusprime.autobots.rest.dto.n3ow.PricingEngineCartDTOs;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.apache.commons.lang.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class PricingEngineCartRequestDTO {

	private List<PricingEngineCartRequestProduct> products = new ArrayList<PricingEngineCartRequestProduct>();
	private String couponCode;
	private String userID;
	private BigDecimal netAmountWithShippingCost;
	private BigDecimal netAmount;


	public PricingEngineCartRequestDTO(){

	}
	/**
	 *
	 * @return
	 *     The products
	 */
	public List<PricingEngineCartRequestProduct> getProducts() {
		return products;
	}

	/**
	 *
	 * @param products
	 *     The products
	 */
	public void setProducts(List<PricingEngineCartRequestProduct> products) {
		this.products = products;
	}

	/**
	 *
	 * @return
	 *     The couponCode
	 */
	public String getCouponCode() {
		return couponCode;
	}

	/**
	 *
	 * @param couponCode
	 *     The couponCode
	 */
	public void setCouponCode(String couponCode) {
		this.couponCode = couponCode;
	}

	/**
	 *
	 * @return
	 *     The userID
	 */
	public String getUserID() {
		return userID;
	}

	/**
	 *
	 * @param userID
	 *     The userID
	 */
	public void setUserID(String userID) {
		this.userID = userID;
	}

	public BigDecimal getNetAmountWithShippingCost() {
		return netAmountWithShippingCost;
	}

	public void setNetAmountWithShippingCost(BigDecimal netAmountWithShippingCost) {
		this.netAmountWithShippingCost = netAmountWithShippingCost;
	}

	public BigDecimal getNetAmount() {
		return netAmount;
	}

	public void setNetAmount(BigDecimal netAmount) {
		this.netAmount = netAmount;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

}

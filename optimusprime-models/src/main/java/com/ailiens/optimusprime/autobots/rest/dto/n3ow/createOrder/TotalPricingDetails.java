
package com.ailiens.optimusprime.autobots.rest.dto.n3ow.createOrder;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.validation.Valid;

@Generated("org.jsonschema2pojo")
public class TotalPricingDetails {

	private BigDecimal netAmount;
	private BigDecimal totalTax;
	private BigDecimal tradeSP;
	private BigDecimal totalSP;
	private BigDecimal totalAmountWithShipping;
	@Valid
	private TotalDiscountDetails totalDiscountDetails;
	@Valid
	private TotalNNNowCashDetails totalNNNowCashDetails;
	@Valid
	private List<TotalActualHitRule> totalActualHitRule = new ArrayList<TotalActualHitRule>();
	private BigDecimal shippingCharge;

	/**
	 * 
	 * @return
	 *     The netAmount
	 */
	public BigDecimal getNetAmount() {
		return netAmount;
	}

	public TotalPricingDetails(){

	}
	/**
	 * 
	 * @param netAmount
	 *     The netAmount
	 */
	public void setNetAmount(BigDecimal netAmount) {
		this.netAmount = netAmount;
	}

	/**
	 * 
	 * @return
	 *     The totalTax
	 */
	public BigDecimal getTotalTax() {
		return totalTax;
	}

	/**
	 * 
	 * @param totalTax
	 *     The totalTax
	 */
	public void setTotalTax(BigDecimal totalTax) {
		this.totalTax = totalTax;
	}

	/**
	 * 
	 * @return
	 *     The totalSP
	 */
	public BigDecimal getTotalSP() {
		return totalSP;
	}

	/**
	 * 
	 * @param totalSP
	 *     The totalSP
	 */
	public void setTotalSP(BigDecimal totalSP) {
		this.totalSP = totalSP;
	}

	/**
	 * 
	 * @return
	 *     The tradeSP
	 */
	public BigDecimal getTradeSP() {
		return tradeSP;
	}

	/**
	 * 
	 * @param tradeSP
	 *     The tradeSP
	 */
	public void setTradeSP(BigDecimal tradeSP) {
		this.tradeSP = tradeSP;
	}

	/**
	 * 
	 * @return
	 *     The totalDiscountDetails
	 */
	public TotalDiscountDetails getTotalDiscountDetails() {
		return totalDiscountDetails;
	}

	/**
	 * 
	 * @param totalDiscountDetails
	 *     The totalDiscountDetails
	 */
	public void setTotalDiscountDetails(TotalDiscountDetails totalDiscountDetails) {
		this.totalDiscountDetails = totalDiscountDetails;
	}

	/**
	 * 
	 * @return
	 *     The totalNNNowCashDetails
	 */
	public TotalNNNowCashDetails getTotalNNNowCashDetails() {
		return totalNNNowCashDetails;
	}

	/**
	 * 
	 * @param totalNNNowCashDetails
	 *     The totalNNNowCashDetails
	 */
	public void setTotalNNNowCashDetails(TotalNNNowCashDetails totalNNNowCashDetails) {
		this.totalNNNowCashDetails = totalNNNowCashDetails;
	}

	/**
	 * 
	 * @return
	 *     The totalActualHitRule
	 */
	public List<TotalActualHitRule> getTotalActualHitRule() {
		return totalActualHitRule;
	}

	/**
	 * 
	 * @param totalActualHitRule
	 *     The totalActualHitRule
	 */
	public void setTotalActualHitRule(List<TotalActualHitRule> totalActualHitRule) {
		this.totalActualHitRule = totalActualHitRule;
	}

	/**
	 * 
	 * @return
	 *     The shippingCharge
	 */
	public BigDecimal getShippingCharge() {
		return shippingCharge;
	}

	/**
	 * 
	 * @param shippingCharge
	 *     The shippingCharge
	 */
	public void setShippingCharge(BigDecimal shippingCharge) {
		this.shippingCharge = shippingCharge;
	}

	public BigDecimal getTotalAmountWithShipping() {
		return totalAmountWithShipping;
	}

	public void setTotalAmountWithShipping(BigDecimal totalAmountWithShipping) {
		this.totalAmountWithShipping = totalAmountWithShipping;
	}

}

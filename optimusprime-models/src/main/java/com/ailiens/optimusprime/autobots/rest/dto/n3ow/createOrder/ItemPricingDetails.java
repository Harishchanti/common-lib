
package com.ailiens.optimusprime.autobots.rest.dto.n3ow.createOrder;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.validation.Valid;

@Generated("org.jsonschema2pojo")
public class ItemPricingDetails {

	private BigDecimal discount;
	private BigDecimal nnnowCash;
	private BigDecimal netAmount;
	private BigDecimal value;
	private BigDecimal sp;
	private BigDecimal tax;
	private String taxClass;
	private BigDecimal tradeSp;
	@Valid
	private List<ActualHitRule> actualHitRule = new ArrayList<ActualHitRule>();


	public ItemPricingDetails(){

	}
	/**
	 *
	 * @return
	 *     The discount
	 */

	public BigDecimal getDiscount() {
		return discount;
	}

	/**
	 *
	 * @param discount
	 *     The discount
	 */
	public void setDiscount(BigDecimal discount) {
		this.discount = discount;
	}

	/**
	 *
	 * @return
	 *     The nnnowCash
	 */
	public BigDecimal getNnnowCash() {
		return nnnowCash;
	}

	/**
	 *
	 * @param nnnowCash
	 *     The nnnowCash
	 */
	public void setNnnowCash(BigDecimal nnnowCash) {
		this.nnnowCash = nnnowCash;
	}

	/**
	 *
	 * @return
	 *     The netAmount
	 */
	public BigDecimal getNetAmount() {
		return netAmount;
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
	 *     The value
	 */
	public BigDecimal getValue() {
		return value;
	}

	/**
	 *
	 * @param value
	 *     The value
	 */
	public void setValue(BigDecimal value) {
		this.value = value;
	}

	/**
	 *
	 * @return
	 *     The sp
	 */
	public BigDecimal getSp() {
		return sp;
	}

	/**
	 *
	 * @param sp
	 *     The sp
	 */
	public void setSp(BigDecimal sp) {
		this.sp = sp;
	}

	/**
	 *
	 * @return
	 *     The tax
	 */
	public BigDecimal getTax() {
		return tax;
	}

	/**
	 *
	 * @param tax
	 *     The tax
	 */
	public void setTax(BigDecimal tax) {
		this.tax = tax;
	}

	/**
	 *
	 * @return
	 *     The actualHitRule
	 */
	public List<ActualHitRule> getActualHitRule() {
		return actualHitRule;
	}

	/**
	 *
	 * @param actualHitRule
	 *     The actualHitRule
	 */
	public void setActualHitRule(List<ActualHitRule> actualHitRule) {
		this.actualHitRule = actualHitRule;
	}

	/**
	 *
	 * @return
	 *      The tradeSp
	 */
	public BigDecimal getTradeSp() {
		return tradeSp;
	}

	/**
	 *
	 * @param tradeSp
	 *      The tradeSp
	 */
	public void setTradeSp(BigDecimal tradeSp) {
		this.tradeSp = tradeSp;
	}

	/**
	 *
	 * @return
	 *      The taxClass
	 */
	public String getTaxClass() {
		return taxClass;
	}

	/**
	 *
	 * @param taxClass
	 */
	public void setTaxClass(String taxClass) {
		this.taxClass = taxClass;
	}
}

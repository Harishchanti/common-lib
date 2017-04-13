
package com.ailiens.optimusprime.autobots.rest.dto.n3ow.PricingEngineTaxDTOs.InvoiceTaxRequestDTOs;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.math.BigDecimal;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
	"sku",
	"tradeSP",
	"applicablePromotions",
	"quantity",
	"sourceState",
	"destinationState",
	"taxClass",
	"sp",
	"mrp",
	"discount",
	"tax"
})
public class Product {

	@JsonProperty("sku")
	private String sku;
	@JsonProperty("tradeSP")
	private BigDecimal tradeSP;
	@JsonProperty("applicablePromotions")
	private ApplicablePromotions applicablePromotions;
	@JsonProperty("quantity")
	private BigDecimal quantity;
	@JsonProperty("sourceState")
	private String sourceState;
	@JsonProperty("destinationState")
	private String destinationState;
	@JsonProperty("taxClass")
	private String taxClass;
	@JsonProperty("sp")
	private BigDecimal sp;
	@JsonProperty("mrp")
	private BigDecimal mrp;
	@JsonProperty("discount")
	private BigDecimal discount;
	@JsonProperty("tax")
	private BigDecimal tax;
	@JsonProperty("netAmount")
	private BigDecimal netAmount;

	/**
	 *
	 * @return
	 *     The sku
	 */
	@JsonProperty("sku")
	public String getSku() {
		return sku;
	}

	public Product(){

	}
	/**
	 *
	 * @param sku
	 *     The sku
	 */
	@JsonProperty("sku")
	public void setSku(String sku) {
		this.sku = sku;
	}

	/**
	 *
	 * @return
	 *     The tradeSP
	 */
	@JsonProperty("tradeSP")
	public BigDecimal getTradeSP() {
		return tradeSP;
	}

	/**
	 *
	 * @param tradeSP
	 *     The tradeSP
	 */
	@JsonProperty("tradeSP")
	public void setTradeSP(BigDecimal tradeSP) {
		this.tradeSP = tradeSP;
	}

	/**
	 *
	 * @return
	 *     The applicablePromotions
	 */
	@JsonProperty("applicablePromotions")
	public ApplicablePromotions getApplicablePromotions() {
		return applicablePromotions;
	}

	/**
	 *
	 * @param applicablePromotions
	 *     The applicablePromotions
	 */
	@JsonProperty("applicablePromotions")
	public void setApplicablePromotions(ApplicablePromotions applicablePromotions) {
		this.applicablePromotions = applicablePromotions;
	}

	/**
	 *
	 * @return
	 *     The quantity
	 */
	@JsonProperty("quantity")
	public BigDecimal getQuantity() {
		return quantity;
	}

	/**
	 *
	 * @param quantity
	 *     The quantity
	 */
	@JsonProperty("quantity")
	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}

	/**
	 *
	 * @return
	 *     The sourceState
	 */
	@JsonProperty("sourceState")
	public String getSourceState() {
		return sourceState;
	}

	/**
	 *
	 * @param sourceState
	 *     The sourceState
	 */
	@JsonProperty("sourceState")
	public void setSourceState(String sourceState) {
		this.sourceState = sourceState;
	}

	/**
	 *
	 * @return
	 *     The destinationState
	 */
	@JsonProperty("destinationState")
	public String getDestinationState() {
		return destinationState;
	}

	/**
	 *
	 * @param destinationState
	 *     The destinationState
	 */
	@JsonProperty("destinationState")
	public void setDestinationState(String destinationState) {
		this.destinationState = destinationState;
	}

	/**
	 *
	 * @return
	 *     The taxClass
	 */
	@JsonProperty("taxClass")
	public String getTaxClass() {
		return taxClass;
	}

	/**
	 *
	 * @param taxClass
	 *     The taxClass
	 */
	@JsonProperty("taxClass")
	public void setTaxClass(String taxClass) {
		this.taxClass = taxClass;
	}

	/**
	 *
	 * @return
	 *     The sp
	 */
	@JsonProperty("sp")
	public BigDecimal getSp() {
		return sp;
	}

	/**
	 *
	 * @param sp
	 *     The sp
	 */
	@JsonProperty("sp")
	public void setSp(BigDecimal sp) {
		this.sp = sp;
	}

	/**
	 *
	 * @return
	 *     The mrp
	 */
	@JsonProperty("mrp")
	public BigDecimal getMrp() {
		return mrp;
	}

	/**
	 *
	 * @param mrp
	 *     The mrp
	 */
	@JsonProperty("mrp")
	public void setMrp(BigDecimal mrp) {
		this.mrp = mrp;
	}

	/**
	 *
	 * @return
	 *     The discount
	 */
	@JsonProperty("discount")
	public BigDecimal getDiscount() {
		return discount;
	}

	/**
	 *
	 * @param discount
	 *     The discount
	 */
	@JsonProperty("discount")
	public void setDiscount(BigDecimal discount) {
		this.discount = discount;
	}

	@JsonProperty("tax")
	public BigDecimal getTax() {
		return tax;
	}

	@JsonProperty("tax")
	public void setTax(BigDecimal tax) {
		this.tax = tax;
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

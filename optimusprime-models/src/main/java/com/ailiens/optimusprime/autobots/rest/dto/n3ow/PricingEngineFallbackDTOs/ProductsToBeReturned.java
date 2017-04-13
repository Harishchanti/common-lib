
package com.ailiens.optimusprime.autobots.rest.dto.n3ow.PricingEngineFallbackDTOs;

import java.math.BigDecimal;
import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
	"sku",
	"tradeSP",
	"quantity",
	"sourceState",
	"destinationState",
	"brand",
	"categoryL1",
	"categoryL2",
	"categoryL3",
	"MRP",
	"SP",
	"taxClass",
	"value",
	"tax",
	"netAmount"
})
public class ProductsToBeReturned {

	@JsonProperty("sku")
	private String sku;
	@JsonProperty("tradeSP")
	private BigDecimal tradeSP;
	@JsonProperty("quantity")
	private Integer quantity;
	@JsonProperty("sourceState")
	private String sourceState;
	@JsonProperty("destinationState")
	private String destinationState;
	@JsonProperty("brand")
	private String brand;
	@JsonProperty("categoryL1")
	private String categoryL1;
	@JsonProperty("categoryL2")
	private String categoryL2;
	@JsonProperty("categoryL3")
	private String categoryL3;
	@JsonProperty("MRP")
	private BigDecimal MRP;
	@JsonProperty("SP")
	private BigDecimal SP;
	@JsonProperty("taxClass")
	private String taxClass;
	@JsonProperty("value")
	private BigDecimal value;
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
	public ProductsToBeReturned(){

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
	 *     The quantity
	 */
	@JsonProperty("quantity")
	public Integer getQuantity() {
		return quantity;
	}

	/**
	 *
	 * @param quantity
	 *     The quantity
	 */
	@JsonProperty("quantity")
	public void setQuantity(Integer quantity) {
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
	 *     The brand
	 */
	@JsonProperty("brand")
	public String getBrand() {
		return brand;
	}

	/**
	 *
	 * @param brand
	 *     The brand
	 */
	@JsonProperty("brand")
	public void setBrand(String brand) {
		this.brand = brand;
	}

	/**
	 *
	 * @return
	 *     The categoryL1
	 */
	@JsonProperty("categoryL1")
	public String getCategoryL1() {
		return categoryL1;
	}

	/**
	 *
	 * @param categoryL1
	 *     The categoryL1
	 */
	@JsonProperty("categoryL1")
	public void setCategoryL1(String categoryL1) {
		this.categoryL1 = categoryL1;
	}

	/**
	 *
	 * @return
	 *     The categoryL2
	 */
	@JsonProperty("categoryL2")
	public String getCategoryL2() {
		return categoryL2;
	}

	/**
	 *
	 * @param categoryL2
	 *     The categoryL2
	 */
	@JsonProperty("categoryL2")
	public void setCategoryL2(String categoryL2) {
		this.categoryL2 = categoryL2;
	}

	/**
	 *
	 * @return
	 *     The categoryL3
	 */
	@JsonProperty("categoryL3")
	public String getCategoryL3() {
		return categoryL3;
	}

	/**
	 *
	 * @param categoryL3
	 *     The categoryL3
	 */
	@JsonProperty("categoryL3")
	public void setCategoryL3(String categoryL3) {
		this.categoryL3 = categoryL3;
	}

	/**
	 *
	 * @return
	 *     The MRP
	 */
	@JsonProperty("MRP")
	public BigDecimal getMRP() {
		return MRP;
	}

	/**
	 *
	 * @param MRP
	 *     The MRP
	 */
	@JsonProperty("MRP")
	public void setMRP(BigDecimal MRP) {
		this.MRP = MRP;
	}

	/**
	 *
	 * @return
	 *     The SP
	 */
	@JsonProperty("SP")
	public BigDecimal getSP() {
		return SP;
	}

	/**
	 *
	 * @param SP
	 *     The SP
	 */
	@JsonProperty("SP")
	public void setSP(BigDecimal SP) {
		this.SP = SP;
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
	 *     The value
	 */
	@JsonProperty("value")
	public BigDecimal getValue() {
		return value;
	}

	/**
	 *
	 * @param value
	 *     The value
	 */
	@JsonProperty("value")
	public void setValue(BigDecimal value) {
		this.value = value;
	}

	/**
	 *
	 * @return
	 *     The tax
	 */
	@JsonProperty("tax")
	public BigDecimal getTax() {
		return tax;
	}

	/**
	 *
	 * @param tax
	 *     The tax
	 */
	@JsonProperty("tax")
	public void setTax(BigDecimal tax) {
		this.tax = tax;
	}

	/**
	 *
	 * @return
	 *     The netAmount
	 */
	@JsonProperty("netAmount")
	public BigDecimal getNetAmount() {
		return netAmount;
	}

	/**
	 *
	 * @param netAmount
	 *     The netAmount
	 */
	@JsonProperty("netAmount")
	public void setNetAmount(BigDecimal netAmount) {
		this.netAmount = netAmount;
	}

}

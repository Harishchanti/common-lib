
package com.ailiens.optimusprime.autobots.rest.dto.n3ow.PricingEnginePromotionsCartDTOs.PricingEnginePromotionsResponseDTOs;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
	"sku",
	"brand",
	"styleID",
	"tradeSP",
	"applicablePromotions",
	"subBrand",
	"quantity",
	"discount",
	"affected",
	"freeItems",
	"nnnowCash",
	"shippingMethod",
	"categoryL1",
	"categoryL2",
	"categoryL3",
	"cartAdjustedDiscount",
	"sourceState",
	"destinationState",
	"value",
	"tax",
	"netAmount",
	"taxClass",
	"sp",
	"mrp"
})
public class Product {

	@JsonProperty("sku")
	private String sku;
	@JsonProperty("brand")
	private String brand;
	@JsonProperty("styleID")
	private String styleID;
	@JsonProperty("tradeSP")
	private BigDecimal tradeSP;
	@JsonProperty("applicablePromotions")
	private ApplicablePromotions applicablePromotions;
	@JsonProperty("subBrand")
	private Object subBrand;
	@JsonProperty("quantity")
	private BigDecimal quantity;
	@JsonProperty("discount")
	private BigDecimal discount;
	@JsonProperty("affected")
	private Boolean affected;
	@JsonProperty("freeItems")
	private Object freeItems;
	@JsonProperty("nnnowCash")
	private BigDecimal nnnowCash;
	@JsonProperty("shippingMethod")
	private String shippingMethod;
	@JsonProperty("categoryL1")
	private String categoryL1;
	@JsonProperty("categoryL2")
	private String categoryL2;
	@JsonProperty("categoryL3")
	private String categoryL3;
	@JsonProperty("cartAdjustedDiscount")
	private BigDecimal cartAdjustedDiscount;
	@JsonProperty("sourceState")
	private String sourceState;
	@JsonProperty("destinationState")
	private String destinationState;
	@JsonProperty("value")
	private BigDecimal value;
	@JsonProperty("tax")
	private BigDecimal tax;
	@JsonProperty("netAmount")
	private BigDecimal netAmount;
	@JsonProperty("taxClass")
	private String taxClass;
	@JsonProperty("sp")
	private BigDecimal sp;
	@JsonProperty("mrp")
	private BigDecimal mrp;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	/**
	 *
	 * @return
	 *     The sku
	 */
	@JsonProperty("sku")
	public String getSku() {
		return sku;
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
	 *     The brand
	 */
	@JsonProperty("brand")
	public String getBrand() {
		return brand;
	}
	public Product(){

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
	 *     The styleID
	 */
	@JsonProperty("styleID")
	public String getStyleID() {
		return styleID;
	}

	/**
	 *
	 * @param styleID
	 *     The styleID
	 */
	@JsonProperty("styleID")
	public void setStyleID(String styleID) {
		this.styleID = styleID;
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
	 *     The subBrand
	 */
	@JsonProperty("subBrand")
	public Object getSubBrand() {
		return subBrand;
	}

	/**
	 *
	 * @param subBrand
	 *     The subBrand
	 */
	@JsonProperty("subBrand")
	public void setSubBrand(Object subBrand) {
		this.subBrand = subBrand;
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

	/**
	 *
	 * @return
	 *     The affected
	 */
	@JsonProperty("affected")
	public Boolean getAffected() {
		return affected;
	}

	/**
	 *
	 * @param affected
	 *     The affected
	 */
	@JsonProperty("affected")
	public void setAffected(Boolean affected) {
		this.affected = affected;
	}

	/**
	 *
	 * @return
	 *     The freeItems
	 */
	@JsonProperty("freeItems")
	public Object getFreeItems() {
		return freeItems;
	}

	/**
	 *
	 * @param freeItems
	 *     The freeItems
	 */
	@JsonProperty("freeItems")
	public void setFreeItems(Object freeItems) {
		this.freeItems = freeItems;
	}

	/**
	 *
	 * @return
	 *     The nnnowCash
	 */
	@JsonProperty("nnnowCash")
	public BigDecimal getNnnowCash() {
		return nnnowCash;
	}

	/**
	 *
	 * @param nnnowCash
	 *     The nnnowCash
	 */
	@JsonProperty("nnnowCash")
	public void setNnnowCash(BigDecimal nnnowCash) {
		this.nnnowCash = nnnowCash;
	}

	/**
	 *
	 * @return
	 *     The shippingMethod
	 */
	@JsonProperty("shippingMethod")
	public String getShippingMethod() {
		return shippingMethod;
	}

	/**
	 *
	 * @param shippingMethod
	 *     The shippingMethod
	 */
	@JsonProperty("shippingMethod")
	public void setShippingMethod(String shippingMethod) {
		this.shippingMethod = shippingMethod;
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
	 *     The cartAdjustedDiscount
	 */
	@JsonProperty("cartAdjustedDiscount")
	public BigDecimal getCartAdjustedDiscount() {
		return cartAdjustedDiscount;
	}

	/**
	 *
	 * @param cartAdjustedDiscount
	 *     The cartAdjustedDiscount
	 */
	@JsonProperty("cartAdjustedDiscount")
	public void setCartAdjustedDiscount(BigDecimal cartAdjustedDiscount) {
		this.cartAdjustedDiscount = cartAdjustedDiscount;
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

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

}

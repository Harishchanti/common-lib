
package com.ailiens.optimusprime.autobots.rest.dto.n3ow.PricingEnginePromotionsCartDTOs.PricingEnginePromotionsResponseDTOs;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
	"products",
	"tradeSP",
	"totalDiscount",
	"applicablePromotions",
	"totalAppliedPromotions",
	"cartSP",
	"totalNNNowCash",
	"productFreeItems",
	"cartFreeItems",
	"totalFreeItems",
	"productDiscount",
	"cartDiscount",
	"productSP",
	"productNNNowCash",
	"cartNNNowCash",
	"couponCode",
	"tax",
	"netAmount",
	"value",
	"shippingCost",
	"couponApplied",
	"netAmountWithShippingCost",
	"userID",
	"mrp"
})
public class PromotionsResponseDTO {

	@JsonProperty("products")
	private List<Product> products = new ArrayList<Product>();
	@JsonProperty("tradeSP")
	private BigDecimal tradeSP;
	@JsonProperty("totalDiscount")
	private BigDecimal totalDiscount;
	@JsonProperty("applicablePromotions")
	private ApplicablePromotions_ applicablePromotions;
	@JsonProperty("totalAppliedPromotions")
	private List<TotalAppliedPromotion> totalAppliedPromotions = new ArrayList<TotalAppliedPromotion>();
	@JsonProperty("cartSP")
	private BigDecimal cartSP;
	@JsonProperty("totalNNNowCash")
	private BigDecimal totalNNNowCash;
	@JsonProperty("productFreeItems")
	private List<Object> productFreeItems = new ArrayList<Object>();
	@JsonProperty("cartFreeItems")
	private Object cartFreeItems;
	@JsonProperty("totalFreeItems")
	private List<Object> totalFreeItems = new ArrayList<Object>();
	@JsonProperty("productDiscount")
	private BigDecimal productDiscount;
	@JsonProperty("cartDiscount")
	private BigDecimal cartDiscount;
	@JsonProperty("productSP")
	private BigDecimal productSP;
	@JsonProperty("productNNNowCash")
	private BigDecimal productNNNowCash;
	@JsonProperty("cartNNNowCash")
	private BigDecimal cartNNNowCash;
	@JsonProperty("couponCode")
	private Object couponCode;
	@JsonProperty("tax")
	private BigDecimal tax;
	@JsonProperty("netAmount")
	private BigDecimal netAmount;
	@JsonProperty("value")
	private BigDecimal value;
	@JsonProperty("shippingCost")
	private BigDecimal shippingCost;
	@JsonProperty("couponApplied")
	private Boolean couponApplied;
	@JsonProperty("netAmountWithShippingCost")
	private BigDecimal netAmountWithShippingCost;
	@JsonProperty("userID")
	private String userID;
	@JsonProperty("mrp")
	private BigDecimal mrp;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	/**
	 *
	 * @return
	 *     The products
	 */
	@JsonProperty("products")
	public List<Product> getProducts() {
		return products;
	}

	/**
	 *
	 * @param products
	 *     The products
	 */
	@JsonProperty("products")
	public void setProducts(List<Product> products) {
		this.products = products;
	}
	public PromotionsResponseDTO(){

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
	 *     The totalDiscount
	 */
	@JsonProperty("totalDiscount")
	public BigDecimal getTotalDiscount() {
		return totalDiscount;
	}

	/**
	 *
	 * @param totalDiscount
	 *     The totalDiscount
	 */
	@JsonProperty("totalDiscount")
	public void setTotalDiscount(BigDecimal totalDiscount) {
		this.totalDiscount = totalDiscount;
	}

	/**
	 *
	 * @return
	 *     The applicablePromotions
	 */
	@JsonProperty("applicablePromotions")
	public ApplicablePromotions_ getApplicablePromotions() {
		return applicablePromotions;
	}

	/**
	 *
	 * @param applicablePromotions
	 *     The applicablePromotions
	 */
	@JsonProperty("applicablePromotions")
	public void setApplicablePromotions(ApplicablePromotions_ applicablePromotions) {
		this.applicablePromotions = applicablePromotions;
	}

	/**
	 *
	 * @return
	 *     The totalAppliedPromotions
	 */
	@JsonProperty("totalAppliedPromotions")
	public List<TotalAppliedPromotion> getTotalAppliedPromotions() {
		return totalAppliedPromotions;
	}

	/**
	 *
	 * @param totalAppliedPromotions
	 *     The totalAppliedPromotions
	 */
	@JsonProperty("totalAppliedPromotions")
	public void setTotalAppliedPromotions(List<TotalAppliedPromotion> totalAppliedPromotions) {
		this.totalAppliedPromotions = totalAppliedPromotions;
	}

	/**
	 *
	 * @return
	 *     The cartSP
	 */
	@JsonProperty("cartSP")
	public BigDecimal getCartSP() {
		return cartSP;
	}

	/**
	 *
	 * @param cartSP
	 *     The cartSP
	 */
	@JsonProperty("cartSP")
	public void setCartSP(BigDecimal cartSP) {
		this.cartSP = cartSP;
	}

	/**
	 *
	 * @return
	 *     The totalNNNowCash
	 */
	@JsonProperty("totalNNNowCash")
	public BigDecimal getTotalNNNowCash() {
		return totalNNNowCash;
	}

	/**
	 *
	 * @param totalNNNowCash
	 *     The totalNNNowCash
	 */
	@JsonProperty("totalNNNowCash")
	public void setTotalNNNowCash(BigDecimal totalNNNowCash) {
		this.totalNNNowCash = totalNNNowCash;
	}

	/**
	 *
	 * @return
	 *     The productFreeItems
	 */
	@JsonProperty("productFreeItems")
	public List<Object> getProductFreeItems() {
		return productFreeItems;
	}

	/**
	 *
	 * @param productFreeItems
	 *     The productFreeItems
	 */
	@JsonProperty("productFreeItems")
	public void setProductFreeItems(List<Object> productFreeItems) {
		this.productFreeItems = productFreeItems;
	}

	/**
	 *
	 * @return
	 *     The cartFreeItems
	 */
	@JsonProperty("cartFreeItems")
	public Object getCartFreeItems() {
		return cartFreeItems;
	}

	/**
	 *
	 * @param cartFreeItems
	 *     The cartFreeItems
	 */
	@JsonProperty("cartFreeItems")
	public void setCartFreeItems(Object cartFreeItems) {
		this.cartFreeItems = cartFreeItems;
	}

	/**
	 *
	 * @return
	 *     The totalFreeItems
	 */
	@JsonProperty("totalFreeItems")
	public List<Object> getTotalFreeItems() {
		return totalFreeItems;
	}

	/**
	 *
	 * @param totalFreeItems
	 *     The totalFreeItems
	 */
	@JsonProperty("totalFreeItems")
	public void setTotalFreeItems(List<Object> totalFreeItems) {
		this.totalFreeItems = totalFreeItems;
	}

	/**
	 *
	 * @return
	 *     The productDiscount
	 */
	@JsonProperty("productDiscount")
	public BigDecimal getProductDiscount() {
		return productDiscount;
	}

	/**
	 *
	 * @param productDiscount
	 *     The productDiscount
	 */
	@JsonProperty("productDiscount")
	public void setProductDiscount(BigDecimal productDiscount) {
		this.productDiscount = productDiscount;
	}

	/**
	 *
	 * @return
	 *     The cartDiscount
	 */
	@JsonProperty("cartDiscount")
	public BigDecimal getCartDiscount() {
		return cartDiscount;
	}

	/**
	 *
	 * @param cartDiscount
	 *     The cartDiscount
	 */
	@JsonProperty("cartDiscount")
	public void setCartDiscount(BigDecimal cartDiscount) {
		this.cartDiscount = cartDiscount;
	}

	/**
	 *
	 * @return
	 *     The productSP
	 */
	@JsonProperty("productSP")
	public BigDecimal getProductSP() {
		return productSP;
	}

	/**
	 *
	 * @param productSP
	 *     The productSP
	 */
	@JsonProperty("productSP")
	public void setProductSP(BigDecimal productSP) {
		this.productSP = productSP;
	}

	/**
	 *
	 * @return
	 *     The productNNNowCash
	 */
	@JsonProperty("productNNNowCash")
	public BigDecimal getProductNNNowCash() {
		return productNNNowCash;
	}

	/**
	 *
	 * @param productNNNowCash
	 *     The productNNNowCash
	 */
	@JsonProperty("productNNNowCash")
	public void setProductNNNowCash(BigDecimal productNNNowCash) {
		this.productNNNowCash = productNNNowCash;
	}

	/**
	 *
	 * @return
	 *     The cartNNNowCash
	 */
	@JsonProperty("cartNNNowCash")
	public BigDecimal getCartNNNowCash() {
		return cartNNNowCash;
	}

	/**
	 *
	 * @param cartNNNowCash
	 *     The cartNNNowCash
	 */
	@JsonProperty("cartNNNowCash")
	public void setCartNNNowCash(BigDecimal cartNNNowCash) {
		this.cartNNNowCash = cartNNNowCash;
	}

	/**
	 *
	 * @return
	 *     The couponCode
	 */
	@JsonProperty("couponCode")
	public Object getCouponCode() {
		return couponCode;
	}

	/**
	 *
	 * @param couponCode
	 *     The couponCode
	 */
	@JsonProperty("couponCode")
	public void setCouponCode(Object couponCode) {
		this.couponCode = couponCode;
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
	 *     The shippingCost
	 */
	@JsonProperty("shippingCost")
	public BigDecimal getShippingCost() {
		return shippingCost;
	}

	/**
	 *
	 * @param shippingCost
	 *     The shippingCost
	 */
	@JsonProperty("shippingCost")
	public void setShippingCost(BigDecimal shippingCost) {
		this.shippingCost = shippingCost;
	}

	/**
	 *
	 * @return
	 *     The couponApplied
	 */
	@JsonProperty("couponApplied")
	public Boolean getCouponApplied() {
		return couponApplied;
	}

	/**
	 *
	 * @param couponApplied
	 *     The couponApplied
	 */
	@JsonProperty("couponApplied")
	public void setCouponApplied(Boolean couponApplied) {
		this.couponApplied = couponApplied;
	}

	/**
	 *
	 * @return
	 *     The netAmountWithShippingCost
	 */
	@JsonProperty("netAmountWithShippingCost")
	public BigDecimal getNetAmountWithShippingCost() {
		return netAmountWithShippingCost;
	}

	/**
	 *
	 * @param netAmountWithShippingCost
	 *     The netAmountWithShippingCost
	 */
	@JsonProperty("netAmountWithShippingCost")
	public void setNetAmountWithShippingCost(BigDecimal netAmountWithShippingCost) {
		this.netAmountWithShippingCost = netAmountWithShippingCost;
	}

	/**
	 *
	 * @return
	 *     The userID
	 */
	@JsonProperty("userID")
	public String getUserID() {
		return userID;
	}

	/**
	 *
	 * @param userID
	 *     The userID
	 */
	@JsonProperty("userID")
	public void setUserID(String userID) {
		this.userID = userID;
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

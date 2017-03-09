
package com.ailiens.optimusprime.autobots.rest.dto.n3ow.PricingEngineTaxDTOs.InvoiceTaxResponseDTOs;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;

import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.List;

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
@JsonIgnoreProperties(ignoreUnknown = true)
public class InvoiceTaxResponseDTO {

	@JsonProperty("products")
	private List<Product> products = new ArrayList<Product>();
	@JsonProperty("tradeSP")
	private Integer tradeSP;
	@JsonProperty("totalDiscount")
	private Integer totalDiscount;
	@JsonProperty("applicablePromotions")
	private Object applicablePromotions;
	@JsonProperty("totalAppliedPromotions")
	private List<Object> totalAppliedPromotions = new ArrayList<Object>();
	@JsonProperty("cartSP")
	private Integer cartSP;
	@JsonProperty("totalNNNowCash")
	private Integer totalNNNowCash;
	@JsonProperty("productFreeItems")
	private List<Object> productFreeItems = new ArrayList<Object>();
	@JsonProperty("cartFreeItems")
	private Object cartFreeItems;
	@JsonProperty("totalFreeItems")
	private List<Object> totalFreeItems = new ArrayList<Object>();
	@JsonProperty("productDiscount")
	private Integer productDiscount;
	@JsonProperty("cartDiscount")
	private Integer cartDiscount;
	@JsonProperty("productSP")
	private Integer productSP;
	@JsonProperty("productNNNowCash")
	private Integer productNNNowCash;
	@JsonProperty("cartNNNowCash")
	private Integer cartNNNowCash;
	@JsonProperty("couponCode")
	private Object couponCode;
	@JsonProperty("tax")
	private Integer tax;
	@JsonProperty("netAmount")
	private Integer netAmount;
	@JsonProperty("value")
	private Integer value;
	@JsonProperty("shippingCost")
	private Integer shippingCost;
	@JsonProperty("couponApplied")
	private Boolean couponApplied;
	@JsonProperty("netAmountWithShippingCost")
	private Integer netAmountWithShippingCost;
	@JsonProperty("userID")
	private Object userID;
	@JsonProperty("mrp")
	private Integer mrp;

	/**
	 *
	 * @return
	 *     The products
	 */
	@JsonProperty("products")
	public List<Product> getProducts() {
		return products;
	}
	public InvoiceTaxResponseDTO(){

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

	/**
	 *
	 * @return
	 *     The tradeSP
	 */
	@JsonProperty("tradeSP")
	public Integer getTradeSP() {
		return tradeSP;
	}

	/**
	 *
	 * @param tradeSP
	 *     The tradeSP
	 */
	@JsonProperty("tradeSP")
	public void setTradeSP(Integer tradeSP) {
		this.tradeSP = tradeSP;
	}

	/**
	 *
	 * @return
	 *     The totalDiscount
	 */
	@JsonProperty("totalDiscount")
	public Integer getTotalDiscount() {
		return totalDiscount;
	}

	/**
	 *
	 * @param totalDiscount
	 *     The totalDiscount
	 */
	@JsonProperty("totalDiscount")
	public void setTotalDiscount(Integer totalDiscount) {
		this.totalDiscount = totalDiscount;
	}

	/**
	 *
	 * @return
	 *     The applicablePromotions
	 */
	@JsonProperty("applicablePromotions")
	public Object getApplicablePromotions() {
		return applicablePromotions;
	}

	/**
	 *
	 * @param applicablePromotions
	 *     The applicablePromotions
	 */
	@JsonProperty("applicablePromotions")
	public void setApplicablePromotions(Object applicablePromotions) {
		this.applicablePromotions = applicablePromotions;
	}

	/**
	 *
	 * @return
	 *     The totalAppliedPromotions
	 */
	@JsonProperty("totalAppliedPromotions")
	public List<Object> getTotalAppliedPromotions() {
		return totalAppliedPromotions;
	}

	/**
	 *
	 * @param totalAppliedPromotions
	 *     The totalAppliedPromotions
	 */
	@JsonProperty("totalAppliedPromotions")
	public void setTotalAppliedPromotions(List<Object> totalAppliedPromotions) {
		this.totalAppliedPromotions = totalAppliedPromotions;
	}

	/**
	 *
	 * @return
	 *     The cartSP
	 */
	@JsonProperty("cartSP")
	public Integer getCartSP() {
		return cartSP;
	}

	/**
	 *
	 * @param cartSP
	 *     The cartSP
	 */
	@JsonProperty("cartSP")
	public void setCartSP(Integer cartSP) {
		this.cartSP = cartSP;
	}

	/**
	 *
	 * @return
	 *     The totalNNNowCash
	 */
	@JsonProperty("totalNNNowCash")
	public Integer getTotalNNNowCash() {
		return totalNNNowCash;
	}

	/**
	 *
	 * @param totalNNNowCash
	 *     The totalNNNowCash
	 */
	@JsonProperty("totalNNNowCash")
	public void setTotalNNNowCash(Integer totalNNNowCash) {
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
	public Integer getProductDiscount() {
		return productDiscount;
	}

	/**
	 *
	 * @param productDiscount
	 *     The productDiscount
	 */
	@JsonProperty("productDiscount")
	public void setProductDiscount(Integer productDiscount) {
		this.productDiscount = productDiscount;
	}

	/**
	 *
	 * @return
	 *     The cartDiscount
	 */
	@JsonProperty("cartDiscount")
	public Integer getCartDiscount() {
		return cartDiscount;
	}

	/**
	 *
	 * @param cartDiscount
	 *     The cartDiscount
	 */
	@JsonProperty("cartDiscount")
	public void setCartDiscount(Integer cartDiscount) {
		this.cartDiscount = cartDiscount;
	}

	/**
	 *
	 * @return
	 *     The productSP
	 */
	@JsonProperty("productSP")
	public Integer getProductSP() {
		return productSP;
	}

	/**
	 *
	 * @param productSP
	 *     The productSP
	 */
	@JsonProperty("productSP")
	public void setProductSP(Integer productSP) {
		this.productSP = productSP;
	}

	/**
	 *
	 * @return
	 *     The productNNNowCash
	 */
	@JsonProperty("productNNNowCash")
	public Integer getProductNNNowCash() {
		return productNNNowCash;
	}

	/**
	 *
	 * @param productNNNowCash
	 *     The productNNNowCash
	 */
	@JsonProperty("productNNNowCash")
	public void setProductNNNowCash(Integer productNNNowCash) {
		this.productNNNowCash = productNNNowCash;
	}

	/**
	 *
	 * @return
	 *     The cartNNNowCash
	 */
	@JsonProperty("cartNNNowCash")
	public Integer getCartNNNowCash() {
		return cartNNNowCash;
	}

	/**
	 *
	 * @param cartNNNowCash
	 *     The cartNNNowCash
	 */
	@JsonProperty("cartNNNowCash")
	public void setCartNNNowCash(Integer cartNNNowCash) {
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
	public Integer getTax() {
		return tax;
	}

	/**
	 *
	 * @param tax
	 *     The tax
	 */
	@JsonProperty("tax")
	public void setTax(Integer tax) {
		this.tax = tax;
	}

	/**
	 *
	 * @return
	 *     The netAmount
	 */
	@JsonProperty("netAmount")
	public Integer getNetAmount() {
		return netAmount;
	}

	/**
	 *
	 * @param netAmount
	 *     The netAmount
	 */
	@JsonProperty("netAmount")
	public void setNetAmount(Integer netAmount) {
		this.netAmount = netAmount;
	}

	/**
	 *
	 * @return
	 *     The value
	 */
	@JsonProperty("value")
	public Integer getValue() {
		return value;
	}

	/**
	 *
	 * @param value
	 *     The value
	 */
	@JsonProperty("value")
	public void setValue(Integer value) {
		this.value = value;
	}

	/**
	 *
	 * @return
	 *     The shippingCost
	 */
	@JsonProperty("shippingCost")
	public Integer getShippingCost() {
		return shippingCost;
	}

	/**
	 *
	 * @param shippingCost
	 *     The shippingCost
	 */
	@JsonProperty("shippingCost")
	public void setShippingCost(Integer shippingCost) {
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
	public Integer getNetAmountWithShippingCost() {
		return netAmountWithShippingCost;
	}

	/**
	 *
	 * @param netAmountWithShippingCost
	 *     The netAmountWithShippingCost
	 */
	@JsonProperty("netAmountWithShippingCost")
	public void setNetAmountWithShippingCost(Integer netAmountWithShippingCost) {
		this.netAmountWithShippingCost = netAmountWithShippingCost;
	}

	/**
	 *
	 * @return
	 *     The userID
	 */
	@JsonProperty("userID")
	public Object getUserID() {
		return userID;
	}

	/**
	 *
	 * @param userID
	 *     The userID
	 */
	@JsonProperty("userID")
	public void setUserID(Object userID) {
		this.userID = userID;
	}

	/**
	 *
	 * @return
	 *     The mrp
	 */
	@JsonProperty("mrp")
	public Integer getMrp() {
		return mrp;
	}

	/**
	 *
	 * @param mrp
	 *     The mrp
	 */
	@JsonProperty("mrp")
	public void setMrp(Integer mrp) {
		this.mrp = mrp;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

}

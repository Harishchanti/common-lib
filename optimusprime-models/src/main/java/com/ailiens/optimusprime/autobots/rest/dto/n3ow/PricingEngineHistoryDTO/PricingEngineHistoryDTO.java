
package com.ailiens.optimusprime.autobots.rest.dto.n3ow.PricingEngineHistoryDTO;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.apache.commons.lang.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class PricingEngineHistoryDTO {

	private List<Product> products = new ArrayList<Product>();
	private BigDecimal tradeSP;
	private BigDecimal totalDiscount;
	private ApplicablePromotions_ applicablePromotions;
	private List<TotalAppliedPromotion> totalAppliedPromotions = new ArrayList<TotalAppliedPromotion>();
	private BigDecimal cartSP;
	private BigDecimal totalNNNowCash;
	private List<Object> productFreeItems = new ArrayList<Object>();
	private Object cartFreeItems;
	private List<Object> totalFreeItems = new ArrayList<Object>();
	private BigDecimal productDiscount;
	private BigDecimal cartDiscount;
	private BigDecimal productSP;
	private BigDecimal productNNNowCash;
	private BigDecimal cartNNNowCash;
	private String couponCode;
	private BigDecimal tax;
	private BigDecimal netAmount;
	private BigDecimal value;
	private BigDecimal shippingCost;
	private boolean couponApplied;
	private BigDecimal netAmountWithShippingCost;
	private String userID;
	private BigDecimal mrp;

	/**
	 *
	 * @return
	 *     The products
	 */
	 public List<Product> getProducts() {
		 return products;
	 }
	 public PricingEngineHistoryDTO(){

	 }

	 /**
	  *
	  * @param products
	  *     The products
	  */
	 public void setProducts(List<Product> products) {
		 this.products = products;
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
	  *     The totalDiscount
	  */
	 public BigDecimal getTotalDiscount() {
		 return totalDiscount;
	 }

	 /**
	  *
	  * @param totalDiscount
	  *     The totalDiscount
	  */
	 public void setTotalDiscount(BigDecimal totalDiscount) {
		 this.totalDiscount = totalDiscount;
	 }

	 /**
	  *
	  * @return
	  *     The applicablePromotions
	  */
	 public ApplicablePromotions_ getApplicablePromotions() {
		 return applicablePromotions;
	 }

	 /**
	  *
	  * @param applicablePromotions
	  *     The applicablePromotions
	  */
	 public void setApplicablePromotions(ApplicablePromotions_ applicablePromotions) {
		 this.applicablePromotions = applicablePromotions;
	 }

	 /**
	  *
	  * @return
	  *     The totalAppliedPromotions
	  */
	 public List<TotalAppliedPromotion> getTotalAppliedPromotions() {
		 return totalAppliedPromotions;
	 }

	 /**
	  *
	  * @param totalAppliedPromotions
	  *     The totalAppliedPromotions
	  */
	 public void setTotalAppliedPromotions(List<TotalAppliedPromotion> totalAppliedPromotions) {
		 this.totalAppliedPromotions = totalAppliedPromotions;
	 }

	 /**
	  *
	  * @return
	  *     The cartSP
	  */
	 public BigDecimal getCartSP() {
		 return cartSP;
	 }

	 /**
	  *
	  * @param cartSP
	  *     The cartSP
	  */
	 public void setCartSP(BigDecimal cartSP) {
		 this.cartSP = cartSP;
	 }

	 /**
	  *
	  * @return
	  *     The totalNNNowCash
	  */
	 public BigDecimal getTotalNNNowCash() {
		 return totalNNNowCash;
	 }

	 /**
	  *
	  * @param totalNNNowCash
	  *     The totalNNNowCash
	  */
	 public void setTotalNNNowCash(BigDecimal totalNNNowCash) {
		 this.totalNNNowCash = totalNNNowCash;
	 }

	 /**
	  *
	  * @return
	  *     The productFreeItems
	  */
	 public List<Object> getProductFreeItems() {
		 return productFreeItems;
	 }

	 /**
	  *
	  * @param productFreeItems
	  *     The productFreeItems
	  */
	 public void setProductFreeItems(List<Object> productFreeItems) {
		 this.productFreeItems = productFreeItems;
	 }

	 /**
	  *
	  * @return
	  *     The cartFreeItems
	  */
	 public Object getCartFreeItems() {
		 return cartFreeItems;
	 }

	 /**
	  *
	  * @param cartFreeItems
	  *     The cartFreeItems
	  */
	 public void setCartFreeItems(Object cartFreeItems) {
		 this.cartFreeItems = cartFreeItems;
	 }

	 /**
	  *
	  * @return
	  *     The totalFreeItems
	  */
	 public List<Object> getTotalFreeItems() {
		 return totalFreeItems;
	 }

	 /**
	  *
	  * @param totalFreeItems
	  *     The totalFreeItems
	  */
	 public void setTotalFreeItems(List<Object> totalFreeItems) {
		 this.totalFreeItems = totalFreeItems;
	 }

	 /**
	  *
	  * @return
	  *     The productDiscount
	  */
	 public BigDecimal getProductDiscount() {
		 return productDiscount;
	 }

	 /**
	  *
	  * @param productDiscount
	  *     The productDiscount
	  */
	 public void setProductDiscount(BigDecimal productDiscount) {
		 this.productDiscount = productDiscount;
	 }

	 /**
	  *
	  * @return
	  *     The cartDiscount
	  */
	 public BigDecimal getCartDiscount() {
		 return cartDiscount;
	 }

	 /**
	  *
	  * @param cartDiscount
	  *     The cartDiscount
	  */
	 public void setCartDiscount(BigDecimal cartDiscount) {
		 this.cartDiscount = cartDiscount;
	 }

	 /**
	  *
	  * @return
	  *     The productSP
	  */
	 public BigDecimal getProductSP() {
		 return productSP;
	 }

	 /**
	  *
	  * @param productSP
	  *     The productSP
	  */
	 public void setProductSP(BigDecimal productSP) {
		 this.productSP = productSP;
	 }

	 /**
	  *
	  * @return
	  *     The productNNNowCash
	  */
	 public BigDecimal getProductNNNowCash() {
		 return productNNNowCash;
	 }

	 /**
	  *
	  * @param productNNNowCash
	  *     The productNNNowCash
	  */
	 public void setProductNNNowCash(BigDecimal productNNNowCash) {
		 this.productNNNowCash = productNNNowCash;
	 }

	 /**
	  *
	  * @return
	  *     The cartNNNowCash
	  */
	 public BigDecimal getCartNNNowCash() {
		 return cartNNNowCash;
	 }

	 /**
	  *
	  * @param cartNNNowCash
	  *     The cartNNNowCash
	  */
	 public void setCartNNNowCash(BigDecimal cartNNNowCash) {
		 this.cartNNNowCash = cartNNNowCash;
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
	  *     The shippingCost
	  */
	 public BigDecimal getShippingCost() {
		 return shippingCost;
	 }

	 /**
	  *
	  * @param shippingCost
	  *     The shippingCost
	  */
	 public void setShippingCost(BigDecimal shippingCost) {
		 this.shippingCost = shippingCost;
	 }

	 /**
	  *
	  * @return
	  *     The couponApplied
	  */
	 public boolean isCouponApplied() {
		 return couponApplied;
	 }

	 /**
	  *
	  * @param couponApplied
	  *     The couponApplied
	  */
	 public void setCouponApplied(boolean couponApplied) {
		 this.couponApplied = couponApplied;
	 }

	 /**
	  *
	  * @return
	  *     The netAmountWithShippingCost
	  */
	 public BigDecimal getNetAmountWithShippingCost() {
		 return netAmountWithShippingCost;
	 }

	 /**
	  *
	  * @param netAmountWithShippingCost
	  *     The netAmountWithShippingCost
	  */
	 public void setNetAmountWithShippingCost(BigDecimal netAmountWithShippingCost) {
		 this.netAmountWithShippingCost = netAmountWithShippingCost;
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

	 /**
	  *
	  * @return
	  *     The mrp
	  */
	 public BigDecimal getMrp() {
		 return mrp;
	 }

	 /**
	  *
	  * @param mrp
	  *     The mrp
	  */
	 public void setMrp(BigDecimal mrp) {
		 this.mrp = mrp;
	 }

	 @Override
	 public String toString() {
		 return ToStringBuilder.reflectionToString(this);
	 }

}

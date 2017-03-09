
package com.ailiens.optimusprime.autobots.rest.dto.n3ow.PricingEngineHistoryDTO;

import javax.annotation.Generated;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.math.BigDecimal;

@Generated("org.jsonschema2pojo")
public class Product {

	private String sku;
	private String brand;
	private String styleID;
	private BigDecimal tradeSP;
	private ApplicablePromotions applicablePromotions;
	private Object subBrand;
	private long quantity;
	private BigDecimal discount;
	private boolean affected;
	private Object freeItems;
	private BigDecimal nnnowCash;
	private String shippingMethod;
	private String categoryL1;
	private String categoryL2;
	private String categoryL3;
	private BigDecimal cartAdjustedDiscount;
	private String sourceState;
	private String destinationState;
	private BigDecimal value;
	private BigDecimal tax;
	private BigDecimal netAmount;
	private String taxClass;
	private BigDecimal sp;
	private BigDecimal mrp;

	/**
	 *
	 * @return
	 *     The sku
	 */
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
	 public void setSku(String sku) {
		 this.sku = sku;
	 }

	 /**
	  *
	  * @return
	  *     The brand
	  */
	 public String getBrand() {
		 return brand;
	 }

	 /**
	  *
	  * @param brand
	  *     The brand
	  */
	 public void setBrand(String brand) {
		 this.brand = brand;
	 }

	 /**
	  *
	  * @return
	  *     The styleID
	  */
	 public String getStyleID() {
		 return styleID;
	 }

	 /**
	  *
	  * @param styleID
	  *     The styleID
	  */
	 public void setStyleID(String styleID) {
		 this.styleID = styleID;
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
	  *     The applicablePromotions
	  */
	 public ApplicablePromotions getApplicablePromotions() {
		 return applicablePromotions;
	 }

	 /**
	  *
	  * @param applicablePromotions
	  *     The applicablePromotions
	  */
	 public void setApplicablePromotions(ApplicablePromotions applicablePromotions) {
		 this.applicablePromotions = applicablePromotions;
	 }

	 /**
	  *
	  * @return
	  *     The subBrand
	  */
	 public Object getSubBrand() {
		 return subBrand;
	 }

	 /**
	  *
	  * @param subBrand
	  *     The subBrand
	  */
	 public void setSubBrand(Object subBrand) {
		 this.subBrand = subBrand;
	 }

	 /**
	  *
	  * @return
	  *     The quantity
	  */
	 public long getQuantity() {
		 return quantity;
	 }

	 /**
	  *
	  * @param quantity
	  *     The quantity
	  */
	 public void setQuantity(long quantity) {
		 this.quantity = quantity;
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
	  *     The affected
	  */
	 public boolean isAffected() {
		 return affected;
	 }

	 /**
	  *
	  * @param affected
	  *     The affected
	  */
	 public void setAffected(boolean affected) {
		 this.affected = affected;
	 }

	 /**
	  *
	  * @return
	  *     The freeItems
	  */
	 public Object getFreeItems() {
		 return freeItems;
	 }

	 /**
	  *
	  * @param freeItems
	  *     The freeItems
	  */
	 public void setFreeItems(Object freeItems) {
		 this.freeItems = freeItems;
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
	  *     The shippingMethod
	  */
	 public String getShippingMethod() {
		 return shippingMethod;
	 }

	 /**
	  *
	  * @param shippingMethod
	  *     The shippingMethod
	  */
	 public void setShippingMethod(String shippingMethod) {
		 this.shippingMethod = shippingMethod;
	 }

	 /**
	  *
	  * @return
	  *     The categoryL1
	  */
	 public String getCategoryL1() {
		 return categoryL1;
	 }

	 /**
	  *
	  * @param categoryL1
	  *     The categoryL1
	  */
	 public void setCategoryL1(String categoryL1) {
		 this.categoryL1 = categoryL1;
	 }

	 /**
	  *
	  * @return
	  *     The categoryL2
	  */
	 public String getCategoryL2() {
		 return categoryL2;
	 }

	 /**
	  *
	  * @param categoryL2
	  *     The categoryL2
	  */
	 public void setCategoryL2(String categoryL2) {
		 this.categoryL2 = categoryL2;
	 }

	 /**
	  *
	  * @return
	  *     The categoryL3
	  */
	 public String getCategoryL3() {
		 return categoryL3;
	 }

	 /**
	  *
	  * @param categoryL3
	  *     The categoryL3
	  */
	 public void setCategoryL3(String categoryL3) {
		 this.categoryL3 = categoryL3;
	 }

	 /**
	  *
	  * @return
	  *     The cartAdjustedDiscount
	  */
	 public BigDecimal getCartAdjustedDiscount() {
		 return cartAdjustedDiscount;
	 }

	 /**
	  *
	  * @param cartAdjustedDiscount
	  *     The cartAdjustedDiscount
	  */
	 public void setCartAdjustedDiscount(BigDecimal cartAdjustedDiscount) {
		 this.cartAdjustedDiscount = cartAdjustedDiscount;
	 }

	 /**
	  *
	  * @return
	  *     The sourceState
	  */
	 public String getSourceState() {
		 return sourceState;
	 }

	 /**
	  *
	  * @param sourceState
	  *     The sourceState
	  */
	 public void setSourceState(String sourceState) {
		 this.sourceState = sourceState;
	 }

	 /**
	  *
	  * @return
	  *     The destinationState
	  */
	 public String getDestinationState() {
		 return destinationState;
	 }

	 /**
	  *
	  * @param destinationState
	  *     The destinationState
	  */
	 public void setDestinationState(String destinationState) {
		 this.destinationState = destinationState;
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
	  *     The taxClass
	  */
	 public String getTaxClass() {
		 return taxClass;
	 }

	 /**
	  *
	  * @param taxClass
	  *     The taxClass
	  */
	 public void setTaxClass(String taxClass) {
		 this.taxClass = taxClass;
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

package com.ailiens.optimusprime.autobots.rest.dto.n3ow.PricingEngineFallbackDTOs;

import java.math.BigDecimal;
import java.util.List;

public class PricingEngineResultDTO {

	private BigDecimal netAmount;
	private BigDecimal tradeSP;
	private BigDecimal totalTax;
	private BigDecimal cartSP;
	private BigDecimal MRP;
	private BigDecimal productDiscount;
	private BigDecimal cartDiscount;
	private BigDecimal totalDiscount;
	private BigDecimal productNNNowCash;
	private BigDecimal cartNNNowCash;
	private BigDecimal totalNNNowCash;
	private List<HitRuleAndDiscount> removedPromotions;


	public PricingEngineResultDTO(){

	}
	public BigDecimal getNetAmount() {
		return netAmount;
	}

	public void setNetAmount(BigDecimal netAmount) {
		this.netAmount = netAmount;
	}

	public BigDecimal getTradeSP() {
		return tradeSP;
	}

	public void setTradeSP(BigDecimal tradeSP) {
		this.tradeSP = tradeSP;
	}

	public BigDecimal getTotalTax() {
		return totalTax;
	}

	public void setTotalTax(BigDecimal totalTax) {
		this.totalTax = totalTax;
	}

	public BigDecimal getCartSP() {
		return cartSP;
	}

	public void setCartSP(BigDecimal cartSP) {
		this.cartSP = cartSP;
	}

	public BigDecimal getMRP() {
		return MRP;
	}

	public void setMRP(BigDecimal MRP) {
		this.MRP = MRP;
	}

	public BigDecimal getProductDiscount() {
		return productDiscount;
	}

	public void setProductDiscount(BigDecimal productDiscount) {
		this.productDiscount = productDiscount;
	}

	public BigDecimal getCartDiscount() {
		return cartDiscount;
	}

	public void setCartDiscount(BigDecimal cartDiscount) {
		this.cartDiscount = cartDiscount;
	}

	public BigDecimal getTotalDiscount() {
		return totalDiscount;
	}

	public void setTotalDiscount(BigDecimal totalDiscount) {
		this.totalDiscount = totalDiscount;
	}

	public BigDecimal getProductNNNowCash() {
		return productNNNowCash;
	}

	public void setProductNNNowCash(BigDecimal productNNNowCash) {
		this.productNNNowCash = productNNNowCash;
	}

	public BigDecimal getCartNNNowCash() {
		return cartNNNowCash;
	}

	public void setCartNNNowCash(BigDecimal cartNNNowCash) {
		this.cartNNNowCash = cartNNNowCash;
	}

	public BigDecimal getTotalNNNowCash() {
		return totalNNNowCash;
	}

	public void setTotalNNNowCash(BigDecimal totalNNNowCash) {
		this.totalNNNowCash = totalNNNowCash;
	}

	public List<HitRuleAndDiscount> getRemovedPromotions() {
		return removedPromotions;
	}

	public void setRemovedPromotions(List<HitRuleAndDiscount> removedPromotions) {
		this.removedPromotions = removedPromotions;
	}
}

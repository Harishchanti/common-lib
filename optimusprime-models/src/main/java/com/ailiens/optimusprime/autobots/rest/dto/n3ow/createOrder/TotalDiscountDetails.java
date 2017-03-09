
package com.ailiens.optimusprime.autobots.rest.dto.n3ow.createOrder;

import java.math.BigDecimal;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class TotalDiscountDetails {

	private BigDecimal productDiscount;
	private BigDecimal cartDiscount;
	private BigDecimal totalDiscount;

	/**
	 * 
	 * @return
	 *     The productDiscount
	 */
	public BigDecimal getProductDiscount() {
		return productDiscount;
	}
	public TotalDiscountDetails(){

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

}


package com.ailiens.optimusprime.autobots.web.rest.n3ow.dto.orderDetails;

import javax.annotation.Generated;
import java.math.BigDecimal;

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

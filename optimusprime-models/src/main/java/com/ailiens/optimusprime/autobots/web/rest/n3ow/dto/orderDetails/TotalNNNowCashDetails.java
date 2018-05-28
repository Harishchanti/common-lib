
package com.ailiens.optimusprime.autobots.web.rest.n3ow.dto.orderDetails;

import java.math.BigDecimal;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class TotalNNNowCashDetails {

    private BigDecimal productNNNowCash = new BigDecimal(0.0);
    private BigDecimal cartNNNowCash = new BigDecimal(0.0);
    private BigDecimal totalNNNowCash = new BigDecimal(0.0);

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

}

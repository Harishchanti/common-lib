
package com.ailiens.optimusprime.autobots.web.rest.n3ow.dto.returnDetailsDTO;

import org.apache.commons.lang.builder.ToStringBuilder;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class RefundTotalDiscountDetails {

    private String refundProductDiscount;
    private String refundCartDiscount;
    private String refundTotalDiscount;

    public RefundTotalDiscountDetails() {
        super();
    }
    /**
     *
     * @return
     *     The refundProductDiscount
     */
    public String getRefundProductDiscount() {
        return refundProductDiscount;
    }

    /**
     *
     * @param refundProductDiscount
     *     The refundProductDiscount
     */
    public void setRefundProductDiscount(String refundProductDiscount) {
        this.refundProductDiscount = refundProductDiscount;
    }

    /**
     *
     * @return
     *     The refundCartDiscount
     */
    public String getRefundCartDiscount() {
        return refundCartDiscount;
    }

    /**
     *
     * @param refundCartDiscount
     *     The refundCartDiscount
     */
    public void setRefundCartDiscount(String refundCartDiscount) {
        this.refundCartDiscount = refundCartDiscount;
    }

    /**
     *
     * @return
     *     The refundTotalDiscount
     */
    public String getRefundTotalDiscount() {
        return refundTotalDiscount;
    }

    /**
     *
     * @param refundTotalDiscount
     *     The refundTotalDiscount
     */
    public void setRefundTotalDiscount(String refundTotalDiscount) {
        this.refundTotalDiscount = refundTotalDiscount;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}

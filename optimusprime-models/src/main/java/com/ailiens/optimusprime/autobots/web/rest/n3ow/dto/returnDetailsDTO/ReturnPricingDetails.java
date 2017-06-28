
package com.ailiens.optimusprime.autobots.web.rest.n3ow.dto.returnDetailsDTO;

import org.apache.commons.lang.builder.ToStringBuilder;

import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.List;

@Generated("org.jsonschema2pojo")
public class ReturnPricingDetails {

    private String refundNetAmount;
    private String refundTradeSP;
    private String refundTotalTax;
    private String refundNetAmountWithShipping;
    private RefundTotalDiscountDetails refundTotalDiscountDetails;
    private RefundTotalNNNowCashDetails refundTotalNNNowCashDetails;
    private List<RefundHitRule> refundHitRule = new ArrayList<RefundHitRule>();

    public ReturnPricingDetails() {
        super();
    }
    /**
     *
     * @return
     *     The refundNetAmount
     */
    public String getRefundNetAmount() {
        return refundNetAmount;
    }

    /**
     *
     * @param refundNetAmount
     *     The refundNetAmount
     */
    public void setRefundNetAmount(String refundNetAmount) {
        this.refundNetAmount = refundNetAmount;
    }

    /**
     *
     * @return
     *     The refundTradeSP
     */
    public String getRefundTradeSP() {
        return refundTradeSP;
    }

    /**
     *
     * @param refundTradeSP
     *     The refundTradeSP
     */
    public void setRefundTradeSP(String refundTradeSP) {
        this.refundTradeSP = refundTradeSP;
    }

    /**
     *
     * @return
     *     The refundTotalTax
     */
    public String getRefundTotalTax() {
        return refundTotalTax;
    }

    /**
     *
     * @param refundTotalTax
     *     The refundTotalTax
     */
    public void setRefundTotalTax(String refundTotalTax) {
        this.refundTotalTax = refundTotalTax;
    }

    /**
     *
     * @return
     *     The refundTotalDiscountDetails
     */
    public RefundTotalDiscountDetails getRefundTotalDiscountDetails() {
        return refundTotalDiscountDetails;
    }

    /**
     *
     * @param refundTotalDiscountDetails
     *     The refundTotalDiscountDetails
     */
    public void setRefundTotalDiscountDetails(RefundTotalDiscountDetails refundTotalDiscountDetails) {
        this.refundTotalDiscountDetails = refundTotalDiscountDetails;
    }

    /**
     *
     * @return
     *     The refundTotalNNNowCashDetails
     */
    public RefundTotalNNNowCashDetails getRefundTotalNNNowCashDetails() {
        return refundTotalNNNowCashDetails;
    }

    /**
     *
     * @param refundTotalNNNowCashDetails
     *     The refundTotalNNNowCashDetails
     */
    public void setRefundTotalNNNowCashDetails(RefundTotalNNNowCashDetails refundTotalNNNowCashDetails) {
        this.refundTotalNNNowCashDetails = refundTotalNNNowCashDetails;
    }

    /**
     *
     * @return
     *     The refundHitRule
     */
    public List<RefundHitRule> getRefundHitRule() {
        return refundHitRule;
    }

    /**
     *
     * @param refundHitRule
     *     The refundHitRule
     */
    public void setRefundHitRule(List<RefundHitRule> refundHitRule) {
        this.refundHitRule = refundHitRule;
    }

    public String getRefundNetAmountWithShipping() {
        return refundNetAmountWithShipping;
    }

    public void setRefundNetAmountWithShipping(String refundNetAmountWithShipping) {
        this.refundNetAmountWithShipping = refundNetAmountWithShipping;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}

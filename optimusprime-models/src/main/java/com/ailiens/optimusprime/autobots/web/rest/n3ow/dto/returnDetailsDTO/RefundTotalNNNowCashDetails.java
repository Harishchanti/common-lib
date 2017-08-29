
package com.ailiens.optimusprime.autobots.web.rest.n3ow.dto.returnDetailsDTO;

import javax.annotation.Generated;
import org.apache.commons.lang.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class RefundTotalNNNowCashDetails {

    private String refundProductNNNowCash;
    private String refundCartNNNowCash;
    private String refundTotalNNNowCash;

    /**
     *
     * @return
     *     The refundProductNNNowCash
     */
    public String getRefundProductNNNowCash() {
        return refundProductNNNowCash;
    }


    public RefundTotalNNNowCashDetails() {
        super();
    }

    /**
     *
     * @param refundProductNNNowCash
     *     The refundProductNNNowCash
     */
    public void setRefundProductNNNowCash(String refundProductNNNowCash) {
        this.refundProductNNNowCash = refundProductNNNowCash;
    }

    /**
     *
     * @return
     *     The refundCartNNNowCash
     */
    public String getRefundCartNNNowCash() {
        return refundCartNNNowCash;
    }

    /**
     *
     * @param refundCartNNNowCash
     *     The refundCartNNNowCash
     */
    public void setRefundCartNNNowCash(String refundCartNNNowCash) {
        this.refundCartNNNowCash = refundCartNNNowCash;
    }

    /**
     *
     * @return
     *     The refundTotalNNNowCash
     */
    public String getRefundTotalNNNowCash() {
        return refundTotalNNNowCash;
    }

    /**
     *
     * @param refundTotalNNNowCash
     *     The refundTotalNNNowCash
     */
    public void setRefundTotalNNNowCash(String refundTotalNNNowCash) {
        this.refundTotalNNNowCash = refundTotalNNNowCash;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}


package com.ailiens.optimusprime.autobots.web.rest.n3ow.dto.returnDetailsDTO;

import javax.annotation.Generated;
import org.apache.commons.lang.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class RefundStatus {

    private String transactionId;
    private String status;

    /**
     * 
     * @return
     *     The transactionId
     */
    public String getTransactionId() {
        return transactionId;
    }

    /**
     * 
     * @param transactionId
     *     The transactionId
     */
    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    /**
     * 
     * @return
     *     The status
     */
    public String getStatus() {
        return status;
    }

    /**
     * 
     * @param status
     *     The status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}

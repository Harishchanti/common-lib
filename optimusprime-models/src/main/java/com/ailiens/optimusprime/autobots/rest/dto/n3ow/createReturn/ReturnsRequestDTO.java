package com.ailiens.optimusprime.autobots.rest.dto.n3ow.createReturn;


import com.ailiens.optimusprime.autobots.rest.dto.RefundModesDTO;
import org.apache.commons.lang.builder.ToStringBuilder;

import javax.validation.constraints.NotNull;

public class ReturnsRequestDTO {

    public ReturnsRequestDTO()
    {
        this.returnOverride = false;
    }

    @NotNull
    private String itemId;

    private Long reasonId;

    private ReturnAddressDTO address;

    private String comment;

    @NotNull
    private String returnMode;

    private String neft;

    private String fcId;

    private boolean returnOverride;

    private String voucherId;

    private RefundModesDTO refundModes;

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public Long getReasonId() {
        return reasonId;
    }

    public void setReasonId(Long reasonId) {
        this.reasonId = reasonId;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) { this.comment = comment;
    }

    public String getReturnMode() {
        return returnMode;
    }

    public ReturnAddressDTO getAddress() {
        return address;
    }

    public void setAddress(ReturnAddressDTO address) {
        this.address = address;
    }

    public void setReturnMode(String returnMode) {
        this.returnMode = returnMode;
    }

    public String getNeft() {
        return neft;
    }

    public void setNeft(String neft) {
        this.neft = neft;
    }

    public String getFcId() {
        return fcId;
    }

    public void setFcId(String fcId) {
        this.fcId = fcId;
    }

    public boolean isReturnOverride() {
        return returnOverride;
    }

    public void setReturnOverride(boolean returnOverride) {
        this.returnOverride = returnOverride;
    }

    public String getVoucherId() {
        return voucherId;
    }

    public void setVoucherId(String voucherId) {
        this.voucherId = voucherId;
    }

    public RefundModesDTO getRefundModes() {
        return refundModes;
    }

    public void setRefundModes(RefundModesDTO refundModes) {
        this.refundModes = refundModes;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}

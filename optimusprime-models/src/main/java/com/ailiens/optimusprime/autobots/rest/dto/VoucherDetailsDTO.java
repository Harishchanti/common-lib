package com.ailiens.optimusprime.autobots.rest.dto;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

public class VoucherDetailsDTO {

    private List<Map<String, BigDecimal>> voucherIDs;
    private BigDecimal voucherAmount;

    public List<Map<String, BigDecimal>> getVoucherIDs() {
        return voucherIDs;
    }

    public void setVoucherIDs(List<Map<String, BigDecimal>> voucherIDs) {
        this.voucherIDs = voucherIDs;
    }

    public BigDecimal getVoucherAmount() {
        return voucherAmount;
    }

    public void setVoucherAmount(BigDecimal voucherAmount) {
        this.voucherAmount = voucherAmount;
    }

    @Override
    public String toString() {
        return "VoucherDetailsDTO{" +
            "voucherIDs=" + voucherIDs +
            ", voucherAmount=" + voucherAmount +
            '}';
    }
}

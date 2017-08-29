package com.ailiens.optimusprime.autobots.rest.dto;

import java.math.BigDecimal;

/**
 * Created by tech on 20/1/17.
 */
public class CouponDTO {
  private String CouponName;
  private Long accountId;
    private String orderId;

    public BigDecimal getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(BigDecimal orderAmount) {
        this.orderAmount = orderAmount;
    }

    private BigDecimal orderAmount;

    public String getCouponName() {
        return CouponName;
    }

    public void setCouponName(String couponName) {
        CouponName = couponName;
    }

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
}

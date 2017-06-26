package com.ailiens.optimusprime.domain;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

/**
 * A OrderPricing.
 */
@Entity
@Table(name = "order_pricing")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class OrderPricing implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "total_net_amount", precision=10, scale=2)
    private BigDecimal totalNetAmount;

    @Column(name = "total_trade_sp", precision=10, scale=2)
    private BigDecimal totalTradeSP;

    @Column(name = "total_sp", precision=10, scale=2)
    private BigDecimal totalSP;

    @Column(name = "total_tax", precision=10, scale=2)
    private BigDecimal totalTax;

    @Column(name = "total_product_discount", precision=10, scale=2)
    private BigDecimal totalProductDiscount;

    @Column(name = "total_cart_discount", precision=10, scale=2)
    private BigDecimal totalCartDiscount;

    @Column(name = "total_discount", precision=10, scale=2)
    private BigDecimal totalDiscount;

    @Column(name = "total_product_nnnow_cash", precision=10, scale=2)
    private BigDecimal totalProductNnnowCash;

    @Column(name = "total_cart_nnnow_cash", precision=10, scale=2)
    private BigDecimal totalCartNnnowCash;

    @Column(name = "total_nnnow_cash", precision=10, scale=2)
    private BigDecimal totalNnnowCash;

    @Column(name = "total_shipping_charge", precision=10, scale=2)
    private BigDecimal totalShippingCharge;

    @Column(name = "totalnet_amount_with_shipping", precision=10, scale=2)
    private BigDecimal totalnetAmountWithShipping;

    @Column(name = "total_cgst_amount", precision=10, scale=2)
    private BigDecimal totalCgstAmount;

    @Column(name = "total_sgst_amount", precision=10, scale=2)
    private BigDecimal totalSgstAmount;

    @Column(name = "total_igst_amount", precision=10, scale=2)
    private BigDecimal totalIgstAmount;

    @Column(name = "total_utgst_amount", precision=10, scale=2)
    private BigDecimal totalUtgstAmount;


    @ManyToOne
    @JoinColumn(name = "orders_id")
    private Orders orders;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getTotalNetAmount() {
        return totalNetAmount;
    }

    public void setTotalNetAmount(BigDecimal totalNetAmount) {
        this.totalNetAmount = totalNetAmount;
    }

    public BigDecimal getTotalTradeSP() {
        return totalTradeSP;
    }

    public void setTotalTradeSP(BigDecimal totalTradeSP) {
        this.totalTradeSP = totalTradeSP;
    }

    public BigDecimal getTotalSP() {
        return totalSP;
    }

    public void setTotalSP(BigDecimal totalSP) {
        this.totalSP = totalSP;
    }

    public BigDecimal getTotalTax() {
        return totalTax;
    }

    public void setTotalTax(BigDecimal totalTax) {
        this.totalTax = totalTax;
    }

    public BigDecimal getTotalProductDiscount() {
        return totalProductDiscount;
    }

    public void setTotalProductDiscount(BigDecimal totalProductDiscount) {
        this.totalProductDiscount = totalProductDiscount;
    }

    public BigDecimal getTotalCartDiscount() {
        return totalCartDiscount;
    }

    public void setTotalCartDiscount(BigDecimal totalCartDiscount) {
        this.totalCartDiscount = totalCartDiscount;
    }

    public BigDecimal getTotalDiscount() {
        return totalDiscount;
    }

    public void setTotalDiscount(BigDecimal totalDiscount) {
        this.totalDiscount = totalDiscount;
    }

    public BigDecimal getTotalProductNnnowCash() {
        return totalProductNnnowCash;
    }

    public void setTotalProductNnnowCash(BigDecimal totalProductNnnowCash) {
        this.totalProductNnnowCash = totalProductNnnowCash;
    }

    public BigDecimal getTotalCartNnnowCash() {
        return totalCartNnnowCash;
    }

    public void setTotalCartNnnowCash(BigDecimal totalCartNnnowCash) {
        this.totalCartNnnowCash = totalCartNnnowCash;
    }

    public BigDecimal getTotalNnnowCash() {
        return totalNnnowCash;
    }

    public void setTotalNnnowCash(BigDecimal totalNnnowCash) {
        this.totalNnnowCash = totalNnnowCash;
    }

    public BigDecimal getTotalShippingCharge() {
        return totalShippingCharge;
    }

    public void setTotalShippingCharge(BigDecimal totalShippingCharge) {
        this.totalShippingCharge = totalShippingCharge;
    }

    public BigDecimal getTotalnetAmountWithShipping() {
        return totalnetAmountWithShipping;
    }

    public void setTotalnetAmountWithShipping(BigDecimal totalnetAmountWithShipping) {
        this.totalnetAmountWithShipping = totalnetAmountWithShipping;
    }

    public BigDecimal getTotalCgstAmount() {
        return totalCgstAmount;
    }

    public void setTotalCgstAmount(BigDecimal totalCgstAmount) {
        this.totalCgstAmount = totalCgstAmount;
    }

    public BigDecimal getTotalSgstAmount() {
        return totalSgstAmount;
    }

    public void setTotalSgstAmount(BigDecimal totalSgstAmount) {
        this.totalSgstAmount = totalSgstAmount;
    }

    public BigDecimal getTotalIgstAmount() {
        return totalIgstAmount;
    }

    public BigDecimal getTotalUtgstAmount() {
        return totalUtgstAmount;
    }

    public void setTotalUtgstAmount(BigDecimal totalUtgstAmount) {
        this.totalUtgstAmount = totalUtgstAmount;
    }

    public void setTotalIgstAmount(BigDecimal totalIgstAmount) {
        this.totalIgstAmount = totalIgstAmount;
    }

    public Orders getOrders() {
        return orders;
    }

    public void setOrders(Orders orders) {
        this.orders = orders;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OrderPricing orderPricing = (OrderPricing) o;
        return Objects.equals(id, orderPricing.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "OrderPricing{" +
            "id=" + id +
            ", totalNetAmount='" + totalNetAmount + "'" +
            ", totalTradeSP='" + totalTradeSP + "'" +
            ", totalSP='" + totalSP + "'" +
            ", totalTax='" + totalTax + "'" +
            ", totalProductDiscount='" + totalProductDiscount + "'" +
            ", totalCartDiscount='" + totalCartDiscount + "'" +
            ", totalDiscount='" + totalDiscount + "'" +
            ", totalProductNnnowCash='" + totalProductNnnowCash + "'" +
            ", totalCartNnnowCash='" + totalCartNnnowCash + "'" +
            ", totalNnnowCash='" + totalNnnowCash + "'" +
            ", totalShippingCharge='" + totalShippingCharge + "'" +
            ", totalnetAmountWithShipping='" + totalnetAmountWithShipping + "'" +
            '}';
    }
}

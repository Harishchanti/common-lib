package com.ailiens.optimusprime.domain;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;
import java.util.Objects;

/**
 * A ReturnPricing.
 */
@Entity
@Table(name = "return_pricing")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class ReturnPricing implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "difference_net_amount", precision=10, scale=2)
    private BigDecimal differenceNetAmount;

    @Column(name = "difference_trade_sp", precision=10, scale=2)
    private BigDecimal differenceTradeSP;

    @Column(name = "difference_sp", precision=10, scale=2)
    private BigDecimal differenceSP;

    @Column(name = "difference_tax", precision=10, scale=2)
    private BigDecimal differenceTax;

    @Column(name = "difference_product_discount", precision=10, scale=2)
    private BigDecimal differenceProductDiscount;

    @Column(name = "difference_cart_discount", precision=10, scale=2)
    private BigDecimal differenceCartDiscount;

    @Column(name = "difference_total_discount", precision=10, scale=2)
    private BigDecimal differenceTotalDiscount;

    @Column(name = "difference_product_nnnow_cash", precision=10, scale=2)
    private BigDecimal differenceProductNnnowCash;

    @Column(name = "difference_cart_nnnow_cash", precision=10, scale=2)
    private BigDecimal differenceCartNnnowCash;

    @Column(name = "difference_total_nnnow_cash", precision=10, scale=2)
    private BigDecimal differenceTotalNnnowCash;

    @Column(name = "difference_shipping_charge", precision=10, scale=2)
    private BigDecimal differenceShippingCharge;

    @ManyToOne
    @JoinColumn(name = "returns_id")
    private Returns returns;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getDifferenceNetAmount() {
        return differenceNetAmount;
    }

    public void setDifferenceNetAmount(BigDecimal differenceNetAmount) {
        this.differenceNetAmount = differenceNetAmount;
    }

    public BigDecimal getDifferenceTradeSP() {
        return differenceTradeSP;
    }

    public void setDifferenceTradeSP(BigDecimal differenceTradeSP) {
        this.differenceTradeSP = differenceTradeSP;
    }

    public BigDecimal getDifferenceSP() {
        return differenceSP;
    }

    public void setDifferenceSP(BigDecimal differenceSP) {
        this.differenceSP = differenceSP;
    }

    public BigDecimal getDifferenceTax() {
        return differenceTax;
    }

    public void setDifferenceTax(BigDecimal differenceTax) {
        this.differenceTax = differenceTax;
    }

    public BigDecimal getDifferenceProductDiscount() {
        return differenceProductDiscount;
    }

    public void setDifferenceProductDiscount(BigDecimal differenceProductDiscount) {
        this.differenceProductDiscount = differenceProductDiscount;
    }

    public BigDecimal getDifferenceCartDiscount() {
        return differenceCartDiscount;
    }

    public void setDifferenceCartDiscount(BigDecimal differenceCartDiscount) {
        this.differenceCartDiscount = differenceCartDiscount;
    }

    public BigDecimal getDifferenceTotalDiscount() {
        return differenceTotalDiscount;
    }

    public void setDifferenceTotalDiscount(BigDecimal differenceTotalDiscount) {
        this.differenceTotalDiscount = differenceTotalDiscount;
    }

    public BigDecimal getDifferenceProductNnnowCash() {
        return differenceProductNnnowCash;
    }

    public void setDifferenceProductNnnowCash(BigDecimal differenceProductNnnowCash) {
        this.differenceProductNnnowCash = differenceProductNnnowCash;
    }

    public BigDecimal getDifferenceCartNnnowCash() {
        return differenceCartNnnowCash;
    }

    public void setDifferenceCartNnnowCash(BigDecimal differenceCartNnnowCash) {
        this.differenceCartNnnowCash = differenceCartNnnowCash;
    }

    public BigDecimal getDifferenceTotalNnnowCash() {
        return differenceTotalNnnowCash;
    }

    public void setDifferenceTotalNnnowCash(BigDecimal differenceTotalNnnowCash) {
        this.differenceTotalNnnowCash = differenceTotalNnnowCash;
    }

    public BigDecimal getDifferenceShippingCharge() {
        return differenceShippingCharge;
    }

    public void setDifferenceShippingCharge(BigDecimal differenceShippingCharge) {
        this.differenceShippingCharge = differenceShippingCharge;
    }

    public Returns getReturns() {
        return returns;
    }

    public void setReturns(Returns returns) {
        this.returns = returns;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ReturnPricing returnPricing = (ReturnPricing) o;
        return Objects.equals(id, returnPricing.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "ReturnPricing{" +
            "id=" + id +
            ", differenceNetAmount='" + differenceNetAmount + "'" +
            ", differenceTradeSP='" + differenceTradeSP + "'" +
            ", differenceSP='" + differenceSP + "'" +
            ", differenceTax='" + differenceTax + "'" +
            ", differenceProductDiscount='" + differenceProductDiscount + "'" +
            ", differenceCartDiscount='" + differenceCartDiscount + "'" +
            ", differenceTotalDiscount='" + differenceTotalDiscount + "'" +
            ", differenceProductNnnowCash='" + differenceProductNnnowCash + "'" +
            ", differenceCartNnnowCash='" + differenceCartNnnowCash + "'" +
            ", differenceTotalNnnowCash='" + differenceTotalNnnowCash + "'" +
            ", differenceShippingCharge='" + differenceShippingCharge + "'" +
            '}';
    }
}

package com.ailiens.optimusprime.domain;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Shipping taxes orderline level
 */
@Entity
@Table(name = "ShippingTaxes")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class ShippingTaxes implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "price_id")
    private String priceId;

    @Column(name = "amount", precision=10, scale=2)
    private BigDecimal amount;

    @Column(name = "cgst_amount", precision=10, scale=2)
    private BigDecimal cgstAmount;

    @Column(name = "sgst_amount", precision=10, scale=2)
    private BigDecimal sgstAmount;

    @Column(name = "igst_amount", precision=10, scale=2)
    private BigDecimal igstAmount;

    @Column(name = "utgst_amount", precision=10, scale=2)
    private BigDecimal utgstAmount;

    @Column(name = "cgst_percentage", precision=10, scale=2)
    private BigDecimal cgstPercentage;

    @Column(name = "sgst_percentage", precision=10, scale=2)
    private BigDecimal sgstPercentage;

    @Column(name = "igst_percentage", precision=10, scale=2)
    private BigDecimal igstPercentage;

    @Column(name = "utgst_percentage", precision=10, scale=2)
    private BigDecimal utgstPercentage;



    @Column(name = "order_line_id")
    private Long orderLine;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPriceId() {
        return priceId;
    }

    public void setPriceId(String priceId) {
        this.priceId = priceId;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getCgstAmount() {
        return cgstAmount;
    }

    public void setCgstAmount(BigDecimal cgstAmount) {
        this.cgstAmount = cgstAmount;
    }

    public BigDecimal getSgstAmount() {
        return sgstAmount;
    }

    public void setSgstAmount(BigDecimal sgstAmount) {
        this.sgstAmount = sgstAmount;
    }

    public BigDecimal getIgstAmount() {
        return igstAmount;
    }

    public void setIgstAmount(BigDecimal igstAmount) {
        this.igstAmount = igstAmount;
    }

    public BigDecimal getCgstPercentage() {
        return cgstPercentage;
    }

    public void setCgstPercentage(BigDecimal cgstPercentage) {
        this.cgstPercentage = cgstPercentage;
    }

    public BigDecimal getSgstPercentage() {
        return sgstPercentage;
    }

    public void setSgstPercentage(BigDecimal sgstPercentage) {
        this.sgstPercentage = sgstPercentage;
    }

    public BigDecimal getIgstPercentage() {
        return igstPercentage;
    }

    public void setIgstPercentage(BigDecimal igstPercentage) {
        this.igstPercentage = igstPercentage;
    }

    public BigDecimal getUtgstAmount() {
        return utgstAmount;
    }

    public void setUtgstAmount(BigDecimal utgstAmount) {
        this.utgstAmount = utgstAmount;
    }

    public BigDecimal getUtgstPercentage() {
        return utgstPercentage;
    }

    public void setUtgstPercentage(BigDecimal utgstPercentage) {
        this.utgstPercentage = utgstPercentage;
    }

    public Long getOrderLine() {
        return orderLine;
    }

    public void setOrderLine(Long orderLine) {
        this.orderLine = orderLine;
    }


    @Override
    public String toString() {
        return "ShippingTaxes{" +
            "id=" + id +
            ", priceId='" + priceId + '\'' +
            ", amount=" + amount +
            ", cgstAmount=" + cgstAmount +
            ", sgstAmount=" + sgstAmount +
            ", igstAmount=" + igstAmount +
            ", utgstAmount=" + utgstAmount +
            ", cgstPercentage=" + cgstPercentage +
            ", sgstPercentage=" + sgstPercentage +
            ", igstPercentage=" + igstPercentage +
            ", utgstPercentage=" + utgstPercentage +
            ", orderLine=" + orderLine +
            '}';
    }
}


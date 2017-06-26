package com.ailiens.optimusprime.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

/**
 * A Price.
 */
@Entity
@Table(name = "price")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class Price implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "price_id")
    private String priceId;

    @Column(name = "final_price", precision=10, scale=2)
    private BigDecimal finalPrice;

    @Column(name = "original_price", precision=10, scale=2)
    private BigDecimal originalPrice;

    @Column(name = "sp", precision=10, scale=2)
    private BigDecimal sp;

    @Column(name = "nnnow_cash", precision=10, scale=2)
    private BigDecimal nnnowCash;

    @Column(name = "tax_class")
    private String taxClass;

    @Column(name = "trade_sp", precision=10, scale=2)
    private BigDecimal tradeSp;

    @Column(name = "net_amount_with_shipping", precision=10, scale=2)
    private BigDecimal netAmountWithShipping;

    @Column(name = "tax_exclusive")
    private Boolean taxExclusive;

    @Column(name = "hsn")
    private String hsn;


    @OneToOne(mappedBy = "price")
    @JsonIgnore
    private OrderLine orderLine;

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

    public BigDecimal getFinalPrice() {
        return finalPrice;
    }

    public void setFinalPrice(BigDecimal finalPrice) {
        this.finalPrice = finalPrice;
    }

    public BigDecimal getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(BigDecimal originalPrice) {
        this.originalPrice = originalPrice;
    }

    public BigDecimal getSp() {
        return sp;
    }

    public void setSp(BigDecimal sp) {
        this.sp = sp;
    }

    public BigDecimal getNnnowCash() {
        return nnnowCash;
    }

    public void setNnnowCash(BigDecimal nnnowCash) {
        this.nnnowCash = nnnowCash;
    }

    public String getTaxClass() {
        return taxClass;
    }

    public void setTaxClass(String taxClass) {
        this.taxClass = taxClass;
    }

    public BigDecimal getTradeSp() {
        return tradeSp;
    }

    public void setTradeSp(BigDecimal tradeSp) {
        this.tradeSp = tradeSp;
    }

    public BigDecimal getNetAmountWithShipping() {
        return netAmountWithShipping;
    }

    public void setNetAmountWithShipping(BigDecimal netAmountWithShipping) {
        this.netAmountWithShipping = netAmountWithShipping;
    }

    public Boolean getTaxExclusive() {
        return taxExclusive;
    }

    public void setTaxExclusive(Boolean taxExclusive) {
        this.taxExclusive = taxExclusive;
    }

    public String getHsn() {
        return hsn;
    }

    public void setHsn(String hsn) {
        this.hsn = hsn;
    }

    public OrderLine getOrderLine() {
        return orderLine;
    }

    public void setOrderLine(OrderLine orderLine) {
        this.orderLine = orderLine;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Price price = (Price) o;
        return Objects.equals(id, price.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "Price{" +
            "id=" + id +
            ", priceId='" + priceId + "'" +
            ", finalPrice='" + finalPrice + "'" +
            ", originalPrice='" + originalPrice + "'" +
            ", sp='" + sp + "'" +
            ", nnnowCash='" + nnnowCash + "'" +
            ", taxClass='" + taxClass + "'" +
            ", tradeSp='" + tradeSp + "'" +
            ", netAmountWithShipping='" + netAmountWithShipping + "'" +
            ", taxExclusive='" + taxExclusive + "'" +
            ", hsn='" + hsn + "'" +
            '}';
    }
}

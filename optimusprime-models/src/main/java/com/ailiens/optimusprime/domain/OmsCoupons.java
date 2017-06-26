package com.ailiens.optimusprime.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

/**
 * A OmsCoupons.
 */
@Entity
@Table(name = "oms_coupons")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class OmsCoupons implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "coupon_names")
    private String couponNames;

    @ManyToOne
    @JoinColumn(name="account_id")
    private Accounts couponsAcc;

    @OneToOne
    @JoinColumn(name="order_id")
    @JsonIgnore
    private Orders omsOrders;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCouponNames() {
        return couponNames;
    }

    public OmsCoupons couponNames(String couponNames) {
        this.couponNames = couponNames;
        return this;
    }

    public void setCouponNames(String couponNames) {
        this.couponNames = couponNames;
    }

    public Accounts getCouponsAcc() {
        return couponsAcc;
    }

    public OmsCoupons couponsAcc(Accounts accounts) {
        this.couponsAcc = accounts;
        return this;
    }

    public void setCouponsAcc(Accounts accounts) {
        this.couponsAcc = accounts;
    }

    public Orders getOmsOrders() {
        return omsOrders;
    }

    public OmsCoupons omsOrders(Orders orders) {
        this.omsOrders = orders;
        return this;
    }

    public void setOmsOrders(Orders orders) {
        this.omsOrders = orders;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OmsCoupons omsCoupons = (OmsCoupons) o;
        if(omsCoupons.id == null || id == null) {
            return false;
        }
        return Objects.equals(id, omsCoupons.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "OmsCoupons{" +
            "id=" + id +
            ", couponNames='" + couponNames + "'" +
            '}';
    }
}

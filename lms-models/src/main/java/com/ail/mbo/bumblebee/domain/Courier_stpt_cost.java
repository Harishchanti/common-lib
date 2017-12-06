package com.ail.mbo.bumblebee.domain;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;
import java.util.Objects;

/**
 * A Courier_stpt_cost.
 */
@Entity
@Table(name = "COURIER_STPT_COST")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class Courier_stpt_cost implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    @Column(name = "cost_flat", precision=10, scale=2, nullable = false)
    private BigDecimal cost_flat;

    @NotNull
    @Column(name = "cost_percent", precision=10, scale=2, nullable = false)
    private BigDecimal cost_percent;

    @ManyToOne
    private Courier courier;

    @ManyToOne
    private Payment_service_mapper payment_service_mapper;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getCost_flat() {
        return cost_flat;
    }

    public void setCost_flat(BigDecimal cost_flat) {
        this.cost_flat = cost_flat;
    }

    public BigDecimal getCost_percent() {
        return cost_percent;
    }

    public void setCost_percent(BigDecimal cost_percent) {
        this.cost_percent = cost_percent;
    }

    public Courier getCourier() {
        return courier;
    }

    public void setCourier(Courier courier) {
        this.courier = courier;
    }

    public Payment_service_mapper getPayment_service_mapper() {
        return payment_service_mapper;
    }

    public void setPayment_service_mapper(Payment_service_mapper payment_service_mapper) {
        this.payment_service_mapper = payment_service_mapper;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Courier_stpt_cost courier_stpt_cost = (Courier_stpt_cost) o;

        if ( ! Objects.equals(id, courier_stpt_cost.id)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "Courier_stpt_cost{" +
                "id=" + id +
                ", cost_flat='" + cost_flat + "'" +
                ", cost_percent='" + cost_percent + "'" +
                '}';
    }
}

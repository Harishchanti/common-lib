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
 * A ReturnCourierCost.
 */
@Entity
@Table(name = "RETURNCOURIERCOST")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class ReturnCourierCost implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    @Column(name = "cost_flat", precision=10, scale=2, nullable = false)
    private BigDecimal costFlat;

    @NotNull
    @Column(name = "cost_percent", precision=10, scale=2, nullable = false)
    private BigDecimal costPercent;

    @ManyToOne
    private Courier courier;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getCostFlat() {
        return costFlat;
    }

    public void setCostFlat(BigDecimal costFlat) {
        this.costFlat = costFlat;
    }

    public BigDecimal getCostPercent() {
        return costPercent;
    }

    public void setCostPercent(BigDecimal costPercent) {
        this.costPercent = costPercent;
    }

    public Courier getCourier() {
        return courier;
    }

    public void setCourier(Courier courier) {
        this.courier = courier;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        ReturnCourierCost returnCourierCost = (ReturnCourierCost) o;

        if ( ! Objects.equals(id, returnCourierCost.id)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "ReturnCourierCost{" +
                "id=" + id +
                ", costFlat='" + costFlat + "'" +
                ", costPercent='" + costPercent + "'" +
                '}';
    }
}

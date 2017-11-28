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
 * A ReturnTatCostMatrix.
 */
@Entity
@Table(name = "RETURNTATCOSTMATRIX")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class ReturnTatCostMatrix implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    @Column(name = "basic_cost", precision=10, scale=2, nullable = false)
    private BigDecimal basicCost;

    @NotNull
    @Column(name = "fixed_addon_cost", precision=10, scale=2, nullable = false)
    private BigDecimal fixedAddonCost;

    @NotNull
    @Column(name = "variable_addon_percent", precision=10, scale=2, nullable = false)
    private BigDecimal variableAddonPercent;

    @NotNull
    @Column(name = "tat", nullable = false)
    private Long tat;

    @Column(name = "total_cost", precision=10, scale=2, nullable = false)
    private BigDecimal totalCost;

    @ManyToOne
    @JoinColumn(name="source_city_id")
    private City sourceCity;

    @ManyToOne
    @JoinColumn(name="destination_city_id")
    private City destinationCity;

    @ManyToOne
    private Courier courier;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getBasicCost() {
        return basicCost;
    }

    public void setBasicCost(BigDecimal basicCost) {
        this.basicCost = basicCost;
    }

    public BigDecimal getFixedAddonCost() {
        return fixedAddonCost;
    }

    public void setFixedAddonCost(BigDecimal fixedAddonCost) {
        this.fixedAddonCost = fixedAddonCost;
    }

    public BigDecimal getVariableAddonPercent() {
        return variableAddonPercent;
    }

    public void setVariableAddonPercent(BigDecimal variableAddonPercent) {
        this.variableAddonPercent = variableAddonPercent;
    }

    public Long getTat() {
        return tat;
    }

    public void setTat(Long tat) {
        this.tat = tat;
    }

    public BigDecimal getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(BigDecimal totalCost) {
        this.totalCost = totalCost;
    }

    public City getSourceCity() {
        return sourceCity;
    }

    public void setSourceCity(City city) {
        this.sourceCity = city;
    }

    public City getDestinationCity() {
        return destinationCity;
    }

    public void setDestinationCity(City city) {
        this.destinationCity = city;
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

        ReturnTatCostMatrix returnTatCostMatrix = (ReturnTatCostMatrix) o;

        if ( ! Objects.equals(id, returnTatCostMatrix.id)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "ReturnTatCostMatrix{" +
                "id=" + id +
                ", basicCost='" + basicCost + "'" +
                ", fixedAddonCost='" + fixedAddonCost + "'" +
                ", variableAddonPercent='" + variableAddonPercent + "'" +
                ", tat='" + tat + "'" +
                ", totalCost='" + totalCost + "'" +
                '}';
    }
}

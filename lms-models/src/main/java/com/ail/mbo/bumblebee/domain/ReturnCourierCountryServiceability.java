package com.ail.mbo.bumblebee.domain;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import java.util.Objects;

/**
 * A ReturnCourierCountryServiceability.
 */
@Entity
@Table(name = "RETURNCOURIERCOUNTRYSERVICEABILITY")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class ReturnCourierCountryServiceability implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "is_enabled")
    private Boolean is_enabled;

    @NotNull
    @Column(name = "shipment_capacity", nullable = false)
    private Integer shipment_capacity;

    @ManyToOne
    private Courier courier;

    @ManyToOne
    private Country country;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getIs_enabled() {
        return is_enabled;
    }

    public void setIs_enabled(Boolean is_enabled) {
        this.is_enabled = is_enabled;
    }

    public Integer getShipment_capacity() {
        return shipment_capacity;
    }

    public void setShipment_capacity(Integer shipment_capacity) {
        this.shipment_capacity = shipment_capacity;
    }

    public Courier getCourier() {
        return courier;
    }

    public void setCourier(Courier courier) {
        this.courier = courier;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        ReturnCourierCountryServiceability returnCourierCountryServiceability = (ReturnCourierCountryServiceability) o;

        if ( ! Objects.equals(id, returnCourierCountryServiceability.id)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "ReturnCourierCountryServiceability{" +
                "id=" + id +
                ", is_enabled='" + is_enabled + "'" +
                ", shipment_capacity='" + shipment_capacity + "'" +
                '}';
    }
}

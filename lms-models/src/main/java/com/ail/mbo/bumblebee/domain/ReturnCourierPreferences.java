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
 * A ReturnCourierPreferences.
 */
@Entity
@Table(name = "RETURNCOURIERPREFERENCES")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class ReturnCourierPreferences implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    @Column(name = "priority", nullable = false)
    private Integer priority;

    @NotNull
    @Column(name = "shipment_limit", nullable = false)
    private Integer shipmentLimit;

    @Column(name = "is_enabled")
    private Boolean isEnabled;

    @ManyToOne
    @JoinColumn(name="sourcecluster_id")
    private Source_cluster sourceCluster;

    @ManyToOne
    @JoinColumn(name="destinationcluster_id")
    private Dest_cluster destinationCluster;

    @ManyToOne
    private Courier courier;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public Integer getShipmentLimit() {
        return shipmentLimit;
    }

    public void setShipmentLimit(Integer shipmentLimit) {
        this.shipmentLimit = shipmentLimit;
    }

    public Boolean getIsEnabled() {
        return isEnabled;
    }

    public void setIsEnabled(Boolean isEnabled) {
        this.isEnabled = isEnabled;
    }

    public Source_cluster getSourceCluster() {
        return sourceCluster;
    }

    public void setSourceCluster(Source_cluster source_cluster) {
        this.sourceCluster = source_cluster;
    }

    public Dest_cluster getDestinationCluster() {
        return destinationCluster;
    }

    public void setDestinationCluster(Dest_cluster dest_cluster) {
        this.destinationCluster = dest_cluster;
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

        ReturnCourierPreferences returnCourierPreferences = (ReturnCourierPreferences) o;

        if ( ! Objects.equals(id, returnCourierPreferences.id)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "ReturnCourierPreferences{" +
                "id=" + id +
                ", priority='" + priority + "'" +
                ", shipmentLimit='" + shipmentLimit + "'" +
                ", isEnabled='" + isEnabled + "'" +
                '}';
    }
}

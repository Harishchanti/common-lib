package com.ailiens.optimusprime.domain;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import java.util.Objects;

/**
 * A ReturnConsignment.
 */
@Entity
@Table(name = "return_consignment")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class ReturnConsignment implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "consignment_id")
    private String consignmentId;

    @OneToOne    private Logistics logistics;

    @ManyToOne    private FullfilmentCenter returnLocation;

    @ManyToOne    private FullfilmentCenter warehouse;

    @ManyToOne
    @JoinColumn(name = "return_consignment_states_id")
    private RetConStates returnConsignmentStates;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getConsignmentId() {
        return consignmentId;
    }

    public void setConsignmentId(String consignmentId) {
        this.consignmentId = consignmentId;
    }

    public Logistics getLogistics() {
        return logistics;
    }

    public void setLogistics(Logistics logistics) {
        this.logistics = logistics;
    }

    public FullfilmentCenter getReturnLocation() {
        return returnLocation;
    }

    public void setReturnLocation(FullfilmentCenter fullfilmentCenter) {
        this.returnLocation = fullfilmentCenter;
    }

    public FullfilmentCenter getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(FullfilmentCenter fullfilmentCenter) {
        this.warehouse = fullfilmentCenter;
    }

    public RetConStates getReturnConsignmentStates() {
        return returnConsignmentStates;
    }

    public void setReturnConsignmentStates(RetConStates retConStates) {
        this.returnConsignmentStates = retConStates;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ReturnConsignment returnConsignment = (ReturnConsignment) o;
        return Objects.equals(id, returnConsignment.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "ReturnConsignment{" +
            "id=" + id +
            ", consignmentId='" + consignmentId + "'" +
            '}';
    }
}

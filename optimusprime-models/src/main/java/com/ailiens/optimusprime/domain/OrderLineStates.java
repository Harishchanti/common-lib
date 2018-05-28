package com.ailiens.optimusprime.domain;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

/**
 * A OrderLineStates.
 */
@Entity
@Table(name = "order_line_states")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class OrderLineStates implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "type")
    private String type;

    @Column(name = "status_to_customer")
    private String statusToCustomer;

    @Column(name = "status_to_oms")
    private String statusToOms;

    @Column(name = "processing_sequence")
    private Float processingSequence;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStatusToCustomer() {
        return statusToCustomer;
    }

    public void setStatusToCustomer(String statusToCustomer) {
        this.statusToCustomer = statusToCustomer;
    }

    public String getStatusToOms() {
        return statusToOms;
    }

    public void setStatusToOms(String statusToOms) {
        this.statusToOms = statusToOms;
    }

    public Float getProcessingSequence() {
        return processingSequence;
    }

    public void setProcessingSequence(Float processingSequence) {
        this.processingSequence = processingSequence;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OrderLineStates orderLineStates = (OrderLineStates) o;
        return Objects.equals(id, orderLineStates.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "OrderLineStates{" +
            "id=" + id +
            ", name='" + name + "'" +
            ", type='" + type + "'" +
            ", statusToCustomer='" + statusToCustomer + "'" +
            ", statusToOms='" + statusToOms + "'" +
            '}';
    }
}

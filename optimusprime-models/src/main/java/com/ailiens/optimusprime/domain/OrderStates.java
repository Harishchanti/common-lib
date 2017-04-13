package com.ailiens.optimusprime.domain;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

/**
 * A OrderStates.
 */
@Entity
@Table(name = "order_states")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class OrderStates implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "type")
    private String type;

    @Column(name = "order_status_to_customer")
    private String orderStatusToCustomer;

    @Column(name = "status_to_oms")
    private String statusToOms;

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

    public String getOrderStatusToCustomer() {
        return orderStatusToCustomer;
    }

    public void setOrderStatusToCustomer(String orderStatusToCustomer) {
        this.orderStatusToCustomer = orderStatusToCustomer;
    }

    public String getStatusToOms() {
        return statusToOms;
    }

    public void setStatusToOms(String statusToOms) {
        this.statusToOms = statusToOms;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OrderStates orderStates = (OrderStates) o;
        return Objects.equals(id, orderStates.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "OrderStates{" +
            "id=" + id +
            ", name='" + name + "'" +
            ", type='" + type + "'" +
            ", orderStatusToCustomer='" + orderStatusToCustomer + "'" +
            ", statusToOms='" + statusToOms + "'" +
            '}';
    }
}

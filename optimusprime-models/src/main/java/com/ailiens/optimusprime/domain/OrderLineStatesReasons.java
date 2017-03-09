package com.ailiens.optimusprime.domain;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import java.util.Objects;

/**
 * A OrderLineStatesReasons.
 */
@Entity
@Table(name = "order_line_states_reasons")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class OrderLineStatesReasons implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "reason")
    private String reason;

    @ManyToOne
    @JoinColumn(name = "order_line_states_id")
    private OrderLineStates orderLineStates;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public OrderLineStates getOrderLineStates() {
        return orderLineStates;
    }

    public void setOrderLineStates(OrderLineStates orderLineStates) {
        this.orderLineStates = orderLineStates;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OrderLineStatesReasons orderLineStatesReasons = (OrderLineStatesReasons) o;
        return Objects.equals(id, orderLineStatesReasons.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "OrderLineStatesReasons{" +
            "id=" + id +
            ", reason='" + reason + "'" +
            '}';
    }
}

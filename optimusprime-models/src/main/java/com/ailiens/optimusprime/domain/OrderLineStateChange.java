package com.ailiens.optimusprime.domain;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import java.time.ZonedDateTime;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import java.util.Objects;

/**
 * A OrderLineStateChange.
 */
@Entity
@Table(name = "order_line_state_change")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class OrderLineStateChange implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "comment")
    private String comment;

    @Column(name = "time")
    private ZonedDateTime time;

    @ManyToOne
    @JoinColumn(name = "order_line_id")
    private OrderLine orderLine;

    @ManyToOne
    @JoinColumn(name = "fullfilment_center_id")
    private FullfilmentCenter fullfilmentCenter;

    @ManyToOne
    @JoinColumn(name = "order_line_states_reasons_id")
    private OrderLineStatesReasons orderLineStatesReasons;

    @ManyToOne
    @JoinColumn(name = "to_state_id")
    private OrderLineStates toState;

    @ManyToOne
    @JoinColumn(name = "fullfilment_type_id")
    private FullfilmentType fullfilmentType;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public ZonedDateTime getTime() {
        return time;
    }

    public void setTime(ZonedDateTime time) {
        this.time = time;
    }

    public OrderLine getOrderLine() {
        return orderLine;
    }

    public void setOrderLine(OrderLine orderLine) {
        this.orderLine = orderLine;
    }

    public FullfilmentCenter getFullfilmentCenter() {
        return fullfilmentCenter;
    }

    public void setFullfilmentCenter(FullfilmentCenter fullfilmentCenter) {
        this.fullfilmentCenter = fullfilmentCenter;
    }

    public OrderLineStatesReasons getOrderLineStatesReasons() {
        return orderLineStatesReasons;
    }

    public void setOrderLineStatesReasons(OrderLineStatesReasons orderLineStatesReasons) {
        this.orderLineStatesReasons = orderLineStatesReasons;
    }

    public OrderLineStates getToState() {
        return toState;
    }

    public void setToState(OrderLineStates orderLineStates) {
        this.toState = orderLineStates;
    }

    public FullfilmentType getFullfilmentType() {
        return fullfilmentType;
    }

    public void setFullfilmentType(FullfilmentType fullfilmentType) {
        this.fullfilmentType = fullfilmentType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OrderLineStateChange orderLineStateChange = (OrderLineStateChange) o;
        return Objects.equals(id, orderLineStateChange.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "OrderLineStateChange{" +
            "id=" + id +
            ", comment='" + comment + "'" +
            ", time='" + time + "'" +
            '}';
    }
}

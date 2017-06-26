package com.ailiens.optimusprime.domain;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import java.io.Serializable;
import java.time.ZonedDateTime;
import java.util.Objects;

/**
 * A OrderStateChange.
 */
@Entity
@Table(name = "order_state_change")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class OrderStateChange implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "comment")
    private String comment;

    @Column(name = "time")
    private ZonedDateTime time;

    @ManyToOne
    @JoinColumn(name = "orders_id")
    private Orders orders;

    @ManyToOne
    @JoinColumn(name = "fullfilment_center_id")
    private FullfilmentCenter fullfilmentCenter;

    @ManyToOne
    @JoinColumn(name = "order_states_reasons_id")
    private OrderStatesReasons orderStatesReasons;

    @ManyToOne
    @JoinColumn(name = "to_state_id")
    private OrderStates toState;

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

    public Orders getOrders() {
        return orders;
    }

    public void setOrders(Orders orders) {
        this.orders = orders;
    }

    public FullfilmentCenter getFullfilmentCenter() {
        return fullfilmentCenter;
    }

    public void setFullfilmentCenter(FullfilmentCenter fullfilmentCenter) {
        this.fullfilmentCenter = fullfilmentCenter;
    }

    public OrderStatesReasons getOrderStatesReasons() {
        return orderStatesReasons;
    }

    public void setOrderStatesReasons(OrderStatesReasons orderStatesReasons) {
        this.orderStatesReasons = orderStatesReasons;
    }

    public OrderStates getToState() {
        return toState;
    }

    public void setToState(OrderStates orderStates) {
        this.toState = orderStates;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OrderStateChange orderStateChange = (OrderStateChange) o;
        return Objects.equals(id, orderStateChange.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "OrderStateChange{" +
            "id=" + id +
            ", comment='" + comment + "'" +
            ", time='" + time + "'" +
            '}';
    }
}

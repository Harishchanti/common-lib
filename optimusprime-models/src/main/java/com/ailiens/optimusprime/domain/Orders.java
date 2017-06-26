package com.ailiens.optimusprime.domain;

import com.ailiens.optimusprime.domain.enumeration.service;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.time.ZonedDateTime;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * A Orders.
 */
@Entity
@Table(name = "orders")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class Orders implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "order_id")
    private String orderId;

    @NotNull
    @Column(name = "order_date", nullable = false)
    private ZonedDateTime orderDate;

    @Enumerated(EnumType.STRING)
    @Column(name = "service")
    private service service;

    @Column(name = "ordering_channel")
    private String orderingChannel;

    @Column(name = "workflow_id")
    private String workflowId;

    @ManyToOne
    @JoinColumn(name = "order_states_id")
    private OrderStates orderStates;

    @OneToOne    private Accounts accounts;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "orders")
    @JsonIgnore
    @Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
    private Set<Payment> payments = new HashSet<>();

    @OneToMany(fetch=FetchType.EAGER,mappedBy = "orders")
    @JsonIgnore
    @Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
    private Set<Consignment> consignments = new HashSet<>();

    @OneToOne    private FullfilmentCenter orderingCenter;

    @OneToOne    private Accounts storeStaffDetails;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public ZonedDateTime getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(ZonedDateTime orderDate) {
        this.orderDate = orderDate;
    }

    public service getService() {
        return service;
    }

    public void setService(service service) {
        this.service = service;
    }

    public String getOrderingChannel() {
        return orderingChannel;
    }

    public void setOrderingChannel(String orderingChannel) {
        this.orderingChannel = orderingChannel;
    }

    public String getWorkflowId() {
        return workflowId;
    }

    public void setWorkflowId(String workflowId) {
        this.workflowId = workflowId;
    }

    public OrderStates getOrderStates() {
        return orderStates;
    }

    public void setOrderStates(OrderStates orderStates) {
        this.orderStates = orderStates;
    }

    public Accounts getAccounts() {
        return accounts;
    }

    public void setAccounts(Accounts accounts) {
        this.accounts = accounts;
    }

    public Set<Payment> getPayments() {
        return payments;
    }

    public void setPayments(Set<Payment> payments) {
        this.payments = payments;
    }

    public Set<Consignment> getConsignments() {
        return consignments;
    }

    public void setConsignments(Set<Consignment> consignments) {
        this.consignments = consignments;
    }

    public FullfilmentCenter getOrderingCenter() {
        return orderingCenter;
    }

    public void setOrderingCenter(FullfilmentCenter fullfilmentCenter) {
        this.orderingCenter = fullfilmentCenter;
    }

    public Accounts getStoreStaffDetails() {
        return storeStaffDetails;
    }

    public void setStoreStaffDetails(Accounts accounts) {
        this.storeStaffDetails = accounts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Orders orders = (Orders) o;
        return Objects.equals(id, orders.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "Orders{" +
            "id=" + id +
            ", orderId='" + orderId + "'" +
            ", orderDate='" + orderDate + "'" +
            ", service='" + service + "'" +
            ", workflowId='" + workflowId + "'" +
            '}';
    }
}

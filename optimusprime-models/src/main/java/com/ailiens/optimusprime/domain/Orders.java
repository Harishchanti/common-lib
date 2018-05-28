package com.ailiens.optimusprime.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import java.time.ZonedDateTime;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import java.util.Objects;

import com.ailiens.optimusprime.domain.enumeration.service;

/**
 * A Orders.
 */
@Entity
@Table(name = "orders")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class Orders implements Serializable {

    private static final long serialVersionUID = 1L;

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


    @Column(name = "order_reference")
    private String orderReference;

    @Column(name = "order_reference2")
    private String orderReference2;

    @Column(name = "source")
    private String source;

    @Column(name = "service_order_id")
    private String serviceOrderId;


    @ManyToOne
    @JoinColumn(name = "source_metadata_id")
    private SourceMetadata sourceMetadataId;

    @OneToOne private OrderPricing orderPricing;

    @Column(name = "images")
    private String images;

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Column(name = "tenant_id")
    private String tenantId;




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

    public OrderPricing getOrderPricing() {
        return orderPricing;
    }

    public void setOrderPricing(OrderPricing orderPricing) {
        this.orderPricing = orderPricing;
    }

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images;
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


    public String getOrderReference() {
        return orderReference;
    }

    public void setOrderReference(String orderReference) {
        this.orderReference = orderReference;
    }

    public String getOrderReference2() {
        return orderReference2;
    }

    public void setOrderReference2(String orderReference2) {
        this.orderReference2 = orderReference2;
    }

    public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getServiceOrderId() {
		return serviceOrderId;
	}

	public void setServiceOrderId(String serviceOrderId) {
		this.serviceOrderId = serviceOrderId;
	}

	public SourceMetadata getSourceMetadataId() {
		return sourceMetadataId;
	}

	public void setSourceMetadataId(SourceMetadata sourceMetadataId) {
		this.sourceMetadataId = sourceMetadataId;
	}

    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }


    @Override
    public String toString() {
        return "Orders{" +
            "id=" + id +
            ", orderId='" + orderId + '\'' +
            ", orderDate=" + orderDate +
            ", service=" + service +
            ", orderingChannel='" + orderingChannel + '\'' +
            ", workflowId='" + workflowId + '\'' +
            ", orderStates=" + orderStates +
            ", accounts=" + accounts +
            ", payments=" + payments +
            ", consignments=" + consignments +
            ", orderingCenter=" + orderingCenter +
            ", storeStaffDetails=" + storeStaffDetails +
            ", orderReference='" + orderReference + '\'' +
            ", orderReference2='" + orderReference2 + '\'' +
            ", source='" + source + '\'' +
            ", serviceOrderId='" + serviceOrderId + '\'' +
            ", sourceMetadataId=" + sourceMetadataId +
            ", orderPricing=" + orderPricing +
            ", images='" + images + '\'' +
            ", tenantId='" + tenantId + '\'' +
            '}';
    }
}

package com.ailiens.optimusprime.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.ZonedDateTime;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * A Consignment.
 */
@Entity
@Table(name = "consignment")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class Consignment implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "consignment_id")
    private String consignmentId;

    @Column(name = "sla_end_time")
    private ZonedDateTime slaEndTime;

    @Column(name = "workflow_id")
    private String workflowId;

    @ManyToOne
    @JoinColumn(name = "orders_id")
    private Orders orders;


    @OneToMany(fetch = FetchType.EAGER, mappedBy = "consignment")
    @JsonIgnore
    @Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
    private Set<OrderLine> orderLines = new HashSet<>();

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "consignment")
    @JsonIgnore
    @Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
    private Set<ConsignmentStatesChange> ConsignmentStatesChange = new HashSet<>();

    @ManyToOne
    @JoinColumn(name = "consignment_states_id")
    private ConsignmentStates consignmentStates;

    @ManyToOne
    @JoinColumn(name = "fullfilment_type_id")
    private FullfilmentType fullfilmentType;

    @OneToMany(mappedBy = "consignment")
    @JsonIgnore
    @Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
    private Set<Payment> payments = new HashSet<>();

    @Column(name = "customer_name")
    private String customerName;

    @Column(name = "fulfillment_center_id")
    private String fulfillmentCenterId;

    @Column(name ="fulfillment_center_name")
    private String fulfillmentCenterName;

    @Column(name="ordering_center_id")
    private String orderingCenterId;

    @Column(name="ordering_center_name")
    private String orderingCenterName;

    @Column(name="initial_delivery_type")
    private String initialDeliveryType;

    @Column(name="delivery_type")
    private String deliveryType;

    @Column(name="fc_type")
    private String fcType;

    @Column(name="order_type")
    private String orderType;

    @Column(name="delivery_Date")
    private ZonedDateTime deliveryDate;

    @Column(name="awb_number")
    private String awbNumber;

    @Column(name="item_count")
    private Integer itemCount;

    @Column(name="consignment_trade_sp")
    private BigDecimal consignmentTradeSp;

    @Column(name="consignment_net_amount")
    private BigDecimal consignmentNetAmount;

    @Column(name="consignment_stamp")
    private ZonedDateTime consignmentStamp;

    @Column(name="tenantId")
    private String tenantId;


 /*   @Column(name = "source")
    private String source;*/

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

    public ZonedDateTime getSlaEndTime() {
        return slaEndTime;
    }

    public void setSlaEndTime(ZonedDateTime slaEndTime) {
        this.slaEndTime = slaEndTime;
    }

    public String getInitialDeliveryType() {
        return initialDeliveryType;
    }

    public void setInitialDeliveryType(String initialDeliveryType) {
        this.initialDeliveryType = initialDeliveryType;
    }

    public String getDeliveryType() {
        return deliveryType;
    }

    public void setDeliveryType(String deliveryType) {
        this.deliveryType = deliveryType;
    }

    public String getWorkflowId() {
        return workflowId;
    }

    public void setWorkflowId(String workflowId) {
        this.workflowId = workflowId;
    }

    public Orders getOrders() {
        return orders;
    }

    public void setOrders(Orders orders) {
        this.orders = orders;
    }

    public Set<OrderLine> getOrderLines() {
        return orderLines;
    }

    public void setOrderLines(Set<OrderLine> orderLines) {
        this.orderLines = orderLines;
    }

    public ConsignmentStates getConsignmentStates() {
        return consignmentStates;
    }

    public void setConsignmentStates(ConsignmentStates consignmentStates) {
        this.consignmentStates = consignmentStates;
    }

    public FullfilmentType getFullfilmentType() {
        return fullfilmentType;
    }

    public void setFullfilmentType(FullfilmentType fullfilmentType) {
        this.fullfilmentType = fullfilmentType;
    }

    public Set<Payment> getPayments() {
        return payments;
    }

    public void setPayments(Set<Payment> payments) {
        this.payments = payments;
    }

    public String getFulfillmentCenterId() {
        return fulfillmentCenterId;
    }

    public void setFulfillmentCenterId(String fulfillmentCenterId) {
        this.fulfillmentCenterId = fulfillmentCenterId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getOrderingCenterId() {
        return orderingCenterId;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public void setOrderingCenterId(String orderingCenterId) {

        this.orderingCenterId = orderingCenterId;
    }

    public String getOrderingCenterName() {
        return orderingCenterName;
    }

    public void setOrderingCenterName(String orderingCenterName) {
        this.orderingCenterName = orderingCenterName;
    }

    public String getFulfillmentCenterName() {

        return fulfillmentCenterName;
    }

    public void setFulfillmentCenterName(String fulfillmentCenterName) {
        this.fulfillmentCenterName = fulfillmentCenterName;
    }

    public String getFcType() {
        return fcType;
    }

    public void setFcType(String fcType) {
        this.fcType = fcType;
    }

    public ZonedDateTime getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(ZonedDateTime deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public String getAwbNumber() {
        return awbNumber;
    }

    public void setAwbNumber(String awbNumber) {
        this.awbNumber = awbNumber;
    }

    public Integer getItemCount() {
        return itemCount;
    }

    public void setItemCount(Integer itemCount) {
        this.itemCount = itemCount;
    }

    public BigDecimal getConsignmentTradeSp() {
        return consignmentTradeSp;
    }

    public void setConsignmentTradeSp(BigDecimal consignmentTradeSp) {
        this.consignmentTradeSp = consignmentTradeSp;
    }

    public BigDecimal getConsignmentNetAmount() {
        return consignmentNetAmount;
    }

    public void setConsignmentNetAmount(BigDecimal consignmentNetAmount) {
        this.consignmentNetAmount = consignmentNetAmount;
    }

    public ZonedDateTime getConsignmentStamp() {
        return consignmentStamp;
    }

    public void setConsignmentStamp(ZonedDateTime consignmentStamp) {
        this.consignmentStamp = consignmentStamp;
    }


//
//    public Set<ConsignmentStatesChange> getConsignmentStatesChange() {
//		return ConsignmentStatesChange;
//	}
//
//	public void setConsignmentStatesChange(Set<ConsignmentStatesChange> consignmentStatesChange) {
//		ConsignmentStatesChange = consignmentStatesChange;
//	}

	public String getTenantId() {
		return tenantId;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}

	@Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Consignment consignment = (Consignment) o;
        return Objects.equals(id, consignment.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "Consignment{" +
            "id=" + id +
            ", consignmentId='" + consignmentId + "'" +
            ", slaEndTime='" + slaEndTime + "'" +
            ", deliveryType='" + deliveryType + "'" +
            ", workflowId='" + workflowId + "'" +
            '}';
    }

}

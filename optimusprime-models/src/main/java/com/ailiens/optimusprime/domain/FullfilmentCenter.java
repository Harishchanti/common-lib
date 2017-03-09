package com.ailiens.optimusprime.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import java.util.Objects;

/**
 * A FullfilmentCenter.
 */
@Entity
@Table(name = "fullfilment_center")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class FullfilmentCenter implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "fullfilment_center_id")
    private String fullfilmentCenterId;

    @Column(name = "fulfilment_center_name")
    private String fulfilmentCenterName;

    @Column(name = "sap_code")
    private String sapCode;

    @Column(name = "brand_id")
    private String brandId;

    @Column(name = "brand_name")
    private String brandName;

    @Column(name = "fc_type")
    private String fcType;

    @Column(name = "contact_no")
    private String contactNo;

    @Column(name = "post_code")
    private String postCode;

    @Column(name = "state")
    private String state;

    @Column(name = "quantity")
    private Integer quantity;

    @OneToOne(mappedBy = "fullfilmentCenter")
    @JsonIgnore
    private OrderLine orderLine;

    @OneToOne(mappedBy = "orderingCenter")
    @JsonIgnore
    private Orders orders;

    @OneToOne(mappedBy = "returnLocation")
    @JsonIgnore
    private Returns returns;


    public FullfilmentCenter(FullfilmentCenter fullfilmentCenter) {
        this.fullfilmentCenterId = fullfilmentCenter.fullfilmentCenterId;
        this.fulfilmentCenterName = fullfilmentCenter.fulfilmentCenterName;
        this.sapCode = fullfilmentCenter.sapCode;
        this.brandId = fullfilmentCenter.brandId;
        this.brandName = fullfilmentCenter.brandName;
        this.fcType = fullfilmentCenter.fcType;
        this.contactNo = fullfilmentCenter.contactNo;
        this.postCode = fullfilmentCenter.postCode;
        this.state = fullfilmentCenter.state;
        this.orderLine = fullfilmentCenter.orderLine;
        this.orders = fullfilmentCenter.orders;
        this.returns = fullfilmentCenter.returns;
    }

    public FullfilmentCenter() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFullfilmentCenterId() {
        return fullfilmentCenterId;
    }

    public void setFullfilmentCenterId(String fullfilmentCenterId) {
        this.fullfilmentCenterId = fullfilmentCenterId;
    }

    public String getFulfilmentCenterName() {
        return fulfilmentCenterName;
    }

    public void setFulfilmentCenterName(String fulfilmentCenterName) {
        this.fulfilmentCenterName = fulfilmentCenterName;
    }

    public String getSapCode() {
        return sapCode;
    }

    public void setSapCode(String sapCode) {
        this.sapCode = sapCode;
    }

    public String getBrandId() {
        return brandId;
    }

    public void setBrandId(String brandId) {
        this.brandId = brandId;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getFcType() {
        return fcType;
    }

    public void setFcType(String fcType) {
        this.fcType = fcType;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public OrderLine getOrderLine() {
        return orderLine;
    }

    public void setOrderLine(OrderLine orderLine) {
        this.orderLine = orderLine;
    }

    public Orders getOrders() {
        return orders;
    }

    public void setOrders(Orders orders) {
        this.orders = orders;
    }

    public Returns getReturns() {
        return returns;
    }

    public void setReturns(Returns returns) {
        this.returns = returns;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FullfilmentCenter fullfilmentCenter = (FullfilmentCenter) o;
        return Objects.equals(id, fullfilmentCenter.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "FullfilmentCenter{" +
            "id=" + id +
            ", fullfilmentCenterId='" + fullfilmentCenterId + "'" +
            ", fulfilmentCenterName='" + fulfilmentCenterName + "'" +
            ", sapCode='" + sapCode + "'" +
            ", brandId='" + brandId + "'" +
            ", brandName='" + brandName + "'" +
            ", fcType='" + fcType + "'" +
            ", contactNo='" + contactNo + "'" +
            ", postCode='" + postCode + "'" +
            ", state='" + state + "'" +
            ", quantity='" + quantity + "'" +
            '}';
    }
}

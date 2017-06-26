package com.ailiens.optimusprime.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import java.io.Serializable;
import java.time.ZonedDateTime;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * A Logistics.
 */
@Entity
@Table(name = "logistics")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class Logistics implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "logistics_id")
    private String logisticsId;

    @Column(name = "shipment_id")
    private String shipmentId;

    @Column(name = "delivery_date")
    private ZonedDateTime deliveryDate;

    @Column(name = "delivery_type")
    private String deliveryType;

    @Column(name = "delivery_status")
    private String deliveryStatus;

    @Column(name = "logistics_partner")
    private String logisticsPartner;

    @Column(name = "logistics_link")
    private String logisticsLink;

    @Column(name = "expected_delivery_date")
    private String expectedDeliveryDate;

    @Column(name = "awb_number")
    private String awbNumber;

    @Column(name = "service_type")
    private String serviceType;

    @Column(name = "bar_code")
    private String barCode;

    @Column(name = "cod_bar_code")
    private String codBarCode;

    @Column(name = "dc_code")
    private String dcCode;

    @Column(name = "cod_awb_number")
    private String codAwbNumber;

    @Column(name = "fedex_forward_shipment_type")
    private String fedexForwardShipmentType;

    @Column(name = "fedex_return_shipment_type")
    private String fedexReturnShipmentType;

    @Column(name = "fedex_forward_form_id")
    private String fedexForwardFormId;

    @Column(name = "fedex_return_form_id")
    private String fedexReturnFormId;

    @Column(name = "fedex_meter")
    private String fedexMeter;

    @Column(name = "country_code")
    private String countryCode;

    @Column(name = "city_code")
    private String cityCode;

    @Column(name = "fedex_bill_tc")
    private String fedexBillTc;

    @Column(name = "fedex_bill_dt")
    private String fedexBillDt;

    @OneToMany(mappedBy = "logistics")
    @JsonIgnore
    @Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
    private Set<OrderLine> orderLines = new HashSet<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogisticsId() {
        return logisticsId;
    }

    public void setLogisticsId(String logisticsId) {
        this.logisticsId = logisticsId;
    }

    public String getShipmentId() {
        return shipmentId;
    }

    public void setShipmentId(String shipmentId) {
        this.shipmentId = shipmentId;
    }

    public ZonedDateTime getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(ZonedDateTime deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public String getDeliveryType() {
        return deliveryType;
    }

    public void setDeliveryType(String deliveryType) {
        this.deliveryType = deliveryType;
    }

    public String getDeliveryStatus() {
        return deliveryStatus;
    }

    public void setDeliveryStatus(String deliveryStatus) {
        this.deliveryStatus = deliveryStatus;
    }

    public String getLogisticsPartner() {
        return logisticsPartner;
    }

    public void setLogisticsPartner(String logisticsPartner) {
        this.logisticsPartner = logisticsPartner;
    }

    public String getLogisticsLink() {
        return logisticsLink;
    }

    public void setLogisticsLink(String logisticsLink) {
        this.logisticsLink = logisticsLink;
    }

    public String getExpectedDeliveryDate() {
        return expectedDeliveryDate;
    }

    public void setExpectedDeliveryDate(String expectedDeliveryDate) {
        this.expectedDeliveryDate = expectedDeliveryDate;
    }

    public String getAwbNumber() {
        return awbNumber;
    }

    public void setAwbNumber(String awbNumber) {
        this.awbNumber = awbNumber;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public String getBarCode() {
        return barCode;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }

    public String getCodBarCode() {
        return codBarCode;
    }

    public void setCodBarCode(String codBarCode) {
        this.codBarCode = codBarCode;
    }

    public String getDcCode() {
        return dcCode;
    }

    public void setDcCode(String dcCode) {
        this.dcCode = dcCode;
    }

    public String getCodAwbNumber() {
        return codAwbNumber;
    }

    public void setCodAwbNumber(String codAwbNumber) {
        this.codAwbNumber = codAwbNumber;
    }

    public String getFedexForwardShipmentType() {
        return fedexForwardShipmentType;
    }

    public void setFedexForwardShipmentType(String fedexForwardShipmentType) {
        this.fedexForwardShipmentType = fedexForwardShipmentType;
    }

    public String getFedexReturnShipmentType() {
        return fedexReturnShipmentType;
    }

    public void setFedexReturnShipmentType(String fedexReturnShipmentType) {
        this.fedexReturnShipmentType = fedexReturnShipmentType;
    }

    public String getFedexForwardFormId() {
        return fedexForwardFormId;
    }

    public void setFedexForwardFormId(String fedexForwardFormId) {
        this.fedexForwardFormId = fedexForwardFormId;
    }

    public String getFedexReturnFormId() {
        return fedexReturnFormId;
    }

    public void setFedexReturnFormId(String fedexReturnFormId) {
        this.fedexReturnFormId = fedexReturnFormId;
    }

    public String getFedexMeter() {
        return fedexMeter;
    }

    public void setFedexMeter(String fedexMeter) {
        this.fedexMeter = fedexMeter;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public String getFedexBillTc() {
        return fedexBillTc;
    }

    public void setFedexBillTc(String fedexBillTc) {
        this.fedexBillTc = fedexBillTc;
    }

    public String getFedexBillDt() {
        return fedexBillDt;
    }

    public void setFedexBillDt(String fedexBillDt) {
        this.fedexBillDt = fedexBillDt;
    }

    public Set<OrderLine> getOrderLines() {
        return orderLines;
    }

    public void setOrderLines(Set<OrderLine> orderLines) {
        this.orderLines = orderLines;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Logistics logistics = (Logistics) o;
        return Objects.equals(id, logistics.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "Logistics{" +
            "id=" + id +
            ", logisticsId='" + logisticsId + "'" +
            ", shipmentId='" + shipmentId + "'" +
            ", deliveryDate='" + deliveryDate + "'" +
            ", deliveryType='" + deliveryType + "'" +
            ", deliveryStatus='" + deliveryStatus + "'" +
            ", logisticsPartner='" + logisticsPartner + "'" +
            ", logisticsLink='" + logisticsLink + "'" +
            ", expectedDeliveryDate='" + expectedDeliveryDate + "'" +
            ", awbNumber='" + awbNumber + "'" +
            ", serviceType='" + serviceType + "'" +
            ", barCode='" + barCode + "'" +
            ", codBarCode='" + codBarCode + "'" +
            ", dcCode='" + dcCode + "'" +
            ", codAwbNumber='" + codAwbNumber + "'" +
            ", fedexForwardShipmentType='" + fedexForwardShipmentType + "'" +
            ", fedexReturnShipmentType='" + fedexReturnShipmentType + "'" +
            ", fedexForwardFormId='" + fedexForwardFormId + "'" +
            ", fedexReturnFormId='" + fedexReturnFormId + "'" +
            ", fedexMeter='" + fedexMeter + "'" +
            ", countryCode='" + countryCode + "'" +
            ", cityCode='" + cityCode + "'" +
            ", fedexBillTc='" + fedexBillTc + "'" +
            ", fedexBillDt='" + fedexBillDt + "'" +
            '}';
    }
}

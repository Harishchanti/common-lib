package com.ailiens.common;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.springframework.data.elasticsearch.annotations.Document;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

/**
 * A MasterBrand.
 */
@Entity
@Table(name = "master_brand")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
@Document(indexName = "masterbrand")
public class MasterBrand implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "brand")
    private String brand;

    @Column(name = "sms_order_confirmed")
    private String smsOrderConfirmed;

    @Column(name = "sms_consignment_shipped")
    private String smsConsignmentShipped;

    @Column(name = "sms_consignment_delivered")
    private String smsConsignmentDelivered;

    @Column(name = "sms_consignment_pickup_complete")
    private String smsConsignmentPickupComplete;

    @Column(name = "sms_consignment_ready_for_pickup")
    private String smsConsignmentReadyForPickup;

    @Column(name = "sms_consignment_delivery_modified")
    private String smsConsignmentDeliveryModified;

    @Column(name = "sms_orderline_cancelled")
    private String smsOrderlineCancelled;

    @Column(name = "email_order_confirmed_home_delivery")
    private String emailOrderConfirmedHomeDelivery;

    @Column(name = "email_order_confirmed_store_pickup")
    private String emailOrderConfirmedStorePickup;

    @Column(name = "email_order_confirmed_home_delivery_store_pickup")
    private String emailOrderConfirmedHomeDeliveryStorePickup;

    @Column(name = "email_order_cancelled")
    private String emailOrderCancelled;

    @Column(name = "email_orderline_cancelled")
    private String emailOrderlineCancelled;

    @Column(name = "email_consignment_delivered")
    private String emailConsignmentDelivered;

    @Column(name = "email_consignment_pickup_complete")
    private String emailConsignmentPickupComplete;

    @Column(name = "email_consignment_shipped")
    private String emailConsignmentShipped;

    @Column(name = "email_consignment_delivery_modified")
    private String emailConsignmentDeliveryModified;

    @Column(name = "email_consignment_candidate_for_rto")
    private String emailConsignmentCandidateForRto;

    @Column(name = "invoice_template_url")
    private String invoiceTemplateUrl;

    @Column(name = "email_waiting_store_pickup")
    private String emailWaitingStorePickup;

    @Column(name = "sms_waiting_store_pickup")
    private String smsWaitingStorePickup;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getSmsOrderConfirmed() {
        return smsOrderConfirmed;
    }

    public void setSmsOrderConfirmed(String smsOrderConfirmed) {
        this.smsOrderConfirmed = smsOrderConfirmed;
    }

    public String getSmsConsignmentShipped() {
        return smsConsignmentShipped;
    }

    public void setSmsConsignmentShipped(String smsConsignmentShipped) {
        this.smsConsignmentShipped = smsConsignmentShipped;
    }

    public String getSmsConsignmentDelivered() {
        return smsConsignmentDelivered;
    }

    public void setSmsConsignmentDelivered(String smsConsignmentDelivered) {
        this.smsConsignmentDelivered = smsConsignmentDelivered;
    }

    public String getSmsConsignmentPickupComplete() {
        return smsConsignmentPickupComplete;
    }

    public void setSmsConsignmentPickupComplete(String smsConsignmentPickupComplete) {
        this.smsConsignmentPickupComplete = smsConsignmentPickupComplete;
    }

    public String getSmsConsignmentReadyForPickup() {
        return smsConsignmentReadyForPickup;
    }

    public void setSmsConsignmentReadyForPickup(String smsConsignmentReadyForPickup) {
        this.smsConsignmentReadyForPickup = smsConsignmentReadyForPickup;
    }

    public String getSmsConsignmentDeliveryModified() {
        return smsConsignmentDeliveryModified;
    }

    public void setSmsConsignmentDeliveryModified(String smsConsignmentDeliveryModified) {
        this.smsConsignmentDeliveryModified = smsConsignmentDeliveryModified;
    }

    public String getSmsOrderlineCancelled() {
        return smsOrderlineCancelled;
    }

    public void setSmsOrderlineCancelled(String smsOrderlineCancelled) {
        this.smsOrderlineCancelled = smsOrderlineCancelled;
    }

    public String getEmailOrderConfirmedHomeDelivery() {
        return emailOrderConfirmedHomeDelivery;
    }

    public void setEmailOrderConfirmedHomeDelivery(String emailOrderConfirmedHomeDelivery) {
        this.emailOrderConfirmedHomeDelivery = emailOrderConfirmedHomeDelivery;
    }

    public String getEmailOrderConfirmedStorePickup() {
        return emailOrderConfirmedStorePickup;
    }

    public void setEmailOrderConfirmedStorePickup(String emailOrderConfirmedStorePickup) {
        this.emailOrderConfirmedStorePickup = emailOrderConfirmedStorePickup;
    }

    public String getEmailOrderConfirmedHomeDeliveryStorePickup() {
        return emailOrderConfirmedHomeDeliveryStorePickup;
    }

    public void setEmailOrderConfirmedHomeDeliveryStorePickup(String emailOrderConfirmedHomeDeliveryStorePickup) {
        this.emailOrderConfirmedHomeDeliveryStorePickup = emailOrderConfirmedHomeDeliveryStorePickup;
    }

    public String getEmailOrderCancelled() {
        return emailOrderCancelled;
    }

    public void setEmailOrderCancelled(String emailOrderCancelled) {
        this.emailOrderCancelled = emailOrderCancelled;
    }

    public String getEmailOrderlineCancelled() {
        return emailOrderlineCancelled;
    }

    public void setEmailOrderlineCancelled(String emailOrderlineCancelled) {
        this.emailOrderlineCancelled = emailOrderlineCancelled;
    }

    public String getEmailConsignmentDelivered() {
        return emailConsignmentDelivered;
    }

    public void setEmailConsignmentDelivered(String emailConsignmentDelivered) {
        this.emailConsignmentDelivered = emailConsignmentDelivered;
    }

    public String getEmailConsignmentPickupComplete() {
        return emailConsignmentPickupComplete;
    }

    public void setEmailConsignmentPickupComplete(String emailConsignmentPickupComplete) {
        this.emailConsignmentPickupComplete = emailConsignmentPickupComplete;
    }

    public String getEmailConsignmentShipped() {
        return emailConsignmentShipped;
    }

    public void setEmailConsignmentShipped(String emailConsignmentShipped) {
        this.emailConsignmentShipped = emailConsignmentShipped;
    }

    public String getEmailConsignmentDeliveryModified() {
        return emailConsignmentDeliveryModified;
    }

    public void setEmailConsignmentDeliveryModified(String emailConsignmentDeliveryModified) {
        this.emailConsignmentDeliveryModified = emailConsignmentDeliveryModified;
    }

    public String getEmailConsignmentCandidateForRto() {
        return emailConsignmentCandidateForRto;
    }

    public void setEmailConsignmentCandidateForRto(String emailConsignmentCandidateForRto) {
        this.emailConsignmentCandidateForRto = emailConsignmentCandidateForRto;
    }

    public String getInvoiceTemplateUrl() {
        return invoiceTemplateUrl;
    }

    public void setInvoiceTemplateUrl(String invoiceTemplateUrl) {
        this.invoiceTemplateUrl = invoiceTemplateUrl;
    }

    public String getEmailWaitingStorePickup() {
        return emailWaitingStorePickup;
    }

    public void setEmailWaitingStorePickup(String emailWaitingStorePickup) {
        this.emailWaitingStorePickup = emailWaitingStorePickup;
    }

    public String getSmsWaitingStorePickup() {
        return smsWaitingStorePickup;
    }

    public void setSmsWaitingStorePickup(String smsWaitingStorePickup) {
        this.smsWaitingStorePickup = smsWaitingStorePickup;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MasterBrand masterBrand = (MasterBrand) o;
        if(masterBrand.id == null || id == null) {
            return false;
        }
        return Objects.equals(id, masterBrand.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "MasterBrand{" +
            "id=" + id +
            ", brand='" + brand + "'" +
            ", smsOrderConfirmed='" + smsOrderConfirmed + "'" +
            ", smsConsignmentShipped='" + smsConsignmentShipped + "'" +
            ", smsConsignmentDelivered='" + smsConsignmentDelivered + "'" +
            ", smsConsignmentPickupComplete='" + smsConsignmentPickupComplete + "'" +
            ", smsConsignmentReadyForPickup='" + smsConsignmentReadyForPickup + "'" +
            ", smsConsignmentDeliveryModified='" + smsConsignmentDeliveryModified + "'" +
            ", smsOrderlineCancelled='" + smsOrderlineCancelled + "'" +
            ", emailOrderConfirmedHomeDelivery='" + emailOrderConfirmedHomeDelivery + "'" +
            ", emailOrderConfirmedStorePickup='" + emailOrderConfirmedStorePickup + "'" +
            ", emailOrderConfirmedHomeDeliveryStorePickup='" + emailOrderConfirmedHomeDeliveryStorePickup + "'" +
            ", emailOrderCancelled='" + emailOrderCancelled + "'" +
            ", emailOrderlineCancelled='" + emailOrderlineCancelled + "'" +
            ", emailConsignmentDelivered='" + emailConsignmentDelivered + "'" +
            ", emailConsignmentPickupComplete='" + emailConsignmentPickupComplete + "'" +
            ", emailConsignmentShipped='" + emailConsignmentShipped + "'" +
            ", emailConsignmentDeliveryModified='" + emailConsignmentDeliveryModified + "'" +
            ", emailConsignmentCandidateForRto='" + emailConsignmentCandidateForRto + "'" +
            ", invoiceTemplateUrl='" + invoiceTemplateUrl + "'" +
            ", emailWaitingStorePickup='" + emailWaitingStorePickup + "'" +
            ", smsWaitingStorePickup='" + smsWaitingStorePickup + "'" +
            '}';
    }
}

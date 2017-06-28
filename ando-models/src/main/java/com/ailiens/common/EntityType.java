package com.ailiens.common;

import lombok.Data;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.springframework.data.elasticsearch.annotations.Document;

import javax.persistence.*;
import java.io.Serializable;

/**
 * A EntityType.
 */
@Entity
@Table(name = "entity_type")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
@Document(indexName="entitytype")
@Data
public class EntityType implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public Long getId()
    {
        return id;
    }


    @Column(name = "entity_type")
    private String entityType;

    public String getEntityType()
    {
        return  entityType;
    }

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

    @Column(name = "manifest_format", nullable = false, columnDefinition = "varchar(255) default 'A4'")
    private String manifestFormat;

    @Override
    public String toString() {
        return "{"
            + "\"id\":\"" + id + "\""
            + ", \"entityType\":\"" + entityType + "\""
            + ", \"smsOrderConfirmed\":\"" + smsOrderConfirmed + "\""
            + ", \"smsConsignmentShipped\":\"" + smsConsignmentShipped + "\""
            + ", \"smsConsignmentDelivered\":\"" + smsConsignmentDelivered + "\""
            + ", \"smsConsignmentPickupComplete\":\"" + smsConsignmentPickupComplete + "\""
            + ", \"smsConsignmentReadyForPickup\":\"" + smsConsignmentReadyForPickup + "\""
            + ", \"smsConsignmentDeliveryModified\":\"" + smsConsignmentDeliveryModified + "\""
            + ", \"smsOrderlineCancelled\":\"" + smsOrderlineCancelled + "\""
            + ", \"emailOrderConfirmedHomeDelivery\":\"" + emailOrderConfirmedHomeDelivery + "\""
            + ", \"emailOrderConfirmedStorePickup\":\"" + emailOrderConfirmedStorePickup + "\""
            + ", \"emailOrderConfirmedHomeDeliveryStorePickup\":\"" + emailOrderConfirmedHomeDeliveryStorePickup + "\""
            + ", \"emailOrderCancelled\":\"" + emailOrderCancelled + "\""
            + ", \"emailOrderlineCancelled\":\"" + emailOrderlineCancelled + "\""
            + ", \"emailConsignmentDelivered\":\"" + emailConsignmentDelivered + "\""
            + ", \"emailConsignmentPickupComplete\":\"" + emailConsignmentPickupComplete + "\""
            + ", \"emailConsignmentShipped\":\"" + emailConsignmentShipped + "\""
            + ", \"emailConsignmentDeliveryModified\":\"" + emailConsignmentDeliveryModified + "\""
            + ", \"emailConsignmentCandidateForRto\":\"" + emailConsignmentCandidateForRto + "\""
            + ", \"invoiceTemplateUrl\":\"" + invoiceTemplateUrl + "\""
            + ", \"emailWaitingStorePickup\":\"" + emailWaitingStorePickup + "\""
            + ", \"smsWaitingStorePickup\":\"" + smsWaitingStorePickup + "\""
            + ", \"manifestFormat\":\"" + manifestFormat + "\""
            + "}";
    }
}

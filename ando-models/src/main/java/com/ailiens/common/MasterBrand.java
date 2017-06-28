package com.ailiens.common;

import lombok.Data;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.springframework.data.elasticsearch.annotations.Document;

import javax.persistence.*;
import java.io.Serializable;

/**
 * A MasterBrand.
 */
@Entity
@Table(name = "master_brand")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
@Document(indexName="masterbrand")
@Data
public class MasterBrand implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public Long getId()
    {
        return id;
    }


    @Column(name = "brand")
    private String brand;

    public String getBrand()
    {
        return brand;
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

}

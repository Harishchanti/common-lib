package com.ailiens.optimusprime.domain;

import java.io.Serializable;
import java.time.ZonedDateTime;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * A Master_bag.
 */
@Entity
@Table(name = "master_bag")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class MasterBag implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "code")
    private String code;

    @Column(name = "creation_time")
    private ZonedDateTime creationtime;

    @Column(name = "handover_time")
    private ZonedDateTime handovertime;

    @Column(name = "courier_name")
    private String courierName;

    @Column(name = "status")
    private String status;

    @Column(name = "fulfillment_center_id")
    private String fulfillmentCenterId;

    @Column(name = "manifest_id")
    private String manifestId;

    @Column(name = "manifest_pdf_path")
    private String manifestPdfPath;

    @Column(name = "market_place")
    private String marketPlace;

    @ManyToOne
    @JoinColumn(name = "courier_id")
    private Courier courier;


    @Column(name = "fulfillment_center_name")
    private String fulfillmentCenterName;

    @Column(name= "count")
    private Integer count;

    @Column(name= "token")
    private String token;
    
    @Column(name= "tenant_id")
    private String tenantId;





    public Long getId() {
	return id;
    }



    public void setId(Long id) {
	this.id = id;
    }



    public String getCode() {
	return code;
    }



    public void setCode(String code) {
	this.code = code;
    }


    public String getCourierName() {
	return courierName;
    }



    public void setCourierName(String courierName) {
	this.courierName = courierName;
    }



    public String getStatus() {
	return status;
    }



    public void setStatus(String status) {
	this.status = status;
    }



    public String getFulfillmentCenterId() {
	return fulfillmentCenterId;
    }



    public void setFulfillmentCenterId(String fulfillmentCenterId) {
	this.fulfillmentCenterId = fulfillmentCenterId;
    }



    public String getManifestId() {
	return manifestId;
    }



    public void setManifestId(String manifestId) {
	this.manifestId = manifestId;
    }



    public String getManifestPdfPath() {
	return manifestPdfPath;
    }



    public void setManifestPdfPath(String manifestPdfPath) {
	this.manifestPdfPath = manifestPdfPath;
    }



    public String getMarketPlace() {
	return marketPlace;
    }



    public void setMarketPlace(String marketPlace) {
	this.marketPlace = marketPlace;
    }



    public Courier getCourier() {
	return courier;
    }



    public void setCourier(Courier courier) {
	this.courier = courier;
    }



    public String getFulfillmentCenterName() {
	return fulfillmentCenterName;
    }



    public void setFulfillmentCenterName(String fulfillmentCenterName) {
	this.fulfillmentCenterName = fulfillmentCenterName;
    }


    public ZonedDateTime getCreationtime() {
	return creationtime;
    }



    public void setCreationtime(ZonedDateTime creationtime) {
	this.creationtime = creationtime;
    }



    public ZonedDateTime getHandovertime() {
	return handovertime;
    }



    public void setHandovertime(ZonedDateTime handovertime) {
	this.handovertime = handovertime;
    }






    public Integer getCount() {
	return count;
    }



    public void setCount(Integer count) {
	this.count = count;
    }




    public String getToken() {
	return token;
    }



    public void setToken(String token) {
	this.token = token;
    }
    
    


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
	MasterBag master_bag = (MasterBag) o;
	if (master_bag.getId() == null || getId() == null) {
	    return false;
	}
	return Objects.equals(getId(), master_bag.getId());
    }



    @Override
    public int hashCode() {
	return Objects.hashCode(getId());
    }



    @Override
    public String toString() {
	return "MasterBag [id=" + id + ", code=" + code + ", creationtime=" + creationtime + ", handovertime="
		+ handovertime + ", courierName=" + courierName + ", status=" + status + ", fulfillmentCenterId="
		+ fulfillmentCenterId + ", manifestId=" + manifestId + ", manifestPdfPath=" + manifestPdfPath
		+ ", marketPlace=" + marketPlace + ", courier=" + courier + ", fulfillmentCenterName="
		+ fulfillmentCenterName + ", count=" + count + ", token=" + token + "]";
    }








}

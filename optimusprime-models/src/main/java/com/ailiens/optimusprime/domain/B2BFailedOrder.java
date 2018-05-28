package com.ailiens.optimusprime.domain;

import java.io.Serializable;
import java.time.ZonedDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Table(name = "b2b_failed_order")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class B2BFailedOrder implements Serializable{

  @Id
  @Column(name = "service_order_id")
  private String serviceOrderId;
  
  @Column(name = "status")
  private String status;
  
  @Column(name = "created_on")
  private ZonedDateTime createdOn;
  
  @Column(name = "tenant_id")
  private String tenantId;
  
  public String getTenantId() {
	return tenantId;
}

public void setTenantId(String tenantId) {
	this.tenantId = tenantId;
}

@Column(name ="lastmodified_on")
  private ZonedDateTime lastModifiedOn;
  
  @Column(name ="notify")
  private byte notify;

  public String getServiceOrderId() {
    return serviceOrderId;
  }

  public void setServiceOrderId(String serviceOrderId) {
    this.serviceOrderId = serviceOrderId;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public ZonedDateTime getCreatedOn() {
    return createdOn;
  }

  public void setCreatedOn(ZonedDateTime createdOn) {
    this.createdOn = createdOn;
  }

  public ZonedDateTime getLastModifiedOn() {
    return lastModifiedOn;
  }

  public void setLastModifiedOn(ZonedDateTime lastModifiedOn) {
    this.lastModifiedOn = lastModifiedOn;
  }

  public byte getNotify() {
    return notify;
  }

  public void setNotify(byte notify) {
    this.notify = notify;
  }
  
  public boolean hasNotified() {
    if (this.getNotify() == 1)
      return true;
    else
      return false;
  }
}

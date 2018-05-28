package com.ailiens.optimusprime.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Table(name = "btjob_status")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class BTJobStatus implements Serializable {
  
  @Embeddable
  public static class BTJobStatusPk implements Serializable {
    
    public BTJobStatusPk() {
    }

    @Column(name = "order_id")
    private Long orderId;
    
    @Column(name = "token")
    private String token;

   

	public BTJobStatusPk(Long orderId, String token) {
      this.orderId = orderId;
      this.token = token;
    }

    public Long getOrderId() {
      return orderId;
    }

    public void setOrderId(Long orderId) {
      this.orderId = orderId;
    }

    public String getToken() {
      return token;
    }

    public void setToken(String token) {
      this.token = token;
    }

    @Override
    public String toString() {
      return "BTJobStatusPk [orderId=" + orderId + ", token=" + token + "]";
    }
  }
  
  @EmbeddedId 
  private BTJobStatusPk id;
  
  @Column(name = "status")
  private String status;
  
  @Column(name = "created_on")
  private Date createdOn;
  
  @Column(name ="lastmodified_on")
  private Date lastModifiedOn;
  
  @Column(name ="notify")
  private byte notify;
  
  @Column(name = "tenant_id")
  private String tenantId;
  
  
  public BTJobStatus() {
  }
  
  
  public BTJobStatus(Long orderId, String token) {
    id = new BTJobStatusPk(orderId, token);
    
  }
  

  public BTJobStatusPk getId() {
    return id;
  }


  public void setId(BTJobStatusPk id) {
    this.id = id;
  }


  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public Date getCreatedOn() {
    return createdOn;
  }

  public void setCreatedOn(Date createdOn) {
    this.createdOn = createdOn;
  }

  public Date getLastModifiedOn() {
    return lastModifiedOn;
  }

  public void setLastModifiedOn(Date lastModifiedOn) {
    this.lastModifiedOn = lastModifiedOn;
  }
  
  public byte getNotify() {
    return notify;
  }

  public void setNotify(byte notify) {
    this.notify = notify;
  }
  

  
  public String getTenantId() {
		return tenantId;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}


  @Override
  public String toString() {
    return "BTJobStatus [id=" + id + ", status=" + status + ", createdOn=" + createdOn
        + ", lastModifiedOn=" + lastModifiedOn + "]";
  }
}

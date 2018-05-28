package com.ailiens.optimusprime.domain;

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

@Entity
@Table(name = "courier")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class Courier {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer id;

  @ManyToOne
  @JoinColumn(name = "source_id")
  private SourceMetadata sourceMetadata;

  @Column(name = "courier_name")
  private String courierName;

  @Column(name = "courier_reference_id")
  private String courierReferenceId;
  
  @Column(name = "tenant_id")
  private String tenantId;

  public String getTenantId() {
	return tenantId;
   }

  public void setTenantId(String tenantId) {
	this.tenantId = tenantId;
  }

public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public SourceMetadata getSourceMetadata() {
    return sourceMetadata;
  }

  public void setSourceMetadata(SourceMetadata sourceMetadata) {
    this.sourceMetadata = sourceMetadata;
  }

  public String getCourierName() {
    return courierName;
  }

  public void setCourierName(String courierName) {
    this.courierName = courierName;
  }
  
  public String getCourierReferenceId() {
    return courierReferenceId;
  }

  public void setCourierReferenceId(String courierReferenceId) {
    this.courierReferenceId = courierReferenceId;
  }

  @Override
  public String toString() {
    return "Courier [id=" + id + ", sourceMetadata=" + sourceMetadata + ", courierName="
        + courierName + ", courierReferenceId=" + courierReferenceId + "]";
  }

  

}

package com.ailiens.optimusprime.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import java.io.Serializable;

@Entity
@Table(name = "source_metadata")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class SourceMetadata implements Serializable{

    private static final long serialVersionUID = 1L;

    @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int id;

  @Column(name = "name")
  private String name;

  @Column(name = "source_reference_id")
  private String sourceReferenceId;

  @Column (name = "banner")
  private String banner;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getSourceReferenceId() {
    return sourceReferenceId;
  }

  public void setSourceReferenceId(String sourceReferenceId) {
    this.sourceReferenceId = sourceReferenceId;
  }

  public String getBanner() {
    return banner;
  }

  public void setBanner(String banner) {
    this.banner = banner;
  }

  @Override
  public String toString() {
    return "SourceMetadata [id=" + id + ", name=" + name + ", sourceReferenceId="
        + sourceReferenceId + ", banner=" + banner + "]";
  }

}

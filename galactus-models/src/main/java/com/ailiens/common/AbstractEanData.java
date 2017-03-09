package com.ailiens.common;

import javax.annotation.PostConstruct;
import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.MappedSuperclass;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.time.ZonedDateTime;

@MappedSuperclass
public abstract class AbstractEanData implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	@NotNull
	@Column(name = "style_id")
	private String styleId;

	@Column(name = "sap_style_id")
	private String sapStyleId;

	@Column(name = "sap_brand")
	private String sapBrand;

	@Column(name = "legal_brand")
	private String legalBrand;

	@Column(name = "sap_sku_id")
	private String sapSkuId;

	@Column(name = "size")
	private String size;

	@Column(name = "size_attribute")
	private String sizeAttribute;

	@Column(name = "mrp")
	private Double mrp;

	@Column(name = "trade_sp")
	private Double tradeSp;

	@Column(name = "tax_class")
	private String taxClass;

	@Column(name = "age_group")
	private String ageGroup;

	@Column(name = "pdp_size")
	private String pdpSize;

	@Column(name = "sap_size")
	private String sapSize;

	@Column(name = "sap_size_attribute")
	private String sapSizeAttribute;

	@Enumerated(EnumType.STRING)
	@Column(name = "source")
	private Source source;

	@Column(name = "last_modified_date")
	private ZonedDateTime lastModifiedDate = ZonedDateTime.now();

	@Column(name = "last_modified_by")
	private String lastModifiedBy;

	@Column(name = "event_id")
	private Long eventId;

	public String getStyleId() {
		return styleId;
	}

	public void setStyleId(String styleId) {
		this.styleId = styleId;
	}

	public String getSapStyleId() {
		return sapStyleId;
	}

	public void setSapStyleId(String sapStyleId) {
		this.sapStyleId = sapStyleId;
	}

	public String getSapSkuId() {
		return sapSkuId;
	}

	public void setSapSkuId(String sapSkuId) {
		this.sapSkuId = sapSkuId;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getSizeAttribute() {
		return sizeAttribute;
	}

	public void setSizeAttribute(String sizeAttribute) {
		this.sizeAttribute = sizeAttribute;
	}

	public Double getMrp() {
		return mrp;
	}

	public void setMrp(Double mrp) {
		this.mrp = mrp;
	}

	public Double getTradeSp() {
		return tradeSp;
	}

	public void setTradeSp(Double tradeSp) {
		this.tradeSp = tradeSp;
	}

	public String getTaxClass() {
		return taxClass;
	}

	public void setTaxClass(String taxClass) {
		this.taxClass = taxClass;
	}

	public String getAgeGroup() {
		return ageGroup;
	}

	public void setAgeGroup(String ageGroup) {
		this.ageGroup = ageGroup;
	}

	public String getPdpSize() {
		return pdpSize;
	}

	public void setPdpSize(String pdpSize) {
		this.pdpSize = pdpSize;
	}

	public String getSapSize() {
		return sapSize;
	}

	public void setSapSize(String sapSize) {
		this.sapSize = sapSize;
	}

	public String getSapSizeAttribute() {
		return sapSizeAttribute;
	}

	public void setSapSizeAttribute(String sapSizeAttribute) {
		this.sapSizeAttribute = sapSizeAttribute;
	}

	public Source getSource() {
		return source;
	}

	public void setSource(Source source) {
		this.source = source;
	}

	public ZonedDateTime getLastModifiedDate() {
		return lastModifiedDate;
	}

	public void setLastModifiedDate(ZonedDateTime lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}

	public String getLastModifiedBy() {
		return lastModifiedBy;
	}

	public void setLastModifiedBy(String lastModifiedBy) {
		this.lastModifiedBy = lastModifiedBy;
	}

	public String getSapBrand() {
		return sapBrand;
	}

	public void setSapBrand(String sapBrand) {
		this.sapBrand = sapBrand;
	}

	public String getLegalBrand() {
		return legalBrand;
	}

	public void setLegalBrand(String legalBrand) {
		this.legalBrand = legalBrand;
	}

	@PostConstruct
	private void setModifier() {
		if (this.lastModifiedBy == null) {
			this.lastModifiedBy = SecurityUtils.getCurrentUserLogin();
		}
		lastModifiedDate = ZonedDateTime.now();
	}

	public Long getEventId() {
		return eventId;
	}

	public void setEventId(Long eventId) {
		this.eventId = eventId;
	}
}

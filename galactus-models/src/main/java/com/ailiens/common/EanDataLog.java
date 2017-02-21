package com.ailiens.common;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

/**
 * A EanDataLog.
 */
@Entity
@Table(name = "ean_data_log")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)

public class EanDataLog extends AbstractEanData implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = "ean")
	private String ean;

	@Enumerated(EnumType.STRING)
	@Column(name = "state")
	private State state;

	@Column(name = "reason")
	private String reason;

	@Column(name = "error_code")
	private String errorCode;

	@Column(name = "source_ip")
	private String sourceIp;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getSourceIp() {
		return sourceIp;
	}

	public void setSourceIp(String sourceIp) {
		this.sourceIp = sourceIp;
	}

	public String getEan() {
		return ean;
	}

	public void setEan(String ean) {
		this.ean = ean;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		EanDataLog eanDataLog = (EanDataLog) o;
		if (eanDataLog.id == null || id == null) {
			return false;
		}
		return Objects.equals(id, eanDataLog.id);
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(id);
	}

	@Override
	public String toString() {
		return "EanDataLog [id=" + id + ", ean=" + ean + ", state=" + state + ", reason=" + reason + ", errorCode="
				+ errorCode + ", sourceIp=" + sourceIp + ", getStyleId()=" + getStyleId() + ", getSapStyleId()="
				+ getSapStyleId() + ", getSapSkuId()=" + getSapSkuId() + ", getSize()=" + getSize()
				+ ", getSizeAttribute()=" + getSizeAttribute() + ", getMrp()=" + getMrp() + ", getTradeSp()="
				+ getTradeSp() + ", getTaxClass()=" + getTaxClass() + ", getAgeGroup()=" + getAgeGroup()
				+ ", getPdpSize()=" + getPdpSize() + ", getSapSize()=" + getSapSize() + ", getSapSizeAttribute()="
				+ getSapSizeAttribute() + ", getSource()=" + getSource() + ", getLastModifiedDate()="
				+ getLastModifiedDate() + ", getLastModifiedBy()=" + getLastModifiedBy() + ", getEventId()="
				+ getEventId() + ", getClass()=" + getClass() + ", toString()=" + super.toString() + "]";
	}
}

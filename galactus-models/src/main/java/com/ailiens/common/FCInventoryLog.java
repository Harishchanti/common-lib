package com.ailiens.common;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Objects;

/**
 * A FCInventoryLog.
 */
@Entity
@Table(name = "fc_inventory_log")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)

public class FCInventoryLog extends AbstractFCInventory implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@NotNull
	@Column(name = "fc_id", nullable = false)
	private String fcId;

	@NotNull
	@Column(name = "ean", nullable = false)
	private String ean;

	@Enumerated(EnumType.STRING)
	@Column(name = "source")
	private Source sourceOrg;

	@NotNull
	@Enumerated(EnumType.STRING)
	@Column(name = "transaction_type")
	private RequestTransactionType transactionType;

	@NotNull
	@Enumerated(EnumType.STRING)
	@Column(name = "source_stock")
	private StockMoveStatus source;

	@NotNull
	@Enumerated(EnumType.STRING)
	@Column(name = "destination")
	private StockMoveStatus destination;

	@Column(name = "pick_fail")
	private Boolean pickFail = false;

	@Column(name = "local_pos_sale")
	private Boolean localPosSale = false;

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

	public String getFcId() {
		return fcId;
	}

	public void setFcId(String fcId) {
		this.fcId = fcId;
	}

	public String getEan() {
		return ean;
	}

	public void setEan(String ean) {
		this.ean = ean;
	}

	public Source getSourceOrg() {
		return sourceOrg;
	}

	public void setSourceOrg(Source sourceOrg) {
		this.sourceOrg = sourceOrg;
	}

	public StockMoveStatus getSource() {
		return source;
	}

	public void setSource(StockMoveStatus source) {
		this.source = source;
	}

	public StockMoveStatus getDestination() {
		return destination;
	}

	public void setDestination(StockMoveStatus destination) {
		this.destination = destination;
	}

	public RequestTransactionType getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(RequestTransactionType transactionType) {
		this.transactionType = transactionType;
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

	public Boolean getPickFail() {
		return pickFail;
	}

	public void setPickFail(Boolean pickFail) {
		this.pickFail = pickFail;
	}

	public Boolean getLocalPosSale() {
		return localPosSale;
	}

	public void setLocalPosSale(Boolean localPosSale) {
		this.localPosSale = localPosSale;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		FCInventoryLog fCInventoryLog = (FCInventoryLog) o;
		if (fCInventoryLog.id == null || id == null) {
			return false;
		}
		return Objects.equals(id, fCInventoryLog.id);
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(id);
	}

	@Override
	public String toString() {
		return "FCInventoryLog [id=" + id + ", fcId=" + fcId + ", ean=" + ean + ", sourceOrg=" + sourceOrg
				+ ", transactionType=" + transactionType + ", source=" + source + ", destination=" + destination
				+ ", state=" + state + ", reason=" + reason + ", errorCode=" + errorCode + ", sourceIp=" + sourceIp
				+ ", getSapSkuId()=" + getSapSkuId() + ", getQuantity()=" + getQuantity() + ", getReserveQty()="
				+ getReserveQty() + ", getLastModifiedDate()=" + getLastModifiedDate() + ", getLastModifiedBy()="
				+ getLastModifiedBy() + ", getEventId()=" + getEventId() + ", toString()=" + super.toString() + "]";
	}
}

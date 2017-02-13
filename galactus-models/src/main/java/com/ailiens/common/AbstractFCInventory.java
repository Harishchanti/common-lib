package com.ailiens.common;

import javax.annotation.PostConstruct;
import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.time.ZonedDateTime;

@MappedSuperclass
public class AbstractFCInventory implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	@NotNull
	@Column(name = "sap_sku_id", nullable = false)
	private String sapSkuId;

	@Column(name = "quantity")
	private Long quantity;

	@Column(name = "reserve_qty")
	private Long reserveQty = 0L;

	@Column(name = "pick_fail_qty")
	private Long pickFailQty = 0L;

	@Column(name = "reset_qty")
	private Long resetQty = 0L;

	@Column(name = "last_modified_date", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
	private ZonedDateTime lastModifiedDate = ZonedDateTime.now();

	@Column(name = "pick_fail_date")
	private ZonedDateTime pickFailDate;

	@Column(name = "reset_date")
	private ZonedDateTime resetDate;

	@Column(name = "last_modified_by")
	private String lastModifiedBy;

	@Column(name = "event_id")
	private Long eventId;

	public String getSapSkuId() {
		return sapSkuId;
	}

	public void setSapSkuId(String sapSkuId) {
		this.sapSkuId = sapSkuId;
	}

	public Long getQuantity() {
		return quantity;
	}

	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

	public Long getReserveQty() {
		return reserveQty;
	}

	public void setReserveQty(Long reserveQty) {
		this.reserveQty = reserveQty;
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

	public Long getEventId() {
		return eventId;
	}

	public void setEventId(Long eventId) {
		this.eventId = eventId;
	}

	public Long getPickFailQty() {
		return pickFailQty;
	}

	public void setPickFailQty(Long pickFailQty) {
		this.pickFailQty = pickFailQty;
	}

	public Long getResetQty() {
		return resetQty;
	}

	public void setResetQty(Long resetQty) {
		this.resetQty = resetQty;
	}

	public ZonedDateTime getPickFailDate() {
		return pickFailDate;
	}

	public void setPickFailDate(ZonedDateTime pickFailDate) {
		this.pickFailDate = pickFailDate;
	}

	public ZonedDateTime getResetDate() {
		return resetDate;
	}

	public void setResetDate(ZonedDateTime resetDate) {
		this.resetDate = resetDate;
	}

	@PostConstruct
	private void setModifier() {
		if (this.lastModifiedBy == null) {
			this.lastModifiedBy = SecurityUtils.getCurrentUserLogin();
		}
		if (reserveQty == null) {
			reserveQty = 0L;
		}
		lastModifiedDate = ZonedDateTime.now();
	}
}

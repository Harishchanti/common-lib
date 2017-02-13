package com.ailiens.common;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.time.ZonedDateTime;
import java.util.Objects;

/**
 * A FCInventoryHistory.
 */

public class FCInventorySearch implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@JsonIgnore
	private String id;
	@NotNull
	private String fcId;
	@NotNull
	// @JsonProperty("skuId")
	private String ean;
	private String skuId;
	@NotNull
	private String sapSkuId;
	private Long quantity;
	private Long reserveQty;
	private Source source;
	private ZonedDateTime lastModifiedDate;
	private String lastModifiedBy;
	private Long eventId;
	private Long pickFailQty = 0L;
	private Long resetQty = 0L;
	private ZonedDateTime pickFailDate;
	private ZonedDateTime resetDate;

	public String getId() {
		return id;
	}

	public void setId(String id) {
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

	public String getSkuId() {
		return skuId;
	}

	public void setSkuId(String skuId) {
		// this.skuId = skuId;
	}

	public void setEan(String ean) {
		this.ean = ean;
		this.skuId = ean;
	}

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

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		FCInventorySearch fCInventoryHistory = (FCInventorySearch) o;
		if (fCInventoryHistory.id == null || id == null) {
			return false;
		}
		return Objects.equals(id, fCInventoryHistory.id);
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

	@Override
	public int hashCode() {
		return Objects.hashCode(id);
	}

	@Override
	public String toString() {
		return "FCInventoryHistory{" + "id=" + id + ", fcId='" + fcId + "'" + ", ean='" + ean + "'" + ", sapSkuId='"
				+ sapSkuId + "'" + ", quantity='" + quantity + "'" + ", reserveQty='" + reserveQty + "'" + ", source='"
				+ source + "'" + ", lastModifiedDate='" + lastModifiedDate + "'" + ", lastModifiedBy='" + lastModifiedBy
				+ "'" + '}';
	}
}

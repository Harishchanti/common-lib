package com.ailiens.common;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

public class StyleDataDTO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	private String styleId;

	@NotNull
	@DecimalMin("0.0")
	private Double tradeSP = 0.0;

	@NotNull
	@DecimalMin("0.0")
	private Double grossSP = 0.0;

	@JsonIgnore
	private long eventId;
	@JsonIgnore
	private Source source;

	public String getStyleId() {
		return styleId;
	}

	public void setStyleId(String styleId) {
		this.styleId = styleId;
	}

	public Double getTradeSP() {
		return tradeSP;
	}

	public void setTradeSP(Double tradeSP) {
		this.tradeSP = tradeSP;
		this.grossSP = tradeSP;
	}

	@JsonIgnore
	public long getEventId() {
		return eventId;
	}

	public void setEventId(long eventId) {
		this.eventId = eventId;
	}

	@JsonIgnore
	public Source getSource() {
		return source;
	}

	public Double getGrossSP() {
		return grossSP;
	}

	public void setGrossSP(Double grossSP) {
		this.grossSP = grossSP;
		this.tradeSP = grossSP;
	}

	public void setSource(Source source) {
		this.source = source;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((styleId == null) ? 0 : styleId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StyleDataDTO other = (StyleDataDTO) obj;
		if (styleId == null) {
			if (other.styleId != null)
				return false;
		} else if (!styleId.equals(other.styleId))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "StyleDataDTO [styleId=" + styleId + ", tradeSP=" + tradeSP + "]";
	}
}

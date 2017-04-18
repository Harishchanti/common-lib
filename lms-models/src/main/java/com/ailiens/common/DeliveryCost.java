package com.ail.mbo.bumblebee.mbo.beans;

import java.math.BigDecimal;

public class DeliveryCost {
	
	private String currencyIso;
	private BigDecimal value;
	public String getCurrencyIso() {
		return currencyIso;
	}
	public void setCurrencyIso(String currencyIso) {
		this.currencyIso = currencyIso;
	}
	public BigDecimal getValue() {
		return value;
	}
	public void setValue(BigDecimal value) {
		this.value = value;
	}
	
}

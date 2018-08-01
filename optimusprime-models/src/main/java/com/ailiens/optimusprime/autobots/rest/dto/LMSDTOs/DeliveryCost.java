package com.ailiens.optimusprime.autobots.rest.dto.LMSDTOs;

import java.math.BigDecimal;

public class DeliveryCost {

    private String currencyIso = "INR";
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


    public DeliveryCost(BigDecimal value) {
        this.value = value;
    }

    public DeliveryCost() {
    }
}

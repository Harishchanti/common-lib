
package com.ailiens.optimusprime.autobots.web.rest.n3ow.dto.orderDetails;

import java.math.BigDecimal;
import java.util.Set;

import javax.annotation.Generated;
import org.apache.commons.lang.builder.ToStringBuilder;

import com.ailiens.optimusprime.domain.Orders;
import com.ailiens.optimusprime.domain.Payment;

@Generated("org.jsonschema2pojo")
public class PaymentSummaryDTO {

    public BigDecimal voucher;
    public BigDecimal online;
    public BigDecimal NNNowCash;
    public BigDecimal card;
    public BigDecimal cod;
    public BigDecimal som_pos;
    public BigDecimal som_cod;
    public BigDecimal ezetap;

    public PaymentSummaryDTO(BigDecimal voucher, BigDecimal cod, BigDecimal nNNowCash, BigDecimal online,
                             BigDecimal card, BigDecimal som_cod, BigDecimal som_pos, BigDecimal ezetap) {
        this.voucher = voucher;
        this.card = card;
        this.NNNowCash = nNNowCash;
        this.online = online;
        this.cod=cod;
        this.som_cod=som_cod;
        this.som_pos=som_pos;
        this.ezetap=ezetap;
    }

    public PaymentSummaryDTO(BigDecimal voucher, BigDecimal cod, BigDecimal nNNowCash, BigDecimal online,
                             BigDecimal card, BigDecimal ezetap) {
        this.voucher = voucher;
        this.card = card;
        this.NNNowCash = nNNowCash;
        this.online = online;
        this.cod=cod;
        this.ezetap=ezetap;
    }

    public BigDecimal getVoucher() {
        return voucher;
    }

    public void setVoucher(BigDecimal cash) {
        this.voucher = cash;
    }

    public BigDecimal getOnline() {
        return online;
    }

    public void setOnline(BigDecimal online) {
        this.online = online;
    }

    public BigDecimal getNNNowCash() {
        return NNNowCash;
    }

    public void setNNNowCash(BigDecimal NNNowCash) {
        this.NNNowCash = NNNowCash;
    }

    public BigDecimal getCard() {
        return card;
    }

    public void setCard(BigDecimal card) {
        this.card = card;
    }

    public BigDecimal getCod() {
        return cod;
    }

    public void setCod(BigDecimal cod) {
        this.cod = cod;
    }

    public BigDecimal getSom_pos() {
        return som_pos;
    }

    public void setSom_pos(BigDecimal som_pos) {
        this.som_pos = som_pos;
    }

    public BigDecimal getSom_cod() {
        return som_cod;
    }

    public void setSom_cod(BigDecimal som_cod) {
        this.som_cod = som_cod;
    }

    public BigDecimal getEzetap() {
        return ezetap;
    }

    public void setEzetap(BigDecimal ezetap) {
        this.ezetap = ezetap;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}

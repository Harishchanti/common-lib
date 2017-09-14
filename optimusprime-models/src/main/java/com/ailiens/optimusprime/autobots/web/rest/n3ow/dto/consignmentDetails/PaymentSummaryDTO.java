
package com.ailiens.optimusprime.autobots.web.rest.n3ow.dto.consignmentDetails;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import javax.annotation.Generated;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.builder.ToStringBuilder;

import com.ailiens.optimusprime.domain.Payment;

@Generated("org.jsonschema2pojo")
public class PaymentSummaryDTO {

    public BigDecimal voucher = new BigDecimal(0.0);
    public BigDecimal online = new BigDecimal(0.0);
    public BigDecimal NNNowCash = new BigDecimal(0.0);
    public BigDecimal card = new BigDecimal(0.0);
    public BigDecimal cod = new BigDecimal(0.0);
    public BigDecimal som_pos = new BigDecimal(0.0);
    public BigDecimal som_cod = new BigDecimal(0.0);
    public String paymentMode = "";
    public List<PaymentTransactionalDetails> paymentTransactionalDetails  = new ArrayList<>();

    public PaymentSummaryDTO() {

    }
    public PaymentSummaryDTO(BigDecimal voucher, BigDecimal cod, BigDecimal nNNowCash, BigDecimal online,
                             BigDecimal card, BigDecimal som_cod, BigDecimal som_pos, String paymentMode, Set<Payment>  payments) {
        this.voucher = returnDefault(voucher);
        this.card = returnDefault(card);
        this.NNNowCash = returnDefault(nNNowCash);
        this.online = returnDefault(online);
        this.cod=returnDefault(cod);
        this.som_cod=returnDefault(som_cod);
        this.som_pos=returnDefault(som_pos);
        this.paymentMode= StringUtils.trimToNull(paymentMode) == null ? "" : paymentMode;
        if(payments != null && payments.size() > 0) {
            payments.forEach(pay -> this.paymentTransactionalDetails.add(new PaymentTransactionalDetails(pay)));
        }

    }

    public PaymentSummaryDTO(BigDecimal voucher, BigDecimal cod, BigDecimal nNNowCash, BigDecimal online,
                             BigDecimal card) {


        this.voucher = returnDefault(voucher);
        this.card = returnDefault(card);
        this.NNNowCash = returnDefault(nNNowCash);
        this.online = returnDefault(online);
        this.cod=returnDefault(cod);

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

    public String getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(String paymentMode) {
        this.paymentMode = paymentMode;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    public BigDecimal returnDefault(BigDecimal value) {
        Optional<BigDecimal> optionalValue = Optional.ofNullable(value);
        return optionalValue.orElse(new BigDecimal(0.0));
    }
}


package com.ailiens.optimusprime.autobots.web.rest.n3ow.dto.consignmentDetails;

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
	public String paymentMode;

	public PaymentSummaryDTO(BigDecimal voucher, BigDecimal cod, BigDecimal nNNowCash, BigDecimal online,
			BigDecimal card, BigDecimal som_cod, BigDecimal som_pos, String paymentMode) {
		this.voucher = voucher;
		this.card = card;
		this.NNNowCash = nNNowCash;
		this.online = online;
		this.cod=cod;
		this.som_cod=som_cod;
		this.som_pos=som_pos;
		this.paymentMode=paymentMode;
	}
	public PaymentSummaryDTO(){

	}

	public PaymentSummaryDTO(BigDecimal voucher, BigDecimal cod, BigDecimal nNNowCash, BigDecimal online,
			BigDecimal card) {
		this.voucher = voucher;
		this.card = card;
		this.NNNowCash = nNNowCash;
		this.online = online;
		this.cod=cod;
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

}

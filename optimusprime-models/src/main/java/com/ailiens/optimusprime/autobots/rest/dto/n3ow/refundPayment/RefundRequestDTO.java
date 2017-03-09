package com.ailiens.optimusprime.autobots.rest.dto.n3ow.refundPayment;

import com.ailiens.optimusprime.autobots.web.rest.n3ow.dto.Payment.VoucherDTO;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.math.BigDecimal;

public class RefundRequestDTO {

	private String transactionId;
	private BigDecimal amount;
	private String returnId;
	private String userName;
	private String userRefrenceId;
	private String userId;
	private String refundPaymentTypeCode;
	private String reasonDetail;
	private PaymentReasonCodeDTO paymentReasonCode;
	private VoucherDTO voucher;

	/**
	 *
	 * @return
	 * The transactionId
	 */
	public String getTransactionId() {
		return transactionId;
	}
	public RefundRequestDTO(){

	}

	/**
	 *
	 * @param transactionId
	 * The transactionId
	 */
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	/**
	 *
	 * @return
	 * The amount
	 */
	public BigDecimal getAmount() {
		return amount;
	}

	/**
	 *
	 * @param amount
	 * The amount
	 */
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	/**
	 *
	 * @return
	 * The returnId
	 */
	public String getReturnId() {
		return returnId;
	}

	/**
	 *
	 * @param returnId
	 * The returnId
	 */
	public void setReturnId(String returnId) {
		this.returnId = returnId;
	}

	/**
	 *
	 * @return
	 * The userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 *
	 * @param userName
	 * The userName
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 *
	 * @return
	 * The userRefrenceId
	 */
	public String getUserRefrenceId() {
		return userRefrenceId;
	}

	/**
	 *
	 * @param userRefrenceId
	 * The userRefrenceId
	 */
	public void setUserRefrenceId(String userRefrenceId) {
		this.userRefrenceId = userRefrenceId;
	}

	/**
	 *
	 * @param userId
	 * The userId
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}

	/**
	 *
	 * @return
	 * The userId
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 *
	 * @return
	 * The refundPaymentTypeCode
	 */
	public String getRefundPaymentTypeCode() {
		return refundPaymentTypeCode;
	}

	/**
	 *
	 * @param refundPaymentTypeCode
	 * The refundPaymentTypeCode
	 */
	public void setRefundPaymentTypeCode(String refundPaymentTypeCode) {
		this.refundPaymentTypeCode = refundPaymentTypeCode;
	}

	/**
	 *
	 * @return
	 * The reasonDetail
	 */
	public String getReasonDetail() {
		return reasonDetail;
	}

	/**
	 *
	 * @param reasonDetail
	 * The reasonDetail
	 */
	public void setReasonDetail(String reasonDetail) {
		this.reasonDetail = reasonDetail;
	}

	/**
	 *
	 * @return
	 * The paymentReasonCode
	 */
	public PaymentReasonCodeDTO getPaymentReasonCode() {
		return paymentReasonCode;
	}

	/**
	 *
	 * @param paymentReasonCode
	 * The paymentReasonCode
	 */
	public void setPaymentReasonCode(PaymentReasonCodeDTO paymentReasonCode) {
		this.paymentReasonCode = paymentReasonCode;
	}

	/**
	 *
	 * @return
	 * The voucher
	 */
	public VoucherDTO getVoucher() {
		return voucher;
	}

	/**
	 *
	 * @param voucher
	 * The voucher
	 */
	public void setVoucher(VoucherDTO voucher) {
		this.voucher = voucher;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}


}

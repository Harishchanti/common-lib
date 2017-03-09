package com.ailiens.optimusprime.autobots.rest.dto.n3ow.refundPayment;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.math.BigDecimal;

@Generated("org.jsonschema2pojo")
@JsonIgnoreProperties(ignoreUnknown = true)
public class RefundPaymentDTO {

	private BigDecimal amount;
	private String createdDateTime;
	private String description;
	private String direction;
	private String emailId;
	private String errorDetail;
	private long id;
	private String lastUpdatedTime;
	private String orderId;
	private String paymentErrorCodeErrorCode;
	private long paymentErrorCodeId;
	private long paymentInfoId;
	private long paymentReasonCodeId;
	private String paymentReasonCodeReasonName;
	private long paymentTypeId;
	private String paymentTypeTypeCode;
	private long pgId;
	private String pgName;
	private String pgReferenceId;
	private String phoneNumber;
	private String reasonDetail;
	private BigDecimal receivedAmount;
	private String status;
	private String transactionId;
	private String transactionReferenceId;
	private String userReferenceId;

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
	 public RefundPaymentDTO(){

	 }

	 /**
	  *
	  * @return
	  * The createdDateTime
	  */
	 public String getCreatedDateTime() {
		 return createdDateTime;
	 }

	 /**
	  *
	  * @param createdDateTime
	  * The createdDateTime
	  */
	 public void setCreatedDateTime(String createdDateTime) {
		 this.createdDateTime = createdDateTime;
	 }

	 /**
	  *
	  * @return
	  * The description
	  */
	 public String getDescription() {
		 return description;
	 }

	 /**
	  *
	  * @param description
	  * The description
	  */
	 public void setDescription(String description) {
		 this.description = description;
	 }

	 /**
	  *
	  * @return
	  * The direction
	  */
	 public String getDirection() {
		 return direction;
	 }

	 /**
	  *
	  * @param direction
	  * The direction
	  */
	 public void setDirection(String direction) {
		 this.direction = direction;
	 }

	 /**
	  *
	  * @return
	  * The emailId
	  */
	 public String getEmailId() {
		 return emailId;
	 }

	 /**
	  *
	  * @param emailId
	  * The emailId
	  */
	 public void setEmailId(String emailId) {
		 this.emailId = emailId;
	 }

	 /**
	  *
	  * @return
	  * The errorDetail
	  */
	 public String getErrorDetail() {
		 return errorDetail;
	 }

	 /**
	  *
	  * @param errorDetail
	  * The errorDetail
	  */
	 public void setErrorDetail(String errorDetail) {
		 this.errorDetail = errorDetail;
	 }

	 /**
	  *
	  * @return
	  * The id
	  */
	 public long getId() {
		 return id;
	 }

	 /**
	  *
	  * @param id
	  * The id
	  */
	 public void setId(long id) {
		 this.id = id;
	 }

	 /**
	  *
	  * @return
	  * The lastUpdatedTime
	  */
	 public String getLastUpdatedTime() {
		 return lastUpdatedTime;
	 }

	 /**
	  *
	  * @param lastUpdatedTime
	  * The lastUpdatedTime
	  */
	 public void setLastUpdatedTime(String lastUpdatedTime) {
		 this.lastUpdatedTime = lastUpdatedTime;
	 }

	 /**
	  *
	  * @return
	  * The orderId
	  */
	 public String getOrderId() {
		 return orderId;
	 }

	 /**
	  *
	  * @param orderId
	  * The orderId
	  */
	 public void setOrderId(String orderId) {
		 this.orderId = orderId;
	 }

	 /**
	  *
	  * @return
	  * The paymentErrorCodeErrorCode
	  */
	 public String getPaymentErrorCodeErrorCode() {
		 return paymentErrorCodeErrorCode;
	 }

	 /**
	  *
	  * @param paymentErrorCodeErrorCode
	  * The paymentErrorCodeErrorCode
	  */
	 public void setPaymentErrorCodeErrorCode(String paymentErrorCodeErrorCode) {
		 this.paymentErrorCodeErrorCode = paymentErrorCodeErrorCode;
	 }

	 /**
	  *
	  * @return
	  * The paymentErrorCodeId
	  */
	 public long getPaymentErrorCodeId() {
		 return paymentErrorCodeId;
	 }

	 /**
	  *
	  * @param paymentErrorCodeId
	  * The paymentErrorCodeId
	  */
	 public void setPaymentErrorCodeId(long paymentErrorCodeId) {
		 this.paymentErrorCodeId = paymentErrorCodeId;
	 }

	 /**
	  *
	  * @return
	  * The paymentInfoId
	  */
	 public long getPaymentInfoId() {
		 return paymentInfoId;
	 }

	 /**
	  *
	  * @param paymentInfoId
	  * The paymentInfoId
	  */
	 public void setPaymentInfoId(long paymentInfoId) {
		 this.paymentInfoId = paymentInfoId;
	 }

	 /**
	  *
	  * @return
	  * The paymentReasonCodeId
	  */
	 public long getPaymentReasonCodeId() {
		 return paymentReasonCodeId;
	 }

	 /**
	  *
	  * @param paymentReasonCodeId
	  * The paymentReasonCodeId
	  */
	 public void setPaymentReasonCodeId(long paymentReasonCodeId) {
		 this.paymentReasonCodeId = paymentReasonCodeId;
	 }

	 /**
	  *
	  * @return
	  * The paymentReasonCodeReasonName
	  */
	 public String getPaymentReasonCodeReasonName() {
		 return paymentReasonCodeReasonName;
	 }

	 /**
	  *
	  * @param paymentReasonCodeReasonName
	  * The paymentReasonCodeReasonName
	  */
	 public void setPaymentReasonCodeReasonName(String paymentReasonCodeReasonName) {
		 this.paymentReasonCodeReasonName = paymentReasonCodeReasonName;
	 }

	 /**
	  *
	  * @return
	  * The paymentTypeId
	  */
	 public long getPaymentTypeId() {
		 return paymentTypeId;
	 }

	 /**
	  *
	  * @param paymentTypeId
	  * The paymentTypeId
	  */
	 public void setPaymentTypeId(long paymentTypeId) {
		 this.paymentTypeId = paymentTypeId;
	 }

	 /**
	  *
	  * @return
	  * The paymentTypeTypeCode
	  */
	 public String getPaymentTypeTypeCode() {
		 return paymentTypeTypeCode;
	 }

	 /**
	  *
	  * @param paymentTypeTypeCode
	  * The paymentTypeTypeCode
	  */
	 public void setPaymentTypeTypeCode(String paymentTypeTypeCode) {
		 this.paymentTypeTypeCode = paymentTypeTypeCode;
	 }

	 /**
	  *
	  * @return
	  * The pgId
	  */
	 public long getPgId() {
		 return pgId;
	 }

	 /**
	  *
	  * @param pgId
	  * The pgId
	  */
	 public void setPgId(long pgId) {
		 this.pgId = pgId;
	 }

	 /**
	  *
	  * @return
	  * The pgName
	  */
	 public String getPgName() {
		 return pgName;
	 }

	 /**
	  *
	  * @param pgName
	  * The pgName
	  */
	 public void setPgName(String pgName) {
		 this.pgName = pgName;
	 }

	 /**
	  *
	  * @return
	  * The pgReferenceId
	  */
	 public String getPgReferenceId() {
		 return pgReferenceId;
	 }

	 /**
	  *
	  * @param pgReferenceId
	  * The pgReferenceId
	  */
	 public void setPgReferenceId(String pgReferenceId) {
		 this.pgReferenceId = pgReferenceId;
	 }

	 /**
	  *
	  * @return
	  * The phoneNumber
	  */
	 public String getPhoneNumber() {
		 return phoneNumber;
	 }

	 /**
	  *
	  * @param phoneNumber
	  * The phoneNumber
	  */
	 public void setPhoneNumber(String phoneNumber) {
		 this.phoneNumber = phoneNumber;
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
	  * The receivedAmount
	  */
	 public BigDecimal getReceivedAmount() {
		 return receivedAmount;
	 }

	 /**
	  *
	  * @param receivedAmount
	  * The receivedAmount
	  */
	 public void setReceivedAmount(BigDecimal receivedAmount) {
		 this.receivedAmount = receivedAmount;
	 }

	 /**
	  *
	  * @return
	  * The status
	  */
	 public String getStatus() {
		 return status;
	 }

	 /**
	  *
	  * @param status
	  * The status
	  */
	 public void setStatus(String status) {
		 this.status = status;
	 }

	 /**
	  *
	  * @return
	  * The transactionId
	  */
	 public String getTransactionId() {
		 return transactionId;
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
	  * The transactionReferenceId
	  */
	 public String getTransactionReferenceId() {
		 return transactionReferenceId;
	 }

	 /**
	  *
	  * @param transactionReferenceId
	  * The transactionReferenceId
	  */
	 public void setTransactionReferenceId(String transactionReferenceId) {
		 this.transactionReferenceId = transactionReferenceId;
	 }

	 /**
	  *
	  * @return
	  * The userReferenceId
	  */
	 public String getUserReferenceId() {
		 return userReferenceId;
	 }

	 /**
	  *
	  * @param userReferenceId
	  * The userReferenceId
	  */
	 public void setUserReferenceId(String userReferenceId) {
		 this.userReferenceId = userReferenceId;
	 }

	 @Override
	 public String toString() {
		 return ToStringBuilder.reflectionToString(this);
	 }

}

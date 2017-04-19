package com.ailiens.common;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
"comment",
"customer_id",
"omsDetail",
"primary_issue_type",
"status",
"sub_issue"
})
public class UsiTicketCreationtInfo {

	@JsonProperty("comment")
	private String comment;
	@JsonProperty("customer_id")
	private String customerId;
	@JsonProperty("omsDetail")
	private UsiTicketOmsDetail omsDetail;
	@JsonProperty("primary_issue_type")
	private String primaryIssueType;
	@JsonProperty("status")
	private String status;
	@JsonProperty("sub_issue")
	private String subIssue;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	@JsonProperty("comment")
	public String getComment() {
	return comment;
	}
	@JsonProperty("comment")
	public void setComment(String comment) {
	this.comment = comment;
	}
	@JsonProperty("customer_id")
	public String getCustomerId() {
	return customerId;
	}

	@JsonProperty("customer_id")
	public void setCustomerId(String customerId) {
	this.customerId = customerId;
	}

	@JsonProperty("omsDetail")
	public UsiTicketOmsDetail getOmsDetail() {
	return omsDetail;
	}

	@JsonProperty("omsDetail")
	public void setOmsDetail(UsiTicketOmsDetail omsDetail) {
	this.omsDetail = omsDetail;
	}

	@JsonProperty("primary_issue_type")
	public String getPrimaryIssueType() {
	return primaryIssueType;
	}

	@JsonProperty("primary_issue_type")
	public void setPrimaryIssueType(String primaryIssueType) {
	this.primaryIssueType = primaryIssueType;
	}

	@JsonProperty("status")
	public String getStatus() {
	return status;
	}

	@JsonProperty("status")
	public void setStatus(String status) {
	this.status = status;
	}

	@JsonProperty("sub_issue")
	public String getSubIssue() {
	return subIssue;
	}

	@JsonProperty("sub_issue")
	public void setSubIssue(String subIssue) {
	this.subIssue = subIssue;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
	return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
	this.additionalProperties.put(name, value);
	}

}

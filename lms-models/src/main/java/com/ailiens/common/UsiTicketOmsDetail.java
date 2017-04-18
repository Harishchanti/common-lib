package com.ail.mbo.bumblebee.mbo.beans;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
"consignment_id",
"order_id"
})
public class UsiTicketOmsDetail {

	@JsonProperty("consignment_id")
	private String consignmentId;
	
	@JsonProperty("order_id")
	private String orderId;
	
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	@JsonProperty("consignment_id")
	public String getConsignmentId() {
		return consignmentId;
	}
	@JsonProperty("consignment_id")
	public void setConsignmentId(String consignmentId) {
	this.consignmentId = consignmentId;
	}
	@JsonProperty("order_id")
	public String getOrderId() {
	return orderId;
	}
	@JsonProperty("order_id")
	public void setOrderId(String orderId) {
	this.orderId = orderId;
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
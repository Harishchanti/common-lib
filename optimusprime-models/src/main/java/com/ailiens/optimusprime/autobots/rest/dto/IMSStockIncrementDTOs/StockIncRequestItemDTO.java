package com.ailiens.optimusprime.autobots.rest.dto.IMSStockIncrementDTOs;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
	"fcId",
	"ean",
	"skuId",
	"transactionType",
	"quantity",
	"destination",
	"source"
})
public class StockIncRequestItemDTO {

	@JsonProperty("fcId")
	private String fcId;
	@JsonProperty("ean")
	private String ean;
	@JsonProperty("skuId")
	private String skuId;
	@JsonProperty("transactionType")
	private String transactionType;
	@JsonProperty("quantity")
	private Integer quantity;
	@JsonProperty("destination")
	private String destination;
	@JsonProperty("source")
	private String source;
	/**
	 *
	 * @return
	 * The fcId
	 */
	@JsonProperty("fcId")
	public String getFcId() {
		return fcId;
	}


	public StockIncRequestItemDTO(){

	}
	/**
	 *
	 * @param fcId
	 * The fcId
	 */
	@JsonProperty("fcId")
	public void setFcId(String fcId) {
		this.fcId = fcId;
	}

	/**
	 *
	 * @return
	 * The ean
	 */
	@JsonProperty("ean")
	public String getEan() {
		return ean;
	}

	/**
	 *
	 * @param ean
	 * The ean
	 */
	@JsonProperty("ean")
	public void setEan(String ean) {
		this.ean = ean;
	}

	/**
	 *
	 * @return
	 * The skuId
	 */
	@JsonProperty("skuId")
	public String getSkuId() {
		return skuId;
	}

	/**
	 *
	 * @param skuId
	 * The skuId
	 */
	@JsonProperty("skuId")
	public void setSkuId(String skuId) {
		this.skuId = skuId;
	}

	/**
	 *
	 * @return
	 * The transactionType
	 */
	@JsonProperty("transactionType")
	public String getTransactionType() {
		return transactionType;
	}

	/**
	 *
	 * @param transactionType
	 * The transactionType
	 */
	@JsonProperty("transactionType")
	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

	/**
	 *
	 * @return
	 * The quantity
	 */
	@JsonProperty("quantity")
	public Integer getQuantity() {
		return quantity;
	}

	/**
	 *
	 * @param quantity
	 * The quantity
	 */
	@JsonProperty("quantity")
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	/**
	 *
	 * @return
	 * The destination
	 */
	@JsonProperty("destination")
	public String getDestination() {
		return destination;
	}

	/**
	 *
	 * @param destination
	 * The destination
	 */
	@JsonProperty("destination")
	public void setDestination(String destination) {
		this.destination = destination;
	}

	/**
	 *
	 * @return
	 * The source
	 */
	@JsonProperty("source")
	public String getSource() {
		return source;
	}

	/**
	 *
	 * @param source
	 * The source
	 */
	@JsonProperty("source")
	public void setSource(String source) {
		this.source = source;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

}

package com.ailiens.optimusprime.autobots.rest.dto;

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
    "customerName",
    "bankName",
    "branchAddress",
    "accountNature",
    "accountNumber",
    "ifscCode"
})
public class NeftDetailsDTO {

    @JsonProperty("customerName")
    private String customerName;
    @JsonProperty("bankName")
    private String bankName;
    @JsonProperty("branchAddress")
    private String branchAddress;
    @JsonProperty("branchName")
    private String branchName;
    @JsonProperty("accountNature")
    private String accountNature;
    @JsonProperty("accountNumber")
    private String accountNumber;
    @JsonProperty("ifscCode")
    private String ifscCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return
     * The customerName
     */
    @JsonProperty("customerName")
    public String getCustomerName() {
        return customerName;
    }

    /**
     *
     * @param customerName
     * The customerName
     */
    @JsonProperty("customerName")
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    /**
     *
     * @return
     * The bankName
     */
    @JsonProperty("bankName")
    public String getBankName() {
        return bankName;
    }

    /**
     *
     * @param bankName
     * The bankName
     */
    @JsonProperty("bankName")
    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    /**
     *
     * @return
     * The branchAddress
     */
    @JsonProperty("branchAddress")
    public String getBranchAddress() {
        return branchAddress;
    }

    /**
     *
     * @param branchAddress
     * The branchAddress
     */
    @JsonProperty("branchAddress")
    public void setBranchAddress(String branchAddress) {
        this.branchAddress = branchAddress;
    }

    /**
     *
     * @return
     * The accountNature
     */
    @JsonProperty("accountNature")
    public String getAccountNature() {
        return accountNature;
    }

    /**
     *
     * @param accountNature
     * The accountNature
     */
    @JsonProperty("accountNature")
    public void setAccountNature(String accountNature) {
        this.accountNature = accountNature;
    }

    /**
     *
     * @return
     * The accountNumber
     */
    @JsonProperty("accountNumber")
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     *
     * @param accountNumber
     * The accountNumber
     */
    @JsonProperty("accountNumber")
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    /**
     *
     * @return
     * The ifscCode
     */
    @JsonProperty("ifscCode")
    public String getIfscCode() {
        return ifscCode;
    }

    /**
     *
     * @param ifscCode
     * The ifscCode
     */
    @JsonProperty("ifscCode")
    public void setIfscCode(String ifscCode) {
        this.ifscCode = ifscCode;
    }

    /**
    *
    * @return
    * The branchName
    */
    public String getBranchName() {
		return branchName;
	}

    /**
    *
    * @param branchName
    * The branchName
    */
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	@JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return "NeftDetailsDTO{" +
            "customerName='" + customerName + '\'' +
            ", bankName='" + bankName + '\'' +
            ", branchAddress='" + branchAddress + '\'' +
            ", branchName='" + branchName + '\'' +
            ", accountNature='" + accountNature + '\'' +
            ", accountNumber='" + accountNumber + '\'' +
            ", ifscCode='" + ifscCode + '\'' +
            ", additionalProperties=" + additionalProperties +
            '}';
    }


    public NeftDetailsDTO(){

    }
}

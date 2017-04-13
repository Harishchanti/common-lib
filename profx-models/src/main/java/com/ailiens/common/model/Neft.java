package com.ailiens.common.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.io.Serializable;

/**
 * Created by akki on 4/1/16.
 */

public class Neft implements Serializable {

    /**
	 *
	 */
	private static final long serialVersionUID = -3291405902915503102L;
	private String customerName;
    @NotNull
    private String bankName;
    private String branchAddress;
    private String accountNature;
    private String branchName;
    @NotNull
    @Pattern(regexp="^[0-9]+$")
    private String accountNumber;
    @NotNull
    private String ifscCode;
    private boolean encrypted;

    public Neft() {
    }

    public boolean isEncrypted() {
        return encrypted;
    }

    public void setEncrypted(boolean encrypted) {
        this.encrypted = encrypted;
    }

    public Neft(String customerName, String bankName, String branchAddress, String accountNature, String branchName, String accountNumber, String ifscCode) {
        this.customerName = customerName;
        this.bankName = bankName;
        this.branchAddress = branchAddress;
        this.accountNature = accountNature;
        this.branchName = branchName;
        this.accountNumber = accountNumber;
        this.ifscCode = ifscCode;
    }

    public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBranchAddress() {
        return branchAddress;
    }

    public void setBranchAddress(String branchAddress) {
        this.branchAddress = branchAddress;
    }

    public String getAccountNature() {
        return accountNature;
    }

    public void setAccountNature(String accountNature) {
        this.accountNature = accountNature;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getIfscCode() {
        return ifscCode;
    }

    public void setIfscCode(String ifscCode) {
        this.ifscCode = ifscCode;
    }

    @Override
    public String toString() {
        return "Neft{" +
                "customerName='" + customerName + '\'' +
                ", bankName='" + bankName + '\'' +
                ", branchAddress='" + branchAddress + '\'' +
                ", accountNature='" + accountNature + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                ", ifscCode='" + ifscCode + '\'' +
                '}';
    }
}

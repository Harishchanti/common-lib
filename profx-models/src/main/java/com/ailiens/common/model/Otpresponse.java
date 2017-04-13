package com.ailiens.common.model;

public class Otpresponse
{
    private String amount;

    private String walletName;

    private String status;

    private String userId;

    private String errorCode;

    private String errorMessage;

    public String getAmount ()
    {
        return amount;
    }

    public void setAmount (String amount)
    {
        this.amount = amount;
    }

    public String getWalletName ()
    {
        return walletName;
    }

    public void setWalletName (String walletName)
    {
        this.walletName = walletName;
    }

    public String getStatus ()
    {
        return status;
    }

    public void setStatus (String status)
    {
        this.status = status;
    }

    public String getUserId ()
    {
        return userId;
    }

    public void setUserId (String userId)
    {
        this.userId = userId;
    }

    public String getErrorCode ()
    {
        return errorCode;
    }

    public void setErrorCode (String errorCode)
    {
        this.errorCode = errorCode;
    }

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
    @Override
    public String toString()
    {
        return "ClassPojo [amount = "+amount+", walletName = "+walletName+", status = "+status+", userId = "+userId+", errorCode = "+errorCode+"]";
    }


}

package com.ailiens.common.model;

import java.io.Serializable;

/**
 * Created by akki on 4/12/15.
 */
public class Wallet implements Serializable {

    /**
	 *
	 */
	private static final long serialVersionUID = 3861596317203553812L;
	private String walletId;
    private String walletName;
    private boolean isActive;

    public String getWalletId() {
        return walletId;
    }

    public void setWalletId(String walletId) {
        this.walletId = walletId;
    }

    public String getWalletName() {
        return walletName;
    }

    public void setWalletName(String walletName) {
        this.walletName = walletName;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
}

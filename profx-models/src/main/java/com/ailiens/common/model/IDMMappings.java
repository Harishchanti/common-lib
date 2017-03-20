package com.ailiens.common.model;

import java.io.Serializable;
import java.util.List;

/**
 * Created by vaibhav on 19/10/15.
 */
public class IDMMappings implements Serializable {


    /**
	 *
	 */
	private static final long serialVersionUID = -8959700033090242937L;

	public String getIdmProvider() {
        return idmProvider;
    }

    public void setIdmProvider(String idmProvider) {
        this.idmProvider = idmProvider;
    }

    private String idmProvider;
    private List<String> associatedIds;

    public List<String> getAssociatedIds() {
        return associatedIds;
    }

    public void setAssociatedIds(List<String> associatedIds) {
        this.associatedIds = associatedIds;
    }



}

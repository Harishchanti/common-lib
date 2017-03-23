package com.ailiens.common.beans;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class GenericReturnBean<T,S> {

	private List<String> failed;
	private List<String> success;
	private List<String> pending;
	private List<String> updated;
	private List<String> inserted;
	private List<String> uniqueKeys;
	private List<String> errorMessages;
	private List<String> missingIds;
	private List<String> nochanges;
	private List<String> invalid;
	private List<String> paused;
	private List<T> data;
	private List<S> indexData;
	private String message;
	private Map<String,String> mapping;

	public GenericReturnBean() {
		failed = new ArrayList<String>();
		success = new ArrayList<String>();
		pending = new ArrayList<String>();
		updated = new ArrayList<String>();
		inserted = new ArrayList<String>();
		uniqueKeys = new ArrayList<String>();
		errorMessages = new ArrayList<String>();
		missingIds = new ArrayList<String>();
		invalid = new ArrayList<String>();
		nochanges = new ArrayList<String>();
	}


	public List<String> getNochanges() {
		return nochanges;
	}


	public void setNochanges(List<String> nochanges) {
		this.nochanges = nochanges;
	}

	public List<String> getInvalid() {
		return invalid;
	}

	public void setInvalid(List<String> invalid) {
		this.invalid = invalid;
	}



	public List<String> getMissingIds() {
		return missingIds;
	}



	public void setMissingIds(List<String> missingIds) {
		this.missingIds = missingIds;
	}



	public List<String> getUniqueKeys() {
		return uniqueKeys;
	}


	public void setUniqueKeys(List<String> uniqueKeys) {
		this.uniqueKeys = uniqueKeys;
	}


	public List<String> getFailed() {
		return failed;
	}
	public void setFailed(List<String> failed) {
		this.failed = failed;
	}
	public List<String> getSuccess() {
		return success;
	}
	public void setSuccess(List<String> success) {
		this.success = success;
	}

	public void addToFailed(String value) {
		if(!failed.contains(value)) {
			failed.add(value);
		}
	}

	public void addToMissingIds(String value) {
		if(!missingIds.contains(value)) {
			missingIds.add(value);
		}
	}

	public void addToUniqueKeys(String value) {
		if(value == null) {
			return;
		}
		if(!uniqueKeys.contains(value)) {
			uniqueKeys.add(value);
		}
	}

	public void addToInserted(String value) {
		if(value == null) {
			return;
		}
		if(!inserted.contains(value)) {
			inserted.add(value);
		}
	}

	public void addToUpdated(String value) {
		if(value == null) {
			return;
		}
		if(!updated.contains(value)) {
			updated.add(value);
		}
	}

	public void addToSuccess(String value) {
		if(value == null) {
			return;
		}
		if(!success.contains(value)) {
			success.add(value);
		}
	}

	public void addToPending(String value) {
		if(value == null) {
			return;
		}
		if(!pending.add(value)) {
			pending.add(value);
		}
	}

	public void addToPending(List<String> list) {
		if(list != null) {
			pending.addAll(list);
		}
	}

	public void addToUniqueKeys(List<String> list) {
		if(list != null) {
			uniqueKeys.addAll(list);
		}
	}

	public void addToUpdated(List<String> list) {
		if(list != null) {
			updated.addAll(list);
		}
	}

	public void addToInserted(List<String> list) {
		if(list != null) {
			inserted.addAll(list);
		}
	}

	public void addToSuccess(List<String> list) {
		if(list != null) {
			success.addAll(list);
		}
	}

	public void addToFailed(List<String> list) {
		if(list != null) {
			failed.addAll(list);
		}
	}

	public List<String> getPending() {
		return pending;
	}

	public void setPending(List<String> pending) {
		this.pending = pending;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public List<String> getUpdated() {
		return updated;
	}

	public void setUpdated(List<String> updated) {
		this.updated = updated;
	}

	public List<String> getInserted() {
		return inserted;
	}

	public void setInserted(List<String> inserted) {
		this.inserted = inserted;
	}

	public List<T> getData() {
		return data;
	}

	public void setData(List<T> data) {
		this.data = data;
	}


	public Map<String, String> getMapping() {
		return mapping;
	}
	public void setMapping(Map<String, String> mapping) {
		this.mapping = mapping;
	}


	public List<String> getErrorMessages() {
		return errorMessages;
	}
	public void setErrorMessages(List<String> errorMessages) {
		this.errorMessages = errorMessages;
	}


	public List<S> getIndexData() {
		return indexData;
	}


	public void setIndexData(List<S> indexData) {
		this.indexData = indexData;
	}

	public void addToNochange(String value) {
		if(!nochanges.contains(value)) {
			nochanges.add(value);
		}
	}

	public List<String> getPaused() {
		return paused;
	}

	public void setPaused(List<String> paused) {
		this.paused = paused;
	}

}

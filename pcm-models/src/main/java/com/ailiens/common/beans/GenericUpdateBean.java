package com.ailiens.common.beans;

import java.util.ArrayList;
import java.util.List;

public class GenericUpdateBean {

	private List<String> inserted;
	private List<String> updated;
	private List<String> pending;
	private List<String> failed;
	private String message;

	public GenericUpdateBean() {
		inserted = new ArrayList<String>();
		updated = new ArrayList<String>();
		pending = new ArrayList<String>();
		failed = new ArrayList<String>();
	}

	public List<String> getInserted() {
		return inserted;
	}
	public void setInserted(List<String> inserted) {
		this.inserted = inserted;
	}
	public List<String> getUpdated() {
		return updated;
	}
	public void setUpdated(List<String> updated) {
		this.updated = updated;
	}
	public List<String> getPending() {
		return pending;
	}
	public void setPending(List<String> pending) {
		this.pending = pending;
	}
	public List<String> getFailed() {
		return failed;
	}
	public void setFailed(List<String> failed) {
		this.failed = failed;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}

	public void addToInserted(String value) {
		inserted.add(value);
	}

	public void addToInserted(List<String> list) {
		if(list != null) {
			inserted.addAll(list);
		}
	}

	public void addToUpdated(List<String> list) {
		if(list != null) {
			updated.addAll(list);
		}
	}

	public void addToFailed(List<String> list) {
		if(list != null) {
			failed.addAll(list);
		}
	}

	public void addToFailed(List<String> list1, List<String> list2) {
		if(list1 != null) {
			failed.addAll(list1);
		}
		if(list2 != null) {
			failed.addAll(list2);
		}
	}

	public void addToUpdated(String value) {
		updated.add(value);
	}

	public void addToPending(String value) {
		pending.add(value);
	}

	public void addToPending(List<String> list) {
		if(list != null) {
			pending.addAll(list);
		}
	}
}

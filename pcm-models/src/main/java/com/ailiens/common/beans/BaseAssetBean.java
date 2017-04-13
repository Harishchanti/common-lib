package com.ailiens.common.beans;


public class BaseAssetBean {

	private String createdBy;

	private String createdTime;

	private String lastModifiedTime;

	private String status;

	private String objectId;

	private String docType;

	private String lastModifiedBy;

	private String message;

	private Boolean dbUpdate;

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(String createdTime) {
		this.createdTime = createdTime;
	}

	public String getLastModifiedTime() {
		return lastModifiedTime;
	}

	public void setLastModifiedTime(String lastModifiedTime) {
		this.lastModifiedTime = lastModifiedTime;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getDocType() {
		return docType;
	}

	public void setDocType(String docType) {
		this.docType = docType;
	}

	public String getObjectId() {
		return objectId;
	}

	public void setObjectId(String objectId) {
		this.objectId = objectId;
	}

	public String getLastModifiedBy() {
		return lastModifiedBy;
	}

	public void setLastModifiedBy(String lastModifiedBy) {
		this.lastModifiedBy = lastModifiedBy;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Boolean getDbUpdate() {
		return dbUpdate;
	}

	public void setDbUpdate(Boolean dbUpdate) {
		this.dbUpdate = dbUpdate;
	}


}

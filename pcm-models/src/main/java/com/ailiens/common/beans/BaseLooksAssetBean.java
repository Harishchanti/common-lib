package com.ailiens.common.beans;


import com.ailiens.common.deserializers.LooksDeserializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize(using = LooksDeserializer.class)
public interface BaseLooksAssetBean {
	public String getLookId();

	public Object getId();

	public void setObjectId(String objectId);

	public String getDocType();

	public String getPreviousId();

	public String getObjectId();

	public void setStatus(String status);

	public void setLastModifiedTime(String lastModifiedTime);

	public void setLastModifiedBy(String username);

	public void setCreatedTime(String time);
	public String getCreatedTime();

	public String getStatus();

	public String getLastModifiedTime();
}

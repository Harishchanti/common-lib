package com.ailiens.common.beans;


import com.ailiens.common.deserializers.BrandsDeserializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize(using = BrandsDeserializer.class)
public interface BaseBrandAssetBean {
	public String getBrandId();

	public Object getId();

	public String getDocType();

	public String getPreviousId();
	public String getObjectId();

	public void setStatus(String status);

	public void setLastModifiedTime(String lastModifiedTime);

	public void setCreatedTime(String createdTime);

	public void setObjectId(String string);

	public void setLastModifiedBy(String username);

	public String getCreatedTime();

	public String getStatus();

	public String getLastModifiedTime();
}

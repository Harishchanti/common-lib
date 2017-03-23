package com.ailiens.common.beans;


import com.ailiens.common.deserializers.StylesDeserializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;


@JsonDeserialize(using = StylesDeserializer.class)
public interface BaseStyleAssetBean {
	public String getStyleId();

	public Object getId();
	public String getDocType();

	public String getPreviousId();
	public String getObjectId();
	public void setStatus(String status);

	public void setLastModifiedTime(String lastModifiedTime);
	public void setCreatedTime(String time);
	public void setObjectId(String objectId);
	public String getCreatedTime();
	public String getStatus();

	public String getLastModifiedTime();
	public void setLastModifiedBy(String username);
	public void setCreatedBy(String ceatedBy);
	public void setPreviousId(String previousId);

	public void setMessage(String message);
	public void setDbUpdate(Boolean flag);
	public Boolean getDbUpdate();
	public String getMessage();
}

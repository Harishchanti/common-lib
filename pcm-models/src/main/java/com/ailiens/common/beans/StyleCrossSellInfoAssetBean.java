package com.ailiens.common.beans;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Id;

import java.util.List;

@JsonDeserialize(as = StyleCrossSellInfoAssetBean.class)
@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class StyleCrossSellInfoAssetBean extends BaseAssetBean implements BaseStyleAssetBean {

	@Id
	private ObjectId id;
	private String styleId;
	private List<String> secondaryStyleIds;
	private String previousId;


	public ObjectId getId() {
		return id;
	}
	public void setId(ObjectId id) {
		this.id = id;
	}
	public String getStyleId() {
		return styleId;
	}
	public void setStyleId(String styleId) {
		this.styleId = styleId;
	}
	public List<String> getSecondaryStyleIds() {
		return secondaryStyleIds;
	}
	public void setSecondaryStyleIds(List<String> secondaryStyleIds) {
		this.secondaryStyleIds = secondaryStyleIds;
	}
	public String getPreviousId() {
		return previousId;
	}
	public void setPreviousId(String previousId) {
		this.previousId = previousId;
	}


}

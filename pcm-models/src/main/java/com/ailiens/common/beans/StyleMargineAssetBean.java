package com.ailiens.common.beans;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.bson.types.ObjectId;
import org.hibernate.validator.constraints.NotBlank;
import org.mongodb.morphia.annotations.Id;

@JsonDeserialize(as = StyleMargineAssetBean.class)
public class StyleMargineAssetBean extends BaseAssetBean implements BaseStyleAssetBean {

	@Id
	private ObjectId id;

	@NotBlank
	private String styleId;

	private Double marginPercentage;
	private String marginType;
//	private Boolean isActive;
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

	public Double getMarginPercentage() {
		return marginPercentage;
	}

	public void setMarginPercentage(Double marginPercentage) {
//		BigDecimal bd = new BigDecimal(marginPercentage).setScale(2, RoundingMode.FLOOR);
//		this.marginPercentage = bd.doubleValue();
		this.marginPercentage = marginPercentage;
	}

	public String getMarginType() {
		return marginType;
	}
	public void setMarginType(String marginType) {
		this.marginType = marginType;
	}
/*	public Boolean getIsActive() {
		return isActive;
	}
	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}
*/
	public String getPreviousId() {
		return previousId;
	}
	public void setPreviousId(String previousId) {
		this.previousId = previousId;
	}
}

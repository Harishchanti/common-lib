package com.ailiens.common.beans;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.apache.commons.lang.StringUtils;
import org.bson.types.ObjectId;
import org.hibernate.validator.constraints.NotBlank;
import org.mongodb.morphia.annotations.Id;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@JsonDeserialize(as = StyleBaseInfoAssetBean.class)
public class StyleBaseInfoAssetBean extends BaseAssetBean implements BaseStyleAssetBean {

	@Id
	private ObjectId id;

	@NotBlank
	private String styleId;

	private String baseProduct;
	private String ageGroup;

	@NotBlank
	private String merchandiseCategory;

	@NotBlank
	private String name;

	@NotBlank
	private String story;

	private String compositionAndCare;

	private String sizeChartId;

	@NotBlank
	private String pcmArticleType;

	@NotBlank
	private String legalBrandName;

	@NotBlank
	private String gender;

	@NotBlank
	private String primaryColor;

	private String secondaryColor;

	private String specs;

	private List<String> usage;

	// added for Sephora
	@NotBlank
	private String pcmSeason;
	@NotBlank
	private String pcmYear;
	private String whatItIsformulatedToDo;
	private String whatItIsformulatedWithout;
	private String whatElseneedToKnow;
	private String whatItDoes;
	private String suggestedUsage;
	private String precautions;
	private String style;
	private String notes;
	//additional attributes for sephore
	private String researchResults;
	private String ingredients;
	private String texture;
	private String modelCode;

	Map<String,Object> specificAttributes;
	private String url;
	private String urlPart;
	private String previousId;

	private Boolean returnable;
	private Boolean sentToQc;

	private String secondaryColorHexCode;

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

	public String getAgeGroup() {
		return ageGroup;
	}

	public void setAgeGroup(String ageGroup) {
		this.ageGroup = ageGroup;
	}

	public String getBaseProduct() {
		return baseProduct;
	}

	public void setBaseProduct(String baseProduct) {
		this.baseProduct = baseProduct;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStory() {
		return story;
	}

	public void setStory(String story) {
		this.story = story;
	}

	public String getCompositionAndCare() {
		return compositionAndCare;
	}

	public void setCompositionAndCare(String compositionAndCare) {
		this.compositionAndCare = compositionAndCare;
	}

	public String getSizeChartId() {
		return sizeChartId;
	}

	public void setSizeChartId(String sizeChartId) {
		this.sizeChartId = sizeChartId;
	}

	public String getPcmArticleType() {
		return pcmArticleType;
	}

	public void setPcmArticleType(String pcmArticleType) {
		this.pcmArticleType = pcmArticleType;
	}

	public String getLegalBrandName() {
		return legalBrandName;
	}

	public void setLegalBrandName(String legalBrandName) {
		this.legalBrandName = legalBrandName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPrimaryColor() {
		return primaryColor;
	}

	public void setPrimaryColor(String primaryColor) {
		this.primaryColor = primaryColor;
	}

	public String getSecondaryColor() {
		return secondaryColor;
	}

	public void setSecondaryColor(String secondaryColor) {
		this.secondaryColor = secondaryColor;
	}

	public String getSpecs() {
		return specs;
	}

	public void setSpecs(String specs) {
		this.specs = specs;
	}

	public List<String> getUsage() {
		return usage;
	}

	public void setUsage(List<String> usage) {
		this.usage = usage;
	}

	public Map<String, Object> getSpecificAttributes() {
		return specificAttributes;
	}

	public void setSpecificAttributes(Map<String, Object> specificAttributes) {
		this.specificAttributes = specificAttributes;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUrlPart() {
		return urlPart;
	}

	public void setUrlPart(String urlPart) {
		this.urlPart = urlPart;
	}

	public String getPreviousId() {
		return previousId;
	}

	public void setPreviousId(String previousId) {
		this.previousId = previousId;
	}

	public Boolean getReturnable() {
		return returnable;
	}

	public void setReturnable(Boolean returnable) {
		this.returnable = returnable;
	}

	public String getMerchandiseCategory() {
		return merchandiseCategory;
	}

	public void setMerchandiseCategory(String merchandiseCategory) {
		this.merchandiseCategory = merchandiseCategory;
	}

	public List<String> validateFields() {
		List<String> requiredAttributes = new ArrayList<String>();

		String pcmArticleType = getPcmArticleType();
		if(StringUtils.trimToNull(pcmArticleType) == null) {
			requiredAttributes.add("pcmArticleType");
		}

		String legalBrandName = getLegalBrandName();
		if(StringUtils.trimToNull(legalBrandName) == null) {
			requiredAttributes.add("legalBrandName");
		}

		String gender = getGender();
		if(StringUtils.trimToNull(gender) == null) {
			requiredAttributes.add("gender");
		}

		String merchandiseCategory = getMerchandiseCategory();
		if(StringUtils.trimToNull(merchandiseCategory) == null) {
			requiredAttributes.add("merchandiseCategory");
		}

		String primaryColor = getPrimaryColor();
		if(StringUtils.trimToNull(primaryColor) == null) {
			requiredAttributes.add("primaryColor");
		}

		String story = getStory();
		if(StringUtils.trimToNull(story) == null) {
			requiredAttributes.add("story");
		}

		String specs = getSpecs();
		if(StringUtils.trimToNull(specs) == null) {
			requiredAttributes.add("specs");
		}

		String compositionAndCare = getCompositionAndCare();
		if(StringUtils.trimToNull(compositionAndCare) == null) {
			requiredAttributes.add("compositionAndCare");
		}

		String diplayName = getName();
		if(StringUtils.trimToNull(diplayName) == null) {
			requiredAttributes.add("name");
		}
		return requiredAttributes;
	}

	public String getPcmSeason() {
		return pcmSeason;
	}

	public void setPcmSeason(String pcmSeason) {
		this.pcmSeason = pcmSeason;
	}

	public String getPcmYear() {
		return pcmYear;
	}

	public void setPcmYear(String pcmYear) {
		this.pcmYear = pcmYear;
	}

	public String getWhatItIsformulatedToDo() {
		return whatItIsformulatedToDo;
	}

	public void setWhatItIsformulatedToDo(String whatItIsformulatedToDo) {
		this.whatItIsformulatedToDo = whatItIsformulatedToDo;
	}

	public String getWhatItIsformulatedWithout() {
		return whatItIsformulatedWithout;
	}

	public void setWhatItIsformulatedWithout(String whatItIsformulatedWithout) {
		this.whatItIsformulatedWithout = whatItIsformulatedWithout;
	}

	public String getWhatElseneedToKnow() {
		return whatElseneedToKnow;
	}

	public void setWhatElseneedToKnow(String whatElseneedToKnow) {
		this.whatElseneedToKnow = whatElseneedToKnow;
	}

	public String getWhatItDoes() {
		return whatItDoes;
	}

	public void setWhatItDoes(String whatItDoes) {
		this.whatItDoes = whatItDoes;
	}

	public String getSuggestedUsage() {
		return suggestedUsage;
	}

	public void setSuggestedUsage(String suggestedUsage) {
		this.suggestedUsage = suggestedUsage;
	}

	public String getPrecautions() {
		return precautions;
	}

	public void setPrecautions(String precautions) {
		this.precautions = precautions;
	}

	public String getStyle() {
		return style;
	}

	public void setStyle(String style) {
		this.style = style;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}


	public String getResearchResults() {
		return researchResults;
	}

	public void setResearchResults(String researchResults) {
		this.researchResults = researchResults;
	}

	public String getIngredients() {
		return ingredients;
	}

	public void setIngredients(String ingredients) {
		this.ingredients = ingredients;
	}

	public String getTexture() {
		return texture;
	}

	public void setTexture(String texture) {
		this.texture = texture;
	}

	public String getModelCode() {
		return modelCode;
	}

	public void setModelCode(String modelCode) {
		this.modelCode = modelCode;
	}

	public Boolean getSentToQc() {
		return sentToQc;
	}

	public void setSentToQc(Boolean sentToQc) {
		this.sentToQc = sentToQc;
	}

	public String getSecondaryColorHexCode() {
		return secondaryColorHexCode;
	}

	public void setSecondaryColorHexCode(String secondaryColorHexCode) {
		this.secondaryColorHexCode = secondaryColorHexCode;
	}


}

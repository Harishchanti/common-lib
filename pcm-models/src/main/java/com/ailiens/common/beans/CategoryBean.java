package com.ailiens.common.beans;

import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

import java.util.Map;

@Entity("categories")
public class CategoryBean extends BaseBean implements BaseCategoryBean {

	@Id
	private String id;

	private String docType;

	private String level1;

	private String level2;

	private String level3;

	private String label;

	private String categoryLevel1;

	private String categoryLevel2;

	private String landingPageUrlLevel1;

	private String landingPageUrlLevel2;

	private Map<String,Object> specificAttributes;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDocType() {
		return docType;
	}

	public void setDocType(String docType) {
		this.docType = docType;
	}

	public Map<String, Object> getSpecificAttributes() {
		return specificAttributes;
	}

	public void setSpecificAttributes(Map<String, Object> specificAttributes) {
		this.specificAttributes = specificAttributes;
	}

	public String getLevel1() {
		return level1;
	}

	public void setLevel1(String level1) {
		this.level1 = level1;
	}

	public String getLevel2() {
		return level2;
	}

	public void setLevel2(String level2) {
		this.level2 = level2;
	}

	public String getLevel3() {
		return level3;
	}

	public void setLevel3(String level3) {
		this.level3 = level3;
	}

	public String getCategoryLevel1() {
		return categoryLevel1;
	}

	public void setCategoryLevel1(String categoryLevel1) {
		this.categoryLevel1 = categoryLevel1;
	}

	public String getCategoryLevel2() {
		return categoryLevel2;
	}

	public void setCategoryLevel2(String categoryLevel2) {
		this.categoryLevel2 = categoryLevel2;
	}

	public String getLandingPageUrlLevel1() {
		return landingPageUrlLevel1;
	}

	public void setLandingPageUrlLevel1(String landingPageUrlLevel1) {
		this.landingPageUrlLevel1 = landingPageUrlLevel1;
	}

	public String getLandingPageUrlLevel2() {
		return landingPageUrlLevel2;
	}

	public void setLandingPageUrlLevel2(String landingPageUrlLevel2) {
		this.landingPageUrlLevel2 = landingPageUrlLevel2;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}
}

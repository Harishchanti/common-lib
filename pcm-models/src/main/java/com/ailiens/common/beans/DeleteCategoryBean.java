package com.ailiens.common.beans;

import java.util.List;

public class DeleteCategoryBean {

	private String styleId;

	private String category;

	private String level1;

	private String level2;

	private String level3;

	private List<String> categoryKeys;

	public String getStyleId() {
		return styleId;
	}

	public void setStyleId(String styleId) {
		this.styleId = styleId;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
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

	public List<String> getCategoryKeys() {
		return categoryKeys;
	}

	public void setCategoryKeys(List<String> categoryKeys) {
		this.categoryKeys = categoryKeys;
	}

}

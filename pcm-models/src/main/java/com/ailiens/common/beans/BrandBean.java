package com.ailiens.common.beans;

import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

import java.util.Map;

@Entity("brands")
public class BrandBean extends BaseBean implements BaseBrandBean {

	@Id
	private String id;

	private String docType;

	private BrandBasicInfoBean basicInformation;

	private Map<String,BrandContentBean> content;

	private BrandImageBean images;

	public String getDocType() {
		return docType;
	}

	public void setDocType(String docType) {
		this.docType = docType;
	}

	public BrandBasicInfoBean getBasicInformation() {
		return basicInformation;
	}

	public void setBasicInformation(BrandBasicInfoBean basicInformation) {
		this.basicInformation = basicInformation;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Map<String, BrandContentBean> getContent() {
		return content;
	}

	public void setContent(Map<String, BrandContentBean> content) {
		this.content = content;
	}

	public BrandImageBean getImages() {
		return images;
	}

	public void setImages(BrandImageBean images) {
		this.images = images;
	}

}


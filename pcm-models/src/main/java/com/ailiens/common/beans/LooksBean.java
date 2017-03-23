package com.ailiens.common.beans;


import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

import java.util.Map;

@Entity("looks")
public class LooksBean extends BaseBean implements BaseLooksBean {

	@Id
	private String id;

	private String docType;

	private LooksBasicInfoBean basicInformation;

	private Map<String,LooksContentBean> content;

	private LooksImageBean images;

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

	public LooksBasicInfoBean getBasicInformation() {
		return basicInformation;
	}

	public void setBasicInformation(LooksBasicInfoBean basicInformation) {
		this.basicInformation = basicInformation;
	}

	public Map<String, LooksContentBean> getContent() {
		return content;
	}

	public void setContent(Map<String, LooksContentBean> content) {
		this.content = content;
	}

	public LooksImageBean getImages() {
		return images;
	}

	public void setImages(LooksImageBean images) {
		this.images = images;
	}


}

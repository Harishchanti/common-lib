package com.ailiens.common.beans;

import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

import java.util.Map;

@Entity("styles")
public class StyleBean extends BaseBean implements BaseStyleBean {

	@Id
	private String id;

	private String docType;

	private StyleBasicInfoBean basicInformation;

	private StyleImageBean images;

	private Map<String,String> video;

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

	public StyleBasicInfoBean getBasicInformation() {
		return basicInformation;
	}

	public void setBasicInformation(StyleBasicInfoBean basicInformation) {
		this.basicInformation = basicInformation;
	}

	public StyleImageBean getImages() {
		return images;
	}

	public void setImages(StyleImageBean images) {
		this.images = images;
	}

	public Map<String, String> getVideo() {
		return video;
	}

	public void setVideo(Map<String, String> video) {
		this.video = video;
	}
}

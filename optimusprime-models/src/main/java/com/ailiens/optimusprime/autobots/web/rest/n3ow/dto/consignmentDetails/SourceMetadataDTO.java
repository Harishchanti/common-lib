package com.ailiens.optimusprime.autobots.web.rest.n3ow.dto.consignmentDetails;

import javax.annotation.Generated;
import javax.persistence.Column;
@Generated("org.jsonschema2pojo")
public class SourceMetadataDTO {

	private String name;

	private String sourceReferenceId;


	private String banner;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSourceReferenceId() {
		return sourceReferenceId;
	}

	public void setSourceReferenceId(String sourceReferenceId) {
		this.sourceReferenceId = sourceReferenceId;
	}

	public String getBanner() {
		return banner;
	}

	public void setBanner(String banner) {
		this.banner = banner;
	}

	  public SourceMetadataDTO() {

      }
}

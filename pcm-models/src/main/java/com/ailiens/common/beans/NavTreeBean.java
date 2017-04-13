package com.ailiens.common.beans;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.bson.types.ObjectId;
import org.hibernate.validator.constraints.NotEmpty;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;

@Entity("navtree")
@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class NavTreeBean extends BaseAssetBean implements BaseNavTreeBean {

	@Id
	private ObjectId id;

	private String navTreeId;

	@NotEmpty
	private String label;

	@NotNull
	private Integer level;

	@NotNull
	private Integer order;

	private String parentId;

	private Integer fontSize;

	private String fontFamily;

	private String url;

	private String urlPart;

	private Map<String,Object> mapping;

	private List<String> collection;

	@NotNull
	private String type;

	@NotNull
	private String asset;

	private String imageUrl;

	private String text;

	private String somUrl;

	private List<String> children;

	private String nodeType;

	private boolean isAlwaysVisible;

	public String getUrlPart() {
		return urlPart;
	}

	public void setUrlPart(String urlPart) {
		this.urlPart = urlPart;
	}

	public Integer getLevel() {
		return level;
	}

	public Integer getOrder() {
		return order;
	}

	public Integer getFontSize() {
		return fontSize;
	}

	public void setFontSize(Integer fontSize) {
		this.fontSize = fontSize;
	}

	public String getFontFamily() {
		return fontFamily;
	}

	public void setFontFamily(String fontFamily) {
		this.fontFamily = fontFamily;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	public void setOrder(Integer order) {
		this.order = order;
	}

	public ObjectId getId() {
		return id;
	}

	public void setId(ObjectId id) {
		this.id = id;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getParentId() {
		return parentId;
	}

	public void setParentId(String parentId) {
		this.parentId = parentId;
	}

	public Map<String, Object> getMapping() {
		return mapping;
	}

	public void setMapping(Map<String, Object> mapping) {
		this.mapping = mapping;
	}

	public List<String> getCollection() {
		return collection;
	}

	public void setCollection(List<String> collection) {
		this.collection = collection;
	}

	public String getNavTreeId() {
		return navTreeId;
	}

	public void setNavTreeId(String navTreeId) {
		this.navTreeId = navTreeId;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public List<String> getChildren() {
		return children;
	}

	public void setChildren(List<String> children) {
		this.children = children;
	}

	public String getAsset() {
		return asset;
	}

	public void setAsset(String asset) {
		this.asset = asset;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getSomUrl() {
		return somUrl;
	}

	public void setSomUrl(String somUrl) {
		this.somUrl = somUrl;
	}

	public String getNodeType() {
		return nodeType;
	}

	public void setNodeType(String nodeType) {
		this.nodeType = nodeType;
	}

	public boolean isAlwaysVisible() {
		return isAlwaysVisible;
	}

	public void setAlwaysVisible(boolean isAlwaysVisible) {
		this.isAlwaysVisible = isAlwaysVisible;
	}
}

package com.ailiens.common.beans;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.mongodb.morphia.annotations.Id;

import java.util.List;

@JsonDeserialize(as = StyleAssetBean.class)
public class StyleAssetBean extends BaseAssetBean implements BaseStyleAssetBean {

	@Id
	private String id;
	private String styleId;
	private String sapStyleId;
	private String secondarySize;
	private String sapBrand;
	private List<String> categories;
	private List<String> categoryKeys;
	private String vendorArticleNumber;
	private String vendorArticleName;
	private String year;
	private String baseColor;
	private String fashionType;
	private Double mrp;
	private String articleType;
	private String sapGender;
	private List<String> season;
	private String articleStatus;
	private String taxClass;
	private String weave;
	private String design;
	private String comp;
	private String collar;
	private String materialDescription;
	private String labOff;
	private String labDesc;
	private String fabCode;
	private String basicMaterial;
	private String theme;
	private String themeDesc;
	private String pattern;
	private String collDesc;
	private String coll;
	private String prodMemo;
	private String valType;
	private String curr;
	private String distChannel;
	private String catVal;
	private String manufacturer;
	private String target;
	private String temp;
	private String cogs;
	private String subItemQuality;
	private String entity;
	private String fit;
	private String contentStatus;
	private String sizeChartStatus;
	private String imageStatus;
	private String videoStatus;
	private String crossSellInfoStatus;
	private Boolean isSwatchSelected;
	private String swatchType;

	private String sellOn;
	private boolean pause;
	private List<String> eans;

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setId() {
		this.id = this.styleId = sapBrand+"-"+sapStyleId+"-"+baseColor;
	}
	public String getStyleId() {
		return styleId;
	}
	public void setStyleId(String styleId) {
		this.styleId = styleId;
	}
	@Override
	public String getPreviousId() {
		// TODO Auto-generated method stub
		return null;
	}
	public String getSapStyleId() {
		return sapStyleId;
	}
	public void setSapStyleId(String sapStyleId) {
		this.sapStyleId = sapStyleId;
	}
	public String getSapBrand() {
		return sapBrand;
	}
	public void setSapBrand(String sapBrand) {
		this.sapBrand = sapBrand;
	}
	public List<String> getCategories() {
		return categories;
	}
	public void setCategories(List<String> categories) {
		this.categories = categories;
	}
	public List<String> getCategoryKeys() {
		return categoryKeys;
	}
	public void setCategoryKeys(List<String> categoryKeys) {
		this.categoryKeys = categoryKeys;
	}
	public String getVendorArticleNumber() {
		return vendorArticleNumber;
	}
	public void setVendorArticleNumber(String vendorArticleNumber) {
		this.vendorArticleNumber = vendorArticleNumber;
	}
	public String getVendorArticleName() {
		return vendorArticleName;
	}
	public void setVendorArticleName(String vendorArticleName) {
		this.vendorArticleName = vendorArticleName;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getBaseColor() {
		return baseColor;
	}
	public void setBaseColor(String baseColor) {
		this.baseColor = baseColor;
	}
	public Double getMrp() {
		return mrp;
	}
	public void setMrp(Double mrp) {
		this.mrp = mrp;
	}
	public String getFashionType() {
		return fashionType;
	}
	public void setFashionType(String fashionType) {
		this.fashionType = fashionType;
	}
	public String getArticleType() {
		return articleType;
	}
	public void setArticleType(String articleType) {
		this.articleType = articleType;
	}
	public String getSapGender() {
		return sapGender;
	}
	public void setSapGender(String sapGender) {
		this.sapGender = sapGender;
	}
	public List<String> getSeason() {
		return season;
	}
	public void setSeason(List<String> season) {
		this.season = season;
	}
	public String getArticleStatus() {
		return articleStatus;
	}
	public void setArticleStatus(String articleStatus) {
		this.articleStatus = articleStatus;
	}
	public String getTaxClass() {
		return taxClass;
	}
	public void setTaxClass(String taxClass) {
		this.taxClass = taxClass;
	}
	public String getWeave() {
		return weave;
	}
	public void setWeave(String weave) {
		this.weave = weave;
	}
	public String getDesign() {
		return design;
	}
	public void setDesign(String design) {
		this.design = design;
	}
	public String getComp() {
		return comp;
	}
	public void setComp(String comp) {
		this.comp = comp;
	}
	public String getCollar() {
		return collar;
	}
	public void setCollar(String collar) {
		this.collar = collar;
	}
	public String getMaterialDescription() {
		return materialDescription;
	}
	public void setMaterialDescription(String materialDescription) {
		this.materialDescription = materialDescription;
	}
	public String getLabOff() {
		return labOff;
	}
	public void setLabOff(String labOff) {
		this.labOff = labOff;
	}
	public String getLabDesc() {
		return labDesc;
	}
	public void setLabDesc(String labDesc) {
		this.labDesc = labDesc;
	}
	public String getFabCode() {
		return fabCode;
	}
	public void setFabCode(String fabCode) {
		this.fabCode = fabCode;
	}
	public String getBasicMaterial() {
		return basicMaterial;
	}
	public void setBasicMaterial(String basicMaterial) {
		this.basicMaterial = basicMaterial;
	}
	public String getTheme() {
		return theme;
	}
	public void setTheme(String theme) {
		this.theme = theme;
	}
	public String getThemeDesc() {
		return themeDesc;
	}
	public void setThemeDesc(String themeDesc) {
		this.themeDesc = themeDesc;
	}
	public String getPattern() {
		return pattern;
	}
	public void setPattern(String pattern) {
		this.pattern = pattern;
	}
	public String getCollDesc() {
		return collDesc;
	}
	public void setCollDesc(String collDesc) {
		this.collDesc = collDesc;
	}
	public String getColl() {
		return coll;
	}
	public void setColl(String coll) {
		this.coll = coll;
	}
	public String getProdMemo() {
		return prodMemo;
	}
	public void setProdMemo(String prodMemo) {
		this.prodMemo = prodMemo;
	}
	public String getValType() {
		return valType;
	}
	public void setValType(String valType) {
		this.valType = valType;
	}
	public String getCurr() {
		return curr;
	}
	public void setCurr(String curr) {
		this.curr = curr;
	}
	public String getDistChannel() {
		return distChannel;
	}
	public void setDistChannel(String distChannel) {
		this.distChannel = distChannel;
	}
	public String getCatVal() {
		return catVal;
	}
	public void setCatVal(String catVal) {
		this.catVal = catVal;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public String getTarget() {
		return target;
	}
	public void setTarget(String target) {
		this.target = target;
	}
	public String getTemp() {
		return temp;
	}
	public void setTemp(String temp) {
		this.temp = temp;
	}
	public String getCogs() {
		return cogs;
	}
	public void setCogs(String cogs) {
		this.cogs = cogs;
	}
	public String getSubItemQuality() {
		return subItemQuality;
	}
	public void setSubItemQuality(String subItemQuality) {
		this.subItemQuality = subItemQuality;
	}
	public String getEntity() {
		return entity;
	}
	public void setEntity(String entity) {
		this.entity = entity;
	}
	public String getFit() {
		return fit;
	}
	public void setFit(String fit) {
		this.fit = fit;
	}
	public String getContentStatus() {
		return contentStatus;
	}
	public void setContentStatus(String contentStatus) {
		this.contentStatus = contentStatus;
	}
	public String getSizeChartStatus() {
		return sizeChartStatus;
	}
	public void setSizeChartStatus(String sizeChartStatus) {
		this.sizeChartStatus = sizeChartStatus;
	}
	public String getImageStatus() {
		return imageStatus;
	}
	public void setImageStatus(String imageStatus) {
		this.imageStatus = imageStatus;
	}
	public String getVideoStatus() {
		return videoStatus;
	}
	public void setVideoStatus(String videoStatus) {
		this.videoStatus = videoStatus;
	}

	public String getCrossSellInfoStatus() {
		return crossSellInfoStatus;
	}
	public void setCrossSellInfoStatus(String crossSellInfoStatus) {
		this.crossSellInfoStatus = crossSellInfoStatus;
	}
	public String getSellOn() {
		return sellOn;
	}
	public void setSellOn(String sellOn) {
		this.sellOn = sellOn;
	}
	public String getSecondarySize() {
		return secondarySize;
	}
	public void setSecondarySize(String secondarySize) {
		this.secondarySize = secondarySize;
	}
	public boolean isPause() {
		return pause;
	}
	public void setPause(boolean pause) {
		this.pause = pause;
	}
	@Override
	public void setPreviousId(String previousId) {
		// TODO Auto-generated method stub
	}
	public Boolean getIsSwatchSelected() {
		return isSwatchSelected;
	}
	public void setIsSwatchSelected(Boolean isSwatchSelected) {
		this.isSwatchSelected = isSwatchSelected;
	}
	public String getSwatchType() {
		return swatchType;
	}
	public void setSwatchType(String swatchType) {
		this.swatchType = swatchType;
	}
	public List<String> getEans() {
		return eans;
	}
	public void setEans(List<String> eans) {
		this.eans = eans;
	}

}

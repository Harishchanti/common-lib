package com.ailiens.common;

import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class PCMDocument {

	private String styleId;
	private String sapStyleId;
	private String status;
	private String sellOn;
	private String name;
	private String gender;
	private String merchandiseCategory;
	private String sizeChartId;
	private String baseProduct;
	private String url;

    private String pcmArticleType;
    private String legalBrandName;
    private String sapBrand;
    private String primaryColor;
    private String secondaryColor;
    private String story;
    private String specs;
    private String compositionAndCare;
    private Boolean returnable;
    private String createdTime;
    private String pcmYear;
    private String pcmSeason;
    private Map<String, Object> images;
    private Map<String, Object> video;
    private Map<String, Object> specificAttributes;

    // Inferred fields
    private List<IMSDocument> skus;
    private Double mrp;
    private Double price;
    private Boolean onSale;
    private Boolean dataComplete;
    private Float holmesScore;


}

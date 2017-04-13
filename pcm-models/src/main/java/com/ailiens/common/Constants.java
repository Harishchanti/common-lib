package com.ailiens.common;


import com.ailiens.common.beans.*;

import java.util.ArrayList;
import java.util.List;

public class Constants {

	public static enum STYLE {
		STYLE("style",StyleBean.class,"default"),IMAGE("style_image",StyleImageAssetBean.class,"image"),CONTENT("style_content",StyleContentAssetBean.class,"content"),VIDEO("style_video",StyleVideoAssetBean.class,"video"),PRICE("style_price",StylePriceAssetBean.class,"price"),BASE_INFO("style_basic_info",StyleBaseInfoAssetBean.class,"basic_info"),SIZE_CHART("style_sizechart",SizeChartAssetBean.class,"size_chart"),MARGIN("style_margin",SizeChartAssetBean.class,"margin"),CROSS_SELL_INFO("style_crossSellInfo",StyleCrossSellInfoAssetBean.class,"crosssell_info");

		private String docType;
		private Class objectClass;
		private String assetType;

		private STYLE(String docType, Class objectClass, String assetType) {
			this.docType = docType;
			this.objectClass = objectClass;
			this.assetType = assetType;
		}

		public String getDocType() {
			return docType;
		}

		public String getAssetType() {
			return assetType;
		}

		public static String getDocType(String assetType) {
			switch (assetType) {
				case "image":
					return IMAGE.docType;
				case "video":
					return VIDEO.docType;
				case "price":
					return PRICE.docType;
				case "content":
					return CONTENT.docType;
				case "basic_info":
					return BASE_INFO.docType;
				case "style":
					return STYLE.docType;
				case "margin" :
					return STYLE.docType;
				case "crosssell_info" :
					return CROSS_SELL_INFO.docType;
				default :
					return "";
			}
		}
	}

	public static enum BRAND {
		BRAND("brand",BrandAssetBean.class,"default"),IMAGE("brand_image",BrandImageAssetBean.class,"image"),CONTENT("brand_content",BrandContentAssetBean.class,"content"),VIDEO("brand_video",BrandVideoBean.class,"video"),BASE_INFO("brand_basic_info",BrandBaseInfoBean.class,"basic_info");

		private String docType;
		private Class objectClass;
		private String assetType;

		private BRAND(String docType, Class objectClass, String assetType) {
			this.docType = docType;
			this.objectClass = objectClass;
			this.assetType = assetType;
		}

		public String getDocType() {
			return docType;
		}

		public String getAssetType() {
			return assetType;
		}

		public static String getDocType(String assetType) {
			switch (assetType) {
				case "image":
					return IMAGE.docType;
				case "video":
					return VIDEO.docType;
				case "content":
					return CONTENT.docType;
				case "basic_info":
					return BASE_INFO.docType;
				case "brand" :
					return BRAND.docType;
				default:
					return "";
			}
		}
	}

	public static enum LOOK {
		LOOK("look",LooksAssetBean.class,"default"),IMAGE("look_image",LooksImageAssetBean.class,"image"),CONTENT("look_content",LooksContentAssetBean.class,"content"),VIDEO("look_video",LooksVideoAssetBean.class,"video"),BASE_INFO("look_basic_info",LooksBaseInfoAssetBean.class,"basic_info");

		private String docType;
		private Class objectClass;
		private String assetType;

		private LOOK(String docType, Class objectClass, String assetType) {
			this.docType = docType;
			this.objectClass = objectClass;
			this.assetType = assetType;
		}

		public String getDocType() {
			return docType;
		}

		public String getAssetType() {
			return assetType;
		}

		public static String getDocType(String assetType) {
			switch (assetType) {
				case "image":
					return IMAGE.docType;
				case "video":
					return VIDEO.docType;
				case "content":
					return CONTENT.docType;
				case "basic_info":
					return BASE_INFO.docType;
				case "look" :
					return LOOK.docType;
				default:
					return "";
			}
		}
	}

	public static enum STATUS {
		QC_PENDING_UPDATE("qc_pending_update"),QC_PENDING("qc_pending"),PENDING("pending"),DONE("done"),REJECT("rejected"),DEACTIVATE("deactivated"),ON_HOLD("on_hold"),NEW("new"),READY_TO_PUBLISH("ready_to_publish"),LIVE("live"),DECOMMISSIONED("decommission"),
		DRAFT("draft"),MEDIA_DONE("media_done"),CONTENT_DONE("content_done"),APPROVED("approved"),INTERNAL_LIVE("internal_live");

		private String name;

		private STATUS(String name) {
			this.name = name;

		}

		public String getName() {
			return name;
		}
	}


	public static enum PRIMARY_KEY {
		STYLES("styleId"),BRANDS("brandId"),LOOKS("lookId"),NAVTREE("_id");

		private String primaryKey;

		PRIMARY_KEY (String primaryKey) {
			this.primaryKey = primaryKey;
		}

		public String getPrimaryKey() {
			return this.primaryKey;
		}

	}

	public static enum CHANNEL {
		SOM_ONLY("SOM_ONLY"),ODIN_ONLY("ODIN_ONLY"),EVERYWHERE("EVERYWHERE"),NOWHERE("NOWHERE");

		private String channel;

		CHANNEL (String channel) {
			this.channel = channel;
		}

		public String getChannel() {
			return this.channel;
		}

	}

	public static enum ENVIRONMENT {
		PROD("production"), QA("qa"), STAGING("staging"), DEV("development"), DEFAULT("development");

		private String env;

		ENVIRONMENT(String env) {
			this.env = env;
		}

		public String getEnv() {
			return this.env;
		}

		public static ENVIRONMENT getEnv(String env) {
			switch(env) {
			case "production":
				return ENVIRONMENT.PROD;
			case "qa":
				return ENVIRONMENT.QA;
			case "staging":
				return ENVIRONMENT.STAGING;
			case "development":
				return ENVIRONMENT.DEV;
			default:
				return ENVIRONMENT.DEV;
			}
		}

		public static List<String> getAllowedEnvironments(String env) {
			List<String> environments = new ArrayList<String>();
			switch(env) {
			case "production":
				environments.add(PROD.getEnv());
				return environments;
			case "qa":
				environments.add(QA.getEnv());
				environments.add(STAGING.getEnv());
				environments.add(PROD.getEnv());
				return environments;
			case "staging":
				environments.add(STAGING.getEnv());
				environments.add(PROD.getEnv());
				return environments;
			case "development":
				environments.add(DEV.getEnv());
				environments.add(QA.getEnv());
				environments.add(STAGING.getEnv());
				environments.add(PROD.getEnv());
				return environments;
			default:
				environments.add(DEV.getEnv());
				environments.add(QA.getEnv());
				environments.add(STAGING.getEnv());
				environments.add(PROD.getEnv());
				return environments;
			}
		}

	}

	public static enum NAVTREE {
		DEFAULT("navtree",NavTreeBean.class,"default");
		private String docType;
		private Class objectClass;
		private String assetType;
		private NAVTREE(String docType, Class objectClass, String assetType) {
			this.docType = docType;
			this.objectClass = objectClass;
			this.assetType = assetType;
		}

		public String getDocType() {
			return docType;
		}

	}

	public static final String DEFAULT_LOCALE = "en";
	public static final String DEFAULT_LOCATION = "in";
	public static final String ID = "_id";
	public static final Double POCKET_SQUARE_PRICE = 999.0;
	public static final String CATEGORY_DELIMITER = "_";

	public static final String CAMUNDA_STYLE_PROCESS_NAME = "Style_workflow";
	public static final String CAMUNDA_BRAND_PROCESS_NAME = "Brand_workflow";
	public static final String CAMUNDA_LOOK_PROCESS_NAME = "Look_workflow";
	public static final String CAMUNDA_STYLE_UPDATE_PROCESS_NAME = "Update_Workflow";

	public static final String CAMUNDA_STYLE_CONTENT_PROCESS = "StyleContent";
	public static final String CAMUNDA_STYLE_MEDIA_PROCESS = "StyleMedia";


	public static enum CAMUNDA_TASK_VARIABLES {
		QCPENDING("qcPending"),BASIC_INFO("Insert Basic Information"),MEDIA("Upload Media"),APPROVE_MEDIA("Approve Media"),APPROVE_BAISC_INFO("Approve Basic Info"),PUBLISH("Publish"),QC_BASIC_INFO("Quality Check for Basic Information"),QC_MEDIA("Quality Check for Media"),PUBLISH_BASE_INFO("Publish Basic Info"),PUBLISH_MEDIA("Publish Media"),UPDATE_BASE_INFO("Update Basic Information"),UPDATE_MEDIA("Update Media");


		private String taskName;
		private CAMUNDA_TASK_VARIABLES(String taskName) {
			this.taskName = taskName;
		}

		public String getName() {
			return taskName;
		}
	}

	public static enum QUEUES {
		STYLES("styles"),LOOKS("looks"),BRANDS("brands"),COLLECTIONS("collections"),SIZECHARTS("sizecharts"),NAVTREE("navtree"),QC_BASIC_INFO("Quality Check for Basic Information"),QC_MEDIA("Quality Check for Media"),PUBLISH_BASE_INFO("Publish Basic Info"),PUBLISH_MEDIA("Publish Media"),UPDATE_BASE_INFO("Update Basic Information");


		private String name;
		private QUEUES(String name) {
			this.name = name;
		}

		public String getName() {
			return name;
		}
	}

	public static enum SWATCHTYPE {
		HEXCODE("hex_code"),IMAGE("swatch_image"),NONE("none");

		private String type;
		private SWATCHTYPE(String type) {
			this.type = type;
		}

		public String getType() {
			return type;
		}
	}

	public static List<String> getInvalidKeys() {
		List<String> invalidKeys = new ArrayList<String>();
		invalidKeys.add("id");
		invalidKeys.add("docType");
		invalidKeys.add("lastModifiedTime");
		invalidKeys.add("objectId");
		invalidKeys.add("previousId");
		invalidKeys.add("createdBy");
		invalidKeys.add("createdTime");
		invalidKeys.add("status");
		invalidKeys.add("liveDateOnWeb");
		return invalidKeys;
	}
}

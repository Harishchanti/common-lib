package com.ailiens.common.deserializers;


import com.ailiens.common.Constants;
import com.ailiens.common.JacksonUtils;
import com.ailiens.common.beans.*;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

import java.io.IOException;

public class StylesDeserializer extends JsonDeserializer<BaseStyleAssetBean>{

	@Override
    public BaseStyleAssetBean deserialize(JsonParser jp, DeserializationContext context) throws JsonParseException, JsonMappingException, IOException {
        ObjectMapper mapper = (ObjectMapper) jp.getCodec();
        ObjectNode root = mapper.readTree(jp);
        String docType = root.has("docType") ? root.get("docType").asText() : null;

        if(docType == null) {
        	return null;
        }
        /*write you own condition*/
        if (docType.equals(Constants.STYLE.STYLE.getDocType())) {

            return (StyleAssetBean) JacksonUtils.getPOJO(StyleAssetBean.class, root.toString());
        }
        if (docType.equals(Constants.STYLE.BASE_INFO.getDocType())) {
        	root.remove("id");
            return mapper.readValue(root.toString(), StyleBaseInfoAssetBean.class);
        }
        if (docType.equals(Constants.STYLE.IMAGE.getDocType())) {
        	root.remove("id");
            return mapper.readValue(root.toString(), StyleImageAssetBean.class);
        }
        if (docType.equals(Constants.STYLE.VIDEO.getDocType())) {
        	root.remove("id");
            return mapper.readValue(root.toString(), StyleVideoAssetBean.class);
        }
        if (docType.equals(Constants.STYLE.SIZE_CHART.getDocType())) {
        	root.remove("id");
            return mapper.readValue(root.toString(), SizeChartAssetBean.class);
        }
        if (docType.equals(Constants.STYLE.MARGIN.getDocType())) {
        	root.remove("id");
            return mapper.readValue(root.toString(), StyleMargineAssetBean.class);
        }
        return null;
    }
}

package com.ailiens.common.deserializers;


import com.ailiens.common.Constants;
import com.ailiens.common.JacksonUtils;
import com.ailiens.common.beans.BaseLooksAssetBean;
import com.ailiens.common.beans.LooksAssetBean;
import com.ailiens.common.beans.LooksBaseInfoAssetBean;
import com.ailiens.common.beans.LooksImageAssetBean;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

import java.io.IOException;

public class LooksDeserializer extends JsonDeserializer<BaseLooksAssetBean>{

	@Override
    public BaseLooksAssetBean deserialize(JsonParser jp, DeserializationContext context) throws JsonParseException, JsonMappingException, IOException {
        ObjectMapper mapper = (ObjectMapper) jp.getCodec();
        ObjectNode root = mapper.readTree(jp);
        String docType = root.has("docType") ? root.get("docType").asText() : null;

        if(docType == null) {
        	return null;
        }
        /*write you own condition*/
        if (docType.equals(Constants.LOOK.LOOK.getDocType())) {

            return (LooksAssetBean) JacksonUtils.getPOJO(LooksAssetBean.class, root.toString());
        }
        if (docType.equals(Constants.LOOK.BASE_INFO.getDocType())) {
        	root.remove("id");
            return mapper.readValue(root.toString(), LooksBaseInfoAssetBean.class);
        }
        if (docType.equals(Constants.LOOK.IMAGE.getDocType())) {
        	root.remove("id");
            return mapper.readValue(root.toString(), LooksImageAssetBean.class);
        }
        return null;
    }
}

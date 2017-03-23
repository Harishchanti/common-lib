package com.ailiens.common;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class JacksonUtils {


	public static Object getPOJO(Class objectClass,String jsonString) throws JsonParseException, JsonMappingException, IOException {
		ObjectMapper mapper = new ObjectMapper(); // can reuse, share globally
		Object object = mapper.readValue(jsonString, objectClass);
		return object;
	}

	public static Map<String,Object> getMap(String jsonString) throws JsonParseException, JsonMappingException, IOException {
		ObjectMapper mapper = new ObjectMapper(); // can reuse, share globally
		mapper.readValue(jsonString, Map.class);
		Map<String,Object> map = mapper.readValue(jsonString, Map.class);
		return map;
	}


	public static String getPOJO(Object value) throws JsonParseException, JsonMappingException, IOException {
		ObjectMapper mapper = new ObjectMapper(); // can reuse, share globally
		String string = mapper.writeValueAsString(value);
		return string;
	}

	public static Object getPOJO(Class objectClass, Map<String,Object> value) throws JsonParseException, JsonMappingException, IOException {
		ObjectMapper mapper = new ObjectMapper(); // can reuse, share globally
		String string = mapper.writeValueAsString(value);
		Object object = mapper.readValue(string, objectClass);
		return object;
	}

	public static Map<String,Object> getMap(Object bean) {
		if(bean == null) {
			return null;
		}
		ObjectMapper mapper = new ObjectMapper();
		mapper.setSerializationInclusion(Include.NON_NULL);
		Map<String,Object> map = mapper.convertValue(bean, Map.class);
		return map;
	}

	public static JsonNode getJsonNode(Object object) {
		ObjectMapper mapper = new ObjectMapper();
		JsonNode node = mapper.convertValue(object, JsonNode.class);
		return node;
	}

	public static JsonNode getJsonNode(String str) {
		ObjectMapper mapper = new ObjectMapper();
		JsonNode node = mapper.convertValue(str, JsonNode.class);
		return node;
	}


	public static JsonNode merge(JsonNode mainNode, JsonNode updateNode) {

	    Iterator<String> fieldNames = updateNode.fieldNames();
	    while (fieldNames.hasNext()) {

	        String fieldName = fieldNames.next();
	        JsonNode jsonNode = mainNode.get(fieldName);
	        // if field exists and is an embedded object
	        if (jsonNode != null && jsonNode.isObject()) {
	            merge(jsonNode, updateNode.get(fieldName));
	        }
	        else {
	            if (mainNode instanceof ObjectNode) {
	                // Overwrite field
	                JsonNode value = updateNode.get(fieldName);
	                ((ObjectNode) mainNode).put(fieldName, value);
	            }
	        }

	    }

	    return mainNode;
	}

	public static List<Object> getList(String jsonString) throws JsonParseException, JsonMappingException, IOException {
//		ObjectMapper mapper = new ObjectMapper(); // can reuse, share globally
//		List<Object> list = mapper.convertValue(jsonString, List.class);
		List<Object> list = new ObjectMapper().readValue(jsonString, new TypeReference<List<Object>>() { });
		return list;
	}

	public static<T> List<T> getList(String jsonString,Class beanClass) throws JsonParseException, JsonMappingException, IOException {
	    ObjectMapper mapper = new ObjectMapper();
	    List<T> beans = mapper.readValue(jsonString, mapper.getTypeFactory().constructCollectionType(List.class, beanClass));
	    return beans;
	  }

	public static String getJsonString(Map<String,String> inputMap) throws JsonProcessingException {
        ObjectMapper mapperObj = new ObjectMapper();
        String jsonResp = mapperObj.writeValueAsString(inputMap);
        return jsonResp;
	}

	public static String getJsonString(List<String> inputList) throws JsonProcessingException {
        ObjectMapper mapperObj = new ObjectMapper();
        String jsonResp = mapperObj.writeValueAsString(inputList);
        return jsonResp;
	}

}

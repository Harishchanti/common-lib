package com.ailiens.common.model.Deserializer;


import com.ailiens.common.model.FavouriteBase;
import com.ailiens.common.model.FavouriteBlog;
import com.ailiens.common.model.FavouriteBrand;
import com.ailiens.common.model.FavouriteStyle;
import com.ailiens.common.model.exceptions.WrongInputPatternException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;

import java.io.IOException;

/**
 * Created by vaibhav on 4/11/15.
 */
public class FavouriteDeserializer extends JsonDeserializer<FavouriteBase> {
    @Override
    public FavouriteBase deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {


        JsonNode node = jp.getCodec().readTree(jp);
        if (node.get("brand") != null) {
            String brand = node.get("brand").asText();
            // Commenting this check as requirements were not clear on what restrictions should be imposed.
            //if(!brand.matches("^[a-zA-Z0-9 ]{1,50}+$"))
            	//throw new WrongInputPatternException("wrong input pattern for brand suggested is ^[a-zA-Z]{1,50}+$",null);
            return new FavouriteBrand(brand);

        } else if (node.get("url") != null) {
            String url = node.get("url").asText();
            //if(!url.matches("^[a-zA-Z0-9+&@-#/%?=~_|!:,.;]{1,100}+$"))
            	//throw new WrongInputPatternException("wrong input pattern for url suggested is ^[a-zA-Z0-9]{1,100}+$",null);
            return new FavouriteBlog(url);
        } else if (node.get("style") != null) {
            String style = node.get("style").asText();
            if(!style.matches("^[a-zA-Z0-9]{1,50}+$"))
            	throw new WrongInputPatternException("wrong input pattern for style suggested is ^[a-zA-Z]{1,50}+$",null);
            return new FavouriteStyle(style);
        } else
        	throw new WrongInputPatternException("Request body format mismatch",null);
    }
}

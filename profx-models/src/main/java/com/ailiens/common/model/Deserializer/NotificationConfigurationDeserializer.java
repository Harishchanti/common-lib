package com.ailiens.common.model.Deserializer;


import com.ailiens.common.model.EmailConfiguration;
import com.ailiens.common.model.MobileConfiguration;
import com.ailiens.common.model.NotificationConfiguration;
import com.ailiens.common.model.enums.NotificationType;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.JsonNodeType;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by vaibhav on 18/11/15.
 */
public class NotificationConfigurationDeserializer extends JsonDeserializer<NotificationConfiguration> {
    @Override
    public NotificationConfiguration deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {


        JsonNode node = jp.getCodec().readTree(jp);

        if (node.get("type") != null && node.get("type").asText().equalsIgnoreCase(NotificationType.EMAIL.name())) {
            EmailConfiguration emailConfiguration = new EmailConfiguration();

            Iterator<Map.Entry<String, JsonNode>> ans = node.fields();

            while (ans.hasNext()) {
                Map.Entry<String, JsonNode> elt = ans.next();
                try {
                    Field field = EmailConfiguration.class.getField(elt.getKey());
                    JsonNodeType nodeType = elt.getValue().getNodeType();
                    String value = "";
                    switch (nodeType) {
                        case BOOLEAN:
                            field.set(emailConfiguration, elt.getValue().booleanValue());
                            break;
                        case STRING:
                            field.set(emailConfiguration, elt.getValue().textValue());

                            break;
                        case NUMBER:
                            field.set(emailConfiguration, elt.getValue().numberValue());

                            break;

                    }


                } catch (Exception e) {
                    e.printStackTrace();

                }
            }

            return emailConfiguration;
        } else if (node.get("type") != null && node.get("type").asText().equalsIgnoreCase(NotificationType.MOBILE.name())) {
            MobileConfiguration mobileConfiguration = new MobileConfiguration();

            Iterator<Map.Entry<String, JsonNode>> ans = node.fields();

            while (ans.hasNext()) {
                Map.Entry<String, JsonNode> elt = ans.next();
                try {
                    Field field = MobileConfiguration.class.getField(elt.getKey());
                    JsonNodeType nodeType = elt.getValue().getNodeType();
                    String value = "";
                    switch (nodeType) {
                        case BOOLEAN:
                            field.set(mobileConfiguration, elt.getValue().booleanValue());
                            break;
                        case STRING:
                            field.set(mobileConfiguration, elt.getValue().textValue());

                            break;
                        case NUMBER:
                            field.set(mobileConfiguration, elt.getValue().numberValue());
                            break;

                    }
                } catch (Exception e) {
                    e.printStackTrace();

                }
            }

            return mobileConfiguration;
        } else return null;
    }
}

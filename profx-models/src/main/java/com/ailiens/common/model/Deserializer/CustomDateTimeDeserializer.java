package com.ailiens.common.model.Deserializer;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer;
import org.joda.time.DateTime;
import org.joda.time.format.ISODateTimeFormat;

import java.io.IOException;

/**
 * Created by [)/\ on 14/5/16.
 */
public class CustomDateTimeDeserializer extends StdScalarDeserializer<DateTime> {

	protected CustomDateTimeDeserializer(Class<?> vc) {
		super(vc);
	}

	public CustomDateTimeDeserializer() {
		super(DateTime.class);
	}


	@Override
	public DateTime deserialize(JsonParser jp, DeserializationContext ctxt)
			throws IOException {
		JsonToken t = jp.getCurrentToken();
		if (t == JsonToken.VALUE_STRING) {
			String str = jp.getText().trim();
			return ISODateTimeFormat.dateTimeParser().parseDateTime(str);
		}
		if (t == JsonToken.VALUE_NUMBER_INT) {
			return new DateTime(jp.getLongValue());
		}
		throw ctxt.mappingException(handledType());
	}
}

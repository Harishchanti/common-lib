package com.ailiens.common.model.Deserializer;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdScalarSerializer;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import java.io.IOException;

/**
 * Created by [)/\ on 14/5/16.
 */
public class CustomDateTimeSerializer extends StdScalarSerializer<DateTime> {

	private static DateTimeFormatter formatter = DateTimeFormat
			.forPattern("yyyy-MM-dd'T'HH:mm:ss'Z'");

	protected CustomDateTimeSerializer(Class<DateTime> t) {
		super(t);
	}

	public CustomDateTimeSerializer() {
		super(DateTime.class);
	}

	@Override
	public void serialize(DateTime value, JsonGenerator generator,
						  SerializerProvider serializerProvider)
			throws IOException {
		generator.writeString(formatter.print(value.toDateTime(DateTimeZone.UTC)));
	}
}

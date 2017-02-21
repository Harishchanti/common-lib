package com.ailiens.common.logging;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.Marker;
import org.slf4j.helpers.MessageFormatter;

import java.io.IOException;


public class AILLoggerImpl implements AILLogger {

    private static DateTimeFormatter formatter = DateTimeFormat
        .forPattern("yyyy-MM-dd'T'HH:mm:ss'Z'");
    private final Logger log;
    private final String INFO = "INFO";
    private final String WARN = "WARN";
    private final String ERROR = "ERROR";
    private final String DEBUG = "DEBUG";
    private final String TRACE = "TRACE";
    private boolean pretty = true;

    private SimpleModule dateModule = new SimpleModule() {
        {
            addSerializer(DateTime.class, new StdSerializer<DateTime>(DateTime.class) {
                @Override
                public void serialize(DateTime value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonGenerationException {
                    jgen.writeString(formatter.print(value.toDateTime(DateTimeZone.UTC)));
                }
            });
        }
    };

    public AILLoggerImpl(String name) {
        log = LoggerFactory.getLogger(name);
    }


    public AILLoggerImpl(Class<?> clazz) {
        log = LoggerFactory.getLogger(clazz);
    }

    /**
     * Obtain a new or existing Logger instance.
     *
     * @param clazz Name of the logger, package names are recommended
     */
    public static Logger getLogger(Class<?> clazz) {
        return LoggerFactory.getLogger(clazz);
    }

    private String createLoggerObject(String message, String level, AILIContext ailiContext) {


        BaseLogger loggerObject = new BaseLogger();
        loggerObject.setRequestID(LoggingFilter.getRequestId());
        loggerObject.setTraceID(LoggingFilter.getTraceId());
        loggerObject.setContext(ailiContext);
        loggerObject.setLevel(level);
        loggerObject.setMessage(message);
        loggerObject.setTimeStamp(DateTime.now());
        loggerObject.setThreadID(Thread.currentThread().getId());
        return objectToString(loggerObject);
    }

    private String objectToString(BaseLogger baseLogger) {
        ObjectMapper mapper = new ObjectMapper();
        mapper.registerModule(dateModule);
        String jsonInString = null;
        try {
            jsonInString = mapper.writeValueAsString(baseLogger);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return jsonInString;
    }

    private AILIContext ailiContext(String s) {
        DefaultContext ailiContext = new DefaultContext();
        ailiContext.setMessage(s);
        return ailiContext;
    }

    private String createLog(String message, String level, Exception e, AILIContext ailiContext) {
        if (!pretty) {
            pretty = true;
            return message;
        }

        if (e == null) {
            return createLoggerObject(message, level, ailiContext);
        }
        ErrorLog loggerObject = new ErrorLog();
        loggerObject.setRequestID(LoggingFilter.getRequestId());
        loggerObject.setTraceID(LoggingFilter.getTraceId());
        loggerObject.setContext(ailiContext);
        loggerObject.setLevel(level);
        loggerObject.setTimeStamp(DateTime.now());
        loggerObject.setMessage(message);
        loggerObject.setException(e);
        loggerObject.setThreadID(Thread.currentThread().getId());
        return objectToString(loggerObject);
    }


    @Override
    public String getName() {
        return null;
    }

    @Override
    public AILLoggerImpl setPretty(boolean b) {
        this.pretty = b;
        return this;
    }


    @Override
    public boolean isDebugEnabled() {
        return false;
    }


    @Override
    public AILLoggerImpl debug(String format, Object arg) {
        String msg = MessageFormatter.arrayFormat(format, new Object[]{arg})
            .getMessage();
        log.debug(createLog(msg, DEBUG, null, null));
        return this;
    }

    @Override
    public AILLoggerImpl debug(String format, Object arg1, Object arg2) {
        String msg = MessageFormatter.arrayFormat(format, new Object[]{arg1, arg2})
            .getMessage();
        log.debug(createLog(msg, DEBUG, null, null));
        return this;
    }

    @Override
    public AILLoggerImpl debug(String format, Object... arguments) {
        String msg = MessageFormatter.arrayFormat(format, new Object[]{arguments})
            .getMessage();
        log.debug(createLog(msg, DEBUG, null, null));
        return this;
    }

    @Override
    public AILLoggerImpl debug(String msg, Throwable t) {
        log.debug(createLog(msg, DEBUG, new DefaultException(t), null));
        return this;
    }

    @Override
    public boolean isDebugEnabled(Marker marker) {
        return false;
    }

    @Override
    public AILLoggerImpl debug(Marker marker, String msg) {
        log.debug(marker, createLog(msg, DEBUG, null, null));
        return this;
    }

    @Override
    public AILLoggerImpl debug(Marker marker, String format, Object arg) {
        String msg = MessageFormatter.arrayFormat(format, new Object[]{arg})
            .getMessage();
        log.debug(marker, createLog(msg, DEBUG, null, null));
        return this;
    }

    @Override
    public AILLoggerImpl debug(Marker marker, String format, Object arg1, Object arg2) {
        String msg = MessageFormatter.arrayFormat(format, new Object[]{arg2})
            .getMessage();
        log.debug(marker, createLog(msg, DEBUG, null, null));
        return this;

    }

    @Override
    public AILLoggerImpl debug(Marker marker, String format, Object... arguments) {
        String msg = MessageFormatter.arrayFormat(format, new Object[]{arguments})
            .getMessage();
        log.debug(marker, createLog(msg, DEBUG, null, null));
        return this;
    }

    @Override
    public AILLoggerImpl debug(Marker marker, String msg, Throwable t) {
        log.debug(marker, createLog(msg, DEBUG, new DefaultException(t), null), t);
        return this;
    }

    @Override
    public boolean isInfoEnabled() {
        return false;
    }

    @Override
    public AILLoggerImpl info(String msg) {
        log.info(createLog(msg, INFO, null, null));
        return this;
    }

    @Override
    public AILLoggerImpl info(String format, Object arg) {
        String msg = MessageFormatter.arrayFormat(format, new Object[]{arg})
            .getMessage();
        log.info(createLog(msg, INFO, null, null));
        return this;
    }

    @Override
    public AILLoggerImpl info(String format, Object arg1, Object arg2) {
        String msg = MessageFormatter.arrayFormat(format, new Object[]{arg1, arg2})
            .getMessage();
        log.info(createLog(msg, INFO, null, null));
        return this;
    }

    @Override
    public AILLoggerImpl info(String format, Object... arguments) {
        String msg = MessageFormatter.arrayFormat(format, new Object[]{arguments})
            .getMessage();
        log.info(createLog(msg, INFO, null, null));
        return this;
    }

    @Override
    public AILLoggerImpl info(String msg, Throwable t) {
        log.info(createLog(msg, INFO, new DefaultException(t), null));
        return this;
    }

    @Override
    public boolean isInfoEnabled(Marker marker) {
        return false;
    }

    @Override
    public AILLoggerImpl info(Marker marker, String msg) {
        log.info(marker, createLog(msg, INFO, null, null));
        return this;
    }

    @Override
    public AILLoggerImpl info(Marker marker, String format, Object arg) {
        String msg = MessageFormatter.arrayFormat(format, new Object[]{arg})
            .getMessage();
        log.info(marker, createLog(msg, INFO, null, null));
        return this;
    }

    @Override
    public AILLoggerImpl info(Marker marker, String format, Object arg1, Object arg2) {
        String msg = MessageFormatter.arrayFormat(format, new Object[]{arg1, arg2})
            .getMessage();
        log.info(marker, createLog(msg, INFO, null, null));
        return this;

    }

    @Override
    public AILLoggerImpl info(Marker marker, String format, Object... arguments) {
        String msg = MessageFormatter.arrayFormat(format, new Object[]{arguments})
            .getMessage();
        log.info(marker, createLog(msg, INFO, null, null));
        return this;
    }

    @Override
    public AILLoggerImpl info(Marker marker, String msg, Throwable t) {
        log.info(marker, createLog(msg, INFO, new DefaultException(t), null), t);
        return this;
    }

    @Override
    public boolean isWarnEnabled() {
        return false;
    }

    @Override
    public AILLoggerImpl warn(String msg) {
        log.warn(createLog(msg, WARN, null, null));
        return this;
    }

    @Override
    public AILLoggerImpl warn(String format, Object arg) {
        String msg = MessageFormatter.arrayFormat(format, new Object[]{arg})
            .getMessage();
        log.warn(createLog(msg, WARN, null, null));
        return this;
    }

    @Override
    public AILLoggerImpl warn(String format, Object arg1, Object arg2) {
        String msg = MessageFormatter.arrayFormat(format, new Object[]{arg1, arg2})
            .getMessage();
        log.warn(createLog(msg, WARN, null, null));
        return this;
    }

    @Override
    public AILLoggerImpl warn(String format, Object... arguments) {
        String msg = MessageFormatter.arrayFormat(format, new Object[]{arguments})
            .getMessage();
        log.warn(createLog(msg, WARN, null, null));
        return this;
    }

    @Override
    public AILLoggerImpl warn(String msg, Throwable t) {
        log.warn(createLog(msg, WARN, new DefaultException(t), null));
        return this;
    }

    @Override
    public boolean isWarnEnabled(Marker marker) {
        return false;
    }

    @Override
    public AILLoggerImpl warn(Marker marker, String msg) {
        log.warn(marker, createLog(msg, WARN, null, null));
        return this;
    }

    @Override
    public AILLoggerImpl warn(Marker marker, String format, Object arg) {
        String msg = MessageFormatter.arrayFormat(format, new Object[]{arg})
            .getMessage();
        log.warn(marker, createLog(msg, WARN, null, null));
        return this;
    }

    @Override
    public AILLoggerImpl warn(Marker marker, String format, Object arg1, Object arg2) {
        String msg = MessageFormatter.arrayFormat(format, new Object[]{arg1, arg2})
            .getMessage();
        log.warn(marker, createLog(msg, WARN, null, null));
        return this;

    }

    @Override
    public AILLoggerImpl warn(Marker marker, String format, Object... arguments) {
        String msg = MessageFormatter.arrayFormat(format, new Object[]{arguments})
            .getMessage();
        log.warn(marker, createLog(msg, WARN, null, null));
        return this;
    }

    @Override
    public AILLoggerImpl warn(Marker marker, String msg, Throwable t) {
        log.warn(marker, createLog(msg, WARN, new DefaultException(t), null), t);
        return this;
    }

    @Override
    public boolean isErrorEnabled() {
        return false;
    }

    @Override
    public AILLoggerImpl error(String msg) {
        log.error(createLog(msg, ERROR, null, null));
        return this;
    }

    @Override
    public AILLoggerImpl error(String format, Object arg) {
        String msg = MessageFormatter.arrayFormat(format, new Object[]{arg})
            .getMessage();
        log.error(createLog(msg, ERROR, null, null));
        return this;
    }

    @Override
    public AILLoggerImpl error(String format, Object arg1, Object arg2) {
        String msg = MessageFormatter.arrayFormat(format, new Object[]{arg1, arg2})
            .getMessage();
        log.error(createLog(msg, ERROR, null, null));
        return this;
    }

    @Override
    public AILLoggerImpl error(String format, Object... arguments) {
        String msg = MessageFormatter.arrayFormat(format, new Object[]{arguments})
            .getMessage();
        log.error(createLog(msg, ERROR, null, null));
        return this;
    }

    @Override
    public AILLoggerImpl error(String msg, Throwable t) {
        log.error(createLog(msg, ERROR, new DefaultException(t), null));
        return this;
    }

    @Override
    public boolean isErrorEnabled(Marker marker) {
        return false;
    }

    @Override
    public AILLoggerImpl error(Marker marker, String msg) {
        log.error(marker, createLog(msg, ERROR, null, null));
        return this;
    }

    @Override
    public AILLoggerImpl error(Marker marker, String format, Object arg) {
        String msg = MessageFormatter.arrayFormat(format, new Object[]{arg})
            .getMessage();
        log.error(marker, createLog(msg, ERROR, null, null));
        return this;
    }

    @Override
    public AILLoggerImpl error(Marker marker, String format, Object arg1, Object arg2) {
        String msg = MessageFormatter.arrayFormat(format, new Object[]{arg1, arg2})
            .getMessage();
        log.error(marker, createLog(msg, ERROR, null, null));
        return this;


    }

    @Override
    public AILLoggerImpl error(Marker marker, String format, Object... arguments) {
        String msg = MessageFormatter.arrayFormat(format, new Object[]{arguments})
            .getMessage();
        log.error(marker, createLog(msg, ERROR, null, null));
        return this;
    }

    @Override
    public AILLoggerImpl error(Marker marker, String msg, Throwable t) {
        log.error(marker, createLog(msg, ERROR, new DefaultException(t),null), t);
        return this;
    }

    @Override
    public AILLoggerImpl debug(String message, AILIContext ailiContext) {
        log.debug(createLog(message, DEBUG, null, ailiContext));
        return this;
    }

    @Override
    public AILLoggerImpl info(String message, AILIContext ailiContext) {
        log.info(createLog(message, INFO, null, ailiContext));
        return this;

    }

    @Override
    public AILLoggerImpl warn(String message, AILIContext ailiContext) {
        log.warn(createLog(message, WARN, null, ailiContext));
        return this;
    }

    @Override
    public AILLoggerImpl error(String message, AILIContext ailiContext, Exception e) {
        log.error(createLog(message, ERROR, e, ailiContext));
        return this;

    }

    @Override
    public AILLoggerImpl debug(String format, Object arg, AILIContext ailiContext) {
        String msg = MessageFormatter.arrayFormat(format, new Object[]{arg})
            .getMessage();
        log.debug(createLog(msg, DEBUG, null, ailiContext));
        return this;
    }

    @Override
    public AILLoggerImpl info(String format, Object arg, AILIContext ailiContext) {
        String msg = MessageFormatter.arrayFormat(format, new Object[]{arg})
            .getMessage();
        log.info(createLog(msg, INFO, null, ailiContext));
        return this;
    }

    @Override
    public AILLoggerImpl warn(String format, Object arg, AILIContext ailiContext) {
        String msg = MessageFormatter.arrayFormat(format, new Object[]{arg})
            .getMessage();
        log.warn(createLog(msg, WARN, null, ailiContext));
        return this;
    }

    @Override
    public AILLoggerImpl error(String format, Object arg, AILIContext ailiContext, Exception e) {
        String msg = MessageFormatter.arrayFormat(format, new Object[]{arg})
            .getMessage();
        log.warn(createLog(msg, ERROR, e, ailiContext));
        return this;
    }

}

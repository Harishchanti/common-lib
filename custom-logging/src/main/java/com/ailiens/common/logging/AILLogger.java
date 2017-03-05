package com.ailiens.common.logging;

import org.slf4j.Marker;

public interface AILLogger {

    String getName();

    AILLoggerImpl setPretty(boolean b);

    boolean isDebugEnabled();

    AILLoggerImpl debug(String format, Object arg);

    AILLoggerImpl debug(String format, Object arg1, Object arg2);


    AILLoggerImpl debug(String format, Object... arguments);


    AILLoggerImpl debug(String msg, Throwable t);


    boolean isDebugEnabled(Marker marker);


    AILLoggerImpl debug(Marker marker, String msg);


    AILLoggerImpl debug(Marker marker, String format, Object arg);


    AILLoggerImpl debug(Marker marker, String format, Object arg1, Object arg2);


    AILLoggerImpl debug(Marker marker, String format, Object... arguments);


    AILLoggerImpl debug(Marker marker, String msg, Throwable t);


    boolean isInfoEnabled();


    AILLoggerImpl info(String msg);


    AILLoggerImpl info(String format, Object arg);


    AILLoggerImpl info(String format, Object arg1, Object arg2);


    AILLoggerImpl info(String format, Object... arguments);


    AILLoggerImpl info(String msg, Throwable t);


    boolean isInfoEnabled(Marker marker);


    AILLoggerImpl info(Marker marker, String msg);


    AILLoggerImpl info(Marker marker, String format, Object arg);


    AILLoggerImpl info(Marker marker, String format, Object arg1, Object arg2);


    AILLoggerImpl info(Marker marker, String format, Object... arguments);


    AILLoggerImpl info(Marker marker, String msg, Throwable t);


    boolean isWarnEnabled();


    AILLoggerImpl warn(String msg);


    AILLoggerImpl warn(String format, Object arg);


    AILLoggerImpl warn(String format, Object... arguments);


    AILLoggerImpl warn(String format, Object arg1, Object arg2);


    AILLoggerImpl warn(String msg, Throwable t);


    boolean isWarnEnabled(Marker marker);


    AILLoggerImpl warn(Marker marker, String msg);


    AILLoggerImpl warn(Marker marker, String format, Object arg);


    AILLoggerImpl warn(Marker marker, String format, Object arg1, Object arg2);


    AILLoggerImpl warn(Marker marker, String format, Object... arguments);


    AILLoggerImpl warn(Marker marker, String msg, Throwable t);


    boolean isErrorEnabled();


    AILLoggerImpl error(String msg);


    AILLoggerImpl error(String format, Object arg);


    AILLoggerImpl error(String format, Object arg1, Object arg2);


    AILLoggerImpl error(String format, Object... arguments);


    AILLoggerImpl error(String msg, Throwable t);


    boolean isErrorEnabled(Marker marker);


    AILLoggerImpl error(Marker marker, String msg);


    AILLoggerImpl error(Marker marker, String format, Object arg);


    AILLoggerImpl error(Marker marker, String format, Object arg1, Object arg2);


    AILLoggerImpl error(Marker marker, String format, Object... arguments);


    AILLoggerImpl error(Marker marker, String msg, Throwable t);

    AILLoggerImpl debug(String message, AILIContext ailiContext);

    AILLoggerImpl info(String message, AILIContext ailiContext);

    AILLoggerImpl warn(String message, AILIContext ailiContext);

    AILLoggerImpl error(String message, AILIContext ailiContext, Exception e);

    AILLoggerImpl debug(String fromat, Object arg, AILIContext ailiContext);

    AILLoggerImpl info(String fromat, Object arg, AILIContext ailiContext);

    AILLoggerImpl warn(String fromat, Object arg, AILIContext ailiContext);

    AILLoggerImpl error(String fromat, Object arg, AILIContext ailiContext, Exception e);

}



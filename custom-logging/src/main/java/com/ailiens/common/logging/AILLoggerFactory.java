package com.ailiens.common.logging;


public class AILLoggerFactory {

    public static AILLoggerImpl getLogger(Class<?> aClass) {

        return new AILLoggerImpl(aClass);

    }
}

package com.ailiens.common;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import lombok.experimental.UtilityClass;

/**
 * Created by jayant on 9/4/17.
 */

@FieldDefaults(level = AccessLevel.PUBLIC,makeFinal = true)
@UtilityClass
public class Constants {

    static String HEALTH_SUCCESS="OK";
}

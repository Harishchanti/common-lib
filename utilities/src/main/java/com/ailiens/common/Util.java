package com.ailiens.common;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import lombok.experimental.UtilityClass;

/**
 * Created by jayant on 4/6/17.
 */

@UtilityClass
public class Util {

    public static Gson GSON =new GsonBuilder().setPrettyPrinting().create() ;
}

package com.ailiens.common;

import com.google.common.base.Strings;

/**
 * Created by jayant on 20/2/17.
 */
public interface MsgInbound {

    int MAX_PAYLOAD_SIZE =10000;

    default String clip(String str)
    {
        if(Strings.isNullOrEmpty(str))return "";

        if(str.length()>MAX_PAYLOAD_SIZE)
        {

            return str.substring(0,MAX_PAYLOAD_SIZE)+"...";
        }
        else return str;
    }
}

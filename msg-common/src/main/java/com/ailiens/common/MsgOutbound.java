package com.ailiens.common;

/**
 * Created by jayant on 13/2/17.
 */


public interface MsgOutbound  extends MsgInbound {
 String getTopic();
 default String getUrl(){return null;}
 default String getMethod(){return null;}
}

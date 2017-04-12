package com.ailiens.common;

/**
 * Created by jayant on 13/2/17.
 */

@FunctionalInterface
public interface MsgOutbound  extends MsgInbound {
 String getTopic();
}

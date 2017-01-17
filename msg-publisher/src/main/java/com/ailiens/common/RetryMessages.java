package com.ailiens.common;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by jayant on 17/1/17.
 */

public class RetryMessages {

  @Autowired
  MessageRepository messageRepository;


  public int invoke()
  {
      List<MsgMessage> msgMessages= messageRepository.getFailedMessages(10);
      return  msgMessages.size();
  }
}

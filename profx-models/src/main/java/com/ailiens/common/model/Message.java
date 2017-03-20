package com.ailiens.common.model;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

/**
 * Created by anagha on 1/9/17.
 */
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Message {

    String type;
    String templateName;
    String dataJson;
    String emailOrMobile;
    String header;
    String communicationType;
    String sendersMailID;
    String bccMailID;
    String receiversDetail;
    String mailHeader;


}

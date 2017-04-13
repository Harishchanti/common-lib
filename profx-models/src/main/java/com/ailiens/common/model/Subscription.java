package com.ailiens.common.model;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;

/**
 * @author anagha
 */

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Subscription implements Serializable{

    Boolean email;
    Boolean sms;

}

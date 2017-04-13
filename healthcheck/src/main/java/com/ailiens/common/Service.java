package com.ailiens.common;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

/**
 * Created by jayant on 7/4/17.
 */

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Service {
    String host;
    String name;
    int port;
    int timeout=1;
}


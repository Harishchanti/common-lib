package com.ailiens.common.logging;

import lombok.Data;

import java.io.Serializable;

@Data
public class ResponseContext implements AILIContext, Serializable {

    String path;
    Object responseData;
}

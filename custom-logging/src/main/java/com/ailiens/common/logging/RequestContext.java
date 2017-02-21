package com.ailiens.common.logging;

import lombok.Data;

import java.io.Serializable;

@Data
public class RequestContext implements AILIContext,Serializable{

    String path;
    String methodType;
    Object requestData;


}

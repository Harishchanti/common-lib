package com.ailiens.common;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;


@ConfigurationProperties(prefix = "threadDumpEmail")
@Data
@Component
public class MailConfiguration {

    private String protocol ="smtp";
    private String host="smtp.gmail.com";
    private int port=587;
    private boolean auth=true;
    private boolean enable=true;
    private String from="exceptions@arvindinternet.com";
    private String username="exceptions@arvindinternet.com";
    private String password="a@12345678";

}

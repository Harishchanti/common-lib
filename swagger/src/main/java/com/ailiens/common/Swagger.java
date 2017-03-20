package com.ailiens.common;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by jayant on 19/3/17.
 */

@Data
@Component
@ConfigurationProperties(prefix = "swagger")
public class Swagger {

    private String title = "APIs";

    private String description = "API documentation";

    private String version = "0.0.1";

    private String termsOfServiceUrl;

    private String contactName;

    private String contactUrl;

    private String contactEmail;

    private String license;

    private String licenseUrl;

    private boolean enabled;

    private String includePattern = "/api/.*";
}

package com.ailiens.common.restutil.keycloak;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AccessLevel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.FieldDefaults;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.HashMap;

@Data
@EqualsAndHashCode(callSuper = false)
@Component
@ConfigurationProperties(prefix = "keycloak")
@FieldDefaults(level = AccessLevel.PRIVATE)
@JsonIgnoreProperties(ignoreUnknown = true)
public class KeyCloakConfig {

    String baseUrl;
    long  cacheDuration=100;
    String keycloakPath="/auth/realms/%s/protocol/openid-connect/token";

	HashMap<String, UserCredentials> users=new HashMap<>();

}

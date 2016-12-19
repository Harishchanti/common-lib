package com.ailiens.common.restutil.keycloak;

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
@ConfigurationProperties(prefix = "spring.keycloakCreds")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class KeyCloakConfig {

    String keycloakGetAccessTokenUrl;
    long  cacheDuration;

	HashMap<String, UserCredentials> map=new HashMap<>();

}

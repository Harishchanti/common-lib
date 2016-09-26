package com.aliens.msg.config;

import com.aliens.msg.keycloak.KeyCloakUser;
import com.aliens.msg.keycloak.UserCredentials;
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

	String Authorization;
	String keycloakGetAccessTokenUrl;

	HashMap<KeyCloakUser, UserCredentials> map=new HashMap<>();

}

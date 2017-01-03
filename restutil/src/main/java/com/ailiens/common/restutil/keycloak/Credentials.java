package com.ailiens.common.restutil.keycloak;


import com.ailiens.common.restutil.RestUtil;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import lombok.extern.slf4j.Slf4j;
import org.apache.http.client.utils.URIBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.inject.Singleton;
import java.net.URI;
import java.util.Base64;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

@Slf4j
@Component
@Singleton
public class Credentials {

	@Autowired
	KeyCloakConfig keyCloakConfig;

	private LoadingCache<String, String> cache;

    static Base64.Encoder encoder=Base64.getEncoder();

    @PostConstruct
    public void setup()
    {
        cache = CacheBuilder.newBuilder().maximumSize(100)
            .expireAfterWrite(keyCloakConfig.getCacheDuration(), TimeUnit.MINUTES).build(new CacheLoader<String, String>() {
                @Override
                public String load(String key) throws Exception {
                    return generateAccessToken(key);
                }
            });
    }
	private RestUtil restUtil = new RestUtil();

	public void updateKey(String user) {
		cache.refresh(user);
	}

	public  String getAccessToken(String user) throws ExecutionException {
		return cache.get(user);
	}

	private String generateAuthHeader(UserCredentials userCredentials)
    {
        String str=String.format("%s:%s",userCredentials.getClientId(),userCredentials.getClientSecret());

        return String.format("Basic %s",new String(encoder.encode(str.getBytes())));
    }

    private  KeyCloakResponse call(UserCredentials userCredentials) throws Exception {

	    String body=String.format("username=%s&password=%s&client_id=%s&grant_type=password",
            userCredentials.getUsername(),
            userCredentials.getPassword(),
            userCredentials.getClientId());

        String authHeader=generateAuthHeader(userCredentials);

        URIBuilder uriBuilder =new URIBuilder(keyCloakConfig.getKeycloakGetAccessTokenUrl());
        uriBuilder.setPath( String.format("/auth/realms/%s/protocol/openid-connect/token",keyCloakConfig.getRealm()));

        URI uri =uriBuilder.build();


        HttpResponse<KeyCloakResponse> httpResponse = Unirest.post(uri.toString())
            .header("content-type", MediaType.APPLICATION_FORM_URLENCODED_VALUE)
            .header("Authorization",authHeader)
            .body(body)
            .asObject(KeyCloakResponse.class);

        restUtil.checkStatus(httpResponse);

        return httpResponse.getBody();
	}

	private String generateAccessToken(String user) throws Exception {

		log.info("Getting new Token for {}", user);
		UserCredentials userCredentials;

        userCredentials=keyCloakConfig.getMap().getOrDefault(user, null);

		if (userCredentials == null) {
			log.error("Keycloak user not found");
			throw new Exception("Keycloak user not found");
		}

		KeyCloakResponse keyCloakResponse = call(userCredentials);

        return keyCloakResponse.getAccessToken();
	}

}

package com.ailiens.optimusprime.autobots.rest.dto;

import com.ailiens.optimusprime.autobots.utils.ServicesConfiguration;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import javax.inject.Inject;
import java.net.URI;
import java.net.URISyntaxException;

public class SingletonKeycloakToken {

	private static String access_token;

	private SingletonKeycloakToken () {
	}

	public static String getInstance() {
		SingletonKeycloakToken.getAccess_token(false);
		return SingletonKeycloakToken.access_token;
	}
	

	private static void getAccess_token(Boolean refresh) {
		if (SingletonKeycloakToken.access_token == null || refresh) {
			try {
				System.out.println("Fetching keycloak token");
				String keyCloakEndpoint = ServicesConfiguration.getKeyCloakURL();
				URI uri = new URI(keyCloakEndpoint);

				RestTemplate temp = new RestTemplate();
				HttpHeaders httpHeaders = new HttpHeaders();
				httpHeaders.set("content-type", "application/x-www-form-urlencoded");

				HttpEntity<String> entity = new HttpEntity<>("username="+ ServicesConfiguration.getKeyCloakUser()
				+"&password="+ ServicesConfiguration.getKeyCloakPassword()
				+"&client_id="+ ServicesConfiguration.getKeyCloakClientId(),httpHeaders);
				ResponseEntity responseEntity = temp.postForEntity(uri, entity, String.class);
				JSONObject jsonObject = new JSONObject(responseEntity.getBody().toString());

				SingletonKeycloakToken.access_token = jsonObject.getString("access_token");

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public static void refreshSingletonObject() {
		SingletonKeycloakToken.getAccess_token(true);
	}

}

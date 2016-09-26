package com.aliens.msg.mmq.actions;

import java.net.URISyntaxException;

import org.apache.http.client.utils.URIBuilder;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.aliens.msg.config.UrlConfig;
import com.aliens.msg.keycloak.KeyCloakUser;
import com.aliens.msg.utils.RestUtil;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.experimental.Wither;

@Component
@AllArgsConstructor
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
@Scope("prototype")
public class SendMessageToMycroft {
	
	@Wither
	JSONObject mycroftPayload;
	
	final RestUtil restUtil;

    final UrlConfig urlConfig;
    
    public String invoke() throws Exception {
    	return restUtil.withKeyCloakUser(KeyCloakUser.NODEUSER)
                    .post(getUrl(),mycroftPayload, String.class);
    }
	
    public String getUrl() throws URISyntaxException {
        URIBuilder uriBuilder = new URIBuilder();
        uriBuilder.setPath(urlConfig.getBaseUrl()+urlConfig.getMycroftEventPath());
        return uriBuilder.build().toString();
    }
}

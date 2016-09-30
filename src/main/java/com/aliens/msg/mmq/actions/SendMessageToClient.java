package com.aliens.msg.mmq.actions;

import com.aliens.hipster.domain.Clients;
import com.aliens.msg.keycloak.KeyCloakUserEnum;
import com.aliens.msg.mmq.Message;
import com.aliens.msg.utils.RestUtil;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.experimental.Wither;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
@Scope("prototype")
public class SendMessageToClient {

    @Wither
    Message message;
    @Wither
    Clients client;

    final RestUtil restUtil;

    public String invoke() throws Exception {
    	return restUtil
            .withKeyCloakUserEnum(KeyCloakUserEnum.NODEUSER)
                    .post(client.getTargetEndpoint(),message, String.class);
    }


}

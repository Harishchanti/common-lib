package com.aliens.msg.mmq.actions;

import com.aliens.msg.models.Clients;
import com.aliens.msg.mmq.Message;
import com.aliens.msg.utils.RestUtil;
import com.google.common.base.Strings;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.experimental.Wither;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
@NoArgsConstructor
@Scope("prototype")
public class SendMessageToClient {

    @Wither
    Message message;
    @Wither
    Clients client;

    @Autowired
    RestUtil restUtil;

    public String invoke() throws Exception {

        if(!Strings.isNullOrEmpty(client.getTargetEndpoint()))
        {
            if(!client.getKeycloakUser().getName().equals("dummy"))
            {
                restUtil=restUtil.withKeycloakUser(client.getKeycloakUser());
            }
            return restUtil.post(client.getTargetEndpoint(),message, String.class);
        }
        return null;
    }


}

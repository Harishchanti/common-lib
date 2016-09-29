package com.aliens.msg.mmq.actions;

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
    String url;

    final RestUtil restUtil;

    public String invoke() throws Exception {
    	return restUtil
            //.withKeyCloakUserEnum(KeyCloakUserEnum.NODEUSER)
                    .post(url,message, String.class);
    }


}

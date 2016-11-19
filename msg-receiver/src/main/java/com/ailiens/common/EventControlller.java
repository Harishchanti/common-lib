package com.ailiens.common;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by jayant on 19/11/16.
 */

@RestController
@RequestMapping("/event")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
@Slf4j
public class EventControlller {

    final MsgBaseEventHandler msgBaseEventHandler;

    @RequestMapping(value = "/msgEvent",
        method = RequestMethod.POST,
        produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> processMsgEvent(@RequestBody MsgMessage message) throws Exception {

        EventResponse response= msgBaseEventHandler.handle(message);

        log.info(response.toString());
        return ResponseEntity.status(response.getStatus()).body(response);
    }

    @RequestMapping(value = "/bulk/msgEvent",
        method = RequestMethod.POST,
        produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> processMsgBulkEvent(@RequestBody List<MsgMessage> messageList) throws Exception {

        EventResponse response= msgBaseEventHandler.handle(messageList);

        log.info(response.toString());

        return ResponseEntity.status(response.getStatus()).body(response);
    }
}

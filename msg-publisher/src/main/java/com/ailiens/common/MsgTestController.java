package com.ailiens.common;

import com.ailiens.common.wrappers.CustomOkHttpClient;
import com.ailiens.common.wrappers.CustomRestTemplate;
import java.io.IOException;
import java.util.List;
import java.util.Optional;
import javax.servlet.http.HttpServletRequest;
import javax.transaction.Transactional;
import lombok.extern.slf4j.Slf4j;
import okhttp3.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by jayant on 16/1/17.
 */
@RestController
@RequestMapping("/msg")
@Transactional
@Slf4j
public class MsgTestController {

    @Autowired
    MsgPublisher msgPublisher;

    @Autowired
    RetryMessages retryMessages;

    @Autowired(required = false)
    MessageLoggingService messageLogger;

    @RequestMapping(value = "/test", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> test() throws Exception {

        MsgMessage msgMessage = new MsgMessage();
        msgMessage.setPayload("test message");
        msgPublisher.publish(msgMessage,"test");
        return ResponseEntity.ok("sent test message to MSG");
    }


    @RequestMapping(value = "/retry/{pageSize}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> retry(@PathVariable int pageSize) throws Exception {

        int num=retryMessages.invoke(pageSize);
        return ResponseEntity.ok(num);
    }

    @RequestMapping(value = "/outbound/search", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<? extends MsgOutbound> search(@RequestParam(value = "messageId") String messageId) throws Exception {

        return Optional.ofNullable(messageLogger)
            .map(logger->  logger.search(messageId))
             .orElse(null);
    }


    @RequestMapping(value = "/dummy", method = RequestMethod.GET, produces = MediaType.TEXT_PLAIN_VALUE)
    public String dummy(HttpServletRequest httpServletRequest) throws Exception {

        log.info("doing processing");
        return  "done";
    }

    @RequestMapping(value = "/dummy2", method = RequestMethod.POST, produces = MediaType.TEXT_PLAIN_VALUE)
    public String dummy2(HttpServletRequest httpServletRequest) throws Exception {

        log.info("doing processing");
        return  "done";
    }

    @RequestMapping(value = "/rest", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public String restCall() throws Exception {


        RestTemplate restTemplate = new CustomRestTemplate();

        String apiResponse = new String();
        apiResponse = restTemplate.getForObject("http://localhost:8030/msg/dummy", apiResponse.getClass(), apiResponse);

        return apiResponse;
    }


    @RequestMapping(value = "/rest2", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public String restCallOkHttp() throws Exception {

        CustomOkHttpClient client = new CustomOkHttpClient();


        Request request = new Request.Builder().url("http://localhost:8030/msg/dummy")
            .get()
            .build();

        okhttp3.Response response = null;
        try {
            response = client.newCall(request).execute();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (response != null) {
                response.body().close();
            }
        }
        return null;
    }



}

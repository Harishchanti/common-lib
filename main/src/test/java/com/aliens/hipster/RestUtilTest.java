package com.aliens.hipster;

import lombok.SneakyThrows;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by jayant on 4/1/17.
 */

@RunWith(SpringRunner.class)
@SpringBootTest(classes = CommonsApp.class)
public class RestUtilTest {

//    @Autowired
//    RestUtilProvider restUtilProvider;

    String url="https://kong-qa.ailiens.com:8443/pricingengine/promotionsMetaData/ba2b74c5-0e96-4b3c-a125-d212200abee9";
    String KEYCLOAKUSER="NODEUSR";

    @Test
    @SneakyThrows
    public void test()
    {

//        HttpResponse<String> httpResponse=restUtilProvider.getInstance()
//            .withUser("NODEUSER")
//            .header("custom-header-1","value1")
//            .header("custom-header-2","value2")
//            .logRequest(false)
//            .logResponse(false)
//            .get(url,String.class);

    }

}

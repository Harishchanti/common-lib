package com.aliens.hipster;

import com.ailiens.common.restutil.RestUtilProvider;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by jayant on 4/1/17.
 */

@RunWith(SpringRunner.class)
@SpringBootTest(classes = CommonsApp.class)
public class RestUtilTest {

    @Autowired
    RestUtilProvider restUtilProvider;

    String url="https://kong-qa.ailiens.com:8443/pricingengine/promotionsMetaData/ba2b74c5-0e96-4b3c-a125-d212200abee9";
    String KEYCLOAKUSER="NODEUSR";



}

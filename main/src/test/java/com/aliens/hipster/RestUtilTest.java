package com.aliens.hipster;

import com.ailiens.common.restutil.RestUtil;
import lombok.SneakyThrows;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by jayant on 4/1/17.
 */

@RunWith(SpringRunner.class)
@SpringBootTest(classes = MsgApp.class)
public class RestUtilTest {

    @Autowired
    RestUtil restUtil;

    @Test
    @SneakyThrows
    public void test()
    {
       restUtil.withUser("NODEUSER")
           .get("http://www.google.com",String.class);
    }

}

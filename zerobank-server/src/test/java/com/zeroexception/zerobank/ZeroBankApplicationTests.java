package com.zeroexception.zerobank;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@ComponentScan("com.zeroexception")
//@TestPropertySource(locations = {"classpath:application.properties"})
public class ZeroBankApplicationTests  {

    @Test
    public void contextLoads() {
    }

}

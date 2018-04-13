package com.zeroexception.zerobank.repository;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author Viet Quoc Tran
 * on 4/8/18.
 * www.zeroexception.com
 */

@RunWith(SpringRunner.class)
@SpringBootTest
@DataJpaTest
public class UserRepositoryTest {

    @Test
    public void classCheck() {
        Assert.assertTrue(true);
//        template.
    }
}
package com.hz;

import static org.junit.Assert.assertTrue;

import com.hz.springTest.service.LoginService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Unit test for simple App.
 */
@RunWith(value = SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations ="classpath:applicationContext.xml")
public class AppTest {

    @Autowired
    private LoginService loginService;

    @Test
    public void testZj(){
        loginService.queryInfo();

    }
}

package com.company.service.impl;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

/**
 * Created by Administrator on 2017/11/21.
 */
public class UserServiceImplTest {

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testLogin() throws Exception {

    }

    @Test
    public void testRegist() throws Exception {
        System.out.println(new ClassPathXmlApplicationContext("applicationContext.xml").getBean("userService"));
    }
}
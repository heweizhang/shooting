package com.guoer.shooting.service;

import com.guoer.shooting.BaseUnitTest;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceImplTest extends BaseUnitTest {

    @Autowired
    UserService userService;

    @Test
    public void loginCheckTest() {
        System.out.println(userService.loginCheck("1111", "1234"));
    }

    @Test
    public void registerTest(){
        System.out.println("register account:" + userService.register("1234","1111"));
    }
}

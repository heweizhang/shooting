package com.guoer.shooting.service;

import com.guoer.shooting.BaseUnitTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceImplTest extends BaseUnitTest {

    @Autowired
    UserService userService;

    @Test
    public void loginCheckTest() {
        System.out.println(userService.loginCheck("1111", "1234"));
    }
}

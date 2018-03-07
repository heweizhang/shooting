package com.guoer.shooting.service.impl;

import com.guoer.shooting.responsity.UserResponsity;
import com.guoer.shooting.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserResponsity userResponsity;

    @Override
    public boolean loginCheck(String account, String psw) {
        if (null != userResponsity.findUserByAccountAndPwd(account, psw)) {
            return true;
        }
        return false;
    }
}

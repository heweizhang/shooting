package com.guoer.shooting.service.impl;

import com.guoer.shooting.domain.User;
import com.guoer.shooting.responsity.UserResponsity;
import com.guoer.shooting.service.UserService;
import com.guoer.shooting.utils.Constant;
import com.guoer.shooting.utils.Result;
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

    @Override
    public Result register(String account, String psw) {
        if (null != userResponsity.findUserByAccount(account)) {//用户已才存在
            return Result.error(Constant.ACCOUNT_EXIST);
        }
        User user = new User();
        user.setAccount(account);
        user.setPwd(psw);
        try {
            userResponsity.save(user);
        } catch (Exception e) {
            return Result.error(e.toString());
        }
        return Result.success();
    }
}

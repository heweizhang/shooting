package com.guoer.shooting.service;


import com.guoer.shooting.utils.Result;

public interface UserService  {

    //登录验证
    boolean loginCheck(String account,String psw);

    //注册用户
    Result register(String account, String psw);
}

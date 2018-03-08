package com.guoer.shooting.controller;

import com.guoer.shooting.domain.User;
import com.guoer.shooting.service.UserService;
import com.guoer.shooting.utils.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping()
public class UserController {
    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @GetMapping("/user/index")
    @ResponseBody
    public Result<User> index() {
        User user = new User();
        user.setNickname("david");
        user.setAccount("17505926606");
        user.setPwd("aewar");
        return Result.success(user);
    }

    @GetMapping("/user/login")
    public ModelAndView login(ModelAndView modelAndView) {
        modelAndView.setViewName("user/login");
        return modelAndView;
    }

    @GetMapping("/user/register")
    public ModelAndView register(ModelAndView modelAndView) {
        modelAndView.setViewName("user/registered");
        return modelAndView;
    }


    @Autowired
    UserService userService;

    @RequestMapping("/api/v1/user/loginCheck")
    @ResponseBody
    public Result loginCheck(@RequestParam(required = false) String account, @RequestParam(required = false) String psw) {
        logger.info("account={}, psw={}", account, psw);

        if (account == null) {
            return Result.error("账号不能为空");
        }
        if (psw == null) {
            return Result.error("密码不能为空");
        }
        if (userService.loginCheck(account, psw)) {
            return Result.success();
        }
        return Result.error("账号或密码错误!");
    }

    @RequestMapping("/api/v1/user/register")
    @ResponseBody
    public Result register(@RequestParam(required = false) String account, @RequestParam(required = false) String psw) {
        if (account == null) {
            return Result.error("账号不能为空");
        }
        if (psw == null) {
            return Result.error("密码不能为空");
        }
        return userService.register(account, psw);
    }
}

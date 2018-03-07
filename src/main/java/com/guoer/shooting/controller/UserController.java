package com.guoer.shooting.controller;

import com.guoer.shooting.domain.User;
import com.guoer.shooting.utils.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/user")
public class UserController {
    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @GetMapping("/index")
    @ResponseBody
    public Result<User> index() {
        User user = new User();
        user.setName("david");
        user.setPhone("17505926606");
        user.setPwd("aewar");
        return Result.success(user);
    }

    @GetMapping("/login")
    public ModelAndView login(ModelAndView modelAndView) {
        modelAndView.setViewName("user/login");
        return modelAndView;
    }

    @GetMapping("/register")
    public ModelAndView register(ModelAndView modelAndView) {
        modelAndView.setViewName("user/registered");
        return modelAndView;
    }


    @GetMapping("/loginCheck")
    @ResponseBody
    public Result loginCheck(@RequestParam(required = false) String account, @RequestParam(required = false) String psw) {
        logger.info("account={}, psw={}", account, psw);

        if (account == null) {
            return Result.error("账号不能为空");
        }
        if (psw == null) {
            return Result.error("密码不能为空");
        }
        if (account.equals("1111") || psw.equals("1234")) {
            return Result.error("密码不能为空");
        }
        return Result.success();
    }
}

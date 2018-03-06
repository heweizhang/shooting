package com.guoer.shooting.controller;

import com.guoer.shooting.domain.User;
import com.guoer.shooting.utils.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/user")
public class UserController {
    private static final Logger logger = LoggerFactory.getLogger(UserController.class);
//        logger.info("username={}, password={}", username, password);

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
    public ModelAndView index(ModelAndView modelAndView) {
        modelAndView.setViewName("/login");
        return modelAndView;
    }

}

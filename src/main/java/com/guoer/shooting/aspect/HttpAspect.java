package com.guoer.shooting.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;


@Aspect
@Component
public class HttpAspect {
    private final static Logger logger = LoggerFactory.getLogger(HttpAspect.class);

    //公用方法
    @Pointcut("execution(public * com.guoer.shooting.controller.UserController.*(..))")
    public void log() {
        System.out.println("bofore");
    }

    //在方法执行之前执行
    @Before("log()")
    public void before(JoinPoint joinPoint) {
        logger.info("onbefore");

        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        //url
        logger.info("url={}", request.getRequestURL());
        //method
        logger.info("method={}", request.getMethod());
        //ip
        logger.info("ip={}", request.getRemoteAddr());
        //类方法：类名+方法名
        logger.info("class_method={}", joinPoint.getSignature().getDeclaringTypeName() + "_" + joinPoint.getSignature().getName());
        //参数
        logger.info("params={}", joinPoint.getArgs());
    }

    //在方法执行之后执行
    @After("log()")
    public void after() {
        logger.info("after");
    }

    @AfterReturning(returning = "object", pointcut = "log()")
    public void doAfterReturning(Object object) {
        logger.info("response={}", object.toString());
    }
}

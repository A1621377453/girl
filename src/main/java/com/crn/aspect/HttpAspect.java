package com.crn.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * aop   http请求面向切面
 * @author crn
 * @datetime 2018-09-20 14:13:24
 */
@Aspect
@Component
@Slf4j
public class HttpAspect {

    @Pointcut("execution(* com.crn.controller..*.*(..))")
    public void point(){}

    @Before("point()")
    public void before(JoinPoint joinPoint){
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();

        log.info("url--{}",request.getRequestURL());
        log.info("method--{}",request.getMethod());
        log.info("ip--{}",request.getRemoteAddr());
        log.info("classMethod--{}",joinPoint.getSignature().getDeclaringTypeName()+"."+joinPoint.getSignature().getName());
        log.info("arg--{}",joinPoint.getArgs());
    }

    @AfterReturning(returning = "object",pointcut = "point()")
    public void returnAfter(Object object){
        log.info("response--{}",object.toString());
    }
}

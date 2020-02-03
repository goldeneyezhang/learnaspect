package com.yibo.aopdemo.example;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

//切面类
@Aspect
@Component
public class MyAspect2 {
    @Around("@within(com.yibo.aopdemo.example.FruitAspect)")
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("this is before around advice 2");
        Object result = pjp.proceed();
        System.out.println("this is after around advice 2");
        return result;
    }
}

package com.yibo.aopdemo.example;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAspect {
    @Around("target(com.yibo.aopdemo.example.IApple)")
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("this is before around advice");
        Object result = pjp.proceed();
        System.out.println("this is after around advice");
        return result;
    }
}

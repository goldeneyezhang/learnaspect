package com.yibo.aopdemo.example;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Aspect("pertarget(target(com.yibo.aopdemo.example.Fruit))")
@Scope("prototype")
@Component
public class MyAspect5 {
    public MyAspect5(){
        System.out.println("create MyAspect5 instance, address: " + toString());
    }
    @Around("target(com.yibo.aopdemo.example.Fruit)")
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("this is before around advice 5");
        Object result = pjp.proceed();
        System.out.println("this is after around advice 5");
        return result;
    }
}

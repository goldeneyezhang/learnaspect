package com.yibo.aopdemo.example;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.Scope;

@Aspect("perthis(this(com.yibo.aopdemo.example.Apple3))")
@Scope("prototype")
public class MyAspect4 {
    public MyAspect4(){
        System.out.println("create MyAspect instance, address: " + toString());
    }
    @Around("this(com.yibo.aopdemo.example.Apple3)")
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("this is before around advice");
        Object result = pjp.proceed();
        System.out.println("this is after around advice");
        return result;
    }
}

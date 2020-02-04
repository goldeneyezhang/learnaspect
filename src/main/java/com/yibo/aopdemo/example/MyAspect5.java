package com.yibo.aopdemo.example;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.Scope;

@Aspect("pertarget(com.yibo.aopdemo.example.Apple3.eat())")
@Scope("prototype")
public class MyAspect5 {
    public MyAspect5(){
        System.out.println("create MyAspect instance, address: " + toString());
    }
    @Around("target(com.yibo.aopdemo.example.Apple3.eat())")
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("this is before around advice");
        Object result = pjp.proceed();
        System.out.println("this is after around advice");
        return result;
    }
}

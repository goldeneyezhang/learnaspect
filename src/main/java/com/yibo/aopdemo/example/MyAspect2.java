package com.yibo.aopdemo.example;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;

//切面类
@Aspect
public class MyAspect2 {
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("this is before around advice");
        Object result = pjp.proceed();
        System.out.println("this is after around advice");
        return result;
    }
}

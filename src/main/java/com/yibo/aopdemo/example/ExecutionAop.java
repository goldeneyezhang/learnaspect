package com.yibo.aopdemo.example;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ExecutionAop {

    @Before("execution(* com.yibo.aopdemo.example..*(..)) && this(com.yibo.aopdemo.example.Member)")
    public void execute0() {
        System.out.println("this(com.learn.model.Member)");
    }

    @Before("execution(* com.yibo.aopdemo.example..*(..)) && target(com.yibo.aopdemo.example.Member)")
    public void execute1() {
        System.out.println("target(com.learn.model.Member)");
    }
}

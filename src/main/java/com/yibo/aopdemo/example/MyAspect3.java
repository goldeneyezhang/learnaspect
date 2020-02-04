package com.yibo.aopdemo.example;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;
import org.springframework.stereotype.Component;

/**
 * 切面实例
 */
@Aspect
@Component
public class MyAspect3 {
    @DeclareParents(value = "com.yibo.aopdemo.example.Apple2",defaultImpl = DescriberImpl.class)
    private IDescriber describer;
}

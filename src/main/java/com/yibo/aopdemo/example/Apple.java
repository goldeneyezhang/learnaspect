package com.yibo.aopdemo.example;

import org.springframework.stereotype.Service;

//目标类
@Service
@FruitAspect
public class Apple implements IApple {
    public void eat() {
        System.out.println("Apple.eat method invoke.");
    }

    @Override
    @FruitAspect
    public void eat2() {
        System.out.println("Apple.eat2 method invoke.");
    }
}

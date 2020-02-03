package com.yibo.aopdemo.example;

import org.springframework.stereotype.Service;

//目标类
@Service
public class Apple implements IApple {
    public void eat() {
        System.out.println("Apple.eat method invoke.");
    }
}

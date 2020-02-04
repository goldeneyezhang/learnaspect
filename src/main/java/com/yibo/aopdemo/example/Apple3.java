package com.yibo.aopdemo.example;

import org.springframework.stereotype.Service;

@Service
public class Apple3 implements Fruit {
    @Override
    public void eat() {
        System.out.println("Apple3.eat method invoked.");
    }
}

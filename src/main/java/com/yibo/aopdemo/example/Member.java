package com.yibo.aopdemo.example;

import org.springframework.stereotype.Component;

@Component
public class Member extends User {

    @Override
    public void who() {
        System.out.println("member");
    }

    public void doSomething() {
        System.out.println("member doSomething");
    }

    public void getCompany() {
        System.out.println("zero tec");
    }
}

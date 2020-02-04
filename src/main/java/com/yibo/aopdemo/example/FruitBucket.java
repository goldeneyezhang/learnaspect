package com.yibo.aopdemo.example;

import org.springframework.stereotype.Service;

@Service
public class FruitBucket {
    public void putIntoBucket(Apple2 apple) {
        System.out.println("put apple into bucket.");
    }
}

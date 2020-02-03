package com.yibo.aopdemo;

import com.yibo.aopdemo.example.Apple;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AopdemoApplicationTests {

    @Autowired
    private Apple apple;

    @Test
    public void testApple() {
        apple.eat();
    }

}

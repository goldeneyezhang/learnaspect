package com.yibo.aopdemo;

import com.yibo.aopdemo.example.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class AopdemoApplicationTests {

    @Autowired
    private Apple apple;
    @Autowired
    private Apple2 apple2;
    @Autowired
    private FruitBucket fruitBucket;
    @Autowired
    private Fruit fruit;
    @Resource
    private Member member;

    @Resource
    private Leader leader;

    @Test
    public void testApple() {
        apple.eat();
    }

    @Test
    public void testApple2() {
        apple.eat2();
    }

    @Test
    public void testFruitBucket() {
        fruitBucket.putIntoBucket(new Apple2());
    }

    @Test
    public void testPerthis() {
        fruit.eat();
    }

    @Test
    public void testDeclareParents() {
        IDescriber describer = (IDescriber) apple2;
        describer.desc();
    }
    // 实现
    @Test
    public void test1() {
        System.out.println("---------------member---------------");
        member.who();
        System.out.println("---------------leader---------------");
        leader.who();
    }

    @Test
    public void test2() {
        // 继承
        System.out.println("---------------member---------------");
        member.say();
        // 重载
        System.out.println("---------------leader---------------");
        leader.say();
    }

    @Test
    public void test3() {
        System.out.println("---------------member---------------");
        member.root();
        System.out.println("---------------leader---------------");
        leader.root();
    }

    @Test
    public void test4() {
        // 独有方法
        System.out.println("---------------member---------------");
        member.doSomething();
        // 子类重写
        System.out.println("---------------leader---------------");
        leader.doSomething();
    }

    @Test
    public void test5() {
        System.out.println("---------------member---------------");
        member.getCompany();
        System.out.println("---------------leader---------------");
        leader.getCompany();
    }

    // 独有的方法
    @Test
    public void test6() {
        System.out.println("---------------leader---------------");
        leader.self();
    }
}

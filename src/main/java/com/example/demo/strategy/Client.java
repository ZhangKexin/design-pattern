/*
 * Copyright (C) 2019 ***, Inc. All Rights Reserved.
 */
package com.example.demo.strategy;

/**
 * 高层模块在不同的条件下选择不同的策略
 */
public class Client {
    public static void main(String[] args) {

        Context context = null;
        System.out.println("情况1");
        context = new Context(new ConcreteStrategy1());
        context.operate();
        System.out.println("情况2");
        context = new Context(new ConcreteStrategy2());
        context.operate();
        System.out.println("情况3");
        context = new Context(new ConcreteStrategy3());
        context.operate();
    }
}

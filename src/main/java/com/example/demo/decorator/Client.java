/*
 * Copyright (C) 2019 ***, Inc. All Rights Reserved.
 */
package com.example.demo.decorator;

/**
 * 装饰器模式要有装饰者和被装饰者
 * <p>
 * 被装饰者Component：负责提供最基本最核心的操作
 * <p>
 * 装饰者Decorator：负责对被装饰者进行修饰，对被装饰者基本操作进行包装，包进自己的修饰方法
 */
public class Client {
    public static void main(String[] args) {
        Component component = new ConcreteComponent();
        component = new ConcreteDecorator2(component);
        component = new ConcreteDecorator1(component);
        component.operation();
    }
}

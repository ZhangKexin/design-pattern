/*
 * Copyright (C) 2019 ***, Inc. All Rights Reserved.
 */
package com.example.demo.proxy;

/**
 * 被代理类
 */
public class RealSubject implements Subject {
    @Override
    public void request() {
        // 业务逻辑
        System.out.println("被代理类的业务");
    }
}

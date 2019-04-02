/*
 * Copyright (C) 2019 ***, Inc. All Rights Reserved.
 */
package com.example.demo.proxy.general;

import com.example.demo.proxy.Subject;

/**
 * 普通代理
 */
public class MyProxy implements Subject, IProxy {
    private Subject subject = null;

    public MyProxy(String name) {
        try {
            subject = new RealSubject(this, name);
        } catch (Exception e) {
            System.out.println("异常" + e);
        }
    }

    @Override
    public void request() {
        this.before();
        this.subject.request();
        this.after();
    }

    /**
     * 预处理
     */
    @Override
    public void before() {
        System.out.println("预处理");
    }

    /**
     * 后处理
     */
    @Override
    public void after() {
        System.out.println("后处理");
    }
}

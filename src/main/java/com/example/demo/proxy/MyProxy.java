/*
 * Copyright (C) 2019 ***, Inc. All Rights Reserved.
 */
package com.example.demo.proxy;

/**
 * 代理类
 */
public class MyProxy implements Subject {
    /**
     * 被代理对象
     */
    private Subject subject = null;

    /**
     * 通过构造函数传入被代理对象
     *
     * @param subject
     */
    MyProxy(Subject subject) {
        this.subject = subject;
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
    private void before() {
        System.out.println("预处理");
    }

    /**
     * 后处理
     */
    private void after() {
        System.out.println("后处理");
    }
}

/*
 * Copyright (C) 2019 ***, Inc. All Rights Reserved.
 */
package com.example.demo.proxy.constraint;

public class ConstraintProxy implements ConstraintSubject, IConstraintProxy {
    private ConstraintSubject subject = null;

    public ConstraintProxy(ConstraintSubject subject) {
        this.subject = subject;
    }

    @Override
    public void request() {
        this.before();
        this.subject.request();
        this.after();
    }

    @Override
    public ConstraintSubject getProxy() {
        return this;
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

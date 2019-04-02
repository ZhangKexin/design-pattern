/*
 * Copyright (C) 2019 ***, Inc. All Rights Reserved.
 */
package com.example.demo.proxy.constraint;

public class ConstraintRealSubject implements ConstraintSubject {
    private ConstraintSubject proxy = null;
    private String name = "";

    public ConstraintRealSubject(String name) {
        this.name = name;
    }

    @Override
    public void request() {
        if (isProxy()) {
            System.out.println(name + ", request方法");
        } else {
            System.out.println("没有通过代理访问，报错");
        }
    }

    @Override
    public ConstraintSubject getProxy() {
        this.proxy = new ConstraintProxy(this);
        return this.proxy;
    }

    private boolean isProxy() {
        return this.proxy == null ? false : true;
    }
}

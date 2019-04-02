/*
 * Copyright (C) 2019 ***, Inc. All Rights Reserved.
 */
package com.example.demo.proxy.constraint;

/**
 * 强制代理，不允许直接访问真实对象，只能通过真实对象查找到代理对象
 */
public interface ConstraintSubject {
    /**
     * 代理类和被代理类都要实现的方法
     */
    void request();

    /**
     * 获取代理类对象
     *
     * @return
     */
    ConstraintSubject getProxy();
}

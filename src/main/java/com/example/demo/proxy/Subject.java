/*
 * Copyright (C) 2019 ***, Inc. All Rights Reserved.
 */
package com.example.demo.proxy;

/**
 * 抽象主题接口
 */
public interface Subject {
    /**
     * 代理类和被代理类都要实现的方法
     */
    void request();
}

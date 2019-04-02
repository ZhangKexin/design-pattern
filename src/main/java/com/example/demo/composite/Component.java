/*
 * Copyright (C) 2019 ***, Inc. All Rights Reserved.
 */
package com.example.demo.composite;

/**
 * 参加对象的共有方法和属性
 */
public abstract class Component {
    public void doSomething() {
        System.out.println("整体-部分的共性逻辑");
    }
}

/*
 * Copyright (C) 2019 ***, Inc. All Rights Reserved.
 */
package com.example.demo.factorymethod.singletonfactory;

public class Singleton {
    private Singleton() {
    }

    public void doSomething() {
        System.out.println("单例具体业务");
    }
}

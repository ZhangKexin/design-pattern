/*
 * Copyright (C) 2019 ***, Inc. All Rights Reserved.
 */
package com.example.demo.proxy.dynamic;

public class DyRealSubject implements DySubject {
    @Override
    public void doSomething(String str) {
        System.out.println("doSomething:" + str);
    }
}

/*
 * Copyright (C) 2019 ***, Inc. All Rights Reserved.
 */
package com.example.demo.proxy.dynamic;

import java.lang.reflect.InvocationHandler;

public class Client {
    public static void main(String[] args) {

        DySubject subject = new DyRealSubject();

        DySubject subject1 = DyProxy.newProxyInstance(subject);

        subject1.doSomething("kkk");
    }
}

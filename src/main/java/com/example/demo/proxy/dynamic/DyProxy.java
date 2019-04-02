/*
 * Copyright (C) 2019 ***, Inc. All Rights Reserved.
 */
package com.example.demo.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class DyProxy {
    private static <T> T newProxyInstance(ClassLoader classLoader, Class<?>[] interfaces, InvocationHandler hanler) {
        new BeforeAdvice().exec();
        return (T) Proxy.newProxyInstance(classLoader, interfaces, hanler);
    }
    public static <T> T newProxyInstance(DySubject subject){
        return newProxyInstance(subject.getClass().getClassLoader(), subject.getClass().getInterfaces(),
                new MyInvocationHandler(subject));
    }
}

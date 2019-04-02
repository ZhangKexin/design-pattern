/*
 * Copyright (C) 2019 ***, Inc. All Rights Reserved.
 */
package com.example.demo.templatemethod;

public class ConcreteClass1 extends AbstractClass {
    @Override
    protected void doSomething1() {
        System.out.println("ConcreteClass1 doSomething1");
    }

    @Override
    protected void doSomething2() {
        System.out.println("ConcreteClass1 doSomething2");
    }
}

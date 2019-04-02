/*
 * Copyright (C) 2019 ***, Inc. All Rights Reserved.
 */
package com.example.demo.facade;

/**
 * Facade将所有客户端请求分发到相应子系统，将子系统与外界隔离
 */
public class Facade {
    ClassA classA = new ClassA();
    ClassB classB = new ClassB();
    ClassC classC = new ClassC();

    public void methodA() {
        classA.doSomething();
    }

    public void methodB() {
        classB.doSomething();
    }

    public void methodC() {
        classC.doSomething();
    }
}

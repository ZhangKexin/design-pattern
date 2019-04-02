/*
 * Copyright (C) 2019 ***, Inc. All Rights Reserved.
 */
package com.example.demo.mediator;

public class ConcreteMediator extends Mediator {
    @Override
    public void doSomething1() {
        super.colleague1.selfMethodC1();
        super.colleague2.selfMethodC2();
    }

    @Override
    public void doSomething2() {
        super.colleague1.selfMethodC1();
        super.colleague2.selfMethodC2();
    }
}

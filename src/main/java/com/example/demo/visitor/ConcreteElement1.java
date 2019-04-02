/*
 * Copyright (C) 2019 ***, Inc. All Rights Reserved.
 */
package com.example.demo.visitor;

public class ConcreteElement1 extends Element {
    @Override
    public void doSomething() {
        System.out.println("doSomething1");
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}

/*
 * Copyright (C) 2019 ***, Inc. All Rights Reserved.
 */
package com.example.demo.visitor;

/**
 * ConcreteVisitor：具体如何访问一个对象
 */
public class ConcreteVisitor implements Visitor {
    @Override
    public void visit(ConcreteElement1 element) {
        element.doSomething();
    }

    @Override
    public void visit(ConcreteElement2 element) {
        element.doSomething();
    }
}

/*
 * Copyright (C) 2019 ***, Inc. All Rights Reserved.
 */
package com.example.demo.visitor;

/**
 * Element：被访问者，声明接受哪些访问者访问，通过accept的参数确定，以及自身业务逻辑
 *
 * ConcreteElement:具体被访问者，accept方法实现一般是visitor.visit(this);
 */
public abstract class Element {
    /**
     * 业务逻辑
     */
    public abstract void doSomething();

    /**
     * 允许哪些访问者来访问
     * @param visitor
     */
    public abstract void accept(Visitor visitor);
}

/*
 * Copyright (C) 2019 ***, Inc. All Rights Reserved.
 */
package com.example.demo.visitor;

/**
 * 访问者模式：封装一些作用于某种数据结构中的各元素的操作，
 * 在不改变数据结构的前提下定义作用于这些元素的新的操作
 *
 * Visitor：声明可以访问哪些元素，即visit方法的参数
 */
public interface Visitor {
    void visit(ConcreteElement1 element);

    void visit(ConcreteElement2 element);
}

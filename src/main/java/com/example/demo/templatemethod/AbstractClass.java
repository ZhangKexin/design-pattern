/*
 * Copyright (C) 2019 ***, Inc. All Rights Reserved.
 */
package com.example.demo.templatemethod;

/**
 * 定义一个操作中的算法的框架，将其中一些步骤延迟到子类实现，
 * <p>
 * 使得子类可以不改变算法的结构即可重定义算法的某些步骤
 */
public abstract class AbstractClass {
    /**
     * 基本方法1
     */
    protected abstract void doSomething1();

    /**
     * 基本方法2
     */
    protected abstract void doSomething2();

    /**
     * 模板方法
     * 调用基本方法完成算法逻辑
     * 子类通过覆写父类的方法，影响父类的行为
     */
    public void templateMethod() {
        this.doSomething1();
        this.doSomething2();
    }
}

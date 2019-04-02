/*
 * Copyright (C) 2019 ***, Inc. All Rights Reserved.
 */
package com.example.demo.decorator;

/**
 * 装饰器，包含被装饰者变量，用于对其进行装饰
 */
public class Decorator extends Component {
    private Component report = null;

    /**
     * 构造函数传递被修饰者
     *
     * @param report
     */
    public Decorator(Component report) {
        this.report = report;
    }

    /**
     * 委托给被修饰者执行
     */
    @Override
    void operation() {
        this.report.operation();
    }
}

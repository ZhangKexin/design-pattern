/*
 * Copyright (C) 2019 ***, Inc. All Rights Reserved.
 */
package com.example.demo.decorator;

public class ConcreteDecorator2 extends Decorator {
    public ConcreteDecorator2(Component report) {
        super(report);
    }

    @Override
    void operation() {
        //        调用装饰方法
        this.reportSort();
        super.operation();
    }

    /**
     * 装饰方法
     */
    private void reportSort() {
        System.out.println("operation the sort");
    }
}

/*
 * Copyright (C) 2019 ***, Inc. All Rights Reserved.
 */
package com.example.demo.decorator;

public class ConcreteDecorator1 extends Decorator {

    public ConcreteDecorator1(Component report) {
        super(report);
    }

    @Override
    void operation() {
        //        调用装饰方法
        this.reportHighScore();
        super.operation();
    }

    /**
     * 装饰方法
     */
    private void reportHighScore() {
        System.out.println("operation high score");
    }

}

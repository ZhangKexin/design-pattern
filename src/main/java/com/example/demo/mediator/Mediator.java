/*
 * Copyright (C) 2019 ***, Inc. All Rights Reserved.
 */
package com.example.demo.mediator;

/**
 * 中介者模式减少了类间依赖，同事类只依赖于中介者，
 * 但中介者会膨胀，逻辑复杂
 *
 * mvc中的controller就是一个中介者
 */
public abstract class Mediator {
    protected ConcreteColleague1 colleague1;
    protected ConcreteColleague2 colleague2;

    public ConcreteColleague1 getColleague1() {
        return colleague1;
    }

    public void setColleague1(ConcreteColleague1 colleague1) {
        this.colleague1 = colleague1;
    }

    public ConcreteColleague2 getColleague2() {
        return colleague2;
    }

    public void setColleague2(ConcreteColleague2 colleague2) {
        this.colleague2 = colleague2;
    }

    public abstract void doSomething1();
    public abstract void doSomething2();
}

/*
 * Copyright (C) 2019 ***, Inc. All Rights Reserved.
 */
package com.example.demo.mediator;

public class ConcreteColleague2 extends Colleague {

    public ConcreteColleague2(Mediator mediator) {
        super(mediator);
    }

    public void selfMethodC2() {
    }

    public void depMethodC2() {
        super.mediator.doSomething2();
    }
}

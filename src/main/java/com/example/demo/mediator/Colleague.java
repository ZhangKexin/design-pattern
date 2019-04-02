/*
 * Copyright (C) 2019 ***, Inc. All Rights Reserved.
 */
package com.example.demo.mediator;

public abstract class Colleague {
    protected Mediator mediator = null;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }
}

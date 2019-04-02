/*
 * Copyright (C) 2019 ***, Inc. All Rights Reserved.
 */
package com.example.demo.command;

public class ConcreteReceiver1 implements Receiver {
    @Override
    public void doSomething() {
        System.out.println("concreteReceiver1 dosomething");
    }
}

/*
 * Copyright (C) 2019 ***, Inc. All Rights Reserved.
 */
package com.example.demo.observer;

public class ConcreteObserver2 implements Observer {
    @Override
    public void update(String context) {
        System.out.println("observer2 update");
    }
}

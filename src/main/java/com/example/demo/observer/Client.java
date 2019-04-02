/*
 * Copyright (C) 2019 ***, Inc. All Rights Reserved.
 */
package com.example.demo.observer;

/**
 *
 */
public class Client {
    public static void main(String[] args) {
        Observable observable = new ConcreteObservable();
        observable.addObserver(new ConcreteObserver1());
        observable.addObserver(new ConcreteObserver2());
        observable.doSomething();
    }
}

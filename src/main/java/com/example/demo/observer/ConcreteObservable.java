/*
 * Copyright (C) 2019 ***, Inc. All Rights Reserved.
 */
package com.example.demo.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 观察者模式，也叫发布订阅模式，定义对象间的一对多的关系，
 * 每当一个对象改变状态时，所有依赖于他的对象都会收到通知并自动更新
 *
 * 被观察者，和观察者是组合关系，
 */
public class ConcreteObservable implements Observable {
    private List<Observer> observerList = new ArrayList<>();

    @Override
    public void doSomething() {
        // 业务逻辑
        System.out.println("dosomething");
        this.notifyObservers("doSomething");
    }

    @Override
    public void addObserver(Observer observer) {
        this.observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.observerList.remove(observer);
    }

    @Override
    public void notifyObservers(String context) {
        for (Observer observer : this.observerList) {
            observer.update(context);
        }
    }
}

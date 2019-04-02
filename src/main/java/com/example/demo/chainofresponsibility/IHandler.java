/*
 * Copyright (C) 2019 ***, Inc. All Rights Reserved.
 */
package com.example.demo.chainofresponsibility;

/**
 * 使多个对象都有机会处理请求，避免请求的发送者和接受者之间的耦合关系
 *
 * 将这些对象连成一条链，沿着这条链传递请求，直到有对象处理请求。
 *
 * 在链中决定由谁来处理请求
 *
 * 每个Handler就是链中的一个环节
 */
public abstract class IHandler {
    private IHandler next;
    private int level;

    public IHandler(int level) {
        this.level = level;
    }

    /**
     * 设定下一个handler，连成一个链
     * @param next
     */
    public void setNext(IHandler next) {
        this.next = next;
    }

    public final void handleMessage(Request women) {
        System.out.println("type:" + women.getType() + ", level:" + this.level);
        // 判断由自身处理请求还是由下一个链来处理
        if (women.getType() == this.level) {
            this.response(women);
        } else {
            if (next == null) {
                System.out.println("没有后续了");
            } else {
                this.next.handleMessage(women);
            }
        }
    }

    /**
     * 每个链都要实现的业务逻辑
     * @param women
     */
    protected abstract void response(Request women);
}

/*
 * Copyright (C) 2019 ***, Inc. All Rights Reserved.
 */
package com.example.demo.chainofresponsibility;

public class Son extends IHandler {
    public Son() {
        super(3);
    }

    @Override
    public void response(Request women) {
        System.out.println("mother request:" + women.getRequest());
        System.out.println("son answers yes");

    }
}

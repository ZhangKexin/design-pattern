/*
 * Copyright (C) 2019 ***, Inc. All Rights Reserved.
 */
package com.example.demo.chainofresponsibility;

public class Father extends IHandler {

    public Father() {
        super(1);
    }

    @Override
    protected void response(Request women) {
        System.out.println("daughter request:" + women.getRequest());
        System.out.println("father answers yes");

    }
}

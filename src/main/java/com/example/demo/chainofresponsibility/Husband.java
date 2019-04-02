/*
 * Copyright (C) 2019 ***, Inc. All Rights Reserved.
 */
package com.example.demo.chainofresponsibility;

public class Husband extends IHandler {

    public Husband() {
        super(2);
    }

    @Override
    protected void response(Request women) {
        System.out.println("wife request:" + women.getRequest());
        System.out.println("husband answers yes");

    }
}

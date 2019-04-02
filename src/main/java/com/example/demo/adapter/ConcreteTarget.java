/*
 * Copyright (C) 2019 ***, Inc. All Rights Reserved.
 */
package com.example.demo.adapter;

public class ConcreteTarget implements Target {

    @Override
    public void request() {
        System.out.println("target method");
    }
}

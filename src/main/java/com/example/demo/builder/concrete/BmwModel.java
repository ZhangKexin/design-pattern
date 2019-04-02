/*
 * Copyright (C) 2019 ***, Inc. All Rights Reserved.
 */
package com.example.demo.builder.concrete;

public class BmwModel extends CarModel {
    @Override
    void start() {
        System.out.println("bmw start");
    }

    @Override
    void stop() {
        System.out.println("bmw stop");
    }

    @Override
    void alarm() {
        System.out.println("bmw alarm");
    }
}

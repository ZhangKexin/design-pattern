/*
 * Copyright (C) 2019 ***, Inc. All Rights Reserved.
 */
package com.example.demo.builder.concrete;

public class BenzModel extends CarModel {
    @Override
    void start() {
        System.out.println("benz start");

    }

    @Override
    void stop() {
        System.out.println("benz stop");

    }

    @Override
    void alarm() {
        System.out.println("benz alarm");

    }
}

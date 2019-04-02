/*
 * Copyright (C) 2019 ***, Inc. All Rights Reserved.
 */
package com.example.demo.builder.concrete;

import java.util.List;

public abstract class CarModel {
    private List<String> sequence;

    abstract void start();

    abstract void stop();

    abstract void alarm();

    public final void run() {
        for (String action : sequence) {
            if (action.equalsIgnoreCase("start")) {
                this.start();
            } else if (action.equalsIgnoreCase("stop")) {
                this.stop();
            } else if (action.equalsIgnoreCase("alarm")) {
                this.alarm();
            } else {
            }
        }
    }

    public final void setSequence(List<String> sequence) {
        this.sequence = sequence;
    }
}

/*
 * Copyright (C) 2019 ***, Inc. All Rights Reserved.
 */
package com.example.demo.memento;

/**
 * 备忘录角色，存储发起人的状态，必要时提供状态
 */
public class Memento {
    private String state = "";

    public Memento(String state) {
        this.state = state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return this.state;
    }
}

/*
 * Copyright (C) 2019 ***, Inc. All Rights Reserved.
 */
package com.example.demo.memento;

/**
 * 发起人角色，记录当前状态，创建和恢复备忘录数据
 */
public class Originator {
    /**
     * state代表发起人的内部状态
     */
    private String state="";

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setMemento(Memento memento) {
    }

    public Memento createMemento() {
   return new Memento(this.state); }

    /**
     * 从备忘录恢复状态
     * @param memento
     */
    public void restoreMemento(Memento memento){
        this.setState(memento.getState());
    }
}

/*
 * Copyright (C) 2019 ***, Inc. All Rights Reserved.
 */
package com.example.demo.memento;

/**
 * 备忘录模式
 */
// TODO: 2019/4/2 多状态、多备份的备忘录模式，待续
public class Client {
    public static void main(String[] args) {
        Originator originator = new Originator();
        originator.setState("state1");
        System.out.println("state:" + originator.getState());

        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(originator.createMemento());
        originator.setState("state2");
        System.out.println("state:" + originator.getState());
        originator.restoreMemento(caretaker.getMemento());
        System.out.println("state:" + originator.getState());
    }
}

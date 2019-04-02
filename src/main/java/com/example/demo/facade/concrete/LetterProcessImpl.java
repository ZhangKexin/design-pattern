/*
 * Copyright (C) 2019 ***, Inc. All Rights Reserved.
 */
package com.example.demo.facade.concrete;

public class LetterProcessImpl implements ILetterProcess {
    @Override
    public void writeContext(String context) {
        System.out.println("write context:" + context);
    }

    @Override
    public void fillEnvelope(String address) {
        System.out.println("fill address:" + address);
    }

    @Override
    public void letterIntoEnvelope() {
        System.out.println("letter into envelope");
    }

    @Override
    public void sendLetter() {
        System.out.println("send letter");
    }
}

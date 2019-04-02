/*
 * Copyright (C) 2019 ***, Inc. All Rights Reserved.
 */
package com.example.demo.facade.concrete;

public interface ILetterProcess {
    void writeContext(String context);

    void fillEnvelope(String address);

    void letterIntoEnvelope();

    void sendLetter();
}

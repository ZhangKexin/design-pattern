/*
 * Copyright (C) 2019 ***, Inc. All Rights Reserved.
 */
package com.example.demo.proxy.general;

import com.example.demo.proxy.Subject;

public class Client {

    public static void main(String[] args) {
        Subject subject = new MyProxy("proxy");
        subject.request();
    }
}

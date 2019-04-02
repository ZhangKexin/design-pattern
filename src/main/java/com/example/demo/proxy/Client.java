/*
 * Copyright (C) 2019 ***, Inc. All Rights Reserved.
 */
package com.example.demo.proxy;

public class Client {
    public static void main(String[] args){
        MyProxy proxy = new MyProxy(new RealSubject());
        proxy.request();
    }
}

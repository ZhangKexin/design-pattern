/*
 * Copyright (C) 2019 ***, Inc. All Rights Reserved.
 */
package com.example.demo.proxy.constraint;

public class Client {
    public static void main(String[] args){
        ConstraintSubject subject = new ConstraintRealSubject("kkk");
        subject.request();
        System.out.println("--------------");
        ConstraintSubject proxy = new ConstraintProxy(subject);
        proxy.request();
        System.out.println("--------------");
        ConstraintSubject proxy1 = subject.getProxy();
        proxy1.request();
    }
}

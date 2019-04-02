/*
 * Copyright (C) 2019 ***, Inc. All Rights Reserved.
 */
package com.example.demo.templatemethod;

public class Client {

    public static void main(String[] args) {
        AbstractClass c1 = new ConcreteClass1();
        c1.templateMethod();
        AbstractClass c2 = new ConcreteClass2();
        c2.templateMethod();
    }
}

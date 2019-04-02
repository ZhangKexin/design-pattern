/*
 * Copyright (C) 2019 ***, Inc. All Rights Reserved.
 */
package com.example.demo.abstractfactory;

public class Client {
    public static void main(String[] args) {
        Factory factory1 = new Method1Factory();
        Factory factory2 = new Method2Factory();
        Product productA1 = factory1.createProductA();
        productA1.method1();
        productA1.method2();
        System.out.println("-------------");
        Product productA2 = factory2.createProductA();
        productA2.method1();
        productA2.method2();
        System.out.println("-------------");
        Product productB1 = factory1.createProductB();
        productB1.method1();
        productB1.method2();
        System.out.println("-------------");
        Product productB2 = factory2.createProductB();
        productB2.method1();
        productB2.method2();
    }
}

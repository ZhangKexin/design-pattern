/*
 * Copyright (C) 2019 ***, Inc. All Rights Reserved.
 */
package com.example.demo.factorymethod.multifactory;

import com.example.demo.factorymethod.Product;

public class Client {
    public static void main(String[] args) {
        Product product1 = new ConcreteFactory1().createProduct();
        product1.method1();
        product1.method2();
        Product product2 = new ConcreteFactory2().createProduct();
        product2.method1();
        product2.method2();
    }
}
